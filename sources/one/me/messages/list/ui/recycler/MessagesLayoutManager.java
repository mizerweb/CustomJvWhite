package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4c;
import defpackage.c9b;
import defpackage.epa;
import defpackage.fpa;
import defpackage.gba;
import defpackage.gm0;
import defpackage.gpa;
import defpackage.hfe;
import defpackage.hic;
import defpackage.i5f;
import defpackage.je9;
import defpackage.k36;
import defpackage.lfe;
import defpackage.n7j;
import defpackage.nee;
import defpackage.oc9;
import defpackage.ore;
import defpackage.qv1;
import defpackage.r1f;
import defpackage.s5h;
import defpackage.vka;
import defpackage.xx2;
import defpackage.yl5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "fpa", "gpa", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final String E;
    public i5f F;
    public boolean G;
    public int H;
    public boolean I;
    public RecyclerView J;
    public final Rect K;
    public fpa L;
    public final c9b M;
    public final k36 N;

    public MessagesLayoutManager(Context context) {
        super(1, false);
        this.E = MessagesLayoutManager.class.getName();
        this.F = i5f.a;
        this.H = -1;
        this.K = new Rect();
        c9b c9bVar = r1f.a;
        this.M = new c9b();
        this.N = new k36(26, this);
        r1(true);
        this.h = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void J0(RecyclerView recyclerView, int i) {
        int i2;
        i5f i5fVar;
        i5f i5fVar2 = i5f.b;
        je9 je9Var = je9.d;
        this.I = true;
        this.G = false;
        int iX0 = X0();
        int iZ0 = Z0();
        if (iX0 == -1 || iZ0 == -1) {
            z0(i);
            return;
        }
        if (iX0 > i || i > iZ0) {
            boolean z = i < iX0;
            if (!z) {
                iX0 = iZ0;
            }
            if (Math.abs(iX0 - i) > 3) {
                iZ0 = z ? i2 : i2;
                String str = this.E;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    nee adapter = recyclerView.getAdapter();
                    a4cVar.c(je9Var, str, "LM fast scroll by pos:" + i + ", curSize:" + (adapter != null ? Integer.valueOf(adapter.l()) : null) + ", fastScrollPosition:" + iZ0, null);
                }
                super.z0(iZ0);
            }
        }
        int iX1 = X0();
        boolean z2 = iX1 == Z0();
        boolean z3 = G() - 1 == i;
        boolean z4 = iX1 == i;
        if ((!z2 || !z3 || !z4) && (i5fVar = this.F) != i5fVar2) {
            i5fVar2 = i5fVar;
        }
        fpa fpaVar = new fpa(recyclerView.getContext(), i, i5fVar2, new epa(this, i, recyclerView, 0));
        this.L = fpaVar;
        String str2 = this.E;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            nee adapter2 = recyclerView.getAdapter();
            a4cVar2.c(je9Var, str2, "LM smooth scroll by pos:" + i + ", curSize:" + (adapter2 != null ? Integer.valueOf(adapter2.l()) : null), null);
        }
        K0(fpaVar);
    }

    @Override // defpackage.vee
    public final void S(View view, int i, int i2, int i3, int i4) {
        lfe lfeVarS;
        RecyclerView recyclerView = this.J;
        if (recyclerView == null || (lfeVarS = recyclerView.S(view)) == null) {
            return;
        }
        boolean z = lfeVarS instanceof xx2;
        boolean z2 = lfeVarS instanceof hic;
        int i5 = lfeVarS.f;
        if (i5 != 0 && !z && !vka.e(i5) && !z2) {
            super.S(view, i, i2, i3, i4);
            return;
        }
        int i6 = i3 - i;
        int width = ((recyclerView.getWidth() - i6) / 2) + recyclerView.getLeft();
        super.S(view, width, i2, i6 + width, i4);
    }

    @Override // defpackage.vee
    public final void X(RecyclerView recyclerView) {
        this.J = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void Y(RecyclerView recyclerView) {
        Handler handler;
        RecyclerView recyclerView2 = this.J;
        if (recyclerView2 != null && (handler = recyclerView2.getHandler()) != null) {
            handler.removeCallbacks(this.N);
        }
        this.J = null;
        this.K.setEmpty();
        this.L = null;
    }

    @Override // defpackage.vee
    public final void e0(int i, int i2) {
        int i3;
        int iG = G();
        String str = this.E;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbP = qv1.p("adjustTargetOnInsert, start:", i, ", insert:", i2, ", curCount:");
                sbP.append(iG);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        fpa fpaVar = this.L;
        if (fpaVar != null && (i3 = fpaVar.a) != -1 && i <= i3) {
            int iV = oc9.v(i3 + i2, 0, (iG < 1 ? 1 : iG) - 1);
            if (iV == iG - 1 && iG == i2) {
                String str2 = this.E;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        StringBuilder sbP2 = qv1.p("adjustTargetOnInsert, try ignore replanTo ", iV, ", in corner case when it's first insert, \n                        |itemCount:", iG, ", \n                        |curPos:");
                        sbP2.append(i3);
                        sbP2.append("\n                        |");
                        a4cVar2.c(je9Var2, str2, s5h.y0(sbP2.toString()), null);
                    }
                }
            } else {
                fpaVar.u(iV);
            }
        }
        w1();
    }

    @Override // defpackage.vee
    public final void f0() {
        fpa fpaVar = this.L;
        if (fpaVar == null) {
            gm0.Y(MessagesLayoutManager.class.getName(), "Early return in replanOnDataSetChanged cuz of activeSmoothScroller is null");
        } else {
            int iG = G();
            if (iG <= 0) {
                fpaVar.s();
                this.L = null;
                this.I = false;
            } else {
                int iV = oc9.v(fpaVar.a, 0, iG - 1);
                if (iV != fpaVar.a) {
                    fpaVar.u(iV);
                }
            }
        }
        w1();
    }

    @Override // defpackage.vee
    public final void g0(int i, int i2) {
        int i3;
        int i4;
        String str = this.E;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                int iG = G();
                StringBuilder sbP = qv1.p("adjustTargetOnMove, from:", i, ", to:", i2, ", moved:1, curCount:");
                sbP.append(iG);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        fpa fpaVar = this.L;
        if (fpaVar != null && (i3 = fpaVar.a) != -1) {
            int i5 = i + 1;
            if (i <= i3 && i3 < i5) {
                i4 = (i2 - i) + i3;
            } else if (i >= i3 || i2 < i3) {
                i4 = (i <= i3 || i2 > i3) ? i3 : i3 + 1;
            } else {
                i4 = i3 - 1;
            }
            int iG2 = G();
            if (iG2 < 1) {
                iG2 = 1;
            }
            int iV = oc9.v(i4, 0, iG2 - 1);
            if (iV != i3) {
                fpaVar.u(iV);
            }
        }
        w1();
    }

    @Override // defpackage.vee
    public final void h0(int i, int i2) {
        int i3;
        int i4;
        int iG = G();
        int i5 = this.H;
        this.H = -1;
        String str = this.E;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbP = qv1.p("adjustTargetOnRemove, start:", i, ", removed:", i2, ", curCount:");
                sbP.append(iG);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        fpa fpaVar = this.L;
        if (fpaVar != null && (i3 = fpaVar.a) != -1) {
            int i6 = (i + i2) - 1;
            if (iG <= 0) {
                fpaVar.s();
                this.L = null;
                this.I = false;
            } else {
                if (i <= i3 && i3 <= i6) {
                    i4 = iG - 1;
                    if (i <= i4) {
                        i4 = i;
                    }
                } else if (i < i3) {
                    int i7 = i3 - i2;
                    i4 = i7 >= 0 ? i7 : 0;
                } else {
                    i4 = i3;
                }
                if ((i == 0 && i2 >= iG) || (i == 0 && i5 == iG)) {
                    String str2 = this.E;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            StringBuilder sbP2 = qv1.p("adjustTargetOnRemove, try ignore replanTo ", i4, ", in corner case when it's remove all before insert new, \n                    |itemCount:", iG, ", \n                    |curPos:");
                            sbP2.append(i3);
                            sbP2.append("\n                    |");
                            a4cVar2.c(je9Var2, str2, s5h.y0(sbP2.toString()), null);
                        }
                    }
                } else if (i4 != i3) {
                    fpaVar.u(i4);
                }
            }
        }
        w1();
    }

    @Override // defpackage.vee
    public final void i0() {
        w1();
    }

    @Override // defpackage.vee
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        w1();
        w1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void l0(hfe hfeVar) {
        super.l0(hfeVar);
        if (X0() == -1 || Z0() == -1) {
            return;
        }
        c9b c9bVar = this.M;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((gpa) objArr[(i << 3) + i3]).b();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[LOOP:0: B:5:0x000d->B:17:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[EDGE_INSN: B:21:0x0055->B:18:0x0055 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x0052], SYNTHETIC] */
    public final void v1(gpa gpaVar) {
        c9b c9bVar = this.M;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (((gpa) objArr[i4]).getTag().equals(gpaVar.getTag())) {
                                c9bVar.h(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c9bVar.a(gpaVar);
    }

    public final void w1() {
        Handler handler;
        Handler handler2;
        RecyclerView recyclerView = this.J;
        k36 k36Var = this.N;
        if (recyclerView != null && (handler2 = recyclerView.getHandler()) != null) {
            handler2.removeCallbacks(k36Var);
        }
        RecyclerView recyclerView2 = this.J;
        if (recyclerView2 == null || (handler = recyclerView2.getHandler()) == null) {
            return;
        }
        handler.postAtFrontOfQueue(k36Var);
    }

    public final void x1(String str) {
        c9b c9bVar = this.M;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (((gpa) objArr[i4]).getTag().equals(str)) {
                            c9bVar.h(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void y1(View view, int i) {
        int iOrdinal = this.F.ordinal();
        if (iOrdinal == 0) {
            p1(i, gm0.K(30.0f * yl5.d().getDisplayMetrics().density));
            return;
        }
        Rect rect = this.K;
        if (iOrdinal == 1) {
            RecyclerView.U(rect, view);
            RecyclerView recyclerView = this.J;
            p1(i, (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height());
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            RecyclerView.U(rect, view);
            RecyclerView recyclerView2 = this.J;
            int height = ((recyclerView2 != null ? recyclerView2.getHeight() : 0) - rect.height()) / 2;
            p1(i, height >= 0 ? height : 0);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void z0(int i) {
        this.I = true;
        View viewR = r(i);
        if (viewR == null) {
            super.z0(i);
            RecyclerView recyclerView = this.J;
            if (recyclerView != null) {
                n7j.e(recyclerView, new gba(this, i, 1));
                return;
            } else {
                this.I = false;
                return;
            }
        }
        String str = this.E;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                int iG = G();
                i5f i5fVar = this.F;
                StringBuilder sbP = qv1.p("LM scroll to inflated view by pos:", i, ", curSize:", iG, ", alignment: ");
                sbP.append(i5fVar);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        y1(viewR, i);
        this.G = false;
        this.I = false;
    }
}
