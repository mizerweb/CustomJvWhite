package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c3f {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c = new AtomicReference();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    static {
        boolean zEquals;
        int i;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable th) {
            iwl.a(th);
        }
        a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx3.purge-period-seconds");
                if (property2 == null) {
                    i = 1;
                } else {
                    i = Integer.parseInt(property2);
                }
            } catch (Throwable th2) {
                iwl.a(th2);
            }
        } else {
            i = 1;
        }
        b = i;
        if (!a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new pxe("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    qn5 qn5Var = new qn5(4);
                    long j = b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(qn5Var, j, j, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
