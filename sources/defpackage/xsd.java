package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xsd implements zsd {
    public final CharSequence a;

    public xsd(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsd) && this.a.equals(((xsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SaveError(error=" + ((Object) this.a) + ")";
    }
}
