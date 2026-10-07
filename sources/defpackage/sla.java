package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sla implements ama {
    public final CharSequence a;

    public sla(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sla) && cqk.d(this.a, ((sla) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "FinishEditMessage(text=" + ((Object) this.a) + ")";
    }
}
