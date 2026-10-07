package ru.ok.android.externcalls.sdk.factory;

import defpackage.cf7;
import defpackage.cn2;
import defpackage.dq;
import defpackage.j95;
import defpackage.opb;
import defpackage.ore;
import defpackage.wuh;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0093\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "Lwuh;", "tokenProvider", "Ldq;", "tokenInfoProvider", ApiProtocol.PARAM_PAYLOAD, "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lcn2;", "frameInterceptor", "Lopb;", "cameraCapturerFactory", "fieldTrials", "<init>", "(Ljava/lang/String;Lwuh;Ldq;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcn2;Lopb;Ljava/lang/String;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "Lwuh;", "getTokenProvider", "()Lwuh;", "Ldq;", "getTokenInfoProvider", "()Ldq;", "getPayload", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinByLinkParams extends BaseCallParams<JoinByLinkParams, Builder> {
    private final String link;
    private final String payload;
    private final dq tokenInfoProvider;
    private final wuh tokenProvider;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "<init>", "()V", "Lwuh;", "tokenProvider", "setTokenProvider", "(Lwuh;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Ldq;", "tokenInfoProvider", "setTokenInfoProvider", "(Ldq;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "setLink", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", ApiProtocol.PARAM_PAYLOAD, "setPayload", "build", "()Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Ljava/lang/String;", "Lwuh;", "Ldq;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinByLinkParams, Builder> {
        private String link;
        private String payload;
        private dq tokenInfoProvider;
        private wuh tokenProvider;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinByLinkParams build() {
            String str = this.link;
            if (str == null) {
                ore.p("Link is required");
                return null;
            }
            ParticipantId myId = getMyId();
            if (myId == null) {
                ore.p("Caller id is required");
                return null;
            }
            cf7 onPrepared = getOnPrepared();
            if (onPrepared == null) {
                ore.p("onPrepared callback is required");
                return null;
            }
            cf7 onError = getOnError();
            if (onError == null) {
                ore.p("onError callback is required");
                return null;
            }
            ConversationEventsListener eventListener = getEventListener();
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            getFrameInterceptor();
            return new JoinByLinkParams(str, this.tokenProvider, this.tokenInfoProvider, this.payload, myId, onPrepared, onError, shouldStartWithVideo, eventListener, null, getCameraCapturerFactory(), getFieldTrials(), null);
        }

        public final Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public final Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public final Builder setTokenInfoProvider(dq tokenInfoProvider) {
            this.tokenInfoProvider = tokenInfoProvider;
            return this;
        }

        public final Builder setTokenProvider(wuh tokenProvider) {
            this.tokenProvider = tokenProvider;
            return this;
        }
    }

    private JoinByLinkParams(String str, wuh wuhVar, dq dqVar, String str2, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, boolean z, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str3) {
        super(participantId, conversationEventsListener, cf7Var, cf7Var2, z, cn2Var, opbVar, str3);
        this.link = str;
        this.tokenProvider = wuhVar;
        this.tokenInfoProvider = dqVar;
        this.payload = str2;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final dq getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final wuh getTokenProvider() {
        return this.tokenProvider;
    }

    public /* synthetic */ JoinByLinkParams(String str, wuh wuhVar, dq dqVar, String str2, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, boolean z, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str3, j95 j95Var) {
        this(str, wuhVar, dqVar, str2, participantId, cf7Var, cf7Var2, z, conversationEventsListener, cn2Var, opbVar, str3);
    }
}
