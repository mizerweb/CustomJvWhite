package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wz0 {
    public static final wz0 d = new wz0();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final c20 c;

    public wz0() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains("android")) {
            sg sgVar = sg.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(sg.c, sg.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.a = executorServiceNewCachedThreadPool;
        this.b = Executors.newSingleThreadScheduledExecutor();
        c20 c20Var = new c20(1);
        c20Var.b = new ThreadLocal();
        this.c = c20Var;
    }
}
