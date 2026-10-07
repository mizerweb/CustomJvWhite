package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: loaded from: classes.dex */
public final class qfg extends Shape {
    public final double a;
    public final Path b = new Path();
    public final Rect c = new Rect();

    public qfg(double d) {
        this.a = d;
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        if (canvas == null || paint == null) {
            return;
        }
        canvas.drawPath(this.b, paint);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        int iK = gm0.K(f);
        int iK2 = gm0.K(f2);
        Rect rect = this.c;
        rect.set(0, 0, iK, iK2);
        jxf.a(this.b, this.a, rect);
    }
}
