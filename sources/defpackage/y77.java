package defpackage;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class y77 extends ForkJoinTask {
    public final w77 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c;
    public volatile Throwable d;

    public y77(String str, w77 w77Var) {
        this.a = w77Var;
        this.c = new AtomicReference(str);
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final boolean exec() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        try {
            this.a.run();
            return true;
        } catch (Throwable th) {
            this.d = th;
            throw th;
        }
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return this.c.get();
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        this.c.set(obj);
    }
}
