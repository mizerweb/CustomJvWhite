package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zue extends Drawable implements xue {
    public final int j;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public final Paint c = new Paint(1);
    public boolean d = false;
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public final Path h = new Path();
    public final Path i = new Path();
    public final RectF k = new RectF();
    public int l = 255;

    public zue(int i) {
        this.j = 0;
        if (this.j != i) {
            this.j = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.xue
    public final void a(int i, float f) {
        if (this.g != i) {
            this.g = i;
            invalidateSelf();
        }
        if (this.e != f) {
            this.e = f;
            c();
            invalidateSelf();
        }
    }

    @Override // defpackage.xue
    public final void b(boolean z) {
        this.d = z;
        c();
        invalidateSelf();
    }

    public final void c() {
        float[] fArr;
        Path path = this.h;
        path.reset();
        Path path2 = this.i;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        float f = this.e / 2.0f;
        rectF.inset(f, f);
        boolean z = this.d;
        float[] fArr2 = this.a;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.b;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.f) - (this.e / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-this.e) / 2.0f;
        rectF.inset(f2, f2);
        float f3 = this.f + 0.0f;
        rectF.inset(f3, f3);
        if (this.d) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iU = np4.u(this.j, this.l);
        Paint paint = this.c;
        paint.setColor(iU);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.h, paint);
        if (this.e != 0.0f) {
            paint.setColor(np4.u(this.g, this.l));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.e);
            canvas.drawPath(this.i, paint);
        }
    }

    @Override // defpackage.xue
    public final void e(float f) {
        if (this.f != f) {
            this.f = f;
            c();
            invalidateSelf();
        }
    }

    @Override // defpackage.xue
    public final void g() {
        Arrays.fill(this.a, 0.0f);
        c();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iU = np4.u(this.j, this.l) >>> 24;
        if (iU != 0) {
            return iU != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // defpackage.xue
    public final void h() {
    }

    @Override // defpackage.xue
    public final void j() {
    }

    @Override // defpackage.xue
    public final void l() {
    }

    @Override // defpackage.xue
    public final void m(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            oc9.j("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        c();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.l) {
            this.l = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
