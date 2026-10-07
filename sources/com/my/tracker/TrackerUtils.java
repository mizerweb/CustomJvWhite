package com.my.tracker;

import android.app.Service;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.o.e0;
import com.my.tracker.core.o.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class TrackerUtils {
    public static Map<String, String> copyParams(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public static boolean paramsAreIncorrect(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (stringIsLong(key)) {
                Tracer.e("param key name is too long: " + key);
                return true;
            }
            String value = entry.getValue();
            if (stringIsLong(value)) {
                Tracer.e("param value '" + key + "' is too long: " + value);
                return true;
            }
        }
        return false;
    }

    public static void runOnAnyBackground(Runnable runnable) {
        Executor executorA = g.a();
        if (executorA == null) {
            new Thread(runnable).start();
        } else {
            executorA.execute(runnable);
        }
    }

    public static void saveReferrerIfRequired(String str, Service service) {
        try {
            e0.a(service).d(str);
        } catch (Throwable th) {
            Tracer.d("PrefsCache error: ", th);
        }
    }

    public static boolean stringIsLong(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        Tracer.e("TrackerUtils error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }
}
