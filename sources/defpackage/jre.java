package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jre extends n31 {
    public final /* synthetic */ th5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jre(th5 th5Var, int i) {
        super(i);
        this.b = th5Var;
    }

    @Override // defpackage.n31
    public final void i(id7 id7Var) {
        this.b.j(new abh(id7Var));
    }

    @Override // defpackage.n31
    public final void k(id7 id7Var, int i, int i2) {
        p(id7Var, i, i2);
    }

    @Override // defpackage.n31
    public final void n(id7 id7Var) throws Throwable {
        abh abhVar = new abh(id7Var);
        th5 th5Var = this.b;
        th5Var.l(abhVar);
        th5Var.h = id7Var;
    }

    @Override // defpackage.n31
    public final void p(id7 id7Var, int i, int i2) {
        this.b.k(new abh(id7Var), i, i2);
    }
}
