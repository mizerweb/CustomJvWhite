package defpackage;

import one.me.main.MainScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl9 extends fg7 implements af7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af7
    public final Object invoke() throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                MainScreen mainScreen = (MainScreen) this.receiver;
                a8g a8gVar = MainScreen.u;
                rxb rxbVar = (rxb) mainScreen.y1().i.a.getValue();
                hve hveVarV1 = mainScreen.v1();
                if (hveVarV1 == null) {
                    return mainScreen.w1();
                }
                br4 br4VarG = hveVarV1.g(rxbVar.d);
                pbb pbbVar = br4VarG instanceof pbb ? (pbb) br4VarG : null;
                return pbbVar == null ? mainScreen.w1() : pbbVar.o0();
            case 1:
                MainScreen mainScreen2 = (MainScreen) this.receiver;
                a8g a8gVar2 = MainScreen.u;
                r8e r8eVar = mainScreen2.y1().i;
                hve hveVarV2 = mainScreen2.v1();
                if (hveVarV2 == null) {
                    return lmc.h;
                }
                br4 br4VarG2 = hveVarV2.g(((rxb) r8eVar.a.getValue()).d);
                obb obbVar = br4VarG2 instanceof obb ? (obb) br4VarG2 : null;
                if (obbVar == null) {
                    return lmc.h;
                }
                return lmc.a(obbVar.u0(), ((f5d) mainScreen2.x1()).t() ? 1 : 2, 63);
            case 2:
                ((ltb) this.receiver).f();
                return sbiVar;
            case 3:
                ((ltb) this.receiver).f();
                return sbiVar;
            case 4:
                ((kwb) this.receiver).n();
                return sbiVar;
            case 5:
                return ((i5d) this.receiver).k();
            case 6:
                rre rreVar = (rre) this.receiver;
                dq4 dq4Var = rreVar.a;
                if (dq4Var == null) {
                    dq4Var = null;
                }
                cqk.g(dq4Var);
                jl8 jl8Var = rreVar.f;
                if (jl8Var == null) {
                    jl8Var = null;
                }
                i5b i5bVar = jl8Var.j;
                if (i5bVar != null) {
                    i5bVar.d();
                }
                th5 th5Var = rreVar.e;
                th5 th5Var2 = th5Var != null ? th5Var : null;
                ((fe4) th5Var2.f).close();
                dbh dbhVar = (dbh) th5Var2.g;
                if (dbhVar != null) {
                    dbhVar.close();
                }
                return sbiVar;
            default:
                ((to3) this.receiver).a();
                return sbiVar;
        }
    }
}
