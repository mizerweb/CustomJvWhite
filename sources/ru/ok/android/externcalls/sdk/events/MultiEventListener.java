package ru.ok.android.externcalls.sdk.events;

import defpackage.au1;
import defpackage.h9b;
import defpackage.qe7;
import defpackage.qy7;
import defpackage.vv8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\b)\u0010#J\u001d\u0010*\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\b*\u0010#J\u001d\u0010+\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\b+\u0010#J\u001d\u0010-\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190,H\u0016¢\u0006\u0004\b-\u0010\u0006J1\u00101\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\b3\u0010#J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u00192\u0006\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u0011J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010\u0011J\u0017\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010\u0011J\u0017\u0010F\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u000eH\u0016¢\u0006\u0004\bF\u0010\u0011J\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u0004\u0018\u00010 2\b\u0010J\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0007H\u0016¢\u0006\u0004\bM\u0010\tJ\u000f\u0010N\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010\tJ\u000f\u0010O\u001a\u00020\u0007H\u0016¢\u0006\u0004\bO\u0010\tJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010\tJ\u0017\u0010W\u001a\u00020\u00072\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010W\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bW\u0010[J\u0017\u0010]\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\b`\u0010SJ\u0017\u0010`\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020aH\u0016¢\u0006\u0004\b`\u0010bJ\u0017\u0010d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bg\u0010\u0011J\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\tJ\u001f\u0010k\u001a\u00020\u00072\u0006\u0010i\u001a\u00020P2\u0006\u0010j\u001a\u00020PH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u00072\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00010qH\u0096\u0003¢\u0006\u0004\br\u0010sJ\u0018\u0010u\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u0001H\u0097\u0001¢\u0006\u0004\bu\u0010vJ\u0018\u0010w\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u0001H\u0097\u0001¢\u0006\u0004\bw\u0010vJ\u001e\u0010y\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010,H\u0097\u0001¢\u0006\u0004\by\u0010zJ\u001e\u0010{\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010,H\u0097\u0001¢\u0006\u0004\b{\u0010zJ\u001e\u0010|\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010,H\u0097\u0001¢\u0006\u0004\b|\u0010zJ\u0010\u0010}\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b}\u0010\tJ\u0018\u0010~\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b~\u0010vJ\u001e\u0010\u007f\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00010,H\u0096\u0001¢\u0006\u0004\b\u007f\u0010zJ\u0013\u0010\u0080\u0001\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0087\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/events/MultiEventListener;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "", "Lru/ok/android/externcalls/sdk/events/ListenersCollection;", "container", "<init>", "(Ljava/util/Collection;)V", "Lsbi;", "onOpponentMediaChanged", "()V", "onLocalMediaChanged", "onCameraChanged", "onMicrophoneForciblyMuted", "onCameraForciblyMuted", "", "mute", "onMicChanged", "(Z)V", "onCallAccepted", "onCallAcceptedForAll", "onOpponentRegistered", "Lorg/json/JSONObject;", "data", "onCustomData", "(Lorg/json/JSONObject;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "id", "Lau1;", "newState", "onStateChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lau1;)V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", ApiProtocol.PARAM_EXTERNAL_IDS, "onCallStartResolutionFailed", "(Ljava/util/List;)V", "", "fingerprint", "onOpponentFingerprintChanged", "(J)V", "participants", "onParticipantsAdded", "onParticipantsChanged", "onParticipantsRemoved", "", "onParticipantsUpdated", "deAnonymizedlParticipants", "", "deAnonymizedToOriginalIds", "onParticipantsDeAnonymized", "(Ljava/util/List;Ljava/util/Map;)V", "onCallParticipantsNetworkStatusChanged", "conversationParticipant", "onRolesChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "byMe", "onPinChanged", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Z)V", "recurring", "onRecurringChanged", "Lh9b;", "muteEvent", "onMuteStateInitialized", "(Lh9b;)V", "onMuteChanged", "isAnonJoinForbidden", "onAnonJoinForbiddenChanged", "isEnabled", "onWaitingRoomEnabledChanged", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "participant", "onExternalByInternalResolution", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onConnected", "onCallSignalingConnected", "onMigratedToServerTopology", "", "link", "onJoinLinkUpdated", "(Ljava/lang/String;)V", "onDisconnected", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;", "endInfo", "onCallEnded", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener$CallEndInfo;)V", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;", "info", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndInfo;)V", "Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;", "onCallIsUnfeasibleError", "(Lru/ok/android/webrtc/SignalingErrors$CallIsUnfeasibleError;)V", "reason", "onDestroyed", "Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;", "(Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;)V", "Lru/ok/android/externcalls/sdk/rate/RateCallData;", "onRateCall", "(Lru/ok/android/externcalls/sdk/rate/RateCallData;)V", "isAdminHere", "onAdminInCallChanged", "onWaitForAdminEnabled", "previousCid", "newCid", "onConversationIdChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "Lqy7;", "event", "onParticipantHoldStateChanged", "(Lqy7;)V", "", "iterator", "()Ljava/util/Iterator;", "element", "add", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Z", "remove", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "clear", "contains", "containsAll", "isEmpty", "()Z", "Ljava/util/Collection;", "", "getSize", "()I", "size", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiEventListener implements ConversationEventsListener, Collection<ConversationEventsListener>, vv8 {
    private final Collection<ConversationEventsListener> container;

    public MultiEventListener(Collection<ConversationEventsListener> collection) {
        this.container = collection;
    }

    @Override // java.util.Collection
    public boolean add(ConversationEventsListener element) {
        return this.container.add(element);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ConversationEventsListener> elements) {
        return this.container.addAll(elements);
    }

    @Override // java.util.Collection
    public void clear() {
        this.container.clear();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return contains((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return this.container.containsAll(elements);
    }

    public int getSize() {
        return this.container.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<ConversationEventsListener> iterator() {
        return this.container.iterator();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onAdminInCallChanged(boolean isAdminHere) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onAdminInCallChanged(isAdminHere);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onAnonJoinForbiddenChanged(boolean isAnonJoinForbidden) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onAnonJoinForbiddenChanged(isAnonJoinForbidden);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAccepted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAccepted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallAcceptedForAll() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallAcceptedForAll();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEventsListener.CallEndInfo endInfo) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(endInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallIsUnfeasibleError(SignalingErrors$CallIsUnfeasibleError data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallIsUnfeasibleError(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallParticipantsNetworkStatusChanged(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallSignalingConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallSignalingConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallStartResolutionFailed(List<ParticipantId> list) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallStartResolutionFailed(list);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCameraForciblyMuted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCameraForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onConnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onConnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onConversationIdChanged(String previousCid, String newCid) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onConversationIdChanged(previousCid, newCid);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCustomData(JSONObject data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCustomData(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(String reason) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(reason);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDisconnected() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDisconnected();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public ParticipantId onExternalByInternalResolution(ConversationParticipant participant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            ParticipantId participantIdOnExternalByInternalResolution = it.next().onExternalByInternalResolution(participant);
            if (participantIdOnExternalByInternalResolution != null) {
                return participantIdOnExternalByInternalResolution;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onJoinLinkUpdated(String link) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onJoinLinkUpdated(link);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onLocalMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onLocalMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMeInWaitingRoomChanged(isMeInWaitingRoom);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicChanged(boolean mute) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicChanged(mute);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMicrophoneForciblyMuted() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMicrophoneForciblyMuted();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMigratedToServerTopology() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMigratedToServerTopology();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteChanged(h9b muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteChanged(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onMuteStateInitialized(h9b muteEvent) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onMuteStateInitialized(muteEvent);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentFingerprintChanged(long fingerprint) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentFingerprintChanged(fingerprint);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentMediaChanged() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentMediaChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onOpponentRegistered() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onOpponentRegistered();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantHoldStateChanged(qy7 event) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantHoldStateChanged(event);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsAdded(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsAdded(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsChanged(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsChanged(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsDeAnonymized(List<? extends ConversationParticipant> deAnonymizedlParticipants, Map<ParticipantId, ParticipantId> deAnonymizedToOriginalIds) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsDeAnonymized(deAnonymizedlParticipants, deAnonymizedToOriginalIds);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsRemoved(List<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsRemoved(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onParticipantsUpdated(Collection<? extends ConversationParticipant> participants) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onParticipantsUpdated(participants);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onPinChanged(ConversationParticipant conversationParticipant, boolean byMe) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onPinChanged(conversationParticipant, byMe);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRateCall(RateCallData data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRateCall(data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRecurringChanged(boolean recurring) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRecurringChanged(recurring);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onRolesChanged(ConversationParticipant conversationParticipant) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onRolesChanged(conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onStateChanged(ConversationParticipant id, au1 newState) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(id, newState);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitForAdminEnabled() {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitForAdminEnabled();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomEnabledChanged(boolean isEnabled) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomEnabledChanged(isEnabled);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onWaitingRoomParticipantsChanged(data);
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ConversationEventsListener) {
            return remove((ConversationEventsListener) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        return this.container.removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        return this.container.retainAll(elements);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return qe7.L(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) qe7.M(this, tArr);
    }

    public boolean contains(ConversationEventsListener element) {
        return this.container.contains(element);
    }

    public boolean remove(ConversationEventsListener element) {
        return this.container.remove(element);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onCallEnded(ConversationEndInfo info) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onCallEnded(info);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public void onDestroyed(ConversationDestroyedInfo info) {
        Iterator<ConversationEventsListener> it = iterator();
        while (it.hasNext()) {
            it.next().onDestroyed(info);
        }
    }
}
