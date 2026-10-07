package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gb4 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ gb4(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (i) {
            case 0:
                dc4 dc4Var = (dc4) obj;
                zv8[] zv8VarArr = ConfirmPhoneScreen.z;
                if (dc4Var == dc4.SUCCESS) {
                    mjg mjgVar = confirmPhoneScreen.u1().t;
                    Boolean bool = Boolean.TRUE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                }
                break;
            default:
                zv8[] zv8VarArr2 = ConfirmPhoneScreen.z;
                ltb onBackPressedDispatcher = confirmPhoneScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
        }
        return sbiVar;
    }
}
