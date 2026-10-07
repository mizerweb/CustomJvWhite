package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class efj implements oj7 {
    public static final efj a;
    private static final fif descriptor;

    static {
        efj efjVar = new efj();
        a = efjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryInfoResponse", efjVar, 7);
        t4dVar.k("requestId", false);
        t4dVar.k("available", false);
        t4dVar.k("type", false);
        t4dVar.k("accessRequested", false);
        t4dVar.k("accessGranted", false);
        t4dVar.k("tokenSaved", false);
        t4dVar.k(ApiProtocol.PARAM_DEVICE_ID, false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        gfj gfjVar = (gfj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = gfj.h;
        x74VarA.n(fifVar, 0, gfjVar.a);
        x74VarA.h(fifVar, 1, gfjVar.b);
        x74VarA.i(fifVar, 2, (aw8) ny8VarArr[2].getValue(), gfjVar.c);
        x74VarA.h(fifVar, 3, gfjVar.d);
        x74VarA.h(fifVar, 4, gfjVar.e);
        x74VarA.h(fifVar, 5, gfjVar.f);
        x74VarA.n(fifVar, 6, gfjVar.g);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = gfj.h;
        n5h n5hVar = n5h.a;
        b01 b01Var = b01.a;
        return new aw8[]{n5hVar, b01Var, ny8VarArr[2].getValue(), b01Var, b01Var, b01Var, n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = gfj.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        boolean zC4 = false;
        String strH = null;
        List list = null;
        String strH2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strH = v74VarA.h(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    zC = v74VarA.C(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) v74VarA.x(fifVar, 2, (aw8) ny8VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    zC2 = v74VarA.C(fifVar, 3);
                    i |= 8;
                    continue;
                case 4:
                    zC3 = v74VarA.C(fifVar, 4);
                    i |= 16;
                    continue;
                case 5:
                    zC4 = v74VarA.C(fifVar, 5);
                    i |= 32;
                    continue;
                case 6:
                    strH2 = v74VarA.h(fifVar, 6);
                    i |= 64;
                    continue;
                default:
                    qr7.e(iV);
                    return obj;
            }
            obj = null;
        }
        v74VarA.j(fifVar);
        return new gfj(i, strH, zC, list, zC2, zC3, zC4, strH2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
