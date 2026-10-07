package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class ud6 extends y2f implements Runnable {
    public final boolean a;
    public final Executor b;
    public volatile boolean d;
    public final AtomicInteger e = new AtomicInteger();
    public final w74 f = new w74();
    public final ih c = new ih(23);

    public ud6(Executor executor, boolean z) {
        this.b = executor;
        this.a = z;
    }

    @Override // defpackage.y2f
    public final ko5 a(Runnable runnable) {
        ko5 sd6Var;
        l66 l66Var = l66.a;
        if (this.d) {
            return l66Var;
        }
        if (this.a) {
            sd6Var = new td6(runnable, this.f);
            this.f.a(sd6Var);
        } else {
            sd6Var = new sd6(runnable);
        }
        this.c.offer(sd6Var);
        if (this.e.getAndIncrement() != 0) {
            return sd6Var;
        }
        try {
            this.b.execute(this);
            return sd6Var;
        } catch (RejectedExecutionException e) {
            this.d = true;
            this.c.clear();
            tre.s0(e);
            return l66Var;
        }
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        l66 l66Var = l66.a;
        if (j <= 0) {
            return a(runnable);
        }
        if (this.d) {
            return l66Var;
        }
        j66 j66Var = new j66(2);
        j66 j66Var2 = new j66(j66Var);
        d2f d2fVar = new d2f(new b1j(1, this, j66Var2, runnable, false), this.f);
        this.f.a(d2fVar);
        Executor executor = this.b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                d2fVar.a(((ScheduledExecutorService) executor).schedule((Callable) d2fVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.d = true;
                tre.s0(e);
                return l66Var;
            }
        } else {
            d2fVar.a(new po5(vd6.d.c(d2fVar, j, timeUnit)));
        }
        oo5.d(j66Var, d2fVar);
        return j66Var2;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f.dispose();
        if (this.e.getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih ihVar = this.c;
        int iAddAndGet = 1;
        while (!this.d) {
            while (true) {
                Runnable runnable = (Runnable) ihVar.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
                if (this.d) {
                    ihVar.clear();
                    return;
                }
            }
            if (this.d) {
                ihVar.clear();
                return;
            } else {
                iAddAndGet = this.e.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        ihVar.clear();
    }
}
