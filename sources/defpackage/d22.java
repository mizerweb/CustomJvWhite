package defpackage;

import one.me.android.root.RootController;
import one.me.calls.share.CallSharePickerScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d22 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallSharePickerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d22(lq4 lq4Var, CallSharePickerScreen callSharePickerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callSharePickerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallSharePickerScreen callSharePickerScreen = this.g;
        switch (i) {
            case 0:
                d22 d22Var = new d22(lq4Var, callSharePickerScreen, 0);
                d22Var.f = obj;
                return d22Var;
            default:
                d22 d22Var2 = new d22(lq4Var, callSharePickerScreen, 1);
                d22Var2.f = obj;
                return d22Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((d22) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((d22) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallSharePickerScreen callSharePickerScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (((m8b) obj2).j()) {
                    oi8 oi8Var = CallSharePickerScreen.p;
                    ((a22) callSharePickerScreen.x1().d).f();
                }
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof rt3) {
                    s12.b.b().f();
                } else if (rbbVar instanceof c22) {
                    oi8 oi8Var2 = CallSharePickerScreen.p;
                    jc4 jc4VarC = p.c(R.string.call_share_message_failed_create_p2p_invite_link, null, null, 4);
                    jc4VarC.h(new oc4(R.drawable.icon_warning, 3, 1));
                    int i2 = 32;
                    jc4VarC.a(new kc4(R.id.call_share_picker_confirm_p2p_invite_retry, new tnh(R.string.call_share_picker_confirm_p2p_invite_retry), 3, i2), new kc4(R.id.call_share_picker_confirm_p2p_invite_cancel, new tnh(R.string.call_share_picker_confirm_p2p_invite_cancel), 2, i2));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(callSharePickerScreen);
                    confirmationBottomSheetF.B1(true);
                    vv vvVar = confirmationBottomSheetF.e;
                    zv8 zv8Var = BaseBottomSheetWidget.j[2];
                    vvVar.b(confirmationBottomSheetF, Boolean.FALSE);
                    callSharePickerScreen.o = confirmationBottomSheetF;
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    confirmationBottomSheetF.setTargetController(callSharePickerScreen);
                    br4 parentController = callSharePickerScreen;
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
                    s12.b.e((i65) rbbVar);
                }
                break;
        }
        return sbiVar;
    }
}
