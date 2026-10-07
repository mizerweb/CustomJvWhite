package defpackage;

import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ca6 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnterPinCodeScreen b;

    public /* synthetic */ ca6(EnterPinCodeScreen enterPinCodeScreen, int i) {
        this.a = i;
        this.b = enterPinCodeScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = EnterPinCodeScreen.e;
                fa6 fa6Var = (fa6) new wtc(enterPinCodeScreen.m35getAccountScopeuqN4xOY()).getAccessor().c(382);
                fa6Var.getClass();
                return new ea6(fa6Var.a, fa6Var.b, fa6Var.c);
            case 1:
                zv8[] zv8VarArr2 = EnterPinCodeScreen.e;
                ml9.d(enterPinCodeScreen.getView());
                ltb onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbiVar;
            default:
                zv8[] zv8VarArr3 = EnterPinCodeScreen.e;
                ea6 ea6Var = (ea6) enterPinCodeScreen.c.getValue();
                if (!ea6Var.j) {
                    a8j.x(ea6Var.h, sbiVar);
                }
                return sbiVar;
        }
    }
}
