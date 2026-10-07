package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vb1 implements wb1 {
    public final long a;
    public final boolean b;

    public vb1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb1)) {
            return false;
        }
        vb1 vb1Var = (vb1) obj;
        return this.a == vb1Var.a && this.b == vb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "OneToOne(opponentId=", ", isVideo=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
