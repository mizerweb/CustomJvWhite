package ru.ok.android.externcalls.sdk.util;

import defpackage.au1;
import defpackage.ds1;
import defpackage.du1;
import defpackage.k91;
import defpackage.l91;
import defpackage.o91;
import defpackage.oh1;
import defpackage.q1g;
import defpackage.qu1;
import defpackage.wi1;
import defpackage.yt1;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000* \b\u0000\u0010\b*\u00020\u0001*\u00020\u0002*\u00020\u0003*\u00020\u0004*\u00020\u0005*\u00020\u0006*\u00020\u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u001c\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u001a0\u001aH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010&\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0$H\u0096\u0001¢\u0006\u0004\b&\u0010'J \u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H\u0097\u0001¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020-H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b5\u00106R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u00108\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/sdk/util/ConversationListenerProxy;", "Ll91;", "Lk91;", "Lwi1;", "Lds1;", "Lqu1;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lq1g;", "T", "listener", "<init>", "(Ll91;)V", "Lo91;", "call", "Loh1;", "event", "", "data", "Lsbi;", "onEvent", "(Lo91;Loh1;Ljava/lang/Object;)V", "unlock", "()V", "Lyt1;", "kotlin.jvm.PlatformType", "p0", "Lorg/json/JSONObject;", "p1", "onCustomData", "(Lyt1;Lorg/json/JSONObject;)V", "Ldu1;", "participant", "", "fingerprint", "onCallParticipantFingerprint", "(Ldu1;J)V", "", "participants", "onCallParticipantNetworkStatusChanged", "(Ljava/util/List;)V", "participantId", "Lau1;", "newState", "onStateChanged", "(Lyt1;Lau1;)V", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "notification", "onRateCall", "(Lorg/json/JSONObject;)V", "Ll91;", "isLocked", "Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationListenerProxy<T extends l91 & k91 & wi1 & ds1 & qu1 & WaitingRoomParticipants.Listener & q1g> implements l91, k91, wi1, ds1, qu1, WaitingRoomParticipants.Listener, q1g {
    private boolean isLocked = true;
    private final T listener;

    public ConversationListenerProxy(T t) {
        this.listener = t;
    }

    @Override // defpackage.wi1
    public void onCallParticipantFingerprint(du1 participant, long fingerprint) {
        this.listener.onCallParticipantFingerprint(participant, fingerprint);
    }

    @Override // defpackage.ds1
    public void onCallParticipantNetworkStatusChanged(List<du1> participants) {
        this.listener.onCallParticipantNetworkStatusChanged(participants);
    }

    @Override // defpackage.k91
    public void onCustomData(yt1 p0, JSONObject p1) {
        this.listener.onCustomData(p0, p1);
    }

    @Override // defpackage.l91
    public void onEvent(o91 call, oh1 event, Object data) {
        if (!this.isLocked || event == oh1.h) {
            this.listener.onEvent(call, event, data);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.listener.onMeInWaitingRoomChanged(isMeInWaitingRoom);
    }

    @Override // defpackage.q1g
    public void onRateCall(JSONObject notification) {
        this.listener.onRateCall(notification);
    }

    @Override // defpackage.qu1
    public void onStateChanged(yt1 participantId, au1 newState) {
        this.listener.onStateChanged(participantId, newState);
    }

    @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
    public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data) {
        this.listener.onWaitingRoomParticipantsChanged(data);
    }

    public final void unlock() {
        this.isLocked = false;
    }
}
