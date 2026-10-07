package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
abstract class y3l extends AtomicReference implements Runnable {
    private static final Runnable a = new u3l(null);
    private static final Runnable b = new u3l(null);

    private final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        o3l o3lVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof o3l)) {
                if (runnable != b) {
                    break;
                }
            } else {
                o3lVar = (o3l) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(o3lVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object a() throws Exception;

    public abstract String b();

    public abstract void c(Throwable th);

    public abstract void d(Object obj);

    public final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            o3l o3lVar = new o3l(this, null);
            o3lVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, o3lVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(a)) == b) {
                    }
                } finally {
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, a)) {
                            g(threadCurrentThread);
                        }
                        c(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, a)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, a)) {
                g(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            d(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strO;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            strO = "running=[DONE]";
        } else if (runnable instanceof o3l) {
            strO = "running=[INTERRUPTED]";
        } else {
            strO = runnable instanceof Thread ? c0a.o("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return zo5.p(strO, ", ", b());
    }
}
