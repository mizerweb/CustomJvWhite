package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class prg extends tee {
    public final int a = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
    public final int b = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        nee adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iP = RecyclerView.P(view);
        boolean z = iP == adapter.l() - 1;
        int i = this.a;
        rect.left = iP == 0 ? i : this.b;
        rect.right = z ? i : 0;
    }
}
