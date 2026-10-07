package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g90 implements d89 {
    public static final /* synthetic */ zv8[] i;
    public final ny8 a;
    public final ny8 b;
    public final dq4 c;
    public final p3c d;
    public final due e;
    public volatile Long f;
    public final mjg g;
    public final fz6 h;

    static {
        z8b z8bVar = new z8b(g90.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public g90(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        lk9 lk9VarS0 = ((n0c) ((xhh) ny8Var.getValue())).c().S0();
        wo8 wo8VarA = vd7.a();
        lk9VarS0.getClass();
        this.c = cqk.a(lvb.x0(lk9VarS0, wo8VarA));
        this.d = qyj.S();
        this.e = new due(this);
        mjg mjgVarA = p90.a(new c89(null, false));
        this.g = mjgVarA;
        this.h = new fz6(mjgVarA, new sfd(ny8Var2, this, (lq4) null, 14));
    }

    public static final void f(g90 g90Var) {
        g90Var.d.B(g90Var, i[0], yab.i0(g90Var.c, null, 2, new jhc(g90Var, null, 6), 1));
    }

    @Override // defpackage.d89
    public final void a() {
        if (g().a.r) {
            g().d();
        }
    }

    @Override // defpackage.d89
    public final void b(Long l) {
        this.f = l;
    }

    @Override // defpackage.d89
    public final void c() {
        mjg mjgVar = this.g;
        ((c89) mjgVar.getValue()).getClass();
        c89 c89Var = new c89(null, false);
        mjgVar.getClass();
        mjgVar.j(null, c89Var);
        g().d();
    }

    @Override // defpackage.d89
    public final xx6 d() {
        return this.h;
    }

    @Override // defpackage.d89
    public final void e() {
        xte xteVar = g().a;
        yab.i0(xteVar.d, null, 0, new zzc(xteVar, 1.0f, null), 3);
        long jG = g().a.g();
        Long l = this.f;
        boolean z = l != null && jG == l.longValue();
        if (g().a.r && z) {
            g().b();
            return;
        }
        if (g().a.q && z) {
            xte xteVar2 = g().a;
            yab.i0(xteVar2.d, null, 0, new wte(xteVar2, null, 1), 3);
            return;
        }
        Long l2 = this.f;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            g().c(new s7b(jLongValue, ((ju6) ((rs6) this.b.getValue())).f(jLongValue).getAbsolutePath()));
        }
    }

    public final w7b g() {
        return (w7b) this.a.getValue();
    }

    @Override // defpackage.d89
    public final void release() {
        cqk.g(this.c);
        w7b w7bVarG = g();
        due dueVar = this.e;
        xte xteVar = w7bVarG.a;
        synchronized (xteVar.i) {
            tte tteVar = (tte) xteVar.j.remove(dueVar);
            if (tteVar != null) {
                xteVar.i.remove(tteVar);
            }
        }
    }

    @Override // defpackage.d89
    public final void seekTo(long j) {
        xte xteVar = g().a;
        yab.i0(xteVar.d, null, 0, new tl1(xteVar, j, null, 7), 3);
    }
}
