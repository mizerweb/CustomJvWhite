package defpackage;

import android.content.Context;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tol {
    public static final String a(Context context, String str, boolean z, boolean z2) {
        if (z) {
            if (str == null) {
                str = "";
            }
            str = context.getString(R.string.tt_scheduled_message_send_failure, str);
        } else if (!z2) {
            if (str == null) {
                str = "";
            }
            str = context.getString(R.string.tt_scheduled_message_send_success, str);
        } else if (str == null) {
            str = "";
        }
        if (z2) {
            return str;
        }
        return context.getResources().getConfiguration().getLayoutDirection() == 1 ? zo5.o(str, " ⏱️") : qv1.k("⏱ ️", str);
    }

    public static void b(Widget widget) {
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.oneme_contact_not_found_bottom_sheet_title, null, null, 6);
        jc4VarC.g(new tnh(R.string.oneme_contact_not_found_bottom_sheet_subtitle));
        jc4VarC.d(R.id.oneme_contact_not_found_bottom_sheet_positive_button, new tnh(R.string.oneme_invite));
        jc4VarC.d(R.id.oneme_contact_not_found_bottom_sheet_negative_button, new tnh(R.string.oneme_contact_not_found_bottom_sheet_negative_button));
        ConfirmationBottomSheet confirmationBottomSheetE = jc4VarC.e(widget.getB().b());
        confirmationBottomSheetE.setTargetController(widget);
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetE, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }
}
