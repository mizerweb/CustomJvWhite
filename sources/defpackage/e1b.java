package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: loaded from: classes3.dex */
public final class e1b extends DrawableWrapper {
    public static final zo7 b = new zo7(23);
    public static final int c = gm0.K(50.0f * yl5.d().getDisplayMetrics().density);
    public static final int d = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
    public static final ifh e = new ifh(new cka(3));
    public Shape a;

    public e1b(StateListDrawable stateListDrawable) {
        super(stateListDrawable);
        this.a = null;
    }

    public final void a(Shape shape) {
        if (cqk.d(this.a, shape)) {
            return;
        }
        this.a = shape;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.draw(canvas);
        Shape shape = this.a;
        ifh ifhVar = e;
        if (shape != null) {
            shape.draw(canvas, (Paint) ifhVar.getValue());
        } else {
            canvas.drawPaint((Paint) ifhVar.getValue());
        }
    }
}
