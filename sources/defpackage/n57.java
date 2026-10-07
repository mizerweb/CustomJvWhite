package defpackage;

import androidx.recyclerview.widget.a;
import java.util.List;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class n57 extends mz4 {
    public static final nhb t = new nhb(17);
    public final t3f k;
    public final ha9 l;
    public final br4 m;
    public final a n;
    public final xq4 o;
    public final m57 p;
    public final cf7 q;
    public final String r;
    public List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n57(t3f t3fVar, ha9 ha9Var, br4 br4Var, a aVar, qyb qybVar, g3 g3Var, int i) {
        super(br4Var);
        xq4 xq4Var = (i & 16) != 0 ? xq4.a : xq4.b;
        m57 m57Var = (i & 32) != 0 ? t : qybVar;
        cf7 ik4Var = (i & 64) != 0 ? new ik4(2) : g3Var;
        this.k = t3fVar;
        this.l = ha9Var;
        this.m = br4Var;
        this.n = aVar;
        this.o = xq4Var;
        this.p = m57Var;
        this.q = ik4Var;
        this.r = n57.class.getName();
        this.s = r66.a;
    }

    @Override // defpackage.mz4
    public final void G(hve hveVar, int i) {
        if (hveVar.o()) {
            return;
        }
        String str = ((q37) this.s.get(i)).a;
        Widget widgetA = this.p.a(str, this.k, this.l, this.n, this.q);
        widgetA.setTargetController(this.m);
        widgetA.setRetainViewMode(this.o);
        lve lveVar = new lve(widgetA, null, null, null, false, -1);
        lveVar.e("chats-list-".concat(str));
        hveVar.T(lveVar);
    }

    public final void L(int i) {
        lve lveVar;
        int size = this.s.size();
        int i2 = 0;
        while (i2 < size) {
            boolean z = i == i2;
            hve hveVarI = I(i2);
            Object obj = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
            an3 an3Var = obj instanceof an3 ? (an3) obj : null;
            if (an3Var != null) {
                if (z) {
                    String str = this.r;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.h(i, "Change page visible, pos:"), null);
                        }
                    }
                }
                an3Var.v0(z);
            }
            i2++;
        }
    }

    public final void M(List list) {
        if (this.s.isEmpty() && !list.isEmpty()) {
            this.s = list;
            r(0, list.size());
        } else {
            nl5 nl5VarJ = tre.J(new wk1(1, this.s, list));
            this.s = list;
            nl5VarJ.a(new t3a(this));
        }
    }

    @Override // defpackage.nee
    public final int l() {
        return this.s.size();
    }

    @Override // defpackage.mz4, defpackage.nee
    public final long m(int i) {
        q37 q37Var = (q37) ww3.u1(i, this.s);
        String str = q37Var != null ? q37Var.a : null;
        return str != null ? str.hashCode() : 0;
    }
}
