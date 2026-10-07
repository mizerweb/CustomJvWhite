package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class ata {
    public final /* synthetic */ MessagesListWidget a;

    public ata(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    public final void a(long j) {
        zv8[] zv8VarArr = MessagesListWidget.T1;
        jsa jsaVarF1 = this.a.F1();
        if (jsaVarF1.c0().h() || !jsaVarF1.r.d.getBoolean("app.messages.enable.double.tap.reactions", true)) {
            return;
        }
        yab.i0(jsaVarF1.b, ((n0c) jsaVarF1.j).a(), 0, new fra(jsaVarF1, j, null, 0), 2);
    }

    public final void b(long j) {
        zv8[] zv8VarArr = MessagesListWidget.T1;
        this.a.F1().w0(j);
    }
}
