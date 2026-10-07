package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class u9g extends y2f {
    public final ScheduledExecutorService a;
    public final w74 b = new w74();
    public volatile boolean c;

    public u9g(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        l66 l66Var = l66.a;
        if (this.c) {
            return l66Var;
        }
        d2f d2fVar = new d2f(runnable, this.b);
        this.b.a(d2fVar);
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            d2fVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) d2fVar) : scheduledExecutorService.schedule((Callable) d2fVar, j, timeUnit));
            return d2fVar;
        } catch (RejectedExecutionException e) {
            dispose();
            tre.s0(e);
            return l66Var;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.dispose();
    }
}
