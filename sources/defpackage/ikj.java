package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ikj implements oj7 {
    public static final ikj a;
    private static final fif descriptor;

    static {
        ikj ikjVar = new ikj();
        a = ikjVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.share.WebAppMaxShareRequest", ikjVar, 5);
        t4dVar.k("requestId", false);
        t4dVar.k("text", true);
        t4dVar.k("link", true);
        t4dVar.k("messageId", true);
        t4dVar.k(ApiProtocol.PARAM_CHAT_ID, true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        kkj kkjVar = (kkj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        String str = kkjVar.a;
        String str2 = kkjVar.e;
        String str3 = kkjVar.d;
        String str4 = kkjVar.c;
        String str5 = kkjVar.b;
        x74VarA.n(fifVar, 0, str);
        if (x74VarA.B() || str5 != null) {
            x74VarA.o(fifVar, 1, n5h.a, str5);
        }
        if (x74VarA.B() || str4 != null) {
            x74VarA.o(fifVar, 2, n5h.a, str4);
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
        return new aw8[]{n5hVar, lvb.o0(n5hVar), lvb.o0(n5hVar), lvb.o0(n5hVar), lvb.o0(n5hVar)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                str = (String) v74VarA.n(fifVar, 1, n5h.a, str);
                i |= 2;
            } else if (iV == 2) {
                str2 = (String) v74VarA.n(fifVar, 2, n5h.a, str2);
                i |= 4;
            } else if (iV == 3) {
                str3 = (String) v74VarA.n(fifVar, 3, n5h.a, str3);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                str4 = (String) v74VarA.n(fifVar, 4, n5h.a, str4);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new kkj(strH, str, i, str2, str3, str4);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
