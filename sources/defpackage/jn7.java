package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.widget.ImageView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes.dex */
public final class jn7 extends ImageView {
    public final Paint a;
    public LinearGradient b;
    public final Matrix c;
    public in7 d;
    public float e;
    public ValueAnimator f;

    public jn7(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.a = paint;
        this.c = new Matrix();
        this.d = new in7(-1, 7000L, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, 15.0f, 48);
    }

    public final void a() {
        this.e = -getWidth();
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        in7 in7Var = this.d;
        float f = -getWidth();
        float width = getWidth();
        float width2 = getWidth();
        in7Var.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, (width2 * 0.6f) + width);
        valueAnimatorOfFloat.setDuration(in7Var.c);
        valueAnimatorOfFloat.setStartDelay(in7Var.b);
        valueAnimatorOfFloat.setRepeatCount(in7Var.a);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new hn7(this, 0));
        valueAnimatorOfFloat.start();
        this.f = valueAnimatorOfFloat;
    }

    public final in7 getAnimConfig() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(this.d.d, getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.postTranslate(this.e, 0.0f);
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d.getClass();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i * 0.6f, 0.0f, new int[]{0, lvb.I0(-1, 0.3f), 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        this.a.setShader(linearGradient);
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            float f = -getWidth();
            float width = getWidth();
            float width2 = getWidth();
            this.d.getClass();
            valueAnimator.setFloatValues(f, (width2 * 0.6f) + width);
        }
        this.e = -getWidth();
    }

    public final void setAnimConfig(in7 in7Var) {
        this.d = in7Var;
    }
}
