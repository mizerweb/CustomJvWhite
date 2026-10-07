package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tb4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ConfirmPinCodeScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb4(lq4 lq4Var, ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = confirmPinCodeScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ConfirmPinCodeScreen confirmPinCodeScreen = this.g;
        switch (i) {
            case 0:
                tb4 tb4Var = new tb4(lq4Var, confirmPinCodeScreen, 0);
                tb4Var.f = obj;
                return tb4Var;
            default:
                tb4 tb4Var2 = new tb4(lq4Var, confirmPinCodeScreen, 1);
                tb4Var2.f = obj;
                return tb4Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((tb4) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((tb4) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ConfirmPinCodeScreen confirmPinCodeScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                int iOrdinal = ((ub4) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setErrorText(null);
                        ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setState(dc4.SUCCESS);
                        return sbiVar;
                    }
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setErrorText(np4.q(confirmPinCodeScreen.getContext(), R.string.oneme_settings_privacy_onboarding_error_pin_code_equals));
                    ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setState(dc4.ERROR);
                    return sbiVar;
                }
                ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setErrorText(null);
                gc4 gc4Var = ConfirmPinCodeScreen.o1(confirmPinCodeScreen).v;
                int childCount = gc4Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    tg8 tg8VarH0 = gc4Var.H0(i2);
                    if (tg8VarH0 != null) {
                        ((pbg) tg8VarH0).w.setText((CharSequence) null);
                    }
                }
                gc4Var.J0();
                ConfirmPinCodeScreen.o1(confirmPinCodeScreen).setState(dc4.NORMAL);
                return sbiVar;
            default:
                ch3.d0(obj);
                h8c h8cVar = new h8c(confirmPinCodeScreen);
                h8cVar.n(z5h.D0((String) obj2));
                h8cVar.p();
                return sbiVar;
        }
    }
}
