package defpackage;

import android.view.ViewGroup;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class bta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public bta(MessagesListWidget messagesListWidget) {
        this.a = 1;
        this.b = messagesListWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7e b7eVar;
        switch (this.a) {
            case 0:
                if (this.b.getView() != null) {
                    MessagesListWidget messagesListWidget = this.b;
                    messagesListWidget.z1.c(messagesListWidget.D1());
                    fva fvaVarG0 = this.b.F1().g0();
                    je9 je9Var = je9.d;
                    ava avaVar = (ava) fvaVarG0.r.getAndSet(null);
                    if (avaVar != null && fvaVarG0.q.get() == null) {
                        String str = fvaVarG0.l;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "onScrollToSavedTime, scroll to saved anchor:" + avaVar, null);
                        }
                        a6f.i(fvaVarG0.u, avaVar.a, i5f.a, avaVar.c, 8);
                    } else {
                        String str2 = fvaVarG0.l;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "onScrollToSavedTime, don't need scroll, saved state:" + avaVar, null);
                        }
                    }
                }
                break;
            case 1:
                this.b.D.a(-9223372036854775805L);
                break;
            case 2:
                MessagesListWidget messagesListWidget2 = this.b;
                if (messagesListWidget2.getView() != null) {
                    zv8[] zv8VarArr = MessagesListWidget.T1;
                    messagesListWidget2.q1().h(messagesListWidget2.D1(), true);
                }
                break;
            case 3:
                MessagesListWidget messagesListWidget3 = this.b;
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                if (messagesListWidget3.getView() != null && (b7eVar = messagesListWidget3.P1) != null) {
                    messagesListWidget3.D1().r0(b7eVar);
                    messagesListWidget3.D1().k(b7eVar);
                    b7e b7eVar2 = messagesListWidget3.P1;
                    if (b7eVar2 != null) {
                        b7eVar2.g = true;
                    }
                    break;
                }
                break;
            default:
                MessagesListWidget messagesListWidget4 = this.b;
                zv8[] zv8VarArr3 = MessagesListWidget.T1;
                e93 e93Var = (e93) messagesListWidget4.t.getValue();
                e93 e93Var2 = e93.i;
                e93Var.D(0, false);
                break;
        }
    }

    public /* synthetic */ bta(ViewGroup viewGroup, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }
}
