package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.af7;
import defpackage.anf;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.nx;
import defpackage.q4g;
import defpackage.vj7;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Laf7;Lcf7;)V", "Lcnf;", "roomId", "joinRoom", "(Lcnf;Laf7;Lcf7;)V", "leaveRoom", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomCommandExecutor {
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final SignalingProvider signalingProvider;

    public SessionRoomCommandExecutorImpl(ParticipantStatesManagerImpl participantStatesManagerImpl, SignalingProvider signalingProvider) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.signalingProvider = signalingProvider;
    }

    public static final void joinRoom$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void leaveRoom$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void requestAttention$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void joinRoom(cnf roomId, af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "switch-room");
        jSONObject.put("toRoomId", roomId.a);
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(10, onSuccess), new anf(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void leaveRoom(af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "switch-room");
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(11, onSuccess), new anf(this, onError, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutor
    public void requestAttention(af7 onSuccess, cf7 onError) {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED;
        if (!participantStatesManagerImpl.isOwnStateOn(state)) {
            this.participantStatesManager.updateOwnState(state, ParticipantStatesManagerImpl.INSTANCE.getSTATE_ON(), new nx(12, onSuccess), new anf(this, onError, 2));
        } else if (onSuccess != null) {
            onSuccess.invoke();
        }
    }
}
