package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class pvh extends mn8 {
    public static final void d(pvh pvhVar, RecyclerView recyclerView) {
        vee layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.X0() > 0) {
            return;
        }
        recyclerView.w0(0);
    }

    @Override // defpackage.mn8
    public final pee c(RecyclerView recyclerView, nee neeVar) {
        return new ovh(this, recyclerView);
    }
}
