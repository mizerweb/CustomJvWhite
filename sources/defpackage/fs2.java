package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fs2 implements oj7 {
    public static final fs2 a;
    private static final fif descriptor;

    static {
        fs2 fs2Var = new fs2();
        a = fs2Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.ChannelViewConfig", fs2Var, 4);
        t4dVar.k("enabled", true);
        t4dVar.k("listener_fix", true);
        t4dVar.k("threshold", true);
        t4dVar.k("view_time_ms", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        hs2 hs2Var = (hs2) obj;
        long j = hs2Var.d;
        float f = hs2Var.c;
        boolean z = hs2Var.b;
        boolean z2 = hs2Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        gs2 gs2Var = hs2.Companion;
        if (x74VarA.B() || !z2) {
            x74VarA.h(fifVar, 0, z2);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 1, z);
        }
        if (x74VarA.B() || Float.compare(f, 0.3f) != 0) {
            x74VarA.D(fifVar, 2, f);
        }
        if (x74VarA.B() || !ew5.f(j, 0L)) {
            x74VarA.i(fifVar, 3, fw5.a, new ew5(j));
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, b01Var, sx6.a, fw5.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        float fU = 0.0f;
        ew5 ew5Var = null;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                zC2 = v74VarA.C(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                fU = v74VarA.u(fifVar, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                ew5Var = (ew5) v74VarA.x(fifVar, 3, fw5.a, ew5Var);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new hs2(i, zC, zC2, fU, ew5Var);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
