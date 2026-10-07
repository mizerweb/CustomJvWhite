package defpackage;

import java.util.Map;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cm5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fm5 b;

    public /* synthetic */ cm5(fm5 fm5Var, int i) {
        this.a = i;
        this.b = fm5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PeerConnection.IceConnectionState iceConnectionState;
        PeerConnection.IceConnectionState iceConnectionState2;
        int i = this.a;
        fm5 fm5Var = this.b;
        switch (i) {
            case 0:
                for (qpc qpcVar : fm5Var.E.values()) {
                    PeerConnection peerConnection = qpcVar.H;
                    if (peerConnection == null) {
                        iceConnectionState = null;
                    } else {
                        try {
                            iceConnectionState = peerConnection.iceConnectionState();
                        } catch (Exception e) {
                            qpcVar.w.reportException("PeerConnectionClient", "pc.conn.state", e);
                            iceConnectionState = null;
                        }
                    }
                    fm5Var.g0(qpcVar, iceConnectionState);
                }
                break;
            case 1:
                if (fm5Var.J()) {
                    for (Map.Entry entry : fm5Var.E.entrySet()) {
                        yt1 yt1Var = (yt1) entry.getKey();
                        qpc qpcVar2 = (qpc) entry.getValue();
                        PeerConnection peerConnection2 = qpcVar2.H;
                        if (peerConnection2 == null) {
                            iceConnectionState2 = null;
                        } else {
                            try {
                                iceConnectionState2 = peerConnection2.iceConnectionState();
                            } catch (Exception e2) {
                                qpcVar2.w.reportException("PeerConnectionClient", "pc.conn.state", e2);
                                iceConnectionState2 = null;
                            }
                        }
                        if (iceConnectionState2 != PeerConnection.IceConnectionState.CONNECTED) {
                            fm5Var.x(yt1Var);
                            fm5Var.b = true;
                            o91 o91Var = fm5Var.m;
                            if (o91Var != null) {
                                o91Var.G(fm5Var);
                            }
                            fm5Var.K.l(new bwh(fm5Var.t, 0));
                            break;
                        }
                    }
                }
                break;
            default:
                o91 o91Var2 = fm5Var.m;
                if (o91Var2 != null) {
                    o91Var2.G(fm5Var);
                }
                fm5Var.K.l(new bwh(fm5Var.s, 1));
                break;
        }
    }
}
