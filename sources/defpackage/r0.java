package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 extends AtomicReference implements ko5 {
    public static final FutureTask c;
    public static final FutureTask d;
    public final Runnable a;
    public Thread b;

    static {
        qn5 qn5Var = vm9.c;
        c = new FutureTask(qn5Var, null);
        d = new FutureTask(qn5Var, null);
    }

    public r0(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.ko5
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.b != Thread.currentThread());
    }
}
