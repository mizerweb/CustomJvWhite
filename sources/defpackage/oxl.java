package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxl {
    public static byte[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e(fileInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        d(fileInputStream);
        c(byteArrayOutputStream);
        return byteArray;
    }

    public static void b(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bArr);
        c(fileOutputStream);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void d(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[20480];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static void f(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            e(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            d(inputStream);
            c(fileOutputStream);
        }
    }

    public static String g(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }

    public static h6f h() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapA = qxl.a(allStackTraces);
        Throwable th = null;
        try {
            Throwable th2 = null;
            Throwable th3 = null;
            Throwable th4 = null;
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                String str = key.getName() + " (state=" + key.getState() + ", pid=" + key.getId() + ")";
                if (z5h.G0(key.getName(), "main", true)) {
                    th4 = new Throwable(str);
                    th4.setStackTrace(value);
                } else if (th3 != null) {
                    Throwable th5 = new Throwable(str, th3);
                    th5.setStackTrace(value);
                    th3 = th5;
                } else {
                    th2 = new Throwable(str);
                    th2.setStackTrace(value);
                    th3 = th2;
                }
            }
            if (th4 != null && th2 != null) {
                th2.initCause(th4);
            }
            th = th3;
        } catch (Throwable unused) {
        }
        return new h6f(mapA, 7, th);
    }
}
