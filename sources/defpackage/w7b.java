package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w7b {
    public static final /* synthetic */ zv8[] g;
    public final xte a;
    public final xhh b;
    public final String c = zo5.p(w7b.class.getName(), "#", av7.g(System.identityHashCode(this)));
    public final dq4 d;
    public final ny8 e;
    public final p3c f;

    static {
        z8b z8bVar = new z8b(w7b.class, "playAttachJob", "getPlayAttachJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public w7b(xte xteVar, xhh xhhVar, yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = xteVar;
        this.b = xhhVar;
        lk9 lk9VarS0 = ((n0c) xhhVar).c().S0();
        nah nahVarA = wk8.a();
        lk9VarS0.getClass();
        this.d = cqk.a(lvb.x0(lk9VarS0, nahVarA).u0(yt4Var));
        this.e = ny8Var2;
        this.f = qyj.S();
        v7b v7bVar = new v7b(this, ny8Var, ny8Var3);
        synchronized (xteVar.i) {
            xteVar.i.add(v7bVar);
        }
    }

    public final void a(t7b t7bVar) {
        xte xteVar = this.a;
        synchronized (xteVar.i) {
            try {
                vte vteVar = new vte(t7bVar);
                tte tteVar = (tte) xteVar.j.put(t7bVar, vteVar);
                if (tteVar != null) {
                    xteVar.i.remove(tteVar);
                }
                xteVar.i.add(vteVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        xte xteVar = this.a;
        yab.i0(xteVar.d, null, 0, new wte(xteVar, null, 0), 3);
    }

    public final void c(ewk ewkVar) {
        d();
        sgg sggVarI0 = yab.i0(this.d, ((n0c) this.b).b(), 0, new xra(ewkVar, this, (lq4) null, 2), 2);
        this.f.B(this, g[0], sggVarI0);
    }

    public final void d() {
        xte xteVar = this.a;
        xteVar.s = false;
        vo8 vo8Var = (vo8) xteVar.y.m(xteVar, xte.B[0]);
        lq4 lq4Var = null;
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        yab.i0(xteVar.d, null, 0, new wte(xteVar, lq4Var, 2), 3);
    }
}
