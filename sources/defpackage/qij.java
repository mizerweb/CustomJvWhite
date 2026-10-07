package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qij implements oj7 {
    public static final qij a;
    private static final fif descriptor;

    static {
        qij qijVar = new qij();
        a = qijVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.viewport.WebAppGetViewPortSizeResponse", qijVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k("height", false);
        t4dVar.k("width", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        sij sijVar = (sij) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, sijVar.a);
        x74VarA.n(fifVar, 1, sijVar.b);
        x74VarA.n(fifVar, 2, sijVar.c);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, n5hVar, n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
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
                strH3 = v74VarA.h(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new sij(i, strH, strH2, strH3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
