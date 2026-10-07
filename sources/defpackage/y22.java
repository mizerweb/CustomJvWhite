package defpackage;

import android.view.View;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y22 extends s7g implements r32 {
    public final s32 u;

    public y22(w22 w22Var, s32 s32Var) {
        super(w22Var);
        this.u = s32Var;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        kr1 kr1Var = (kr1) k79Var;
        s32 s32Var = this.u;
        s32Var.a.add(this);
        D(s32Var.b);
        w22 w22Var = (w22) this.a;
        w22Var.K(kr1Var.b, false);
        w22Var.I(kr1Var.c, kr1Var.d, false);
        D(s32Var.b);
    }

    @Override // defpackage.s7g
    public final void C(k79 k79Var, Object obj) {
        kr1 kr1Var = (kr1) k79Var;
        qgc qgcVar = kr1Var.d;
        ll9 ll9Var = kr1Var.c;
        List list = kr1Var.b;
        jr1 jr1Var = obj instanceof jr1 ? (jr1) obj : null;
        View view = this.a;
        if (jr1Var == null) {
            s32 s32Var = this.u;
            s32Var.a.add(this);
            D(s32Var.b);
            w22 w22Var = (w22) view;
            w22Var.K(list, false);
            w22Var.I(ll9Var, qgcVar, false);
            D(s32Var.b);
            return;
        }
        BitSet bitSet = (BitSet) jr1Var.b;
        if (bitSet.get(0)) {
            ((w22) view).K(list, bitSet.get(2));
        }
        if (bitSet.get(1)) {
            ((w22) view).I(ll9Var, qgcVar, bitSet.get(2));
        }
        if (bitSet.get(2)) {
            ((w22) view).B(kr1Var.e);
        }
    }

    @Override // defpackage.r32
    public final void D(q32 q32Var) {
        int i = q32Var != null ? q32Var.a : 0;
        int i2 = i == 0 ? -1 : x22.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 != -1) {
            View view = this.a;
            if (i2 == 1) {
                w22 w22Var = (w22) view;
                w22Var.setStatus(null);
                w22Var.setTitle(null);
                w22Var.setOrganization(null);
                return;
            }
            if (i2 != 2) {
                ore.o();
                return;
            }
            w22 w22Var2 = (w22) view;
            w22Var2.setTitle(q32Var.b);
            w22Var2.setStatus(q32Var.d);
            w22Var2.setOrganization(q32Var.c);
        }
    }
}
