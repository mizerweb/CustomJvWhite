package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.calls.ui.ui.pip.PipScreen;

/* JADX INFO: loaded from: classes.dex */
public final class sm1 implements fr4 {
    public final /* synthetic */ ym1 a;

    public sm1(ym1 ym1Var) {
        this.a = ym1Var;
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        lve lveVar;
        br4 br4Var3;
        boolean z2 = br4Var instanceof chb;
        ym1 ym1Var = this.a;
        boolean z3 = z2 || !((lveVar = (lve) ww3.D1(ym1Var.h().e())) == null || (br4Var3 = lveVar.a) == null || !(br4Var3 instanceof chb));
        if (br4Var != null) {
            ym1Var.e().b(z3, false);
        }
        if (z || !(br4Var2 instanceof chb) || (br4Var2 instanceof PipScreen) || br4Var != null) {
            return;
        }
        ym1Var.e().b(z3, true);
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) throws IllegalAccessException, InvocationTargetException {
        ym1 ym1Var = this.a;
        k42 k42Var = ym1Var.a;
        ny8 ny8Var = ym1Var.o;
        boolean z2 = false;
        if (br4Var != null) {
            ym1Var.e().c(br4Var instanceof chb, false);
        }
        if (!z && (br4Var2 instanceof chb) && !(br4Var2 instanceof PipScreen) && br4Var == null) {
            ym1Var.e().c(br4Var instanceof chb, true);
        }
        boolean z3 = br4Var instanceof PipScreen;
        nkg nkgVar = nkg.b;
        if (z3 && !(br4Var2 instanceof PipScreen)) {
            okg okgVar = (okg) ny8Var.getValue();
            String strA = ns4.a(((f62) ((n42) k42Var).f.a.getValue()).i);
            mjg mjgVar = okgVar.a;
            if (mjgVar.getValue() != nkgVar) {
                okgVar.a(strA, true);
            }
            mjgVar.j(null, nkgVar);
        }
        boolean z4 = br4Var2 instanceof PipScreen;
        if (z4 && !z3) {
            okg okgVar2 = (okg) ny8Var.getValue();
            String strA2 = ns4.a(((f62) ((n42) k42Var).f.a.getValue()).i);
            mjg mjgVar2 = okgVar2.a;
            if (mjgVar2.getValue() == nkgVar) {
                okgVar2.a(strA2, false);
            }
            mjgVar2.j(null, nkg.a);
        }
        if (z4 && br4Var == null) {
            gm0.n("PipAppController", "pip screen was hidden quietly, skip hide fake pip.");
            return;
        }
        if ((br4Var2 instanceof chb) || br4Var2 == null) {
            if (ym1Var.g() && ym1Var.e().a()) {
                z2 = true;
            }
            ym1Var.u = z2;
        }
    }
}
