package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
public final class n58 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t58 b;
    public final /* synthetic */ Animatable c;
    public final /* synthetic */ l68 d;

    public /* synthetic */ n58(t58 t58Var, Animatable animatable, l68 l68Var, int i) {
        this.a = i;
        this.b = t58Var;
        this.c = animatable;
        this.d = l68Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l68 l68Var = this.d;
        Animatable animatable = this.c;
        t58 t58Var = this.b;
        switch (i) {
            case 0:
                if (t58Var.getImageAttach().e && animatable != null) {
                    animatable.start();
                }
                t58Var.setImageInfo(l68Var);
                t58Var.getOnFinalImageSetCallback().invoke();
                break;
            default:
                if (t58Var.getImageAttach().e && animatable != null) {
                    animatable.start();
                }
                t58Var.setImageInfo(l68Var);
                t58Var.getOnFinalImageSetCallback().invoke();
                break;
        }
    }
}
