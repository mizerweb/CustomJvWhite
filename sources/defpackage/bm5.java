package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bm5 implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fm5 fm5Var = (fm5) obj3;
                c91 c91Var = (c91) obj2;
                for (du1 du1Var : fm5Var.j.j()) {
                    if (!du1Var.t) {
                        fm5Var.D.put(du1Var.a, fm5Var.e0());
                    }
                }
                if (fm5Var.Y) {
                    fm5Var.s(true);
                }
                c91Var.accept(null);
                break;
            case 1:
                qpc qpcVar = (qpc) obj3;
                PeerConnection.IceGatheringState iceGatheringState = (PeerConnection.IceGatheringState) obj2;
                ArrayList arrayList = qpcVar.Q;
                if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
                    SystemClock.elapsedRealtime();
                }
                if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
                    qpcVar.w.log("PeerConnectionClient", qpcVar.toString() + ": iceGatheringState=" + arrayList.size() + " " + arrayList);
                }
                break;
            case 2:
                qpc qpcVar2 = (qpc) obj3;
                PeerConnection peerConnection = (PeerConnection) obj;
                qpcVar2.getClass();
                if (((l3j) obj2).c == 0) {
                    qpcVar2.w(peerConnection, false);
                } else {
                    qpcVar2.m(peerConnection, false);
                }
                break;
            case 3:
                qpc qpcVar3 = (qpc) obj3;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                qpcVar3.getClass();
                if (!peerConnection2.getStats((StatsObserver) obj2, (MediaStreamTrack) null)) {
                    qpcVar3.w.log("PeerConnectionClient", qpcVar3.toString().concat(": failed to get stats"));
                }
                break;
            case 4:
                qpc qpcVar4 = (qpc) obj3;
                IceCandidate[] iceCandidateArr = (IceCandidate[]) obj2;
                qpcVar4.w.log("PeerConnectionClient", "❄ -> removed ice candidates: " + Arrays.toString(iceCandidateArr));
                qpcVar4.r.post(new i7b(qpcVar4, 13, iceCandidateArr));
                break;
            case 5:
                ((PeerConnection) obj).setConfiguration(((qpc) obj3).f((List) obj2));
                break;
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0$0((WaitingRoomParticipants) obj3, (f8g) obj2, (a72) obj);
                break;
        }
    }
}
