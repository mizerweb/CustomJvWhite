package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class kzh extends y2f {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean d;

    @Override // defpackage.y2f
    public final ko5 a(Runnable runnable) {
        return d(runnable, System.currentTimeMillis());
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + System.currentTimeMillis();
        return d(new xig(runnable, this, millis), millis);
    }

    public final ko5 d(Runnable runnable, long j) {
        l66 l66Var = l66.a;
        if (!this.d) {
            jzh jzhVar = new jzh(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(jzhVar);
            if (this.b.getAndIncrement() != 0) {
                return new j66(new ng7((Object) this, (Object) jzhVar, false, 29));
            }
            int iAddAndGet = 1;
            while (true) {
                boolean z = this.d;
                PriorityBlockingQueue priorityBlockingQueue = this.a;
                if (z) {
                    priorityBlockingQueue.clear();
                    return l66Var;
                }
                jzh jzhVar2 = (jzh) priorityBlockingQueue.poll();
                if (jzhVar2 == null) {
                    iAddAndGet = this.b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!jzhVar2.d) {
                    jzhVar2.a.run();
                }
            }
        }
        return l66Var;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.d = true;
    }
}
