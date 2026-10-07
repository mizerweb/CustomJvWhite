package defpackage;

import java.util.ArrayList;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class gx1 implements fr4 {
    public final /* synthetic */ CallScreen a;

    public gx1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        Object value;
        l6m l6mVar = CallScreen.D1;
        CallScreen callScreen = this.a;
        h02 h02VarR1 = callScreen.R1();
        br4 parentController = callScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        ArrayList arrayListE = hveVarU1 != null ? hveVarU1.e() : null;
        boolean z2 = true ^ (arrayListE == null || arrayListE.isEmpty());
        mjg mjgVar = h02VarR1.C;
        do {
            value = mjgVar.getValue();
            ((Boolean) value).getClass();
        } while (!mjgVar.h(value, Boolean.valueOf(z2)));
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
    }
}
