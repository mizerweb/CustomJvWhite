package defpackage;

import one.me.main.MainScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class gl9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainScreen b;

    public /* synthetic */ gl9(MainScreen mainScreen, int i) {
        this.a = i;
        this.b = mainScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        MainScreen mainScreen = this.b;
        switch (i) {
            case 0:
                if (mainScreen.getView() != null) {
                    txb.k(MainScreen.o1(mainScreen), 15);
                }
                break;
            default:
                if (mainScreen.getView() != null) {
                    txb.k(MainScreen.p1(mainScreen), 11);
                }
                break;
        }
        return sbiVar;
    }
}
