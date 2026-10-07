package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
public final class cwi extends n86 implements awi {
    public static final bwi c = new bwi();
    public final MediaCodecInfo.VideoCapabilities b;

    public cwi(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        this.b = ((MediaCodecInfo.CodecCapabilities) this.a).getVideoCapabilities();
    }

    @Override // defpackage.awi
    public final boolean a() {
        return true;
    }

    @Override // defpackage.awi
    public final Range b(int i) {
        try {
            return this.b.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            IllegalArgumentException illegalArgumentException = th instanceof IllegalArgumentException ? th : null;
            if (illegalArgumentException == null) {
                throw new IllegalArgumentException(th);
            }
            throw illegalArgumentException;
        }
    }

    @Override // defpackage.awi
    public final int d() {
        return this.b.getHeightAlignment();
    }

    @Override // defpackage.awi
    public final boolean e(int i, int i2) {
        return this.b.isSizeSupported(i, i2);
    }

    @Override // defpackage.awi
    public final int g() {
        return this.b.getWidthAlignment();
    }

    @Override // defpackage.awi
    public final Range h() {
        return this.b.getBitrateRange();
    }

    @Override // defpackage.awi
    public final Range i(int i) {
        try {
            return this.b.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            IllegalArgumentException illegalArgumentException = th instanceof IllegalArgumentException ? th : null;
            if (illegalArgumentException == null) {
                throw new IllegalArgumentException(th);
            }
            throw illegalArgumentException;
        }
    }

    @Override // defpackage.awi
    public final Range j() {
        return this.b.getSupportedWidths();
    }

    @Override // defpackage.awi
    public final Range k() {
        return this.b.getSupportedHeights();
    }
}
