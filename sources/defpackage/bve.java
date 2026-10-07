package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bve extends t97 implements xue {
    public final int e;
    public final RectF f;
    public final float[] g;
    public final float[] h;
    public final Paint i;
    public boolean j;
    public float k;
    public int l;
    public int m;
    public float n;
    public final Path o;
    public final Path p;
    public final RectF q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bve(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.e = 1;
        this.f = new RectF();
        this.g = new float[8];
        this.h = new float[8];
        this.i = new Paint(1);
        this.j = false;
        this.k = 0.0f;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
    }

    @Override // defpackage.xue
    public final void a(int i, float f) {
        this.l = i;
        this.k = f;
        p();
        invalidateSelf();
    }

    @Override // defpackage.xue
    public final void b(boolean z) {
        this.j = z;
        p();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        int iD = qt4.D(this.e);
        Path path = this.o;
        Paint paint = this.i;
        if (iD == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.m);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(false);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.j) {
                float fWidth = ((rectF.width() - rectF.height()) + this.k) / 2.0f;
                float fHeight = ((rectF.height() - rectF.width()) + this.k) / 2.0f;
                if (fWidth > 0.0f) {
                    float f = rectF.left;
                    canvas2 = canvas;
                    canvas2.drawRect(f, rectF.top, f + fWidth, rectF.bottom, paint);
                    float f2 = rectF.right;
                    canvas2.drawRect(f2 - fWidth, rectF.top, f2, rectF.bottom, paint);
                } else {
                    canvas2 = canvas;
                }
                if (fHeight > 0.0f) {
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    canvas2.drawRect(f3, f4, rectF.right, f4 + fHeight, paint);
                    float f5 = rectF.left;
                    float f6 = rectF.bottom;
                    canvas2.drawRect(f5, f6 - fHeight, rectF.right, f6, paint);
                }
            }
            if (this.l != 0) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.l);
                paint.setStrokeWidth(this.k);
                path.setFillType(Path.FillType.EVEN_ODD);
                canvas2.drawPath(this.p, paint);
            }
        }
        if (iD == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        canvas2 = canvas;
        if (this.l != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.l);
            paint.setStrokeWidth(this.k);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas2.drawPath(this.p, paint);
        }
    }

    @Override // defpackage.xue
    public final void e(float f) {
        this.n = f;
        p();
        invalidateSelf();
    }

    @Override // defpackage.xue
    public final void g() {
        Arrays.fill(this.g, 0.0f);
        p();
        invalidateSelf();
    }

    @Override // defpackage.xue
    public final void h() {
    }

    @Override // defpackage.xue
    public final void j() {
    }

    @Override // defpackage.xue
    public final void l() {
        p();
        invalidateSelf();
    }

    @Override // defpackage.xue
    public final void m(float[] fArr) {
        float[] fArr2 = this.g;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            oc9.j("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        p();
        invalidateSelf();
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }

    public final void p() {
        float[] fArr;
        Path path = this.o;
        path.reset();
        Path path2 = this.p;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.q;
        rectF.set(bounds);
        float f = this.n;
        rectF.inset(f, f);
        if (this.e == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z = this.j;
        float[] fArr2 = this.g;
        if (z) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = -this.n;
        rectF.inset(f2, f2);
        float f3 = this.k / 2.0f;
        rectF.inset(f3, f3);
        if (this.j) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.h;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.n) - (this.k / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = (-this.k) / 2.0f;
        rectF.inset(f4, f4);
    }
}
