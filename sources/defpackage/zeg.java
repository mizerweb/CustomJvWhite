package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zeg {
    public final lo0 a;
    public final int b;
    public final long c;
    public final nfh d;
    public int f;
    public long g;
    public long h;
    public int k;
    public long l;
    public final pgg e = new pgg(5);
    public long i = Long.MIN_VALUE;
    public long j = Long.MIN_VALUE;

    public zeg(yeg yegVar) {
        this.a = yegVar.a;
        this.b = yegVar.b;
        this.c = yegVar.c;
        this.d = yegVar.d;
    }

    public final void a(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.j) {
                return;
            }
            this.j = j2;
            this.e.b(i, j, j2);
        }
    }

    public final void b() {
        lvb.b0(this.f > 0);
        this.d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = (int) (jElapsedRealtime - this.g);
        if (j > 0) {
            lo0 lo0Var = this.a;
            lo0Var.b(this.h, 1000 * j);
            int i = this.k + 1;
            this.k = i;
            if (i > this.b && this.l > this.c) {
                this.i = lo0Var.a();
            }
            a((int) j, this.h, this.i);
            this.g = jElapsedRealtime;
            this.h = 0L;
        }
        this.f--;
    }
}
