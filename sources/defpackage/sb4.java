package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sb4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    public /* synthetic */ sb4(ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        this.a = i;
        this.b = confirmPinCodeScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ConfirmPinCodeScreen.f;
                ltb onBackPressedDispatcher = confirmPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbi.a;
            default:
                zv8[] zv8VarArr2 = ConfirmPinCodeScreen.f;
                wb4 wb4Var = (wb4) new wtc(confirmPinCodeScreen.m35getAccountScopeuqN4xOY()).getAccessor().c(379);
                vv vvVar = confirmPinCodeScreen.a;
                zv8 zv8Var = ConfirmPinCodeScreen.f[0];
                String str = (String) vvVar.a(confirmPinCodeScreen);
                wb4Var.getClass();
                return new vb4(str, wb4Var.a, wb4Var.b, wb4Var.c, wb4Var.d);
        }
    }
}
