package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h58 b;
    public final /* synthetic */ jv3 c;

    public /* synthetic */ tv3(xv3 xv3Var, h58 h58Var, jv3 jv3Var, int i) {
        this.a = i;
        this.b = h58Var;
        this.c = jv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        fv3 fv3Var = fv3.a;
        jv3 jv3Var = this.c;
        h58 h58Var = this.b;
        switch (i) {
            case 0:
                xv3.n(h58Var, jv3Var, fv3Var);
                break;
            case 1:
                xv3.n(h58Var, jv3Var, fv3Var);
                break;
            default:
                xv3.n(h58Var, jv3Var, dv3.a);
                break;
        }
    }
}
