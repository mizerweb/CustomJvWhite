package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kve extends nee implements tjg {
    public final Widget d;
    public LongSparseArray e = new LongSparseArray();
    public ArrayList f = new ArrayList();
    public int g = Integer.MAX_VALUE;
    public final SparseArray h = new SparseArray();
    public int i;
    public wy7 j;

    public kve(Widget widget) {
        this.d = widget;
        D(true);
    }

    public static y8j I(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        y8j y8jVar = parent instanceof y8j ? (y8j) parent : null;
        if (y8jVar != null) {
            return y8jVar;
        }
        qr7.z(recyclerView.getParent(), "Expected ViewPager2 instance. Got: ");
        return null;
    }

    @Override // defpackage.nee
    public final void A(lfe lfeVar) {
        nve nveVar = (nve) lfeVar;
        H(nveVar);
        nveVar.u.removeAllViews();
    }

    public final void F(nve nveVar, int i) {
        Bundle bundle;
        hve hveVar;
        long jM = m(i);
        tp2 tp2Var = nveVar.u;
        String strValueOf = String.valueOf(jM);
        Widget widget = this.d;
        hve childRouter = widget.getChildRouter(tp2Var, strValueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(nveVar.v) && (hveVar = nveVar.v) != null) {
            widget.removeChildRouter(hveVar);
        }
        nveVar.v = childRouter;
        nveVar.x = jM;
        if (!childRouter.o() && (bundle = (Bundle) this.e.get(jM)) != null) {
            childRouter.P(bundle);
            this.e.remove(jM);
            this.f.remove(Long.valueOf(jM));
        }
        childRouter.K();
        G(childRouter, i);
        if (i != this.i) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((lve) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.h.put(i, childRouter);
        nveVar.y = true;
    }

    public abstract void G(hve hveVar, int i);

    public final void H(nve nveVar) {
        if (nveVar.y) {
            hve hveVar = nveVar.v;
            if (hveVar != null) {
                hveVar.H();
                K(nveVar.x, hveVar);
                int i = nveVar.w;
                SparseArray sparseArray = this.h;
                if (cqk.d(sparseArray.get(i), hveVar)) {
                    sparseArray.remove(nveVar.w);
                }
            }
            nveVar.y = false;
        }
    }

    @Override // defpackage.nee
    /* JADX INFO: renamed from: J */
    public void B(nve nveVar) {
        H(nveVar);
        hve hveVar = nveVar.v;
        if (hveVar != null) {
            this.d.removeChildRouter(hveVar);
            nveVar.v = null;
        }
    }

    public final void K(long j, hve hveVar) {
        Bundle bundle = new Bundle();
        hveVar.Q(bundle);
        this.e.put(j, bundle);
        this.f.remove(Long.valueOf(j));
        this.f.add(Long.valueOf(j));
        while (this.e.size() > this.g) {
            this.e.remove(((Number) this.f.remove(0)).longValue());
        }
    }

    @Override // defpackage.tjg
    public final Parcelable a() {
        SparseArray sparseArray = this.h;
        hj8 hj8VarF0 = oc9.f0(0, sparseArray.size());
        ArrayList arrayList = new ArrayList(yw3.W0(hj8VarF0, 10));
        Iterator it = hj8VarF0.iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                break;
            }
            arrayList.add(Integer.valueOf(sparseArray.keyAt(gj8Var.nextInt())));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        while (!arrayList2.isEmpty()) {
            int iIntValue = ((Number) arrayList2.remove(xw3.O0(arrayList2))).intValue();
            K(m(iIntValue), (hve) sparseArray.get(iIntValue));
            if (!arrayList2.isEmpty()) {
                int iIntValue2 = ((Number) arrayList2.remove(0)).intValue();
                K(m(iIntValue2), (hve) sparseArray.get(iIntValue2));
            }
        }
        hj8 hj8VarF1 = oc9.f0(0, this.e.size());
        ArrayList arrayList3 = new ArrayList(yw3.W0(hj8VarF1, 10));
        Iterator it2 = hj8VarF1.iterator();
        while (true) {
            gj8 gj8Var2 = (gj8) it2;
            if (!gj8Var2.c) {
                break;
            }
            arrayList3.add(Long.valueOf(this.e.keyAt(gj8Var2.nextInt())));
        }
        hj8 hj8VarF2 = oc9.f0(0, this.e.size());
        ArrayList arrayList4 = new ArrayList(yw3.W0(hj8VarF2, 10));
        Iterator it3 = hj8VarF2.iterator();
        while (true) {
            gj8 gj8Var3 = (gj8) it3;
            if (!gj8Var3.c) {
                return new jve(arrayList3, arrayList4, this.f, this.g);
            }
            arrayList4.add((Bundle) this.e.valueAt(gj8Var3.nextInt()));
        }
    }

    @Override // defpackage.tjg
    public final void e(Parcelable parcelable) {
        if (!(parcelable instanceof jve)) {
            return;
        }
        this.e = new LongSparseArray();
        jve jveVar = (jve) parcelable;
        ArrayList arrayList = jveVar.a;
        Iterator it = xw3.N0(arrayList).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                this.f = new ArrayList(jveVar.c);
                this.g = jveVar.d;
                return;
            } else {
                int iNextInt = gj8Var.nextInt();
                this.e.put(((Number) arrayList.get(iNextInt)).longValue(), jveVar.b.get(iNextInt));
            }
        }
    }

    @Override // defpackage.nee
    public long m(int i) {
        return i;
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        y8j y8jVarI = I(recyclerView);
        wy7 wy7Var = new wy7(11, this);
        y8jVarI.e(wy7Var);
        this.j = wy7Var;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        nve nveVar = (nve) lfeVar;
        nveVar.w = i;
        F(nveVar, i);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = nve.z;
        tp2 tp2Var = new tp2(viewGroup.getContext());
        WeakHashMap weakHashMap = i7j.a;
        tp2Var.setId(View.generateViewId());
        tp2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tp2Var.setSaveEnabled(false);
        return new nve(tp2Var);
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        y8j y8jVarI = I(recyclerView);
        wy7 wy7Var = this.j;
        if (wy7Var != null) {
            y8jVarI.j(wy7Var);
        }
        this.j = null;
    }

    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ boolean y(lfe lfeVar) {
        return true;
    }

    @Override // defpackage.nee
    public final void z(lfe lfeVar) {
        nve nveVar = (nve) lfeVar;
        if (nveVar.y) {
            return;
        }
        F(nveVar, nveVar.w);
    }
}
