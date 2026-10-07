package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z2f {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());

    public abstract y2f a();

    public ko5 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public ko5 c(Runnable runnable, long j, TimeUnit timeUnit) {
        y2f y2fVarA = a();
        Objects.requireNonNull(runnable, "run is null");
        v2f v2fVar = new v2f(runnable, y2fVarA);
        y2fVarA.b(v2fVar, j, timeUnit);
        return v2fVar;
    }

    public ko5 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        y2f y2fVarA = a();
        w2f w2fVar = new w2f(runnable, y2fVarA);
        ko5 ko5VarC = y2fVarA.c(w2fVar, j, j2, timeUnit);
        return ko5VarC == l66.a ? ko5VarC : w2fVar;
    }
}
