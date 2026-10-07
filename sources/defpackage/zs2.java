package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zs2 extends gt2 {
    public final gt2 a;
    public final gt2 b;

    public zs2(gt2 gt2Var, gt2 gt2Var2) {
        gt2Var.getClass();
        this.a = gt2Var;
        gt2Var2.getClass();
        this.b = gt2Var2;
    }

    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.gt2
    public final boolean c(char c) {
        return this.a.c(c) && this.b.c(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
