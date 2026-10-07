package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rs4 implements sg4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rs4(int i) {
        this.a = i;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Throwable) obj).printStackTrace();
                break;
            default:
                ((PeerConnection) obj).restartIce();
                break;
        }
    }
}
