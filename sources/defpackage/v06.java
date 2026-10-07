package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v06 implements b16 {
    public final long a;
    public final boolean b;

    public v06(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v06)) {
            return false;
        }
        v06 v06Var = (v06) obj;
        return this.a == v06Var.a && this.b == v06Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "RestorePlayerForExport(position=", ", playWhenReady=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
