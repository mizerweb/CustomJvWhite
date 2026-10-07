package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import defpackage.af7;
import defpackage.cf7;
import defpackage.kql;
import defpackage.nx;
import defpackage.ox;
import defpackage.q4g;
import defpackage.qr7;
import defpackage.vj7;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feedback.exceptions.FeedbackException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "key", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lcf7;Laf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FeedbackCommandsExecutorImpl implements FeedbackCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public FeedbackCommandsExecutorImpl(SignalingProvider signalingProvider) {
        this.signalingProvider = signalingProvider;
    }

    public static final void sendFeedback$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void sendFeedback$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new FeedbackException(jSONObject.toString(), null, 2, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutor
    public void sendFeedback(String key, cf7 onError, af7 onSuccess) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        try {
            vj7 vj7VarB = kql.b(null, "feedback");
            vj7VarB.a.put("key", key);
            q4gVar.d(vj7VarB, false, new nx(4, onSuccess), new ox(4, onError));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }
}
