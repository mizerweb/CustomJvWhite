package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eyl {
    public static boolean b(kg2 kg2Var) {
        Boolean bool;
        try {
            bool = (Boolean) ((qb2) kg2Var.b).c(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (uk5.a(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && tvj.f(5, "CXCP")) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public abstract CharSequence a();
}
