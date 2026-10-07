package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public interface ppc {
    void a(qpc qpcVar);

    void b(String str);

    void c(qpc qpcVar, String str);

    void d(qpc qpcVar, PeerConnection.SignalingState signalingState);

    default void e(qpc qpcVar, long j) {
    }

    void g();

    void h(qpc qpcVar, SessionDescription sessionDescription);

    void i(qpc qpcVar);

    void k(qpc qpcVar, IceCandidate[] iceCandidateArr);

    void m(qpc qpcVar, IceCandidate iceCandidate);

    void n(qpc qpcVar, SessionDescription sessionDescription);

    void o(qpc qpcVar, PeerConnection.IceConnectionState iceConnectionState);
}
