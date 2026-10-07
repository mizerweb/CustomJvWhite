package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h19 {
    public n09 a;
    public z09 b;

    public final void a(g19 g19Var, m09 m09Var) {
        n09 n09VarA = m09Var.a();
        n09 n09Var = this.a;
        if (n09VarA.compareTo(n09Var) < 0) {
            n09Var = n09VarA;
        }
        this.a = n09Var;
        this.b.l(g19Var, m09Var);
        this.a = n09VarA;
    }
}
