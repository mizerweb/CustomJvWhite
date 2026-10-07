package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class pvf extends tee {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public pvf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.e = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            default:
                this.b = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                this.c = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.e = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        int i4 = this.d;
        int i5 = this.e;
        switch (i) {
            case 0:
                int iP = RecyclerView.P(view);
                nee adapter = recyclerView.getAdapter();
                mvf mvfVar = adapter instanceof mvf ? (mvf) adapter : null;
                if (mvfVar != null && iP >= 0 && iP < mvfVar.l()) {
                    k79 k79Var = (k79) mvfVar.F(iP);
                    kbf kbfVar = k79Var instanceof kbf ? (kbf) k79Var : null;
                    k79 k79VarJ = mvfVar.J(iP + 1);
                    kbf kbfVar2 = k79VarJ instanceof kbf ? (kbf) k79VarJ : null;
                    boolean z = iP == 0;
                    rect.left = i5;
                    rect.right = i5;
                    if (!(kbfVar instanceof hbf) && !z) {
                        i3 = 0;
                    }
                    rect.top = i3;
                    if (cqk.d(kbfVar != null ? Integer.valueOf(kbfVar.A()) : null, kbfVar2 != null ? Integer.valueOf(kbfVar2.A()) : null)) {
                        i2 = (kbfVar == null || kbfVar.g()) ? 0 : i4;
                    }
                    rect.bottom = i2;
                }
                break;
            default:
                int iP2 = RecyclerView.P(view);
                nee adapter2 = recyclerView.getAdapter();
                f8i f8iVar = adapter2 instanceof f8i ? (f8i) adapter2 : null;
                if (f8iVar != null && iP2 >= 0 && iP2 < f8iVar.l()) {
                    k79 k79Var2 = (k79) f8iVar.F(iP2);
                    d8i d8iVar = k79Var2 instanceof d8i ? (d8i) k79Var2 : null;
                    k79 k79VarJ2 = f8iVar.J(iP2 + 1);
                    d8i d8iVar2 = k79VarJ2 instanceof d8i ? (d8i) k79VarJ2 : null;
                    if (iP2 != 0) {
                        i3 = d8iVar instanceof a8i ? i4 : 0;
                    }
                    rect.top = i3;
                    rect.left = (d8iVar == null || d8iVar.g()) ? 0 : i5;
                    if (d8iVar == null || d8iVar.g()) {
                        i5 = 0;
                    }
                    rect.right = i5;
                    if (cqk.d(d8iVar != null ? Integer.valueOf(d8iVar.A()) : null, d8iVar2 != null ? Integer.valueOf(d8iVar2.A()) : null)) {
                        i2 = (d8iVar == null || d8iVar.g() || (d8iVar instanceof a8i)) ? 0 : i4;
                    }
                    rect.bottom = i2;
                }
                break;
        }
    }
}
