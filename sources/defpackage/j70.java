package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class j70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k70 b;

    public /* synthetic */ j70(k70 k70Var, int i) {
        this.a = i;
        this.b = k70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k70 k70Var = this.b;
        switch (i) {
            case 0:
                ValueAnimator valueAnimator = k70Var.n;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                break;
            default:
                ValueAnimator valueAnimator2 = k70Var.n;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
                break;
        }
    }
}
