package ru.ok.android.externcalls.sdk.media.mute;

import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.dnf;
import defpackage.n0a;
import defpackage.o0a;
import defpackage.p0a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006Je\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019J_\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "", "Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;", "listener", "Lsbi;", "addListener", "(Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;)V", "removeListener", "", "Ln0a;", "Lo0a;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Ldnf;", "roomId", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Ldnf;Laf7;Lcf7;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Ldnf;Laf7;Lcf7;)V", "Lp0a;", "getMediaOptionsForCall", "(Ldnf;)Lp0a;", "getMediaOptionsForCurrentUser", "()Lp0a;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface MediaMuteManager {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ p0a getMediaOptionsForCall$default(MediaMuteManager mediaMuteManager, dnf dnfVar, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: getMediaOptionsForCall");
            return null;
        }
        if ((i & 1) != 0) {
            dnfVar = null;
        }
        return mediaMuteManager.getMediaOptionsForCall(dnfVar);
    }

    static /* synthetic */ void requestToEnableMediaForAll$default(MediaMuteManager mediaMuteManager, Set set, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: requestToEnableMediaForAll");
            return;
        }
        if ((i & 2) != 0) {
            dnfVar = null;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        mediaMuteManager.requestToEnableMediaForAll(set, dnfVar, af7Var, cf7Var);
    }

    static /* synthetic */ void requestToEnableMediaForParticipant$default(MediaMuteManager mediaMuteManager, Set set, ParticipantId participantId, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: requestToEnableMediaForParticipant");
            return;
        }
        if ((i & 4) != 0) {
            dnfVar = null;
        }
        if ((i & 8) != 0) {
            af7Var = null;
        }
        if ((i & 16) != 0) {
            cf7Var = null;
        }
        mediaMuteManager.requestToEnableMediaForParticipant(set, participantId, dnfVar, af7Var, cf7Var);
    }

    static /* synthetic */ void updateMediaOptionsForAll$default(MediaMuteManager mediaMuteManager, Map map, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: updateMediaOptionsForAll");
            return;
        }
        if ((i & 2) != 0) {
            dnfVar = null;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        mediaMuteManager.updateMediaOptionsForAll(map, dnfVar, af7Var, cf7Var);
    }

    static /* synthetic */ void updateMediaOptionsForParticipant$default(MediaMuteManager mediaMuteManager, Map map, ParticipantId participantId, dnf dnfVar, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: updateMediaOptionsForParticipant");
            return;
        }
        if ((i & 4) != 0) {
            dnfVar = null;
        }
        if ((i & 8) != 0) {
            af7Var = null;
        }
        if ((i & 16) != 0) {
            cf7Var = null;
        }
        mediaMuteManager.updateMediaOptionsForParticipant(map, participantId, dnfVar, af7Var, cf7Var);
    }

    void addListener(MediaMuteManagerListener listener);

    p0a getMediaOptionsForCall(dnf roomId);

    p0a getMediaOptionsForCurrentUser();

    void removeListener(MediaMuteManagerListener listener);

    void requestToEnableMediaForAll(Set<? extends n0a> mediaOptions, dnf roomId, af7 onSuccess, cf7 onError);

    void requestToEnableMediaForParticipant(Set<? extends n0a> mediaOptions, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError);

    void setAudioPlayoutMuted(boolean mute);

    void updateMediaOptionsForAll(Map<n0a, ? extends o0a> statesToUpdate, dnf roomId, af7 onSuccess, cf7 onError);

    void updateMediaOptionsForParticipant(Map<n0a, ? extends o0a> statesToUpdate, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError);
}
