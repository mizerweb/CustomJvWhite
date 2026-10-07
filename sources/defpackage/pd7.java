package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pd7 implements oj7 {
    public static final pd7 a;
    private static final fif descriptor;

    static {
        pd7 pd7Var = new pd7();
        a = pd7Var;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.media.FreeSpaceThreshold", pd7Var, 2);
        t4dVar.k("crit", true);
        t4dVar.k("dangerous", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        rd7 rd7Var = (rd7) obj;
        long j = rd7Var.b;
        long j2 = rd7Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || j2 != 20971520) {
            x74VarA.e(fifVar, 0, j2);
        }
        if (x74VarA.B() || j != 524288000) {
            x74VarA.e(fifVar, 1, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        long jQ = 0;
        long jQ2 = 0;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                jQ = v74VarA.q(fifVar, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                jQ2 = v74VarA.q(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new rd7(i, jQ, jQ2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
