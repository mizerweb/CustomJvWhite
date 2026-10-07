package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nad implements oj7 {
    public static final nad a;
    private static final fif descriptor;

    static {
        nad nadVar = new nad();
        a = nadVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.pms.PollsTtlConfig", nadVar, 3);
        t4dVar.k("chat", true);
        t4dVar.k("bigchat", true);
        t4dVar.k("channel", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        pad padVar = (pad) obj;
        long j = padVar.c;
        long j2 = padVar.b;
        long j3 = padVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || j3 != 5000) {
            x74VarA.e(fifVar, 0, j3);
        }
        if (x74VarA.B() || j2 != BuildConfig.SILENCE_TIME_TO_UPLOAD) {
            x74VarA.e(fifVar, 1, j2);
        }
        if (x74VarA.B() || j != 25000) {
            x74VarA.e(fifVar, 2, j);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var, ti9Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                jQ = v74VarA.q(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                jQ2 = v74VarA.q(fifVar, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                jQ3 = v74VarA.q(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new pad(i, jQ, jQ2, jQ3);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
