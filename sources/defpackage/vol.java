package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vol {
    public static String a(Iterable iterable, long j) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            vg4 vg4Var = (vg4) it.next();
            if (!vg4Var.I() && j != vg4Var.v()) {
                sb.append(vg4Var.k().trim());
                sb.append(", ");
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString().trim();
    }

    public static String b(ArrayList arrayList, vuf vufVar) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vg4 vg4Var = (vg4) vufVar.mo41apply((Long) it.next());
            if (vg4Var != null) {
                sb.append(vg4Var.k().trim());
                sb.append(", ");
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString().trim();
    }

    public static final r2f c(rt2 rt2Var) {
        if (rt2Var.y0()) {
            return r2f.a;
        }
        return rt2Var.d0() ? r2f.b : r2f.c;
    }
}
