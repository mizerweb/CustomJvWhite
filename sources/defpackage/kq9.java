package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kq9 implements oj7 {
    public static final kq9 a;
    private static final fif descriptor;

    static {
        kq9 kq9Var = new kq9();
        a = kq9Var;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.media.MediaAutoSaveSettings.AutoSaveRecord", kq9Var, 3);
        t4dVar.k("chatType", false);
        t4dVar.k("mediaType", false);
        t4dVar.k("enabledAt", false);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        mq9 mq9Var = (mq9) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = mq9.d;
        x74VarA.i(fifVar, 0, (aw8) ny8VarArr[0].getValue(), mq9Var.a);
        x74VarA.i(fifVar, 1, (aw8) ny8VarArr[1].getValue(), mq9Var.b);
        x74VarA.e(fifVar, 2, mq9Var.c);
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = mq9.d;
        return new aw8[]{ny8VarArr[0].getValue(), ny8VarArr[1].getValue(), ti9.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = mq9.d;
        int i = 0;
        nq9 nq9Var = null;
        pq9 pq9Var = null;
        long jQ = 0;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                nq9Var = (nq9) v74VarA.x(fifVar, 0, (aw8) ny8VarArr[0].getValue(), nq9Var);
                i |= 1;
            } else if (iV == 1) {
                pq9Var = (pq9) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), pq9Var);
                i |= 2;
            } else {
                if (iV != 2) {
                    qr7.e(iV);
                    return null;
                }
                jQ = v74VarA.q(fifVar, 2);
                i |= 4;
            }
        }
        v74VarA.j(fifVar);
        return new mq9(i, nq9Var, pq9Var, jQ);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
