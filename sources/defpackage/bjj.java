package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bjj implements oj7 {
    public static final bjj a;
    private static final fif descriptor;

    static {
        bjj bjjVar = new bjj();
        a = bjjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackImpact", bjjVar, 3);
        t4dVar.k("requestId", false);
        t4dVar.k("impactStyle", false);
        t4dVar.k("disableVibrationFallback", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        djj djjVar = (djj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = djj.d;
        x74VarA.n(fifVar, 0, djjVar.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), djjVar.b);
        x74VarA.h(fifVar, 2, djjVar.c);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, djj.d[1].getValue(), b01.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = djj.d;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        String strH = null;
        aa8 aa8Var = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                aa8Var = (aa8) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), aa8Var);
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
        return new djj(i, strH, aa8Var, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
