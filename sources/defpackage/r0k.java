package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0k extends e84 {
    public final ur0 k;

    public r0k(ur0 ur0Var) {
        this.k = ur0Var;
    }

    @Override // defpackage.e84
    public final void A(Object obj, ur0 ur0Var, ush ushVar) {
        D(ushVar);
    }

    public x4a C(x4a x4aVar) {
        return x4aVar;
    }

    public abstract void D(ush ushVar);

    public void E() {
        B(null, this.k);
    }

    @Override // defpackage.ur0
    public final ush j() {
        return this.k.j();
    }

    @Override // defpackage.ur0
    public final ry9 k() {
        return this.k.k();
    }

    @Override // defpackage.ur0
    public final boolean l() {
        return this.k.l();
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.j = v1iVar;
        this.i = vqi.p(null);
        E();
    }

    @Override // defpackage.ur0
    public void v(ry9 ry9Var) {
        this.k.v(ry9Var);
    }

    @Override // defpackage.e84
    public final x4a x(Object obj, x4a x4aVar) {
        return C(x4aVar);
    }

    @Override // defpackage.e84
    public final long y(Object obj, long j, x4a x4aVar) {
        return j;
    }

    @Override // defpackage.e84
    public final int z(int i, Object obj) {
        return i;
    }
}
