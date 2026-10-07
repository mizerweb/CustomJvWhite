package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cic {
    public final String a = cic.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final long f;

    public cic(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        ghb ghbVar = ew5.b;
        this.f = ew5.g(qe7.O(24, lw5.HOURS));
    }

    public final Object a(m8b m8bVar, mdh mdhVar) {
        return yab.K0(((n0c) ((xhh) this.e.getValue())).a(), new daa(this, m8bVar, null), mdhVar);
    }

    public final Object b(Long l, nq4 nq4Var) {
        return yab.K0(((n0c) ((xhh) this.e.getValue())).a(), new awa(l, this, (lq4) null, 15), nq4Var);
    }

    public final void c(List list) {
        m8b m8bVar = ui9.a;
        m8b m8bVar2 = new m8b();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list2 = ((pj4) it.next()).q;
            Long l = list2 != null ? (Long) ww3.t1(list2) : null;
            if (l != null) {
                m8bVar2.a(l.longValue());
            }
        }
        if (!m8bVar2.i()) {
            yab.i0((wmi) this.d.getValue(), null, 0, new awa(this, m8bVar2, (lq4) null, 14), 3);
            return;
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "organizationsIds is empty", null);
        }
    }
}
