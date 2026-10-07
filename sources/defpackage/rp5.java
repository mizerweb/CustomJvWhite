package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rp5 {
    public final ss5 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final ps5 h;

    public rp5(ss5 ss5Var, int i, long j, long j2, long j3, int i2, int i3, ps5 ps5Var) {
        ps5Var.getClass();
        boolean z = false;
        lvb.R((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z = true;
            }
            lvb.R(z);
        }
        this.a = ss5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = ps5Var;
    }

    public rp5(ss5 ss5Var, int i, long j, long j2, int i2) {
        this(ss5Var, i, j, j2, -1L, i2, 0, new ps5());
    }
}
