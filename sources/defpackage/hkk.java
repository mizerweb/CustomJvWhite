package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public hkk(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkk)) {
            return false;
        }
        hkk hkkVar = (hkk) obj;
        return this.a == hkkVar.a && this.b == hkkVar.b && this.c == hkkVar.c && this.d == hkkVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ml9.a(ml9.a(Long.hashCode(this.a) * 31, this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CpuTicks(utime=");
        sb.append(this.a);
        sb.append(", stime=");
        sb.append(this.b);
        sb.append(", cutime=");
        sb.append(this.c);
        sb.append(", cstime=");
        return zo5.u(sb, this.d, ')');
    }
}
