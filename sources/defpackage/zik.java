package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zik {
    public final long a;
    public final long b;
    public final long c;

    public zik(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zik)) {
            return false;
        }
        zik zikVar = (zik) obj;
        return this.a == zikVar.a && this.b == zikVar.b && this.c == zikVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ml9.a(Long.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerTypeNetworkSnapshot(rxBytes=");
        sb.append(this.a);
        sb.append(", txBytes=");
        sb.append(this.b);
        sb.append(", idleMs=");
        return zo5.u(sb, this.c, ')');
    }
}
