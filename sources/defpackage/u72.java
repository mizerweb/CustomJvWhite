package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class u72 implements e89 {
    public final WeakReference a;
    public final t72 b = new t72(this);

    public u72(r72 r72Var) {
        this.a = new WeakReference(r72Var);
    }

    @Override // defpackage.e89
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    public final boolean c(Throwable th) {
        return this.b.r(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        r72 r72Var = (r72) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && r72Var != null) {
            r72Var.a = null;
            r72Var.b = null;
            r72Var.c.q(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof s3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
