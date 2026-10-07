package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n90 {
    public final long a;
    public final long b;

    public n90(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        return this.a == n90Var.a && this.b == n90Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "AudioLossStat(lostPackets=", ", receivedPackets="));
    }
}
