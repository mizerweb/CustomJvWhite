package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bp1 extends fp1 {
    public final CharSequence a;
    public final String b;

    public bp1(String str, CharSequence charSequence) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return cqk.d(this.a, bp1Var.a) && this.b.equals(bp1Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ", accessibility=" + this.b + ")";
    }
}
