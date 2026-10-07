package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class sza extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, eph {
    public static final int[] i = {-16724737, -16767233, -5963578};
    public static final int[] j = {-2500135, 14277081};
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient d;
    public final int[] e;
    public final Path f;
    public final Paint g;
    public final ny8 h;

    public sza() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.e = i;
        this.f = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.g = paint2;
        this.h = rx8.P(3, new ap9(4, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.d = linearGradient;
        this.a.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.f, this.g);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((ValueAnimator) this.h.getValue()).isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(fFloatValue, 0.0f);
        LinearGradient linearGradient = this.d;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.e);
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getBounds().height(), j, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.h.getValue()).setFloatValues(getBounds().width() * 2.0f, 0.0f);
        int iHeight = getBounds().height();
        Path path = this.f;
        path.reset();
        float fWidth = getBounds().width() / 2.0f;
        float f = yl5.d().getDisplayMetrics().density * 24.0f;
        float f2 = iHeight;
        path.addOval(0.0f - fWidth, (f2 - (yl5.d().getDisplayMetrics().density * 187.0f)) + f, getBounds().width() + fWidth, f2 + f, Path.Direction.CW);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a(i);
        this.g.setColor(kbcVar.b().c);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.setAlpha(i2);
        this.g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ny8 ny8Var = this.h;
        if (((ValueAnimator) ny8Var.getValue()).isRunning()) {
            return;
        }
        ((ValueAnimator) ny8Var.getValue()).start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((ValueAnimator) this.h.getValue()).cancel();
    }
}
