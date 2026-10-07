package ru.ok.android.externcalls.sdk.api.interceptor;

import defpackage.sg9;
import defpackage.y3e;
import defpackage.yt1;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/api/interceptor/LoginInterceptorListener;", "Lru/ok/android/externcalls/sdk/api/interceptor/MethodListenerInterceptor$Listener;", "Lsg9;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "me", "Ly3e;", "rtcLog", "<init>", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ly3e;)V", "response", "Lsbi;", "onMethod", "(Lsg9;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Ly3e;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LoginInterceptorListener implements MethodListenerInterceptor.Listener<sg9> {
    private static final String LOG_TAG = "LoginInterceptorListener";
    private final ConversationParticipant me;
    private final y3e rtcLog;

    public LoginInterceptorListener(ConversationParticipant conversationParticipant, y3e y3eVar) {
        this.me = conversationParticipant;
        this.rtcLog = y3eVar;
    }

    @Override // ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor.Listener
    public void onMethod(sg9 response) {
        yt1 yt1VarA;
        try {
            yt1VarA = yt1.a(response.a);
        } catch (Exception unused) {
            yt1VarA = null;
        }
        if (yt1VarA == null) {
            return;
        }
        if (this.me.getInternalId() == null || !yt1VarA.equals(this.me.getInternalId())) {
            this.rtcLog.log(LOG_TAG, "internalId updated from " + this.me.getInternalId() + " to " + yt1VarA);
            this.me.setInternalId(yt1VarA);
        }
    }
}
