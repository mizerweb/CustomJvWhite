package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y72 implements oj7 {
    public static final y72 a;
    private static final fif descriptor;

    static {
        y72 y72Var = new y72();
        a = y72Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.CallsAudioFormatConfig", y72Var, 2);
        t4dVar.k(MLFeatureConfigProviderBase.ENABLED_KEY, true);
        t4dVar.k("report", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        a82 a82Var = (a82) obj;
        boolean z = a82Var.b;
        boolean z2 = a82Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z2) {
            x74VarA.h(fifVar, 0, z2);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 1, z);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, b01Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
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
                zC2 = v74VarA.C(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new a82(i, zC, zC2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
