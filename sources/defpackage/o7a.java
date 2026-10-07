package defpackage;

import java.util.List;
import one.me.android.root.RootController;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o7a extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MediaTypePickerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7a(lq4 lq4Var, MediaTypePickerWidget mediaTypePickerWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mediaTypePickerWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MediaTypePickerWidget mediaTypePickerWidget = this.g;
        switch (i) {
            case 0:
                o7a o7aVar = new o7a(lq4Var, mediaTypePickerWidget, 0);
                o7aVar.f = obj;
                return o7aVar;
            default:
                o7a o7aVar2 = new o7a(lq4Var, mediaTypePickerWidget, 1);
                o7aVar2.f = obj;
                return o7aVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((o7a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((o7a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaTypePickerWidget mediaTypePickerWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                mediaTypePickerWidget.g.I(list, new ng7(mediaTypePickerWidget, 12, list));
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (cqk.d(rbbVar, c7a.b)) {
                    zv8[] zv8VarArr = MediaTypePickerWidget.i;
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.media_type_picker__file_dialog__title, null, null, 6);
                    int i2 = 1;
                    int i3 = 3;
                    int i4 = 56;
                    jc4VarC.a(new kc4(i2, new tnh(R.string.media_type_picker__file_dialog__from_gallery), i3, i4));
                    jc4VarC.a(new kc4(2, new tnh(R.string.media_type_picker__file_dialog__from_file_manager), i3, i4));
                    jc4VarC.a(new kc4(i3, new tnh(R.string.media_type_picker__file_dialog__cancel), i2, i4));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(mediaTypePickerWidget);
                    confirmationBottomSheetF.setTargetController(mediaTypePickerWidget);
                    br4 parentController = mediaTypePickerWidget;
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
                } else if (rbbVar instanceof i65) {
                    tb3.b.e((i65) rbbVar);
                }
                break;
        }
        return sbiVar;
    }
}
