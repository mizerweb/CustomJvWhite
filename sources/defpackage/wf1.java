package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class wf1 extends tee {
    public final int a = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
    public final int b = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
    public final int c = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
    public final int d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int iP = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        uf1 uf1Var = adapter instanceof uf1 ? (uf1) adapter : null;
        if (uf1Var != null && iP >= 0 && iP < uf1Var.l()) {
            k79 k79Var = (k79) uf1Var.F(iP);
            ag1 ag1Var = k79Var instanceof ag1 ? (ag1) k79Var : null;
            k79 k79VarJ = uf1Var.J(iP + 1);
            ag1 ag1Var2 = k79VarJ instanceof ag1 ? (ag1) k79VarJ : null;
            boolean z = iP == 0;
            int i2 = this.d;
            rect.left = i2;
            rect.right = i2;
            if (ag1Var instanceof zf1) {
                i = this.a;
            } else {
                i = z ? this.b : 0;
            }
            rect.top = i;
            rect.bottom = cqk.d(ag1Var != null ? Integer.valueOf(ag1Var.A()) : null, ag1Var2 != null ? Integer.valueOf(ag1Var2.A()) : null) ? 0 : this.c;
        }
    }
}
