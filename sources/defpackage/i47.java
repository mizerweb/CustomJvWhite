package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class i47 extends r1c {
    @Override // defpackage.r1c, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(r5a.f(8.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i2)) - gm0.K(128.0f * yl5.d().getDisplayMetrics().density), 1073741824));
    }
}
