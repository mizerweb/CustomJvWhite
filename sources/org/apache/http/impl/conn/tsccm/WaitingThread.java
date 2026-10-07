package org.apache.http.impl.conn.tsccm;

import defpackage.ore;
import java.util.Date;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class WaitingThread {
    private boolean aborted;
    private final Condition cond;
    private final RouteSpecificPool pool;
    private Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        if (condition == null) {
            ore.p("Condition must not be null.");
            throw null;
        }
        this.cond = condition;
        this.pool = routeSpecificPool;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean zAwaitUntil;
        if (this.waiter != null) {
            StringBuilder sb = new StringBuilder("A thread is already waiting on this object.\ncaller: ");
            sb.append(Thread.currentThread());
            Thread thread = this.waiter;
            sb.append("\nwaiter: ");
            sb.append(thread);
            throw new IllegalStateException(sb.toString());
        }
        if (this.aborted) {
            throw new InterruptedException("Operation interrupted");
        }
        this.waiter = Thread.currentThread();
        Condition condition = this.cond;
        try {
            if (date != null) {
                zAwaitUntil = condition.awaitUntil(date);
            } else {
                condition.await();
                zAwaitUntil = true;
            }
            if (this.aborted) {
                throw new InterruptedException("Operation interrupted");
            }
            this.waiter = null;
            return zAwaitUntil;
        } catch (Throwable th) {
            this.waiter = null;
            throw th;
        }
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }

    public void wakeup() {
        if (this.waiter != null) {
            this.cond.signalAll();
        } else {
            ore.k("Nobody waiting on this object.");
        }
    }
}
