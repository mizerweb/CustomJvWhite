package defpackage;

import one.me.startconversation.channel.PickSubscribersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ixc implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ ixc(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickSubscribersScreen.p;
                ltb onBackPressedDispatcher = pickSubscribersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
            default:
                ohg ohgVar = (ohg) obj;
                ohgVar.k();
                zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                vv vvVar = pickSubscribersScreen.k;
                zv8 zv8Var = PickSubscribersScreen.p[1];
                ohgVar.e(ohgVar.j(((Number) vvVar.a(pickSubscribersScreen)).longValue()));
                break;
        }
        return sbiVar;
    }
}
