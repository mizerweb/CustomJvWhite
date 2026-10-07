package ru.ok.android.externcalls.sdk.events;

import defpackage.au1;
import defpackage.h9b;
import defpackage.it7;
import defpackage.qy7;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* JADX INFO: loaded from: classes.dex */
public interface ConversationEventsListener extends RecordEventListener {

    /* JADX INFO: loaded from: classes3.dex */
    public static class CallEndInfo {
        public final String explanationHtml;
        public final Set<HangupHint> hints;
        public final it7 reason;

        public CallEndInfo(it7 it7Var, Set<HangupHint> set, String str) {
            this.reason = it7Var;
            this.hints = set;
            this.explanationHtml = str;
        }
    }

    default void onAdminInCallChanged(boolean z) {
    }

    default void onAnonJoinForbiddenChanged(boolean z) {
    }

    default void onCallAccepted() {
    }

    default void onCallAcceptedForAll() {
    }

    @Deprecated
    default void onCallEnded(CallEndInfo callEndInfo) {
    }

    default void onCallEnded(ConversationEndInfo conversationEndInfo) {
    }

    default void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError signalingErrors$CallIsUnfeasibleError) {
    }

    default void onCallParticipantsNetworkStatusChanged(List<ConversationParticipant> list) {
    }

    default void onCallSignalingConnected() {
    }

    default void onCallStartResolutionFailed(List<ParticipantId> list) {
    }

    @Deprecated
    default void onCameraBusy() {
    }

    default void onCameraChanged() {
    }

    default void onCameraForciblyMuted() {
    }

    @Deprecated
    default void onConnected() {
    }

    default void onConversationIdChanged(String str, String str2) {
    }

    default void onCustomData(JSONObject jSONObject) {
    }

    @Deprecated
    default void onDestroyed(String str) {
        onDestroyed();
    }

    @Deprecated
    default void onDisconnected() {
    }

    default ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return null;
    }

    default void onJoinLinkUpdated(String str) {
    }

    default void onLocalMediaChanged() {
    }

    default void onMeInWaitingRoomChanged(boolean z) {
    }

    default void onMicChanged(boolean z) {
    }

    default void onMicrophoneForciblyMuted() {
    }

    @Deprecated
    default void onMigratedToServerTopology() {
    }

    @Deprecated
    default void onMuteChanged(h9b h9bVar) {
    }

    @Deprecated
    default void onMuteStateInitialized(h9b h9bVar) {
    }

    default void onOpponentFingerprintChanged(long j) {
    }

    @Deprecated
    default void onOpponentMediaChanged() {
    }

    default void onOpponentRegistered() {
    }

    default void onParticipantHoldStateChanged(qy7 qy7Var) {
    }

    default void onParticipantsAdded(List<ConversationParticipant> list) {
    }

    default void onParticipantsChanged(List<ConversationParticipant> list) {
    }

    default void onParticipantsDeAnonymized(List<ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
    }

    default void onParticipantsRemoved(List<ConversationParticipant> list) {
    }

    default void onParticipantsUpdated(Collection<ConversationParticipant> collection) {
    }

    default void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
    }

    default void onRateCall(RateCallData rateCallData) {
    }

    default void onRecurringChanged(boolean z) {
    }

    default void onRolesChanged(ConversationParticipant conversationParticipant) {
    }

    default void onStateChanged(ConversationParticipant conversationParticipant, au1 au1Var) {
    }

    default void onWaitForAdminEnabled() {
    }

    default void onWaitingRoomEnabledChanged(boolean z) {
    }

    default void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
    }

    default void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
    }

    @Deprecated
    default void onDestroyed() {
    }
}
