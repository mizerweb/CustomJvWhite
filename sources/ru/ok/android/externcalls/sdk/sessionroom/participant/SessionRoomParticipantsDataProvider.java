package ru.ok.android.externcalls.sdk.sessionroom.participant;

import defpackage.cf7;
import defpackage.dnf;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\r\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "", "Ldnf;", "roomId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "Lsbi;", "onSuccess", "", "onError", "getRoomParticipants", "(Ldnf;Lcf7;Lcf7;)V", "", "getAllInRoomParticipants", "(Lcf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface SessionRoomParticipantsDataProvider {
    void getAllInRoomParticipants(cf7 onSuccess, cf7 onError);

    void getParticipantRoomId(ParticipantId participantId, cf7 onSuccess, cf7 onError);

    void getRoomParticipants(dnf roomId, cf7 onSuccess, cf7 onError);
}
