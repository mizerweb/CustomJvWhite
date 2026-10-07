package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class u22 implements at1 {
    public final /* synthetic */ w22 a;

    public u22(w22 w22Var) {
        this.a = w22Var;
    }

    @Override // defpackage.n12
    public final void f() {
        s22 s22Var = this.a.t1;
        if (s22Var != null) {
            ((px1) s22Var).f();
        }
    }

    @Override // defpackage.p52
    public final void h(fu1 fu1Var) {
        s22 s22Var = this.a.t1;
        if (s22Var != null) {
            ((px1) s22Var).h(fu1Var);
        }
    }

    @Override // defpackage.p52
    public final void i(fu1 fu1Var, Point point) {
        s22 s22Var = this.a.t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().R(fu1Var, point);
        }
    }

    @Override // defpackage.p52
    public final void n(fu1 fu1Var) {
        s22 s22Var = this.a.t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().g.g(fu1Var);
        }
    }

    @Override // defpackage.p52
    public final void u(fu1 fu1Var) {
        s22 s22Var = this.a.t1;
        if (s22Var == null) {
            return;
        }
        CallScreen callScreen = ((px1) s22Var).a;
        l6m l6mVar = CallScreen.D1;
        f9b f9bVarI = callScreen.R1().e.i();
        while (true) {
            Object value = f9bVarI.getValue();
            fu1 fu1Var2 = fu1Var;
            if (f9bVarI.h(value, k52.a((k52) value, null, 0, null, fu1Var2, null, null, 0L, 1015))) {
                return;
            } else {
                fu1Var = fu1Var2;
            }
        }
    }

    @Override // defpackage.p52
    public final void w() {
        s22 s22Var = this.a.t1;
        if (s22Var != null) {
            CallScreen callScreen = ((px1) s22Var).a;
            l6m l6mVar = CallScreen.D1;
            callScreen.R1().g.i();
        }
    }
}
