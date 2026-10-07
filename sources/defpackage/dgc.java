package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dgc extends rbb {
    public final long b;
    public final String c;
    public final boolean d;

    public dgc(long j, String str, boolean z) {
        super(sbi.a);
        this.b = j;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgc)) {
            return false;
        }
        dgc dgcVar = (dgc) obj;
        if (this.b != dgcVar.b) {
            return false;
        }
        String str = dgcVar.c;
        ifh ifhVar = ns4.b;
        return this.c.equals(str) && this.d == dgcVar.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) * 31;
        ifh ifhVar = ns4.b;
        return Boolean.hashCode(this.d) + zo5.d(iHashCode, 31, this.c);
    }

    public final String toString() {
        return nbh.z(qt4.t(this.b, "OpenOneToOneCall(opponentId=", ", conversationId=", ns4.c(this.c)), ", isVideo=", this.d, ")");
    }
}
