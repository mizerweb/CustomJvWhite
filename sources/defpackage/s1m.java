package defpackage;

import android.net.Uri;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s1m {
    public static final boolean a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return ww3.z1(uri.getPathSegments(), "/", null, null, null, 62).equals(ww3.z1(uri2.getPathSegments(), "/", null, null, null, 62));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    public static List b(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = subjectAlternativeNames.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    if (list == null) {
                        obj = null;
                    } else {
                        if (list.size() < 2 || !Integer.valueOf(i).equals(list.get(0))) {
                            list = null;
                        }
                        if (list != null) {
                            obj = list.get(1);
                        } else {
                            obj = null;
                        }
                    }
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return r66.a;
    }
}
