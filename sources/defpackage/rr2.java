package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rr2 extends qr2 {
    public rr2(int i, int i2, int i3, vt4 vt4Var, xx6 xx6Var) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? k66.a : vt4Var, xx6Var);
    }

    @Override // defpackage.mr2
    public final mr2 g(vt4 vt4Var, int i, int i2) {
        return new rr2(i, i2, vt4Var, this.d);
    }

    @Override // defpackage.mr2
    public final xx6 i() {
        return this.d;
    }

    @Override // defpackage.qr2
    public final Object l(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.d.collect(yx6Var, lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
