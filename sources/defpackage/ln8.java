package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ln8 extends qn8 {
    public final kn8 g;
    public final cf7 h;

    public ln8(kn8 kn8Var, cf7 cf7Var) {
        super(3, 0);
        this.g = kn8Var;
        this.h = cf7Var;
    }

    @Override // defpackage.qn8
    public final boolean a(lfe lfeVar) {
        return ((Boolean) this.h.invoke(lfeVar)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qn8
    public final void b(RecyclerView recyclerView, lfe lfeVar) {
        super.b(recyclerView, lfeVar);
        if (lfeVar instanceof sn8) {
            this.g.C0(lfeVar);
            ((sn8) lfeVar).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // defpackage.qn8
    public final void m(Canvas canvas, RecyclerView recyclerView, lfe lfeVar, float f, float f2, int i, boolean z) {
        float f3;
        int iL = lfeVar.l();
        View view = lfeVar.a;
        if (iL == -1) {
            f3 = f2;
        } else if (f2 > 0.0f) {
            lfe lfeVarK = recyclerView.K(iL + 1);
            if (lfeVarK == null || !a(lfeVarK)) {
                f3 = 0.0f;
            } else {
                f2 = Math.min(view.getHeight(), f2);
                f3 = f2;
            }
        } else {
            lfe lfeVarK2 = recyclerView.K(iL - 1);
            if (lfeVarK2 == null || !a(lfeVarK2)) {
                f3 = 0.0f;
            } else {
                f2 = Math.max(-view.getHeight(), f2);
                f3 = f2;
            }
        }
        super.m(canvas, recyclerView, lfeVar, f, f3, i, z);
    }

    @Override // defpackage.qn8
    public final boolean n(lfe lfeVar, lfe lfeVar2) {
        this.g.S0(lfeVar.k(), lfeVar2.k());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qn8
    public final void o(lfe lfeVar, int i) {
        if (i == 0 || !(lfeVar instanceof sn8)) {
            return;
        }
        this.g.m0();
        ((sn8) lfeVar).e();
    }
}
