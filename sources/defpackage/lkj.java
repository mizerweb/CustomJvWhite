package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lkj implements oj7 {
    public static final lkj a;
    private static final fif descriptor;

    static {
        lkj lkjVar = new lkj();
        a = lkjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.share.WebAppMaxShareResponse", lkjVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("status", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        nkj nkjVar = (nkj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = nkj.c;
        x74VarA.n(fifVar, 0, nkjVar.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), nkjVar.b);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, nkj.c[1].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = nkj.c;
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
        return new nkj(i, strH, pqjVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
