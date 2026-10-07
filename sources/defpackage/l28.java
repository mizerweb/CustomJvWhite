package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.a;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l28 {
    public final Context a;
    public final String b;
    public final int c;

    public l28(int i, Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public static void a(HttpURLConnection httpURLConnection, int i) {
        int threadStatsTag;
        if (i != -1) {
            threadStatsTag = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            threadStatsTag = -1;
        }
        try {
            try {
                try {
                    try {
                        httpURLConnection.connect();
                        if (threadStatsTag != -1) {
                            TrafficStats.setThreadStatsTag(threadStatsTag);
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (SecurityException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    throw e3;
                }
                String name = cause.getClass().getName();
                if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                    throw e3;
                }
                throw new UnknownHostException();
            }
        } catch (Throwable th) {
            if (threadStatsTag != -1) {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
            throw th;
        }
    }

    public final a28 b(euc eucVar) {
        String str;
        byte[] bArrE;
        String str2 = (String) eucVar.b;
        String str3 = (String) eucVar.c;
        x18 x18Var = (x18) eucVar.d;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            X509TrustManager x509TrustManager = (X509TrustManager) a.a1(trustManagerFactory.getTrustManagers());
            Resources resources = this.a.getApplicationContext().getResources();
            InputStream inputStreamOpenRawResource = resources.openRawResource(R.raw.rootca_ssl_rsa2022);
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(inputStreamOpenRawResource);
                rx8.n(inputStreamOpenRawResource, null);
                String resourceEntryName = resources.getResourceEntryName(R.raw.rootca_ssl_rsa2022);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry(resourceEntryName, (X509Certificate) certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init(keyStore);
                j84 j84Var = new j84(new X509TrustManager[]{x509TrustManager, (X509TrustManager) a.a1(trustManagerFactory2.getTrustManagers())});
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new TrustManager[]{j84Var}, null);
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, this.b);
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, x18Var.getContentType());
            httpURLConnection.setDoOutput(true);
            if (x18Var.getContentLength() >= 0) {
                httpURLConnection.setFixedLengthStreamingMode(x18Var.getContentLength());
            } else {
                httpURLConnection.setChunkedStreamingMode(np0.r);
            }
            a(httpURLConnection, this.c);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                x18Var.writeTo(outputStream);
                outputStream.close();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    List<String> list = httpURLConnection.getHeaderFields().get(HTTP.CONTENT_TYPE);
                    if (list == null || (str = (String) ww3.t1(list)) == null) {
                        str = "application/octet-stream";
                    }
                    if (responseCode < 400) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                        try {
                            bArrE = egl.e(bufferedInputStream);
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                rx8.n(bufferedInputStream, th3);
                                throw th4;
                            }
                        }
                    } else {
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        BufferedInputStream bufferedInputStream2 = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                        try {
                            bArrE = egl.e(bufferedInputStream2);
                            bufferedInputStream2.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                rx8.n(bufferedInputStream2, th5);
                                throw th6;
                            }
                        }
                    }
                    return new a28(responseCode, responseMessage, new pr6(str, 1, bArrE), 0);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IOException(e);
                } catch (NullPointerException e2) {
                    String message = e2.getMessage();
                    if (message == null || !z5h.K0(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false)) {
                        throw e2;
                    }
                    throw new IOException(e2);
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    rx8.n(outputStream, th7);
                    throw th8;
                }
            }
        } catch (IOException e3) {
            httpURLConnection.disconnect();
            throw e3;
        }
    }
}
