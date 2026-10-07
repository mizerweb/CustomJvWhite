package defpackage;

import java.util.Random;
import org.webrtc.BitrateAdjuster;
import org.webrtc.BitrateAdjusterFactory;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecMimeType;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class foc implements BitrateAdjusterFactory {
    public float a;
    public final Object b;

    public foc() {
        this.b = new Random(System.currentTimeMillis());
        this.a = 0.0f;
    }

    @Override // org.webrtc.BitrateAdjusterFactory
    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        BitrateAdjuster bitrateAdjusterCreateBitrateAdjuster = HardwareVideoEncoderFactory.defaultBitrateAdjusterFactory.createBitrateAdjuster(videoCodecMimeType, str);
        bitrateAdjusterCreateBitrateAdjuster.getClass();
        return videoCodecMimeType == VideoCodecMimeType.H265 ? new goc(bitrateAdjusterCreateBitrateAdjuster, this.a, (CidLogger) this.b) : bitrateAdjusterCreateBitrateAdjuster;
    }

    public foc(float f, CidLogger cidLogger) {
        this.a = f;
        this.b = cidLogger;
    }
}
