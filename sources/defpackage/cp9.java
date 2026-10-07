package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class cp9 implements X509TrustManager {
    public final String a = zo5.p(getClass().getName(), "#", av7.g(System.identityHashCode(this)));
    public final ifh b = new ifh(new j68(9));
    public final ifh c = new ifh(new ap9(0, this));
    public final ThreadLocal d = new ThreadLocal();

    public final String a() {
        String str = (String) this.d.get();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    public final void b(X509Certificate[] x509CertificateArr, CertificateException certificateException) {
        je9 je9Var = je9.d;
        if (x509CertificateArr != null) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                StringBuilder sb = new StringBuilder("\n");
                int length = x509CertificateArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    X509Certificate x509Certificate = x509CertificateArr[i];
                    sb.append(i2);
                    sb.append('.');
                    sb.append(' ');
                    f55.a(sb, x509Certificate);
                    i++;
                    i2++;
                }
                a4cVar.c(je9Var, str, "server certificate chain: " + ((Object) sb), null);
            }
        }
        try {
            Locale locale = Locale.getDefault();
            StringBuilder sb2 = new StringBuilder();
            for (X509Certificate x509Certificate2 : getAcceptedIssuers()) {
                Principal subjectDN = x509Certificate2.getSubjectDN();
                String name = subjectDN != null ? subjectDN.getName() : null;
                if (name != null && r5h.L0(name.toLowerCase(locale), "comodo", false)) {
                    f55.a(sb2, x509Certificate2);
                }
            }
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "trusted store certificates: " + ((Object) sb2), null);
            }
        } catch (GeneralSecurityException e) {
            gm0.V(this.a, "failed to log trusted store certificates", e);
        }
        if (certificateException != null) {
            gm0.V(this.a, "server certificate chain not trusted", new bp9(certificateException));
        }
    }

    public final void c(String str) {
        if (str != null) {
            ThreadLocal threadLocal = this.d;
            if (str.equals(threadLocal.get())) {
                threadLocal.remove();
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qv1.k("checkClientTrusted, authType=", str), null);
            }
        }
        ((X509TrustManager) this.b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        je9 je9Var = je9.d;
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, qv1.k("checkServerTrusted, authType=", str), null);
        }
        String strA = a();
        String str3 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str3, qv1.k("checkServerTrusted, host=", strA), null);
        }
        try {
            if (strA != null) {
                ((X509TrustManagerExtensions) this.c.getValue()).checkServerTrusted(x509CertificateArr, str, strA);
            } else {
                ((X509TrustManager) this.b.getValue()).checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            b(x509CertificateArr, e);
            throw e;
        } catch (Throwable th) {
            b(x509CertificateArr, null);
            throw new CertificateException("Verification failed", th);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.b.getValue()).getAcceptedIssuers();
    }
}
