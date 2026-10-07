package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wn1 extends mk0 {
    public final CharSequence b;

    public wn1(CharSequence charSequence) {
        super(2);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn1) && cqk.d(this.b, ((wn1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SendToChatLink(link=" + ((Object) this.b) + ")";
    }
}
