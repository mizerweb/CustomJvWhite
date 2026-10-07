package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p5h extends mp {
    public final String b;

    public p5h(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // defpackage.mp
    public final void d(mv8 mv8Var) {
        String str = this.b;
        if (str == null || str.length() == 0) {
            return;
        }
        mv8Var.a0(this.a);
        ((x1) mv8Var).p0(str);
    }

    public final String toString() {
        return this.a + " = " + ((Object) this.b);
    }
}
