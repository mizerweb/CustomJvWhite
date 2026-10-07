package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class q27 extends tee {
    public final oo6 a;
    public final int b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
    public final int c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
    public final int d = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
    public final int e = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    public q27(oo6 oo6Var) {
        this.a = oo6Var;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int iP = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        int i2 = recyclerView.S(view).f;
        if (adapter == null || iP < 0 || iP >= adapter.l()) {
            return;
        }
        int i3 = iP + 1;
        Integer numValueOf = i3 < adapter.l() ? Integer.valueOf(adapter.n(i3)) : null;
        int i4 = this.e;
        if (i2 == 64 || i2 == 32) {
            i4 *= 2;
        }
        rect.left = i4;
        rect.right = i4;
        long jM = adapter.m(iP);
        int i5 = this.d;
        int i6 = this.b;
        if (iP == 0) {
            i = i6;
        } else {
            i = jM == 9223372036854775799L ? i5 : 0;
        }
        rect.top = i;
        int iE = this.a.e(iP);
        boolean z = iE == 4 || iE == 3;
        if (!z || numValueOf == null || numValueOf.intValue() != 64) {
            if (z || i2 == 64) {
                i5 = i6;
            } else {
                i5 = i2 == 32 ? this.c : 0;
            }
        }
        rect.bottom = i5;
    }
}
