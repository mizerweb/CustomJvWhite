package defpackage;

import java.util.concurrent.Callable;
import org.webrtc.HardwareVideoEncoderV2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pt7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ HardwareVideoEncoderV2 b;

    public /* synthetic */ pt7(HardwareVideoEncoderV2 hardwareVideoEncoderV2, int i) {
        this.a = i;
        this.b = hardwareVideoEncoderV2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        HardwareVideoEncoderV2 hardwareVideoEncoderV2 = this.b;
        switch (i) {
            case 0:
                return hardwareVideoEncoderV2.lambda$updateBitrate$6();
            default:
                return hardwareVideoEncoderV2.lambda$releaseCodecThread$2();
        }
    }
}
