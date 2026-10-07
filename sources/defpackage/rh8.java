package defpackage;

import one.me.android.root.RootController;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ rh8(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        InputPhoneScreen inputPhoneScreen = this.b;
        switch (i) {
            case 0:
                ci8 ci8Var = (ci8) inputPhoneScreen.e.getAccessor().c(811);
                ci8Var.getClass();
                return new bi8(ci8Var.a, ci8Var.b, ci8Var.c, ci8Var.d, ci8Var.e, ci8Var.f, ci8Var.g);
            case 1:
                zv8[] zv8VarArr = InputPhoneScreen.v;
                inputPhoneScreen.getContext();
                return null;
            case 2:
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                return new bk8(inputPhoneScreen.getRouter(), inputPhoneScreen.getA());
            default:
                zv8[] zv8VarArr3 = InputPhoneScreen.v;
                zv8[] zv8VarArr4 = BottomSheetWidget.t;
                ldf ldfVar = SelectCountryBottomSheet.s;
                ha9 ha9VarB = inputPhoneScreen.getA().b();
                x0c x0cVar = (x0c) inputPhoneScreen.h.getValue();
                ldfVar.getClass();
                SelectCountryBottomSheet selectCountryBottomSheetA = ldf.a(ha9VarB, x0cVar);
                String name = ldf.class.getName();
                selectCountryBottomSheetA.setTargetController(inputPhoneScreen);
                br4 parentController = inputPhoneScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(selectCountryBottomSheetA, null, null, null, false, -1);
                    p.k(false, lveVar, true, name);
                    hveVarU1.I(lveVar);
                }
                return sbi.a;
        }
    }
}
