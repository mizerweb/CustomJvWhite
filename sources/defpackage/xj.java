package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class xj {
    public final px0 a;
    public final f1b b;
    public final ScheduledExecutorService c;
    public long e;
    public final px0 f;
    public boolean d = false;
    public final pi g = new pi(1, this);

    public xj(px0 px0Var, px0 px0Var2, f1b f1bVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = px0Var;
        this.f = px0Var2;
        this.b = f1bVar;
        this.c = scheduledExecutorService;
    }

    public static xj a(px0 px0Var, f1b f1bVar, ScheduledExecutorService scheduledExecutorService) {
        return new xj(px0Var, px0Var, f1bVar, scheduledExecutorService);
    }

    public final int b() {
        return this.a.c.v();
    }

    public final int c(int i) {
        return ((si) this.a.c.a).e[i];
    }

    public final int d() {
        return this.a.c.y();
    }

    public final synchronized void e() {
        if (!this.d) {
            this.d = true;
            this.c.schedule(this.g, 1000L, TimeUnit.MILLISECONDS);
        }
    }
}
