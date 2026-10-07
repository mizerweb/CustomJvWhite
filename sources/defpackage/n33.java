package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n33 extends mk0 {
    public final Long b;
    public final long c;
    public final boolean d;

    public n33(Long l, long j, boolean z) {
        super(3);
        this.b = l;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n33)) {
            return false;
        }
        n33 n33Var = (n33) obj;
        return this.b.equals(n33Var.b) && this.c == n33Var.c && this.d == n33Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qt4.g(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttach(attachId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        return nbh.z(sb, ", isForwardAttach=", this.d, ")");
    }
}
