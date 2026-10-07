package defpackage;

import android.util.Rational;
import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mu1 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public mu1(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new mu1(2);
                break;
            default:
                this.b = wm9.O0(new ylc("1.2.840.113549.1.1.13", 1), new ylc("1.2.840.113549.1.1.12", 2), new ylc("1.2.840.113549.1.1.11", 3), new ylc("1.2.840.113549.1.1.14", 4), new ylc("1.2.840.113549.1.1.5", 5), new ylc("1.2.840.113549.1.1.4", 6), new ylc("1.2.840.10045.4.3.4", 1), new ylc("1.2.840.10045.4.3.3", 2), new ylc("1.2.840.10045.4.3.2", 3), new ylc("1.2.840.10045.4.3.1", 4), new ylc("1.2.840.10045.4.1", 5));
                break;
        }
    }

    public int a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int iB;
        if (x509Certificate == null) {
            ore.p("Required value was null.");
            return 0;
        }
        if (x509Certificate2 == null) {
            ore.p("Required value was null.");
            return 0;
        }
        boolean zEquals = x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
        boolean zEquals2 = x509Certificate2.getSubjectDN().equals(x509Certificate2.getIssuerDN());
        if (zEquals != zEquals2) {
            return zEquals2 ? 1 : -1;
        }
        PublicKey publicKey = x509Certificate2.getPublicKey();
        PublicKey publicKey2 = x509Certificate.getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (z5h.G0(algorithm, publicKey2.getAlgorithm(), true)) {
            iB = 0;
        } else {
            iB = "EC".equalsIgnoreCase(algorithm) ? 1 : -1;
        }
        if (iB == 0) {
            if (!z5h.G0(publicKey.getAlgorithm(), publicKey2.getAlgorithm(), true)) {
                ore.p("Keys are not of the same type");
                return 0;
            }
            iB = okl.b(publicKey) - okl.b(publicKey2);
            if (iB == 0) {
                HashMap map = (HashMap) this.b;
                Integer num = (Integer) map.get(x509Certificate2.getSigAlgOID());
                int iIntValue = num != null ? num.intValue() : -1;
                Integer num2 = (Integer) map.get(x509Certificate.getSigAlgOID());
                iB = (num2 != null ? num2.intValue() : -1) - iIntValue;
            }
        }
        if (iB != 0) {
            return iB;
        }
        int iCompareTo = x509Certificate2.getNotAfter().compareTo(x509Certificate.getNotAfter());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return x509Certificate2.getNotBefore().compareTo(x509Certificate.getNotBefore());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj3;
                return e9i.D((Long) map.get((fu1) obj), (Long) map.get((fu1) obj2));
            case 1:
                enc encVar = (enc) obj3;
                return e9i.D((Long) encVar.g.get((fu1) obj), (Long) encVar.g.get((fu1) obj2));
            case 2:
                return a((X509Certificate) obj, (X509Certificate) obj2);
            case 3:
                int iCompare = ((lv5) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : e9i.D(((i5d) obj).a, ((i5d) obj2).a);
            case 4:
                ConcurrentHashMap concurrentHashMap = ((rb8) obj3).r;
                kb9 kb9Var = (kb9) concurrentHashMap.get(((nh7) obj2).a);
                Long lValueOf = kb9Var != null ? Long.valueOf(kb9Var.e) : null;
                kb9 kb9Var2 = (kb9) concurrentHashMap.get(((nh7) obj).a);
                return e9i.D(lValueOf, kb9Var2 != null ? Long.valueOf(kb9Var2.e) : null);
            case 5:
                int iB = w3m.b((String) ((Map.Entry) obj).getKey());
                List list = ((rk8) obj3).g;
                int iIndexOf = list.indexOf(Integer.valueOf(iB));
                if (iIndexOf == -1) {
                    iIndexOf = list.size();
                }
                Integer numValueOf = Integer.valueOf(iIndexOf);
                int iIndexOf2 = list.indexOf(Integer.valueOf(w3m.b((String) ((Map.Entry) obj2).getKey())));
                if (iIndexOf2 == -1) {
                    iIndexOf2 = list.size();
                }
                return e9i.D(numValueOf, Integer.valueOf(iIndexOf2));
            case 6:
                zn9 zn9Var = (zn9) obj;
                zn9 zn9Var2 = (zn9) obj2;
                do9 do9Var = (do9) obj3;
                int iCompareTo = Boolean.valueOf(zn9Var.o).compareTo(Boolean.valueOf(zn9Var2.o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(zn9Var.isPressed()).compareTo(Boolean.valueOf(zn9Var2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(do9Var.indexOfChild(zn9Var)).compareTo(Integer.valueOf(do9Var.indexOfChild(zn9Var2)));
            case 7:
                List list2 = (List) obj3;
                return e9i.D(Integer.valueOf(list2.indexOf(((nt9) obj).a)), Integer.valueOf(list2.indexOf(((nt9) obj2).a)));
            case 8:
                int iCompare2 = ((xa8) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : e9i.D(Integer.valueOf(((ek4) obj2).p), Integer.valueOf(((ek4) obj).p));
            case 9:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 10:
                ArrayList arrayList = ((i4h) obj3).g;
                Iterator it = ((g4h) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((bi2) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((bi2) it.next()));
                        if (numValueOf2.compareTo(numValueOf3) > 0) {
                            numValueOf2 = numValueOf3;
                        }
                    }
                    Iterator it2 = ((g4h) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((bi2) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf5 = Integer.valueOf(arrayList.indexOf((bi2) it2.next()));
                            if (numValueOf4.compareTo(numValueOf5) > 0) {
                                numValueOf4 = numValueOf5;
                            }
                        }
                        return e9i.D(numValueOf2, numValueOf4);
                    }
                }
                qr7.d();
                return 0;
            default:
                TrustAnchor trustAnchor = (TrustAnchor) obj;
                TrustAnchor trustAnchor2 = (TrustAnchor) obj2;
                return ((mu1) obj3).a(trustAnchor != null ? trustAnchor.getTrustedCert() : null, trustAnchor2 != null ? trustAnchor2.getTrustedCert() : null);
        }
    }

    public /* synthetic */ mu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
