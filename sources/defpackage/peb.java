package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class peb extends afe {
    public final zsj a;
    public final cf7 b;
    public boolean c;

    public peb(zsj zsjVar, cf7 cf7Var) {
        this.a = zsjVar;
        this.b = cf7Var;
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (this.c) {
            return;
        }
        vee layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iU0 = gridLayoutManager.U0();
        int iY0 = gridLayoutManager.Y0();
        zsj zsjVar = this.a;
        int iL = zsjVar.l();
        if (iU0 == -1) {
            return;
        }
        this.b.invoke(iY0 == iL + (-1) ? zsjVar.N(iY0) : zsjVar.N(iU0));
    }
}
