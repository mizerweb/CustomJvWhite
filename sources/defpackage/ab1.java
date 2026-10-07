package defpackage;

import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ab1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallAdminSettingsScreen b;

    public /* synthetic */ ab1(CallAdminSettingsScreen callAdminSettingsScreen, int i) {
        this.a = i;
        this.b = callAdminSettingsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallAdminSettingsScreen callAdminSettingsScreen = this.b;
        switch (i) {
            case 0:
                ib1 ib1Var = (ib1) callAdminSettingsScreen.b.getAccessor().c(866);
                return new hb1(ib1Var.a, ib1Var.b, ib1Var.c, ib1Var.d);
            case 1:
                zv8[] zv8VarArr = CallAdminSettingsScreen.j;
                return new sbf(pq3.j.k(callAdminSettingsScreen.getContext()).b, new ot4(9, callAdminSettingsScreen), new m(20, callAdminSettingsScreen), null, null, 52);
            default:
                zv8[] zv8VarArr2 = CallAdminSettingsScreen.j;
                return new bb1(callAdminSettingsScreen);
        }
    }
}
