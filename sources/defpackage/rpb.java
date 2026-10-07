package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class rpb implements VideoDecoderFactory {
    public rpb(CidLogger cidLogger, IllegalStateException illegalStateException) {
        cidLogger.reportException("OKDefaultVideoDecoderFactory", "Video decoder factory init failed", illegalStateException);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return null;
    }
}
