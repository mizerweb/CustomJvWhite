package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* JADX INFO: loaded from: classes3.dex */
public final class unc implements rnc {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final VideoRender d = new VideoRender();
    public final tnc e = new tnc(6291456);
    public final ConcurrentHashMap.KeySetView f = ConcurrentHashMap.newKeySet();

    public unc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var3;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    public static snc f(p4j p4jVar) {
        return new snc(p4jVar.b.getParticipantId(), p4jVar.b.getType());
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void clear() {
        ConcurrentHashMap.KeySetView keySetView = this.f;
        Iterator it = keySetView.iterator();
        while (it.hasNext()) {
            c62 c62Var = (c62) ((qnc) it.next());
            c62Var.e(true);
            c62Var.j = null;
            c62Var.k = false;
        }
        this.d.clear();
        this.e.evictAll();
        keySetView.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* JADX INFO: renamed from: createVideoViewInstance */
    public final RendererView mo135createVideoViewInstance(Context context) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, null, 0, 6, null);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        return textureViewRenderer;
    }

    public final Conversation e() {
        return ((f9) this.b.getValue()).a();
    }

    public final ConversationVideoTrackParticipantKey g() {
        return ((x02) ((b95) this.c.getValue()).i.a.getValue()).getParticipants().getMe().a.v().b;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation conversationE = e();
        if (conversationE != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationE.getMe().getExternalId()).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        Conversation conversationE = e();
        if (conversationE != null) {
            VideoRender videoRender = this.d;
            if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.removeDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.clearImage();
                ConversationParticipant conversationParticipant = conversationE.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
                if (conversationParticipant == null || !conversationParticipant.isUseable()) {
                    return;
                }
                conversationE.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        this.e.evictAll();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        TextureViewRenderer textureViewRenderer;
        for (qnc qncVar : this.f) {
            boolean zB = ((rd1) this.a.getValue()).b();
            c62 c62Var = (c62) qncVar;
            p4j p4jVar = c62Var.l;
            if (p4jVar != null && p4jVar.c && (textureViewRenderer = c62Var.d) != null) {
                textureViewRenderer.setMirror(zB);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        this.e.evictAll();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void rebindParticipantViews() {
        Conversation conversationE = e();
        if (conversationE == null) {
            return;
        }
        for (ConversationParticipant conversationParticipant : conversationE.getParticipants()) {
            VideoRenderManager videoRenderManager = conversationE.getVideoRenderManager();
            if (conversationParticipant.isUseable()) {
                for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : videoRenderManager.getRenderers(conversationParticipant.getExternalId()).keySet()) {
                    videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, this.d.asOkVideoSink(conversationVideoTrackParticipantKey));
                }
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void releaseParticipantView(RendererView rendererView) {
        ((TextureViewRenderer) rendererView).release();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void removeOwnVideoParticipantView(RendererView rendererView) {
        removeParticipantView(g(), (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setOwnVideoParticipantView(RendererView rendererView, FrameDecorator frameDecorator) {
        setParticipantView(g(), (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, RendererView rendererView, FrameDecorator frameDecorator) {
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) rendererView;
        Conversation conversationE = e();
        if (conversationE == null || conversationVideoTrackParticipantKey == null) {
            return;
        }
        VideoRender videoRender = this.d;
        if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
            return;
        }
        videoRender.addDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
        textureViewRenderer.setMirror(cqk.d(conversationE.getMe().getExternalId(), conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == v4j.a && ((rd1) this.a.getValue()).b());
        VideoRenderManager videoRenderManager = conversationE.getVideoRenderManager();
        videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
        qs1 callRenderer = videoRenderManager.getCallRenderer();
        if (callRenderer != null) {
            RendererView.init$default(textureViewRenderer, callRenderer, null, null, 4, null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void updateDisplayLayout(Collection collection) {
        Conversation conversationE = e();
        DisplayLayoutSender displayLayoutSender = conversationE != null ? conversationE.getDisplayLayoutSender() : null;
        if (displayLayoutSender != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }
}
