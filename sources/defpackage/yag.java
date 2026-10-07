package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class yag implements lo0 {
    public final ArrayDeque a;
    public final ore b;
    public final nfh c;
    public double d;
    public double e;

    public yag() {
        ore oreVar = new ore(5);
        this.a = new ArrayDeque();
        this.b = oreVar;
        this.c = qt3.a;
    }

    @Override // defpackage.lo0
    public final long a() {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.d / this.e);
    }

    @Override // defpackage.lo0
    public final void b(long j, long j2) {
        while (true) {
            this.b.getClass();
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.size() < 10) {
                double dSqrt = Math.sqrt(j);
                long j3 = (j * 8000000) / j2;
                this.c.getClass();
                SystemClock.elapsedRealtime();
                arrayDeque.add(new xag(j3, dSqrt));
                this.d = (j3 * dSqrt) + this.d;
                this.e += dSqrt;
                return;
            }
            xag xagVar = (xag) arrayDeque.remove();
            double d = this.d;
            double d2 = xagVar.a;
            double d3 = xagVar.b;
            this.d = d - (d2 * d3);
            this.e -= d3;
        }
    }

    @Override // defpackage.lo0
    public final void reset() {
        this.a.clear();
        this.d = 0.0d;
        this.e = 0.0d;
    }
}
