package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p9e extends jnl {
    public final CharSequence a;

    public p9e(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9e) && cqk.d(this.a, ((p9e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ")";
    }
}
