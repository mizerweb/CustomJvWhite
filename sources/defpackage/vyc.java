package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vyc extends a8j {
    public static final /* synthetic */ zv8[] h;
    public final py2 c;
    public final r8e d;
    public final qo4 e;
    public final mjg f;
    public final p3c g;

    static {
        z8b z8bVar = new z8b(vyc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
    }

    public vyc(hk4 hk4Var, ny8 ny8Var, ny8 ny8Var2, py2 py2Var) {
        this.c = py2Var;
        this.d = e9i.G0(new o24(hk4Var.b(), 28, this), this.b, j0g.a, r66.a);
        qo4 qo4Var = new qo4(this.b, hk4Var.b(), null, ny8Var, ny8Var2);
        this.e = qo4Var;
        this.f = p90.a(null);
        this.g = qyj.S();
        hk4Var.a();
        e9i.j0(new fz6(qo4Var.j, new awa(this, (lq4) null, 26), 3), this.b);
    }

    public static final List B(vyc vycVar, vj4 vj4Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (vj4Var.b()) {
            return r66.a;
        }
        c79 c79VarW = yab.w();
        List list = vj4Var.a;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(yw3.W0(list2, 10));
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                ek4 ek4Var = (ek4) it.next();
                int i = ek4Var.q ? 5 : 3;
                int iOrdinal = vycVar.c.ordinal();
                boolean z = iOrdinal == 1 ? !ek4Var.s : !((iOrdinal == 2 || iOrdinal == 3) && ek4Var.r);
                long j = ek4Var.a;
                arrayList.add(new qxc(j, Long.valueOf(j), (ynh) new xnh(ek4Var.b), ek4Var.e, ek4Var.g, false, ek4Var.i, new xyc(1, i, ek4Var.a), ek4Var.j, (Integer) null, z, 1536));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            c79VarW.addAll(arrayList);
        }
        List list3 = vj4Var.c;
        if (list3 != null) {
            List<ek4> list4 = list3;
            arrayList2 = new ArrayList(yw3.W0(list4, 10));
            for (ek4 ek4Var2 : list4) {
                long j2 = ek4Var2.a;
                arrayList2.add(new qxc(j2, Long.valueOf(j2), (ynh) new xnh(ek4Var2.b), ek4Var2.e, ek4Var2.g, false, ek4Var2.i, new xyc(5, 4, ek4Var2.a), ek4Var2.j, (Integer) null, false, 3584));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            c79VarW.addAll(arrayList2);
        }
        return yab.j(c79VarW);
    }
}
