package defpackage;

import android.view.View;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class usa extends xtb {
    public final /* synthetic */ MessagesListWidget i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usa(MessagesListWidget messagesListWidget, ifh ifhVar) {
        super(ifhVar, 4);
        this.i = messagesListWidget;
    }

    @Override // defpackage.xtb
    public final boolean c(View view, int i) {
        return true;
    }

    @Override // defpackage.xtb
    public final boolean d(View view, int i) {
        MessageModel messageModelQ;
        if (i < 0 || i >= this.i.H.l() || (messageModelQ = this.i.H.Q(i)) == null) {
            return false;
        }
        String str = this.i.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.i(i, "Try change last read message from listener, pos:", ", msg:", messageModelQ.x()), null);
            }
        }
        return this.i.F1().t0(messageModelQ);
    }
}
