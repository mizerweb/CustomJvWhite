package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class lx3 extends View {
    public static final /* synthetic */ zv8[] i = {new z8b(lx3.class, "isColorSelected", "isColorSelected()Z"), zo5.e(zfe.a, lx3.class, "strokeWidthPx", "getStrokeWidthPx()F"), new z8b(lx3.class, "strokeColor", "getStrokeColor()I"), new z8b(lx3.class, "insideColor", "getInsideColor()I")};
    public final kx3 a;
    public final kx3 b;
    public final kx3 c;
    public final kx3 d;
    public final int[] e;
    public final Matrix f;
    public final Paint g;
    public final Paint h;

    public lx3(Context context) {
        super(context, null, 0, 0);
        this.a = new kx3(this, 0);
        this.b = new kx3(Float.valueOf(yl5.d().getDisplayMetrics().density * 3.0f), this);
        this.c = new kx3(this, 2);
        this.d = new kx3(this, 3);
        this.e = new int[]{-12523999, -729075, -326909, -4584750, -16486682, -12523999};
        this.f = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getStrokeWidthPx());
        this.g = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(getInsideColor());
        paint2.setStyle(Paint.Style.FILL);
        this.h = paint2;
    }

    public final int getInsideColor() {
        zv8 zv8Var = i[3];
        return ((Number) this.d.b).intValue();
    }

    public final int getStrokeColor() {
        zv8 zv8Var = i[2];
        return ((Number) this.c.b).intValue();
    }

    public final float getStrokeWidthPx() {
        zv8 zv8Var = i[1];
        return ((Number) this.b.b).floatValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = (getWidth() - getPaddingRight()) - paddingLeft;
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float f = (width / 2.0f) + paddingLeft;
        float f2 = (height / 2.0f) + paddingTop;
        float fMin = Math.min(width, height) / 2.0f;
        canvas.drawCircle(f, f2, fMin - (getStrokeWidthPx() / 2.0f), this.g);
        canvas.drawCircle(f, f2, (fMin - getStrokeWidthPx()) - (yl5.d().getDisplayMetrics().density * 2.0f), this.h);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float f = i2 / 2.0f;
        float f2 = i3 / 2.0f;
        SweepGradient sweepGradient = new SweepGradient(f, f2, this.e, (float[]) null);
        Matrix matrix = this.f;
        matrix.preRotate(90.0f, f, f2);
        sweepGradient.setLocalMatrix(matrix);
        this.g.setShader(sweepGradient);
    }

    public final void setColorSelected(boolean z) {
        this.a.B(this, i[0], Boolean.valueOf(z));
    }

    public final void setInsideColor(int i2) {
        this.d.B(this, i[3], Integer.valueOf(i2));
    }

    public final void setStrokeColor(int i2) {
        this.c.B(this, i[2], Integer.valueOf(i2));
    }

    public final void setStrokeWidthPx(float f) {
        this.b.B(this, i[1], Float.valueOf(f));
    }
}
