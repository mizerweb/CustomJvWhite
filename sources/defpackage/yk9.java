package defpackage;

import one.me.main.MainScreen;

/* JADX INFO: loaded from: classes.dex */
public final class yk9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainScreen b;

    public /* synthetic */ yk9(MainScreen mainScreen, int i) {
        this.a = i;
        this.b = mainScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        MainScreen mainScreen = this.b;
        switch (i) {
            case 0:
                mainScreen.r = (bdj) obj;
                mainScreen.z1(kl9.w, null);
                break;
            default:
                mainScreen.q.B(mainScreen, MainScreen.v[3], yab.i0(mainScreen.getViewLifecycleScope(), null, 2, new qn6(mainScreen, lq4Var, 24), 1));
                break;
        }
        return sbiVar;
    }
}
