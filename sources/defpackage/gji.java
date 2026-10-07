package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gji implements iji {
    public final long a;
    public final long b;

    public gji(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gji)) {
            return false;
        }
        gji gjiVar = (gji) obj;
        return this.a == gjiVar.a && this.b == gjiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "InProgress(bytesSent=", ", totalKnownBytes="));
    }
}
