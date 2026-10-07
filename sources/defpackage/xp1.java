package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* JADX INFO: loaded from: classes3.dex */
public final class xp1 implements g32 {
    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onAnonJoinForbiddenChanged(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", qv1.m("EventListener onAnonJoinForbiddenChanged(", ")", z), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        gm0.n("CallEngineTag", "EventListener onCallAccepted()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAcceptedForAll() {
        gm0.n("CallEngineTag", "EventListener onCallAcceptedForAll()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        super.onCallEnded(conversationEndInfo);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onCallEnded(" + conversationEndInfo + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onCallIsUnfeasibleError(" + signalingErrors$CallIsUnfeasibleError + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", v0h.d("EventListener onCallParticipantsNetworkStatusChanged(", ")", list), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallSignalingConnected() {
        gm0.n("CallEngineTag", "EventListener onCallSignalingConnected()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallStartResolutionFailed(List list) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", v0h.d("EventListener onCallStartResolutionFailed(", ")", list), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraBusy() {
        gm0.n("CallEngineTag", "EventListener onCameraBusy()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        gm0.n("CallEngineTag", "EventListener onCameraChanged()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCustomData(JSONObject jSONObject) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onCustomData(" + jSONObject + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onDestroyed(" + conversationDestroyedInfo + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", c0a.o("EventListener onJoinLinkUpdated(", str, ")"), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onLocalMediaChanged() {
        gm0.n("CallEngineTag", "EventListener onLocalMediaChanged()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", qv1.m("EventListener onMeInWaitingRoomChanged(", ")", z), null);
        }
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        gm0.n("CallEngineTag", "EventListener onMediaConnected()");
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        gm0.n("CallEngineTag", "EventListener onMediaDisconnected()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicChanged(boolean z) {
        gm0.n("CallEngineTag", "EventListener onMicChanged()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicrophoneForciblyMuted() {
        gm0.n("CallEngineTag", "EventListener onMicrophoneForciblyMuted()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMigratedToServerTopology() {
        gm0.n("CallEngineTag", "EventListener onMigratedToServerTopology()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteChanged(h9b h9bVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onMuteChanged(" + h9bVar + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteStateInitialized(h9b h9bVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onMuteStateInitialized(" + h9bVar + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentFingerprintChanged(long j) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", nbh.s(j, "EventListener onOpponentFingerprintChanged(", ")"), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentMediaChanged() {
        gm0.n("CallEngineTag", "EventListener onOpponentMediaChanged()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentRegistered() {
        gm0.n("CallEngineTag", "EventListener onOpponentRegistered()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", v0h.d("EventListener onParticipantsAdded(", ")", list), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", v0h.d("EventListener onParticipantsChanged(", ")", list), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsDeAnonymized(List list, Map map) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onParticipantsDeAnonymized(" + list + ", " + map + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", v0h.d("EventListener onParticipantsRemoved(", ")", list), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onParticipantsUpdated(" + collection + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onRolesChanged(" + conversationParticipant + ", " + z + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRateCall(RateCallData rateCallData) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onRateCall(" + rateCallData + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRecurringChanged(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", qv1.m("EventListener onRecurringChanged(", ")", z), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        gm0.n("CallEngineTag", "EventListener onRolesChanged()");
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onStateChanged(ConversationParticipant conversationParticipant, au1 au1Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onStateChanged(" + conversationParticipant + ", " + au1Var + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", qv1.m("EventListener onAnonJoinForbiddenChanged(", ")", z), null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", "EventListener onAnonJoinForbiddenChanged(" + waitingRoomParticipantsUpdate + ")", null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "CallEngineTag", c0a.o("EventListener onDestroyed(", str, ")"), null);
        }
    }
}
