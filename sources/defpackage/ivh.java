package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes2.dex */
public final class ivh extends Drawable implements eph {
    public final af7 a;
    public final int b;
    public int c;
    public final ShapeDrawable d;
    public final Path e;
    public final Paint f;

    public ivh(af7 af7Var, int i, int i2) {
        this.a = af7Var;
        this.b = i;
        this.c = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = yl5.d().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.d = shapeDrawable;
        this.e = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.f = paint;
    }

    public final void a(Path path, Rect rect) {
        float fK;
        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        int iD = qt4.D(this.c);
        if (iD == 0) {
            fK = (iK / 2.0f) + gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        } else if (iD == 1) {
            fK = rect.width() / 2.0f;
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            fK = (rect.width() - (iK / 2.0f)) - gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        }
        float f = fK;
        float f2 = iK / 2.0f;
        float f3 = rect.bottom - iK2;
        path.moveTo(f - f2, f3);
        float f4 = rect.bottom;
        path.cubicTo(f, f4, f, f4, f + f2, f3);
    }

    public final void b(Path path, Rect rect) {
        float fK;
        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        int iD = qt4.D(this.c);
        if (iD == 0) {
            fK = (iK / 2.0f) + gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        } else if (iD == 1) {
            fK = rect.width() / 2.0f;
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            fK = (rect.width() - (iK / 2.0f)) - gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        }
        float f = fK;
        float f2 = iK / 2.0f;
        float f3 = rect.top + iK2;
        path.moveTo(f + f2, f3);
        float f4 = rect.top;
        path.cubicTo(f, f4, f, f4, f - f2, f3);
    }

    public final void c() {
        Path path = this.e;
        path.reset();
        int iD = qt4.D(this.b);
        if (iD == 0) {
            b(path, getBounds());
        } else if (iD == 1) {
            a(path, getBounds());
        } else {
            ore.o();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.d.draw(canvas);
        canvas.drawPath(this.e, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int i = this.b;
        int iD = qt4.D(i);
        if (iD == 0) {
            rect2.top = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, rect.top);
        } else if (iD != 1) {
            ore.o();
            return;
        } else {
            rect2.bottom = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, rect.bottom);
        }
        this.d.setBounds(rect2);
        c();
        Path path = this.e;
        path.reset();
        int iD2 = qt4.D(i);
        if (iD2 == 0) {
            b(path, rect);
        } else if (iD2 == 1) {
            a(path, rect);
        } else {
            ore.o();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint = this.d.getPaint();
        af7 af7Var = this.a;
        paint.setColor(((Number) af7Var.invoke()).intValue());
        this.f.setColor(((Number) af7Var.invoke()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
