package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl4 extends kih {
    public final l8b c;
    public final long d;

    public pl4(long j, l8b l8bVar) {
        this.c = l8bVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl4)) {
            return false;
        }
        pl4 pl4Var = (pl4) obj;
        return this.c.equals(pl4Var.c) && this.d == pl4Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(presence=" + this.c + ", time=" + this.d + ")";
    }
}
