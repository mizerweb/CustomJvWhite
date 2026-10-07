package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class osa implements mg8, ied {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ osa(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.ied
    public boolean a(lfe lfeVar) {
        int i = this.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (i) {
            case 1:
                zv8[] zv8VarArr = MessagesListWidget.T1;
                return messagesListWidget.F1().p0();
            default:
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                return ((Boolean) messagesListWidget.x1().k().i()).booleanValue() && !((xb9) messagesListWidget.t1()).U().a.isEmpty();
        }
    }
}
