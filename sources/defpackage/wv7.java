package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wv7 extends View {
    public static final /* synthetic */ zv8[] f = {new z8b(wv7.class, "highlightRadius", "getHighlightRadius()F"), zo5.e(zfe.a, wv7.class, "shadowColor", "getShadowColor()I")};
    public final pw a;
    public final vv7 b;
    public final vv7 c;
    public final Paint d;
    public final Path e;

    public wv7(Context context) {
        super(context);
        this.a = new pw(0);
        this.b = new vv7(Float.valueOf(yl5.d().getDisplayMetrics().density * 16.0f), this, 0);
        this.c = new vv7(Integer.valueOf(pq3.j.e(context).m().b().g), this, 1);
        Paint paint = new Paint();
        paint.setColor(getShadowColor());
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.d = paint;
        this.e = new Path();
    }

    public final float getHighlightRadius() {
        zv8 zv8Var = f[0];
        return ((Number) this.b.b).floatValue();
    }

    public final int getShadowColor() {
        zv8 zv8Var = f[1];
        return ((Number) this.c.b).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.e;
        path.reset();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        Iterator<E> it = this.a.iterator();
        while (it.hasNext()) {
            path.addRoundRect((RectF) it.next(), getHighlightRadius(), getHighlightRadius(), Path.Direction.CCW);
        }
        canvas.drawPath(path, this.d);
    }

    public final void setHighlightRadius(float f2) {
        this.b.B(this, f[0], Float.valueOf(f2));
    }

    public final void setShadowColor(int i) {
        this.c.B(this, f[1], Integer.valueOf(i));
    }
}
