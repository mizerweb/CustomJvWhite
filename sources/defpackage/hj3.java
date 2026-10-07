package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hj3 extends kzf {
    public String m = "";
    public final String n = hj3.class.getName();

    @Override // defpackage.kzf, defpackage.t2i
    public final void m(ViewGroup viewGroup, View view, View view2, r2i r2iVar, boolean z, ll5 ll5Var) {
        t7c searchView;
        t7c searchView2;
        String string = viewGroup.getResources().getString(R.string.chat_list_toolbar_transition_name);
        this.m = string;
        if (view2 != null && !z) {
            View viewB = lzl.b(view2, string);
            rcc rccVar = viewB instanceof rcc ? (rcc) viewB : null;
            if (rccVar != null && (searchView2 = rccVar.getSearchView()) != null) {
                searchView2.setExpandable(true);
            }
            if (rccVar != null) {
                rccVar.k();
            }
            if (rccVar != null && (searchView = rccVar.getSearchView()) != null) {
                int i = t7c.w;
                searchView.c(true);
            }
        }
        super.m(viewGroup, view, view2, r2iVar, z, ll5Var);
    }

    @Override // defpackage.kzf
    public final void o() {
        String str = this.m;
        this.g.put(str, str);
    }

    @Override // defpackage.kzf
    public final z2i p(View view, boolean z) {
        if (view == null) {
            gm0.Y(this.n, "`to` is null, lets return empty TransitionSet to avoid NPE");
            return new z2i();
        }
        gj3 gj3Var = new gj3(view, this, z);
        z2i z2iVar = new z2i();
        z2iVar.O(gj3Var);
        return z2iVar;
    }
}
