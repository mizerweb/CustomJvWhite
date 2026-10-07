package defpackage;

import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class zo9 extends ScrollView {
    public int a;

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int i3 = this.a;
        super.onMeasure(i, mode == 0 ? View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), mode));
    }

    public final void setMaxHeight(int i) {
        this.a = i;
    }
}
