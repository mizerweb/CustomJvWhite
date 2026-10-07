package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class yt5 extends LayerDrawable {
    public final int a;

    public yt5() {
        super(new Drawable[0]);
        this.a = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMax = Math.max(Math.min(rect.width(), rect.height()), this.a);
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (i == 0) {
                setLayerSize(0, iMax, iMax);
            } else if (i == 1) {
                int i2 = (int) (((double) iMax) * 0.85d);
                setLayerSize(1, i2, i2);
            } else if (i == 2) {
                int i3 = (int) (((double) iMax) * 0.65d);
                setLayerSize(2, i3, i3);
            }
        }
        super.onBoundsChange(rect);
    }
}
