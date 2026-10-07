package defpackage;

import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public interface n91 {
    void onIceCandidateAddFailed(n38 n38Var);

    void onIceCandidateGatheringFailed(o38 o38Var);

    void onIceRestart();

    void onLocalCandidateCreated(String str);

    void onLocalSdpCreated(SessionDescription.Type type);

    void onNegotiationError(xbb xbbVar);

    void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState);

    void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState);

    void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, j42 j42Var);

    void onRemoteCandidateReceived(String str);

    void onRemoteSdpReceived(SessionDescription.Type type);

    void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);
}
