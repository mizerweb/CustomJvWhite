package defpackage;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c14 implements oj7 {
    public static final c14 a;
    private static final fif descriptor;

    static {
        c14 c14Var = new c14();
        a = c14Var;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.CommentsCountersTtlConfig", c14Var, 3);
        t4dVar.k("channel", true);
        t4dVar.k("bigchannel", true);
        t4dVar.k("participantsCount", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        e14 e14Var = (e14) obj;
        int i = e14Var.c;
        long j = e14Var.b;
        long j2 = e14Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || j2 != WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            x74VarA.e(fifVar, 0, j2);
        }
        if (x74VarA.B() || j != 60000) {
            x74VarA.e(fifVar, 1, j);
        }
        if (x74VarA.B() || i != 100000) {
            x74VarA.y(2, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var, ij8.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        int i = 0;
        int iL = 0;
        long jQ = 0;
        long jQ2 = 0;
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
                iL = v74VarA.l(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new e14(i, iL, jQ, jQ2);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
