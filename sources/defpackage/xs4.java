package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.SM;

/* JADX INFO: loaded from: classes.dex */
public final class xs4 {
    public static final lhb a = new lhb(15);

    public static void a(s18 s18Var) {
        Object next;
        List list;
        ArrayList arrayList = new ArrayList();
        Iterator it = s18Var.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                break;
            }
            Object next2 = y1Var.next();
            if (SM.SET_COOKIE.equals(((r18) next2).a())) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list = HttpCookie.parse(((r18) it2.next()).b());
            } catch (Exception unused) {
                list = r66.a;
            }
            arrayList2.add(list);
        }
        ArrayList<HttpCookie> arrayListX0 = yw3.X0(arrayList2);
        ArrayList arrayList3 = new ArrayList(yw3.W0(arrayListX0, 10));
        for (HttpCookie httpCookie : arrayListX0) {
            httpCookie.toString();
            arrayList3.add(httpCookie);
        }
        Iterator it3 = arrayList3.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!"vdt".equals(((HttpCookie) next).getName()));
        HttpCookie httpCookie2 = (HttpCookie) next;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
