package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends rx8 {
    public final h5i q;

    public kt0(h5i h5iVar) {
        this.q = h5iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kt0) && cqk.d(((kt0) obj).q, this.q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.rx8
    public final List m(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) qv1.f(1, arrayList);
            X509Certificate x509CertificateA = this.q.a(x509Certificate);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (cqk.d(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (cqk.d(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
