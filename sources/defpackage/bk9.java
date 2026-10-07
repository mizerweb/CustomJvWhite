package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ bk9(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.af7
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        sbi sbiVar = sbi.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MainActivity.o1;
                mainActivity.J = null;
                sgg sggVar = mainActivity.K;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                mainActivity.K = null;
                return sbiVar;
            case 1:
                sgg sggVar2 = mainActivity.n1;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                mainActivity.n1 = null;
                return sbiVar;
            default:
                int i3 = MainActivity.o1;
                return new cc1(new s6(0, 1, MainActivity.class, this.b, "rootRouter", "getRootRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;"));
        }
    }
}
