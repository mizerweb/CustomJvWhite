package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mzd implements oj7 {
    public static final mzd a;
    private static final fif descriptor;

    static {
        mzd mzdVar = new mzd();
        a = mzdVar;
        t4d t4dVar = new t4d("one.me.sdk.push.PushToken", mzdVar, 3);
        t4dVar.k("type", false);
        t4dVar.k(ApiProtocol.KEY_TOKEN, false);
        t4dVar.k("pushOptions", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        ozd ozdVar = (ozd) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.i(fifVar, 0, (aw8) ozd.d[0].getValue(), ozdVar.a);
        x74VarA.n(fifVar, 1, ozdVar.b);
        x74VarA.o(fifVar, 2, dzd.a, ozdVar.c);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{ozd.d[0].getValue(), n5h.a, lvb.o0(dzd.a)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = ozd.d;
        boolean z = true;
        int i = 0;
        syd sydVar = null;
        String strH = null;
        fzd fzdVar = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                sydVar = (syd) v74VarA.x(fifVar, 0, (aw8) ny8VarArr[0].getValue(), sydVar);
                i |= 1;
            } else if (iV == 1) {
                strH = v74VarA.h(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                fzdVar = (fzd) v74VarA.n(fifVar, 2, dzd.a, fzdVar);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new ozd(i, sydVar, strH, fzdVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
