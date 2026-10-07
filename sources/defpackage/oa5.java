package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class oa5 extends sc6 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final oa5 l;
    public static final long m;

    static {
        Long l2;
        oa5 oa5Var = new oa5();
        l = oa5Var;
        oa5Var.U0(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        m = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // defpackage.sc6
    public final void Z0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Z0(runnable);
    }

    @Override // defpackage.sc6
    public final Thread d1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(oa5.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.sc6
    public final void f1(long j, qc6 qc6Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void l1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            h1();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        qqh.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    l1();
                    if (e1()) {
                        return;
                    }
                    d1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV0 = V0();
                    if (jV0 == BuildConfig.MAX_TIME_TO_UPLOAD) {
                        long jNanoTime = System.nanoTime();
                        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            j = m + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            l1();
                            if (e1()) {
                                return;
                            }
                            d1();
                            return;
                        }
                        if (jV0 > j2) {
                            jV0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            l1();
                            if (e1()) {
                                return;
                            }
                            d1();
                            return;
                        }
                        LockSupport.parkNanos(this, jV0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            l1();
            if (!e1()) {
                d1();
            }
            throw th;
        }
    }

    @Override // defpackage.sc6, defpackage.nc6
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.sc6, defpackage.jg5
    public final no5 t0(long j, Runnable runnable, vt4 vt4Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? BuildConfig.MAX_TIME_TO_UPLOAD : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return dib.a;
        }
        long jNanoTime = System.nanoTime();
        pc6 pc6Var = new pc6(runnable, j2 + jNanoTime);
        i1(jNanoTime, pc6Var);
        return pc6Var;
    }

    @Override // defpackage.xt4
    public final String toString() {
        return "DefaultExecutor";
    }
}
