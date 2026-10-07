package com.facebook.soloader;

import android.util.Log;
import defpackage.kfh;
import defpackage.pr6;
import defpackage.sr;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements Closeable {
    public static void b(pr6 pr6Var, byte[] bArr, File file) {
        RandomAccessFile randomAccessFile;
        int i;
        StringBuilder sb = new StringBuilder("extracting DSO ");
        sr srVar = (sr) pr6Var.b;
        InputStream inputStream = (InputStream) pr6Var.c;
        sb.append((String) srVar.a);
        String string = sb.toString();
        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
            Log.i("fb-UnpackingSoSource", string);
        }
        File file2 = new File(file, (String) srVar.a);
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        randomAccessFile = randomAccessFile2;
                        try {
                            SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                randomAccessFile.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } else {
                        randomAccessFile = randomAccessFile2;
                    }
                    int i2 = 0;
                    while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                        randomAccessFile.write(bArr, 0, i);
                        i2 += i;
                    }
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (!file2.setExecutable(true, false)) {
                        throw new IOException("cannot make file executable: " + file2);
                    }
                    randomAccessFile.close();
                    if (!file2.exists() || file2.setWritable(false)) {
                        return;
                    }
                    Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = randomAccessFile2;
                }
            } catch (IOException e) {
                Log.e("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e);
                kfh.b(file2);
                throw e;
            }
        } catch (Throwable th5) {
            if (file2.exists() && !file2.setWritable(false)) {
                Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
            }
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract sr[] l();

    public abstract void y(File file);
}
