package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.animation.LinearInterpolator;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class ls7 extends js7 {
    public float A;
    public final float B;
    public final ValueAnimator C;
    public float w;
    public float x;
    public float y;
    public final Path z;

    public ls7(Context context) {
        super(context);
        setWillNotDraw(false);
        this.w = 0.33333334f;
        this.y = 3.0f;
        this.z = new Path();
        this.B = context.getResources().getDisplayMetrics().density;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, context.getResources().getDisplayMetrics().widthPixels);
        valueAnimatorOfFloat.setDuration(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ak(15, this));
        this.C = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.C.isRunning()) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(-this.A, 0.0f);
        Path path = this.z;
        canvas.clipOutPath(path);
        canvas.translate(getWidth(), 0.0f);
        canvas.clipOutPath(path);
        canvas.translate(this.A - getWidth(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.js7
    public final float g(float f) {
        return f * 0.33f;
    }

    public final float getBlurScale() {
        return this.y;
    }

    @Override // defpackage.js7
    public float getFalloff() {
        return this.x;
    }

    public final float getFalloffOverride() {
        return this.x;
    }

    public final float getRadiusScale() {
        return this.w;
    }

    @Override // defpackage.js7
    public final float h(float f) {
        return f * this.y;
    }

    @Override // defpackage.js7
    public final float i(float f) {
        return f * this.y;
    }

    @Override // defpackage.js7
    public final float j(float f) {
        return f * this.w;
    }

    @Override // defpackage.js7
    public final float k(float f, float f2) {
        return 1.0f * (f > 0.0f ? f2 / f : 1.0f);
    }

    @Override // defpackage.js7, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.start();
    }

    @Override // defpackage.js7, defpackage.ns0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.C.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = i2;
        float f3 = this.B;
        float f4 = f2 - (4.0f * f3);
        Path path = this.z;
        path.rewind();
        path.moveTo(0.0f, f4);
        float f5 = f / 3.0f;
        path.cubicTo(f5, f2 - (17.0f * f3), f5 * 2.0f, (f3 * 9.0f) + f2, f, f4);
        path.lineTo(f, f2);
        path.lineTo(0.0f, f2);
        path.close();
        this.C.setFloatValues(0.0f, f);
    }

    public final void setBlurScale(float f) {
        this.y = f;
    }

    @Override // defpackage.js7
    public void setContinuousAnimationsEnabled(boolean z) {
        super.setContinuousAnimationsEnabled(z);
        ValueAnimator valueAnimator = this.C;
        if (z) {
            valueAnimator.start();
        } else {
            valueAnimator.cancel();
        }
    }

    public final void setFalloffOverride(float f) {
        this.x = f;
    }

    public final void setRadiusScale(float f) {
        this.w = f;
    }
}
