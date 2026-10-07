package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class gtg extends View {
    public int a;
    public int b;
    public float c;
    public final float d;
    public final float e;
    public final float f;
    public final Paint g;
    public final Paint h;
    public final RectF i;

    public gtg(Context context) {
        super(context);
        this.d = yl5.d().getDisplayMetrics().density * 4.0f;
        this.e = yl5.d().getDisplayMetrics().density * 4.0f;
        this.f = yl5.d().getDisplayMetrics().density * 8.0f;
        Paint paint = new Paint(1);
        a8g a8gVar = pq3.j;
        paint.setColor(a8gVar.l(this).b.getIcon().e);
        this.g = paint;
        Paint paint2 = new Paint(1);
        a8gVar.l(this);
        paint2.setColor(-1);
        this.h = paint2;
        this.i = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        float f = this.e;
        float width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) - ((i - 1) * f);
        int i2 = this.a;
        float f2 = width / i2;
        int i3 = 0;
        while (i3 < i2) {
            float paddingStart = ((f2 + f) * i3) + getPaddingStart();
            float f3 = paddingStart + f2;
            RectF rectF = this.i;
            float f4 = this.d;
            rectF.set(paddingStart, 0.0f, f3, f4);
            Paint paint = this.g;
            float f5 = this.f;
            canvas.drawRoundRect(rectF, f5, f5, paint);
            int i4 = this.b;
            if (i3 >= i4) {
                f3 = i3 == i4 ? (this.c * f2) + paddingStart : paddingStart;
            }
            if (f3 > paddingStart) {
                rectF.set(paddingStart, 0.0f, f3, f4);
                canvas.drawRoundRect(rectF, f5, f5, this.h);
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), (int) this.d);
    }

    public final void setup(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a = i;
        this.b = 0;
        this.c = 0.0f;
        invalidate();
    }
}
