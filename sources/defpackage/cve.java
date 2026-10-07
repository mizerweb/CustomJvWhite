package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class cve extends Drawable implements xue, w1i {
    public final Drawable a;
    public boolean b = false;
    public boolean c = false;
    public float d = 0.0f;
    public final Path e = new Path();
    public boolean f = true;
    public int g = 0;
    public final Path h = new Path();
    public final float[] i = new float[8];
    public final float[] j = new float[8];
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final RectF n = new RectF();
    public final Matrix o = new Matrix();
    public final Matrix p = new Matrix();
    public final Matrix q = new Matrix();
    public final Matrix r = new Matrix();
    public final Matrix s = new Matrix();
    public final Matrix t = new Matrix();
    public float u = 0.0f;
    public boolean v = true;
    public x1i w;

    public cve(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.xue
    public final void a(int i, float f) {
        if (this.g == i && this.d == f) {
            return;
        }
        this.g = i;
        this.d = f;
        this.v = true;
        invalidateSelf();
    }

    @Override // defpackage.xue
    public final void b(boolean z) {
        this.b = z;
        this.v = true;
        invalidateSelf();
    }

    public final void c() {
        float[] fArr;
        if (this.v) {
            Path path = this.h;
            path.reset();
            float f = this.d / 2.0f;
            RectF rectF = this.k;
            rectF.inset(f, f);
            boolean z = this.b;
            float[] fArr2 = this.i;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (fArr2[i] + this.u) - (this.d / 2.0f);
                    i++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-this.d) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.e;
            path2.reset();
            float f3 = this.u + 0.0f;
            rectF.inset(f3, f3);
            if (this.b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.v = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public void d() {
        x1i x1iVar = this.w;
        RectF rectF = this.k;
        Matrix matrix = this.q;
        if (x1iVar != null) {
            x1iVar.c(matrix);
            this.w.i(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        Drawable drawable = this.a;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF2 = this.m;
        rectF2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        Rect bounds = drawable.getBounds();
        RectF rectF3 = this.n;
        rectF3.set(bounds);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix2 = this.o;
        matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
        Matrix matrix3 = this.r;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.p;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.f = true;
            matrix.invert(this.s);
            Matrix matrix5 = this.t;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.l;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.v = true;
        rectF4.set(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        qe7.v();
        this.a.draw(canvas);
        qe7.v();
    }

    @Override // defpackage.xue
    public final void e(float f) {
        if (this.u != f) {
            this.u = f;
            this.v = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.w1i
    public final void f(x1i x1iVar) {
        this.w = x1iVar;
    }

    @Override // defpackage.xue
    public final void g() {
        Arrays.fill(this.i, 0.0f);
        this.c = false;
        this.v = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // defpackage.xue
    public void h() {
    }

    @Override // defpackage.xue
    public final void j() {
    }

    @Override // defpackage.xue
    public final void l() {
    }

    @Override // defpackage.xue
    public final void m(float[] fArr) {
        float[] fArr2 = this.i;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.c = false;
        } else {
            oc9.j("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > 0.0f;
            }
        }
        this.v = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
