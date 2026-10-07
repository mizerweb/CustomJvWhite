package ru.ok.android.externcalls.sdk.factory;

import defpackage.cf7;
import defpackage.cn2;
import defpackage.dq;
import defpackage.j95;
import defpackage.opb;
import defpackage.ore;
import defpackage.r66;
import defpackage.wuh;
import java.util.Collection;
import java.util.UUID;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:BÉ\u0001\b\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%R!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b\u000e\u00103R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b\u000f\u00103R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "Lwuh;", "tokenProvider", "Ldq;", "tokenInfoProvider", "", ApiProtocol.PARAM_PAYLOAD, "", "isAnonForbidden", "isWatchTogetherEnabledForAll", "isWaitingForAdminEnabled", "Ljava/util/UUID;", ApiProtocol.PARAM_CONVERSATION_ID, "", ApiProtocol.PARAM_CHAT_ID, "shouldStartWithVideo", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lcn2;", "frameInterceptor", "Lopb;", "cameraCapturerFactory", "fieldTrials", "<init>", "(Ljava/util/Collection;Lwuh;Ldq;Ljava/lang/String;ZZZLjava/util/UUID;Ljava/lang/Long;ZLru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcn2;Lopb;Ljava/lang/String;)V", "Ljava/util/Collection;", "getInitialIds", "()Ljava/util/Collection;", "Lwuh;", "getTokenProvider", "()Lwuh;", "Ldq;", "getTokenInfoProvider", "()Ldq;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Z", "()Z", "Ljava/util/UUID;", "getConversationId", "()Ljava/util/UUID;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreateConfParams extends BaseCallParams<CreateConfParams, Builder> {
    private final Long chatId;
    private final UUID conversationId;
    private final Collection<ParticipantId> initialIds;
    private final boolean isAnonForbidden;
    private final boolean isWaitingForAdminEnabled;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;
    private final dq tokenInfoProvider;
    private final wuh tokenProvider;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R \u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010/R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "<init>", "()V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "setInitialIds", "(Ljava/util/Collection;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "isAnonForbidden", "setAnonForbidden", "(Z)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", ApiProtocol.PARAM_PAYLOAD, "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lwuh;", "tokenProvider", "setTokenProvider", "(Lwuh;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Ldq;", "tokenInfoProvider", "setTokenInfoProvider", "(Ldq;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "isWatchTogetherEnabledForAll", "setWatchTogetherEnabledForAll", "isEnabled", "setWaitingForAdminEnabled", "Ljava/util/UUID;", ApiProtocol.PARAM_CONVERSATION_ID, "setConversationId", "(Ljava/util/UUID;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", ApiProtocol.PARAM_CHAT_ID, "setChatId", "(J)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "build", "()Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Lwuh;", "Ldq;", "Ljava/util/Collection;", "Ljava/lang/String;", "Z", "isWaitingForAdminEnabled", "Ljava/util/UUID;", "Ljava/lang/Long;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<CreateConfParams, Builder> {
        private Long chatId;
        private UUID conversationId;
        private boolean isAnonForbidden;
        private boolean isWaitingForAdminEnabled;
        private String payload;
        private dq tokenInfoProvider;
        private wuh tokenProvider;
        private Collection<ParticipantId> initialIds = r66.a;
        private boolean isWatchTogetherEnabledForAll = true;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public CreateConfParams build() {
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
            wuh wuhVar = this.tokenProvider;
            dq dqVar = this.tokenInfoProvider;
            boolean z = this.isAnonForbidden;
            boolean z2 = this.isWaitingForAdminEnabled;
            UUID uuid = this.conversationId;
            String str = this.payload;
            return new CreateConfParams(this.initialIds, wuhVar, dqVar, str, z, this.isWatchTogetherEnabledForAll, z2, uuid, this.chatId, shouldStartWithVideo, myId, onPrepared, onError, eventListener, null, getCameraCapturerFactory(), getFieldTrials(), null);
        }

        public final Builder setAnonForbidden(boolean isAnonForbidden) {
            this.isAnonForbidden = isAnonForbidden;
            return this;
        }

        public final Builder setChatId(long chatId) {
            this.chatId = Long.valueOf(chatId);
            return this;
        }

        public final Builder setConversationId(UUID conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        public final Builder setInitialIds(Collection<ParticipantId> initialIds) {
            this.initialIds = initialIds;
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

        public final Builder setWaitingForAdminEnabled(boolean isEnabled) {
            this.isWaitingForAdminEnabled = isEnabled;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean isWatchTogetherEnabledForAll) {
            this.isWatchTogetherEnabledForAll = isWatchTogetherEnabledForAll;
            return this;
        }
    }

    private CreateConfParams(Collection<ParticipantId> collection, wuh wuhVar, dq dqVar, String str, boolean z, boolean z2, boolean z3, UUID uuid, Long l, boolean z4, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str2) {
        super(participantId, conversationEventsListener, cf7Var, cf7Var2, z4, cn2Var, opbVar, str2);
        this.initialIds = collection;
        this.tokenProvider = wuhVar;
        this.tokenInfoProvider = dqVar;
        this.payload = str;
        this.isAnonForbidden = z;
        this.isWatchTogetherEnabledForAll = z2;
        this.isWaitingForAdminEnabled = z3;
        this.conversationId = uuid;
        this.chatId = l;
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final Collection<ParticipantId> getInitialIds() {
        return this.initialIds;
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

    /* JADX INFO: renamed from: isAnonForbidden, reason: from getter */
    public final boolean getIsAnonForbidden() {
        return this.isAnonForbidden;
    }

    /* JADX INFO: renamed from: isWaitingForAdminEnabled, reason: from getter */
    public final boolean getIsWaitingForAdminEnabled() {
        return this.isWaitingForAdminEnabled;
    }

    /* JADX INFO: renamed from: isWatchTogetherEnabledForAll, reason: from getter */
    public final boolean getIsWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    public /* synthetic */ CreateConfParams(Collection collection, wuh wuhVar, dq dqVar, String str, boolean z, boolean z2, boolean z3, UUID uuid, Long l, boolean z4, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str2, j95 j95Var) {
        this(collection, wuhVar, dqVar, str, z, z2, z3, uuid, l, z4, participantId, cf7Var, cf7Var2, conversationEventsListener, cn2Var, opbVar, str2);
    }
}
