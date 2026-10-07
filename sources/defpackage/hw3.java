package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class hw3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw3 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ long e;

    public /* synthetic */ hw3(jw3 jw3Var, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = jw3Var;
        this.c = drawable;
        this.d = runnable;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.e;
        Runnable runnable = this.d;
        Drawable drawable = this.c;
        jw3 jw3Var = this.b;
        switch (i) {
            case 0:
                super/*android.view.View*/.scheduleDrawable(drawable, runnable, j);
                break;
            default:
                super/*android.view.View*/.scheduleDrawable(drawable, runnable, j);
                break;
        }
    }
}
