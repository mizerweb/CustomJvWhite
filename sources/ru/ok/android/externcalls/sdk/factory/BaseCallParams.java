package ru.ok.android.externcalls.sdk.factory;

import defpackage.af7;
import defpackage.cf7;
import defpackage.cn2;
import defpackage.eq0;
import defpackage.opb;
import defpackage.pg4;
import defpackage.sg4;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u00010Bm\b\u0004\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "T", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "B", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lcn2;", "frameInterceptor", "Lopb;", "cameraCapturerFactory", "", "fieldTrials", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcf7;Lcf7;ZLcn2;Lopb;Ljava/lang/String;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lcf7;", "getOnPrepared", "()Lcf7;", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "Lcn2;", "getFrameInterceptor", "()Lcn2;", "Lopb;", "getCameraCapturerFactory", "()Lopb;", "Ljava/lang/String;", "getFieldTrials", "()Ljava/lang/String;", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseCallParams<T, B extends Builder<T, B>> {
    private final opb cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final String fieldTrials;
    private final cn2 frameInterceptor;
    private final ParticipantId myId;
    private final cf7 onError;
    private final cf7 onPrepared;
    private final boolean shouldStartWithVideo;

    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, cf7 cf7Var, cf7 cf7Var2, boolean z, cn2 cn2Var, opb opbVar, String str) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = cf7Var;
        this.onError = cf7Var2;
        this.shouldStartWithVideo = z;
        this.cameraCapturerFactory = opbVar;
        this.fieldTrials = str;
    }

    public final opb getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final String getFieldTrials() {
        return this.fieldTrials;
    }

    public final cn2 getFrameInterceptor() {
        return null;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final cf7 getOnError() {
        return this.onError;
    }

    public final cf7 getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0014\b\u0003\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00028\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00028\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00028\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u0017\u001a\u00028\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bH\u0007¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u0016\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010!\u001a\u00028\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b!\u0010\u0018J\u001b\u0010!\u001a\u00028\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010$\u001a\u00028\u00032\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00028\u00032\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00028\u00032\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00028\u0002H&¢\u0006\u0004\b.\u0010/R*\u00100\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b\t\u00104R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b\r\u00108R$\u00109\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b\u0011\u0010=R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@\"\u0004\b\u0017\u0010AR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010>\u001a\u0004\bB\u0010@\"\u0004\b!\u0010AR\"\u0010'\u001a\u00020&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010#\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010H\u001a\u0004\bI\u0010J\"\u0004\b$\u0010KR$\u0010+\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010L\u001a\u0004\bM\u0010N\"\u0004\b,\u0010O¨\u0006P"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "T", "B", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "callerId", "setMyId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "setEventListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lopb;", "factory", "setCameraCapturerFactory", "(Lopb;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Lsbi;", "onPrepared", "setOnPrepared", "(Lcf7;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lsg4;", "(Lsg4;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function0;", "(Laf7;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "onError", "setOnError", "Lcn2;", "frameInterceptor", "setFrameInterceptor", "(Lcn2;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "shouldStartWithVideo", "setStartWithVideo", "(Z)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "fieldTrials", "setFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "build", "()Ljava/lang/Object;", "myId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "cameraCapturerFactory", "Lopb;", "getCameraCapturerFactory", "()Lopb;", "(Lopb;)V", "Lcf7;", "getOnPrepared", "()Lcf7;", "(Lcf7;)V", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "setShouldStartWithVideo", "(Z)V", "Lcn2;", "getFrameInterceptor", "()Lcn2;", "(Lcn2;)V", "Ljava/lang/String;", "getFieldTrials", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Builder<T, B extends Builder<T, B>> {
        private opb cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private String fieldTrials;
        private cn2 frameInterceptor;
        private ParticipantId myId;
        private cf7 onError;
        private cf7 onPrepared;
        private boolean shouldStartWithVideo;

        public abstract T build();

        public final opb getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final String getFieldTrials() {
            return this.fieldTrials;
        }

        public final cn2 getFrameInterceptor() {
            return null;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final cf7 getOnError() {
            return this.onError;
        }

        public final cf7 getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* JADX INFO: renamed from: setCameraCapturerFactory */
        public final void m127setCameraCapturerFactory(opb opbVar) {
            this.cameraCapturerFactory = opbVar;
        }

        /* JADX INFO: renamed from: setEventListener */
        public final void m128setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* JADX INFO: renamed from: setFieldTrials */
        public final void m129setFieldTrials(String str) {
            this.fieldTrials = str;
        }

        public final B setFrameInterceptor(cn2 frameInterceptor) {
            return this;
        }

        /* JADX INFO: renamed from: setFrameInterceptor */
        public final void m130setFrameInterceptor(cn2 cn2Var) {
        }

        /* JADX INFO: renamed from: setMyId */
        public final void m131setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        public final B setOnError(sg4 onError) {
            this.onError = new BaseCallParams$Builder$setOnError$1(onError);
            return this;
        }

        public final B setOnPrepared(af7 onPrepared) {
            setOnPrepared(new pg4(0, new eq0(0, onPrepared)));
            return this;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final B setStartWithVideo(boolean shouldStartWithVideo) {
            this.shouldStartWithVideo = shouldStartWithVideo;
            return this;
        }

        public final B setCameraCapturerFactory(opb factory) {
            this.cameraCapturerFactory = factory;
            return this;
        }

        public final B setEventListener(ConversationEventsListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        public final B setFieldTrials(String fieldTrials) {
            this.fieldTrials = fieldTrials;
            return this;
        }

        public final B setMyId(ParticipantId callerId) {
            this.myId = callerId;
            return this;
        }

        public final B setOnError(cf7 onError) {
            this.onError = onError;
            return this;
        }

        /* JADX INFO: renamed from: setOnError */
        public final void m132setOnError(cf7 cf7Var) {
            this.onError = cf7Var;
        }

        /* JADX INFO: renamed from: setOnPrepared */
        public final void m133setOnPrepared(cf7 cf7Var) {
            this.onPrepared = cf7Var;
        }

        public B setOnPrepared(cf7 onPrepared) {
            this.onPrepared = onPrepared;
            return this;
        }

        public final B setOnPrepared(sg4 onPrepared) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$1(onPrepared);
            return this;
        }

        public final B setOnPrepared(Runnable onPrepared) {
            setOnPrepared(new pg4(0, onPrepared));
            return this;
        }
    }
}
