package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ijc extends View implements eph {
    public int a;
    public long b;
    public final Path c;
    public final Path d;
    public final Path e;
    public final PathMeasure f;
    public float g;
    public float h;
    public final Paint i;
    public final RectF j;
    public final Matrix k;
    public final ny8 l;
    public ObjectAnimator m;

    public ijc(Context context) {
        super(context);
        float f = yl5.d().getDisplayMetrics().density * 3.0f;
        this.a = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.b = 200L;
        this.c = qyj.r("M11.31,14.97C22.12,4.18 40.43,1.27 53.62,1.51s26.02,2.57 35.92,6.51 16.16,9.22 17.52,14.76c1.36,5.55 -2.28,10.97 -10.19,15.17 -7.91,4.21 -19.51,6.89 -32.49,7.52 -12.98,0.63 -26.38,-0.85 -37.52,-4.13S7.64,33.21 4.24,27.76C0.85,22.31 -1.7,13.2 11.25,5.41");
        this.d = new Path();
        this.e = new Path();
        this.f = new PathMeasure();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setColor(pq3.j.h(this).l().a);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        this.i = paint;
        this.j = new RectF();
        this.k = new Matrix();
        this.l = rx8.P(3, new yxb(14));
    }

    private final float getTrimEndValue() {
        return this.h;
    }

    private final PathInterpolator getTrimPathInterpolator() {
        return (PathInterpolator) this.l.getValue();
    }

    private static /* synthetic */ void getTrimPathInterpolator$annotations() {
    }

    private final void setTrimEndValue(float f) {
        this.h = f;
        invalidate();
    }

    public final void a(af7 af7Var) {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "trimEndValue", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(240L);
        objectAnimatorOfFloat.setInterpolator(getTrimPathInterpolator());
        lsk.e(objectAnimatorOfFloat, af7Var);
        objectAnimatorOfFloat.start();
        this.m = objectAnimatorOfFloat;
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setTrimEndValue(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "trimEndValue", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(360L);
        objectAnimatorOfFloat.setStartDelay(this.b);
        objectAnimatorOfFloat.setInterpolator(getTrimPathInterpolator());
        objectAnimatorOfFloat.start();
        this.m = objectAnimatorOfFloat;
    }

    public final void c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0] - i;
        int i4 = iArr[1] - i2;
        float f = i3;
        int i5 = this.a;
        float f2 = f - i5;
        float f3 = i4;
        float f4 = f3 - i5;
        float width = f + view.getWidth() + this.a;
        float height = f3 + view.getHeight() + this.a;
        Path path = this.c;
        RectF rectF = this.j;
        path.computeBounds(rectF, true);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        Matrix matrix = this.k;
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale((width - f2) / fWidth, (height - f4) / fHeight);
        matrix.postTranslate(f2, f4);
        Path path2 = this.d;
        path.transform(matrix, path2);
        PathMeasure pathMeasure = this.f;
        pathMeasure.setPath(path2, false);
        this.g = pathMeasure.getLength();
        setTrimEndValue(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTrimEndValue() <= 0.0f || this.g <= 0.0f) {
            return;
        }
        Path path = this.e;
        path.reset();
        this.f.getSegment(0.0f, this.g * getTrimEndValue(), path, true);
        canvas.drawPath(path, this.i);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.i.setColor(pq3.j.h(this).l().a);
    }

    public final void setPadding(int i) {
        this.a = i;
        invalidate();
        requestLayout();
    }

    public final void setStartAnimationDelay(long j) {
        this.b = j;
    }
}
