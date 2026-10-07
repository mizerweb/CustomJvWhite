package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rgc implements oj7 {
    public static final rgc a;
    private static final fif descriptor;

    static {
        rgc rgcVar = new rgc();
        a = rgcVar;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.OpponentRegistrationTimeoutConfig", rgcVar, 3);
        t4dVar.k("recallToPhone", true);
        t4dVar.k("isOpponentNoNetwork", true);
        t4dVar.k("timeout", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        tgc tgcVar = (tgc) obj;
        int i = tgcVar.c;
        boolean z = tgcVar.b;
        boolean z2 = tgcVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z2) {
            x74VarA.h(fifVar, 0, z2);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 1, z);
        }
        if (x74VarA.B() || i != 0) {
            x74VarA.y(2, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, b01Var, ij8.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        int iL = 0;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                zC2 = v74VarA.C(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                iL = v74VarA.l(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new tgc(i, iL, zC, zC2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
