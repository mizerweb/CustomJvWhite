package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w1d implements a2d {
    public final CharSequence a;
    public final long b;

    public w1d(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1d)) {
            return false;
        }
        w1d w1dVar = (w1d) obj;
        return this.a.equals(w1dVar.a) && this.b == w1dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + ((Object) this.a) + ", avatarSourceId=" + this.b + ")";
    }
}
