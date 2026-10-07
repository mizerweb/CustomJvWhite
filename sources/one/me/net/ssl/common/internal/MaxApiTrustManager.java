package one.me.net.ssl.common.internal;

import defpackage.a4c;
import defpackage.cp9;
import defpackage.due;
import defpackage.eq;
import defpackage.ew5;
import defpackage.g1b;
import defpackage.gm0;
import defpackage.ifh;
import defpackage.ish;
import defpackage.je9;
import defpackage.jsh;
import defpackage.ww8;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import kotlin.Metadata;
import one.me.sdk.net.ssl.tm.ApiTrustManager$UnacceptableHostnameCertificateException;
import one.me.sdk.net.ssl.tm.internal.HostnameVerifier$NoSubjectAltNamesCertificateException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\n\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ5\u0010\u000f\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ5\u0010\u000f\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0012JO\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lone/me/net/ssl/common/internal/MaxApiTrustManager;", "Lcp9;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Ljava/net/Socket;", "socket", "Lsbi;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "checkServerTrusted", "hostname", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "", "ocspData", "tlsSctData", "([Ljava/security/cert/X509Certificate;[B[BLjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MaxApiTrustManager extends cp9 {
    public final jsh e = jsh.a;
    public final ifh f = new ifh(new ww8(11, this));

    @Override // defpackage.cp9, javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        d().checkClientTrusted(x509CertificateArr, str);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, byte[] ocspData, byte[] tlsSctData, String authType, String hostname) throws CertificateException {
        Integer numValueOf;
        MaxApiTrustManager maxApiTrustManager = this;
        je9 je9Var = je9.c;
        String str = maxApiTrustManager.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "checkServerTrusted -> chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", ocsp=" + (ocspData != null ? Integer.valueOf(ocspData.length) : null) + ", tls=" + (tlsSctData != null ? Integer.valueOf(tlsSctData.length) : null) + ", " + authType + "|" + hostname, null);
        }
        maxApiTrustManager.e.getClass();
        long jC = g1b.c();
        try {
            eq eqVarD = maxApiTrustManager.d();
            eqVarD.getClass();
            if (hostname == null || hostname.length() == 0) {
                throw new ApiTrustManager$UnacceptableHostnameCertificateException(hostname);
            }
            due dueVar = eqVarD.c;
            if (chain == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!dueVar.F(hostname, chain[0])) {
                throw new HostnameVerifier$NoSubjectAltNamesCertificateException(hostname);
            }
            List<X509Certificate> listB = eqVarD.b(chain, ocspData, authType, false);
            long jA = ish.a(jC);
            String str2 = maxApiTrustManager.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
                return listB;
            }
            String strT = ew5.t(jA);
            Integer numValueOf2 = Integer.valueOf(chain.length);
            if (ocspData != null) {
                try {
                    numValueOf = Integer.valueOf(ocspData.length);
                } catch (CertificateException e) {
                    e = e;
                    maxApiTrustManager.b(chain, e);
                    throw e;
                }
            } else {
                numValueOf = null;
            }
            a4cVar2.c(je9Var, str2, "<- checkServerTrusted (" + strT + "), chain=" + numValueOf2 + ", ocsp=" + numValueOf + ", tls=" + (tlsSctData != null ? Integer.valueOf(tlsSctData.length) : null) + ", " + authType + "|" + hostname, null);
            return listB;
        } catch (CertificateException e2) {
            e = e2;
            maxApiTrustManager = this;
        }
    }

    public final eq d() {
        return (eq) this.f.getValue();
    }

    @Override // defpackage.cp9, javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return d().k;
    }

    public final void checkClientTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        d().checkClientTrusted(chain, authType, socket);
    }

    public final void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        d().checkClientTrusted(chain, authType, engine);
    }

    public final void checkServerTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        je9 je9Var = je9.c;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "checkServerTrusted -> chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", " + authType + "|" + socket, null);
        }
        this.e.getClass();
        long jC = g1b.c();
        try {
            d().checkServerTrusted(chain, authType, socket);
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "<- checkServerTrusted (" + ew5.t(ish.a(jC)) + "), chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", " + authType + "|" + socket, null);
            }
        } catch (CertificateException e) {
            b(chain, e);
            throw e;
        }
    }

    public final void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        je9 je9Var = je9.c;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "checkServerTrusted -> chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", " + authType + "|" + (engine != null ? engine.getPeerHost() : null) + ":" + (engine != null ? Integer.valueOf(engine.getPeerPort()) : null), null);
        }
        this.e.getClass();
        long jC = g1b.c();
        try {
            d().checkServerTrusted(chain, authType, engine);
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                String strT = ew5.t(ish.a(jC));
                Integer numValueOf = chain != null ? Integer.valueOf(chain.length) : null;
                a4cVar2.c(je9Var, str2, "<- checkServerTrusted (" + strT + "), chain=" + numValueOf + ", " + authType + "|" + engine.getPeerHost() + ":" + Integer.valueOf(engine.getPeerPort()), null);
            }
        } catch (CertificateException e) {
            b(chain, e);
            throw e;
        }
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String hostname) throws CertificateException {
        je9 je9Var = je9.c;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "checkServerTrusted -> chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", " + authType + "|" + hostname, null);
        }
        this.e.getClass();
        long jC = g1b.c();
        try {
            List<X509Certificate> listCheckServerTrusted = d().checkServerTrusted(chain, authType, hostname);
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "<- checkServerTrusted (" + ew5.t(ish.a(jC)) + "), chain=" + (chain != null ? Integer.valueOf(chain.length) : null) + ", " + authType + "|" + hostname, null);
            }
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            b(chain, e);
            throw e;
        }
    }

    @Override // defpackage.cp9, javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        je9 je9Var = je9.d;
        String strA = a();
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "checkServerTrusted -> chain=" + (x509CertificateArr != null ? Integer.valueOf(x509CertificateArr.length) : null) + ", " + str + "|" + strA, null);
        }
        this.e.getClass();
        long jC = g1b.c();
        try {
            if (strA != null) {
                d().checkServerTrusted(x509CertificateArr, str, strA);
            } else {
                d().checkServerTrusted(x509CertificateArr, str);
            }
            String str3 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "<- checkServerTrusted (" + ew5.t(ish.a(jC)) + "), chain=" + (x509CertificateArr != null ? Integer.valueOf(x509CertificateArr.length) : null) + ", " + str + "|" + strA, null);
            }
        } catch (CertificateException e) {
            b(x509CertificateArr, e);
            throw e;
        } catch (Exception e2) {
            b(x509CertificateArr, null);
            throw new CertificateException("Unexpected error occurred while verifying server certificates", e2);
        }
    }
}
