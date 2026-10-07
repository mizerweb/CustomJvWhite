package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class anb extends tee {
    public final int a = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    public final int b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
    public final int c = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    public final int d = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
    public final int e = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int iP = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        r84 r84Var = adapter instanceof r84 ? (r84) adapter : null;
        if (r84Var == null) {
            return;
        }
        Pair pairG = r84Var.G(iP);
        Integer num = pairG.first instanceof cob ? (Integer) pairG.second : -1;
        Object obj = pairG.first;
        cob cobVar = obj instanceof cob ? (cob) obj : null;
        if (cobVar == null) {
            return;
        }
        int iL = cobVar.l();
        int iIntValue = num.intValue();
        if (iIntValue < 0 || iIntValue >= iL) {
            return;
        }
        k79 k79Var = (k79) cobVar.F(num.intValue());
        wnb wnbVar = k79Var instanceof wnb ? (wnb) k79Var : null;
        k79 k79VarJ = cobVar.J(num.intValue() + 1);
        wnb wnbVar2 = k79VarJ instanceof wnb ? (wnb) k79VarJ : null;
        int i2 = 0;
        boolean z = num.intValue() == 0 && iP == 0;
        int i3 = this.c;
        rect.left = i3;
        rect.right = i3;
        if (z) {
            i = this.a;
        } else {
            i = wnbVar instanceof unb ? this.e : 0;
        }
        rect.top = i;
        if (wnbVar instanceof unb) {
            i2 = this.d;
        } else {
            if (!cqk.d(wnbVar != null ? Integer.valueOf(wnbVar.A()) : null, wnbVar2 != null ? Integer.valueOf(wnbVar2.A()) : null)) {
                i2 = this.b;
            }
        }
        rect.bottom = i2;
    }
}
