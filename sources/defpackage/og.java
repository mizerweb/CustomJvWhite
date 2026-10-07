package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class og extends rx8 {
    public final X509TrustManager q;
    public final X509TrustManagerExtensions r;

    public og(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.q = x509TrustManager;
        this.r = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof og) && ((og) obj).q == this.q;
    }

    public final int hashCode() {
        return System.identityHashCode(this.q);
    }

    @Override // defpackage.rx8
    public final List m(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.r.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
