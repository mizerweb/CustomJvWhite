package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.yt1;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends fg7 implements cf7 {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, 0, StereoRoomManagerImpl.class, obj, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;");
    }

    @Override // defpackage.cf7
    public final ParticipantId invoke(yt1 yt1Var) {
        return ((StereoRoomManagerImpl) this.receiver).getExternalId(yt1Var);
    }
}
