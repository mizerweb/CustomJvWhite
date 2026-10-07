package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hbb {
    public static final String a = "hbb";
    public static final ThreadLocal b = new ThreadLocal();
    public static final ThreadLocal c = new ThreadLocal();

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void b(File file, File file2) throws IOException {
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel2.transferFrom(channel, 0L, channel.size());
                channel2.close();
                channel.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(channel2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(channel, th3);
                throw th4;
            }
        }
    }

    public static final void c(File file) {
        if (file != null) {
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public static String d(InputStream inputStream) {
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            ThreadLocal threadLocal2 = c;
            byte[] bArr2 = (byte[]) threadLocal2.get();
            if (bArr2 == null) {
                bArr2 = new byte[np0.r];
                threadLocal2.set(bArr2);
            }
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr2, 0, bArr2.length);
                if (i2 < 0) {
                    String str = new String(bArr, 0, i, pt2.a);
                    a(inputStream);
                    return str;
                }
                int i3 = i + i2;
                if (bArr.length < i3) {
                    byte[] bArr3 = new byte[bArr.length * 2];
                    System.arraycopy(bArr, 0, bArr3, 0, i);
                    threadLocal.set(bArr3);
                    bArr = bArr3;
                }
                if (i2 > 0) {
                    System.arraycopy(bArr2, 0, bArr, i, i2);
                    i = i3;
                }
            }
        } catch (Throwable th) {
            try {
                gm0.V(a, "Can't read native media from resources", th);
                return null;
            } finally {
                a(inputStream);
            }
        }
    }
}
