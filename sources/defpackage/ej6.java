package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ej6 {
    public final xhh a;
    public final t51 b;
    public final long c;
    public final pzf d = e9i.b(0, 0, 7);
    public final dq4 e;
    public final ny8 f;
    public final Long g;

    public ej6(xhh xhhVar, t51 t51Var, long j, qx2 qx2Var, ny8 ny8Var, ny8 ny8Var2, long j2) {
        int i;
        r8e r8eVarK;
        this.a = xhhVar;
        this.b = t51Var;
        this.c = j2;
        this.e = cqk.a(((n0c) xhhVar).a());
        this.f = ny8Var2;
        t51Var.d(this);
        int iOrdinal = qx2Var.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else {
            if (iOrdinal != 1) {
                ore.o();
                throw null;
            }
            i = 2;
        }
        xn3 xn3Var = (xn3) ny8Var.getValue();
        xn3Var.getClass();
        int iD = qt4.D(i);
        if (iD == 0) {
            r8eVarK = xn3Var.k(j);
        } else {
            if (iD != 1) {
                ore.o();
                throw null;
            }
            r8eVarK = xn3Var.l(j);
        }
        rt2 rt2Var = (rt2) r8eVarK.a.getValue();
        this.g = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
    }

    @l7h
    public final void onIncomingMessageEvent(lc8 lc8Var) {
        if (lc8Var.f) {
            long j = lc8Var.b;
            Long l = this.g;
            if (l != null && j == l.longValue()) {
                yab.i0(this.e, null, 0, new dj6(this, lc8Var, null, 1), 3);
            }
        }
    }

    @l7h
    public final void onRemoveChatEvent(pie pieVar) {
        long j = pieVar.b;
        Long l = this.g;
        if (l != null && j == l.longValue()) {
            yab.i0(this.e, null, 0, new qy3(this, null, 16), 3);
        }
    }
}
