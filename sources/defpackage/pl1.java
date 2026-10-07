package defpackage;

import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pl1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ pl1(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = CallHistoryScreen.D;
                br4 parentController = callHistoryScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                return Boolean.valueOf(hveVarU1 != null && hveVarU1.o());
            case 1:
                zv8[] zv8VarArr2 = CallHistoryScreen.D;
                return callHistoryScreen.getRouter();
            case 2:
                h hVar = callHistoryScreen.d;
                pfb pfbVar = (pfb) hVar.getAccessor().c(772);
                xu1 xu1Var = (xu1) callHistoryScreen.f.getValue();
                ca2 ca2Var = callHistoryScreen.b;
                ca2Var.getAccessor().getClass();
                return new vl1(callHistoryScreen.c, pfbVar, xu1Var, ca2Var.getAccessor().d(350), hVar.getAccessor().d(778));
            case 3:
                ca2 ca2Var2 = callHistoryScreen.b;
                ifh ifhVar = new ifh(new pl1(callHistoryScreen, z ? 1 : 0));
                svj svjVar = new svj(callHistoryScreen, 0);
                yu1 yu1Var = (yu1) ca2Var2.getAccessor().c(349);
                return new xu1(svjVar, ifhVar, yu1Var.a, yu1Var.b, yu1Var.c, yu1Var.d);
            case 4:
                av1 av1Var = (av1) callHistoryScreen.i.getValue();
                return new ea2(av1Var.a, av1Var.b, new svj(callHistoryScreen, 1), new pl1(callHistoryScreen, i2), callHistoryScreen.lifecycleOwner, av1Var.c);
            default:
                zv8[] zv8VarArr3 = CallHistoryScreen.D;
                return new ql1(i2, callHistoryScreen);
        }
    }
}
