package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class fx extends LinearLayout {
    public final float a;
    public final int b;

    public fx(Context context, int i) {
        super(context);
        this.a = 0.5625f;
        this.b = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        long jA = ex.a(this, this.a, this.b, i, i2);
        if (bj8.b(jA, ex.a)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure((int) (jA >> 32), (int) (jA & 4294967295L));
        }
    }
}
