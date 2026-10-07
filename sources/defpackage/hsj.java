package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsj implements oj7 {
    public static final hsj a;
    private static final fif descriptor;

    static {
        hsj hsjVar = new hsj();
        a = hsjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.private.WebAppVerifyMobileIdResponse", hsjVar, 4);
        t4dVar.k("requestId", false);
        t4dVar.k("statusCode", false);
        t4dVar.k("headers", false);
        t4dVar.k("data", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        jsj jsjVar = (jsj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = jsj.e;
        x74VarA.n(fifVar, 0, jsjVar.a);
        x74VarA.y(1, jsjVar.b, fifVar);
        x74VarA.i(fifVar, 2, (aw8) ny8VarArr[2].getValue(), jsjVar.c);
        x74VarA.n(fifVar, 3, jsjVar.d);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = jsj.e;
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, ij8.a, ny8VarArr[2].getValue(), n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = jsj.e;
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strH = null;
        Map map = null;
        String strH2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                iL = v74VarA.l(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                map = (Map) v74VarA.x(fifVar, 2, (aw8) ny8VarArr[2].getValue(), map);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                strH2 = v74VarA.h(fifVar, 3);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new jsj(i, strH, iL, map, strH2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
