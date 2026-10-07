package defpackage;

import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vf1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallDebugMenuScreen b;

    public /* synthetic */ vf1(CallDebugMenuScreen callDebugMenuScreen, int i) {
        this.a = i;
        this.b = callDebugMenuScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallDebugMenuScreen callDebugMenuScreen = this.b;
        switch (i) {
            case 0:
                return new bg1(((cg1) callDebugMenuScreen.b.getAccessor().c(861)).a);
            case 1:
                zv8[] zv8VarArr = CallDebugMenuScreen.i;
                return new sbf(pq3.j.k(callDebugMenuScreen.getContext()).b, new ot4(11, callDebugMenuScreen), new m(21, callDebugMenuScreen), null, null, 52);
            default:
                zv8[] zv8VarArr2 = CallDebugMenuScreen.i;
                return new xf1(callDebugMenuScreen);
        }
    }
}
