package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class qg8 extends Drawable {
    public static final /* synthetic */ zv8[] j = {new z8b(qg8.class, "innerDrawable", "getInnerDrawable()Landroid/graphics/drawable/Drawable;"), zo5.e(zfe.a, qg8.class, "strokeColor", "getStrokeColor()I")};
    public final float a;
    public final float b;
    public final float[] c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final Path g;
    public final pg8 h;
    public final pg8 i;

    public qg8(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.b;
        }
        this.c = fArr;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(this.a);
        this.d = paint;
        this.e = new RectF();
        this.f = new Path();
        this.g = new Path();
        this.h = new pg8(this);
        this.i = new pg8(Integer.valueOf(i), this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.drawPath(this.f, this.d);
            pg8 pg8Var = this.h;
            zv8 zv8Var = j[0];
            Drawable drawable = (Drawable) pg8Var.b;
            if (drawable != null) {
                Path path = this.g;
                iSave = canvas.save();
                canvas.clipPath(path);
                try {
                    drawable.draw(canvas);
                    canvas.restoreToCount(iSave);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            super.getOutline(outline);
        } else {
            outline.setPath(this.g);
            outline.setAlpha(0.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        Path path = this.f;
        path.reset();
        float f = rect.left;
        float f2 = this.a / 2.0f;
        float f3 = rect.top + f2;
        float f4 = rect.right - f2;
        float f5 = rect.bottom - f2;
        RectF rectF = this.e;
        rectF.set(f + f2, f3, f4, f5);
        float[] fArr2 = new float[8];
        int i = 0;
        while (true) {
            fArr = this.c;
            if (i >= 8) {
                break;
            }
            float f6 = fArr[i] - f2;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            fArr2[i] = f6;
            i++;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr2, direction);
        Path path2 = this.g;
        path2.reset();
        rectF.set(rect);
        path2.addRoundRect(rectF, fArr, direction);
        zv8 zv8Var = j[0];
        Drawable drawable = (Drawable) this.h.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
