package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mj1 extends s7g {
    public final lj1 u;

    public mj1(FrameLayout frameLayout) {
        super(frameLayout);
        this.u = (lj1) frameLayout.findViewById(R.id.call_opponents);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        this.u.setOpponents((wgc) k79Var);
    }

    @Override // defpackage.s7g
    public final void F() {
        this.u.v();
    }

    @Override // defpackage.s7g
    public final void G() {
        this.u.v();
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void C(wgc wgcVar, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        lj1 lj1Var = this.u;
        if (list2 == null || list2.isEmpty()) {
            lj1Var.setOpponents(wgcVar);
            return;
        }
        pu6 pu6Var = new pu6(yhf.m0(yhf.q0(new sw(1, list), new vi2(27)), i9.q));
        while (pu6Var.hasNext()) {
            vgc vgcVar = (vgc) pu6Var.next();
            if (vgcVar == null) {
                ore.o();
                return;
            }
            lj1Var.setOpponents(vgcVar.a);
        }
    }
}
