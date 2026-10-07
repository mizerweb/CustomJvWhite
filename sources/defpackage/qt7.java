package defpackage;

import java.util.concurrent.Callable;
import org.webrtc.HardwareVideoEncoderV2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qt7 implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ qt7(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return HardwareVideoEncoderV2.lambda$releaseCodecThread$1();
            default:
                return Thread.currentThread();
        }
    }
}
