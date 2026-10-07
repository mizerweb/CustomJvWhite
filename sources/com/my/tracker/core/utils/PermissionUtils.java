package com.my.tracker.core.utils;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionUtils {
    public static final boolean IS_LIGHT_SENSOR_AVAILABLE;
    public static final boolean IS_PROXIMITY_SENSOR_AVAILABLE;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        IS_LIGHT_SENSOR_AVAILABLE = i <= 30;
        if (i <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z = true;
        }
        IS_PROXIMITY_SENSOR_AVAILABLE = z;
    }

    public static boolean checkPermission(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean isManufacturerAskPermissionUnusual() {
        return false;
    }
}
