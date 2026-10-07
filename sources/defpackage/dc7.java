package defpackage;

import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc7 implements FrameDecorator {
    public final /* synthetic */ int a;

    public /* synthetic */ dc7(int i) {
        this.a = i;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.FrameDecorator
    public final VideoFrame apply(VideoFrame videoFrame) {
        switch (this.a) {
            case 0:
                return FrameDecorator.Companion.EMPTY_delegate$lambda$0$0(videoFrame);
            default:
                return ParticipantVideoViewManager.setParticipantView$lambda$0(videoFrame);
        }
    }
}
