package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kij implements oj7 {
    public static final kij a;
    private static final fif descriptor;

    static {
        kij kijVar = new kij();
        a = kijVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.launchcontext.WebAppGetLaunchContextResponse", kijVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("entryPoint", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        mij mijVar = (mij) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, mijVar.a);
        x74VarA.n(fifVar, 1, mijVar.b);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        String strH2 = null;
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
                strH2 = v74VarA.h(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new mij(i, strH, strH2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
