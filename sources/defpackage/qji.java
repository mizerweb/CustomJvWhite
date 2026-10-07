package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qji implements oj7 {
    public static final qji a;
    private static final fif descriptor;

    static {
        qji qjiVar = new qji();
        a = qjiVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.UploadVideoConfig", qjiVar, 4);
        t4dVar.k("enabled", true);
        t4dVar.k("wifi", true);
        t4dVar.k("4g", true);
        t4dVar.k("3g", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vji vjiVar = (vji) obj;
        uji ujiVar = vjiVar.d;
        uji ujiVar2 = vjiVar.c;
        uji ujiVar3 = vjiVar.b;
        boolean z = vjiVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 0, z);
        }
        if (x74VarA.B() || !cqk.d(ujiVar3, new uji())) {
            x74VarA.i(fifVar, 1, sji.a, ujiVar3);
        }
        if (x74VarA.B() || !cqk.d(ujiVar2, new uji())) {
            x74VarA.i(fifVar, 2, sji.a, ujiVar2);
        }
        if (x74VarA.B() || !cqk.d(ujiVar, new uji())) {
            x74VarA.i(fifVar, 3, sji.a, ujiVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        sji sjiVar = sji.a;
        return new aw8[]{b01.a, sjiVar, sjiVar, sjiVar};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        uji ujiVar = null;
        uji ujiVar2 = null;
        uji ujiVar3 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                ujiVar = (uji) v74VarA.x(fifVar, 1, sji.a, ujiVar);
                i |= 2;
            } else if (iV == 2) {
                ujiVar2 = (uji) v74VarA.x(fifVar, 2, sji.a, ujiVar2);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                ujiVar3 = (uji) v74VarA.x(fifVar, 3, sji.a, ujiVar3);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new vji(i, zC, ujiVar, ujiVar2, ujiVar3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
