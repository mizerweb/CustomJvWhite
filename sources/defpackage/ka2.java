package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class ka2 {
    public static final ja2 Companion = new ja2();
    public final boolean a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;

    public /* synthetic */ ka2(int i, boolean z, long j, long j2, float f, long j3) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = 5000L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 2000L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = 1.0f;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = 2000L;
        } else {
            this.e = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka2)) {
            return false;
        }
        ka2 ka2Var = (ka2) obj;
        return this.a == ka2Var.a && this.b == ka2Var.b && this.c == ka2Var.c && Float.compare(this.d, ka2Var.d) == 0 && this.e == ka2Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + nbh.m(qt4.g(qt4.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsSignalingTimeouts(enabled=");
        sb.append(this.a);
        sb.append(", connectTimeout=");
        sb.append(this.b);
        qt4.z(this.c, ", initialReconnectDelay=", ", reconnectDelayScaleFactor=", sb);
        sb.append(this.d);
        sb.append(", maxReconnectDelay=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public ka2() {
        this.a = false;
        this.b = 5000L;
        this.c = 2000L;
        this.d = 1.0f;
        this.e = 2000L;
    }
}
