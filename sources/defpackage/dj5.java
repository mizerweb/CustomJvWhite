package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class dj5 extends xt5 {
    public static final cj5 q = new cj5(12);
    public final hu5 l;
    public final jfg m;
    public final ifg n;
    public final gu5 o;
    public boolean p;

    public dj5(Context context, js0 js0Var, hu5 hu5Var) {
        super(context, js0Var);
        this.p = false;
        this.l = hu5Var;
        this.o = new gu5();
        jfg jfgVar = new jfg();
        this.m = jfgVar;
        jfgVar.a(1.0f);
        jfgVar.b(50.0f);
        ifg ifgVar = new ifg(this, q);
        this.n = ifgVar;
        ifgVar.m = jfgVar;
        if (this.h != 1.0f) {
            this.h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // defpackage.xt5
    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean zD = super.d(z, z2, z3);
        zk zkVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        zkVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.p = true;
            return zD;
        }
        this.p = false;
        this.m.b(50.0f / f);
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            hu5 hu5Var = this.l;
            hu5Var.a.a();
            hu5Var.a(canvas, bounds, fB, z, z2);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.i;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            js0 js0Var = this.b;
            int i = js0Var.c[0];
            gu5 gu5Var = this.o;
            gu5Var.c = i;
            int iE = js0Var.g;
            hu5 hu5Var2 = this.l;
            if (iE > 0) {
                if (!(hu5Var2 instanceof o19)) {
                    iE = (int) ((np4.e(gu5Var.b, 0.0f, 0.01f) * iE) / 0.01f);
                }
                this.l.d(canvas, paint, gu5Var.b, 1.0f, js0Var.d, this.j, iE);
            } else {
                hu5Var2.d(canvas, paint, 0.0f, 1.0f, js0Var.d, this.j, 0);
            }
            int i2 = this.j;
            hu5 hu5Var3 = this.l;
            hu5Var3.c(canvas, paint, gu5Var, i2);
            hu5Var3.b(canvas, paint, js0Var.c[0], this.j);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.n.f();
        this.o.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.p;
        gu5 gu5Var = this.o;
        ifg ifgVar = this.n;
        if (z) {
            ifgVar.f();
            gu5Var.b = i / 10000.0f;
            invalidateSelf();
        } else {
            ifgVar.b = gu5Var.b * 10000.0f;
            ifgVar.c = true;
            ifgVar.a(i);
        }
        return true;
    }
}
