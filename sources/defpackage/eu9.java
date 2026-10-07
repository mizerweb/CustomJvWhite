package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eu9 extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ zv8[] u;
    public final int a;
    public final int b;
    public int c = 255;
    public final Drawable d;
    public final sj e;
    public final Drawable f;
    public final sj g;
    public final Drawable h;
    public final ifh i;
    public final ny8 j;
    public int k;
    public int l;
    public final xc8 m;
    public final ValueAnimator n;
    public float o;
    public Drawable p;
    public float q;
    public Drawable r;
    public Animatable s;
    public final zb t;

    static {
        z8b z8bVar = new z8b(eu9.class, "backgroundColor", "getBackgroundColor()Ljava/lang/Integer;");
        zfe.a.getClass();
        u = new zv8[]{z8bVar};
    }

    public eu9(int i, int i2, Context context) {
        this.a = i;
        this.b = i2;
        Drawable drawable = context.getDrawable(R.drawable.icon_play_fill);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.d = drawableMutate;
        sj sjVarA = sj.a(context, R.drawable.pause_to_play);
        sjVarA.setCallback(this);
        this.e = sjVarA;
        Drawable drawable2 = context.getDrawable(R.drawable.icon_pause_fill);
        this.f = drawable2 != null ? drawable2.mutate() : null;
        sj sjVarA2 = sj.a(context, R.drawable.play_to_pause);
        sjVarA2.setCallback(this);
        this.g = sjVarA2;
        Drawable drawable3 = context.getDrawable(R.drawable.icon_cross);
        this.h = drawable3 != null ? drawable3.mutate() : null;
        this.i = new ifh(new ww8(14, this));
        int i3 = 18;
        this.j = rx8.P(3, new bh9(i3));
        xc8 xc8Var = new xc8(context);
        xc8Var.setCallback(this);
        xc8Var.setAlpha(this.l);
        this.m = xc8Var;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ak(i3, this));
        this.n = valueAnimatorOfInt;
        this.o = 1.0f;
        this.p = drawableMutate;
        this.q = 1.0f;
        this.t = new zb(this, i3);
        c(-16777216);
    }

    public static void g(eu9 eu9Var, Drawable drawable, Animatable animatable, Drawable drawable2, int i) {
        if ((i & 4) != 0) {
            drawable2 = null;
        }
        Animatable animatable2 = eu9Var.s;
        eu9Var.s = null;
        if (animatable2 != null && animatable2.isRunning()) {
            animatable2.stop();
        }
        if (drawable != null) {
            drawable.setAlpha(255);
        }
        eu9Var.p = drawable;
        eu9Var.o = 1.0f;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        eu9Var.r = drawable2;
        eu9Var.q = 1.0f;
        eu9Var.s = animatable;
        if (animatable != null) {
            animatable.start();
        }
        eu9Var.invalidateSelf();
    }

    public final Animatable a() {
        return (Animatable) this.i.getValue();
    }

    public final int b() {
        Drawable drawable = this.p;
        if (cqk.d(drawable, this.d) || cqk.d(drawable, this.e)) {
            return 1;
        }
        if (cqk.d(drawable, this.f) || cqk.d(drawable, this.g)) {
            return 2;
        }
        return cqk.d(drawable, this.h) ? 3 : 1;
    }

    public final void c(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
        sj sjVar = this.g;
        if (sjVar != null) {
            sjVar.setTint(i);
        }
        sj sjVar2 = this.e;
        if (sjVar2 != null) {
            sjVar2.setTint(i);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setTint(i);
        }
        this.m.setTint(i);
    }

    public final void d() {
        int iD = qt4.D(b());
        Drawable drawable = this.f;
        if (iD == 0) {
            sj sjVar = this.g;
            if (sjVar != null) {
                g(this, sjVar, sjVar, null, 124);
                return;
            } else {
                g(this, drawable, a(), this.d, 120);
                return;
            }
        }
        if (iD != 1) {
            if (iD == 2) {
                g(this, drawable, a(), this.h, 120);
            } else {
                ore.o();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        zv8 zv8Var = u[0];
        if (((Integer) this.t.b) != null) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.j.getValue());
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            float f = this.q;
            float fWidth = getBounds().width() / 2.0f;
            float fHeight = getBounds().height() / 2.0f;
            int iSave = canvas.save();
            canvas.scale(f, f, fWidth, fHeight);
            try {
                int alpha = drawable.getAlpha();
                drawable.setAlpha((drawable.getAlpha() * this.c) / 255);
                drawable.draw(canvas);
                drawable.setAlpha(alpha);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            float f2 = this.o;
            float fWidth2 = getBounds().width() / 2.0f;
            float fHeight2 = getBounds().height() / 2.0f;
            int iSave2 = canvas.save();
            canvas.scale(f2, f2, fWidth2, fHeight2);
            try {
                int alpha2 = drawable2.getAlpha();
                drawable2.setAlpha((drawable2.getAlpha() * this.c) / 255);
                drawable2.draw(canvas);
                drawable2.setAlpha(alpha2);
                canvas.restoreToCount(iSave2);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        int i = this.k;
        if (i > 0) {
            int i2 = (i * this.c) / 255;
            xc8 xc8Var = this.m;
            xc8Var.setAlpha(i2);
            xc8Var.draw(canvas);
        }
    }

    public final void e(boolean z) {
        int iD = qt4.D(b());
        if (iD != 0) {
            Drawable drawable = this.d;
            if (iD != 1) {
                if (iD != 2) {
                    ore.o();
                    return;
                } else if (z) {
                    g(this, drawable, a(), this.h, 120);
                    return;
                } else {
                    g(this, drawable, null, null, 124);
                    return;
                }
            }
            if (!z) {
                g(this, drawable, null, null, 124);
                return;
            }
            sj sjVar = this.e;
            if (sjVar != null) {
                g(this, sjVar, sjVar, null, 124);
            } else {
                g(this, drawable, a(), this.f, 120);
            }
        }
    }

    public final void f(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.n;
        if (!z2) {
            if (this.k < 255) {
                valueAnimator.cancel();
                int i = z ? 255 : 0;
                this.l = i;
                this.k = i;
                invalidateSelf();
                return;
            }
            return;
        }
        if (!z || this.l < 255) {
            if (z || this.l > 0) {
                if (z) {
                    valueAnimator.start();
                    this.l = 255;
                } else {
                    valueAnimator.reverse();
                    this.l = 0;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h(Drawable drawable) {
        if (drawable.equals(this)) {
            return true;
        }
        if (drawable.equals(this.p)) {
            Drawable drawable2 = this.p;
            if ((drawable2 != null ? drawable2.getAlpha() : 0) > 0) {
                return true;
            }
        }
        if (drawable.equals(this.r)) {
            Drawable drawable3 = this.r;
            if ((drawable3 != null ? drawable3.getAlpha() : 0) > 0) {
                return true;
            }
        }
        return drawable.equals(this.m) && this.k > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (!h(drawable) || (callback = getCallback()) == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (!h(drawable) || (callback = getCallback()) == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.a;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(i + i5, i2 + i5, i3 - i5, i4 - i5);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(i + i5, i2 + i5, i3 - i5, i4 - i5);
        }
        sj sjVar = this.g;
        if (sjVar != null) {
            sjVar.setBounds(i + i5, i2 + i5, i3 - i5, i4 - i5);
        }
        sj sjVar2 = this.e;
        if (sjVar2 != null) {
            sjVar2.setBounds(i + i5, i2 + i5, i3 - i5, i4 - i5);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setBounds(i + i5, i2 + i5, i3 - i5, i4 - i5);
        }
        int i6 = this.b;
        this.m.setBounds(i + i6, i2 + i6, i3 - i6, i4 - i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        sj sjVar = this.g;
        if (sjVar != null) {
            sjVar.setColorFilter(colorFilter);
        }
        sj sjVar2 = this.e;
        if (sjVar2 != null) {
            sjVar2.setColorFilter(colorFilter);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setColorFilter(colorFilter);
        }
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (!h(drawable) || (callback = getCallback()) == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
