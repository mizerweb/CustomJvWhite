package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface cmi extends wih, n68 {
    public static final bh0 V0 = new bh0("camerax.core.useCase.defaultSessionConfig", lmf.class, null);
    public static final bh0 W0 = new bh0("camerax.core.useCase.defaultCaptureConfig", hl2.class, null);
    public static final bh0 X0 = new bh0("camerax.core.useCase.sessionConfigUnpacker", ki2.class, null);
    public static final bh0 Y0 = new bh0("camerax.core.useCase.captureConfigUnpacker", ji2.class, null);
    public static final bh0 Z0;
    public static final bh0 a1;
    public static final bh0 b1;
    public static final bh0 c1;
    public static final bh0 d1;
    public static final bh0 e1;
    public static final bh0 f1;
    public static final bh0 g1;
    public static final bh0 h1;
    public static final bh0 i1;
    public static final bh0 j1;
    public static final bh0 k1;
    public static final bh0 l1;

    static {
        Class cls = Integer.TYPE;
        Z0 = new bh0("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        a1 = new bh0("camerax.core.useCase.sessionType", cls, null);
        b1 = new bh0("camerax.core.useCase.targetFrameRate", Range.class, null);
        c1 = new bh0("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        d1 = new bh0("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        e1 = new bh0("camerax.core.useCase.zslDisabled", cls2, null);
        f1 = new bh0("camerax.core.useCase.highResolutionDisabled", cls2, null);
        g1 = new bh0("camerax.core.useCase.captureType", emi.class, null);
        h1 = new bh0("camerax.core.useCase.previewStabilizationMode", cls, null);
        i1 = new bh0("camerax.core.useCase.videoStabilizationMode", cls, null);
        j1 = new bh0("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        k1 = new bh0("camerax.core.useCase.takePictureManagerProvider", ami.class, null);
        l1 = new bh0("camerax.core.useCase.streamUseCase", t4h.class, null);
    }

    default t4h K() {
        t4h t4hVar = (t4h) b(l1, t4h.DEFAULT);
        Objects.requireNonNull(t4hVar);
        return t4hVar;
    }

    default emi L() {
        return (emi) i(g1);
    }

    default int N(Size size) {
        Map map = (Map) b(d1, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    default int r() {
        return ((Integer) b(i1, 0)).intValue();
    }

    default int u() {
        return ((Integer) b(h1, 0)).intValue();
    }
}
