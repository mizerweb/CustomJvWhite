package defpackage;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class e5g implements v5g {
    public final occ a;
    public final occ b;

    public e5g(occ occVar, occ occVar2) {
        this.a = occVar;
        this.b = occVar2;
    }

    public static boolean a(String str, String str2) {
        int i;
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (!z5h.K0(str2, "*.", false) || str2.length() <= 2) {
            return str.equals(str2);
        }
        int iV0 = r5h.V0(str, ".", 0, false, 6);
        if (iV0 <= 0 || (i = iV0 + 1) >= str.length() || !str.substring(i).equals(str2.substring(2))) {
            return str.equals(str2.substring(2));
        }
        return true;
    }

    public static boolean b(String str, Principal principal) {
        Collection collectionN1;
        if (principal != null) {
            String name = principal.getName();
            name.getClass();
            List listE = new lge(",").e(0, name);
            if (listE.isEmpty()) {
                collectionN1 = r66.a;
                break;
            }
            ListIterator listIterator = listE.listIterator(listE.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionN1 = r66.a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionN1 = ww3.N1(listE, listIterator.nextIndex() + 1);
                    break;
                }
            }
            Object[] array = collectionN1.toArray(new String[0]);
            ArrayList arrayList = new ArrayList(array.length);
            for (Object obj : array) {
                arrayList.add(r5h.y1((String) obj).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (z5h.K0((String) obj2, "CN=", false)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                arrayList3.add(z5h.J0((String) obj3, "CN=", ""));
            }
            if (!arrayList3.isEmpty()) {
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    if (a(str, (String) obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean c(String str, Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                List list = (List) obj;
                if (list != null && list.size() == 2 && cqk.d(list.get(0), 2)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                List list2 = (List) obj2;
                Object obj3 = list2 != null ? list2.get(1) : null;
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    if (a(str, (String) obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (str == null) {
            return false;
        }
        String str2 = (String) this.a.invoke();
        List list = (List) this.b.invoke();
        return (str2 == null || (!str.equals(str2) && (list == null || !list.contains(str)))) ? HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession) : HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
    }
}
