package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tg0 {
    public final int a;
    public final long b;

    public tg0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tg0) {
            tg0 tg0Var = (tg0) obj;
            if (this.a == tg0Var.a && this.b == tg0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return c0a.m(this.b, "}", sb);
    }
}
