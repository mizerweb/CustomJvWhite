package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cpc implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cpc(qpc qpcVar, boolean z, int i) {
        this.a = i;
        this.b = qpcVar;
        this.c = z;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        boolean z = this.c;
        qpc qpcVar = this.b;
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (i) {
            case 0:
                MediaConstraints mediaConstraints = new MediaConstraints();
                if (z) {
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                wbb wbbVar = qpcVar.y.n;
                wbb wbbVar2 = wbb.a;
                if (!wbbVar2.equals(wbbVar)) {
                    peerConnection.createOffer(new npc(qpcVar, 0), mediaConstraints);
                } else {
                    qpcVar.g(new xbb(wbbVar2, "emulated error", null, null));
                }
                break;
            default:
                qpcVar.w(peerConnection, z);
                qpcVar.m(peerConnection, z);
                break;
        }
    }
}
