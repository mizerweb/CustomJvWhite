package com.my.tracker.core.o;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.SystemUtils;
import defpackage.np0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    private static final Integer a = 1;

    public static void a(Application application) {
        if (Tracer.isEnabled()) {
            Tracer.d("LoggingHandler: tracing has already been enabled");
            return;
        }
        if (b(application)) {
            Tracer.setEnabled(true);
            Tracer.d("LoggingHandler: debug mode is enabled by device name");
            return;
        }
        if (a.equals((Integer) a(application, "com.my.tracker.debugMode", Integer.class))) {
            Tracer.setEnabled(true);
            Tracer.d("LoggingHandler: debug mode is enabled by manifest metadata");
        } else if (c(application)) {
            Tracer.setEnabled(true);
            Tracer.d("LoggingHandler: debug mode is enabled by system properties");
        }
    }

    private static boolean b(Application application) {
        ContentResolver contentResolver = application.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            Tracer.e("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            Tracer.e("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            Tracer.e("LoggingHandler: case 2 failure");
            return false;
        }
    }

    private static boolean c(Application application) {
        if (String.valueOf(a).equals(SystemUtils.getValueFromSystemProperties(application.getPackageName() + "_mytracker_debug"))) {
            Tracer.d("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        Tracer.d("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static Object a(Application application, String str, Class cls) {
        try {
            return cls.cast(application.getPackageManager().getApplicationInfo(application.getPackageName(), np0.m).metaData.get(str));
        } catch (Throwable th) {
            Tracer.d("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }
}
