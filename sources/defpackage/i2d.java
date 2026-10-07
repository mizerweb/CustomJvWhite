package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class i2d {
    public static volatile i2d a;
    public static final Logger b;

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    static {
        i2d i2dVarA;
        if (xvc.n()) {
            for (Map.Entry entry : eh.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (eh.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(fh.a);
                }
            }
            i2dVarA = yf.d ? new yf() : null;
            if (i2dVarA == null) {
                boolean z = oh.e;
                i2dVarA = csk.a();
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            boolean z2 = ff4.d;
            i2dVarA = df4.b();
            if (i2dVarA == null) {
                if ("BC".equals(Security.getProviders()[0].getName())) {
                    boolean z3 = i21.d;
                    i2dVarA = h21.a();
                    if (i2dVarA == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            boolean z4 = cgc.d;
                            i2dVarA = bgc.e();
                            if (i2dVarA == null) {
                                boolean z5 = uo8.c;
                                i2dVarA = t01.a();
                                if (i2dVarA == null && (i2dVarA = ax.a()) == null) {
                                    i2dVarA = new i2d();
                                }
                            }
                        } else {
                            boolean z6 = uo8.c;
                            i2dVarA = t01.a();
                            if (i2dVarA == null) {
                                i2dVarA = new i2d();
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    boolean z7 = cgc.d;
                    i2dVarA = bgc.e();
                    if (i2dVarA == null) {
                        boolean z8 = uo8.c;
                        i2dVarA = t01.a();
                        if (i2dVarA == null) {
                            i2dVarA = new i2d();
                        }
                    }
                } else {
                    boolean z9 = uo8.c;
                    i2dVarA = t01.a();
                    if (i2dVarA == null) {
                        i2dVarA = new i2d();
                    }
                }
            }
        } else if ("BC".equals(Security.getProviders()[0].getName())) {
            boolean z10 = i21.d;
            i2dVarA = h21.a();
            if (i2dVarA == null) {
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    boolean z11 = cgc.d;
                    i2dVarA = bgc.e();
                    if (i2dVarA == null) {
                        boolean z12 = uo8.c;
                        i2dVarA = t01.a();
                        if (i2dVarA == null) {
                            i2dVarA = new i2d();
                        }
                    }
                } else {
                    boolean z13 = uo8.c;
                    i2dVarA = t01.a();
                    if (i2dVarA == null) {
                        i2dVarA = new i2d();
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            boolean z14 = cgc.d;
            i2dVarA = bgc.e();
            if (i2dVarA == null) {
                boolean z15 = uo8.c;
                i2dVarA = t01.a();
                if (i2dVarA == null) {
                    i2dVarA = new i2d();
                }
            }
        } else {
            boolean z16 = uo8.c;
            i2dVarA = t01.a();
            if (i2dVarA == null) {
                i2dVarA = new i2d();
            }
        }
        a = i2dVarA;
        b = Logger.getLogger(qsb.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public rx8 b(X509TrustManager x509TrustManager) {
        return new kt0(c(x509TrustManager));
    }

    public h5i c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new nt0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return true;
    }

    public void j(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        return SSLContext.getInstance("TLS");
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextK.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        ore.c("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
