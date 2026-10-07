package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class eo2 extends afe {
    public final g6g a;
    public final cf7 b;

    public eo2(g6g g6gVar, cf7 cf7Var) {
        this.a = g6gVar;
        this.b = cf7Var;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iU0;
        GridLayoutManager gridLayoutManagerC0 = tre.c0(recyclerView);
        if (gridLayoutManagerC0 == null || (iU0 = gridLayoutManagerC0.U0()) == -1) {
            return;
        }
        this.b.invoke((k79) ww3.u1(iU0, this.a.d.f));
    }
}
