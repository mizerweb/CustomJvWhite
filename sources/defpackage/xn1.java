package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xn1 extends mk0 {
    public final CharSequence b;

    public xn1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn1) && cqk.d(this.b, ((xn1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + ((Object) this.b) + ")";
    }
}
