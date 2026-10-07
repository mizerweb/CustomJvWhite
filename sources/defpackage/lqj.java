package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lqj implements oj7 {
    public static final lqj a;
    private static final fif descriptor;

    static {
        lqj lqjVar = new lqj();
        a = lqjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.share.WebAppShareResponse", lqjVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("status", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        nqj nqjVar = (nqj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = nqj.c;
        x74VarA.n(fifVar, 0, nqjVar.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), nqjVar.b);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, nqj.c[1].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = nqj.c;
        boolean z = true;
        int i = 0;
        String strH = null;
        pqj pqjVar = null;
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
                pqjVar = (pqj) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), pqjVar);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new nqj(i, strH, pqjVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
