package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w09 extends v09 implements z09 {
    public final i19 a;
    public final vt4 b;

    public w09(i19 i19Var, vt4 vt4Var) {
        this.a = i19Var;
        this.b = vt4Var;
        if (i19Var.d == n09.a) {
            vd7.d(vt4Var);
        }
    }

    @Override // defpackage.gu4
    public final vt4 k() {
        return this.b;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        i19 i19Var = this.a;
        if (i19Var.d.compareTo(n09.a) <= 0) {
            i19Var.f(this);
            vd7.d(this.b);
        }
    }
}
