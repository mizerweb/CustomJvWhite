package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nfa implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ nfa(MessageContextMenuBottomSheet messageContextMenuBottomSheet, rbb rbbVar) {
        this.a = 0;
        this.b = rbbVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        rbb rbbVar = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MessageContextMenuBottomSheet.w1;
                wpa.b.e((i65) rbbVar);
                break;
            case 1:
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                wpa wpaVar = wpa.b;
                dgc dgcVar = (dgc) rbbVar;
                long j = dgcVar.b;
                o65.c(wpaVar.b(), qt4.q(qt4.u(j, ":call-user?opponent_id=", "&video_enabled=", dgcVar.d), "&conversation_id=", dgcVar.c.toString(), "&start_source=ATTACH"), null, null, 6);
                break;
            default:
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                o65.c(wpa.b.b(), ":call-join-link?link=".concat(((ofc) rbbVar).d), null, null, 6);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ nfa(rbb rbbVar, int i) {
        this.a = i;
        this.b = rbbVar;
    }
}
