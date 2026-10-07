package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface v68 extends n8e {
    public static final bh0 A0;
    public static final bh0 B0;
    public static final bh0 C0;
    public static final bh0 D0;
    public static final bh0 E0;
    public static final bh0 v0 = new bh0("camerax.core.imageOutput.targetAspectRatio", ax.class, null);
    public static final bh0 w0;
    public static final bh0 x0;
    public static final bh0 y0;
    public static final bh0 z0;

    static {
        Class cls = Integer.TYPE;
        w0 = new bh0("camerax.core.imageOutput.targetRotation", cls, null);
        x0 = new bh0("camerax.core.imageOutput.appTargetRotation", cls, null);
        y0 = new bh0("camerax.core.imageOutput.mirrorMode", cls, null);
        z0 = new bh0("camerax.core.imageOutput.targetResolution", Size.class, null);
        A0 = new bh0("camerax.core.imageOutput.defaultResolution", Size.class, null);
        B0 = new bh0("camerax.core.imageOutput.maxResolution", Size.class, null);
        C0 = new bh0("camerax.core.imageOutput.supportedResolutions", List.class, null);
        D0 = new bh0("camerax.core.imageOutput.resolutionSelector", dne.class, null);
        E0 = new bh0("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void x(v68 v68Var) {
        boolean zF = v68Var.f(v0);
        boolean z = ((Size) v68Var.b(z0, null)) != null;
        if (zF && z) {
            ore.p("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((dne) v68Var.b(D0, null)) != null) {
            if (zF || z) {
                ore.p("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int y(int i) {
        return ((Integer) b(w0, Integer.valueOf(i))).intValue();
    }
}
