package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e45 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g45 b;

    public /* synthetic */ e45(g45 g45Var, int i) {
        this.a = i;
        this.b = g45Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g45 g45Var = this.b;
        switch (i) {
            case 0:
                g45Var.z = false;
                break;
            case 1:
                g45Var.A = false;
                break;
            default:
                g45Var.y = false;
                break;
        }
    }
}
