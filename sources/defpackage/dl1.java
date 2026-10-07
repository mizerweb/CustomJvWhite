package defpackage;

import java.util.List;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class dl1 extends kve {
    public final ha9 k;
    public final String l;
    public List m;

    public dl1(CallHistoryScreen callHistoryScreen, ha9 ha9Var) {
        super(callHistoryScreen);
        this.k = ha9Var;
        this.l = dl1.class.getName();
        this.m = r66.a;
    }

    @Override // defpackage.kve
    public final void G(hve hveVar, int i) {
        CallHistoryPageScreen callHistoryPageScreen;
        if (hveVar.o()) {
            return;
        }
        int iOrdinal = ((zl1) this.m.get(i)).c.ordinal();
        ha9 ha9Var = this.k;
        if (iOrdinal == 0) {
            CallHistoryPageScreen.l.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(yl1.ALL, ha9Var);
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            CallHistoryPageScreen.l.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(yl1.MISSING, ha9Var);
        }
        CallHistoryPageScreen callHistoryPageScreen2 = callHistoryPageScreen;
        callHistoryPageScreen2.setRetainViewMode(xq4.b);
        hveVar.T(new lve(callHistoryPageScreen2, null, null, null, false, -1));
    }

    @Override // defpackage.kve, defpackage.nee
    /* JADX INFO: renamed from: J */
    public final void B(nve nveVar) {
        nveVar.v = null;
        super.B(nveVar);
    }

    @Override // defpackage.nee
    public final int l() {
        return this.m.size();
    }
}
