package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ri0 {
    public final long a;
    public final long b;
    public final sg0 c;

    public ri0(long j, long j2, sg0 sg0Var) {
        this.a = j;
        this.b = j2;
        this.c = sg0Var;
    }

    public static ri0 a(long j, long j2, sg0 sg0Var) {
        qyj.h("duration must be positive value.", j >= 0);
        qyj.h("bytes must be positive value.", j2 >= 0);
        return new ri0(j, j2, sg0Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ri0)) {
            return false;
        }
        ri0 ri0Var = (ri0) obj;
        return this.a == ri0Var.a && this.b == ri0Var.b && this.c.equals(ri0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
