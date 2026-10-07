package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class j5i extends h17 implements RunnableFuture {
    public volatile i5i h;

    public j5i(Callable callable) {
        this.h = new i5i(this, callable);
    }

    public static j5i r(Runnable runnable, Object obj) {
        return new j5i(Executors.callable(runnable, obj));
    }

    public static j5i s(Callable callable) {
        return new j5i(callable);
    }

    @Override // defpackage.o1
    public final void d() {
        i5i i5iVar;
        if (q() && (i5iVar = this.h) != null) {
            i5iVar.c();
        }
        this.h = null;
    }

    @Override // defpackage.o1
    public final String k() {
        i5i i5iVar = this.h;
        if (i5iVar == null) {
            return super.k();
        }
        return "task=[" + i5iVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        i5i i5iVar = this.h;
        if (i5iVar != null) {
            i5iVar.run();
        }
        this.h = null;
    }
}
