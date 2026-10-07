package defpackage;

import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class ykh {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final xvc f;

    static {
        String property;
        int i = agh.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = oc9.c0(100000L, 1L, BuildConfig.MAX_TIME_TO_UPLOAD, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = agh.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = oc9.d0(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = oc9.d0(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(oc9.c0(60L, 1L, BuildConfig.MAX_TIME_TO_UPLOAD, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = xvc.j;
    }
}
