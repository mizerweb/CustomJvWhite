package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class q35 extends tee {
    public final /* synthetic */ int a;
    public final int b;

    public q35(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 5:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                break;
            default:
                this.b = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int iP = RecyclerView.P(view);
                if (iP == 0) {
                    rect.top += i2;
                }
                nee adapter = recyclerView.getAdapter();
                if (iP == (adapter != null ? adapter.l() : 0) - 1) {
                    rect.bottom = gm0.J(((double) i2) * 1.0d) + rect.bottom;
                }
                break;
            case 1:
                if (RecyclerView.P(view) == hfeVar.b() - 1) {
                    rect.left = i2;
                    rect.right = 0;
                } else if (RecyclerView.P(view) != 0) {
                    rect.left = i2;
                    rect.right = i2;
                } else {
                    rect.left = 0;
                    rect.right = i2;
                }
                break;
            case 2:
                int iP2 = RecyclerView.P(view);
                nee adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && iP2 >= 0 && iP2 < adapter2.l()) {
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
                break;
            case 3:
                int iR = RecyclerView.R(view);
                rect.bottom = i2;
                if (iR == 0) {
                    rect.top = i2;
                }
                break;
            case 4:
                int iP3 = RecyclerView.P(view);
                nee adapter3 = recyclerView.getAdapter();
                if (adapter3 != null && iP3 >= 0 && iP3 < adapter3.l()) {
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
                break;
            default:
                lfe lfeVarS = recyclerView.S(view);
                if (lfeVarS != null) {
                    int iP4 = RecyclerView.P(view);
                    nee adapter4 = recyclerView.getAdapter();
                    if (lfeVarS.f != 0 && adapter4 != null && iP4 >= 0 && iP4 < adapter4.l() && iP4 == 0) {
                        rect.top = i2;
                        rect.bottom = i2;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q35(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
