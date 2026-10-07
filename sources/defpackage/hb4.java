package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hb4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ hb4(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (i) {
            case 0:
                rb4 rb4Var = (rb4) confirmPhoneScreen.h.getAccessor().c(810);
                vv vvVar = confirmPhoneScreen.f;
                zv8[] zv8VarArr = ConfirmPhoneScreen.z;
                zv8 zv8Var = zv8VarArr[3];
                int iIntValue = ((Number) vvVar.a(confirmPhoneScreen)).intValue();
                vv vvVar2 = confirmPhoneScreen.c;
                zv8 zv8Var2 = zv8VarArr[0];
                String str = (String) vvVar2.a(confirmPhoneScreen);
                String strQ1 = confirmPhoneScreen.q1();
                ghb ghbVar = ew5.b;
                vv vvVar3 = confirmPhoneScreen.g;
                zv8 zv8Var3 = zv8VarArr[4];
                long jP = qe7.P(((Number) vvVar3.a(confirmPhoneScreen)).longValue(), lw5.MILLISECONDS);
                rb4Var.getClass();
                return new qb4(iIntValue, str, strQ1, jP, rb4Var.a, rb4Var.b, rb4Var.c, rb4Var.d, rb4Var.e, rb4Var.f, rb4Var.g, rb4Var.h, rb4Var.i);
            case 1:
                zv8[] zv8VarArr2 = ConfirmPhoneScreen.z;
                return new bk8(confirmPhoneScreen.getRouter(), confirmPhoneScreen.getB());
            case 2:
                zv8[] zv8VarArr3 = ConfirmPhoneScreen.z;
                return new mb4(confirmPhoneScreen);
            default:
                zv8[] zv8VarArr4 = ConfirmPhoneScreen.z;
                return np4.q(confirmPhoneScreen.getContext(), R.string.oneme_login_confirm_timer);
        }
    }
}
