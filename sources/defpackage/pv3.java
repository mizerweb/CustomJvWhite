package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v78 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jv3 d;
    public final /* synthetic */ xv3 e;
    public final /* synthetic */ h58 f;

    public /* synthetic */ pv3(v78 v78Var, Object obj, jv3 jv3Var, xv3 xv3Var, h58 h58Var, int i) {
        this.a = i;
        this.b = v78Var;
        this.c = obj;
        this.d = jv3Var;
        this.e = xv3Var;
        this.f = h58Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h58 h58Var = this.f;
        xv3 xv3Var = this.e;
        jv3 jv3Var = this.d;
        Object obj = this.c;
        v78 v78Var = this.b;
        switch (i) {
            case 0:
                if (v78Var != null) {
                    t25 t25VarB = vd7.A().b(v78Var, obj);
                    jv3Var.d = t25VarB;
                    if (xv3Var.f) {
                        ((q0) t25VarB).l(new qv3(xv3Var, h58Var, jv3Var), x72.a);
                    }
                }
                break;
            default:
                if (v78Var != null) {
                    t25 t25VarB2 = vd7.A().b(v78Var, obj);
                    jv3Var.d = t25VarB2;
                    if (xv3Var.f) {
                        ((q0) t25VarB2).l(new qv3(xv3Var, h58Var, jv3Var), x72.a);
                    }
                }
                break;
        }
    }
}
