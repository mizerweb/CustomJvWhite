package defpackage;

import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final class mo3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsTabWidget b;

    public /* synthetic */ mo3(ChatsTabWidget chatsTabWidget, int i) {
        this.a = i;
        this.b = chatsTabWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatsTabWidget chatsTabWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                chatsTabWidget.U0();
                ((rq) chatsTabWidget.p1.m(chatsTabWidget, ChatsTabWidget.B1[5])).g(true, true, true);
                return sbi.a;
            default:
                return Boolean.valueOf(ChatsTabWidget.o1(chatsTabWidget));
        }
    }
}
