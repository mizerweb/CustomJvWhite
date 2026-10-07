package ru.ok.android.externcalls.sdk.sessionroom.internal.listener;

import android.os.Handler;
import android.os.Looper;
import defpackage.bnf;
import defpackage.d12;
import defpackage.e12;
import defpackage.f12;
import defpackage.g12;
import defpackage.h12;
import defpackage.xmf;
import defpackage.yde;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManager;", "Lh12;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "Lsbi;", "sendActualState", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lf12;", "params", "onRoomRemoved", "(Lf12;)V", "Lg12;", "onRoomUpdated", "(Lg12;)V", "Le12;", "onCurrentParticipantInvitedToRoom", "(Le12;)V", "Ld12;", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomListenerManagerImpl implements SessionRoomListenerManager, h12 {
    private final ParticipantStore store;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArraySet<SessionRoomsManager.OwnRoomsListener> listeners = new CopyOnWriteArraySet<>();

    public SessionRoomListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantActiveRoomChanged$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, d12 d12Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(d12Var.a, d12Var.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantInvitedToRoom$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, e12 e12Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(e12Var.b, e12Var.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomRemoved$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, f12 f12Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomRemoved(new SessionRoomsManager.SessionRoomInfo(f12Var.a, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomUpdated$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, g12 g12Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomUpdated(new SessionRoomsManager.SessionRoomInfo(g12Var.a, g12Var.b));
        }
    }

    private final void sendActualState(SessionRoomsManager.OwnRoomsListener listener) {
        this.mainHandler.post(new yde(this, 11, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$0(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        if (sessionRoomListenerManagerImpl.listeners.contains(ownRoomsListener)) {
            xmf proposedRoom = sessionRoomListenerManagerImpl.store.getProposedRoom();
            if (proposedRoom != null) {
                ownRoomsListener.onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom));
            }
            xmf activeRoom = sessionRoomListenerManagerImpl.store.getActiveRoom();
            if (activeRoom != null) {
                ownRoomsListener.onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void addListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listeners.add(listener);
        sendActualState(listener);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        xmf activeRoom = this.store.getActiveRoom();
        return activeRoom != null ? new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom) : new SessionRoomsManager.SessionRoomInfo(bnf.a, null);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        xmf proposedRoom = this.store.getProposedRoom();
        return proposedRoom != null ? new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom) : new SessionRoomsManager.SessionRoomInfo(bnf.a, null);
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        this.mainHandler.post(new yde(this, 13, params));
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 params) {
        this.mainHandler.post(new yde(this, 15, params));
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 params) {
        this.mainHandler.post(new yde(this, 14, params));
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 params) {
        this.mainHandler.post(new yde(this, 12, params));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void removeListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listeners.remove(listener);
    }
}
