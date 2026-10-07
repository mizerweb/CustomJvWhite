package ru.ok.android.externcalls.sdk.stereo;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\n\u0010\tJ5\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u000b\u0010\tJ5\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\tJA\u0010\u0010\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0012\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0012\u0010\u0011JA\u0010\u0013\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0013\u0010\u0011JA\u0010\u0014\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0011JA\u0010\u0015\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0015\u0010\u0011JA\u0010\u0016\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Laf7;Lcf7;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Laf7;Lcf7;)V", "rejectPromotionRequest", "revokePromotion", "unpromoteParticipant", "grantAdmin", "revokeAdmin", "", "isMePromoted", "()Z", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "handsQueue", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StereoRoomManager extends StereoRoomListenerManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void acceptPromotion$default(StereoRoomManager stereoRoomManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: acceptPromotion");
            return;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.acceptPromotion(af7Var, cf7Var);
    }

    static /* synthetic */ void cancelPromotionRequest$default(StereoRoomManager stereoRoomManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: cancelPromotionRequest");
            return;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.cancelPromotionRequest(af7Var, cf7Var);
    }

    static /* synthetic */ void grantAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: grantAdmin");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.grantAdmin(participantId, af7Var, cf7Var);
    }

    static /* synthetic */ void promoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: promoteParticipant");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.promoteParticipant(participantId, af7Var, cf7Var);
    }

    static /* synthetic */ void rejectPromotion$default(StereoRoomManager stereoRoomManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: rejectPromotion");
            return;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.rejectPromotion(af7Var, cf7Var);
    }

    static /* synthetic */ void rejectPromotionRequest$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: rejectPromotionRequest");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.rejectPromotionRequest(participantId, af7Var, cf7Var);
    }

    static /* synthetic */ void requestPromotion$default(StereoRoomManager stereoRoomManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: requestPromotion");
            return;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.requestPromotion(af7Var, cf7Var);
    }

    static /* synthetic */ void revokeAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: revokeAdmin");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.revokeAdmin(participantId, af7Var, cf7Var);
    }

    static /* synthetic */ void revokePromotion$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: revokePromotion");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.revokePromotion(participantId, af7Var, cf7Var);
    }

    static /* synthetic */ void unpromoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: unpromoteParticipant");
            return;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        stereoRoomManager.unpromoteParticipant(participantId, af7Var, cf7Var);
    }

    void acceptPromotion(af7 onSuccess, cf7 onError);

    void cancelPromotionRequest(af7 onSuccess, cf7 onError);

    StereoRoomHandsQueue getHandsQueue();

    void grantAdmin(ParticipantId participantId, af7 onSuccess, cf7 onError);

    /* JADX INFO: renamed from: isMePromoted */
    boolean getIsMePromoted();

    void promoteParticipant(ParticipantId participantId, af7 onSuccess, cf7 onError);

    void rejectPromotion(af7 onSuccess, cf7 onError);

    void rejectPromotionRequest(ParticipantId participantId, af7 onSuccess, cf7 onError);

    void requestPromotion(af7 onSuccess, cf7 onError);

    void revokeAdmin(ParticipantId participantId, af7 onSuccess, cf7 onError);

    void revokePromotion(ParticipantId participantId, af7 onSuccess, cf7 onError);

    void unpromoteParticipant(ParticipantId participantId, af7 onSuccess, cf7 onError);
}
