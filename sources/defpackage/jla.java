package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jla {
    public final CharSequence a;
    public final Integer b;

    public jla(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jla)) {
            return false;
        }
        jla jlaVar = (jla) obj;
        return cqk.d(this.a, jlaVar.a) && cqk.d(this.b, jlaVar.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "InputTextData(inputText=" + ((Object) this.a) + ", inputCursorPosition=" + this.b + ")";
    }
}
