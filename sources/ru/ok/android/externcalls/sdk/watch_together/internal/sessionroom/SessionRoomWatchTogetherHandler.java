package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import defpackage.bnf;
import defpackage.cqk;
import defpackage.d12;
import defpackage.dnf;
import defpackage.e12;
import defpackage.f12;
import defpackage.g12;
import defpackage.h12;
import defpackage.u1b;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/sessionroom/SessionRoomWatchTogetherHandler;", "Lh12;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherManager", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;)V", "Lsbi;", "stopWatchTogetherForMe", "()V", "Ld12;", "params", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Ldnf;", "roomId", "Ldnf;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomWatchTogetherHandler implements h12 {
    private dnf roomId = bnf.a;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry<u1b, MovieState> entry : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            u1b key = entry.getKey();
            ParticipantId participantId = entry.getValue().getParticipantId();
            ConversationParticipant me2 = this.store.getMe();
            if (cqk.d(participantId, me2 != null ? me2.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, key, null, null, 6, null);
            }
        }
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        dnf dnfVar = this.roomId;
        dnf dnfVar2 = params.a;
        if (!cqk.d(dnfVar, dnfVar2)) {
            stopWatchTogetherForMe();
        }
        this.roomId = dnfVar2;
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 e12Var) {
        e12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 f12Var) {
        f12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 g12Var) {
        g12Var.getClass();
    }
}
