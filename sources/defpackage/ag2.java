package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ag2 {
    public static final /* synthetic */ ag2 a = new ag2();
    public static final int[] b;

    static {
        HashMap map = kwa.c;
        ruk.a("androidx.camera.camera2.pipe.scalar.streamConfigurationMap", zfe.a(ci2.class));
        ruk.a("androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap", zfe.a(dg2.class));
        ruk.a("androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap", zfe.a(od2.class));
        b = new int[0];
    }

    public static boolean a(bg2 bg2Var) {
        qb2 qb2Var = (qb2) bg2Var;
        Float f = (Float) qb2Var.c(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            int[] iArr = (int[]) qb2Var.c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            if (!a.L0(1, iArr) && !a.L0(2, iArr) && !a.L0(4, iArr) && !a.L0(3, iArr)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(bg2 bg2Var) {
        Integer num = (Integer) ((qb2) bg2Var).c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
