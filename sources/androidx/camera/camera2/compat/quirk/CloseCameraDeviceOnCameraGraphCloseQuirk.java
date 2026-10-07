package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import defpackage.cqk;
import defpackage.o2e;
import defpackage.xw3;
import defpackage.z5h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Lo2e;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements o2e {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Code duplicated, block: B:25:0x0089 A[EDGE_INSN: B:25:0x0089->B:26:0x008a BREAK  A[LOOP:0: B:20:0x0073->B:39:?]] */
    static {
        boolean z;
        int i;
        String str = Build.HARDWARE;
        a = cqk.d(str, "samsungexynos7570");
        b = cqk.d(str, "samsungexynos7870");
        String str2 = Build.MANUFACTURER;
        boolean z2 = false;
        c = (str2.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) && a.N0(new String[]{"aurora", "houji"}, Build.DEVICE.toLowerCase(Locale.ROOT));
        if (!str2.equalsIgnoreCase("Sony") && !Build.BRAND.equalsIgnoreCase("Sony")) {
            z = false;
            break;
        }
        List listP0 = xw3.P0("XQ-DQ", "SO", "A301SO");
        if (!(listP0 instanceof Collection) || !listP0.isEmpty()) {
            Iterator it = listP0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (z5h.K0(Build.DEVICE, (String) it.next(), true)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        d = z;
        if ((Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && (i = Build.VERSION.SDK_INT) >= 31 && i <= 34) {
            z2 = true;
        }
        e = z2;
    }
}
