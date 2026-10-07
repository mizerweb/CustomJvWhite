package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gqj implements oj7 {
    public static final gqj a;
    private static final fif descriptor;

    static {
        gqj gqjVar = new gqj();
        a = gqjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.WebAppShareRequest", gqjVar, 3);
        t4dVar.k(MLFeatureConfigProviderBase.URL_KEY, true);
        t4dVar.k("title", true);
        t4dVar.k("text", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        kqj kqjVar = (kqj) obj;
        String str = kqjVar.c;
        String str2 = kqjVar.b;
        String str3 = kqjVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || str3 != null) {
            x74VarA.o(fifVar, 0, n5h.a, str3);
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
        n5h n5hVar = n5h.a;
        return new aw8[]{lvb.o0(n5hVar), lvb.o0(n5hVar), lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                str = (String) v74VarA.n(fifVar, 0, n5h.a, str);
                i |= 1;
            } else if (iV == 1) {
                str2 = (String) v74VarA.n(fifVar, 1, n5h.a, str2);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                str3 = (String) v74VarA.n(fifVar, 2, n5h.a, str3);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new kqj(i, str, str2, str3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
