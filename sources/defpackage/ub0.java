package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ub0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ub0(wb0 wb0Var, boolean z, int i) {
        this.a = i;
        this.b = wb0Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        boolean z = this.c;
        wb0 wb0Var = this.b;
        switch (i) {
            case 0:
                int iD = qt4.D(wb0Var.g);
                if (iD == 0) {
                    wb0Var.b.set(null);
                    wb0Var.c.set(false);
                    wb0Var.d(2);
                    wb0Var.a.execute(new ub0(wb0Var, z, i2));
                    wb0Var.f();
                    break;
                } else if (iD == 2) {
                    c.e("AudioSource is released");
                    break;
                }
                break;
            default:
                int iD2 = qt4.D(wb0Var.g);
                if (iD2 == 0 || iD2 == 1) {
                    if (wb0Var.r != z) {
                        wb0Var.r = z;
                        if (wb0Var.g == 2) {
                            wb0Var.a();
                        }
                        break;
                    }
                } else if (iD2 == 2) {
                    c.e("AudioSource is released");
                    break;
                }
                break;
        }
    }
}
