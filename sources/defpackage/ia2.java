package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ia2 implements oj7 {
    public static final ia2 a;
    private static final fif descriptor;

    static {
        ia2 ia2Var = new ia2();
        a = ia2Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.CallsSignalingTimeouts", ia2Var, 5);
        t4dVar.k(MLFeatureConfigProviderBase.ENABLED_KEY, true);
        t4dVar.k("cto", true);
        t4dVar.k("ird", true);
        t4dVar.k("rdsf", true);
        t4dVar.k("mrd", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        ka2 ka2Var = (ka2) obj;
        long j = ka2Var.e;
        float f = ka2Var.d;
        long j2 = ka2Var.c;
        long j3 = ka2Var.b;
        boolean z = ka2Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 0, z);
        }
        if (x74VarA.B() || j3 != 5000) {
            x74VarA.e(fifVar, 1, j3);
        }
        if (x74VarA.B() || j2 != 2000) {
            x74VarA.e(fifVar, 2, j2);
        }
        if (x74VarA.B() || Float.compare(f, 1.0f) != 0) {
            x74VarA.D(fifVar, 3, f);
        }
        if (x74VarA.B() || j != 2000) {
            x74VarA.e(fifVar, 4, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{b01.a, ti9Var, ti9Var, sx6.a, ti9Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        boolean zC = false;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        float fU = 0.0f;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                jQ = v74VarA.q(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                jQ2 = v74VarA.q(fifVar, 2);
                i |= 4;
            } else if (iV == 3) {
                fU = v74VarA.u(fifVar, 3);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                jQ3 = v74VarA.q(fifVar, 4);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new ka2(i, zC, jQ, jQ2, fU, jQ3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
