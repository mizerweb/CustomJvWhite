package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e96 extends afe {
    public final f96 a;
    public int b = 1;
    public final /* synthetic */ l96 c;

    public e96(l96 l96Var, f96 f96Var) {
        this.c = l96Var;
        this.a = f96Var;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, final int i, final int i2) {
        final l96 l96Var = this.c;
        l96Var.post(new Runnable() { // from class: d96
            @Override // java.lang.Runnable
            public final void run() {
                int iZ0;
                if (i == 0) {
                    int i3 = i2;
                }
                l96 l96Var2 = l96Var;
                vee layoutManager = l96Var2.getLayoutManager();
                int iX0 = 0;
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int i4 = staggeredGridLayoutManager.p;
                    int[] iArr = new int[i4];
                    for (int i5 = 0; i5 < staggeredGridLayoutManager.p; i5++) {
                        ou9 ou9Var = staggeredGridLayoutManager.q[i5];
                        boolean z = ((StaggeredGridLayoutManager) ou9Var.f).w;
                        ArrayList arrayList = (ArrayList) ou9Var.e;
                        iArr[i5] = z ? ou9Var.g(0, arrayList.size(), true, false) : ou9Var.g(arrayList.size() - 1, -1, true, false);
                    }
                    iZ0 = iArr[i4 - 1];
                } else {
                    iZ0 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).Z0() : 0;
                }
                nee adapter = l96Var2.getAdapter();
                if (adapter != null) {
                    int iL = adapter.l() - iZ0;
                    e96 e96Var = this;
                    int i6 = e96Var.b;
                    f96 f96Var = e96Var.a;
                    if (iL <= i6 && ((l96Var2.getIgnoreRefreshingFlagsForScrollEvent() || !l96Var2.r2) && f96Var.A())) {
                        if (l96Var2.u2 != null) {
                            l96Var2.getRefreshingNextDelegate();
                            l96Var2.setRefreshingNext(true);
                        }
                        f96Var.o();
                    }
                    vee layoutManager2 = l96Var2.getLayoutManager();
                    if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2;
                        int i7 = staggeredGridLayoutManager2.p;
                        int[] iArr2 = new int[i7];
                        for (int i8 = 0; i8 < staggeredGridLayoutManager2.p; i8++) {
                            ou9 ou9Var2 = staggeredGridLayoutManager2.q[i8];
                            boolean z2 = ((StaggeredGridLayoutManager) ou9Var2.f).w;
                            ArrayList arrayList2 = (ArrayList) ou9Var2.e;
                            iArr2[i8] = z2 ? ou9Var2.g(arrayList2.size() - 1, -1, true, false) : ou9Var2.g(0, arrayList2.size(), true, false);
                        }
                        iX0 = iArr2[i7 - 1];
                    } else if (layoutManager2 instanceof LinearLayoutManager) {
                        iX0 = ((LinearLayoutManager) layoutManager2).X0();
                    }
                    if (iX0 < 0 || iX0 > e96Var.b) {
                        return;
                    }
                    if ((l96Var2.getIgnoreRefreshingFlagsForScrollEvent() || !l96Var2.s2) && f96Var.f()) {
                        if (l96Var2.u2 != null) {
                            l96Var2.setRefreshingPrev(true);
                        }
                        f96Var.v();
                    }
                }
            }
        });
    }
}
