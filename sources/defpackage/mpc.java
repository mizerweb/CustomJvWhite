package defpackage;

import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class mpc extends ipl {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionDescription b;
    public final /* synthetic */ qpc c;

    public /* synthetic */ mpc(qpc qpcVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.c = qpcVar;
        this.b = sessionDescription;
    }

    @Override // defpackage.ipl, org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        switch (this.a) {
            case 0:
                qpc qpcVar = this.c;
                SessionDescription sessionDescription = this.b;
                qpcVar.h(new xbb(wbb.a(sessionDescription.type, true), str, sessionDescription, qpcVar.H.getRemoteDescription()), true, sessionDescription);
                break;
            default:
                qpc qpcVar2 = this.c;
                SessionDescription sessionDescription2 = this.b;
                qpcVar2.h(new xbb(wbb.a(sessionDescription2.type, false), str, qpcVar2.H.getLocalDescription(), sessionDescription2), false, sessionDescription2);
                break;
        }
    }

    @Override // defpackage.ipl, org.webrtc.SdpObserver
    public final void onSetSuccess() {
        int i = this.a;
        SessionDescription sessionDescription = this.b;
        qpc qpcVar = this.c;
        switch (i) {
            case 0:
                qpcVar.q(sessionDescription, true);
                break;
            default:
                qpcVar.q(sessionDescription, false);
                break;
        }
    }
}
