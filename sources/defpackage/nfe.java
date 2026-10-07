package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class nfe extends l4 {
    public final RecyclerView d;
    public final mfe e;

    public nfe(RecyclerView recyclerView) {
        this.d = recyclerView;
        mfe mfeVar = this.e;
        if (mfeVar != null) {
            this.e = mfeVar;
        } else {
            this.e = new mfe(this);
        }
    }

    @Override // defpackage.l4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.W()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().a0(accessibilityEvent);
        }
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, x4Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.W() || recyclerView.getLayoutManager() == null) {
            return;
        }
        vee layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.b0(recyclerView2.c, recyclerView2.G1, x4Var);
    }

    @Override // defpackage.l4
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.W() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        vee layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.q0(recyclerView2.c, recyclerView2.G1, i, bundle);
    }
}
