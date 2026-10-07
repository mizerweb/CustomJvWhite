package ru.ok.android.externcalls.sdk.chat.internal.command;

import defpackage.af7;
import defpackage.cf7;
import defpackage.kql;
import defpackage.nx;
import defpackage.ox;
import defpackage.q4g;
import defpackage.qr7;
import defpackage.vj7;
import defpackage.yt1;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/chat/internal/command/ChatCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;", "message", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "sendMessage", "(Lru/ok/android/externcalls/sdk/chat/message/OutboundMessage;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatCommandExecutorImpl implements ChatCommandExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public ChatCommandExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    public static final void sendMessage$lambda$1(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void sendMessage$lambda$2(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Send message error " + jSONObject));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage message, af7 onSuccess, cf7 onError) {
        ConversationParticipant byExternal;
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        ParticipantId participantId = message.getParticipantId();
        JSONObject jSONObject = null;
        if (participantId != null) {
            byExternal = this.participantStore.getByExternal(participantId);
            if (byExternal == null) {
                if (onError != null) {
                    onError.invoke(new NullPointerException("Couldn't find a ConversationParticipant for participantId=" + participantId));
                    return;
                }
                return;
            }
        } else {
            byExternal = null;
        }
        yt1 internalId = byExternal != null ? byExternal.getInternalId() : null;
        String text = message.getText();
        if (internalId != null) {
            try {
                jSONObject = new JSONObject();
                kql.d(internalId, jSONObject, true);
            } catch (JSONException e) {
                qr7.o(e);
                return;
            }
        }
        vj7 vj7VarB = kql.b(jSONObject, "chat-message");
        text.getClass();
        vj7VarB.a.put("message", text);
        q4gVar.d(vj7VarB, false, new nx(2, onSuccess), new ox(2, onError));
    }
}
