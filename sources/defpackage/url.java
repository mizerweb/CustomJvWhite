package defpackage;

import java.text.DecimalFormat;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class url {
    public static final String a(long j) {
        if (j < 0) {
            ore.p("Bytes cannot be negative");
            return null;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = j;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d2) + ' ' + strArr[i];
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double dPow = Math.pow(1024.0d, i);
            double dFloor = Math.floor(d / dPow);
            if (dFloor > 0.0d) {
                sb.append(decimalFormat.format(dFloor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= dFloor * dPow;
            }
            i--;
        }
        return r5h.y1(sb).toString();
    }

    public static final boolean b(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null || !r5h.L0(message, "No space left on device", false)) {
            return b(th.getCause());
        }
        return true;
    }

    public static void c(CharSequence charSequence, Widget widget) {
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarA = mol.a(new vnh(R.string.oneme_fodlers_delete_folder_bottom_sheet_title, a.n1(new Object[]{charSequence})), null, null, 6);
        jc4VarA.g(new tnh(R.string.oneme_folders_delete_folder_bottom_sheet_description));
        jc4VarA.a(new kc4(R.id.oneme_folders_delete_folder_bottom_sheet_delete_button, new tnh(R.string.delete), 3, true, 3, 1), new kc4(R.id.oneme_folders_delete_folder_bottom_sheet_cancel_button, new tnh(R.string.oneme_folders_delete_folder_bottom_sheet_cancel_delete_button), 2, true, 3, 2));
        jc4VarA.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet confirmationBottomSheetE = jc4VarA.e(widget.getB().b());
        br4 parentController = widget;
        confirmationBottomSheetE.setTargetController(parentController);
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
