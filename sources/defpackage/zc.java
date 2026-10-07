package defpackage;

import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdminWaitingRoomScreen b;

    public /* synthetic */ zc(AdminWaitingRoomScreen adminWaitingRoomScreen, int i) {
        this.a = i;
        this.b = adminWaitingRoomScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
        switch (i) {
            case 0:
                ed edVar = (ed) adminWaitingRoomScreen.a.getAccessor().c(867);
                return new dd(edVar.a, edVar.b, edVar.c, edVar.d);
            default:
                zv8[] zv8VarArr = AdminWaitingRoomScreen.i;
                return new wc(new ad(adminWaitingRoomScreen), adminWaitingRoomScreen.a.b().a(), new tbj(adminWaitingRoomScreen.getContext()));
        }
    }
}
