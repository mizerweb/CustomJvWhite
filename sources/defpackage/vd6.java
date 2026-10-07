package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class vd6 extends z2f {
    public static final z2f d;
    public final boolean b;
    public final Executor c;

    static {
        z2f z2fVar = i3f.a;
        nhb nhbVar = tre.n;
        if (nhbVar != null) {
            z2fVar = (z2f) tre.H(nhbVar, z2fVar);
        }
        d = z2fVar;
    }

    public vd6(Executor executor, boolean z) {
        this.c = executor;
        this.b = z;
    }

    @Override // defpackage.z2f
    public final y2f a() {
        return new ud6(this.c, this.b);
    }

    @Override // defpackage.z2f
    public final ko5 b(Runnable runnable) {
        Executor executor = this.c;
        try {
            if (executor instanceof ExecutorService) {
                t1f t1fVar = new t1f(runnable);
                t1fVar.a(((ExecutorService) executor).submit(t1fVar));
                return t1fVar;
            }
            if (this.b) {
                td6 td6Var = new td6(runnable, null);
                executor.execute(td6Var);
                return td6Var;
            }
            sd6 sd6Var = new sd6(runnable);
            executor.execute(sd6Var);
            return sd6Var;
        } catch (RejectedExecutionException e) {
            tre.s0(e);
            return l66.a;
        }
    }

    @Override // defpackage.z2f
    public final ko5 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                t1f t1fVar = new t1f(runnable);
                t1fVar.a(((ScheduledExecutorService) executor).schedule(t1fVar, j, timeUnit));
                return t1fVar;
            } catch (RejectedExecutionException e) {
                tre.s0(e);
                return l66.a;
            }
        }
        rd6 rd6Var = new rd6(runnable);
        ko5 ko5VarC = d.c(new og7((Object) this, (Object) rd6Var, false, 5), j, timeUnit);
        j66 j66Var = rd6Var.a;
        j66Var.getClass();
        oo5.d(j66Var, ko5VarC);
        return rd6Var;
    }

    @Override // defpackage.z2f
    public final ko5 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            s1f s1fVar = new s1f(runnable);
            s1fVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(s1fVar, j, j2, timeUnit));
            return s1fVar;
        } catch (RejectedExecutionException e) {
            tre.s0(e);
            return l66.a;
        }
    }
}
