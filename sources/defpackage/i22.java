package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i22 extends tee {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;

    public i22(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 2:
                this.b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 3:
                this.b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 4:
                this.b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 5:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(7.0f * yl5.d().getDisplayMetrics().density);
                this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        boolean z;
        int iP2;
        sr srVar;
        sr srVar2;
        int i = 0;
        switch (this.a) {
            case 0:
                nee adapter = recyclerView.getAdapter();
                if (adapter != null && (iP = RecyclerView.P(view)) >= 0 && iP <= adapter.l()) {
                    vee layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        byte b = linearLayoutManager.p == 1;
                        rect.set(0, 0, 0, 0);
                        int i2 = this.d;
                        if (b != true) {
                            rect.top = i2;
                            rect.bottom = i2;
                            rect.left = iP == 0 ? this.b : this.c;
                            rect.right = iP == adapter.l() - 1 ? this.b : this.c;
                        } else {
                            rect.left = i2;
                            rect.right = i2;
                            rect.top = iP == 0 ? this.b : this.c;
                            rect.bottom = iP == adapter.l() - 1 ? this.b : this.c;
                        }
                        break;
                    }
                }
                break;
            case 1:
                int iP3 = RecyclerView.P(view);
                nee adapter2 = recyclerView.getAdapter();
                rsf rsfVar = adapter2 instanceof rsf ? (rsf) adapter2 : null;
                if (rsfVar != null && iP3 >= 0 && iP3 < rsfVar.l()) {
                    psf psfVar = (psf) ((k79) rsfVar.F(iP3));
                    psf psfVar2 = (psf) rsfVar.J(iP3 + 1);
                    rect.top = iP3 == 0 ? this.b : 0;
                    rect.bottom = (psfVar2 == null || psfVar.A() != psfVar2.A()) ? this.c : 0;
                    int i3 = this.d;
                    rect.left = i3;
                    rect.right = i3;
                }
                break;
            case 2:
                int i4 = this.b;
                int iP4 = RecyclerView.P(view);
                nee adapter3 = recyclerView.getAdapter();
                qqf qqfVar = adapter3 instanceof qqf ? (qqf) adapter3 : null;
                if (qqfVar != null && iP4 >= 0 && iP4 < qqfVar.l()) {
                    k79 k79Var = (k79) qqfVar.F(iP4);
                    oaf oafVar = k79Var instanceof oaf ? (oaf) k79Var : null;
                    k79 k79VarJ = qqfVar.J(iP4 + 1);
                    oaf oafVar2 = k79VarJ instanceof oaf ? (oaf) k79VarJ : null;
                    z = iP4 == 0;
                    int i5 = this.d;
                    rect.left = i5;
                    rect.right = i5;
                    rect.top = z ? i4 : 0;
                    if (!cqk.d(oafVar != null ? Integer.valueOf(oafVar.A()) : null, oafVar2 != null ? Integer.valueOf(oafVar2.A()) : null)) {
                        i = i4;
                    } else if (oafVar != null && !oafVar.g()) {
                        i = this.c;
                    }
                    rect.bottom = i;
                }
                break;
            case 3:
                int i6 = this.c;
                int i7 = this.b;
                int iP5 = RecyclerView.P(view);
                nee adapter4 = recyclerView.getAdapter();
                g6g g6gVar = adapter4 instanceof g6g ? (g6g) adapter4 : null;
                if (g6gVar != null && iP5 >= 0 && iP5 < g6gVar.l()) {
                    k79 k79Var2 = (k79) g6gVar.F(iP5);
                    ebf ebfVar = k79Var2 instanceof ebf ? (ebf) k79Var2 : null;
                    k79 k79VarJ2 = g6gVar.J(iP5 + 1);
                    ebf ebfVar2 = k79VarJ2 instanceof ebf ? (ebf) k79VarJ2 : null;
                    z = iP5 == 0;
                    int i8 = this.d;
                    rect.left = i8;
                    rect.right = i8;
                    rect.top = z ? i7 : ebfVar instanceof zaf ? i6 : 0;
                    if (!cqk.d(ebfVar != null ? Integer.valueOf(ebfVar.A()) : null, ebfVar2 != null ? Integer.valueOf(ebfVar2.A()) : null)) {
                        i = i7;
                    } else if (ebfVar != null && !ebfVar.g()) {
                        i = i6;
                    }
                    rect.bottom = i;
                }
                break;
            case 4:
                int i9 = this.b;
                int iP6 = RecyclerView.P(view);
                nee adapter5 = recyclerView.getAdapter();
                quf qufVar = adapter5 instanceof quf ? (quf) adapter5 : null;
                if (qufVar != null && iP6 >= 0 && iP6 < qufVar.l()) {
                    k79 k79Var3 = (k79) qufVar.F(iP6);
                    waf wafVar = k79Var3 instanceof waf ? (waf) k79Var3 : null;
                    k79 k79VarJ3 = qufVar.J(iP6 + 1);
                    waf wafVar2 = k79VarJ3 instanceof waf ? (waf) k79VarJ3 : null;
                    z = iP6 == 0;
                    int i10 = this.d;
                    rect.left = i10;
                    rect.right = i10;
                    rect.top = z ? i9 : 0;
                    if (!cqk.d(wafVar != null ? Integer.valueOf(wafVar.A()) : null, wafVar2 != null ? Integer.valueOf(wafVar2.A()) : null)) {
                        i = i9;
                    } else if (wafVar != null && !wafVar.g()) {
                        i = this.c;
                    }
                    rect.bottom = i;
                }
                break;
            case 5:
                int i11 = this.b;
                lfe lfeVarS = recyclerView.S(view);
                if (lfeVarS != null) {
                    int iP7 = RecyclerView.P(view);
                    nee adapter6 = recyclerView.getAdapter();
                    int i12 = lfeVarS.f;
                    if (i12 != 0 && adapter6 != null && iP7 >= 0 && iP7 < adapter6.l()) {
                        int i13 = this.d;
                        rect.left = i13;
                        rect.right = i13;
                        if (iP7 == 0) {
                            rect.top = i11;
                        } else if (i12 == R.id.oneme_stickers_settings_sets_title_view_type) {
                            rect.top = i11;
                            rect.bottom = this.c;
                        }
                        break;
                    }
                }
                break;
            default:
                int i14 = this.b;
                nee adapter7 = recyclerView.getAdapter();
                if (adapter7 != null && (iP2 = RecyclerView.P(view)) >= 0 && iP2 < adapter7.l()) {
                    int iA = d0m.a(recyclerView, gm0.K(81.0f * yl5.d().getDisplayMetrics().density), i14);
                    GridLayoutManager gridLayoutManagerC0 = tre.c0(recyclerView);
                    if (gridLayoutManagerC0 != null && (srVar = gridLayoutManagerC0.K) != null) {
                        int iO = srVar.O(iP2, i14);
                        GridLayoutManager gridLayoutManagerC1 = tre.c0(recyclerView);
                        if (((gridLayoutManagerC1 == null || (srVar2 = gridLayoutManagerC1.K) == null) ? 1 : srVar2.P(iP2)) != i14) {
                            int i15 = this.c / 2;
                            rect.bottom = i15;
                            rect.top = i15;
                            rect.left = (iO * iA) / i14;
                            rect.right = iA - (((iO + 1) * iA) / i14);
                        } else {
                            rect.top = this.d;
                        }
                        break;
                    }
                }
                break;
        }
    }

    public i22(int i, int i2) {
        this.a = 6;
        this.b = i;
        this.c = i2;
        this.d = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
    }
}
