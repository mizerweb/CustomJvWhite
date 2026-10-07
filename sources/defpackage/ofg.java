package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ofg extends Drawable {
    public static final /* synthetic */ zv8[] d;
    public final Path a;
    public final Paint b;
    public final t5d c;

    static {
        z8b z8bVar = new z8b(ofg.class, "strokeColor", "getStrokeColor()I");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public ofg(int i) {
        Path path = new Path();
        this.a = path;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        paint.setAntiAlias(true);
        this.b = paint;
        this.c = new t5d(Integer.valueOf(i), 10, this);
        jxf.a(path, 3.5d, getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.a, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        jxf.a(this.a, 3.5d, rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
