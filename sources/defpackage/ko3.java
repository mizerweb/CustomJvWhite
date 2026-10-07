package defpackage;

import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final class ko3 extends iub {
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ ChatsTabWidget e;

    public ko3(ChatsTabWidget chatsTabWidget) {
        this.e = chatsTabWidget;
    }

    @Override // defpackage.iub
    public final void c(int i, int i2) {
        if (i == this.c && i2 == this.d) {
            return;
        }
        this.c = i;
        this.d = i2;
        zv8[] zv8VarArr = ChatsTabWidget.B1;
        ChatsTabWidget chatsTabWidget = this.e;
        if (chatsTabWidget.A1().getScrollState() == 0) {
            iug iugVarB1 = chatsTabWidget.B1();
            yg6 yg6Var = new yg6(i, i2, false);
            mjg mjgVar = iugVarB1.l.f;
            mjgVar.getClass();
            mjgVar.j(null, yg6Var);
        }
    }
}
