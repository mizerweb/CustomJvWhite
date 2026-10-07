package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlj implements oj7 {
    public static final hlj a;
    private static final fif descriptor;

    static {
        hlj hljVar = new hlj();
        a = hljVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.nfc.WebAppNfcInfoResponse", hljVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k("available", false);
        t4dVar.k("enabled", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        jlj jljVar = (jlj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, jljVar.a);
        x74VarA.h(fifVar, 1, jljVar.b);
        x74VarA.h(fifVar, 2, jljVar.c);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{n5h.a, b01Var, b01Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        String strH = null;
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
                zC2 = v74VarA.C(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new jlj(i, strH, zC, zC2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
