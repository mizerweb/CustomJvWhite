package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w63 implements oj7 {
    public static final w63 a;
    private static final fif descriptor;

    static {
        w63 w63Var = new w63();
        a = w63Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.calls.ChatMembersLoadConfig", w63Var, 2);
        t4dVar.k("max-load-count", true);
        t4dVar.k("min-in-call", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        y63 y63Var = (y63) obj;
        int i = y63Var.b;
        int i2 = y63Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i2 != 0) {
            x74VarA.y(0, i2, fifVar);
        }
        if (x74VarA.B() || i != 0) {
            x74VarA.y(1, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                iL = v74VarA.l(fifVar, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                iL2 = v74VarA.l(fifVar, 1);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new y63(i, iL, iL2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
