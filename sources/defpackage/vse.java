package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vse implements mkg {
    public final ny8 a;

    public vse(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final Object a(ArrayList arrayList, nq4 nq4Var) {
        kkg kkgVar = (kkg) this.a.getValue();
        kkgVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM stat_events WHERE id in (");
        vd7.b(sb, arrayList.size());
        sb.append(")");
        Object objI = ch3.I(nq4Var, kkgVar.a, false, true, new xs9(arrayList, 2, sb.toString()));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object b(zd9 zd9Var) {
        return ch3.I(zd9Var, ((kkg) this.a.getValue()).a, true, false, new chf(16));
    }
}
