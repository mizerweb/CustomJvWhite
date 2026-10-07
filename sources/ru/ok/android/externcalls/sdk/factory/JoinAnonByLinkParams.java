package ru.ok.android.externcalls.sdk.factory;

import defpackage.cf7;
import defpackage.cn2;
import defpackage.j95;
import defpackage.opb;
import defpackage.ore;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0087\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams$Builder;", "", "link", ApiProtocol.KEY_TOKEN, "apiEndpoint", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "", "shouldStartWithVideo", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lcn2;", "frameInterceptor", "Lopb;", "cameraCapturerFactory", "fieldTrials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLcf7;Lcf7;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcn2;Lopb;Ljava/lang/String;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "getToken", "getApiEndpoint", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinAnonByLinkParams extends BaseCallParams<JoinAnonByLinkParams, Builder> {
    private final String apiEndpoint;
    private final String link;
    private final String token;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinAnonByLinkParams;", "<init>", "()V", "link", "", ApiProtocol.KEY_TOKEN, "apiEndpoint", "setToken", "setTokenInfo", "setLink", "build", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinAnonByLinkParams, Builder> {
        private String apiEndpoint;
        private String link;
        private String token;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinAnonByLinkParams build() {
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
            String str2 = this.token;
            if (str2 == null) {
                ore.p("Token is required");
                return null;
            }
            String str3 = this.apiEndpoint;
            ConversationEventsListener eventListener = getEventListener();
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            getFrameInterceptor();
            return new JoinAnonByLinkParams(str, str2, str3, myId, shouldStartWithVideo, onPrepared, onError, eventListener, null, getCameraCapturerFactory(), getFieldTrials(), null);
        }

        public final Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public final Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public final Builder setTokenInfo(String token, String apiEndpoint) {
            this.token = token;
            this.apiEndpoint = apiEndpoint;
            return this;
        }
    }

    private JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, cf7 cf7Var, cf7 cf7Var2, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str4) {
        super(participantId, conversationEventsListener, cf7Var, cf7Var2, z, cn2Var, opbVar, str4);
        this.link = str;
        this.token = str2;
        this.apiEndpoint = str3;
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getToken() {
        return this.token;
    }

    public /* synthetic */ JoinAnonByLinkParams(String str, String str2, String str3, ParticipantId participantId, boolean z, cf7 cf7Var, cf7 cf7Var2, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str4, j95 j95Var) {
        this(str, str2, str3, participantId, z, cf7Var, cf7Var2, conversationEventsListener, cn2Var, opbVar, str4);
    }
}
