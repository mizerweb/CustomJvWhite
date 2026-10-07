package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class td7 {
    public final int a;
    public final long b;

    public td7(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td7)) {
            return false;
        }
        td7 td7Var = (td7) obj;
        return this.a == td7Var.a && this.b == td7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "FreezeStat(freezeCount=", ", totalFreezeDuration=");
        sbX.append(")");
        return sbX.toString();
    }
}
