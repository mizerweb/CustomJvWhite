package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* JADX INFO: loaded from: classes.dex */
public final class l92 implements g32 {
    public final ifh a = new ifh(new b6(20));
    public final ifh b = new ifh(new b6(21));

    public final CopyOnWriteArraySet a() {
        return (CopyOnWriteArraySet) this.a.getValue();
    }

    @Override // defpackage.g32, defpackage.b32
    public final void b(String str) {
        Iterator it = ((CopyOnWriteArraySet) this.b.getValue()).iterator();
        while (it.hasNext()) {
            ((b32) it.next()).b(str);
        }
    }

    public final void e(g32 g32Var) {
        a().remove(g32Var);
    }

    public final void f(g32 g32Var) {
        a().add(g32Var);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onAdminInCallChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onAdminInCallChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onAnonJoinForbiddenChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onAnonJoinForbiddenChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallAccepted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAcceptedForAll() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallAcceptedForAll();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallEnded(conversationEndInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallIsUnfeasibleError(signalingErrors$CallIsUnfeasibleError);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallParticipantsNetworkStatusChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallSignalingConnected() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallSignalingConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallStartResolutionFailed(List list) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCallStartResolutionFailed(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraBusy() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCameraBusy();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCameraChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCustomData(JSONObject jSONObject) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onCustomData(jSONObject);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onDestroyed();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onJoinLinkUpdated(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onLocalMediaChanged() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onLocalMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMediaConnected(connectedInfo);
        }
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMediaDisconnected(disconnectedInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMicChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMicrophoneForciblyMuted() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMicrophoneForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMigratedToServerTopology() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMigratedToServerTopology();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteChanged(h9b h9bVar) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMuteChanged(h9bVar);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMuteStateInitialized(h9b h9bVar) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onMuteStateInitialized(h9bVar);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentFingerprintChanged(long j) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onOpponentFingerprintChanged(j);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentMediaChanged() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onOpponentMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentRegistered() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onOpponentRegistered();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantHoldStateChanged(qy7 qy7Var) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantHoldStateChanged(qy7Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantsAdded(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantsChanged(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsDeAnonymized(List list, Map map) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantsDeAnonymized(list, map);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantsRemoved(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onParticipantsUpdated(collection);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onPinChanged(conversationParticipant, z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRateCall(RateCallData rateCallData) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onRateCall(rateCallData);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRecurringChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onRecurringChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onRolesChanged(conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onStateChanged(ConversationParticipant conversationParticipant, au1 au1Var) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onStateChanged(conversationParticipant, au1Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitForAdminEnabled() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onWaitForAdminEnabled();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onWaitingRoomEnabledChanged(z);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(String str) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onDestroyed(str);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((g32) it.next()).onDestroyed(conversationDestroyedInfo);
        }
    }
}
