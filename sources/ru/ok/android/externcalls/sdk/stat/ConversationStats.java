package ru.ok.android.externcalls.sdk.stat;

import defpackage.af7;
import defpackage.esh;
import defpackage.itj;
import defpackage.y3e;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;
import ru.ok.android.externcalls.sdk.stat.audio.AudioErrorStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidateAddFailedStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidateGatheringFailedStat;
import ru.ok.android.externcalls.sdk.stat.candidate.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.stat.connect.ConversationConnectedToSignalingStat;
import ru.ok.android.externcalls.sdk.stat.connection.PeerConnectionChangedStat;
import ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat;
import ru.ok.android.externcalls.sdk.stat.icerestart.IceRestartStat;
import ru.ok.android.externcalls.sdk.stat.init.CallInitStat;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.android.externcalls.sdk.stat.p2prelay.P2PRelayRequestedStat;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingTransportStat;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "Litj;", "configProvider", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lesh;", "timeProvider", "Ly3e;", "log", "", "isAnon", "isSummaryStatsEnabled", "<init>", "(Laf7;Litj;Lru/ok/android/externcalls/sdk/Conversation$CallType;Lesh;Ly3e;ZZ)V", "Lsbi;", "release", "()V", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "connectedToSignalingStat", "Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "startedStat", "Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "wsSignalingStat", "Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "callFinish", "Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "Lru/ok/android/externcalls/sdk/stat/init/CallInitStat;", "callInitStat", "Lru/ok/android/externcalls/sdk/stat/init/CallInitStat;", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidatePairChangedStat;", "iceCandidatePairChangedStat", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidatePairChangedStat;", "Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "iceRestartStat", "Lru/ok/android/externcalls/sdk/stat/icerestart/IceRestartStat;", "Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "serverTopologyRequestedStat", "Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "peerConnectionStateChangedStat", "Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "negotiationErrorStat", "Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "mlDownloadStat", "Lru/ok/android/externcalls/sdk/stat/mldownload/MLDownloadStat;", "Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestedStat;", "p2pRelayRequestedStat", "Lru/ok/android/externcalls/sdk/stat/p2prelay/P2PRelayRequestedStat;", "Lru/ok/android/externcalls/sdk/stat/accept/AcceptCallStat;", "acceptCallStat", "Lru/ok/android/externcalls/sdk/stat/accept/AcceptCallStat;", "Lru/ok/android/externcalls/sdk/stat/audio/AudioErrorStat;", "audioErrorStat", "Lru/ok/android/externcalls/sdk/stat/audio/AudioErrorStat;", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidateGatheringFailedStat;", "iceCandidateGatheringFailedStat", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidateGatheringFailedStat;", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidateAddFailedStat;", "uceCandidateAddFailedStat", "Lru/ok/android/externcalls/sdk/stat/candidate/IceCandidateAddFailedStat;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "webrtcStats", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationStats {
    public final AcceptCallStat acceptCallStat;
    public final AudioErrorStat audioErrorStat;
    public final CallFinishStat callFinish;
    public final CallInitStat callInitStat;
    public final ConversationConnectedToSignalingStat connectedToSignalingStat;
    public final IceCandidateGatheringFailedStat iceCandidateGatheringFailedStat;
    public final IceCandidatePairChangedStat iceCandidatePairChangedStat;
    public final IceRestartStat iceRestartStat;
    public final MLDownloadStat mlDownloadStat;
    public final NegotiationErrorStat negotiationErrorStat;
    public final P2PRelayRequestedStat p2pRelayRequestedStat;
    public final PeerConnectionChangedStat peerConnectionStateChangedStat;
    public final ConversationPreparedStat preparedStat;
    public final ServerTopologyRequestedStat serverTopologyRequestedStat;
    public final ConversationStartedStat startedStat;
    public final IceCandidateAddFailedStat uceCandidateAddFailedStat;
    public final ConversationWebRTCStat webrtcStats;
    public final SignalingTransportStat wsSignalingStat;

    public ConversationStats(af7 af7Var, itj itjVar, Conversation.CallType callType, esh eshVar, y3e y3eVar, boolean z, boolean z2) {
        this.connectedToSignalingStat = new ConversationConnectedToSignalingStat(eshVar, af7Var);
        this.preparedStat = new ConversationPreparedStat(eshVar, af7Var);
        this.startedStat = new ConversationStartedStat(callType, eshVar, af7Var);
        this.wsSignalingStat = new SignalingTransportStat(af7Var, eshVar, y3eVar, z2);
        this.callFinish = new CallFinishStat(af7Var);
        this.callInitStat = new CallInitStat(callType, z, af7Var);
        this.iceCandidatePairChangedStat = new IceCandidatePairChangedStat(af7Var);
        this.iceRestartStat = new IceRestartStat(af7Var);
        this.serverTopologyRequestedStat = new ServerTopologyRequestedStat(af7Var, eshVar);
        this.peerConnectionStateChangedStat = new PeerConnectionChangedStat(af7Var);
        this.negotiationErrorStat = new NegotiationErrorStat(af7Var);
        this.mlDownloadStat = new MLDownloadStat(af7Var);
        this.p2pRelayRequestedStat = new P2PRelayRequestedStat(af7Var);
        this.acceptCallStat = new AcceptCallStat(af7Var);
        this.audioErrorStat = new AudioErrorStat(af7Var);
        this.iceCandidateGatheringFailedStat = new IceCandidateGatheringFailedStat(af7Var);
        this.uceCandidateAddFailedStat = new IceCandidateAddFailedStat(af7Var);
        this.webrtcStats = new ConversationWebRTCStat(itjVar, y3eVar, eshVar, af7Var);
    }

    public final void release() {
        this.webrtcStats.release();
    }
}
