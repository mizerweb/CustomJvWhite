package one.me.sdk.net.ssl.tm;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"one/me/sdk/net/ssl/tm/ApiTrustManager$CertPathCertificateException", "Ljava/security/cert/CertificateException;", "tm"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiTrustManager$CertPathCertificateException extends CertificateException {
    public ApiTrustManager$CertPathCertificateException(CertPath certPath) {
        super(new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1));
    }
}
