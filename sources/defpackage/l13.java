package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l13 extends kih {
    public final long c;
    public final int d;
    public final Boolean e;

    public l13(long j, int i, Boolean bool) {
        this.c = j;
        this.d = i;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l13)) {
            return false;
        }
        l13 l13Var = (l13) obj;
        return this.c == l13Var.c && this.d == l13Var.d && cqk.d(this.e, l13Var.e);
    }

    public final int hashCode() {
        int iC = zo5.c(this.d, Long.hashCode(this.c) * 31, 31);
        Boolean bool = this.e;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbQ = c0a.q(this.d, this.c, "Response(mark=", ", unread=");
        sbQ.append(", success=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }
}
