package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class x2f implements Runnable {
    public final Runnable a;
    public final j66 b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public final /* synthetic */ y2f g;

    public x2f(y2f y2fVar, long j, Runnable runnable, long j2, j66 j66Var, long j3) {
        this.g = y2fVar;
        this.a = runnable;
        this.b = j66Var;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        j66 j66Var = this.b;
        if (j66Var.a()) {
            return;
        }
        y2f y2fVar = this.g;
        y2fVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit2.convert(jCurrentTimeMillis, timeUnit);
        long j2 = z2f.a;
        long j3 = jConvert + j2;
        long j4 = this.e;
        long j5 = this.c;
        if (j3 < j4 || jConvert >= j4 + j5 + j2) {
            j = jConvert + j5;
            long j6 = this.d + 1;
            this.d = j6;
            this.f = j - (j5 * j6);
        } else {
            long j7 = this.f;
            long j8 = this.d + 1;
            this.d = j8;
            j = (j8 * j5) + j7;
        }
        this.e = jConvert;
        oo5.d(j66Var, y2fVar.b(this, j - jConvert, timeUnit2));
    }
}
