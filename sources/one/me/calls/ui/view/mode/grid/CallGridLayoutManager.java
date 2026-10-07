package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import defpackage.a4c;
import defpackage.a9m;
import defpackage.ca0;
import defpackage.cf7;
import defpackage.cfe;
import defpackage.cj1;
import defpackage.gj1;
import defpackage.gm0;
import defpackage.hfe;
import defpackage.je9;
import defpackage.oc9;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.tc;
import defpackage.ufe;
import defpackage.vee;
import defpackage.vi2;
import defpackage.vn7;
import defpackage.wee;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Lvee;", "a9m", "cj1", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallGridLayoutManager extends vee {
    public final Context p;
    public final int q;
    public final ca0 r;
    public final gj1 s;
    public final a9m t;
    public cj1 u = new vn7(6, this);

    public CallGridLayoutManager(Context context, int i, ca0 ca0Var, gj1 gj1Var, a9m a9mVar) {
        this.p = context;
        this.q = i;
        this.r = ca0Var;
        this.s = gj1Var;
        this.t = a9mVar;
    }

    public final int M0() {
        int iC = this.t.c();
        if (iC < 1) {
            return 1;
        }
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final int N0() {
        a9m a9mVar = this.t;
        gj1 gj1Var = (gj1) a9mVar.e;
        int iCeil = 2;
        if (((Boolean) ((ca0) a9mVar.c).invoke()).booleanValue()) {
            if (!((Boolean) ((gj1) a9mVar.d).invoke()).booleanValue()) {
                iCeil = a9mVar.b;
            } else if (((Number) gj1Var.invoke()).intValue() == 0 || ((Number) gj1Var.invoke()).intValue() == 1) {
                iCeil = 1;
            } else if (((Number) gj1Var.invoke()).intValue() != 2) {
                iCeil = (int) Math.ceil(((Number) gj1Var.invoke()).intValue() / a9mVar.c());
            }
        } else if (((Number) gj1Var.invoke()).intValue() <= 3) {
            iCeil = 1;
        }
        if (iCeil < 1) {
            iCeil = 1;
        }
        if (iCeil < 1) {
            return 1;
        }
        return iCeil;
    }

    public final void O0(cfe cfeVar, int i, int i2, int i3, int i4, cf7 cf7Var) {
        if (i <= 0 || i2 <= 0) {
            String name = CallGridLayoutManager.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                int iD = this.u.d();
                int iC = this.u.c();
                int iN0 = N0();
                int iG = G();
                StringBuilder sbP = qv1.p("layoutItems skipped: non-positive item size itemW=", i, " itemH=", i2, " availableW=");
                qt4.x(iD, iC, " availableH=", " columns=", sbP);
                qt4.x(i3, iN0, " rows=", " itemCount=", sbP);
                sbP.append(iG);
                a4cVar.c(je9Var, name, sbP.toString(), null);
                return;
            }
            return;
        }
        int iG2 = G();
        for (int i5 = 0; i5 < iG2; i5++) {
            View viewD = cfeVar.d(i5);
            b(viewD);
            viewD.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            int i6 = i5 / i3;
            int iIntValue = ((Number) cf7Var.invoke(Integer.valueOf(i6))).intValue();
            int i7 = this.q;
            int i8 = ((i + i7) * (i5 % i3)) + i7 + iIntValue;
            int i9 = ((i2 + i7) * i6) + i7 + i4;
            Rect rect = ((wee) viewD.getLayoutParams()).b;
            viewD.layout(i8 + rect.left, i9 + rect.top, (i8 + i) - rect.right, (i9 + i2) - rect.bottom);
        }
    }

    @Override // defpackage.vee
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        if (G() == 0 || hfeVar.h) {
            q(cfeVar);
            return;
        }
        if (this.u.d() <= 0 || this.u.c() <= 0) {
            String name = CallGridLayoutManager.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qt4.l("onLayoutChildren skipped: non-positive availableWidth:", this.u.d(), this.u.c(), "|availableHeight"), null);
                return;
            }
            return;
        }
        q(cfeVar);
        int iC = 0;
        if (((Boolean) this.r.invoke()).booleanValue()) {
            int i = this.q;
            gj1 gj1Var = this.s;
            int iC2 = (this.u.c() - ((N0() + 1) * i)) / ((((Boolean) gj1Var.invoke()).booleanValue() && (hfeVar.b() == 3 || hfeVar.b() == 4)) ? N0() + 1 : N0());
            int iD = (this.u.d() - ((M0() + 1) * i)) / M0();
            int iN0 = ((N0() + 1) * i) + (N0() * iC2);
            if (((Boolean) gj1Var.invoke()).booleanValue() && iN0 < this.u.c()) {
                iC = (this.u.c() - iN0) / 2;
            }
            O0(cfeVar, iD, iC2, M0(), iC, new vi2(26));
            return;
        }
        int iC3 = this.u.c();
        int i2 = this.q;
        int iN1 = (iC3 - ((N0() + 1) * i2)) / N0();
        ufe ufeVar = new ufe();
        ufeVar.a = (this.u.d() - ((M0() + 1) * i2)) / M0();
        if (hfeVar.b() > 3) {
            ufeVar.a = oc9.v(ufeVar.a, iN1, (int) (iN1 * 1.3333334f));
        }
        int iD2 = (this.u.d() - ((M0() + 1) * i2)) / M0();
        if (ufeVar.a > iD2) {
            ufeVar.a = iD2;
            iN1 = Math.min(iN1, iD2);
        }
        int i3 = iN1;
        int iC4 = this.u.c() - (((N0() + 1) * i2) + (N0() * i3));
        O0(cfeVar, ufeVar.a, i3, M0(), (iC4 >= 0 ? iC4 : 0) / 2, new tc(this, 9, ufeVar));
    }

    @Override // defpackage.vee
    public final wee s() {
        return new wee(-2, -2);
    }
}
