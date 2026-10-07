package defpackage;

import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class owc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickLocationScreen b;

    public /* synthetic */ owc(PickLocationScreen pickLocationScreen, int i) {
        this.a = i;
        this.b = pickLocationScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        PickLocationScreen pickLocationScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickLocationScreen.p;
                return new svj(pickLocationScreen, 1);
            default:
                xwc xwcVar = (xwc) pickLocationScreen.e.getAccessor().c(761);
                vv vvVar = pickLocationScreen.b;
                zv8[] zv8VarArr2 = PickLocationScreen.p;
                zv8 zv8Var = zv8VarArr2[0];
                long jLongValue = ((Number) vvVar.a(pickLocationScreen)).longValue();
                vv vvVar2 = pickLocationScreen.d;
                zv8 zv8Var2 = zv8VarArr2[2];
                return new wwc(jLongValue, sol.b((t3f) vvVar2.a(pickLocationScreen)), xwcVar.a, xwcVar.b, xwcVar.c, xwcVar.d, xwcVar.e, xwcVar.f, xwcVar.g);
        }
    }
}
