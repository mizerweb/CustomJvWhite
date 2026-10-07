package defpackage;

import one.me.android.root.RootController;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bm8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InviteByPhoneScreen b;

    public /* synthetic */ bm8(InviteByPhoneScreen inviteByPhoneScreen, int i) {
        this.a = i;
        this.b = inviteByPhoneScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        InviteByPhoneScreen inviteByPhoneScreen = this.b;
        switch (i) {
            case 0:
                return ((hm8) inviteByPhoneScreen.d.getAccessor().c(752)).a();
            case 1:
                return new uj4(inviteByPhoneScreen.d.getAccessor().d(97));
            default:
                zv8[] zv8VarArr = InviteByPhoneScreen.p;
                zv8[] zv8VarArr2 = BottomSheetWidget.t;
                ldf ldfVar = SelectCountryBottomSheet.s;
                ha9 ha9VarB = inviteByPhoneScreen.getB().b();
                ldfVar.getClass();
                SelectCountryBottomSheet selectCountryBottomSheetA = ldf.a(ha9VarB, null);
                String name = ldf.class.getName();
                selectCountryBottomSheetA.setTargetController(inviteByPhoneScreen);
                br4 parentController = inviteByPhoneScreen;
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
