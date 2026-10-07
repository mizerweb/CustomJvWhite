package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jlh implements oj7 {
    public static final jlh a;
    private static final fif descriptor;

    static {
        jlh jlhVar = new jlh();
        a = jlhVar;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.TelecomConfig", jlhVar, 7);
        t4dVar.k("extended-states", true);
        t4dVar.k("remove-account", true);
        t4dVar.k("early-destroy", true);
        t4dVar.k("mask-number", true);
        t4dVar.k("masked-number", true);
        t4dVar.k("scheme", true);
        t4dVar.k("caller-name", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        llh llhVar = (llh) obj;
        boolean z = llhVar.g;
        String str = llhVar.f;
        String str2 = llhVar.e;
        boolean z2 = llhVar.d;
        boolean z3 = llhVar.c;
        boolean z4 = llhVar.b;
        boolean z5 = llhVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z5) {
            x74VarA.h(fifVar, 0, z5);
        }
        if (x74VarA.B() || z4) {
            x74VarA.h(fifVar, 1, z4);
        }
        if (x74VarA.B() || z3) {
            x74VarA.h(fifVar, 2, z3);
        }
        if (x74VarA.B() || z2) {
            x74VarA.h(fifVar, 3, z2);
        }
        if (x74VarA.B() || !cqk.d(str2, "***")) {
            x74VarA.n(fifVar, 4, str2);
        }
        if (x74VarA.B() || !cqk.d(str, "sip")) {
            x74VarA.n(fifVar, 5, str);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 6, z);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        n5h n5hVar = n5h.a;
        return new aw8[]{b01Var, b01Var, b01Var, b01Var, n5hVar, n5hVar, b01Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        boolean zC4 = false;
        boolean zC5 = false;
        String strH = null;
        String strH2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zC = v74VarA.C(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    zC2 = v74VarA.C(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    zC3 = v74VarA.C(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    zC4 = v74VarA.C(fifVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strH = v74VarA.h(fifVar, 4);
                    i |= 16;
                    break;
                case 5:
                    strH2 = v74VarA.h(fifVar, 5);
                    i |= 32;
                    break;
                case 6:
                    zC5 = v74VarA.C(fifVar, 6);
                    i |= 64;
                    break;
                default:
                    qr7.e(iV);
                    return null;
            }
        }
        v74VarA.j(fifVar);
        return new llh(i, zC, zC2, zC3, zC4, strH, strH2, zC5);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
