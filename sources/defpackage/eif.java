package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class eif implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final rda c = new rda(12, this);
    public int d = 1;
    public long e = 0;

    public eif(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.e;
                kye kyeVar = new kye(runnable, 2);
                this.a.add(kyeVar);
                this.d = 2;
                try {
                    this.b.execute(this.c);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.e == j && this.d == 2) {
                                this.d = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            int i2 = this.d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.a.removeLastOccurrence(kyeVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.a.add(runnable);
        }
    }
}
