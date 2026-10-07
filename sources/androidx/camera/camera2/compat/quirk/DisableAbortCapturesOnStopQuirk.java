package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import defpackage.o2e;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "Lo2e;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisableAbortCapturesOnStopQuirk implements o2e {
    public static final boolean a;
    public static final boolean b;

    static {
        String str = Build.MANUFACTURER;
        boolean z = false;
        a = (str.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "d2q".equalsIgnoreCase(Build.DEVICE);
        if ((str.equalsIgnoreCase("Poco") || Build.BRAND.equalsIgnoreCase("Poco")) && "M2102J20SG".equalsIgnoreCase(Build.MODEL)) {
            z = true;
        }
        b = z;
    }
}
