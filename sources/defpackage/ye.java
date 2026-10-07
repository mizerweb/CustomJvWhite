package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ye implements oj7 {
    public static final ye a;
    private static final fif descriptor;

    static {
        ye yeVar = new ye();
        a = yeVar;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.AiBweConfig", yeVar, 3);
        t4dVar.k(MLFeatureConfigProviderBase.ENABLED_KEY, true);
        t4dVar.k("config", true);
        t4dVar.k("label", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        af afVar = (af) obj;
        String str = afVar.c;
        String str2 = afVar.b;
        Boolean bool = afVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || bool != null) {
            x74VarA.o(fifVar, 0, b01.a, bool);
        }
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 1, n5h.a, str2);
        }
        if (x74VarA.B() || str != null) {
            x74VarA.o(fifVar, 2, n5h.a, str);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        aw8 aw8VarO0 = lvb.o0(b01.a);
        n5h n5hVar = n5h.a;
        return new aw8[]{aw8VarO0, lvb.o0(n5hVar), lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                bool = (Boolean) v74VarA.n(fifVar, 0, b01.a, bool);
                i |= 1;
            } else if (iV == 1) {
                str = (String) v74VarA.n(fifVar, 1, n5h.a, str);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                str2 = (String) v74VarA.n(fifVar, 2, n5h.a, str2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new af(i, bool, str, str2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
