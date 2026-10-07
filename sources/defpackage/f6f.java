package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class f6f extends gpl {
    public final RecyclerView a;

    public f6f(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.gpl
    public final void a(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            gm0.Y("ContextMenu.ScrollHelper", "Can't fit view into desired rect!");
            return;
        }
        int i = rect.top;
        int i2 = rect2.top;
        boolean z = false;
        RecyclerView recyclerView = this.a;
        if (i < i2) {
            int i3 = i - i2;
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int i4 = iComputeVerticalScrollOffset + i3;
            if (iComputeVerticalScrollOffset > 0) {
                recyclerView.scrollBy(0, i3);
            }
            if (i4 < 0) {
                recyclerView.b0(Math.abs(i4));
                recyclerView.X();
            }
            rect.offset(0, -i3);
            return;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 > i6) {
            int i7 = i5 - i6;
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset());
            if (iComputeVerticalScrollRange < 0) {
                iComputeVerticalScrollRange = 0;
            }
            if (iComputeVerticalScrollRange > 0) {
                recyclerView.scrollBy(0, i7);
            }
            int i8 = iComputeVerticalScrollRange - i7;
            vee layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            nee adapter = recyclerView.getAdapter();
            int iL = (adapter != null ? adapter.l() : 1) - 1;
            boolean z2 = linearLayoutManager != null && linearLayoutManager.U0() == 0;
            if (linearLayoutManager != null && linearLayoutManager.Y0() == iL) {
                z = true;
            }
            if (z2 && z) {
                recyclerView.b0(-i7);
            } else if (i8 < 0) {
                recyclerView.b0(i8);
            }
        }
    }
}
