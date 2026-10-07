package defpackage;

import one.me.chatmedia.viewer.VideoWebViewScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n6j implements xcc, cg7 {
    public final /* synthetic */ VideoWebViewScreen a;

    public n6j(VideoWebViewScreen videoWebViewScreen) {
        this.a = videoWebViewScreen;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xcc) && (obj instanceof cg7)) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(0, 0, VideoWebViewScreen.class, this.a, "onUserInteraction", "onUserInteraction()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
