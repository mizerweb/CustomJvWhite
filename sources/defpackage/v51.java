package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v51 implements oj7 {
    public static final v51 a;
    private static final fif descriptor;

    static {
        v51 v51Var = new v51();
        a = v51Var;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.BusinessStatusConfig", v51Var, 2);
        t4dVar.k("enabled", true);
        t4dVar.k("durationMs", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        x51 x51Var = (x51) obj;
        long j = x51Var.b;
        boolean z = x51Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 0, z);
        }
        if (x74VarA.B() || j != 5000) {
            x74VarA.e(fifVar, 1, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{b01.a, ti9.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        long jQ = 0;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                jQ = v74VarA.q(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new x51(i, jQ, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
