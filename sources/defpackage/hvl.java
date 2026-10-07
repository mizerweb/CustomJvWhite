package defpackage;

import android.app.job.JobInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.net.NetworkRequest;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvl {
    public static b1k a(bg2 bg2Var) {
        int i = Build.VERSION.SDK_INT;
        b1k b1kVar = null;
        if (i >= 33) {
            DynamicRangeProfiles dynamicRangeProfilesI = jx5.i(((qb2) bg2Var).c(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES));
            if (dynamicRangeProfilesI != null) {
                if (i < 33) {
                    ore.c(c0a.k(i, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                b1kVar = new b1k(13, new lx5(dynamicRangeProfilesI));
            }
        }
        return b1kVar == null ? mx5.a : b1kVar;
    }

    public static final void b(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }
}
