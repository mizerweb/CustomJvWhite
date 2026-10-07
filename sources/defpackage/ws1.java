package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ws1 extends xs1 {
    public final CharSequence a;

    public ws1(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws1) && cqk.d(this.a, ((ws1) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ")";
    }
}
