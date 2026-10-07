package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class phc implements oj7 {
    public static final phc a;
    private static final fif descriptor;

    static {
        phc phcVar = new phc();
        a = phcVar;
        t4d t4dVar = new t4d("one.me.sdk.api.commands.organization.OrgLink", phcVar, 4);
        t4dVar.k("placement", false);
        t4dVar.k(MLFeatureConfigProviderBase.URL_KEY, true);
        t4dVar.k("appId", true);
        t4dVar.k("startParam", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        rhc rhcVar = (rhc) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        vhc vhcVar = vhc.a;
        uhc uhcVar = rhcVar.a;
        String str = rhcVar.d;
        Long l = rhcVar.c;
        String str2 = rhcVar.b;
        x74VarA.i(fifVar, 0, vhcVar, uhcVar);
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 1, n5h.a, str2);
        }
        if (x74VarA.B() || l != null) {
            x74VarA.o(fifVar, 2, ti9.a, l);
        }
        if (x74VarA.B() || str != null) {
            x74VarA.o(fifVar, 3, n5h.a, str);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        n5h n5hVar = n5h.a;
        return new aw8[]{vhc.a, lvb.o0(n5hVar), lvb.o0(ti9.a), lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        uhc uhcVar = null;
        String str = null;
        Long l = null;
        String str2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                uhcVar = (uhc) v74VarA.x(fifVar, 0, vhc.a, uhcVar);
                i |= 1;
            } else if (iV == 1) {
                str = (String) v74VarA.n(fifVar, 1, n5h.a, str);
                i |= 2;
            } else if (iV == 2) {
                l = (Long) v74VarA.n(fifVar, 2, ti9.a, l);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                str2 = (String) v74VarA.n(fifVar, 3, n5h.a, str2);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new rhc(i, uhcVar, str, l, str2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
