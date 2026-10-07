package one.me.sdk.net.ssl.tm.internal;

import defpackage.qv1;
import java.security.cert.CertificateException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"one/me/sdk/net/ssl/tm/internal/HostnameVerifier$NoSubjectAltNamesCertificateException", "Ljava/security/cert/CertificateException;", "tm"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HostnameVerifier$NoSubjectAltNamesCertificateException extends CertificateException {
    public HostnameVerifier$NoSubjectAltNamesCertificateException(String str) {
        super(qv1.k("No subjectAltNames on the certificate match, host=", str));
    }
}
