package ru.ok.android.externcalls.sdk.media.mute.internal;

import defpackage.af7;
import defpackage.cf7;
import defpackage.dnf;
import defpackage.n0a;
import defpackage.o0a;
import defpackage.p0a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ`\u0010\u001c\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJT\u0010\u001e\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJZ\u0010\"\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\"\u0010#JN\u0010$\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/MediaMuteManagerImpl;", "Lru/ok/android/externcalls/sdk/media/mute/MediaMuteManager;", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;", "commandExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;)V", "Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;", "listener", "Lsbi;", "addListener", "(Lru/ok/android/externcalls/sdk/media/mute/listener/MediaMuteManagerListener;)V", "removeListener", "", "Ln0a;", "Lo0a;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Ldnf;", "roomId", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Ldnf;Laf7;Lcf7;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Laf7;Lcf7;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Ldnf;Laf7;Lcf7;)V", "Lp0a;", "getMediaOptionsForCall", "(Ldnf;)Lp0a;", "getMediaOptionsForCurrentUser", "()Lp0a;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "Lru/ok/android/externcalls/sdk/media/mute/internal/listener/MediaMuteListenerManager;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaMuteManagerImpl implements MediaMuteManager, MediaMuteCommandExecutor, MediaMuteListenerManager {
    private final MediaMuteCommandExecutor commandExecutor;
    private final MediaMuteListenerManager listenerManager;

    public MediaMuteManagerImpl(MediaMuteCommandExecutor mediaMuteCommandExecutor, MediaMuteListenerManager mediaMuteListenerManager) {
        this.commandExecutor = mediaMuteCommandExecutor;
        this.listenerManager = mediaMuteListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void addListener(MediaMuteManagerListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public p0a getMediaOptionsForCall(dnf roomId) {
        return this.commandExecutor.getMediaOptionsForCall(roomId);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public p0a getMediaOptionsForCurrentUser() {
        return this.commandExecutor.getMediaOptionsForCurrentUser();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void removeListener(MediaMuteManagerListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends n0a> mediaOptions, dnf roomId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.requestToEnableMediaForAll(mediaOptions, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends n0a> mediaOptions, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.requestToEnableMediaForParticipant(mediaOptions, participantId, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean mute) {
        this.commandExecutor.setAudioPlayoutMuted(mute);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<n0a, ? extends o0a> statesToUpdate, dnf roomId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.updateMediaOptionsForAll(statesToUpdate, roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<n0a, ? extends o0a> statesToUpdate, ParticipantId participantId, dnf roomId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.updateMediaOptionsForParticipant(statesToUpdate, participantId, roomId, onSuccess, onError);
    }
}
