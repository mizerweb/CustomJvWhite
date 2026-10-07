package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class su5 extends View {
    public Drawable a;
    public Drawable b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final Paint i;
    public final int j;
    public final PathInterpolator k;
    public AnimatorSet l;

    public su5(Context context) {
        super(context, null, 0, 0);
        this.c = 1.0f;
        this.d = 1.0f;
        this.f = 0.75f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        pq3.j.h(this);
        paint.setColor(-1);
        this.i = paint;
        this.j = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        this.k = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
        setOutlineProvider(new fn(1));
        setClipToOutline(true);
    }

    public final ValueAnimator a(float f, float f2, long j, cf7 cf7Var) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.addUpdateListener(new mk(cf7Var, 3, this));
        return valueAnimatorOfFloat;
    }

    public final void b() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.l;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.l) != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorA = a(0.75f, 1.0f, 333L, new ru5(this, 0));
        ValueAnimator valueAnimatorA2 = a(0.0f, 1.0f, 333L, new ru5(this, 3));
        ValueAnimator valueAnimatorA3 = a(1.0f, 0.75f, 333L, new ru5(this, 4));
        ValueAnimator valueAnimatorA4 = a(1.0f, 0.0f, 167L, new ru5(this, 5));
        ValueAnimator valueAnimatorA5 = a(1.0f, 0.75f, 333L, new ru5(this, 6));
        ValueAnimator valueAnimatorA6 = a(1.0f, 0.0f, 167L, new ru5(this, 7));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(valueAnimatorA, valueAnimatorA2, valueAnimatorA3, valueAnimatorA4, valueAnimatorA5, valueAnimatorA6);
        animatorSet3.start();
        this.l = animatorSet3;
    }

    public final void c() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.l;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.l) != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorA = a(1.0f, 0.75f, 333L, new ru5(this, 8));
        ValueAnimator valueAnimatorA2 = a(1.0f, 0.0f, 167L, new ru5(this, 9));
        ValueAnimator valueAnimatorA3 = a(0.75f, 1.0f, 333L, new ru5(this, 10));
        ValueAnimator valueAnimatorA4 = a(0.0f, 1.0f, 333L, new ru5(this, 11));
        ValueAnimator valueAnimatorA5 = a(0.75f, 1.0f, 333L, new ru5(this, 1));
        ValueAnimator valueAnimatorA6 = a(0.0f, 1.0f, 333L, new ru5(this, 2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(valueAnimatorA, valueAnimatorA2, valueAnimatorA3, valueAnimatorA4, valueAnimatorA5, valueAnimatorA6);
        animatorSet3.start();
        this.l = animatorSet3;
    }

    public final void d(Canvas canvas, Drawable drawable, float f, float f2) {
        if (drawable == null || f <= 0.0f) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f3 = this.j / 2.0f;
        int i = (int) (width - f3);
        int i2 = (int) (height - f3);
        int i3 = (int) (width + f3);
        int i4 = (int) (f3 + height);
        int iSave = canvas.save();
        try {
            canvas.scale(f2, f2, width, height);
            drawable.setBounds(i, i2, i3, i4);
            drawable.setAlpha(oc9.v((int) (f * 255.0f), 0, 255));
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final Drawable getDarkIcon() {
        return this.b;
    }

    public final Drawable getWhiteIcon() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.g;
        if (f > 0.0f) {
            int iV = oc9.v((int) (f * 255.0f), 0, 255);
            Paint paint = this.i;
            paint.setAlpha(iV);
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float width = getWidth() - getPaddingRight();
            float height = getHeight() - getPaddingBottom();
            canvas.drawCircle((paddingLeft + width) / 2.0f, (paddingTop + height) / 2.0f, (Math.min(width - paddingLeft, height - paddingTop) / 2.0f) * this.h, paint);
        }
        d(canvas, this.a, this.c, this.d);
        d(canvas, this.b, this.e, this.f);
    }

    public final void setDarkIcon(Drawable drawable) {
        this.b = drawable;
    }

    public final void setWhiteIcon(Drawable drawable) {
        this.a = drawable;
    }
}
