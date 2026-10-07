package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hjj implements oj7 {
    public static final hjj a;
    private static final fif descriptor;

    static {
        hjj hjjVar = new hjj();
        a = hjjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackResponse", hjjVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("status", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        jjj jjjVar = (jjj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = jjj.c;
        x74VarA.n(fifVar, 0, jjjVar.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), jjjVar.b);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, jjj.c[1].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = jjj.c;
        boolean z = true;
        int i = 0;
        String strH = null;
        ojj ojjVar = null;
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
                ojjVar = (ojj) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), ojjVar);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new jjj(i, strH, ojjVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
