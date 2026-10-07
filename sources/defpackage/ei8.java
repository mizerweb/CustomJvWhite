package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ei8 {
    public final CharSequence a;
    public final int b;

    public ei8(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei8)) {
            return false;
        }
        ei8 ei8Var = (ei8) obj;
        return cqk.d(this.a, ei8Var.a) && this.b == ei8Var.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Integer.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "InputState(inputText=" + ((Object) this.a) + ", cursorPosition=" + this.b + ")";
    }
}
