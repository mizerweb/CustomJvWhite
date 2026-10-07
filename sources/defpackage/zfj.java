package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zfj implements oj7 {
    public static final zfj a;
    private static final fif descriptor;

    static {
        zfj zfjVar = new zfj();
        a = zfjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUnavailableResponse", zfjVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k("available", false);
        t4dVar.k(ApiProtocol.PARAM_DEVICE_ID, false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        bgj bgjVar = (bgj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, bgjVar.a);
        x74VarA.h(fifVar, 1, bgjVar.b);
        x74VarA.n(fifVar, 2, bgjVar.c);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, b01.a, n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        String strH = null;
        String strH2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                zC = v74VarA.C(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                strH2 = v74VarA.h(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new bgj(strH, i, strH2, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
