package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class zwj extends ywj {
    public mi8 n;

    public zwj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar, windowInsets);
        this.n = null;
    }

    @Override // defpackage.exj
    public ixj b() {
        return ixj.g(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.exj
    public ixj c() {
        return ixj.g(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.exj
    public final mi8 h() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = mi8.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.exj
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.exj
    public void r(mi8 mi8Var) {
        this.n = mi8Var;
    }
}
