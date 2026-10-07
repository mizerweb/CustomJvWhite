package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ocb {
    public final long a;
    public final long b;
    public final long c;

    public ocb(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocb)) {
            return false;
        }
        ocb ocbVar = (ocb) obj;
        return this.a == ocbVar.a && this.b == ocbVar.b && this.c == ocbVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PerTypeNetworkSnapshot(rxBytes=", ", txBytes=");
        sbS.append(this.b);
        return zo5.k(this.c, ", idleMs=", ")", sbS);
    }
}
