package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mo6 implements no6 {
    public final String a;
    public final kr7 b;

    public mo6(String str, kr7 kr7Var) {
        this.a = str;
        this.b = kr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo6)) {
            return false;
        }
        mo6 mo6Var = (mo6) obj;
        return this.a.equals(mo6Var.a) && cqk.d(this.b, mo6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
