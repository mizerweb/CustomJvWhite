package com.my.tracker.core.utils;

import android.text.TextUtils;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class SystemUtils {
    public static String getValueFromSystemProperties(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            Tracer.d("SystemUtils: value in system properties is null for " + str);
        } catch (Throwable th) {
            Tracer.d("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        return null;
    }
}
