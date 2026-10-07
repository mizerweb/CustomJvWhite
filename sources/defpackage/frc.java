package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class frc implements oj7 {
    public static final frc a;
    private static final fif descriptor;

    static {
        frc frcVar = new frc();
        a = frcVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.pms.PerfRegistrarServerSettings", frcVar, 5);
        t4dVar.k("persistAttempts", true);
        t4dVar.k("persistIntervalMs", true);
        t4dVar.k("cleanupThresholdMs", true);
        t4dVar.k("persistInterval", true);
        t4dVar.k("cleanupThreshold", true);
        descriptor = t4dVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        hrc hrcVar = (hrc) obj;
        long j = hrcVar.e;
        long j2 = hrcVar.d;
        long j3 = hrcVar.a;
        long j4 = hrcVar.c;
        long j5 = hrcVar.b;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || j3 != 25) {
            x74VarA.e(fifVar, 0, j3);
        }
        if (x74VarA.B()) {
            x74VarA.e(fifVar, 1, j5);
        } else {
            ghb ghbVar = ew5.b;
            if (j5 != ew5.g(qe7.O(15, lw5.SECONDS))) {
                x74VarA.e(fifVar, 1, j5);
            }
        }
        if (x74VarA.B()) {
            x74VarA.e(fifVar, 2, j4);
        } else {
            ghb ghbVar2 = ew5.b;
            if (j4 != ew5.g(qe7.O(3, lw5.DAYS))) {
                x74VarA.e(fifVar, 2, j4);
            }
        }
        boolean zB = x74VarA.B();
        lw5 lw5Var = lw5.MILLISECONDS;
        if (zB) {
            x74VarA.i(fifVar, 3, iw5.a, new ew5(j2));
        } else {
            ghb ghbVar3 = ew5.b;
            if (!ew5.f(j2, qe7.P(j5, lw5Var))) {
                x74VarA.i(fifVar, 3, iw5.a, new ew5(j2));
            }
        }
        if (x74VarA.B() || !ew5.f(j, qe7.P(j4, lw5Var))) {
            x74VarA.i(fifVar, 4, iw5.a, new ew5(j));
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        iw5 iw5Var = iw5.a;
        return new aw8[]{ti9Var, ti9Var, ti9Var, iw5Var, iw5Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        ew5 ew5Var = null;
        ew5 ew5Var2 = null;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                jQ = v74VarA.q(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                jQ2 = v74VarA.q(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                jQ3 = v74VarA.q(fifVar, 2);
                i |= 4;
            } else if (iV == 3) {
                ew5Var2 = (ew5) v74VarA.x(fifVar, 3, iw5.a, ew5Var2);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                ew5Var = (ew5) v74VarA.x(fifVar, 4, iw5.a, ew5Var);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new hrc(i, jQ, jQ2, jQ3, ew5Var2, ew5Var);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
