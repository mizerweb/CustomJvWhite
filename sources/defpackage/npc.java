package defpackage;

import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class npc extends ipl {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ npc(qpc qpcVar, int i) {
        this.a = i;
        this.b = qpcVar;
    }

    @Override // defpackage.ipl, org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        switch (this.a) {
            case 0:
                qpc qpcVar = this.b;
                qpcVar.f0.f("pc.offer.failed");
                qpcVar.g(new xbb(wbb.a, str, null, null));
                break;
            default:
                this.b.f0.f("pc.answer.failed");
                qpc qpcVar2 = this.b;
                qpcVar2.g(new xbb(wbb.b, str, null, qpcVar2.H.getRemoteDescription()));
                break;
        }
    }

    @Override // defpackage.ipl, org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        int i = this.a;
        qpc qpcVar = this.b;
        switch (i) {
            case 0:
                qpcVar.f0.f("pc.offer.created");
                qpcVar.p(sessionDescription);
                break;
            default:
                qpcVar.f0.f("pc.answer.created");
                qpcVar.p(sessionDescription);
                break;
        }
    }
}
