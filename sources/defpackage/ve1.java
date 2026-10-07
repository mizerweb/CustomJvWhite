package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class ve1 extends wf4 implements wy1, uy1 {
    public final r6a s;

    public ve1(Context context) {
        super(context, null);
        r6a r6aVar = new r6a();
        r6aVar.a = this;
        r6aVar.c = new int[2];
        this.s = r6aVar;
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        if (z) {
            pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.k));
            while (pu6Var.hasNext()) {
                ((wy1) pu6Var.next()).b(z);
            }
        }
    }

    @Override // defpackage.wy1
    public final void c(boolean z) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.l));
        while (pu6Var.hasNext()) {
            ((wy1) pu6Var.next()).c(z);
        }
    }

    @Override // defpackage.uy1
    public final void d(RectF rectF, boolean z) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.p));
        while (pu6Var.hasNext()) {
            ((uy1) pu6Var.next()).d(rectF, z);
        }
    }

    @Override // defpackage.uy1
    public boolean getShouldScaleMainOpponent() {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.o));
        while (pu6Var.hasNext()) {
            if (((uy1) pu6Var.next()).getShouldScaleMainOpponent()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uy1
    public final void h(boolean z) {
        if (z) {
            pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.i));
            while (pu6Var.hasNext()) {
                ((uy1) pu6Var.next()).h(z);
            }
        }
    }

    @Override // defpackage.uy1
    public final void j(boolean z) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.j));
        while (pu6Var.hasNext()) {
            ((uy1) pu6Var.next()).j(z);
        }
    }

    @Override // defpackage.uy1
    public final void k(c79 c79Var, boolean z, long j) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.m));
        while (pu6Var.hasNext()) {
            ((uy1) pu6Var.next()).k(c79Var, z, j);
        }
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, boolean z, long j) {
        pu6 pu6Var = new pu6(yhf.m0(new sw(4, this), i9.n));
        while (pu6Var.hasNext()) {
            ((wy1) pu6Var.next()).l(c79Var, z, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = (ValueAnimator) this.s.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
