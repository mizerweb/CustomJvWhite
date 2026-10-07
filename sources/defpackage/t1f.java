package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class t1f extends r0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = r0.c;
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.b = null;
        }
    }
}
