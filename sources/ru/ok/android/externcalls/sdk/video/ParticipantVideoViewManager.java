package ru.ok.android.externcalls.sdk.video;

import android.content.Context;
import android.view.View;
import defpackage.af7;
import defpackage.cf7;
import defpackage.cka;
import defpackage.dc7;
import java.util.Collection;
import kotlin.Metadata;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ#\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010!R\u001c\u0010*\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "R", "", "Landroid/content/Context;", "context", "createVideoViewInstance", "(Landroid/content/Context;)Lru/ok/android/externcalls/sdk/ui/RendererView;", "renderView", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "decorator", "Lsbi;", "setOwnVideoParticipantView", "(Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeOwnVideoParticipantView", "(Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeParticipantView", "releaseParticipantView", "", "isMirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "rebindParticipantView", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "rebindParticipantViews", "()V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "displayLayouts", "updateDisplayLayout", "(Ljava/util/Collection;)V", "clear", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "ownVideoTrack", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ParticipantVideoViewManager<R extends RendererView> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0010\b\u0001\u0010\u0007*\u00020\u0004*\u00020\u0005*\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager$Companion;", "", "<init>", "()V", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "T", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Lsbi;", "ownCameraCallback", "", "isEarlyVideoEnabled", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "newInstance", "(Laf7;Lcf7;Laf7;Z)Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ParticipantVideoViewManager newInstance$default(Companion companion, af7 af7Var, cf7 cf7Var, af7 af7Var2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                af7Var2 = new cka(18);
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.newInstance(af7Var, cf7Var, af7Var2, z);
        }

        public final <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(af7 conversation, cf7 factory, af7 ownCameraCallback, boolean isEarlyVideoEnabled) {
            return new ParticipantVideoViewManagerImpl(conversation, factory, ownCameraCallback, isEarlyVideoEnabled);
        }
    }

    static <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(af7 af7Var, cf7 cf7Var, af7 af7Var2, boolean z) {
        return INSTANCE.newInstance(af7Var, cf7Var, af7Var2, z);
    }

    static VideoFrame setParticipantView$lambda$0(VideoFrame videoFrame) {
        return videoFrame;
    }

    default void clear() {
    }

    /* JADX INFO: renamed from: createVideoViewInstance */
    R mo135createVideoViewInstance(Context context);

    ConversationVideoTrackParticipantKey getOwnVideoTrack();

    default void rebindParticipantView(ConversationParticipant participant) {
    }

    default void rebindParticipantViews() {
    }

    default void releaseParticipantView(R renderView) {
    }

    default void removeOwnVideoParticipantView(R renderView) {
    }

    default void removeParticipantView(ConversationVideoTrackParticipantKey key, R renderView) {
    }

    default void setMirror(ConversationVideoTrackParticipantKey key, boolean isMirror) {
    }

    default void setOwnVideoParticipantView(R renderView, FrameDecorator decorator) {
    }

    default void setParticipantView(ConversationVideoTrackParticipantKey key, R renderView) {
        setParticipantView(key, renderView, new dc7(1));
    }

    default void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> displayLayouts) {
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <R extends RendererView> void clear(ParticipantVideoViewManager<R> participantVideoViewManager) {
            ParticipantVideoViewManager.super.clear();
        }

        @Deprecated
        public static <R extends RendererView> void rebindParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, ConversationParticipant conversationParticipant) {
            ParticipantVideoViewManager.super.rebindParticipantView(conversationParticipant);
        }

        @Deprecated
        public static <R extends RendererView> void rebindParticipantViews(ParticipantVideoViewManager<R> participantVideoViewManager) {
            ParticipantVideoViewManager.super.rebindParticipantViews();
        }

        @Deprecated
        public static <R extends RendererView> void releaseParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, R r) {
            ParticipantVideoViewManager.super.releaseParticipantView(r);
        }

        @Deprecated
        public static <R extends RendererView> void removeOwnVideoParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, R r) {
            ParticipantVideoViewManager.super.removeOwnVideoParticipantView(r);
        }

        @Deprecated
        public static <R extends RendererView> void removeParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
            ParticipantVideoViewManager.super.removeParticipantView(conversationVideoTrackParticipantKey, r);
        }

        @Deprecated
        public static <R extends RendererView> void setMirror(ParticipantVideoViewManager<R> participantVideoViewManager, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
            ParticipantVideoViewManager.super.setMirror(conversationVideoTrackParticipantKey, z);
        }

        @Deprecated
        public static <R extends RendererView> void setOwnVideoParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, R r, FrameDecorator frameDecorator) {
            ParticipantVideoViewManager.super.setOwnVideoParticipantView(r, frameDecorator);
        }

        @Deprecated
        public static <R extends RendererView> void setParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
            ParticipantVideoViewManager.super.setParticipantView(conversationVideoTrackParticipantKey, r);
        }

        @Deprecated
        public static <R extends RendererView> void updateDisplayLayout(ParticipantVideoViewManager<R> participantVideoViewManager, Collection<ConversationDisplayLayoutItem> collection) {
            ParticipantVideoViewManager.super.updateDisplayLayout(collection);
        }

        @Deprecated
        public static <R extends RendererView> void setParticipantView(ParticipantVideoViewManager<R> participantVideoViewManager, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r, FrameDecorator frameDecorator) {
            ParticipantVideoViewManager.super.setParticipantView(conversationVideoTrackParticipantKey, r, frameDecorator);
        }
    }

    default void setParticipantView(ConversationVideoTrackParticipantKey key, R renderView, FrameDecorator decorator) {
    }
}
