package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class hoc implements VideoEncoderFactory {
    public hoc(CidLogger cidLogger, IllegalStateException illegalStateException) {
        cidLogger.reportException("PatchedVideoEncoderFactory", "Video encoder factory init failed", illegalStateException);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}
