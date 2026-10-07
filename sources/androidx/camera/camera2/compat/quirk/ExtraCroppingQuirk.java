package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import defpackage.cxl;
import defpackage.o2e;
import defpackage.sbh;
import defpackage.wm9;
import defpackage.ylc;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Lo2e;", "cxl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements o2e {
    public static final LinkedHashMap a = wm9.S0(new ylc("SM-T580", null), new ylc("SM-J710MN", new Range(21, 26)), new ylc("SM-A320FL", null), new ylc("SM-G570M", null), new ylc("SM-G610F", null), new ylc("SM-G610M", new Range(21, 26)));

    public static Size e(sbh sbhVar) {
        if (!cxl.a()) {
            return null;
        }
        int iOrdinal = sbhVar.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
