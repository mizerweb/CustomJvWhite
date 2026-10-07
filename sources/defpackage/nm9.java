package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nm9 extends b8a {
    public final Object m;
    public final p51 n;
    public g8b o;

    public nm9(Object obj, p51 p51Var) {
        this.m = obj;
        this.n = p51Var;
    }

    public static void m(b99 b99Var, nm9 nm9Var, g8b g8bVar) {
        a8a a8aVar;
        if (b99Var != null && (a8aVar = (a8a) nm9Var.l.b(b99Var)) != null) {
            a8aVar.a.j(a8aVar);
        }
        super.l(g8bVar, new t07(3, new lh9(2, nm9Var)));
    }

    @Override // defpackage.b99
    public final Object d() {
        g8b g8bVar = this.o;
        return g8bVar == null ? this.m : this.n.mo41apply(g8bVar.d());
    }

    @Override // defpackage.b8a
    public final void l(b99 b99Var, srb srbVar) {
        throw null;
    }
}
