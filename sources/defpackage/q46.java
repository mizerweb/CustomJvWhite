package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q46 extends tee {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);

    public q46(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        sr srVar;
        nee adapter = recyclerView.getAdapter();
        if (adapter != null && (iP = RecyclerView.P(view)) >= 0 && iP < adapter.l()) {
            int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
            int i = this.a;
            int iA = d0m.a(recyclerView, iK, i);
            GridLayoutManager gridLayoutManagerC0 = tre.c0(recyclerView);
            if (gridLayoutManagerC0 == null || (srVar = gridLayoutManagerC0.K) == null) {
                return;
            }
            int iO = srVar.O(iP, i);
            if (adapter.n(iP) == R.id.oneme_media_keyboard_view_type_category_emoji) {
                rect.top = this.d;
                return;
            }
            boolean z = this.c;
            int i2 = this.b;
            if (!z) {
                i2 /= 2;
            }
            rect.bottom = i2;
            rect.top = i2;
            rect.left = (iO * iA) / i;
            rect.right = iA - (((iO + 1) * iA) / i);
        }
    }
}
