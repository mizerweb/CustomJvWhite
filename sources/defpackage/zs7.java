package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zs7 {
    public final quh a;
    public final ar3 b;
    public final List c;
    public final ifh d;

    public zs7(quh quhVar, ar3 ar3Var, List list, af7 af7Var) {
        this.a = quhVar;
        this.b = ar3Var;
        this.c = list;
        this.d = new ifh(new ys7(1, af7Var));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zs7)) {
            return false;
        }
        zs7 zs7Var = (zs7) obj;
        return zs7Var.a == this.a && zs7Var.b == this.b && cqk.d(zs7Var.a(), a()) && zs7Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(yw3.W0(listA, 10));
        for (Certificate certificate : listA) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
