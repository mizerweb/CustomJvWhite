package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ei1 extends rb5 {
    public final /* synthetic */ xva t;

    public ei1(xva xvaVar) {
        this.t = xvaVar;
        this.d = 300L;
        this.c = 300L;
        this.f = 300L;
        this.e = 300L;
    }

    @Override // defpackage.rb5
    public final void r() {
        RecyclerView recyclerView = (RecyclerView) this.t.b;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                p51.d();
            } else {
                layoutParams.height = -2;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }
}
