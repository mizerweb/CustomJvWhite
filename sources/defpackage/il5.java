package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class il5 {
    public final long a;
    public final t51 b;
    public final xn3 c;
    public final pzf d = e9i.b(0, 0, 7);
    public final dq4 e;

    public il5(long j, t51 t51Var, xhh xhhVar, xn3 xn3Var) {
        this.a = j;
        this.b = t51Var;
        this.c = xn3Var;
        this.e = cqk.a(((n0c) xhhVar).c().S0());
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(wo3 wo3Var) {
        vg4 vg4VarW;
        Iterator it = wo3Var.b.iterator();
        while (it.hasNext()) {
            rt2 rt2Var = (rt2) this.c.k(((Number) it.next()).longValue()).a.getValue();
            if (rt2Var != null && (vg4VarW = rt2Var.w()) != null) {
                if (vg4VarW.v() == this.a) {
                    yab.i0(this.e, null, 0, new qy3(this, null, 12), 3);
                    return;
                }
                return;
            }
        }
    }
}
