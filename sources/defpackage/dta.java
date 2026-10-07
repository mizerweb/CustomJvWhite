package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class dta implements gpa {
    public final /* synthetic */ MessagesListWidget a;

    public dta(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    @Override // defpackage.gpa
    public final void b() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", null);
            }
        }
        MessagesListWidget messagesListWidget = this.a;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        k96 k96VarD1 = messagesListWidget.D1();
        bdc.a(k96VarD1, new bta(k96VarD1, this.a, 2));
        MessagesLayoutManager messagesLayoutManager = this.a.K1;
        if (messagesLayoutManager != null) {
            messagesLayoutManager.M.g(this);
        }
    }

    @Override // defpackage.gpa
    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
