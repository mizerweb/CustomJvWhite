package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import defpackage.o2e;
import defpackage.z5h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/PreviewUnderExposureQuirk;", "Lo2e;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewUnderExposureQuirk implements o2e {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = z5h.G0(Build.BRAND, "TCL", true);
}
