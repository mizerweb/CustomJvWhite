package defpackage;

import one.me.calllist.ui.page.CallHistoryPageScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class el1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ el1(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallHistoryPageScreen callHistoryPageScreen = this.b;
        switch (i) {
            case 0:
                ll1 ll1Var = (ll1) callHistoryPageScreen.b.getAccessor().c(775);
                return new kl1(callHistoryPageScreen.p1(), (xu1) callHistoryPageScreen.e.getValue(), new c92(((s7f) ((et3) callHistoryPageScreen.c.getAccessor().d(85).getValue())).t()), ll1Var.a, ll1Var.b, ll1Var.c, ll1Var.d, ll1Var.e, ll1Var.f, ll1Var.g, ll1Var.h, ll1Var.i, ll1Var.j, ll1Var.k, ll1Var.l, ll1Var.m, ll1Var.n, ll1Var.o, ll1Var.p);
            case 1:
                return vd7.o(callHistoryPageScreen.c, new ifh(new el1(callHistoryPageScreen, 4)), callHistoryPageScreen);
            case 2:
                er3 er3Var = CallHistoryPageScreen.l;
                if (callHistoryPageScreen.p1() != yl1.MISSING) {
                    return null;
                }
                r1c r1cVar = new r1c(callHistoryPageScreen.getContext());
                r1cVar.setVisibility(8);
                r1cVar.setId(R.id.call_history_page_empty);
                r1cVar.setIcon(R.drawable.icon_call_fill);
                r1cVar.setTitle(new tnh(R.string.call_history_missed_calls_empty_state_title));
                return r1cVar;
            case 3:
                er3 er3Var2 = CallHistoryPageScreen.l;
                return new cl1(new xva(5, callHistoryPageScreen), ((a2c) callHistoryPageScreen.c.getAccessor().d(27).getValue()).c());
            default:
                er3 er3Var3 = CallHistoryPageScreen.l;
                return callHistoryPageScreen.getRouter();
        }
    }
}
