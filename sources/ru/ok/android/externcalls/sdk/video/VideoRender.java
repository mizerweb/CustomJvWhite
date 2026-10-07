package ru.ok.android.externcalls.sdk.video;

import defpackage.j95;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.ui.RendererView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001e*\u000e\b\u0000\u0010\u0003 \u0000*\u00020\u0001*\u00020\u00022\u00020\u0004:\u0001\u001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "T", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "", "contains", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;)Z", "render", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)Z", "Lsbi;", "addDelegate", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)V", "removeDelegate", "mirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "clear", "", "asOkVideoSink", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;)Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "delegates", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoRender<T extends VideoSink & RendererView> {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "VideoRender";
    private final ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> delegates = new ConcurrentHashMap<>();

    public final void addDelegate(ConversationVideoTrackParticipantKey key, T render) {
        List<T> listPutIfAbsent;
        if (contains(key, render)) {
            return;
        }
        GlobalRTCLogger.log(LOG_TAG, "adding " + render + " to " + key);
        ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> concurrentHashMap = this.delegates;
        List<T> copyOnWriteArrayList = concurrentHashMap.get(key);
        if (copyOnWriteArrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(key, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = listPutIfAbsent;
        }
        copyOnWriteArrayList.add(render);
    }

    public final List<VideoSink> asOkVideoSink(ConversationVideoTrackParticipantKey key) {
        return Collections.singletonList(new VideoSinkWrapper(key, this.delegates));
    }

    public final void clear() {
        Iterator<T> it = this.delegates.values().iterator();
        while (it.hasNext()) {
            ((List) it.next()).clear();
        }
        this.delegates.clear();
    }

    public final boolean contains(ConversationVideoTrackParticipantKey key) {
        List<T> list = this.delegates.get(key);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void removeDelegate(ConversationVideoTrackParticipantKey key, T render) {
        GlobalRTCLogger.log(LOG_TAG, "removing " + render + " from " + key);
        List<T> list = this.delegates.get(key);
        if (list != null) {
            list.remove(render);
        }
    }

    public final void setMirror(ConversationVideoTrackParticipantKey key, boolean mirror) {
        List<T> list = this.delegates.get(key);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RendererView) ((VideoSink) it.next())).setMirror(mirror);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean contains(ConversationVideoTrackParticipantKey key, T render) {
        List<T> list = this.delegates.get(key);
        return list != null && list.contains(render);
    }
}
