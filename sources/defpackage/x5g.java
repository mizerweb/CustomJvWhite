package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x5g {
    public final long a;
    public final long b;
    public final float c;
    public final long d;

    public x5g(long j, long j2, float f, long j3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5g)) {
            return false;
        }
        x5g x5gVar = (x5g) obj;
        return this.a == x5gVar.a && this.b == x5gVar.b && Float.compare(this.c, x5gVar.c) == 0 && this.d == x5gVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + nbh.m(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Timeouts(connectTimeout=", ", initialReconnectDelay=");
        sbS.append(this.b);
        sbS.append(", reconnectDelayScaleFactor=");
        sbS.append(this.c);
        return zo5.k(this.d, ", maxReconnectDelay=", ")", sbS);
    }
}
