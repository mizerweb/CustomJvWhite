package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tdj implements oj7 {
    public static final tdj a;
    private static final fif descriptor;

    static {
        tdj tdjVar = new tdj();
        a = tdjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthResponse", tdjVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k(ApiProtocol.KEY_TOKEN, false);
        t4dVar.k("status", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vdj vdjVar = (vdj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = vdj.d;
        x74VarA.n(fifVar, 0, vdjVar.a);
        x74VarA.n(fifVar, 1, vdjVar.b);
        x74VarA.i(fifVar, 2, (aw8) ny8VarArr[2].getValue(), vdjVar.c);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = vdj.d;
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, n5hVar, ny8VarArr[2].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = vdj.d;
        boolean z = true;
        int i = 0;
        String strH = null;
        String strH2 = null;
        n8h n8hVar = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                strH2 = v74VarA.h(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                n8hVar = (n8h) v74VarA.x(fifVar, 2, (aw8) ny8VarArr[2].getValue(), n8hVar);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new vdj(i, strH, strH2, n8hVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
