package one.me.chats.list.folderwidget.section;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bc1;
import defpackage.cfe;
import defpackage.gm0;
import defpackage.hfe;
import defpackage.hj8;
import defpackage.j47;
import defpackage.k47;
import defpackage.oc9;
import defpackage.r5a;
import defpackage.vee;
import defpackage.wee;
import defpackage.yl5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/chats/list/folderwidget/section/FolderWidgetLayoutManager;", "Lvee;", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FolderWidgetLayoutManager extends vee {
    public final Context p;
    public int q;
    public int r;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v;
    public int w;
    public boolean x;

    public FolderWidgetLayoutManager(Context context) {
        this.p = context;
    }

    public final void M0(int i, int i2, int i3) {
        j47 j47Var;
        boolean z = this.q == 0 || this.r == 0;
        boolean z2 = (i == this.t && i2 == this.u) ? false : true;
        if (z || z2 || i3 != this.s) {
            hj8 hj8Var = k47.c;
            int i4 = hj8Var.a;
            int i5 = hj8Var.b;
            this.r = (i2 > i5 || i4 > i2 ? i3 <= 1 : i3 <= 2) ? gm0.K(92.0f * yl5.d().getDisplayMetrics().density) : gm0.K(128.0f * yl5.d().getDisplayMetrics().density);
            hj8 hj8Var2 = k47.a;
            int i6 = hj8Var2.a;
            if (i2 > hj8Var2.b || i6 > i2) {
                hj8 hj8Var3 = k47.b;
                int i7 = hj8Var3.a;
                if (i2 > hj8Var3.b || i7 > i2) {
                    j47Var = (i2 > i5 || hj8Var.a > i2) ? new j47(4, gm0.K(98.0f * yl5.d().getDisplayMetrics().density), gm0.K(138.0f * yl5.d().getDisplayMetrics().density)) : new j47(4, gm0.K(138.0f * yl5.d().getDisplayMetrics().density), gm0.K(284.0f * yl5.d().getDisplayMetrics().density));
                } else {
                    j47Var = new j47(4, gm0.K(98.0f * yl5.d().getDisplayMetrics().density), gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
                }
            } else {
                j47Var = new j47(3, gm0.K(98.0f * yl5.d().getDisplayMetrics().density), gm0.K(110.0f * yl5.d().getDisplayMetrics().density));
            }
            this.q = i3 < j47Var.a ? i / i3 : oc9.v((int) ((((double) r5a.f(8.0f, yl5.d().getDisplayMetrics().density, 2, i)) - ((Math.floor(3.5d) - 1.0d) * ((double) gm0.K(6.0f * yl5.d().getDisplayMetrics().density)))) / 3.5d), j47Var.b, j47Var.c);
            this.s = i3;
            this.t = i;
            this.u = i2;
        }
    }

    @Override // defpackage.vee
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.vee
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        if (hfeVar.b() == 0) {
            r0(cfeVar);
            return;
        }
        q(cfeVar);
        int i = this.n;
        int iK = gm0.K(i / this.p.getResources().getDisplayMetrics().density);
        M0(i, iK, hfeVar.b());
        this.w = hfeVar.b() * this.q;
        hj8 hj8Var = k47.a;
        int iB = hfeVar.b();
        hj8 hj8Var2 = k47.a;
        int i2 = hj8Var2.a;
        boolean z = true;
        if (iK > hj8Var2.b || i2 > iK ? iB <= 3 : iB <= 2) {
            z = false;
        }
        this.x = z;
        int i3 = this.w - i;
        if (i3 < 0) {
            i3 = 0;
        }
        int iV = oc9.v(this.v, 0, i3);
        this.v = iV;
        int iG = bc1.g(8.0f, yl5.d().getDisplayMetrics().density, 2, this.r);
        int iB2 = hfeVar.b();
        int i4 = -iV;
        int i5 = 0;
        while (i5 < iB2) {
            View viewD = cfeVar.d(i5);
            b(viewD);
            wee weeVar = (wee) viewD.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) weeVar).width = this.q;
            ((ViewGroup.MarginLayoutParams) weeVar).height = this.r;
            viewD.setLayoutParams(weeVar);
            T(viewD, 0, 0);
            int i6 = i4 + this.q;
            S(viewD, i4, 0, i6, iG);
            i5++;
            i4 = i6;
        }
        cfeVar.a.clear();
        cfeVar.f();
    }

    @Override // defpackage.vee
    public final void m0(hfe hfeVar, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.n;
        int iK = gm0.K(i3 / this.p.getResources().getDisplayMetrics().density);
        if (hfeVar.b() > 0) {
            M0(i3, iK, hfeVar.b());
        } else {
            this.r = 0;
        }
        this.b.setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(I() + L() + this.r, i2));
    }

    @Override // defpackage.vee
    public final wee s() {
        return new wee(-2, -2);
    }

    @Override // defpackage.vee
    public final int y0(int i, cfe cfeVar, hfe hfeVar) {
        if (!this.x) {
            return 0;
        }
        int i2 = this.w - this.n;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iV = oc9.v(this.v + i, 0, i2);
        int i3 = iV - this.v;
        if (i3 != 0) {
            this.v = iV;
            U(-i3);
        }
        return i3;
    }
}
