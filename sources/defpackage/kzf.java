package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kzf extends t2i {
    public final mw g = new mw(0);
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public r2i j;
    public r2i k;
    public r2i l;

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i = p7j.a;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                n(arrayList, viewGroup.getChildAt(i2));
            }
        }
    }

    @Override // defpackage.t2i, defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.d = true;
        this.i.clear();
    }

    @Override // defpackage.t2i
    public final void k(ViewGroup viewGroup, View view, View view2, r2i r2iVar, boolean z) {
        if (view2 != null) {
            ArrayList<jzf> arrayList = this.i;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                for (jzf jzfVar : arrayList) {
                    jzfVar.b.addView(jzfVar.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, r2iVar, z);
    }

    @Override // defpackage.t2i
    public final z2i l(View view, View view2, ViewGroup viewGroup, boolean z) {
        r2i r2iVar;
        this.j = null;
        this.k = null;
        z2i z2iVarP = p(view2, z);
        this.l = z2iVarP;
        r2i r2iVar2 = this.k;
        return (r2iVar2 == null || (r2iVar = this.j) == null || !(this instanceof hj3)) ? lzl.d(0, this.j, r2iVar2, z2iVarP) : lzl.d(0, lzl.d(1, r2iVar, r2iVar2), this.l);
    }

    @Override // defpackage.t2i
    public void m(ViewGroup viewGroup, View view, View view2, r2i r2iVar, boolean z, ll5 ll5Var) {
        ll5 ll5Var2 = new ll5(this, viewGroup, view, view2, r2iVar, z, ll5Var, 3);
        o();
        if (view2 == null || view2.getParent() != null || this.h.size() <= 0) {
            ll5Var2.c();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new ezf(this, view2, ll5Var2));
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract z2i p(View view, boolean z);
}
