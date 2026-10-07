package one.me.sdk.net.ssl.tm;

import defpackage.qv1;
import java.security.cert.CertificateException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"one/me/sdk/net/ssl/tm/ApiTrustManager$UnacceptableHostnameCertificateException", "Ljava/security/cert/CertificateException;", "tm"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiTrustManager$UnacceptableHostnameCertificateException extends CertificateException {
    public ApiTrustManager$UnacceptableHostnameCertificateException(String str) {
        super("Unacceptable hostname specified", new IllegalArgumentException(qv1.k("Hostname is illegal: ", str)));
    }
}
