package ru.ok.android.onelog;

import defpackage.eu6;
import defpackage.o75;
import defpackage.qr7;
import defpackage.zo5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class Files {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final byte[] SEPARATOR = {44};
    private static AtomicReference<byte[]> BUF = new AtomicReference<>();

    private Files() {
    }

    public static void cat(File file, File file2) throws IOException {
        if (!file2.exists() || file2.length() == 0) {
            return;
        }
        if (!file.exists()) {
            mkdirs(file.getParentFile());
            if (file2.renameTo(file)) {
                return;
            } else {
                file.createNewFile();
            }
        }
        FileLocks.Holder holderLock = FileLocks.lock(file);
        try {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                byte[] bArrObtainBuf = obtainBuf();
                try {
                    if (file.length() > 0) {
                        fileOutputStream.write(SEPARATOR);
                    }
                    while (true) {
                        int i = fileInputStream.read(bArrObtainBuf);
                        if (i < 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArrObtainBuf, 0, i);
                        }
                    }
                    releaseBuf(bArrObtainBuf);
                    fileOutputStream.close();
                    fileInputStream.close();
                    delete(file2);
                    if (holderLock != null) {
                        holderLock.close();
                    }
                } catch (Throwable th) {
                    releaseBuf(bArrObtainBuf);
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (holderLock != null) {
                try {
                    holderLock.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static void delete(File file) throws IOException {
        if (file.delete()) {
            return;
        }
        qr7.k(zo5.m(file, "Cannot delete file "));
    }

    public static void mkdirs(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            o75.i(file.getAbsolutePath(), " is expected to be a directory");
        } else {
            if (file.mkdirs()) {
                return;
            }
            eu6.d(file.getAbsolutePath(), "Cannot create directory ");
        }
    }

    public static void mkfile(File file) throws IOException {
        mkdirs(file.getParentFile());
        if (!file.exists() || file.isFile()) {
            return;
        }
        o75.i(file.getAbsolutePath(), " is expected to be a file");
    }

    private static byte[] obtainBuf() {
        byte[] andSet = BUF.getAndSet(null);
        return andSet != null ? andSet : new byte[4098];
    }

    private static void releaseBuf(byte[] bArr) {
        BUF.set(bArr);
    }

    public static void cat(File file, File... fileArr) throws IOException {
        for (File file2 : fileArr) {
            cat(file, file2);
        }
    }
}
