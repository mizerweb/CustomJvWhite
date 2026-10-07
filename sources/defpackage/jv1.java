package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class jv1 extends tee {
    public final int a = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
    public final int b = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        gv1 gv1Var = adapter instanceof gv1 ? (gv1) adapter : null;
        if (gv1Var != null && iP >= 0 && iP < gv1Var.l()) {
            int i = this.b;
            rect.left = i;
            rect.right = i;
            rect.top = this.a;
            rect.bottom = 0;
        }
    }
}
