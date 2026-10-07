package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class jwb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwb b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ jwb(kwb kwbVar, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = kwbVar;
        this.c = drawable;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.d;
        Drawable drawable = this.c;
        kwb kwbVar = this.b;
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
