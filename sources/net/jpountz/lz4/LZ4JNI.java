package net.jpountz.lz4;

import defpackage.np0;
import defpackage.r5a;
import defpackage.sab;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
enum LZ4JNI {
    ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4 */
    static {
        File fileCreateTempFile = ".";
        synchronized (sab.class) {
            try {
                if (!sab.a) {
                    sab.a();
                    try {
                        System.loadLibrary("lz4-java");
                        sab.a = true;
                    } catch (UnsatisfiedLinkError unused) {
                        String strI = sab.i();
                        InputStream resourceAsStream = sab.class.getResourceAsStream(strI);
                        if (resourceAsStream == null) {
                            throw new UnsupportedOperationException("Unsupported OS/arch, cannot find " + strI + ". Please try building from source.");
                        }
                        File file = null;
                        try {
                            try {
                                fileCreateTempFile = File.createTempFile("liblz4-java-", "." + r5a.c(sab.h()) + ".lck");
                                try {
                                    File file2 = new File(fileCreateTempFile.getAbsolutePath().replaceFirst(".lck$", ""));
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            byte[] bArr = new byte[np0.r];
                                            while (true) {
                                                int i = resourceAsStream.read(bArr);
                                                if (i == -1) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr, 0, i);
                                                }
                                            }
                                            fileOutputStream.close();
                                            System.load(file2.getAbsolutePath());
                                            sab.a = true;
                                            file2.deleteOnExit();
                                            fileCreateTempFile.deleteOnExit();
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    th.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        throw new ExceptionInInitializerError("Cannot unpack liblz4-java: " + e);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        file = file2;
                                        if (sab.a) {
                                            file.deleteOnExit();
                                            fileCreateTempFile.deleteOnExit();
                                        } else {
                                            if (file != null && file.exists() && !file.delete()) {
                                                throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + file);
                                            }
                                            if (fileCreateTempFile != 0 && fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                                throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + fileCreateTempFile);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (Throwable th5) {
                                th = th5;
                                fileCreateTempFile = 0;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
        init();
    }

    public static native int LZ4_compressBound(int i);

    public static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    public static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i, byte[] bArr2, ByteBuffer byteBuffer2, int i2, int i3);

    public static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native void init();
}
