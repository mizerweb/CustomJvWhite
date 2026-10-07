package defpackage;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class to2 extends PKIXCertPathChecker {
    public final boolean a;
    public final X509Certificate b;

    public to2(boolean z, X509Certificate x509Certificate) {
        this.a = z;
        this.b = x509Certificate;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public final void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = this.b;
        if (cqk.d(certificate, x509Certificate)) {
            try {
                List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                if (extendedKeyUsage != null) {
                    List<String> list = extendedKeyUsage;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (String str : list) {
                            if ("2.5.29.37.0".equals(str) || ((this.a && "1.3.6.1.5.5.7.3.2".equals(str)) || "1.3.6.1.5.5.7.3.1".equals(str) || "2.16.840.1.113730.4.1".equals(str) || "1.3.6.1.4.1.311.10.3.3".equals(str))) {
                                Collection collection2 = collection;
                                if (!(collection2 instanceof Collection) || ((collection2 instanceof uv8) && !(collection2 instanceof vv8))) {
                                    collection = null;
                                }
                                if (collection != null) {
                                    collection.remove("2.5.29.37");
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    throw new CertPathValidatorException("End-entity certificate does not have a valid eku");
                }
            } catch (CertificateParsingException e) {
                throw new CertPathValidatorException(e);
            }
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public final Set getSupportedExtensions() {
        return Collections.singleton("2.5.29.37");
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public final void init(boolean z) {
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public final boolean isForwardCheckingSupported() {
        return true;
    }
}
