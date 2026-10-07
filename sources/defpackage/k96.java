package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class k96 extends w66 {
    public final Rect n2;
    public i96 o2;
    public int p2;
    public boolean q2;
    public boolean r2;
    public boolean s2;
    public g96 t2;
    public final j96 u2;
    public final ny8 v2;
    public final ny8 w2;

    public k96(Context context) {
        super(context);
        this.n2 = new Rect();
        this.p2 = 1;
        this.u2 = new j96(this);
        this.v2 = rx8.P(3, new rgb(context, 3));
        this.w2 = rx8.P(3, new d2(19, this));
    }

    private final long getFrameIntervalNanos() {
        return ((Number) this.v2.getValue()).longValue();
    }

    private final String getTag() {
        return (String) this.w2.getValue();
    }

    @Override // defpackage.w66
    public final void G0(nee neeVar) {
        if (neeVar != null) {
            w66.I0(neeVar, this.u2);
        }
    }

    @Override // defpackage.w66
    public final void H0() {
        nee adapter = getAdapter();
        if (adapter != null) {
            w66.J0(adapter, this.u2);
        }
    }

    public final boolean M0() {
        View childAt;
        if (getChildCount() == 0) {
            String tag = getTag();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, tag, "No views in recycler for calculating ViewPort", null);
                    return false;
                }
            }
        } else {
            vee layoutManager = getLayoutManager();
            if (layoutManager != null && (childAt = getChildAt(0)) != null) {
                layoutManager.A(this.n2, childAt);
                boolean z = this.n2.top <= getTop();
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 != null) {
                    layoutManager.A(this.n2, childAt2);
                    boolean z2 = this.n2.bottom >= getBottom();
                    this.n2.setEmpty();
                    if (z && z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.s2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) getLayoutManager();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            gm0.V("EndlessRecyclerView2", "onLayout", e);
        }
        i96 i96Var = this.o2;
        if (i96Var != null) {
            i96Var.b(this, 0, 0);
        }
    }

    public final void setDelegate(g96 g96Var) {
        this.t2 = g96Var;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.s2 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(vee veeVar) {
        if (veeVar instanceof LinearLayoutManager) {
            super.setLayoutManager(veeVar);
        } else {
            ore.p("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
    }

    public final void setPager(f96 f96Var) {
        if (f96Var == null) {
            afe afeVar = this.o2;
            if (afeVar != null) {
                r0(afeVar);
                this.o2 = null;
                return;
            }
            return;
        }
        i96 i96Var = new i96(this, f96Var);
        int i = this.p2;
        if (i > 0) {
            i96Var.b = i;
        }
        k(i96Var);
        this.o2 = i96Var;
    }

    public final void setRefreshingNext(boolean z) {
        if (this.q2 == z) {
            return;
        }
        g96 g96Var = this.t2;
        if (z) {
            if (g96Var != null) {
                g96Var.g();
            }
        } else if (g96Var != null) {
            g96Var.i();
        }
        this.q2 = z;
    }

    public final void setRefreshingNextDelegate(kge kgeVar) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.r2 == z) {
            return;
        }
        this.r2 = z;
    }

    public final void setThreshold(int i) {
        this.p2 = i;
        i96 i96Var = this.o2;
        if (i96Var == null || i <= 0) {
            return;
        }
        i96Var.b = i;
    }
}
