package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class gj3 extends u2i {
    public final /* synthetic */ View a;
    public final /* synthetic */ hj3 b;
    public final /* synthetic */ boolean c;

    public gj3(View view, hj3 hj3Var, boolean z) {
        this.a = view;
        this.b = hj3Var;
        this.c = z;
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void a(r2i r2iVar) {
        View viewB = lzl.b(this.a, this.b.m);
        if (viewB == null) {
            gm0.Y(this.b.n, "transitionView is null!");
            return;
        }
        if (viewB instanceof rcc) {
            t7c searchView = ((rcc) viewB).getSearchView();
            if (searchView == null) {
                gm0.Y(this.b.n, "searchView is null!");
                return;
            } else if (this.c) {
                searchView.d();
                return;
            } else {
                searchView.b();
                return;
            }
        }
        String str = this.b.n;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "transitionView is not toolbar " + viewB, null);
        }
    }
}
