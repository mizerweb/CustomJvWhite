package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class da9 extends Drawable implements Animatable {
    public final Context a;
    public final int b;
    public final ny8 c = rx8.P(3, new ww8(6, this));
    public final dk d;
    public final ObjectAnimator e;

    public da9(Context context, int i) {
        this.a = context;
        this.b = i;
        dk dkVar = new dk("rotation", 0.0f);
        this.d = dkVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, dkVar, 0.0f, 359.0f);
        objectAnimatorOfFloat.setDuration(1200L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new ak(17, this));
        this.e = objectAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.d.a, getBounds().centerX(), getBounds().centerY());
        ((Drawable) this.c.getValue()).draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.c.getValue()).setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.cancel();
    }
}
