package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u4e {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;

    public u4e(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4e)) {
            return false;
        }
        u4e u4eVar = (u4e) obj;
        return this.a == u4eVar.a && this.b == u4eVar.b && this.c == u4eVar.c && this.d == u4eVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("RateCallParams(threshold=", this.a, ", sdkThreshold=", this.b, ", minimumCallDuration=");
        c0a.v(sbP, this.c, ", delaySec=", this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
