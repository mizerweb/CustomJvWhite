package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class bxi {
    public final xp9 a;
    public final uwi b;
    public final vwi g;
    public long l;
    public final gn5 c = new gn5();
    public final i0g d = new i0g();
    public final i0g e = new i0g();
    public final c70 f = new c70();
    public long h = -9223372036854775807L;
    public k4j k = k4j.d;
    public long i = -9223372036854775807L;
    public long j = -9223372036854775807L;

    public bxi(xp9 xp9Var, uwi uwiVar, vwi vwiVar) {
        this.a = xp9Var;
        this.b = uwiVar;
        this.g = vwiVar;
    }

    public final void a(long j, long j2) {
        final xp9 xp9Var = this.a;
        rf5 rf5Var = (rf5) xp9Var.c;
        while (true) {
            c70 c70Var = this.f;
            if (c70Var.c == 0) {
                return;
            }
            long jE = c70Var.e();
            Long l = (Long) this.e.d(jE);
            uwi uwiVar = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                uwiVar.e(2);
            }
            long j3 = this.l;
            uwi uwiVar2 = this.b;
            gn5 gn5Var = this.c;
            int iA = uwiVar2.a(jE, j, j2, j3, false, false, gn5Var);
            if (iA != 5 && iA != 4) {
                this.g.a(jE, gn5Var.a);
            }
            final int i = 1;
            if (iA == 0 || iA == 1) {
                this.i = jE;
                final int i2 = 0;
                boolean z = iA == 0;
                long jF = c70Var.f();
                k4j k4jVar = (k4j) this.d.d(jF);
                if (k4jVar != null && !k4jVar.equals(k4j.d) && !k4jVar.equals(this.k)) {
                    this.k = k4jVar;
                    a87 a87Var = new a87();
                    a87Var.t = k4jVar.a;
                    a87Var.u = k4jVar.b;
                    a87Var.m = uya.n("video/raw");
                    xp9Var.b = new b87(a87Var);
                    rf5Var.i.execute(new gf5(xp9Var, i, k4jVar));
                }
                long jNanoTime = z ? System.nanoTime() : gn5Var.b;
                i = uwiVar.e == 3 ? 0 : 1;
                uwiVar.e = 3;
                ((nfh) uwiVar.l).getClass();
                uwiVar.g = vqi.X(SystemClock.elapsedRealtime());
                if (i != 0 && rf5Var.e != null) {
                    rf5Var.i.execute(new Runnable() { // from class: qf5
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            xp9 xp9Var2 = xp9Var;
                            switch (i3) {
                                case 0:
                                    ((rf5) xp9Var2.c).h.onFirstFrameRendered();
                                    break;
                                default:
                                    ((rf5) xp9Var2.c).h.b();
                                    break;
                            }
                        }
                    });
                }
                b87 b87Var = (b87) xp9Var.b;
                rf5Var.j.b(jF, jNanoTime, b87Var == null ? new b87(new a87()) : b87Var, null);
                ((i4j) rf5Var.d.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = jE;
                c70Var.f();
                rf5Var.i.execute(new Runnable() { // from class: qf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        xp9 xp9Var2 = xp9Var;
                        switch (i3) {
                            case 0:
                                ((rf5) xp9Var2.c).h.onFirstFrameRendered();
                                break;
                            default:
                                ((rf5) xp9Var2.c).h.b();
                                break;
                        }
                    }
                });
                ((i4j) rf5Var.d.remove()).b();
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    ore.k(String.valueOf(iA));
                    return;
                }
                this.i = jE;
            }
        }
    }
}
