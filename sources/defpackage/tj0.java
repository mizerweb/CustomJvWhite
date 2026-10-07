package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 {
    public static final tj0 c = new tj0("", 0);
    public final long a;
    public final CharSequence b;

    public tj0(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj0)) {
            return false;
        }
        tj0 tj0Var = (tj0) obj;
        return this.a == tj0Var.a && this.b.equals(tj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarAbbreviationModel(sourceId=" + this.a + ", abbreviation=" + ((Object) this.b) + ")";
    }
}
