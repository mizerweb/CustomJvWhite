package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class cw3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw3 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ cw3(dw3 dw3Var, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = dw3Var;
        this.c = drawable;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.d;
        Drawable drawable = this.c;
        dw3 dw3Var = this.b;
        switch (i) {
            case 0:
                super/*android.view.View*/.unscheduleDrawable(drawable, runnable);
                break;
            default:
                super/*android.view.View*/.unscheduleDrawable(drawable, runnable);
                break;
        }
    }
}
