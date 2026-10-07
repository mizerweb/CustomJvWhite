package defpackage;

import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class di1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallEventsWidget b;

    public /* synthetic */ di1(CallEventsWidget callEventsWidget, int i) {
        this.a = i;
        this.b = callEventsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallEventsWidget callEventsWidget = this.b;
        switch (i) {
            case 0:
                bi1 bi1Var = (bi1) callEventsWidget.c.getAccessor().c(858);
                return new ai1(bi1Var.a, bi1Var.b, bi1Var.c, bi1Var.d, bi1Var.e);
            default:
                return new ei1(callEventsWidget.g);
        }
    }
}
