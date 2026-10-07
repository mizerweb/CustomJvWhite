package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vn1 extends mk0 {
    public final CharSequence b;

    public vn1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn1) && cqk.d(this.b, ((vn1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CopyLink(link=" + ((Object) this.b) + ")";
    }
}
