package defpackage;

import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pq1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ pq1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (i) {
            case 0:
                ldf ldfVar = CallLinkInfoScreen.t;
                return new rk0(callLinkInfoScreen.getContext().getDrawable(R.drawable.icon_call_fill), cwb.a, pq3.j.e(callLinkInfoScreen.getContext()).m(), new xk1(8), new xk1(9));
            case 1:
                ldf ldfVar2 = CallLinkInfoScreen.t;
                return new qk0(callLinkInfoScreen.getContext().getDrawable(R.drawable.icon_call), awb.a, callLinkInfoScreen.getContext(), new xk1(3), new xk1(4), 32);
            case 2:
                return vd7.o(callLinkInfoScreen.b, new ifh(new pq1(callLinkInfoScreen, 3)), callLinkInfoScreen);
            default:
                ldf ldfVar3 = CallLinkInfoScreen.t;
                return callLinkInfoScreen.getRouter();
        }
    }
}
