package ru.ok.android.externcalls.sdk.asr.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.dnf;
import defpackage.kql;
import defpackage.nx;
import defpackage.ox;
import defpackage.q4g;
import defpackage.qr7;
import defpackage.vj7;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.exceptions.AsrException;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lq4g;", "getSignalingOrPassExceptionToOnError", "(Lcf7;)Lq4g;", "", "fileName", "Ldnf;", "sessionRoomId", "Lkotlin/Function0;", "onSuccess", "startRecord", "(Ljava/lang/String;Ldnf;Laf7;Lcf7;)V", "stopRecord", "(Ldnf;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "getActiveRoomId", "()Ldnf;", "activeRoomId", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AsrCommandsExecutorImpl implements AsrCommandsExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public AsrCommandsExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    private final dnf getActiveRoomId() {
        return this.participantStore.getActiveRoomId();
    }

    private final q4g getSignalingOrPassExceptionToOnError(cf7 onError) {
        q4g signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (onError != null) {
            onError.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    public static final void startRecord$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void startRecord$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    public static final void stopRecord$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void stopRecord$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new AsrException(jSONObject, null, null, 6, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void startRecord(String fileName, dnf sessionRoomId, af7 onSuccess, cf7 onError) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        try {
            vj7 vj7VarB = kql.b(null, "asr-start");
            JSONObject jSONObject = vj7VarB.a;
            jSONObject.put("fileName", fileName);
            if (sessionRoomId instanceof cnf) {
                jSONObject.put("roomId", ((cnf) sessionRoomId).a);
            }
            signalingOrPassExceptionToOnError.d(vj7VarB, false, new nx(0, onSuccess), new ox(0, onError));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void stopRecord(dnf sessionRoomId, af7 onSuccess, cf7 onError) {
        if (sessionRoomId == null) {
            sessionRoomId = getActiveRoomId();
        }
        q4g signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(onError);
        if (signalingOrPassExceptionToOnError == null) {
            return;
        }
        try {
            vj7 vj7VarB = kql.b(null, "asr-stop");
            if (sessionRoomId instanceof cnf) {
                vj7VarB.a.put("roomId", ((cnf) sessionRoomId).a);
            }
            signalingOrPassExceptionToOnError.d(vj7VarB, false, new nx(1, onSuccess), new ox(1, onError));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }
}
