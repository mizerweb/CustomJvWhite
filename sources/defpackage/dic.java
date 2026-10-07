package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dic implements spa {
    public final r8e a;
    public final boolean b;

    public dic(r8e r8eVar, boolean z) {
        this.a = r8eVar;
        this.b = z;
    }

    @Override // defpackage.spa
    public final Object a(rt2 rt2Var, opa opaVar, lq4 lq4Var) {
        vg4 vg4VarW;
        List listS;
        eic eicVar = (eic) this.a.a.getValue();
        return (eicVar == null || !this.b || rt2Var == null || !rt2Var.h0() || rt2Var.y0() || (vg4VarW = rt2Var.w()) == null || vg4VarW.E() || (listS = vg4VarW.s()) == null || listS.isEmpty()) ? r66.a : Collections.singletonList(eicVar);
    }
}
