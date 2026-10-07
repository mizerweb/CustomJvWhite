package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qtg implements oj7 {
    public static final qtg a;
    private static final fif descriptor;

    static {
        qtg qtgVar = new qtg();
        a = qtgVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.StoriesVideoGenerationSettings", qtgVar, 5);
        t4dVar.k("fps", true);
        t4dVar.k("bitrate", true);
        t4dVar.k("quality", true);
        t4dVar.k("chunk-duration-ms", true);
        t4dVar.k("max-chunks", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        stg stgVar = (stg) obj;
        int i = stgVar.e;
        long j = stgVar.d;
        int i2 = stgVar.c;
        int i3 = stgVar.b;
        int i4 = stgVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i4 != 60) {
            x74VarA.y(0, i4, fifVar);
        }
        if (x74VarA.B() || i3 != 3000) {
            x74VarA.y(1, i3, fifVar);
        }
        if (x74VarA.B() || i2 != 1080) {
            x74VarA.y(2, i2, fifVar);
        }
        if (x74VarA.B() || j != 60000) {
            x74VarA.e(fifVar, 3, j);
        }
        if (x74VarA.B() || i != 3) {
            x74VarA.y(4, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var, ij8Var, ti9.a, ij8Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        long jQ = 0;
        boolean z = true;
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
                jQ = v74VarA.q(fifVar, 3);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                iL4 = v74VarA.l(fifVar, 4);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new stg(i, iL, iL2, iL3, jQ, iL4);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
