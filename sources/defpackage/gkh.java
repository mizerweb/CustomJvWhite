package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class gkh {
    private boolean b;
    private final Object a = new Object();
    private final Queue c = new ArrayDeque();
    private final AtomicReference d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        synchronized (this.a) {
            try {
                if (this.c.isEmpty()) {
                    this.b = false;
                } else {
                    e9m e9mVar = (e9m) this.c.remove();
                    f(e9mVar.a, e9mVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: u6m
                @Override // java.lang.Runnable
                public final void run() {
                    tbm tbmVar = new tbm(this.a, null);
                    try {
                        runnable.run();
                        tbmVar.close();
                    } catch (Throwable th) {
                        try {
                            tbmVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            e();
        }
    }

    public void a() {
        yab.v(Thread.currentThread().equals(this.d.get()));
    }

    public void b(Executor executor, Runnable runnable) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    this.c.add(new e9m(executor, runnable, null));
                } else {
                    this.b = true;
                    f(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
