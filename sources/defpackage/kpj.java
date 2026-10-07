package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kpj implements oj7 {
    public static final kpj a;
    private static final fif descriptor;

    static {
        kpj kpjVar = new kpj();
        a = kpjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupScreenCaptureBehaviorRequest", kpjVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("isScreenCaptureEnabled", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        mpj mpjVar = (mpj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, mpjVar.a);
        x74VarA.h(fifVar, 1, mpjVar.b);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, b01.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        String strH = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                zC = v74VarA.C(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new mpj(strH, i, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
