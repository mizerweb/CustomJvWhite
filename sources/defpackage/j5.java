package defpackage;

import android.view.View;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.AccountActionsBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountActionsBottomSheet b;

    public /* synthetic */ j5(AccountActionsBottomSheet accountActionsBottomSheet, int i) {
        this.a = i;
        this.b = accountActionsBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AccountActionsBottomSheet accountActionsBottomSheet = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AccountActionsBottomSheet.z;
                q5 q5Var = (q5) accountActionsBottomSheet.w.getValue();
                ks9 ks9Var = q5Var.h;
                zv8 zv8Var = q5.k[0];
                ((zu4) ks9Var.b).a(r66.a, new qo7(3, q5Var));
                break;
            default:
                zv8[] zv8VarArr2 = AccountActionsBottomSheet.z;
                jc4 jc4VarC = p.c(R.string.oneme_profile_edit_logout_header, null, null, 6);
                int i2 = 56;
                jc4VarC.a(new kc4(R.id.profile_edit_logout_confirm_action, new tnh(R.string.oneme_profile_edit_logout_confirm_action), 1, i2), new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.oneme_profile_edit_logout_cancel), 2, i2));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(accountActionsBottomSheet);
                confirmationBottomSheetF.setTargetController(accountActionsBottomSheet);
                br4 parentController = accountActionsBottomSheet;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                break;
        }
    }
}
