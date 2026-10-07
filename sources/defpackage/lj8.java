package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lj8 extends mp {
    public final long b;

    public lj8(String str, long j) {
        super(str);
        this.b = j;
    }

    @Override // defpackage.mp
    public final void d(mv8 mv8Var) {
        mv8Var.a0(this.a);
        ((x1) mv8Var).b(Long.toString(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
