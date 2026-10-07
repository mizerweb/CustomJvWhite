package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t2i extends gr4 {
    public boolean d;
    public boolean e;
    public er4 f;

    @Override // defpackage.gr4
    public final void a() {
        this.e = true;
    }

    @Override // defpackage.gr4
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gr4
    public void f(gr4 gr4Var, br4 br4Var) {
        this.d = true;
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        this.f = er4Var;
        if (this.d) {
            er4Var.a();
            return;
        }
        if (this.e) {
            k(viewGroup, view, view2, null, z);
            er4Var.a();
        } else {
            rda rdaVar = new rda(17, er4Var);
            z2i z2iVarL = l(view, view2, viewGroup, z);
            z2iVarL.a(new s2i(this, viewGroup, rdaVar));
            m(viewGroup, view, view2, z2iVarL, z, new ll5(this, viewGroup, z2iVarL, view, view2, z, rdaVar, 4));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, r2i r2iVar, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        viewGroup.addView(view2);
    }

    public abstract z2i l(View view, View view2, ViewGroup viewGroup, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, r2i r2iVar, boolean z, ll5 ll5Var) {
        ll5Var.c();
    }
}
