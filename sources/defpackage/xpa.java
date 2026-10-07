package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class xpa implements xee {
    public final RecyclerView a;
    public final msa b;
    public final ny8 c;
    public boolean d;

    public xpa(k96 k96Var, msa msaVar, ny8 ny8Var) {
        this.a = k96Var;
        this.b = msaVar;
        this.c = ny8Var;
    }

    @Override // defpackage.xee
    public final void b(View view) {
    }

    @Override // defpackage.xee
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewG = recyclerView.G(view);
        lfe lfeVarS = viewG == null ? null : recyclerView.S(viewG);
        if ((lfeVarS instanceof uka) || (lfeVarS instanceof xx2)) {
            nt5 nt5Var = new nt5(view, new lh9(10, this));
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(nt5Var);
            }
            view.addOnAttachStateChangeListener(nt5Var);
        }
    }
}
