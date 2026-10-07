package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sq6 extends kih {
    public final String c;
    public final Boolean d;

    public sq6(String str, Boolean bool) {
        this.c = str;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq6)) {
            return false;
        }
        sq6 sq6Var = (sq6) obj;
        return cqk.d(this.c, sq6Var.c) && cqk.d(this.d, sq6Var.d);
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Boolean bool = this.d;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(url=" + this.c + ", unsafe=" + this.d + ")";
    }
}
