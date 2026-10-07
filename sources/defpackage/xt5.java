package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt5 extends Drawable implements Animatable {
    public static final cp2 k = new cp2(7, Float.class, "growFraction");
    public final Context a;
    public final js0 b;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList f;
    public boolean g;
    public float h;
    public int j;
    public final Paint i = new Paint();
    public zk c = new zk();

    public xt5(Context context, js0 js0Var) {
        this.a = context;
        this.b = js0Var;
        setAlpha(255);
    }

    public final float b() {
        js0 js0Var = this.b;
        if (js0Var.e == 0 && js0Var.f == 0) {
            return 1.0f;
        }
        return this.h;
    }

    public final boolean c(boolean z, boolean z2, boolean z3) {
        zk zkVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        zkVar.getClass();
        return d(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.d;
        cp2 cp2Var = k;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, cp2Var, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.d.setInterpolator(lk.b);
            ObjectAnimator objectAnimator2 = this.d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                ore.p("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.d = objectAnimator2;
            objectAnimator2.addListener(new wt5(this, 0));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, cp2Var, 1.0f, 0.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.e.setInterpolator(lk.b);
            ObjectAnimator objectAnimator3 = this.e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                ore.p("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new wt5(this, 1));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.d : this.e;
            ObjectAnimator objectAnimator5 = z ? this.e : this.d;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.g;
                    this.g = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.g = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.g;
                    this.g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.g = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                js0 js0Var = this.b;
                if (!z ? js0Var.f != 0 : js0Var.e != 0) {
                    boolean z7 = this.g;
                    this.g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.g = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void e(hs0 hs0Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null || !arrayList.contains(hs0Var)) {
            return;
        }
        this.f.remove(hs0Var);
        if (this.f.isEmpty()) {
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return c(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
