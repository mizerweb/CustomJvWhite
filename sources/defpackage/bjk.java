package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class bjk extends akk {
    public final /* synthetic */ int b;
    public final sg4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjk(qpc qpcVar, sg4 sg4Var, int i) {
        super(qpcVar);
        this.b = i;
        switch (i) {
            case 1:
                super(qpcVar);
                this.c = sg4Var;
                break;
            default:
                this.c = sg4Var;
                break;
        }
    }

    @Override // defpackage.akk
    public final void a(PeerConnection peerConnection) {
        int i = this.b;
        sg4 sg4Var = this.c;
        switch (i) {
            case 0:
                sg4Var.accept(peerConnection);
                break;
            default:
                sg4Var.accept(peerConnection);
                break;
        }
    }
}
