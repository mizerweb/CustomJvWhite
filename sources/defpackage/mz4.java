package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mz4 extends nee implements tjg {
    public final br4 d;
    public vi9 e = new vi9((Object) null);
    public ArrayList f = new ArrayList();
    public int g = Integer.MAX_VALUE;
    public final SparseArray h = new SparseArray();
    public int i;
    public so3 j;

    public mz4(br4 br4Var) {
        this.d = br4Var;
        D(true);
    }

    public static y8j J(RecyclerView recyclerView) {
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
        mve mveVar = (mve) lfeVar;
        H(mveVar);
        mveVar.u.removeAllViews();
    }

    @Override // defpackage.nee
    public final void B(lfe lfeVar) {
        mve mveVar = (mve) lfeVar;
        H(mveVar);
        hve hveVar = mveVar.v;
        if (hveVar != null) {
            this.d.removeChildRouter(hveVar);
            mveVar.v = null;
        }
    }

    public final void F(mve mveVar, int i) {
        Bundle bundle;
        hve hveVar;
        long jM = m(i);
        tp2 tp2Var = mveVar.u;
        String strValueOf = String.valueOf(jM);
        br4 br4Var = this.d;
        boolean z = false;
        hve childRouter = br4Var.getChildRouter(tp2Var, strValueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(mveVar.v) && (hveVar = mveVar.v) != null) {
            br4Var.removeChildRouter(hveVar);
        }
        mveVar.v = childRouter;
        mveVar.w = jM;
        if (!childRouter.o() && (bundle = (Bundle) this.e.b(jM)) != null) {
            childRouter.P(bundle);
            this.e.h(jM);
            this.f.remove(Long.valueOf(jM));
            z = true;
        }
        br4 br4VarC = rx8.C(childRouter);
        if ((br4VarC != null ? br4VarC.getTargetController() : null) != null) {
            gm0.n(getClass().getName(), "Router adapter. Attach router, target exist | router restored:" + z);
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
        mveVar.x = true;
    }

    public abstract void G(hve hveVar, int i);

    public final void H(mve mveVar) {
        if (mveVar.x) {
            hve hveVar = mveVar.v;
            if (hveVar != null) {
                hveVar.H();
                K(mveVar.w, hveVar);
                int iK = mveVar.k();
                SparseArray sparseArray = this.h;
                if (cqk.d(sparseArray.get(iK), hveVar)) {
                    sparseArray.remove(mveVar.k());
                }
            }
            mveVar.x = false;
        }
    }

    public final hve I(int i) {
        return (hve) this.h.get(i);
    }

    public final void K(long j, hve hveVar) {
        Bundle bundle = new Bundle();
        hveVar.Q(bundle);
        this.e.f(j, bundle);
        this.f.remove(Long.valueOf(j));
        this.f.add(Long.valueOf(j));
        while (this.e.i() > this.g) {
            this.e.h(((Number) this.f.remove(0)).longValue());
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
        hj8 hj8VarF1 = oc9.f0(0, this.e.i());
        ArrayList arrayList3 = new ArrayList(yw3.W0(hj8VarF1, 10));
        Iterator it2 = hj8VarF1.iterator();
        while (true) {
            gj8 gj8Var2 = (gj8) it2;
            if (!gj8Var2.c) {
                break;
            }
            arrayList3.add(Long.valueOf(this.e.e(gj8Var2.nextInt())));
        }
        hj8 hj8VarF2 = oc9.f0(0, this.e.i());
        ArrayList arrayList4 = new ArrayList(yw3.W0(hj8VarF2, 10));
        Iterator it3 = hj8VarF2.iterator();
        while (true) {
            gj8 gj8Var3 = (gj8) it3;
            if (!gj8Var3.c) {
                return new lz4(arrayList3, arrayList4, this.f, this.g);
            }
            arrayList4.add((Bundle) this.e.j(gj8Var3.nextInt()));
        }
    }

    @Override // defpackage.tjg
    public final void e(Parcelable parcelable) {
        if (!(parcelable instanceof lz4)) {
            return;
        }
        this.e = new vi9((Object) null);
        lz4 lz4Var = (lz4) parcelable;
        Iterator it = xw3.N0(lz4Var.c()).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                this.f = new ArrayList(lz4Var.b());
                this.g = lz4Var.a();
                return;
            } else {
                int iNextInt = gj8Var.nextInt();
                this.e.f(((Number) ((ArrayList) lz4Var.c()).get(iNextInt)).longValue(), ((ArrayList) lz4Var.d()).get(iNextInt));
            }
        }
    }

    @Override // defpackage.nee
    public long m(int i) {
        return i;
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        y8j y8jVarJ = J(recyclerView);
        so3 so3Var = new so3(2, this);
        y8jVarJ.e(so3Var);
        this.j = so3Var;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        F((mve) lfeVar, i);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = mve.y;
        tp2 tp2Var = new tp2(viewGroup.getContext());
        WeakHashMap weakHashMap = i7j.a;
        tp2Var.setId(View.generateViewId());
        tp2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tp2Var.setSaveEnabled(false);
        return new mve(tp2Var);
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        y8j y8jVarJ = J(recyclerView);
        so3 so3Var = this.j;
        if (so3Var != null) {
            y8jVarJ.j(so3Var);
        }
        this.j = null;
    }

    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ boolean y(lfe lfeVar) {
        return true;
    }

    @Override // defpackage.nee
    public final void z(lfe lfeVar) {
        mve mveVar = (mve) lfeVar;
        if (mveVar.x) {
            return;
        }
        F(mveVar, mveVar.k());
    }
}
