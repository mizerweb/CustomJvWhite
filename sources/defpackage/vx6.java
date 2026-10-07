package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class vx6 implements Drawable.Callback {
    public final k36 a;
    public final su6 b;
    public final /* synthetic */ wx6 c;

    public vx6(wx6 wx6Var) {
        this.c = wx6Var;
        this.a = new k36(10, wx6Var);
        this.b = new su6(wx6Var, 1, this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        wx6 wx6Var = this.c;
        k96 k96Var = wx6Var.i;
        su6 su6Var = this.b;
        if (k96Var != null) {
            k96Var.removeCallbacks(su6Var);
        }
        k96 k96Var2 = wx6Var.i;
        if (k96Var2 != null) {
            k96Var2.post(su6Var);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        wx6 wx6Var = this.c;
        k96 k96Var = wx6Var.i;
        su6 su6Var = this.b;
        if (k96Var != null) {
            k96Var.removeCallbacks(su6Var);
        }
        k96 k96Var2 = wx6Var.i;
        if (k96Var2 != null) {
            k96Var2.postDelayed(su6Var, j - System.currentTimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        k96 k96Var = this.c.i;
        if (k96Var != null) {
            k96Var.removeCallbacks(this.b);
        }
    }
}
