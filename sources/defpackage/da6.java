package defpackage;

import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class da6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ EnterPinCodeScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da6(lq4 lq4Var, EnterPinCodeScreen enterPinCodeScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = enterPinCodeScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        EnterPinCodeScreen enterPinCodeScreen = this.g;
        switch (i) {
            case 0:
                da6 da6Var = new da6(lq4Var, enterPinCodeScreen, 0);
                da6Var.f = obj;
                return da6Var;
            case 1:
                da6 da6Var2 = new da6(lq4Var, enterPinCodeScreen, 1);
                da6Var2.f = obj;
                return da6Var2;
            default:
                da6 da6Var3 = new da6(lq4Var, enterPinCodeScreen, 2);
                da6Var3.f = obj;
                return da6Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((da6) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((da6) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((da6) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        EnterPinCodeScreen enterPinCodeScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ga6 ga6Var = (ga6) obj2;
                br4 targetController = enterPinCodeScreen.getTargetController();
                SettingsPrivacyScreen settingsPrivacyScreen = targetController instanceof SettingsPrivacyScreen ? (SettingsPrivacyScreen) targetController : null;
                int iOrdinal = ga6Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ((a0d) enterPinCodeScreen.d.m(enterPinCodeScreen, EnterPinCodeScreen.e[0])).setState(dc4.ERROR);
                    } else {
                        ore.o();
                    }
                    return null;
                }
                ((a0d) enterPinCodeScreen.d.m(enterPinCodeScreen, EnterPinCodeScreen.e[0])).setState(dc4.SUCCESS);
                if (settingsPrivacyScreen == null) {
                    return sbiVar;
                }
                gvf gvfVarO1 = settingsPrivacyScreen.o1();
                pzf pzfVar = gvfVarO1.z;
                int iOrdinal2 = ga6Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                long j = gvfVarO1.y;
                if (j == x7c.g) {
                    a8j.t(gvfVarO1, ((n0c) gvfVarO1.c).a(), new cvf(gvfVarO1, null, 1), 2);
                } else if (j == x7c.h) {
                    gvfVarO1.I(tpf.h);
                } else if (j == x7c.f) {
                    gvfVarO1.I(tpf.g);
                } else if (j == x7c.d) {
                    gvfVarO1.I(tpf.i);
                }
                gvfVarO1.y = 0L;
                return sbiVar;
            case 1:
                ch3.d0(obj);
                ltb onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr = BottomSheetWidget.t;
                ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog(enterPinCodeScreen.getB().b());
                forgotPinCodeDialog.setTargetController(enterPinCodeScreen);
                br4 parentController = enterPinCodeScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(forgotPinCodeDialog, null, null, null, false, -1);
                    p.k(false, lveVar, true, "forgot-pin");
                    hveVarU1.I(lveVar);
                }
                return sbiVar;
        }
    }
}
