package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class njk extends akk {
    public final /* synthetic */ int b;
    public final /* synthetic */ qpc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njk(qpc qpcVar, int i) {
        super(qpcVar);
        this.b = i;
        this.c = qpcVar;
    }

    @Override // defpackage.akk
    public final void a(PeerConnection peerConnection) {
        int i = this.b;
        qpc qpcVar = this.c;
        switch (i) {
            case 0:
                qpcVar.G();
                break;
            default:
                qpcVar.G();
                break;
        }
    }
}
