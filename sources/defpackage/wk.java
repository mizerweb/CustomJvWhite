package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class wk implements ViewTreeObserver.OnPreDrawListener {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final boolean d;
    public final er4 e;
    public boolean f;
    public final /* synthetic */ yk g;

    public wk(yk ykVar, er4 er4Var, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.g = ykVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
        this.d = z;
        this.e = er4Var;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        View view = this.c;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        this.g.m(this.a, this.b, this.c, this.d, true, this.e);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        return true;
    }
}
