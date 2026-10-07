package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv3 b;
    public final /* synthetic */ h58 c;
    public final /* synthetic */ jv3 d;
    public final /* synthetic */ yu3 e;

    public /* synthetic */ vv3(xv3 xv3Var, h58 h58Var, jv3 jv3Var, yu3 yu3Var, int i) {
        this.a = i;
        this.b = xv3Var;
        this.c = h58Var;
        this.d = jv3Var;
        this.e = yu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yu3 yu3Var = this.e;
        jv3 jv3Var = this.d;
        h58 h58Var = this.c;
        xv3 xv3Var = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = xv3.o;
                xv3.n(h58Var, jv3Var, xv3Var.d(yu3Var));
                break;
            default:
                zv8[] zv8VarArr2 = xv3.o;
                xv3.n(h58Var, jv3Var, xv3Var.d(yu3Var));
                break;
        }
    }
}
