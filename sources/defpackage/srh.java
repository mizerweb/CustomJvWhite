package defpackage;

import android.R;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class srh {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = {-16842912};

    public static final ArrayList a(ief iefVar) {
        w6g w6gVar;
        ArrayList arrayList = new ArrayList(iefVar.a);
        ArrayList<kef> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ((kef) obj).getClass();
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (kef kefVar : arrayList2) {
            hb9 hb9Var = kefVar.a;
            kb9 kb9VarC = h1h.c(hb9Var);
            String strF = iefVar.f(kefVar);
            if (strF == null) {
                w6gVar = iefVar.n(kefVar);
            } else {
                int i = hb9Var.a;
                if (iefVar.j == gef.b) {
                    i = 7;
                }
                w6gVar = new w6g(i, strF);
            }
            Uri uriA = rvc.b(hb9Var, kefVar.c) ? rvc.a(hb9Var, kefVar.c) : kb9VarC.k;
            w6g w6gVar2 = w6gVar;
            boolean z = hb9Var.a == 7;
            Uri uri = Uri.parse(w6gVar2.b);
            rvc rvcVar = kefVar.c;
            arrayList3.add(new jef(kb9VarC, z, uri, uriA, null, null, null, rvcVar != null ? rvcVar.e : null));
        }
        return arrayList3;
    }

    public static void b(int i, int i2) {
        String strQ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strQ = l6i.q("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ore.p(zo5.v(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strQ = l6i.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static void c(int i, int i2, int i3) {
        String strD;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strD = d(i, i3, "start index");
            } else {
                strD = (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : l6i.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return l6i.q("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return l6i.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.v(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }
}
