package defpackage;

import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u62 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallWaitingRoomEventsWidget b;

    public /* synthetic */ u62(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget, int i) {
        this.a = i;
        this.b = callWaitingRoomEventsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = this.b;
        switch (i) {
            case 0:
                s62 s62Var = (s62) callWaitingRoomEventsWidget.b.getAccessor().c(868);
                s62Var.getClass();
                return new r62(s62Var.a, s62Var.b, s62Var.c);
            default:
                zv8[] zv8VarArr = CallWaitingRoomEventsWidget.m;
                return new tbj(callWaitingRoomEventsWidget.getContext());
        }
    }
}
