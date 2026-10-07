package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class hwb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwb b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ hwb(kwb kwbVar, Drawable drawable, int i) {
        this.a = i;
        this.b = kwbVar;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        kwb kwbVar = this.b;
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
