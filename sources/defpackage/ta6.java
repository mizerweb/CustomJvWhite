package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ta6 implements oj7 {
    public static final ta6 a;
    private static final fif descriptor;

    static {
        ta6 ta6Var = new ta6();
        a = ta6Var;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.ErrorResponse", ta6Var, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("error", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        ya6 ya6Var = (ya6) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, ya6Var.a);
        x74VarA.i(fifVar, 1, va6.a, ya6Var.b);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, va6.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        xa6 xa6Var = null;
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
                xa6Var = (xa6) v74VarA.x(fifVar, 1, va6.a, xa6Var);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new ya6(i, strH, xa6Var);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
