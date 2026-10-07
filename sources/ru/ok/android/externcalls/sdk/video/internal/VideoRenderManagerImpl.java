package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.af7;
import defpackage.du1;
import defpackage.j95;
import defpackage.o91;
import defpackage.ore;
import defpackage.pg5;
import defpackage.qs1;
import defpackage.s66;
import defpackage.sb9;
import defpackage.szf;
import defpackage.v4j;
import defpackage.x52;
import defpackage.xtj;
import defpackage.yt1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010 \u001a\u001a\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J+\u0010\u001a\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u001d2\n\u0010\u001c\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R`\u00101\u001aN\u0012\b\u0012\u00060%j\u0002`&\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120/0.j&\u0012\b\u0012\u00060%j\u0002`&\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120/`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl;", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "Lpg5;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "state", "Lo91;", "call", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "conversationRenderers", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "", "isEarlyVideoEnabled", "<init>", "(Laf7;Lo91;Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Z)V", "Lx52;", "key", "", "Lorg/webrtc/VideoSink;", "renderers", "Lsbi;", "setRenderersForMe", "(Lx52;Ljava/util/List;)V", "setRenderersForOthers", SdkMetricStatEvent.VALUE_KEY, "setRenderers", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "isEnabled", "()Z", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRemoteVideoRenderers", "(Lyt1;)Ljava/util/Map;", "Laf7;", "Lo91;", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Z", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Lqs1;", "getCallRenderer", "()Lqs1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoRenderManagerImpl implements VideoRenderManager, pg5 {
    private final HashMap<yt1, Map<x52, List<VideoSink>>> cache;
    private final o91 call;
    private final ConversationRenderers conversationRenderers;
    private final boolean isEarlyVideoEnabled;
    private final af7 state;
    private final ParticipantStore store;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v4j.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoRenderManagerImpl(af7 af7Var, o91 o91Var, ConversationRenderers conversationRenderers, ParticipantStore participantStore, boolean z) {
        this.state = af7Var;
        this.call = o91Var;
        this.conversationRenderers = conversationRenderers;
        this.store = participantStore;
        this.isEarlyVideoEnabled = z;
        this.cache = new HashMap<>();
    }

    private final void setRenderersForMe(x52 key, List<? extends VideoSink> renderers) {
        int iOrdinal = key.a.ordinal();
        if (iOrdinal == 0) {
            o91 o91Var = this.call;
            List<? extends VideoSink> list = renderers;
            VideoSink videoSink = (list == null || list.isEmpty()) ? null : renderers.get(0);
            if (o91Var.q()) {
                szf szfVar = o91Var.f0;
                szfVar.p = videoSink;
                sb9 sb9Var = szfVar.o;
                if (sb9Var != null) {
                    sb9Var.j(videoSink);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                o91 o91Var2 = this.call;
                yt1 yt1Var = o91Var2.j0.a.a;
                if (yt1Var == null) {
                    return;
                }
                xtj xtjVar = new xtj(4);
                xtjVar.b = yt1Var;
                xtjVar.c = v4j.c;
                o91Var2.x0.b(xtjVar.p(), renderers);
                return;
            }
            if (iOrdinal != 3 && iOrdinal != 4) {
                ore.o();
                return;
            }
            setRenderers(key, renderers);
            o91 o91Var3 = this.call;
            if (o91Var3.q()) {
                o91Var3.n0.V(key, renderers);
                o91Var3.x0.b(key, renderers);
            }
        }
    }

    private final void setRenderersForOthers(x52 key, List<? extends VideoSink> renderers) {
        setRenderers(key, renderers);
        o91 o91Var = this.call;
        if (o91Var.q()) {
            o91Var.n0.V(key, renderers);
            o91Var.x0.b(key, renderers);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public qs1 getCallRenderer() {
        if (this.state.invoke() != Conversation.State.Finished) {
            return this.call.s;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public EglBase.Context getEglBaseContext() {
        if (this.call.r == null || this.state.invoke() == Conversation.State.Finished) {
            return null;
        }
        return this.call.r.getEglBaseContext();
    }

    @Override // defpackage.pg5
    public Map<x52, List<VideoSink>> getRemoteVideoRenderers(yt1 participantId) {
        Map<x52, List<VideoSink>> map = this.cache.get(participantId);
        return map == null ? s66.a : map;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        return this.conversationRenderers.getRenderers(participantId);
    }

    public boolean isEnabled() {
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public void setRenderers(ConversationVideoTrackParticipantKey key, List<? extends VideoSink> renderers) {
        ConversationParticipant conversationParticipant = this.store.get(key.getParticipantId());
        if (conversationParticipant == null) {
            return;
        }
        boolean z = conversationParticipant == this.store.getMe() && key.getType() == v4j.a;
        if (conversationParticipant.isUseable() || (this.isEarlyVideoEnabled && z)) {
            du1 callParticipant = conversationParticipant.getCallParticipant();
            VideoSink videoSink = null;
            yt1 yt1Var = callParticipant != null ? callParticipant.a : null;
            if (yt1Var != null) {
                xtj xtjVar = new xtj(4);
                xtjVar.c = key.getType();
                xtjVar.b = yt1Var;
                xtjVar.d = key.getMovieId();
                x52 x52VarP = xtjVar.p();
                this.conversationRenderers.setRenderers(key, renderers);
                if (conversationParticipant == this.store.getMe()) {
                    setRenderersForMe(x52VarP, renderers);
                    return;
                } else {
                    setRenderersForOthers(x52VarP, renderers);
                    return;
                }
            }
            if (this.isEarlyVideoEnabled && z) {
                o91 o91Var = this.call;
                List<? extends VideoSink> list = renderers;
                if (list != null && !list.isEmpty()) {
                    videoSink = renderers.get(0);
                }
                if (o91Var.q()) {
                    szf szfVar = o91Var.f0;
                    szfVar.p = videoSink;
                    sb9 sb9Var = szfVar.o;
                    if (sb9Var != null) {
                        sb9Var.j(videoSink);
                    }
                }
            }
        }
    }

    public /* synthetic */ VideoRenderManagerImpl(af7 af7Var, o91 o91Var, ConversationRenderers conversationRenderers, ParticipantStore participantStore, boolean z, int i, j95 j95Var) {
        this(af7Var, o91Var, conversationRenderers, participantStore, (i & 16) != 0 ? false : z);
    }

    private final void setRenderers(x52 key, List<? extends VideoSink> value) {
        HashMap<yt1, Map<x52, List<VideoSink>>> map = this.cache;
        yt1 yt1Var = key.b;
        Map<x52, List<VideoSink>> map2 = map.get(yt1Var);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(yt1Var, map2);
        }
        map2.put(key, value);
    }
}
