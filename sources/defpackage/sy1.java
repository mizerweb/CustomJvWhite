package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class sy1 {
    public final ym1 a;
    public final k42 b;

    public sy1(ym1 ym1Var, k42 k42Var) {
        this.a = ym1Var;
        this.b = k42Var;
    }

    public final boolean a() {
        return ((f62) ((n42) this.b).f.a.getValue()).e;
    }

    public final void b(boolean z, boolean z2) {
        boolean zA = a();
        ym1 ym1Var = this.a;
        if (z) {
            ym1Var.o(true);
            ym1.m(ym1Var);
            return;
        }
        ym1Var.y(z2);
        if (!zA) {
            ym1.m(ym1Var);
        } else {
            ym1Var.t();
            ym1Var.x();
        }
    }

    public final void c(boolean z, boolean z2) throws IllegalAccessException, InvocationTargetException {
        je9 je9Var = je9.d;
        boolean zA = a();
        ym1 ym1Var = this.a;
        if (z) {
            ym1.m(ym1Var);
            ym1 ym1Var2 = this.a;
            if (zA) {
                ym1Var2.o(true);
                return;
            }
            RootController rootControllerK = ym1Var2.k();
            boolean zA2 = lvb.w0(rootControllerK.getContext()).a();
            if (!rootControllerK.y1().o()) {
                gm0.n("RootController", "hideWithScalingTopController call indicator wasn't init");
            } else if (RootController.o1(rootControllerK, rootControllerK.z1())) {
                gm0.n("RootController", "hideWithScalingTopController hide call indicator force=" + zA2);
                rootControllerK.s1(false, zA2, null);
            } else {
                RootController.p1(rootControllerK, false);
                gm0.n("RootController", "hideWithScalingTopController call indicator already hidden force=" + zA2);
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PipAppController", zo5.s("try to hide call indicator hasCall=", ym1Var2.f()), null);
                return;
            }
            return;
        }
        if (zA) {
            ym1Var.t();
            return;
        }
        boolean zF = ym1Var.f();
        lve lveVar = (lve) ww3.D1(ym1Var.h().e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        boolean z3 = (br4Var instanceof chb) || br4Var == null;
        boolean z4 = !z3;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "PipAppController", qt4.o("try to show call indicator hasCall=", zF, " canShow=", z4, "."), null);
        }
        if (!z3 && zF) {
            sgg sggVar = ym1Var.w;
            if (sggVar != null) {
                sggVar.b(null);
            }
            ym1Var.w = null;
            RootController rootControllerK2 = ym1Var.k();
            CallIndicatorWidget callIndicatorWidget = new CallIndicatorWidget(ym1Var.f);
            boolean zA3 = z2 ? true : lvb.w0(rootControllerK2.getContext()).a();
            if (rootControllerK2.y1().o() && RootController.o1(rootControllerK2, rootControllerK2.z1())) {
                RootController.p1(rootControllerK2, true);
                gm0.n("RootController", "showWithScalingTopController call indicator already shown.");
            } else {
                gm0.n("RootController", "showWithScalingTopController show call indicator force=" + zA3 + ".");
                rootControllerK2.s1(true, zA3, callIndicatorWidget);
            }
        }
        if (zF) {
            return;
        }
        sgg sggVar2 = ym1Var.w;
        if (sggVar2 == null || !sggVar2.isActive()) {
            gm0.n("PipAppController", "can't show indicator due to call is absent, try to force close indicator.");
            ym1Var.o(true);
        }
    }
}
