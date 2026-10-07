package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class uhk implements ahk {
    public static lo7 a(HttpURLConnection httpURLConnection) throws IOException {
        String strB;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 400) {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream != null) {
                    try {
                        strB = new String(egl.e(errorStream), pt2.a);
                        errorStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(errorStream, th);
                            throw th2;
                        }
                    }
                } else {
                    strB = wk8.b("2b15e3713f8c354e03917a5951817a4f08");
                }
            } catch (Exception unused) {
                strB = wk8.b("a54e499adc2827c9ff2d6ed1f5693cc0fb2d6ec0e83b21d7ba2b21c1e3");
            }
        } else {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                strB = new String(egl.e(inputStream), pt2.a);
                inputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rx8.n(inputStream, th3);
                    throw th4;
                }
            }
        }
        return new lo7(responseCode, strB);
    }

    public static void b(HttpURLConnection httpURLConnection, ul9 ul9Var) throws ProtocolException {
        httpURLConnection.setRequestMethod(wk8.b("ad373688d87964f9"));
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        for (Map.Entry entry : (vl9) ul9Var.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static void c(HttpURLConnection httpURLConnection, byte[] bArr, ul9 ul9Var) throws IOException {
        if (cqk.d(ul9Var.get(wk8.b("83ff264f0c4991f72a488bae0a489cec2b4f91e4")), wk8.b("ad424f4225352bdd"))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(gZIPOutputStream, th);
                    throw th2;
                }
            }
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bArr);
            outputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(outputStream, th3);
                throw th4;
            }
        }
    }
}
