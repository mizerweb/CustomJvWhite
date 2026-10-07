package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sji implements oj7 {
    public static final sji a;
    private static final fif descriptor;

    static {
        sji sjiVar = new sji();
        a = sjiVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.UploadVideoConfig.ConnectionBasedValues", sjiVar, 4);
        t4dVar.k("enabled", true);
        t4dVar.k("parallelism", true);
        t4dVar.k("parallel_header_off", true);
        t4dVar.k("chunk_size", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        uji ujiVar = (uji) obj;
        long j = ujiVar.d;
        boolean z = ujiVar.c;
        int i = ujiVar.b;
        boolean z2 = ujiVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || z2) {
            x74VarA.h(fifVar, 0, z2);
        }
        if (x74VarA.B() || i != 1) {
            x74VarA.y(1, i, fifVar);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 2, z);
        }
        if (x74VarA.B() || j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 3, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, ij8.a, b01Var, ti9.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        int iL = 0;
        boolean zC = false;
        boolean zC2 = false;
        long jQ = 0;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                iL = v74VarA.l(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                zC2 = v74VarA.C(fifVar, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                jQ = v74VarA.q(fifVar, 3);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new uji(i, iL, jQ, zC, zC2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
