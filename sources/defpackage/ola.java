package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ola implements pla {
    public final CharSequence a;

    public ola(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ola) && this.a.equals(((ola) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReplySend(inputText=" + ((Object) this.a) + ")";
    }
}
