package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.List;
import java.util.concurrent.Executor;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lj1 extends wf4 {
    public final ny8 A;
    public final CallGridLayoutManager s;
    public final RecyclerView t;
    public final ct1 u;
    public ij1 v;
    public final ny8 w;
    public wgc x;
    public af7 y;
    public final GestureDetector z;

    public lj1(Context context, ha9 ha9Var, Executor executor) {
        super(context);
        int i = 5;
        int i2 = 3;
        this.w = rx8.P(3, new ca0(context, i));
        this.x = wgc.e;
        int i3 = 0;
        this.A = rx8.P(3, new gj1(this, i3));
        setLayoutParams(new uf4(-1, -1));
        this.z = new GestureDetector(context, new pi9(i2, this));
        int i4 = 6;
        int i5 = 2;
        ct1 ct1Var = new ct1(x7j.c, ha9Var, executor, new ks9(i4, this), new gj1(this, 1), null, new gj1(this, i5), 32);
        this.u = ct1Var;
        if (!getScreenInfo().j && !getScreenInfo().i) {
            i5 = 3;
        }
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, gm0.K(4.0f * yl5.d().getDisplayMetrics().density), new ca0(context, 7), new gj1(this, i), new a9m(new ca0(context, i4), new gj1(this, i2), i5, new gj1(this, 4)));
        this.s = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.call_grid_opponents_view);
        recyclerView.setAdapter(ct1Var);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.setItemAnimator(getGridItemAnimation());
        recyclerView.j(new hj1(i3, this));
        this.t = recyclerView;
        addView(recyclerView, -1, -1);
        eg4 eg4VarH = ch3.h(this);
        int id = recyclerView.getId();
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.a(this);
    }

    private final jj1 getGridItemAnimation() {
        return (jj1) this.A.getValue();
    }

    private final k4f getScreenInfo() {
        return (k4f) this.w.getValue();
    }

    public static void u(lj1 lj1Var, tv8 tv8Var) {
        lj1Var.t.setItemAnimator(lj1Var.getGridItemAnimation());
        if (tv8Var != null) {
            ((af7) tv8Var).invoke();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.z.onTouchEvent(motionEvent);
    }

    public final void setListener(ij1 ij1Var) {
        this.v = ij1Var;
    }

    public final void setOpponents(wgc wgcVar) {
        kj1 kj1Var;
        String str = wgcVar.d;
        List list = wgcVar.c;
        ct1 ct1Var = this.u;
        int iL = ct1Var.l();
        RecyclerView recyclerView = this.t;
        if (iL != 1 || list.size() <= 1) {
            kj1Var = null;
        } else {
            kj1Var = new kj1(0, recyclerView, o7j.class, "liteUpdateVisibleItems", "liteUpdateVisibleItems(Landroidx/recyclerview/widget/RecyclerView;)V", 1, 0);
        }
        boolean z = (ns4.b(this.x.d) || ns4.b(str) || cqk.d(this.x.d, str)) ? false : true;
        this.x = wgcVar;
        if (!z) {
            ct1Var.O(list, kj1Var);
        } else {
            recyclerView.setItemAnimator(null);
            ct1Var.O(list, new z2(this, 11, kj1Var));
        }
    }

    public final void setOpponentsViewPool(a aVar) {
        this.t.setRecycledViewPool(aVar);
    }

    public final void setParentSizeProvider(cj1 cj1Var) {
        this.s.u = cj1Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(af7 af7Var) {
        this.y = af7Var;
    }

    public final void v() {
        RecyclerView recyclerView = this.t;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            s52 s52Var = childAt != null ? (s52) childAt.findViewById(R.id.call_opponent) : null;
            if (s52Var != null) {
                s52Var.C();
            }
        }
    }
}
