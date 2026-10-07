package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class nde extends Drawable implements Animatable {
    public final Context a;
    public final ik b;
    public final ObjectAnimator c;
    public final ik d;
    public final ObjectAnimator e;
    public final ny8 f;
    public final ny8 g;

    public nde(Context context) {
        this.a = context;
        ik ikVar = new ik("bgAlpha", 255);
        this.b = ikVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, ikVar, 255, np0.m, 255);
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        final int i = 0;
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mde
            public final /* synthetic */ nde b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                nde ndeVar = this.b;
                switch (i2) {
                    case 0:
                        ndeVar.invalidateSelf();
                        break;
                    default:
                        ndeVar.invalidateSelf();
                        break;
                }
            }
        });
        this.c = objectAnimatorOfInt;
        ik ikVar2 = new ik("indicatorAlpha", 255);
        this.d = ikVar2;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, ikVar2, 255, 0, 255);
        objectAnimatorOfInt2.setDuration(2000L);
        objectAnimatorOfInt2.setRepeatCount(-1);
        objectAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        final int i2 = 1;
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: mde
            public final /* synthetic */ nde b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                nde ndeVar = this.b;
                switch (i3) {
                    case 0:
                        ndeVar.invalidateSelf();
                        break;
                    default:
                        ndeVar.invalidateSelf();
                        break;
                }
            }
        });
        this.e = objectAnimatorOfInt2;
        this.f = rx8.P(3, new tyd(13));
        this.g = rx8.P(3, new a8d(24, this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ny8 ny8Var = this.f;
        ((ShapeDrawable) ny8Var.getValue()).setAlpha(this.b.a);
        ((ShapeDrawable) ny8Var.getValue()).draw(canvas);
        int iWidth = getBounds().width() / 2;
        ny8 ny8Var2 = this.g;
        float fWidth = iWidth - (((ShapeDrawable) ny8Var2.getValue()).getBounds().width() / 2);
        float fHeight = (getBounds().height() / 2) - (((ShapeDrawable) ny8Var2.getValue()).getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            ((ShapeDrawable) ny8Var2.getValue()).setAlpha(this.d.a);
            ((ShapeDrawable) ny8Var2.getValue()).draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
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
        return this.c.isRunning() || this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.f.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int iMin = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.g.getValue()).setBounds(0, 0, iMin, iMin);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c.start();
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c.cancel();
        this.e.cancel();
    }
}
