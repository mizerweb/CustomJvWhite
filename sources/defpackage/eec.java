package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eec implements oj7 {
    public static final eec a;
    private static final fif descriptor;

    static {
        eec eecVar = new eec();
        a = eecVar;
        t4d t4dVar = new t4d("one.me.sdk.OneVideoPreloadConfig.Enabled", eecVar, 8);
        t4dVar.k("max_cache_size_mb", false);
        t4dVar.k("max_duration_ms", false);
        t4dVar.k("preload_count", false);
        t4dVar.k("too_fast_scroll_diff_threshold_percent", true);
        t4dVar.k("too_large_time_diff_threshold_ms", true);
        t4dVar.k("max_unconsumed_time_diff_ms", true);
        t4dVar.k("max_unconsumed_scroll_diff_percent", true);
        t4dVar.k("idle_scroll_inactivity_ms", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        gec gecVar = (gec) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        long j = gecVar.b;
        long j2 = gecVar.i;
        double d = gecVar.h;
        long j3 = gecVar.g;
        long j4 = gecVar.f;
        double d2 = gecVar.e;
        x74VarA.e(fifVar, 0, j);
        x74VarA.e(fifVar, 1, gecVar.c);
        x74VarA.y(2, gecVar.d, fifVar);
        if (x74VarA.B() || Double.compare(d2, 0.02d) != 0) {
            x74VarA.j(fifVar, 3, d2);
        }
        if (x74VarA.B() || j4 != 75) {
            x74VarA.e(fifVar, 4, j4);
        }
        if (x74VarA.B() || j3 != 750) {
            x74VarA.e(fifVar, 5, j3);
        }
        if (x74VarA.B() || Double.compare(d, 0.25d) != 0) {
            x74VarA.j(fifVar, 6, d);
        }
        if (x74VarA.B() || j2 != 500) {
            x74VarA.e(fifVar, 7, j2);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        hp5 hp5Var = hp5.a;
        return new aw8[]{ti9Var, ti9Var, ij8.a, hp5Var, ti9Var, ti9Var, hp5Var, ti9Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        int iL = 0;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        long jQ5 = 0;
        double dE = 0.0d;
        double dE2 = 0.0d;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jQ = v74VarA.q(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    jQ2 = v74VarA.q(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iL = v74VarA.l(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    dE = v74VarA.E(fifVar, 3);
                    i |= 8;
                    break;
                case 4:
                    jQ3 = v74VarA.q(fifVar, 4);
                    i |= 16;
                    break;
                case 5:
                    jQ4 = v74VarA.q(fifVar, 5);
                    i |= 32;
                    break;
                case 6:
                    dE2 = v74VarA.E(fifVar, 6);
                    i |= 64;
                    break;
                case 7:
                    jQ5 = v74VarA.q(fifVar, 7);
                    i |= np0.m;
                    break;
                default:
                    qr7.e(iV);
                    return null;
            }
        }
        v74VarA.j(fifVar);
        return new gec(i, jQ, jQ2, iL, dE, jQ3, jQ4, dE2, jQ5);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
