package ru.ok.android.externcalls.sdk.factory;

import defpackage.cf7;
import defpackage.cn2;
import defpackage.dq;
import defpackage.j95;
import defpackage.opb;
import defpackage.ore;
import defpackage.wuh;
import java.util.UUID;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<BÇ\u0001\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b\u000f\u00105R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b\u0010\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", ApiProtocol.PARAM_PAYLOAD, "Lwuh;", "tokenProvider", "Ldq;", "tokenInfoProvider", "", ApiProtocol.PARAM_CHAT_ID, "", "isWatchTogetherEnabledForAll", "isWaitingForAdminEnabled", "Ljava/util/UUID;", ApiProtocol.PARAM_CONVERSATION_ID, "ringingTimeout", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "Lcn2;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lopb;", "cameraCapturerFactory", "shouldStartWithVideo", "fieldTrials", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;Lwuh;Ldq;Ljava/lang/Long;ZZLjava/util/UUID;JLru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;Lcn2;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lopb;ZLjava/lang/String;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Lwuh;", "getTokenProvider", "()Lwuh;", "Ldq;", "getTokenInfoProvider", "()Ldq;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Z", "()Z", "Ljava/util/UUID;", "getConversationId", "()Ljava/util/UUID;", "J", "getRingingTimeout", "()J", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartCallParams extends BaseCallParams<StartCallParams, Builder> {
    private final Long chatId;
    private final UUID conversationId;
    private final boolean isWaitingForAdminEnabled;
    private final boolean isWatchTogetherEnabledForAll;
    private final ParticipantId opponentId;
    private final String payload;
    private final long ringingTimeout;
    private final dq tokenInfoProvider;
    private final wuh tokenProvider;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&R\u001e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010.\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010/R\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00100¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", ApiProtocol.PARAM_PAYLOAD, "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lwuh;", "tokenProvider", "setTokenProvider", "(Lwuh;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Ldq;", "tokenInfoProvider", "setTokenInfoProvider", "(Ldq;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "isEnabled", "setWatchTogetherEnabledForAll", "(Z)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", ApiProtocol.PARAM_CHAT_ID, "setChatId", "(J)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "setWaitingForAdminEnabled", "Ljava/util/UUID;", ApiProtocol.PARAM_CONVERSATION_ID, "setConversationId", "(Ljava/util/UUID;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "ringingTimeout", "setRingingTimeout", "build", "()Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "Lwuh;", "Ldq;", "isWatchTogetherEnabledForAll", "Z", "Ljava/lang/Long;", "isWaitingForAdminEnabled", "Ljava/util/UUID;", "J", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<StartCallParams, Builder> {
        private Long chatId;
        private UUID conversationId;
        private boolean isWaitingForAdminEnabled;
        private boolean isWatchTogetherEnabledForAll;
        private ParticipantId opponentId;
        private String payload;
        private long ringingTimeout;
        private dq tokenInfoProvider;
        private wuh tokenProvider;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public StartCallParams build() {
            if (this.chatId == null && this.opponentId == null) {
                ore.p("target should exist: userId, callId or groupId");
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
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            boolean z = this.isWaitingForAdminEnabled;
            UUID uuid = this.conversationId;
            long j = this.ringingTimeout;
            ConversationEventsListener eventListener = getEventListener();
            ParticipantId participantId = this.opponentId;
            Long l = this.chatId;
            String str = this.payload;
            getFrameInterceptor();
            return new StartCallParams(participantId, str, this.tokenProvider, this.tokenInfoProvider, l, this.isWatchTogetherEnabledForAll, z, uuid, j, myId, onPrepared, onError, null, eventListener, getCameraCapturerFactory(), shouldStartWithVideo, getFieldTrials(), null);
        }

        public final Builder setChatId(long chatId) {
            this.chatId = Long.valueOf(chatId);
            return this;
        }

        public final Builder setConversationId(UUID conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        public final Builder setOpponentId(ParticipantId opponentId) {
            this.opponentId = opponentId;
            return this;
        }

        public final Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public final Builder setRingingTimeout(long ringingTimeout) {
            this.ringingTimeout = ringingTimeout;
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

        public final Builder setWaitingForAdminEnabled(boolean isEnabled) {
            this.isWaitingForAdminEnabled = isEnabled;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean isEnabled) {
            this.isWatchTogetherEnabledForAll = isEnabled;
            return this;
        }
    }

    private StartCallParams(ParticipantId participantId, String str, wuh wuhVar, dq dqVar, Long l, boolean z, boolean z2, UUID uuid, long j, ParticipantId participantId2, cf7 cf7Var, cf7 cf7Var2, cn2 cn2Var, ConversationEventsListener conversationEventsListener, opb opbVar, boolean z3, String str2) {
        super(participantId2, conversationEventsListener, cf7Var, cf7Var2, z3, cn2Var, opbVar, str2);
        this.opponentId = participantId;
        this.payload = str;
        this.tokenProvider = wuhVar;
        this.tokenInfoProvider = dqVar;
        this.chatId = l;
        this.isWatchTogetherEnabledForAll = z;
        this.isWaitingForAdminEnabled = z2;
        this.conversationId = uuid;
        this.ringingTimeout = j;
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final long getRingingTimeout() {
        return this.ringingTimeout;
    }

    public final dq getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final wuh getTokenProvider() {
        return this.tokenProvider;
    }

    /* JADX INFO: renamed from: isWaitingForAdminEnabled, reason: from getter */
    public final boolean getIsWaitingForAdminEnabled() {
        return this.isWaitingForAdminEnabled;
    }

    /* JADX INFO: renamed from: isWatchTogetherEnabledForAll, reason: from getter */
    public final boolean getIsWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    public /* synthetic */ StartCallParams(ParticipantId participantId, String str, wuh wuhVar, dq dqVar, Long l, boolean z, boolean z2, UUID uuid, long j, ParticipantId participantId2, cf7 cf7Var, cf7 cf7Var2, cn2 cn2Var, ConversationEventsListener conversationEventsListener, opb opbVar, boolean z3, String str2, j95 j95Var) {
        this(participantId, str, wuhVar, dqVar, l, z, z2, uuid, j, participantId2, cf7Var, cf7Var2, cn2Var, conversationEventsListener, opbVar, z3, str2);
    }
}
