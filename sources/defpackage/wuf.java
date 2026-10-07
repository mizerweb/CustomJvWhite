package defpackage;

import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class wuf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SettingsPrivacyScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wuf(lq4 lq4Var, SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = settingsPrivacyScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SettingsPrivacyScreen settingsPrivacyScreen = this.g;
        switch (i) {
            case 0:
                wuf wufVar = new wuf(lq4Var, settingsPrivacyScreen, 0);
                wufVar.f = obj;
                return wufVar;
            default:
                wuf wufVar2 = new wuf(lq4Var, settingsPrivacyScreen, 1);
                wufVar2.f = obj;
                return wufVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wuf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wuf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        hve hveVarU1;
        int i = this.e;
        sbi sbiVar = sbi.a;
        SettingsPrivacyScreen settingsPrivacyScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof tpf) {
                    tpf tpfVar = (tpf) rbbVar;
                    zv8[] zv8VarArr = SettingsPrivacyScreen.i;
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    jc4 jc4Var = new jc4(tpfVar.b, null, tpfVar.d);
                    for (spf spfVar : tpfVar.c) {
                        boolean z = spfVar.c;
                        tnh tnhVar = spfVar.a;
                        int i2 = spfVar.b;
                        if (z) {
                            jc4Var.b(i2, tnhVar);
                        } else {
                            jc4Var.d(i2, tnhVar);
                        }
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4Var.f(settingsPrivacyScreen);
                    confirmationBottomSheetF.setTargetController(settingsPrivacyScreen);
                    br4 parentController = settingsPrivacyScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (rbbVar instanceof i65) {
                    uuf.b.e((i65) rbbVar);
                } else if (rbbVar instanceof upf) {
                    h8c h8cVar = new h8c(settingsPrivacyScreen);
                    upf upfVar = (upf) rbbVar;
                    h8cVar.m(upfVar.b);
                    ynh ynhVar = upfVar.d;
                    if (ynhVar != null) {
                        h8cVar.a(ynhVar);
                    }
                    Integer num = upfVar.c;
                    if (num != null) {
                        h8cVar.h(new w8c(num.intValue()));
                    }
                    h8cVar.p();
                } else if (rbbVar instanceof rpf) {
                    EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
                    enterPinCodeScreen.setTargetController(settingsPrivacyScreen);
                    settingsPrivacyScreen.getRouter().I(oc9.e(enterPinCodeScreen, new ati(), new ati()));
                } else if (rbbVar instanceof qpf) {
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog(settingsPrivacyScreen.a.b());
                    changeDisabledDialog.setTargetController(settingsPrivacyScreen);
                    br4 parentController2 = settingsPrivacyScreen;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                    hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar2 = new lve(changeDisabledDialog, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "change-disabled");
                        hveVarU1.I(lveVar2);
                    }
                }
                zv8[] zv8VarArr4 = SettingsPrivacyScreen.i;
                settingsPrivacyScreen.o1().z.k();
                break;
            default:
                ch3.d0(obj);
                h8c h8cVar2 = new h8c(settingsPrivacyScreen);
                h8cVar2.n((String) obj2);
                h8cVar2.p();
                break;
        }
        return sbiVar;
    }
}
