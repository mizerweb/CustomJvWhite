package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class cxh {
    public final Executor a;

    public cxh(final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.a = Executors.newCachedThreadPool(new ThreadFactory() { // from class: bxh
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, nbh.r(atomicInteger.getAndIncrement(), "tracer-io-", str, "-"));
            }
        });
    }
}
