package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class ysa implements gpa {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ ysa(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.gpa
    public final void a() {
        int i = this.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (i) {
            case 0:
                if (messagesListWidget.getView() == null) {
                    gm0.Y("ScrollEvent", "Can't process itemsChangedCallback for scroll because root view is null");
                } else if (!messagesListWidget.v1().c()) {
                    gm0.Y("ScrollEvent", "Can't process itemsChangedCallback because scroll is not meet requirements");
                } else {
                    MessagesLayoutManager messagesLayoutManager = messagesListWidget.K1;
                    if (messagesLayoutManager != null) {
                        messagesLayoutManager.M.g(this);
                    }
                }
                break;
            default:
                usa usaVar = messagesListWidget.x1;
                usaVar.h = -1;
                messagesListWidget.z1.c(messagesListWidget.D1());
                usaVar.b(messagesListWidget.D1(), 0, 0);
                if (messagesListWidget.s1().b) {
                    tw6 tw6Var = (tw6) messagesListWidget.F1.getValue();
                    tw6Var.h = -1;
                    tw6Var.f = -1;
                    tw6Var.b(messagesListWidget.D1(), 0, 0);
                }
                break;
        }
    }

    @Override // defpackage.gpa
    public final String getTag() {
        switch (this.a) {
            case 0:
                return "ScrollEvent";
            default:
                return "ReadMarkUpdater";
        }
    }
}
