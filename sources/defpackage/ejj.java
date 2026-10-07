package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ejj implements oj7 {
    public static final ejj a;
    private static final fif descriptor;

    static {
        ejj ejjVar = new ejj();
        a = ejjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackNotification", ejjVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k("notificationType", false);
        t4dVar.k("disableVibrationFallback", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        gjj gjjVar = (gjj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = gjj.d;
        x74VarA.n(fifVar, 0, gjjVar.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), gjjVar.b);
        x74VarA.h(fifVar, 2, gjjVar.c);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, gjj.d[1].getValue(), b01.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = gjj.d;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        String strH = null;
        lnb lnbVar = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                lnbVar = (lnb) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), lnbVar);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                zC = v74VarA.C(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new gjj(i, strH, lnbVar, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
