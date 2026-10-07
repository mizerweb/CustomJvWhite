package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w76 b;

    public /* synthetic */ j86(w76 w76Var, int i) {
        this.a = i;
        this.b = w76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w76 w76Var = this.b;
        switch (i) {
            case 0:
                w76Var.getClass();
                break;
            default:
                w76Var.b();
                break;
        }
    }
}
