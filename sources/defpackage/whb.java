package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class whb implements oj7 {
    public static final whb a;
    private static final fif descriptor;

    static {
        whb whbVar = new whb();
        a = whbVar;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.NoiseSuppressorConfig", whbVar, 3);
        t4dVar.k(MLFeatureConfigProviderBase.ENABLED_KEY, true);
        t4dVar.k("ver", true);
        t4dVar.k("label", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        yhb yhbVar = (yhb) obj;
        String str = yhbVar.c;
        Integer num = yhbVar.b;
        Boolean bool = yhbVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || bool != null) {
            x74VarA.o(fifVar, 0, b01.a, bool);
        }
        if (x74VarA.B() || num != null) {
            x74VarA.o(fifVar, 1, ij8.a, num);
        }
        if (x74VarA.B() || str != null) {
            x74VarA.o(fifVar, 2, n5h.a, str);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{lvb.o0(b01.a), lvb.o0(ij8.a), lvb.o0(n5h.a)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        String str = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                bool = (Boolean) v74VarA.n(fifVar, 0, b01.a, bool);
                i |= 1;
            } else if (iV == 1) {
                num = (Integer) v74VarA.n(fifVar, 1, ij8.a, num);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                str = (String) v74VarA.n(fifVar, 2, n5h.a, str);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new yhb(i, bool, num, str);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
