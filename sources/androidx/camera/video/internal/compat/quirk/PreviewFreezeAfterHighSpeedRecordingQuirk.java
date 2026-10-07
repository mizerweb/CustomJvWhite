package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.o2e;
import defpackage.z5h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Lo2e;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements o2e {
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk a = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    public static final boolean b;

    static {
        b = z5h.G0(Build.BRAND, "google", true) && z5h.K0(Build.MODEL, "Pixel", true);
    }
}
