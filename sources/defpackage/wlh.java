package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class wlh extends View {
    public static final /* synthetic */ zv8[] k = {new z8b(wlh.class, "alignMode", "getAlignMode()Lone/me/photoeditor/text/TextAlignMode;"), zo5.e(zfe.a, wlh.class, "color", "getColor()I")};
    public final vlh a;
    public final vlh b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ny8 i;
    public final Paint j;

    public wlh(Context context) {
        super(context);
        this.a = new vlh(this, 0);
        this.b = new vlh(this, 1);
        this.c = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        this.d = gm0.K(11.0f * yl5.d().getDisplayMetrics().density);
        this.e = gm0.K(5.0f * yl5.d().getDisplayMetrics().density);
        this.f = gm0.J(((double) yl5.d().getDisplayMetrics().density) * 4.5d);
        this.g = gm0.J(((double) yl5.d().getDisplayMetrics().density) * 2.75d);
        this.h = gm0.J(((double) yl5.d().getDisplayMetrics().density) * 5.25d);
        this.i = rx8.P(3, new bpg(9, this));
        Paint paint = new Paint(1);
        paint.setColor(getColor());
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.5f);
        this.j = paint;
    }

    public static float[] a(wlh wlhVar) {
        float startX = wlhVar.getStartX();
        float startY = wlhVar.getStartY();
        float startX2 = wlhVar.getStartX();
        float f = wlhVar.c;
        float startY2 = wlhVar.getStartY();
        float startX3 = wlhVar.getStartX();
        float f2 = wlhVar.f;
        float startY3 = wlhVar.getStartY();
        int i = wlhVar.e;
        float f3 = i;
        float startX4 = wlhVar.getStartX();
        float f4 = wlhVar.d;
        float f5 = i * 2;
        float f6 = i * 3;
        return new float[]{startX, startY, startX2 + f, startY2, startX3 + f2, startY3 + f3, startX4 + f4 + f2, wlhVar.getStartY() + f3, wlhVar.getStartX(), wlhVar.getStartY() + f5, wlhVar.getStartX() + f, wlhVar.getStartY() + f5, wlhVar.getStartX() + f2, wlhVar.getStartY() + f6, wlhVar.getStartX() + f4 + f2, wlhVar.getStartY() + f6};
    }

    public static final void b(wlh wlhVar, ulh ulhVar) {
        int i = wlhVar.d;
        int i2 = wlhVar.f;
        int iOrdinal = ulhVar.ordinal();
        if (iOrdinal == 0) {
            wlhVar.getLines()[4] = wlhVar.getStartX();
            float f = i;
            wlhVar.getLines()[6] = wlhVar.getStartX() + f;
            wlhVar.getLines()[12] = wlhVar.getStartX();
            wlhVar.getLines()[14] = wlhVar.getStartX() + f;
        } else if (iOrdinal == 1) {
            float f2 = i2;
            wlhVar.getLines()[4] = wlhVar.getStartX() + f2;
            float f3 = i;
            wlhVar.getLines()[6] = wlhVar.getStartX() + f3 + f2;
            wlhVar.getLines()[12] = wlhVar.getStartX() + f2;
            wlhVar.getLines()[14] = wlhVar.getStartX() + f3 + f2;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            float f4 = i2 * 2;
            wlhVar.getLines()[4] = wlhVar.getStartX() + f4;
            float f5 = i;
            wlhVar.getLines()[6] = wlhVar.getStartX() + f5 + f4;
            wlhVar.getLines()[12] = wlhVar.getStartX() + f4;
            wlhVar.getLines()[14] = wlhVar.getStartX() + f5 + f4;
        }
        wlhVar.invalidate();
    }

    private final float[] getLines() {
        return (float[]) this.i.getValue();
    }

    private final float getStartX() {
        return getPaddingLeft() + this.g;
    }

    private final float getStartY() {
        return getPaddingTop() + this.h;
    }

    public final ulh getAlignMode() {
        zv8 zv8Var = k[0];
        return (ulh) this.a.b;
    }

    public final int getColor() {
        zv8 zv8Var = k[1];
        return ((Number) this.b.b).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLines(getLines(), this.j);
    }

    public final void setAlignMode(ulh ulhVar) {
        this.a.B(this, k[0], ulhVar);
    }

    public final void setColor(int i) {
        this.b.B(this, k[1], Integer.valueOf(i));
    }
}
