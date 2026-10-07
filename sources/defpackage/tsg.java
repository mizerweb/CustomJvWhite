package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tsg implements oj7 {
    public static final tsg a;
    private static final fif descriptor;

    static {
        tsg tsgVar = new tsg();
        a = tsgVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.StoriesPhotoSettings", tsgVar, 5);
        t4dVar.k("output-width", true);
        t4dVar.k("output-height", true);
        t4dVar.k("fallback-width", true);
        t4dVar.k("fallback-height", true);
        t4dVar.k("max-preview-size", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vsg vsgVar = (vsg) obj;
        int i = vsgVar.e;
        int i2 = vsgVar.d;
        int i3 = vsgVar.c;
        int i4 = vsgVar.b;
        int i5 = vsgVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i5 != 1080) {
            x74VarA.y(0, i5, fifVar);
        }
        if (x74VarA.B() || i4 != 1920) {
            x74VarA.y(1, i4, fifVar);
        }
        if (x74VarA.B() || i3 != 720) {
            x74VarA.y(2, i3, fifVar);
        }
        if (x74VarA.B() || i2 != 1280) {
            x74VarA.y(3, i2, fifVar);
        }
        if (x74VarA.B() || i != 1080) {
            x74VarA.y(4, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var, ij8Var, ij8Var, ij8Var};
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
        int iL4 = 0;
        int iL5 = 0;
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
            } else if (iV == 2) {
                iL3 = v74VarA.l(fifVar, 2);
                i |= 4;
            } else if (iV == 3) {
                iL4 = v74VarA.l(fifVar, 3);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                iL5 = v74VarA.l(fifVar, 4);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new vsg(i, iL, iL2, iL3, iL4, iL5);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
