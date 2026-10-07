package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class et1 extends g6g {
    public final ft0 f;

    public et1(ft0 ft0Var, ExecutorService executorService) {
        super(executorService);
        this.f = ft0Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((k79) this.d.f.get(i)).getF();
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        s7g s7gVar = (s7g) lfeVar;
        boolean zIsEmpty = list.isEmpty();
        d20 d20Var = this.d;
        if (zIsEmpty) {
            s7gVar.B((k79) d20Var.f.get(i));
            return;
        }
        if (((k79) d20Var.f.get(i)).getF() != 1) {
            s7gVar.B((k79) d20Var.f.get(i));
            return;
        }
        dt1 dt1Var = (dt1) s7gVar;
        View view = dt1Var.a;
        pu6 pu6Var = new pu6(yhf.m0(yhf.q0(new sw(1, list), new xk1(11)), i9.t));
        while (pu6Var.hasNext()) {
            xs1 xs1Var = (xs1) pu6Var.next();
            if (xs1Var instanceof ws1) {
                ((izb) view).setTitle(((ws1) xs1Var).a);
            } else if (xs1Var instanceof ss1) {
                ((izb) view).setSubtitle(((ss1) xs1Var).a);
            } else if (xs1Var instanceof rs1) {
                rs1 rs1Var = (rs1) xs1Var;
                ((izb) view).j(rs1Var.a.a, rs1Var.b, rs1Var.c);
            } else if (xs1Var instanceof ts1) {
                ts1 ts1Var = (ts1) xs1Var;
                dt1Var.H(ts1Var.a, ts1Var.b, ts1Var.c);
            } else {
                if (xs1Var instanceof us1) {
                    us1 us1Var = (us1) xs1Var;
                    boolean z = us1Var.a;
                    fu1 fu1Var = us1Var.b;
                    if (z) {
                        view.setOnClickListener(null);
                    } else {
                        qe7.H(view, 300L, new ee(dt1Var, 8, fu1Var));
                    }
                } else {
                    if (!(xs1Var instanceof vs1)) {
                        ore.o();
                        return;
                    }
                    ((izb) view).setAvatarOverlay(((vs1) xs1Var).a ? dt1Var.v : null);
                }
            }
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new dt1(viewGroup.getContext(), this.f);
        }
        ore.p(c0a.k(i, "Not supported viewType=", " for CallOpponentsListAdapter"));
        return null;
    }
}
