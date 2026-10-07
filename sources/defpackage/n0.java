package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 implements tt4 {
    public final ut4 a;

    public n0(ut4 ut4Var) {
        this.a = ut4Var;
    }

    @Override // defpackage.vt4
    public final Object E(Object obj, qf7 qf7Var) {
        return qf7Var.invoke(obj, this);
    }

    @Override // defpackage.vt4
    public /* bridge */ vt4 I(ut4 ut4Var) {
        return tre.r0(this, ut4Var);
    }

    @Override // defpackage.tt4
    public final ut4 getKey() {
        return this.a;
    }

    @Override // defpackage.vt4
    public final vt4 u0(vt4 vt4Var) {
        return lvb.x0(this, vt4Var);
    }

    @Override // defpackage.vt4
    public /* bridge */ tt4 x0(ut4 ut4Var) {
        return tre.a0(this, ut4Var);
    }
}
