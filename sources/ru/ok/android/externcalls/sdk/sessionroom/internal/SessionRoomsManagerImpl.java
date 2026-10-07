package ru.ok.android.externcalls.sdk.sessionroom.internal;

import defpackage.a9;
import defpackage.af7;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.d12;
import defpackage.dnf;
import defpackage.e12;
import defpackage.eje;
import defpackage.f12;
import defpackage.g12;
import defpackage.h12;
import defpackage.pfi;
import defpackage.yeh;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J6\u0010\u0019\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ>\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b\"\u0010#J>\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020$2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b%\u0010&J>\u0010(\u001a\u00020\u00142\u0006\u0010!\u001a\u00020'2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b(\u0010)J>\u0010+\u001a\u00020\u00142\u0006\u0010!\u001a\u00020*2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b+\u0010,J>\u0010.\u001a\u00020\u00142\u0006\u0010!\u001a\u00020-2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b4\u00103JB\u00107\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u0002052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00140\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b7\u00108J@\u0010:\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020609\u0012\u0004\u0012\u00020\u00140\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b:\u0010;JF\u0010?\u001a\u00020\u00142\n\u0010>\u001a\u00060<j\u0002`=2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00140\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b?\u0010@J\u0018\u0010B\u001a\u00020\u00142\u0006\u0010!\u001a\u00020AH\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0018\u0010E\u001a\u00020\u00142\u0006\u0010!\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0018\u0010H\u001a\u00020\u00142\u0006\u0010!\u001a\u00020GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020\u00142\u0006\u0010!\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bK\u0010LJ>\u0010N\u001a\u00020\u00142\u0006\u0010!\u001a\u00020M2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\bN\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010PR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010RR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010S¨\u0006T"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/SessionRoomsManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "Lh12;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManager;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "commandExecutor", "adminCommandExecutor", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Laf7;Lcf7;)V", "Lcnf;", "roomId", "joinRoom", "(Lcnf;Laf7;Lcf7;)V", "leaveRoom", "La9;", "params", "activateRooms", "(La9;Laf7;Lcf7;)V", "Lpfi;", "updateRooms", "(Lpfi;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Laf7;Lcf7;)V", "Leje;", "removeRooms", "(Leje;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "removeListener", "Ldnf;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "getRoomParticipants", "(Ldnf;Lcf7;Lcf7;)V", "", "getAllInRoomParticipants", "(Lcf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;)V", "Lg12;", "onRoomUpdated", "(Lg12;)V", "Lf12;", "onRoomRemoved", "(Lf12;)V", "Le12;", "onCurrentParticipantInvitedToRoom", "(Le12;)V", "Ld12;", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lyeh;", "switchRoom", "(Lyeh;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomsManagerImpl implements SessionRoomsManager, h12, SessionRoomListenerManager, SessionRoomCommandExecutor, SessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProvider {
    private final SessionRoomAdminCommandExecutor adminCommandExecutor;
    private final SessionRoomCommandExecutor commandExecutor;
    private final SessionRoomListenerManagerImpl listenerManager;
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;

    public SessionRoomsManagerImpl(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomCommandExecutor sessionRoomCommandExecutor, SessionRoomAdminCommandExecutor sessionRoomAdminCommandExecutor, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.listenerManager = sessionRoomListenerManagerImpl;
        this.commandExecutor = sessionRoomCommandExecutor;
        this.adminCommandExecutor = sessionRoomAdminCommandExecutor;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(a9 params, af7 onSuccess, cf7 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void addListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listenerManager.addListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, af7 onSuccess, cf7 onError) {
        this.adminCommandExecutor.assignParticipantsToRooms(params, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getAllInRoomParticipants(cf7 onSuccess, cf7 onError) {
        this.participantDataProvider.getAllInRoomParticipants(onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager
    public SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        return this.listenerManager.getOwnActiveRoom();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager
    public SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        return this.listenerManager.getOwnProposedRoom();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getParticipantRoomId(ParticipantId participantId, cf7 onSuccess, cf7 onError) {
        this.participantDataProvider.getParticipantRoomId(participantId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getRoomParticipants(dnf roomId, cf7 onSuccess, cf7 onError) {
        this.participantDataProvider.getRoomParticipants(roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void joinRoom(cnf roomId, af7 onSuccess, cf7 onError) {
        this.commandExecutor.joinRoom(roomId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void leaveRoom(af7 onSuccess, cf7 onError) {
        this.commandExecutor.leaveRoom(onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams params, af7 onSuccess, cf7 onError) {
        this.adminCommandExecutor.moveParticipant(params, onSuccess, onError);
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        this.listenerManager.onCurrentParticipantActiveRoomChanged(params);
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 params) {
        this.listenerManager.onCurrentParticipantInvitedToRoom(params);
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 params) {
        this.listenerManager.onRoomRemoved(params);
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 params) {
        this.listenerManager.onRoomUpdated(params);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void removeListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listenerManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(eje params, af7 onSuccess, cf7 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void requestAttention(af7 onSuccess, cf7 onError) {
        this.commandExecutor.requestAttention(onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(yeh params, af7 onSuccess, cf7 onError) {
        this.adminCommandExecutor.switchRoom(params, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager, ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(pfi params, af7 onSuccess, cf7 onError) {
        this.adminCommandExecutor.updateRooms(params, onSuccess, onError);
    }
}
