package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c96 extends nee {
    public final nee d;
    public final /* synthetic */ l96 e;

    public c96(l96 l96Var, nee neeVar) {
        this.e = l96Var;
        this.d = neeVar;
        D(neeVar.b);
    }

    @Override // defpackage.nee
    public final void A(lfe lfeVar) {
        if (lfeVar instanceof b96) {
            return;
        }
        this.d.A(lfeVar);
    }

    @Override // defpackage.nee
    public final void B(lfe lfeVar) {
        if (lfeVar instanceof b96) {
            return;
        }
        this.d.B(lfeVar);
    }

    @Override // defpackage.nee
    public final void C(pee peeVar) {
        super.C(peeVar);
        this.d.C(peeVar);
    }

    @Override // defpackage.nee
    public final void E(pee peeVar) {
        super.E(peeVar);
        this.d.E(peeVar);
    }

    @Override // defpackage.nee
    public final int l() {
        l96 l96Var = this.e;
        int i = 0;
        int i2 = (!l96Var.r2 || l96Var.u2 == null) ? 0 : 1;
        if (l96Var.s2 && l96Var.u2 != null) {
            i = 1;
        }
        return this.d.l() + i + i2;
    }

    @Override // defpackage.nee
    public final long m(int i) {
        l96 l96Var = this.e;
        if (l96Var.s2 && i == 0) {
            return -100L;
        }
        if (l96Var.r2 && i == l() - 1) {
            return -200L;
        }
        nee neeVar = this.d;
        if (neeVar.l() > 0) {
            return neeVar.m(i - (l96Var.s2 ? 1 : 0));
        }
        return -1L;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        l96 l96Var = this.e;
        if (l96Var.s2 && i == 0) {
            return -1;
        }
        if (l96Var.r2 && i == l() - 1) {
            return -1;
        }
        nee neeVar = this.d;
        if (neeVar.l() > 0) {
            return neeVar.n(i - (l96Var.s2 ? 1 : 0));
        }
        return -1;
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        this.d.t(recyclerView);
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        v(lfeVar, i, new ArrayList());
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        if (lfeVar instanceof b96) {
            return;
        }
        nee neeVar = this.d;
        if (neeVar.l() > 0) {
            neeVar.v(lfeVar, i - (this.e.s2 ? 1 : 0), list);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.d.w(viewGroup, i);
        }
        l96 l96Var = this.e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(l96Var.getContext());
        Integer num = l96Var.u2;
        if (num != null) {
            return new b96(layoutInflaterFrom.inflate(num.intValue(), viewGroup, false));
        }
        ore.p("Required value was null.");
        return null;
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        this.d.x(recyclerView);
    }

    @Override // defpackage.nee
    public final boolean y(lfe lfeVar) {
        return (lfeVar instanceof b96) || this.d.y(lfeVar);
    }

    @Override // defpackage.nee
    public final void z(lfe lfeVar) {
        if (lfeVar instanceof b96) {
            return;
        }
        this.d.z(lfeVar);
    }
}
