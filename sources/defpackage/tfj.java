package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tfj implements oj7 {
    public static final tfj a;
    private static final fif descriptor;

    static {
        tfj tfjVar = new tfj();
        a = tfjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryOpenSettingsRequest", tfjVar, 2);
        t4dVar.k("queryId", false);
        t4dVar.k("requestId", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vfj vfjVar = (vfj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.o(fifVar, 0, n5h.a, vfjVar.a);
        x74VarA.n(fifVar, 1, vfjVar.b);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{lvb.o0(n5hVar), n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String strH = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                str = (String) v74VarA.n(fifVar, 0, n5h.a, str);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                strH = v74VarA.h(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new vfj(i, str, strH);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
