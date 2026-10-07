package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class hia extends LayerDrawable {
    public final int a;
    public final int b;
    public final int c;
    public int d;

    public hia() {
        super(new Drawable[0]);
        this.a = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 4.0f);
        this.c = addLayer(gradientDrawable);
        this.d = -1;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMax = Math.max(Math.min(rect.width(), rect.height()), this.a);
        setLayerSize(this.c, iMax, iMax);
        int i = this.d;
        if (i >= 0) {
            int i2 = this.b;
            setLayerSize(i, i2, i2);
        }
        super.onBoundsChange(rect);
    }
}
