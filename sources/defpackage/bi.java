package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bi {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b = Executors.defaultThreadFactory();

    public static ScheduledExecutorService a(yh yhVar, int i) {
        if (i > 0) {
            return Executors.newScheduledThreadPool(i, yhVar);
        }
        c.o(c0a.k(i, "Threads (", ") must be > 0"));
        return null;
    }
}
