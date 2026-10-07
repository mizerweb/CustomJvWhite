package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yu5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ av5 b;
    public final /* synthetic */ bv5 c;

    public /* synthetic */ yu5(av5 av5Var, bv5 bv5Var, int i) {
        this.a = i;
        this.b = av5Var;
        this.c = bv5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bv5 bv5Var = this.c;
        av5 av5Var = this.b;
        switch (i) {
            case 0:
                bv5Var.r(av5Var.a, av5Var.b);
                break;
            default:
                bv5Var.i(av5Var.a, av5Var.b);
                break;
        }
    }
}
