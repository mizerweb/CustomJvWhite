package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ls1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ ms1 c;

    public /* synthetic */ ls1(cf7 cf7Var, ms1 ms1Var, int i) {
        this.a = i;
        this.b = cf7Var;
        this.c = ms1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ms1 ms1Var = this.c;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(ms1Var);
                break;
            default:
                cf7Var.invoke(ms1Var);
                break;
        }
    }
}
