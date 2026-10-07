package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z89 extends a99 implements z09 {
    public final g19 e;
    public final /* synthetic */ b99 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z89(b99 b99Var, g19 g19Var, srb srbVar) {
        super(b99Var, srbVar);
        this.f = b99Var;
        this.e = g19Var;
    }

    @Override // defpackage.a99
    public final void b() {
        this.e.f().f(this);
    }

    @Override // defpackage.a99
    public final boolean c(g19 g19Var) {
        return this.e == g19Var;
    }

    @Override // defpackage.a99
    public final boolean d() {
        return this.e.f().d.a(n09.d);
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        g19 g19Var2 = this.e;
        n09 n09Var = g19Var2.f().d;
        if (n09Var == n09.a) {
            this.f.j(this.a);
            return;
        }
        n09 n09Var2 = null;
        while (n09Var2 != n09Var) {
            a(d());
            n09Var2 = n09Var;
            n09Var = g19Var2.f().d;
        }
    }
}
