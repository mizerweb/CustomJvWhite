package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hpj implements oj7 {
    public static final hpj a;
    private static final fif descriptor;

    static {
        hpj hpjVar = new hpj();
        a = hpjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupClosingBehaviorRequest", hpjVar, 1);
        t4dVar.k("needConfirmation", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.h(fifVar, 0, ((jpj) obj).a);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{b01.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else {
                if (iV != 0) {
                    qr7.e(iV);
                    return null;
                }
                zC = v74VarA.C(fifVar, 0);
                i = 1;
            }
        }
        v74VarA.j(fifVar);
        return new jpj(i, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
