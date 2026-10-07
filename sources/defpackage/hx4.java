package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mx4 b;

    public /* synthetic */ hx4(mx4 mx4Var, int i) {
        this.a = i;
        this.b = mx4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        mx4 mx4Var = this.b;
        switch (i) {
            case 0:
                if (mx4Var.isAttachedToWindow()) {
                    if (mx4Var.getMode() == jx4.b) {
                        mx4.R(mx4Var);
                    }
                    mx4Var.A();
                    break;
                }
                break;
            case 1:
                mx4Var.n();
                break;
            default:
                mx4Var.requestLayout();
                mx4Var.invalidate();
                break;
        }
    }
}
