package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class bef extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(zo5.D(150.0f, yl5.d().getDisplayMetrics().density, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
    }
}
