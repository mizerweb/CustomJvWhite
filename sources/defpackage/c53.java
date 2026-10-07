package defpackage;

import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c53 implements s5a, cg7 {
    public final /* synthetic */ ChatMediaViewerScreen a;

    public c53(ChatMediaViewerScreen chatMediaViewerScreen) {
        this.a = chatMediaViewerScreen;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s5a) && (obj instanceof cg7)) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(1, 0, ChatMediaViewerScreen.class, this.a, "onStateButtonClick", "onStateButtonClick(Lone/me/chatmedia/viewer/MediaStateController$State;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.s5a
    public final void p0(int i) {
        this.a.p0(i);
    }
}
