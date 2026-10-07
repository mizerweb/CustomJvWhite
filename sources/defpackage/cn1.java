package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cn1 {
    public static final cn1 e = new cn1(null, gn1.a, false, false);
    public final CharSequence a;
    public final gn1 b;
    public final boolean c;
    public final boolean d;

    public cn1(CharSequence charSequence, gn1 gn1Var, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = gn1Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn1)) {
            return false;
        }
        cn1 cn1Var = (cn1) obj;
        return cqk.d(this.a, cn1Var.a) && this.b == cn1Var.b && this.c == cn1Var.c && this.d == cn1Var.d;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.d) + nbh.n((this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallIndicatorState(title=");
        sb.append((Object) this.a);
        sb.append(", indicatorState=");
        sb.append(this.b);
        sb.append(", actionsAvailable=");
        return bc1.m(", isTalking=", ")", sb, this.c, this.d);
    }
}
