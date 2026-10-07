package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ulj implements oj7 {
    public static final ulj a;
    private static final fif descriptor;

    static {
        ulj uljVar = new ulj();
        a = uljVar;
        t4d t4dVar = new t4d("one.me.webapp.domain.jsbridge.delegates.codereader.WebAppOpenCodeReaderRequest", uljVar, 2);
        t4dVar.k("requestId", false);
        t4dVar.k("fileSelect", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        wlj wljVar = (wlj) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        x74VarA.n(fifVar, 0, wljVar.a);
        x74VarA.o(fifVar, 1, b01.a, wljVar.b);
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{n5h.a, lvb.o0(b01.a)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        String strH = null;
        Boolean bool = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strH = v74VarA.h(fifVar, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    qr7.e(iV);
                    return null;
                }
                bool = (Boolean) v74VarA.n(fifVar, 1, b01.a, bool);
                i |= 2;
            }
        }
        v74VarA.j(fifVar);
        return new wlj(i, strH, bool);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
