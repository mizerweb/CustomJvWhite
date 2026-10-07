package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes4.dex */
public final class vwi {
    public long a;
    public long b;
    public double c;
    public Range d;

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j, long j2) {
        double dDoubleValue;
        lvb.R(j != -9223372036854775807L);
        lvb.R(j2 != -9223372036854775807L);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
        }
        this.c = (((Double) this.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public final long b(long j) {
        long j2 = this.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (((j - j2) * this.c) + this.b);
    }

    public final void c() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void d(float f) {
        lvb.R(f > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        c();
    }
}
