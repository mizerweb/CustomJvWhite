package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes4.dex */
public final class u79 implements AbsListView.OnScrollListener {
    public final /* synthetic */ w79 a;

    public u79(w79 w79Var) {
        this.a = w79Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        w79 w79Var = this.a;
        s79 s79Var = w79Var.r;
        es esVar = w79Var.z;
        if (i != 1 || esVar.getInputMethodMode() == 2 || esVar.getContentView() == null) {
            return;
        }
        w79Var.v.removeCallbacks(s79Var);
        s79Var.run();
    }
}
