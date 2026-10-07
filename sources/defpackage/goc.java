package defpackage;

import org.webrtc.BitrateAdjuster;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class goc implements BitrateAdjuster {
    public final BitrateAdjuster a;
    public final float b;
    public final CidLogger c;
    public int d;

    public goc(BitrateAdjuster bitrateAdjuster, float f, CidLogger cidLogger) {
        this.a = bitrateAdjuster;
        this.b = f;
        this.c = cidLogger;
    }

    @Override // org.webrtc.BitrateAdjuster
    public final int getAdjustedBitrateBps() {
        int adjustedBitrateBps = this.a.getAdjustedBitrateBps();
        int iK = gm0.K(adjustedBitrateBps * this.b);
        if (this.d != iK) {
            this.d = iK;
            this.c.log("PatchedVideoEncoderFactory", qt4.l("Adjust bitrate for H265 encoder ", adjustedBitrateBps, iK, "->"));
        }
        return iK;
    }

    @Override // org.webrtc.BitrateAdjuster
    public final double getAdjustedFramerateFps() {
        return this.a.getAdjustedFramerateFps();
    }

    @Override // org.webrtc.BitrateAdjuster
    public final void reportEncodedFrame(int i) {
        this.a.reportEncodedFrame(i);
    }

    @Override // org.webrtc.BitrateAdjuster
    public final void setTargets(int i, double d) {
        this.a.setTargets(i, d);
    }
}
