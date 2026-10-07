package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class l0b extends ipk {
    private static final ThreadLocal b = new ThreadLocal();
    private final ThreadPoolExecutor a;

    public l0b() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: mil
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: ull
                    @Override // java.lang.Runnable
                    public final void run() {
                        l0b.E(runnable);
                    }
                });
            }
        });
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void E(Runnable runnable) {
        b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Deque deque, Runnable runnable) {
        yab.s(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) b.get();
        if (deque == null || deque.size() > 1) {
            this.a.execute(new Runnable() { // from class: hfl
                @Override // java.lang.Runnable
                public final void run() {
                    l0b.I((Deque) l0b.b.get(), runnable);
                }
            });
        } else {
            I(deque, runnable);
        }
    }

    @Override // defpackage.pbm
    public final /* synthetic */ Object l() {
        return this.a;
    }

    @Override // defpackage.ipk
    public final ExecutorService y() {
        return this.a;
    }
}
