package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k8h implements oj7 {
    public static final k8h a;
    private static final fif descriptor;

    static {
        k8h k8hVar = new k8h();
        a = k8hVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.SuccessResponse", k8hVar, 2);
        t4dVar.k("status", false);
        t4dVar.k("requestId", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        o8h o8hVar = (o8h) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        aw8 aw8Var = (aw8) o8h.c[0].getValue();
        n8h n8hVar = o8hVar.a;
        String str = o8hVar.b;
        x74VarA.i(fifVar, 0, aw8Var, n8hVar);
        if (x74VarA.B() || str != null) {
            x74VarA.o(fifVar, 1, n5h.a, str);
        }
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{o8h.c[0].getValue(), lvb.o0(n5h.a)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = o8h.c;
        boolean z = true;
        int i = 0;
        n8h n8hVar = null;
        String str = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                n8hVar = (n8h) v74VarA.x(fifVar, 0, (aw8) ny8VarArr[0].getValue(), n8hVar);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                str = (String) v74VarA.n(fifVar, 1, n5h.a, str);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new o8h(i, n8hVar, str);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
