package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ri3 implements xee {
    public final RecyclerView a;
    public final tl3 b;
    public final ny8 c;
    public final ny8 d;
    public boolean e;
    public boolean f;

    public ri3(ny8 ny8Var, k96 k96Var, tl3 tl3Var, ny8 ny8Var2) {
        this.a = k96Var;
        this.b = tl3Var;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    @Override // defpackage.xee
    public final void b(View view) {
    }

    @Override // defpackage.xee
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewG = recyclerView.G(view);
        lfe lfeVarS = viewG == null ? null : recyclerView.S(viewG);
        if (lfeVarS instanceof ol8) {
            if (this.e) {
                return;
            }
            this.e = true;
            bdc.a(view, new qi3(view, this, 0));
            return;
        }
        if ((lfeVarS instanceof nk6) || (lfeVarS instanceof jk6)) {
            if (this.f) {
                return;
            }
            this.f = true;
            bdc.a(view, new qi3(view, this, 1));
            return;
        }
        if (lfeVarS instanceof tg3) {
            nt5 nt5Var = new nt5(view, new g3(8, this));
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(nt5Var);
            }
            view.addOnAttachStateChangeListener(nt5Var);
        }
    }
}
