package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zqj implements oj7 {
    public static final zqj a;
    private static final fif descriptor;

    static {
        zqj zqjVar = new zqj();
        a = zqjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyRequest", zqjVar, 3);
        t4dVar.k("queryId", false);
        t4dVar.k("requestId", false);
        t4dVar.k("key", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        brj brjVar = (brj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.o(fifVar, 0, n5h.a, brjVar.a);
        x74VarA.n(fifVar, 1, brjVar.b);
        x74VarA.n(fifVar, 2, brjVar.c);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{lvb.o0(n5hVar), n5hVar, n5hVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String strH = null;
        String strH2 = null;
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
                strH2 = v74VarA.h(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new brj(i, str, strH, strH2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
