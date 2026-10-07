package defpackage;

import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oq2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChangeOwnerScreen b;

    public /* synthetic */ oq2(ChangeOwnerScreen changeOwnerScreen, int i) {
        this.a = i;
        this.b = changeOwnerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChangeOwnerScreen changeOwnerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChangeOwnerScreen.k;
                long jO1 = changeOwnerScreen.o1();
                wtc wtcVar = changeOwnerScreen.e;
                return new wq2(jO1, wtcVar.a(), wtcVar.getAccessor().d(132), wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(630));
            default:
                wtc wtcVar2 = changeOwnerScreen.e;
                o9a o9aVarD = wtcVar2.d();
                kc5 kc5Var = (kc5) wtcVar2.getAccessor().c(756);
                xk1 xk1Var = new xk1(16);
                k82 k82Var = new k82(8);
                o9aVarD.getClass();
                return new n9a(xk1Var, k82Var, kc5Var);
        }
    }
}
