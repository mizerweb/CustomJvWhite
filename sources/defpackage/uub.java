package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes.dex */
public final class uub extends Drawable implements eph {
    public final ap9 a;
    public tub b;
    public sub c;
    public final ShapeDrawable d;
    public final ny8 e;
    public final Path f;
    public final ny8 g;
    public final ny8 h;
    public final Paint i;

    public uub(ap9 ap9Var, tub tubVar, sub subVar) {
        this.a = ap9Var;
        this.b = tubVar;
        this.c = subVar;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = yl5.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.d = shapeDrawable;
        this.e = rx8.P(3, new j68(15));
        this.f = new Path();
        this.g = rx8.P(3, new j68(16));
        this.h = rx8.P(3, new j68(17));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.i = paint;
    }

    public final void a(Path path, Rect rect) {
        int iOrdinal = this.c.ordinal();
        ny8 ny8Var = this.g;
        if (iOrdinal == 0) {
            float fK = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            float fK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            float fK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            Matrix matrixC = c();
            matrixC.reset();
            matrixC.postScale(1.0f, -1.0f, 0.0f, 4.0f);
            matrixC.postScale(fK / 20.0f, fK2 / 8.0f);
            matrixC.postTranslate(rect.left + fK3, rect.bottom - fK2);
            path.addPath((Path) ny8Var.getValue(), c());
            return;
        }
        if (iOrdinal == 1) {
            float fK4 = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            float fK5 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            Matrix matrixC2 = c();
            matrixC2.reset();
            matrixC2.postScale(1.0f, -1.0f, 0.0f, 4.0f);
            matrixC2.postScale(fK4 / 20.0f, fK5 / 8.0f);
            matrixC2.postTranslate(((rect.width() - fK4) / 2.0f) + rect.left, rect.bottom - fK5);
            path.addPath((Path) this.h.getValue(), c());
            return;
        }
        if (iOrdinal != 2) {
            ore.o();
            return;
        }
        float fK6 = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        float fK7 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        float fK8 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        Matrix matrixC3 = c();
        matrixC3.reset();
        matrixC3.postScale(-1.0f, -1.0f, 10.0f, 4.0f);
        matrixC3.postScale(fK6 / 20.0f, fK7 / 8.0f);
        matrixC3.postTranslate((rect.right - fK6) - fK8, rect.bottom - fK7);
        path.addPath((Path) ny8Var.getValue(), c());
    }

    public final void b(Path path, Rect rect) {
        int iOrdinal = this.c.ordinal();
        ny8 ny8Var = this.g;
        if (iOrdinal == 0) {
            float fK = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            float fK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            Matrix matrixC = c();
            matrixC.reset();
            matrixC.setScale(fK / 20.0f, fK2 / 8.0f);
            matrixC.postTranslate(rect.left + gm0.K(12.0f * yl5.d().getDisplayMetrics().density), rect.top);
            path.addPath((Path) ny8Var.getValue(), c());
            return;
        }
        if (iOrdinal == 1) {
            float fK3 = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
            float fK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            Matrix matrixC2 = c();
            matrixC2.reset();
            matrixC2.setScale(fK3 / 20.0f, fK4 / 8.0f);
            matrixC2.postTranslate(((rect.width() - fK3) / 2.0f) + rect.left, rect.top);
            path.addPath((Path) this.h.getValue(), c());
            return;
        }
        if (iOrdinal != 2) {
            ore.o();
            return;
        }
        float fK5 = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        float fK6 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        float fK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        Matrix matrixC3 = c();
        matrixC3.reset();
        matrixC3.postScale(-1.0f, 1.0f, 10.0f, 0.0f);
        matrixC3.postScale(fK5 / 20.0f, fK6 / 8.0f);
        matrixC3.postTranslate((rect.right - fK5) - fK7, rect.top);
        path.addPath((Path) ny8Var.getValue(), c());
    }

    public final Matrix c() {
        return (Matrix) this.e.getValue();
    }

    public final void d(tub tubVar, sub subVar) {
        this.b = tubVar;
        this.c = subVar;
        Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            rect.top = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, getBounds().top);
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            rect.bottom = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, getBounds().bottom);
        }
        this.d.setBounds(rect);
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.d.draw(canvas);
        canvas.drawPath(this.f, this.i);
    }

    public final void e() {
        Path path = this.f;
        path.reset();
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            b(path, getBounds());
        } else if (iOrdinal == 1) {
            a(path, getBounds());
        } else {
            ore.o();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            rect2.top = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, rect.top);
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            rect2.bottom = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, rect.bottom);
        }
        this.d.setBounds(rect2);
        e();
        Path path = this.f;
        path.reset();
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            b(path, rect);
        } else if (iOrdinal2 == 1) {
            a(path, rect);
        } else {
            ore.o();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint = this.d.getPaint();
        ap9 ap9Var = this.a;
        paint.setColor(((Number) ap9Var.invoke()).intValue());
        this.i.setColor(((Number) ap9Var.invoke()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
