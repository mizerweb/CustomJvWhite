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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u007f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "", ApiProtocol.PARAM_CONVERSATION_ID, "", ApiProtocol.PARAM_CHAT_ID, "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lcn2;", "frameInterceptor", "Lopb;", "cameraCapturerFactory", "fieldTrials", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcn2;Lopb;Ljava/lang/String;)V", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinCallParams extends BaseCallParams<JoinCallParams, Builder> {
    private final Long chatId;
    private final String conversationId;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "<init>", "()V", ApiProtocol.PARAM_CONVERSATION_ID, "", ApiProtocol.PARAM_CHAT_ID, "", "Ljava/lang/Long;", "setConversationId", "setChatId", "build", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinCallParams, Builder> {
        private Long chatId;
        private String conversationId;

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinCallParams build() {
            String str = this.conversationId;
            if (str == null) {
                ore.p("Conversation id is required");
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
            return new JoinCallParams(str, this.chatId, myId, onPrepared, onError, shouldStartWithVideo, eventListener, null, getCameraCapturerFactory(), getFieldTrials(), null);
        }

        public final Builder setChatId(long chatId) {
            this.chatId = Long.valueOf(chatId);
            return this;
        }

        public final Builder setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
    }

    private JoinCallParams(String str, Long l, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, boolean z, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str2) {
        super(participantId, conversationEventsListener, cf7Var, cf7Var2, z, cn2Var, opbVar, str2);
        this.conversationId = str;
        this.chatId = l;
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public /* synthetic */ JoinCallParams(String str, Long l, ParticipantId participantId, cf7 cf7Var, cf7 cf7Var2, boolean z, ConversationEventsListener conversationEventsListener, cn2 cn2Var, opb opbVar, String str2, j95 j95Var) {
        this(str, l, participantId, cf7Var, cf7Var2, z, conversationEventsListener, cn2Var, opbVar, str2);
    }
}
