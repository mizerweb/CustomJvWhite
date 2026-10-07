package com.my.tracker.core;

import android.util.Log;
import com.my.tracker.MyTrackerConfig;

/* JADX INFO: loaded from: classes.dex */
public final class Tracer {
    private static volatile boolean a;
    private static volatile MyTrackerConfig.Logger b;

    public static void d(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            logger.log(3, str != null ? str : "", null);
        }
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    public static void e(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            logger.log(6, str != null ? str : "", null);
        }
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void i(String str) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            logger.log(4, str != null ? str : "", null);
        }
        if (Log.isLoggable("[myTracker]", 4)) {
            if (str == null) {
                str = "null";
            }
            Log.i("[myTracker]", str);
        }
    }

    public static boolean isEnabled() {
        return a;
    }

    public static void setEnabled(boolean z) {
        a = z;
    }

    public static void setLogger(MyTrackerConfig.Logger logger) {
        b = logger;
    }

    public static void d(String str, Throwable th) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            logger.log(3, str != null ? str : "", th);
        }
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th);
        }
    }

    public static void e(String str, Throwable th) {
        MyTrackerConfig.Logger logger = b;
        if (logger != null) {
            logger.log(6, str != null ? str : "", th);
        }
        if (a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }
}
