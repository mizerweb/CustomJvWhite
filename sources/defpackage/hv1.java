package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hv1 {
    public final CharSequence a;

    public hv1(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv1) && cqk.d(this.a, ((hv1) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "CallPresettingsEditChanges(changedName=" + ((Object) this.a) + ")";
    }
}
