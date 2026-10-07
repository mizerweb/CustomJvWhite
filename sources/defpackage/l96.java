package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class l96 extends w66 {
    public final LinkedHashSet n2;
    public final LinkedHashSet o2;
    public e96 p2;
    public c96 q2;
    public boolean r2;
    public boolean s2;
    public int t2;
    public Integer u2;
    public boolean v2;

    public l96(Context context) {
        super(context);
        this.n2 = new LinkedHashSet();
        this.o2 = new LinkedHashSet();
        this.t2 = 1;
        super.setOnScrollListener(new v22(1, this));
    }

    public static final void setRefreshingNext$lambda$0(l96 l96Var) {
        c96 c96Var = l96Var.q2;
        if (c96Var == null) {
            return;
        }
        if (!l96Var.r2) {
            c96Var.o();
        } else {
            c96Var.a.e(c96Var.l() - 1, 1);
        }
    }

    @Override // defpackage.w66
    public final void G0(nee neeVar) {
        this.q2 = neeVar instanceof c96 ? (c96) neeVar : null;
        F0();
    }

    @Override // defpackage.w66
    public final nee L0(nee neeVar) {
        if (neeVar instanceof c96) {
            return neeVar;
        }
        if (neeVar != null) {
            return new c96(this, neeVar);
        }
        return null;
    }

    public final void N0(int i) {
        if (Y()) {
            if (i > 5) {
                return;
            }
            post(new ai(this, i, 11));
            return;
        }
        boolean z = this.s2;
        c96 c96Var = this.q2;
        if (z) {
            if (c96Var != null) {
                c96Var.a.e(0, 1);
            }
        } else if (c96Var != null) {
            c96Var.a.f(0, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0() {
        Iterator it = this.o2.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public nee getAdapter() {
        return this.q2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.v2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        vee layoutManager = super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final kge getRefreshingNextDelegate() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k(afe afeVar) {
        this.n2.add(afeVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            gm0.V("EndlessRecyclerView", "onLayout", e);
        }
        e96 e96Var = this.p2;
        if (e96Var != null) {
            e96Var.b(this, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void r0(afe afeVar) {
        this.n2.remove(afeVar);
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.v2 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(vee veeVar) {
        if ((veeVar instanceof LinearLayoutManager) || (veeVar instanceof StaggeredGridLayoutManager)) {
            super.setLayoutManager(veeVar);
        } else {
            ore.p("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(afe afeVar) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(f96 f96Var) {
        if (f96Var == null) {
            afe afeVar = this.p2;
            if (afeVar != null) {
                r0(afeVar);
                this.p2 = null;
                return;
            }
            return;
        }
        e96 e96Var = new e96(this, f96Var);
        int i = this.t2;
        if (i <= 0) {
            c.o(zo5.h(i, "illegal threshold: "));
            return;
        }
        e96Var.b = i;
        k(e96Var);
        this.p2 = e96Var;
    }

    public final void setProgressView(int i) {
        this.u2 = Integer.valueOf(i);
    }

    public final void setRefreshingNext(boolean z) {
        if (this.r2 == z) {
            return;
        }
        if (z && this.u2 == null) {
            z = false;
        }
        this.r2 = z;
        n1g.Q(this, new k36(5, this), null, 5);
    }

    public final void setRefreshingNextDelegate(kge kgeVar) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.s2 == z) {
            return;
        }
        if (z && this.u2 == null) {
            this.s2 = false;
        } else {
            this.s2 = z;
        }
        N0(0);
    }

    public final void setThreshold(int i) {
        this.t2 = i;
        e96 e96Var = this.p2;
        if (e96Var != null) {
            if (i > 0) {
                e96Var.b = i;
            } else {
                c.o(zo5.h(i, "illegal threshold: "));
            }
        }
    }
}
