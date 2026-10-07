package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e6a implements oj7 {
    public static final e6a a;
    private static final fif descriptor;

    static {
        e6a e6aVar = new e6a();
        a = e6aVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.MediaTransformModel.EncoderConfig", e6aVar, 3);
        t4dVar.k("low", true);
        t4dVar.k("avg", true);
        t4dVar.k("high", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        g6a g6aVar = (g6a) obj;
        int i = g6aVar.c;
        int i2 = g6aVar.b;
        int i3 = g6aVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i3 != 1) {
            x74VarA.y(0, i3, fifVar);
        }
        if (x74VarA.B() || i2 != -1) {
            x74VarA.y(1, i2, fifVar);
        }
        if (x74VarA.B() || i != -1) {
            x74VarA.y(2, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var, ij8Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                iL = v74VarA.l(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                iL2 = v74VarA.l(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                iL3 = v74VarA.l(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new g6a(i, iL, iL2, iL3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
