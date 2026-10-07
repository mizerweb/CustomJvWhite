package defpackage;

import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class spb implements VideoDecoder {
    public final VideoDecoder a;
    public final CidLogger b;

    public spb(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, CidLogger cidLogger) {
        this.a = videoDecoder;
        this.b = cidLogger;
        cidLogger.log("VideoDecoderLifecycleLogger", "createDecoder(" + getImplementationName() + "), codec: " + videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoder
    public final long createNative(long j) {
        try {
            return this.a.createNative(j);
        } catch (Throwable th) {
            this.b.reportException("VideoDecoderLifecycleLogger", "Decoder createNative failed", new IllegalStateException("Error on decoder createNative", th));
            return 0L;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        try {
            VideoCodecStatus videoCodecStatusDecode = this.a.decode(encodedImage, decodeInfo, j);
            videoCodecStatusDecode.getClass();
            return videoCodecStatusDecode;
        } catch (Throwable unused) {
            return VideoCodecStatus.ERROR;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        try {
            VideoDecoder videoDecoder = this.a;
            String implementationName = videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallVideoDecoderFallbackback" : videoDecoder.getImplementationName();
            implementationName.getClass();
            return implementationName;
        } catch (Throwable unused) {
            return "VideoDecoderLifecycleLogger";
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        String str = "initDecode(cores=" + (settings != null ? Integer.valueOf(settings.numberOfCores) : null) + ", size=" + (settings != null ? Integer.valueOf(settings.width) : null) + "x" + (settings != null ? Integer.valueOf(settings.height) : null) + ")";
        CidLogger cidLogger = this.b;
        cidLogger.log("VideoDecoderLifecycleLogger", str);
        try {
            VideoCodecStatus videoCodecStatusInitDecode = this.a.initDecode(settings, callback);
            videoCodecStatusInitDecode.getClass();
            return videoCodecStatusInitDecode;
        } catch (Throwable th) {
            cidLogger.reportException("VideoDecoderLifecycleLogger", "Decoder init failed", new IllegalStateException("Error on init decoder", th));
            return VideoCodecStatus.ERROR;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        CidLogger cidLogger = this.b;
        cidLogger.log("VideoDecoderLifecycleLogger", "release()");
        try {
            VideoCodecStatus videoCodecStatusRelease = this.a.release();
            videoCodecStatusRelease.getClass();
            return videoCodecStatusRelease;
        } catch (Throwable th) {
            cidLogger.reportException("VideoDecoderLifecycleLogger", "Decoder release failed", new IllegalStateException("Error on release decoder", th));
            return VideoCodecStatus.ERROR;
        }
    }
}
