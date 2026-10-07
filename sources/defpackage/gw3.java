package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gw3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw3 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ gw3(jw3 jw3Var, Drawable drawable, int i) {
        this.a = i;
        this.b = jw3Var;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        jw3 jw3Var = this.b;
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
