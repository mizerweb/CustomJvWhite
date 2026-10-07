package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class zv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw3 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ zv3(dw3 dw3Var, Drawable drawable, int i) {
        this.a = i;
        this.b = dw3Var;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        dw3 dw3Var = this.b;
        switch (i) {
            case 0:
                super/*android.view.View*/.invalidateDrawable(drawable);
                break;
            default:
                super/*android.view.View*/.unscheduleDrawable(drawable);
                break;
        }
    }
}
