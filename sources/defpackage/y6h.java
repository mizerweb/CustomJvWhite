package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class y6h extends View {
    public final v6h a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final OvershootInterpolator f;
    public x6h g;
    public bj8 h;
    public float i;
    public ValueAnimator j;

    public y6h(Context context, v6h v6hVar) {
        super(context);
        this.a = v6hVar;
        Paint paint = new Paint(1);
        paint.setDither(true);
        this.b = paint;
        Paint paint2 = new Paint(1);
        paint2.setDither(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setAlpha(41);
        this.d = paint3;
        Paint paint4 = new Paint(1);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.e = paint4;
        this.f = new OvershootInterpolator();
        setClickable(true);
        setLayerType(1, null);
    }

    public final void a(float f) {
        animate().cancel();
        animate().scaleX(f).scaleY(f).setDuration(125L).setInterpolator(this.f).start();
    }

    public final void b() {
        bj8 bj8Var = this.h;
        this.d.setShader(null);
        this.h = null;
        if (bj8Var != null) {
        }
    }

    public final void c(x6h x6hVar) {
        int[] iArr = x6hVar.b;
        Paint paint = this.b;
        paint.setShader(null);
        Paint paint2 = this.c;
        paint2.setShader(null);
        paint.setColor(iArr[0]);
        paint2.setColor(iArr[0]);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.j = null;
        this.i = isSelected() ? 1.0f : 0.0f;
        animate().cancel();
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = yl5.d().getDisplayMetrics().density * 14.0f;
        float f2 = this.i;
        Paint paint = this.b;
        if (f2 <= 0.0f) {
            canvas.drawCircle(width, height, f, paint);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawCircle(width, height, f, paint);
        int i = (int) (255.0f * this.i);
        Paint paint2 = this.e;
        paint2.setAlpha(i);
        canvas.drawCircle(width, height, yl5.d().getDisplayMetrics().density * 11.0f, paint2);
        canvas.drawCircle(width, height, yl5.d().getDisplayMetrics().density * 9.0f, this.c);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
        b();
        x6h x6hVar = this.g;
        if (x6hVar != null) {
            c(x6hVar);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(1.2f);
        } else if (actionMasked == 1 || actionMasked == 3) {
            a(1.0f);
        }
        return super.onTouchEvent(motionEvent);
    }
}
