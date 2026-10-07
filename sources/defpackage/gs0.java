package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class gs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is0 b;

    public /* synthetic */ gs0(is0 is0Var, int i) {
        this.a = i;
        this.b = is0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        is0 is0Var = this.b;
        switch (i) {
            case 0:
                if (is0Var.e > 0) {
                    SystemClock.uptimeMillis();
                }
                is0Var.setVisibility(0);
                break;
            default:
                ((xt5) is0Var.getCurrentDrawable()).c(false, false, true);
                if (is0Var.getProgressDrawable() == null || !is0Var.getProgressDrawable().isVisible()) {
                    if (is0Var.getIndeterminateDrawable() == null || !is0Var.getIndeterminateDrawable().isVisible()) {
                        is0Var.setVisibility(4);
                    }
                }
                break;
        }
    }
}
