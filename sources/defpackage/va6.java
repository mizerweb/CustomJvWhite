package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class va6 implements oj7 {
    public static final va6 a;
    private static final fif descriptor;

    static {
        va6 va6Var = new va6();
        a = va6Var;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.ErrorResponse.Error", va6Var, 1);
        t4dVar.k("code", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, ((xa6) obj).a);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else {
                if (iV != 0) {
                    qr7.e(iV);
                    return null;
                }
                strH = v74VarA.h(fifVar, 0);
                i = 1;
            }
        }
        v74VarA.j(fifVar);
        return new xa6(i, strH);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
