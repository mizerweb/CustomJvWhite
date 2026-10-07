package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pr2 extends mr2 {
    public final xx6 d;
    public final int e;

    public pr2(int i, int i2, int i3, vt4 vt4Var, xx6 xx6Var) {
        super(vt4Var, i2, i3);
        this.d = xx6Var;
        this.e = i;
    }

    @Override // defpackage.mr2
    public final String e() {
        return "concurrency=" + this.e;
    }

    @Override // defpackage.mr2
    public final Object f(njd njdVar, lq4 lq4Var) {
        int i = ggf.a;
        Object objCollect = this.d.collect(new k30((vo8) lq4Var.getContext().x0(nhb.h), new fgf(this.e), njdVar, new mhf(njdVar), 1), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }

    @Override // defpackage.mr2
    public final mr2 g(vt4 vt4Var, int i, int i2) {
        return new pr2(this.e, i, i2, vt4Var, this.d);
    }

    @Override // defpackage.mr2
    public final hr2 j(gu4 gu4Var) {
        qf7 qobVar = new qob(this, (lq4) null, 11);
        njd njdVar = new njd(n1g.M(gu4Var, this.a), yab.b(this.b, 1, null, 4));
        njdVar.m0(1, njdVar, qobVar);
        return njdVar;
    }
}
