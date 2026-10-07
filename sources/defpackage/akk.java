package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class akk implements Runnable {
    public final /* synthetic */ qpc a;

    public akk(qpc qpcVar) {
        this.a = qpcVar;
    }

    public abstract void a(PeerConnection peerConnection);

    @Override // java.lang.Runnable
    public final void run() {
        PeerConnection peerConnectionI = this.a.I();
        if (peerConnectionI != null) {
            a(peerConnectionI);
        }
    }
}
