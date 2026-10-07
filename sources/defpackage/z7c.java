package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class z7c extends ImageView {
    public float a;
    public Path b;
    public final Paint c;
    public final float d;
    public final float e;
    public final float f;

    public z7c(Context context) {
        super(context, null);
        Paint paint = new Paint();
        paint.setColor(0);
        this.c = paint;
        this.d = yl5.d().getDisplayMetrics().density * 0.0f;
        this.e = yl5.d().getDisplayMetrics().density * 0.0f;
        this.f = yl5.d().getDisplayMetrics().density * 1.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        Path path = this.b;
        if (path != null) {
            int iSave = canvas.save();
            try {
                int width = (canvas.getWidth() - getPaddingLeft()) - getPaddingRight();
                float f = this.a;
                float f2 = (f <= 0.0f || width <= 0) ? 1.0f : width / f;
                canvas.translate(getPaddingLeft(), getPaddingTop());
                canvas.scale(f2, f2);
                float f3 = this.f;
                float f4 = this.d;
                float f5 = this.e;
                pq3.j.h(this);
                paint.setShadowLayer(f3, f4, f5, 687865856);
                canvas.drawPath(path, paint);
                paint.clearShadowLayer();
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        super.onDraw(canvas);
    }
}
