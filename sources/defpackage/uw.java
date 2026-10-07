package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uw {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public /* synthetic */ uw(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.b;
    }

    public void c() {
        this.b = 0L;
        this.c = 0L;
    }

    public double d(long j, long j2) {
        double d;
        long j3 = j - this.b;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j4 == 0) {
            d = Double.NaN;
        } else {
            long j5 = j2 - j4;
            if (j5 < 1) {
                j5 = 1;
            }
            d = (j3 * 1000) / j5;
        }
        this.b = j;
        this.c = j2;
        return d * 8.0d;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }
}
