package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class to5 implements xx6 {
    public final xx6 a;
    public final cf7 b;
    public final qf7 c;

    public to5(xx6 xx6Var, cf7 cf7Var, qf7 qf7Var) {
        this.a = xx6Var;
        this.b = cf7Var;
        this.c = qf7Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        wfe wfeVar = new wfe();
        wfeVar.a = vd7.e;
        Object objCollect = this.a.collect(new so5(this, wfeVar, yx6Var), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
