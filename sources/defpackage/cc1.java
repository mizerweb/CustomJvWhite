package defpackage;

import android.view.Window;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* JADX INFO: loaded from: classes.dex */
public final class cc1 {
    public final s6 a;

    public cc1(s6 s6Var) {
        this.a = s6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Window window, br4 br4Var, br4 br4Var2, boolean z) {
        lve lveVar;
        z4f z4fVar = br4Var2 instanceof z4f ? (z4f) br4Var2 : null;
        s6 s6Var = this.a;
        if (z4fVar != null) {
            z4fVar.d(window);
        } else if (z) {
            RootController rootController = (RootController) s6Var.get();
            Object objX1 = (rootController == null || (lveVar = (lve) ww3.D1(rootController.y1().e())) == null) ? null : lveVar.a;
            if (objX1 == null) {
                RootController rootController2 = (RootController) s6Var.get();
                objX1 = rootController2 != null ? rootController2.x1() : null;
            }
            z4f z4fVar2 = objX1 instanceof z4f ? (z4f) objX1 : null;
            if (z4fVar2 != null) {
                z4fVar2.d(window);
            }
        }
        if (!(br4Var instanceof CallIndicatorWidget) || z) {
            return;
        }
        RootController rootController3 = (RootController) s6Var.get();
        br4 br4VarX1 = rootController3 != null ? rootController3.x1() : null;
        z4f z4fVar3 = br4VarX1 instanceof z4f ? (z4f) br4VarX1 : null;
        if (z4fVar3 != null) {
            z4fVar3.d(window);
        } else {
            ((z4f) br4Var).j(window);
        }
    }
}
