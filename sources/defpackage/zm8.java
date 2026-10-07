package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zm8 extends y2f {
    public final ym8 b;
    public final an8 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final w74 a = new w74();

    public zm8(ym8 ym8Var) {
        an8 an8Var;
        an8 an8Var2;
        this.b = ym8Var;
        if (ym8Var.c.b) {
            an8Var2 = bn8.f;
        } else {
            do {
                if (ym8Var.b.isEmpty()) {
                    an8Var = new an8(ym8Var.f);
                    ym8Var.c.a(an8Var);
                    break;
                }
                an8Var = (an8) ym8Var.b.poll();
            } while (an8Var == null);
            an8Var2 = an8Var;
        }
        this.c = an8Var2;
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.b ? l66.a : this.c.d(runnable, j, timeUnit, this.a);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            this.a.dispose();
            ym8 ym8Var = this.b;
            ym8Var.getClass();
            long jNanoTime = System.nanoTime() + ym8Var.a;
            an8 an8Var = this.c;
            an8Var.c = jNanoTime;
            ym8Var.b.offer(an8Var);
        }
    }
}
