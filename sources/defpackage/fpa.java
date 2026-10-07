package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class fpa extends a29 {
    public final i5f q;
    public final epa r;
    public volatile Integer s;

    public fpa(Context context, int i, i5f i5fVar, epa epaVar) {
        super(context);
        this.q = i5fVar;
        this.r = epaVar;
        if (i >= 0) {
            this.a = i;
        }
    }

    @Override // defpackage.a29
    public final void n(int i, int i2, hfe hfeVar, ffe ffeVar) {
        je9 je9Var = je9.d;
        Integer num = this.s;
        if (num != null) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(MessagesLayoutManager.class.getName());
            if ((!r5h.X0("") ? "" : null) != null) {
                sb.append("#");
            }
            String string = sb.toString();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, string, zo5.h(iIntValue, "LM SmoothScroller onSeekTargetStep pendingJumpToPos="), null);
            }
            ffeVar.d = iIntValue;
            this.s = null;
        }
        super.n(i, i2, hfeVar, ffeVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(MessagesLayoutManager.class.getName());
        if ((r5h.X0("") ? null : "") != null) {
            sb2.append("#");
        }
        String string2 = sb2.toString();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            int i3 = ffeVar.a;
            int i4 = ffeVar.b;
            int i5 = ffeVar.c;
            Interpolator interpolator = ffeVar.e;
            StringBuilder sbP = qv1.p("LM SmoothScroller onSeekTargetStep dx=", i, " dy=", i2, " action.dx=");
            qt4.x(i3, i4, " action.dy=", " action.duration=", sbP);
            sbP.append(i5);
            sbP.append(" action.interpolator=");
            sbP.append(interpolator);
            sbP.append(" recyclerView.state=");
            sbP.append(hfeVar);
            a4cVar2.c(je9Var, string2, sbP.toString(), null);
        }
    }

    @Override // defpackage.a29
    public final void o() {
        this.r.invoke(Integer.valueOf(this.a));
        super.o();
    }

    @Override // defpackage.a29
    public final void p(View view, hfe hfeVar, ffe ffeVar) {
        fpa fpaVar;
        int iT;
        if (hfeVar.h) {
            gm0.Y(fpa.class.getName(), "Early return in onTargetFound cuz of state.isPreLayout");
            return;
        }
        int i = i();
        vee veeVar = this.c;
        if (veeVar == null || !veeVar.f()) {
            fpaVar = this;
            iT = 0;
        } else {
            wee weeVar = (wee) view.getLayoutParams();
            fpaVar = this;
            iT = fpaVar.t(vee.F(view) - ((ViewGroup.MarginLayoutParams) weeVar).topMargin, vee.z(view) + ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin, veeVar.L(), veeVar.o - veeVar.I(), i);
        }
        int iE = fpaVar.e(Math.abs(iT));
        if (iE > 0) {
            int i2 = -iT;
            if (iE > 300) {
                iE = 300;
            }
            ffeVar.b(0, i2, iE, fpaVar.j);
        }
    }

    public final int t(int i, int i2, int i3, int i4, int i5) {
        fpa fpaVar;
        int i6;
        int i7;
        int i8;
        int i9;
        i5f i5fVar = i5f.c;
        i5f i5fVar2 = this.q;
        if (i5fVar2 == i5fVar) {
            return (((i4 - i3) / 2) + i3) - (((i2 - i) / 2) + i);
        }
        boolean z = i5fVar2 == i5f.b;
        if (i5 == -1) {
            return zo5.b(30.0f, yl5.d().getDisplayMetrics().density, i3 - i);
        }
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = i4 - i2;
                return (i10 - (i2 - i) >= i3 || z) ? i10 : i3 - i;
            }
            ore.p("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        if (z) {
            fpaVar = this;
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
        } else {
            fpaVar = this;
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            int iT = fpaVar.t(i6, i7, i8, i9, -1);
            if (iT > 0) {
                return iT;
            }
        }
        int iT2 = fpaVar.t(i6, i7, i8, i9, 1);
        if (iT2 < 0) {
            return iT2;
        }
        return 0;
    }

    public final void u(int i) {
        if (i == -1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MessagesLayoutManager.class.getName());
        if ((r5h.X0("") ? null : "") != null) {
            sb.append("#");
        }
        String string = sb.toString();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, string, zo5.h(i, "LM SmoothScroller replanTo="), null);
            }
        }
        this.a = i;
        this.s = Integer.valueOf(i);
    }
}
