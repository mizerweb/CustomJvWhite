package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ndj implements oj7 {
    public static final ndj a;
    private static final fif descriptor;

    static {
        ndj ndjVar = new ndj();
        a = ndjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAccessRequest", ndjVar, 3);
        t4dVar.k("queryId", false);
        t4dVar.k("requestId", false);
        t4dVar.k("reason", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        pdj pdjVar = (pdj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        n5h n5hVar = n5h.a;
        String str = pdjVar.a;
        String str2 = pdjVar.c;
        x74VarA.o(fifVar, 0, n5hVar, str);
        x74VarA.n(fifVar, 1, pdjVar.b);
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 2, n5hVar, str2);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{lvb.o0(n5hVar), n5hVar, lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String strH = null;
        String str2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                str = (String) v74VarA.n(fifVar, 0, n5h.a, str);
                i |= 1;
            } else if (iV == 1) {
                strH = v74VarA.h(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                str2 = (String) v74VarA.n(fifVar, 2, n5h.a, str2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new pdj(i, str, strH, str2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
