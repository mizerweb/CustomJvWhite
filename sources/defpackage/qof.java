package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qof implements oj7 {
    public static final qof a;
    private static final fif descriptor;

    static {
        qof qofVar = new qof();
        a = qofVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.settings.SettingEntryBanner", qofVar, 5);
        t4dVar.k("icon", false);
        t4dVar.k("title", false);
        t4dVar.k("appid", true);
        t4dVar.k(MLFeatureConfigProviderBase.URL_KEY, true);
        t4dVar.k("startParam", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        sof sofVar = (sof) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        String str = sofVar.a;
        String str2 = sofVar.e;
        String str3 = sofVar.d;
        Long l = sofVar.c;
        x74VarA.n(fifVar, 0, str);
        x74VarA.n(fifVar, 1, sofVar.b);
        if (x74VarA.B() || l != null) {
            x74VarA.o(fifVar, 2, ti9.a, l);
        }
        if (x74VarA.B() || str3 != null) {
            x74VarA.o(fifVar, 3, n5h.a, str3);
        }
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 4, n5h.a, str2);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{n5hVar, n5hVar, lvb.o0(ti9.a), lvb.o0(n5hVar), lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        String strH2 = null;
        Long l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                strH2 = v74VarA.h(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                l = (Long) v74VarA.n(fifVar, 2, ti9.a, l);
                i |= 4;
            } else if (iV == 3) {
                str = (String) v74VarA.n(fifVar, 3, n5h.a, str);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                str2 = (String) v74VarA.n(fifVar, 4, n5h.a, str2);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new sof(i, strH, strH2, l, str, str2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
