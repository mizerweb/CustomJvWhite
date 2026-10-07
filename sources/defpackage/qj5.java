package defpackage;

import one.me.devmenu.DevMenuGeneralPageScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class qj5 implements xx6 {
    public final /* synthetic */ xx6 a;
    public final /* synthetic */ DevMenuGeneralPageScreen b;
    public final /* synthetic */ int c;

    public qj5(gjg gjgVar, DevMenuGeneralPageScreen devMenuGeneralPageScreen, int i) {
        this.a = gjgVar;
        this.b = devMenuGeneralPageScreen;
        this.c = i;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.a.collect(new iv2(yx6Var, this.b, this.c), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
