package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nl2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls9 b;

    public /* synthetic */ nl2(ls9 ls9Var, int i) {
        this.a = i;
        this.b = ls9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ls9 ls9Var = this.b;
        switch (i) {
            case 0:
                ls9Var.a();
                break;
            case 1:
                if (ls9Var != null) {
                    ls9Var.a();
                }
                break;
            case 2:
                if (ls9Var != null) {
                    ls9Var.a();
                }
                break;
            case 3:
                ls9Var.a();
                break;
            default:
                ls9Var.a();
                break;
        }
    }
}
