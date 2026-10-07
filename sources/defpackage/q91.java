package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class q91 extends tee {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public q91(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 2:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 3:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 4:
            case 5:
            case 7:
            default:
                this.b = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 6:
                this.b = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 8:
                this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(70.0f * yl5.d().getDisplayMetrics().density);
                break;
            case 9:
                this.b = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                this.c = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        boolean z;
        int i = this.a;
        int i2 = 0;
        int i3 = this.b;
        int i4 = this.c;
        switch (i) {
            case 0:
                int iP = RecyclerView.P(view);
                nee adapter = recyclerView.getAdapter();
                ur1 ur1Var = adapter instanceof ur1 ? (ur1) adapter : null;
                if (ur1Var != null && iP >= 0 && iP < ur1Var.l()) {
                    k79 k79Var = (k79) ur1Var.F(iP);
                    r91 r91Var = k79Var instanceof r91 ? (r91) k79Var : null;
                    k79 k79VarJ = ur1Var.J(iP + 1);
                    r91 r91Var2 = k79VarJ instanceof r91 ? (r91) k79VarJ : null;
                    byte b = iP == 0;
                    z = iP == ur1Var.l() - 1;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = b != false ? 0 : i3;
                    if (z) {
                        i2 = i4;
                    } else if (!cqk.d(r91Var != null ? 0 : null, r91Var2 != null ? 0 : null)) {
                        i2 = i3;
                    }
                    rect.bottom = i2;
                }
                break;
            case 1:
                int iP2 = RecyclerView.P(view);
                nee adapter2 = recyclerView.getAdapter();
                tn1 tn1Var = adapter2 instanceof tn1 ? (tn1) adapter2 : null;
                if (tn1Var != null && iP2 >= 0 && iP2 < tn1Var.l()) {
                    k79 k79Var2 = (k79) tn1Var.F(iP2);
                    cq1 cq1Var = k79Var2 instanceof cq1 ? (cq1) k79Var2 : null;
                    k79 k79VarJ2 = tn1Var.J(iP2 + 1);
                    cq1 cq1Var2 = k79VarJ2 instanceof cq1 ? (cq1) k79VarJ2 : null;
                    rect.left = i4;
                    rect.right = i4;
                    rect.top = 0;
                    rect.bottom = cqk.d(cq1Var != null ? Integer.valueOf(cq1Var.A()) : null, cq1Var2 != null ? Integer.valueOf(cq1Var2.A()) : null) ? 0 : i3;
                }
                break;
            case 2:
                int iP3 = RecyclerView.P(view);
                nee adapter3 = recyclerView.getAdapter();
                rsf rsfVar = adapter3 instanceof rsf ? (rsf) adapter3 : null;
                if (rsfVar != null && iP3 >= 0 && iP3 < rsfVar.l()) {
                    psf psfVar = (psf) ((k79) rsfVar.F(iP3));
                    psf psfVar2 = (psf) rsfVar.J(iP3 + 1);
                    if (iP3 != 0) {
                        i3 = 0;
                    }
                    rect.top = i3;
                    rect.bottom = (psfVar2 == null || psfVar.A() != psfVar2.A()) ? i4 : 0;
                }
                break;
            case 3:
                int iP4 = RecyclerView.P(view);
                nee adapter4 = recyclerView.getAdapter();
                rsf rsfVar2 = adapter4 instanceof rsf ? (rsf) adapter4 : null;
                if (rsfVar2 != null && iP4 >= 0 && iP4 < rsfVar2.l()) {
                    if (iP4 != 0) {
                        i3 = i4;
                    }
                    rect.top = i3;
                }
                break;
            case 4:
                rect.top = i3;
                rect.bottom = i3;
                if (hfeVar.b() == 1) {
                    rect.left = i3;
                    rect.right = i3;
                } else if (RecyclerView.P(view) == hfeVar.b() - 1) {
                    rect.left = i4 / 2;
                    rect.right = i3;
                } else if (RecyclerView.P(view) != 0) {
                    int i5 = i4 / 2;
                    rect.left = i5;
                    rect.right = i5;
                } else {
                    rect.left = i3;
                    rect.right = i4 / 2;
                }
                break;
            case 5:
                int iP5 = RecyclerView.P(view);
                int iMax = iP5 % ((int) Math.max(1.0d, i3));
                int iMax2 = (int) Math.max(1.0d, i3);
                rect.left = (iMax * i4) / iMax2;
                rect.right = i4 - (((iMax + 1) * i4) / iMax2);
                if (iP5 >= iMax2) {
                    rect.top = i4;
                }
                break;
            case 6:
                int iP6 = RecyclerView.P(view);
                nee adapter5 = recyclerView.getAdapter();
                if (adapter5 != null && iP6 >= 0 && iP6 < adapter5.l()) {
                    byte b2 = iP6 == 0;
                    i2 = iP6 == adapter5.l() - 1 ? 1 : 0;
                    rect.left = b2 != false ? i4 : i3;
                    if (i2 != 0) {
                        i3 = i4;
                    }
                    rect.right = i3;
                }
                break;
            case 7:
                rect.left = i4;
                rect.right = i4;
                rect.top = i3;
                break;
            case 8:
                lfe lfeVarS = recyclerView.S(view);
                if (lfeVarS != null) {
                    int iP7 = RecyclerView.P(view);
                    nee adapter6 = recyclerView.getAdapter();
                    if (lfeVarS.f != 0 && adapter6 != null && iP7 >= 0 && iP7 < adapter6.l()) {
                        if (iP7 == 0) {
                            rect.top = i3;
                            rect.bottom = i3;
                        } else if (iP7 == adapter6.l() - 1) {
                            rect.bottom = i4;
                        }
                        break;
                    }
                }
                break;
            case 9:
                int iP8 = RecyclerView.P(view);
                nee adapter7 = recyclerView.getAdapter();
                awf awfVar = adapter7 instanceof awf ? (awf) adapter7 : null;
                if (awfVar != null && iP8 >= 0 && iP8 < awfVar.l()) {
                    k79 k79Var3 = (k79) awfVar.F(iP8);
                    nbf nbfVar = k79Var3 instanceof nbf ? (nbf) k79Var3 : null;
                    k79 k79VarJ3 = awfVar.J(iP8 + 1);
                    nbf nbfVar2 = k79VarJ3 instanceof nbf ? (nbf) k79VarJ3 : null;
                    z = iP8 == 0;
                    rect.left = i4;
                    rect.right = i4;
                    rect.top = z ? i3 : 0;
                    rect.bottom = cqk.d(nbfVar != null ? Integer.valueOf(nbfVar.A()) : null, nbfVar2 != null ? Integer.valueOf(nbfVar2.A()) : null) ? 0 : i3;
                }
                break;
            case 10:
                int iP9 = RecyclerView.P(view);
                if (iP9 == 0) {
                    rect.right = i3 / 2;
                } else if (iP9 == hfeVar.b() - 1) {
                    rect.left = i3 / 2;
                } else {
                    int i6 = i3 / 2;
                    rect.left = i6;
                    rect.right = i6;
                }
                rect.top = i4;
                rect.bottom = i4;
                break;
            default:
                if (RecyclerView.P(view) == hfeVar.b() - 1) {
                    rect.top = i3;
                    rect.bottom = i4;
                } else if (RecyclerView.P(view) != 0) {
                    rect.top = i3;
                    rect.bottom = i3;
                } else {
                    rect.top = i4;
                    rect.bottom = i3;
                }
                break;
        }
    }

    public /* synthetic */ q91(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
