package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dn5 implements oah {
    public final j85 a;
    public final bbd b;
    public final ee6 c;
    public final lhb d;
    public final sm5 e;
    public final sm5 f;
    public final ny8 g;

    public dn5(j85 j85Var, d78 d78Var) {
        bbd bbdVar = d78Var.o;
        ee6 ee6Var = d78Var.i;
        lhb lhbVar = d78Var.j;
        sm5 sm5Var = d78Var.l;
        sm5 sm5Var2 = d78Var.u;
        this.a = j85Var;
        this.b = bbdVar;
        this.c = ee6Var;
        this.d = lhbVar;
        this.e = sm5Var;
        this.f = sm5Var2;
        this.g = rx8.P(1, new an5(this, 0));
    }

    @Override // defpackage.oah
    public final Object get() {
        return (cn5) this.g.getValue();
    }
}
