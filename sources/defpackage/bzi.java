package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: loaded from: classes2.dex */
public final class bzi extends LayerDrawable {
    public bzi() {
        super(new Drawable[0]);
    }

    public final void a(int i) {
        Paint paint;
        Drawable drawable = getDrawable(0);
        ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            paint.setColor(i);
        }
        Drawable drawable2 = getDrawable(1);
        if (drawable2 != null) {
            drawable2.setTint(-1);
        }
    }

    public final void b(int i) {
        Paint paint;
        Drawable drawable = getDrawable(0);
        ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
        if (shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
            return;
        }
        paint.setColor(i);
    }

    public final void c(int i, Integer num) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        addLayer(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        if (paint != null) {
            paint.setColor(i);
        }
        setLayerSize(0, num.intValue(), num.intValue());
        setLayerGravity(0, 17);
    }
}
