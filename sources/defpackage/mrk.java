package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mrk {
    public static final jc4 a() {
        jc4 jc4VarC = p.c(R.string.photo_editor_clear_confirm_title, null, null, 6);
        jc4VarC.a(new kc4(R.id.media_editor_reset_cancel_id, new tnh(R.string.photo_editor_clear_cancel), 3, true, 3, 4), new kc4(R.id.media_editor_reset_confirm_id, new tnh(R.string.photo_editor_clear_confirm), 2, true, 3, 2));
        return jc4VarC;
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollX(i);
    }

    public static void c(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMaxScrollY(i);
    }

    public static final void d(Widget widget) {
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.settings_exit_question, null, null, 6);
        int i = 32;
        jc4VarC.a(new kc4(R.id.media_editor_exit_cancel_id, new tnh(R.string.settings_exit_question_cancel), 3, i), new kc4(R.id.media_editor_exit_confirm_id, new tnh(R.string.settings_exit_question_quit), 2, i));
        jc4VarC.j(pq3.j.e(widget.getContext()).j().b.getName());
        jc4VarC.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(widget);
        confirmationBottomSheetF.setTargetController(widget);
        br4 parentController = widget;
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
    }

    public static final void e(Widget widget) {
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarA = a();
        jc4VarA.j(pq3.j.e(widget.getContext()).j().b.getName());
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(widget);
        confirmationBottomSheetF.setTargetController(widget);
        br4 parentController = widget;
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
        View view = widget.getView();
        if (view != null) {
            p0m.a(view, mt7.LONG_PRESS);
        }
    }
}
