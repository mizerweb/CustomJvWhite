package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class h3l implements e4l {
    private static final b4l b = new b4l(h3l.class);
    private final Object a;

    public h3l(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.e4l
    public final void a(Runnable runnable, Executor executor) {
        vpk.c(executor, "Executor was null.");
        try {
            runnable.run();
        } catch (Exception e) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", qv1.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return nbh.v(super.toString(), "[status=SUCCESS, result=[", this.a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
