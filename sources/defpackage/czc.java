package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class czc extends a8j {
    public static final /* synthetic */ zv8[] l;
    public final long c;
    public final boolean d;
    public final r00 e;
    public final gjf f;
    public final ny8 g;
    public final mjg h;
    public final r07 i;
    public final mjg j;
    public final p3c k;

    static {
        z8b z8bVar = new z8b(czc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public czc(long j, boolean z, r00 r00Var, r00 r00Var2, gjf gjfVar, ny8 ny8Var) {
        this.c = j;
        this.d = z;
        this.e = r00Var2;
        this.f = gjfVar;
        this.g = ny8Var;
        boolean zE = E();
        r8e r8eVarG0 = (r8e) r00Var.k;
        if (zE) {
            r8eVarG0 = e9i.G0(new o24(r8eVarG0, 29, this), this.b, j0g.a, r66.a);
        }
        mjg mjgVarA = p90.a(ui9.a);
        this.h = mjgVarA;
        this.i = new r07(r8eVarG0, mjgVarA, new d3(this, null, 29), 0);
        this.j = p90.a(null);
        this.k = qyj.S();
        if (((AtomicBoolean) r00Var.g).compareAndSet(false, true)) {
            yab.i0((dq4) r00Var.f, null, 0, new t20(r00Var, null, 22), 3);
        }
        e9i.j0(new fz6((pzf) r00Var2.l, new awa(this, (lq4) null, 27), 3), this.b);
    }

    public static final ArrayList B(czc czcVar, List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            qxc qxcVar = (qxc) obj;
            rt2 rt2VarC = czcVar.C();
            if (rt2VarC != null && (list2 = rt2VarC.g) != null) {
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((vg4) it.next()).v() != qxcVar.a);
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final rt2 C() {
        return (rt2) ((xn3) this.g.getValue()).k(this.c).a.getValue();
    }

    public final boolean D(m8b m8bVar) {
        int iMin;
        rt2 rt2VarC = C();
        gjf gjfVar = this.f;
        if (rt2VarC == null || !rt2VarC.e0()) {
            iMin = this.d ? Math.min(((g5d) gjfVar).d(), ((g5d) gjfVar).i() - 1) : ((g5d) gjfVar).d();
        } else {
            iMin = Math.min(((g5d) gjfVar).d(), ((g5d) gjfVar).i() - rt2VarC.b.b());
        }
        return m8bVar.d >= iMin;
    }

    public final boolean E() {
        rt2 rt2VarC;
        List list;
        return this.c > 0 && (rt2VarC = C()) != null && (list = rt2VarC.g) != null && (list.isEmpty() ^ true);
    }
}
