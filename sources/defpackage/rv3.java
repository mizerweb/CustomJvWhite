package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv3 b;
    public final /* synthetic */ h58 c;
    public final /* synthetic */ jv3 d;
    public final /* synthetic */ int e;

    public /* synthetic */ rv3(xv3 xv3Var, h58 h58Var, jv3 jv3Var, int i, int i2) {
        this.a = i2;
        this.b = xv3Var;
        this.c = h58Var;
        this.d = jv3Var;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.e;
        jv3 jv3Var = this.d;
        h58 h58Var = this.c;
        xv3 xv3Var = this.b;
        switch (i) {
            case 0:
                xv3.a(xv3Var, h58Var, jv3Var, i2);
                break;
            default:
                xv3.a(xv3Var, h58Var, jv3Var, i2);
                break;
        }
    }
}
