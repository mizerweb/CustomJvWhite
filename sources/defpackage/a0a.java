package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a0a {
    public final Long a;
    public final b87 b;
    public final b87 c;

    public a0a(Long l, b87 b87Var, b87 b87Var2) {
        this.a = l;
        this.b = b87Var;
        this.c = b87Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return cqk.d(this.a, a0aVar.a) && cqk.d(this.b, a0aVar.b) && cqk.d(this.c, a0aVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31)) * 31;
        b87 b87Var = this.c;
        return iHashCode + (b87Var != null ? b87Var.hashCode() : 0);
    }

    public final String toString() {
        return "MediaMetadata(durationUs=" + this.a + ", videoStreamFormat=" + this.b + ", audioStreamFormat=" + this.c + ")";
    }
}
