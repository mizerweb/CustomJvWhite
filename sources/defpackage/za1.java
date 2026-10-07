package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class za1 extends tee {
    public final int a = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
    public final int b = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
    public final int c = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
    public final int d = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
    public final int e = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int iP = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        ca1 ca1Var = adapter instanceof ca1 ? (ca1) adapter : null;
        if (ca1Var != null && iP >= 0 && iP < ca1Var.l()) {
            k79 k79Var = (k79) ca1Var.F(iP);
            fb1 fb1Var = k79Var instanceof fb1 ? (fb1) k79Var : null;
            k79 k79VarJ = ca1Var.J(iP + 1);
            fb1 fb1Var2 = k79VarJ instanceof fb1 ? (fb1) k79VarJ : null;
            int i2 = 0;
            boolean z = iP == 0;
            int i3 = this.e;
            rect.left = i3;
            rect.right = i3;
            if (fb1Var instanceof eb1) {
                i = this.a;
            } else {
                i = z ? this.b : 0;
            }
            rect.top = i;
            if (!cqk.d(fb1Var != null ? Integer.valueOf(fb1Var.A()) : null, fb1Var2 != null ? Integer.valueOf(fb1Var2.A()) : null)) {
                i2 = this.c;
            } else if (fb1Var != null && !fb1Var.g()) {
                i2 = this.d;
            }
            rect.bottom = i2;
        }
    }
}
