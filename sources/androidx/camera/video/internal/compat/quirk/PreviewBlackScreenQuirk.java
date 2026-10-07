package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.z5h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean a;
    public static final boolean b;

    static {
        String str = Build.BRAND;
        a = z5h.G0(str, "motorola", true) && z5h.G0(Build.MODEL, "motorola edge 20 fusion", true);
        b = z5h.G0(str, "samsung", true) && z5h.G0(Build.MODEL, "sm-t580", true);
    }
}
