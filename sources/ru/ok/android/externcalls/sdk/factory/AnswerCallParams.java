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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B«\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b/\u0010\"¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "", ApiProtocol.PARAM_CONVERSATION_ID, "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", "answerAsContact", "Lwuh;", "tokenProvider", "Ldq;", "tokenInfoProvider", "conversationParams", "myId", "shouldStartWithVideo", "Lcn2;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "Lopb;", "cameraCapturerFactory", "fieldTrials", "<init>", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLwuh;Ldq;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;ZLcn2;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcf7;Lcf7;Lopb;Ljava/lang/String;)V", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Z", "getAnswerAsContact", "()Z", "Lwuh;", "getTokenProvider", "()Lwuh;", "Ldq;", "getTokenInfoProvider", "()Ldq;", "getConversationParams", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnswerCallParams extends BaseCallParams<AnswerCallParams, Builder> {
    private final boolean answerAsContact;
    private final String conversationId;
    private final String conversationParams;
    private final ParticipantId opponentId;
    private final dq tokenInfoProvider;
    private final wuh tokenProvider;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "<init>", "()V", "", ApiProtocol.PARAM_CONVERSATION_ID, "setConversationId", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "", "answerAsContact", "setAnswerAsContact", "(Z)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Lwuh;", "tokenProvider", "setTokenProvider", "(Lwuh;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "Ldq;", "tokenInfoProvider", "setTokenInfoProvider", "(Ldq;)Lru/ok/android/externcalls/sdk/factory/AnswerCallParams$Builder;", "conversationParams", "setConversationParams", "build", "()Lru/ok/android/externcalls/sdk/factory/AnswerCallParams;", "Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Z", "Lwuh;", "Ldq;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<AnswerCallParams, Builder> {
        private boolean answerAsContact;
        private String conversationId;
        private String conversationParams;
        private ParticipantId opponentId;
        private dq tokenInfoProvider;
        private wuh tokenProvider;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public AnswerCallParams build() {
            String str = this.conversationId;
            if (str == null) {
                ore.p("Conversation id is required");
                return null;
            }
            ParticipantId participantId = this.opponentId;
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
            boolean z = this.answerAsContact;
            getFrameInterceptor();
            return new AnswerCallParams(str, participantId, z, this.tokenProvider, this.tokenInfoProvider, this.conversationParams, myId, shouldStartWithVideo, null, eventListener, onPrepared, onError, getCameraCapturerFactory(), getFieldTrials(), null);
        }

        public final Builder setAnswerAsContact(boolean answerAsContact) {
            this.answerAsContact = answerAsContact;
            return this;
        }

        public final Builder setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        public final Builder setConversationParams(String conversationParams) {
            this.conversationParams = conversationParams;
            return this;
        }

        public final Builder setOpponentId(ParticipantId opponentId) {
            this.opponentId = opponentId;
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

    private AnswerCallParams(String str, ParticipantId participantId, boolean z, wuh wuhVar, dq dqVar, String str2, ParticipantId participantId2, boolean z2, cn2 cn2Var, ConversationEventsListener conversationEventsListener, cf7 cf7Var, cf7 cf7Var2, opb opbVar, String str3) {
        super(participantId2, conversationEventsListener, cf7Var, cf7Var2, z2, cn2Var, opbVar, str3);
        this.conversationId = str;
        this.opponentId = participantId;
        this.answerAsContact = z;
        this.tokenProvider = wuhVar;
        this.tokenInfoProvider = dqVar;
        this.conversationParams = str2;
    }

    public final boolean getAnswerAsContact() {
        return this.answerAsContact;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationParams() {
        return this.conversationParams;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final dq getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final wuh getTokenProvider() {
        return this.tokenProvider;
    }

    public /* synthetic */ AnswerCallParams(String str, ParticipantId participantId, boolean z, wuh wuhVar, dq dqVar, String str2, ParticipantId participantId2, boolean z2, cn2 cn2Var, ConversationEventsListener conversationEventsListener, cf7 cf7Var, cf7 cf7Var2, opb opbVar, String str3, j95 j95Var) {
        this(str, participantId, z, wuhVar, dqVar, str2, participantId2, z2, cn2Var, conversationEventsListener, cf7Var, cf7Var2, opbVar, str3);
    }
}
