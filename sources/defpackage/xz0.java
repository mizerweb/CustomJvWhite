package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xz0 extends mp {
    public final boolean b;

    public xz0(String str, boolean z) {
        super(str);
        this.b = z;
    }

    @Override // defpackage.mp
    public final void d(mv8 mv8Var) {
        mv8Var.a0(this.a);
        ((x1) mv8Var).b(String.valueOf(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
