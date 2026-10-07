package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uk8 extends AtomicReference implements Runnable {
    public static final qn5 a;
    public static final qn5 b;

    static {
        int i = 3;
        a = new qn5(i);
        b = new qn5(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        qn5 qn5Var = b;
        qn5 qn5Var2 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            tk8 tk8Var = new tk8(this);
            tk8.a(tk8Var, Thread.currentThread());
            if (compareAndSet(runnable, tk8Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(qn5Var2)) == qn5Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        tk8 tk8Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof tk8;
            qn5 qn5Var = b;
            if (!z2 && runnable != qn5Var) {
                break;
            }
            if (z2) {
                tk8Var = (tk8) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == qn5Var || compareAndSet(runnable, qn5Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(tk8Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            qn5 qn5Var = a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, qn5Var)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, qn5Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, qn5Var)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof tk8) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbZ = zo5.z(str, ", ");
        sbZ.append(f());
        return sbZ.toString();
    }
}
