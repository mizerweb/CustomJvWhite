package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yi9 {
    public long a;
    public long b;
    public long c;
    public long d;

    public final double a(long j, long j2) {
        long j3 = j - this.a;
        if (j3 < 0) {
            j3 = 0;
        }
        this.c = j3;
        long j4 = j2 - this.b;
        if (j4 < 0) {
            j4 = 0;
        }
        this.d = j4;
        double d = (j4 == 0 && j3 == 0) ? 0.0d : j3 / (j4 + j3);
        this.a = j;
        this.b = j2;
        return d;
    }
}
