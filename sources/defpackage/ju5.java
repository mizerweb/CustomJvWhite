package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ju5 implements x26 {
    public final ArrayList a = new ArrayList();
    public final Path b = new Path();
    public final Paint c;
    public float d;
    public ValueAnimator e;
    public jj2 f;
    public final PathInterpolator g;

    public ju5(int i, float f) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.c = paint;
        this.d = 1.0f;
        this.g = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        ValueAnimator valueAnimator;
        int i = 6;
        float[] fArr = {f, f2, f3, f4, f5, f6};
        this.a.add(new mu5(3, fArr));
        if (!z) {
            b(fArr);
            return;
        }
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.e) != null) {
            valueAnimator.cancel();
        }
        this.d = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.addUpdateListener(new ak(12, this));
        valueAnimatorOfFloat.addListener(new li(i, this));
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void b(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        Path path = this.b;
        path.moveTo(f, f2);
        path.lineTo(fArr[2], fArr[3]);
        path.moveTo(fArr[0], fArr[1]);
        path.lineTo(fArr[4], fArr[5]);
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a.add(new mu5(2, new float[]{f, f2, f3, f4, f5, f6, f7, f8}));
        Path path = this.b;
        path.moveTo(f, f2);
        path.cubicTo(f3, f4, f5, f6, f7, f8);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.a.add(new mu5(1, new float[]{f, f2, f3, f4}));
        Path path = this.b;
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
    }

    @Override // defpackage.x26
    public final void draw(Canvas canvas) {
        Path path = this.b;
        Paint paint = this.c;
        canvas.drawPath(path, paint);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        float[] fArr = ((mu5) ww3.B1(this.a)).b;
        float f = this.d;
        float fC = tqk.c(fArr[0], fArr[2], f);
        float fC2 = tqk.c(fArr[1], fArr[3], f);
        float fC3 = tqk.c(fArr[0], fArr[4], f);
        float fC4 = tqk.c(fArr[1], fArr[5], f);
        canvas.drawLine(fArr[0], fArr[1], fC, fC2, paint);
        canvas.drawLine(fArr[0], fArr[1], fC3, fC4, paint);
    }
}
