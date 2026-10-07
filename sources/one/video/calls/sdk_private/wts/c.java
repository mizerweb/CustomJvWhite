package one.video.calls.sdk_private.wts;

import defpackage.ch;
import defpackage.w5g;
import defpackage.y5g;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements NALSocket.Listener {
    public final /* synthetic */ w5g a;

    public c(w5g w5gVar) {
        this.a = w5gVar;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onClosed(int i, String str) {
        str.getClass();
        ch chVar = (ch) this.a;
        chVar.getClass();
        ((y5g) chVar.c).a(str);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onFailure(Throwable th) {
        th.getClass();
        ((ch) this.a).onFailure(th);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onMessage(String str) {
        str.getClass();
        ch chVar = (ch) this.a;
        chVar.getClass();
        ((y5g) chVar.c).b(str);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALSocket.Listener
    public final void onOpen() {
        ch chVar = (ch) this.a;
        chVar.b = true;
        y5g y5gVar = (y5g) chVar.c;
        y5g.access$resetReconnectContext(y5gVar);
        y5g.access$resetReconnectDelay(y5gVar);
        y5g.access$handleSocketOpen(y5gVar);
    }
}
