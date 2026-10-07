package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n9e extends jnl {
    public final CharSequence a;

    public n9e(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9e) && this.a.equals(((n9e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + ((Object) this.a) + ")";
    }
}
