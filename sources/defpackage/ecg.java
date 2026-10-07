package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ecg extends yee {
    public RecyclerView a;
    public Scroller b;
    public final dcg c = new dcg(this);

    @Override // defpackage.yee
    public boolean a(int i, int i2) {
        a29 a29VarD;
        int iF;
        vee layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof gfe) || (a29VarD = d(layoutManager)) == null || (iF = f(layoutManager, i, i2)) == -1) {
            return false;
        }
        a29VarD.q(iF);
        layoutManager.K0(a29VarD);
        return true;
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        dcg dcgVar = this.c;
        if (recyclerView2 != null) {
            recyclerView2.r0(dcgVar);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                ore.k("An instance of OnFlingListener already set.");
                return;
            }
            this.a.k(dcgVar);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(vee veeVar, View view);

    public a29 d(vee veeVar) {
        if (veeVar instanceof gfe) {
            return new wlc(this, this.a.getContext(), 1);
        }
        return null;
    }

    public abstract View e(vee veeVar);

    public abstract int f(vee veeVar, int i, int i2);

    public final void g() {
        vee layoutManager;
        View viewE;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewE);
        int i = iArrC[0];
        if (i == 0 && iArrC[1] == 0) {
            return;
        }
        this.a.z0(i, iArrC[1], false);
    }
}
