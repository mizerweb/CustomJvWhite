package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lf4 {
    public final float a;
    public final double b;
    public final int c;
    public final long d;
    public int e;

    public lf4(int i, long j, float f) {
        lvb.R(j > 0);
        lvb.R(f > 0.0f);
        lvb.R(0 < j);
        this.d = j;
        this.a = f;
        this.c = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }

    public final lf4 a() {
        return new lf4(0, this.d, this.a);
    }

    public final boolean b() {
        return this.e < this.c;
    }
}
