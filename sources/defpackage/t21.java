package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t21 extends mp {
    public final s21 b;
    public final u21 c;

    public t21(s21 s21Var, u21 u21Var) {
        super(s21Var.a);
        this.b = s21Var;
        this.c = u21Var;
    }

    @Override // defpackage.mp
    public final boolean a() {
        return this.c.canRepeat();
    }

    @Override // defpackage.mp
    public final boolean b() {
        return this.c.isSupplied();
    }

    @Override // defpackage.mp
    public final boolean c() {
        return this.c.shouldPost();
    }

    @Override // defpackage.mp
    public final void d(mv8 mv8Var) {
        u21 u21Var = this.c;
        if (u21Var.shouldSkipParam()) {
            return;
        }
        mv8Var.a0(this.b.a);
        u21Var.write(mv8Var);
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
