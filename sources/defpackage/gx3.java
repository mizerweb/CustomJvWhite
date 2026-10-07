package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class gx3 extends View {
    public static final /* synthetic */ zv8[] m = {new z8b(gx3.class, "isChosen", "isChosen()Z"), zo5.e(zfe.a, gx3.class, "hasBorder", "getHasBorder()Z"), new z8b(gx3.class, "borderStrokeWidthPx", "getBorderStrokeWidthPx()F"), new z8b(gx3.class, "innerInsetPx", "getInnerInsetPx()F"), new z8b(gx3.class, "itemColor", "getItemColor()I"), new z8b(gx3.class, "gradientColors", "getGradientColors()[I")};
    public final fx3 a;
    public final fx3 b;
    public final fx3 c;
    public final fx3 d;
    public final fx3 e;
    public final fx3 f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public ViewPropertyAnimator k;
    public final OvershootInterpolator l;

    public gx3(Context context) {
        super(context, null, 0, 0);
        this.a = new fx3(this, 0);
        this.b = new fx3(this, 1);
        this.c = new fx3(Float.valueOf(yl5.d().getDisplayMetrics().density * 2.5f), this, 2);
        this.d = new fx3(Float.valueOf(yl5.d().getDisplayMetrics().density * 2.0f), this, 3);
        this.e = new fx3(this, 4);
        this.f = new fx3(this, 5);
        Paint paint = new Paint(1);
        paint.setDither(true);
        pq3.j.e(context).m();
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(getBorderStrokeWidthPx());
        this.g = paint;
        Paint paint2 = new Paint(1);
        paint2.setDither(true);
        paint2.setColor(getItemColor());
        paint2.setStyle(style);
        paint2.setStrokeWidth(getBorderStrokeWidthPx());
        this.h = paint2;
        Paint paint3 = new Paint(1);
        paint3.setDither(true);
        paint3.setColor(tre.I0(getItemColor(), 0.3f));
        paint3.setStyle(style);
        paint3.setStrokeWidth(getBorderStrokeWidthPx());
        this.i = paint3;
        Paint paint4 = new Paint(1);
        paint4.setDither(true);
        paint4.setColor(getItemColor());
        paint4.setStyle(Paint.Style.FILL);
        this.j = paint4;
        this.l = new OvershootInterpolator();
        setClickable(true);
        setOutlineProvider(new fn(1));
        setClipToOutline(false);
    }

    public final float getBorderStrokeWidthPx() {
        zv8 zv8Var = m[2];
        return ((Number) this.c.b).floatValue();
    }

    public final int[] getGradientColors() {
        zv8 zv8Var = m[5];
        return (int[]) this.f.b;
    }

    public final boolean getHasBorder() {
        zv8 zv8Var = m[1];
        return ((Boolean) this.b.b).booleanValue();
    }

    public final float getInnerInsetPx() {
        zv8 zv8Var = m[3];
        return ((Number) this.d.b).floatValue();
    }

    public final int getItemColor() {
        zv8 zv8Var = m[4];
        return ((Number) this.e.b).intValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.k = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = (getWidth() - getPaddingRight()) - paddingLeft;
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float f = (width / 2.0f) + paddingLeft;
        float f2 = (height / 2.0f) + paddingTop;
        float fMin = Math.min(width, height) / 2.0f;
        zv8[] zv8VarArr = m;
        zv8 zv8Var = zv8VarArr[0];
        fx3 fx3Var = this.a;
        boolean zBooleanValue = ((Boolean) fx3Var.b).booleanValue();
        Paint paint = this.j;
        if (zBooleanValue && getHasBorder()) {
            canvas.drawCircle(f, f2, (getBorderStrokeWidthPx() / 2.0f) + fMin, this.g);
            canvas.drawCircle(f, f2, fMin, paint);
            return;
        }
        zv8 zv8Var2 = zv8VarArr[0];
        if (((Boolean) fx3Var.b).booleanValue()) {
            canvas.drawCircle(f, f2, fMin - (getBorderStrokeWidthPx() / 2.0f), this.h);
            canvas.drawCircle(f, f2, (fMin - getBorderStrokeWidthPx()) - getInnerInsetPx(), paint);
        } else if (!getHasBorder()) {
            canvas.drawCircle(f, f2, fMin, paint);
        } else {
            canvas.drawCircle(f, f2, fMin, this.i);
            canvas.drawCircle(f, f2, fMin - (getBorderStrokeWidthPx() / 2.0f), paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int[] gradientColors = getGradientColors();
        if (gradientColors != null) {
            this.j.setShader(new LinearGradient(getWidth(), getHeight(), 0.0f, 0.0f, gradientColors, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0017  */
    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimator2;
        ViewPropertyAnimator interpolator2;
        int actionMasked = motionEvent.getActionMasked();
        OvershootInterpolator overshootInterpolator = this.l;
        if (actionMasked == 0) {
            viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            interpolator = animate().scaleX(1.2f).scaleY(1.2f).setDuration(125L).setInterpolator(overshootInterpolator);
            this.k = interpolator;
            if (interpolator != null) {
                interpolator.start();
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            viewPropertyAnimator2 = this.k;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            interpolator2 = animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L).setInterpolator(overshootInterpolator);
            this.k = interpolator2;
            if (interpolator2 != null) {
                interpolator2.start();
            }
        } else if (actionMasked == 5) {
            viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            interpolator = animate().scaleX(1.2f).scaleY(1.2f).setDuration(125L).setInterpolator(overshootInterpolator);
            this.k = interpolator;
            if (interpolator != null) {
                interpolator.start();
            }
        } else if (actionMasked == 6) {
            viewPropertyAnimator2 = this.k;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            interpolator2 = animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L).setInterpolator(overshootInterpolator);
            this.k = interpolator2;
            if (interpolator2 != null) {
                interpolator2.start();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBorderStrokeWidthPx(float f) {
        this.c.B(this, m[2], Float.valueOf(f));
    }

    public final void setChosen(boolean z) {
        this.a.B(this, m[0], Boolean.valueOf(z));
    }

    public final void setGradientColors(int[] iArr) {
        this.f.B(this, m[5], iArr);
    }

    public final void setHasBorder(boolean z) {
        this.b.B(this, m[1], Boolean.valueOf(z));
    }

    public final void setInnerInsetPx(float f) {
        this.d.B(this, m[3], Float.valueOf(f));
    }

    public final void setItemColor(int i) {
        this.e.B(this, m[4], Integer.valueOf(i));
    }
}
