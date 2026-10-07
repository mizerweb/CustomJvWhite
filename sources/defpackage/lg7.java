package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lg7 implements e89 {
    public final e89 a;
    public r72 b;

    public lg7() {
        this.a = f55.m(new i1m(this));
    }

    public static lg7 c(e89 e89Var) {
        return e89Var instanceof lg7 ? (lg7) e89Var : new lg7(e89Var);
    }

    @Override // defpackage.e89
    public final void b(Runnable runnable, Executor executor) {
        this.a.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public lg7(e89 e89Var) {
        e89Var.getClass();
        this.a = e89Var;
    }
}
