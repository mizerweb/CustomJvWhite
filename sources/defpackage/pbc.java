package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class pbc implements ThreadFactory {
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final xh d;
    public final AtomicInteger e = new AtomicInteger(1);

    public pbc(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, xh xhVar, e5h e5hVar) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.d = xhVar;
        new ifh(new yxb(5));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        obc obcVar = new obc(runnable, qt4.j(this.e.getAndIncrement(), this.a, "-"));
        obcVar.setUncaughtExceptionHandler(this.b);
        obcVar.setPriority(this.c);
        obcVar.b = this.d;
        return obcVar;
    }
}
