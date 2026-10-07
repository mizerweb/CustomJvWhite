package defpackage;

import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final class r8h {
    public final ny8 a;

    public r8h(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final kn0 a() {
        return (kn0) this.a.getValue();
    }

    public final void b(ChatsTabWidget chatsTabWidget, j8c j8cVar, boolean z) {
        int iOrdinal = j8cVar.ordinal();
        if (iOrdinal == 0) {
            if (z) {
                a().c("timeout");
            }
        } else {
            if (iOrdinal == 1) {
                a().c("swipe");
                return;
            }
            if (iOrdinal != 4) {
                return;
            }
            a().b();
            ah3 ah3Var = (ah3) chatsTabWidget.C.getValue();
            ah3Var.c.j(true);
            yab.i0(ah3Var.b, null, 0, new g02(ah3Var, false, null, 2), 3);
        }
    }
}
