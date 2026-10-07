package defpackage;

import org.webrtc.EncodedImage;
import org.webrtc.HardwareVideoEncoderV2;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ot7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ HardwareVideoEncoderV2 b;
    public final /* synthetic */ EncodedImage.Builder c;
    public final /* synthetic */ VideoFrame d;
    public final /* synthetic */ long e;

    public /* synthetic */ ot7(HardwareVideoEncoderV2 hardwareVideoEncoderV2, EncodedImage.Builder builder, VideoFrame videoFrame, long j, int i) {
        this.a = i;
        this.b = hardwareVideoEncoderV2;
        this.c = builder;
        this.d = videoFrame;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.e;
        VideoFrame videoFrame = this.d;
        EncodedImage.Builder builder = this.c;
        HardwareVideoEncoderV2 hardwareVideoEncoderV2 = this.b;
        switch (i) {
            case 0:
                hardwareVideoEncoderV2.lambda$encodeByteBuffer$4(builder, videoFrame, j);
                break;
            default:
                hardwareVideoEncoderV2.lambda$encodeTextureBuffer$3(builder, videoFrame, j);
                break;
        }
    }
}
