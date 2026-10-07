package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm0 implements oj7 {
    public static final tm0 a;
    private static final fif descriptor;

    static {
        tm0 tm0Var = new tm0();
        a = tm0Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.pms.BackgroundWakeConfig.Enabled", tm0Var, 4);
        t4dVar.k("bg_interval_minutes", false);
        t4dVar.k("suggestion_interval_minutes", false);
        t4dVar.k("fg_interval_seconds", false);
        t4dVar.k("suggestion_type", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vm0 vm0Var = (vm0) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        long j = vm0Var.b;
        int i = vm0Var.e;
        x74VarA.e(fifVar, 0, j);
        x74VarA.e(fifVar, 1, vm0Var.c);
        x74VarA.e(fifVar, 2, vm0Var.d);
        if (x74VarA.B() || i != 0) {
            x74VarA.y(3, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var, ti9Var, ij8.a};
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
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                iL = v74VarA.l(fifVar, 3);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new vm0(i, iL, jQ, jQ2, jQ3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
