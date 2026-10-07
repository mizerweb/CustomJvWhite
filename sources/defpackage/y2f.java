package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y2f implements ko5 {
    public ko5 a(Runnable runnable) {
        return b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract ko5 b(Runnable runnable, long j, TimeUnit timeUnit);

    public final ko5 c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        j66 j66Var = new j66(2);
        j66 j66Var2 = new j66(j66Var);
        long nanos = timeUnit.toNanos(j2);
        long jConvert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        ko5 ko5VarB = b(new x2f(this, timeUnit.toNanos(j) + jConvert, runnable, jConvert, j66Var2, nanos), j, timeUnit);
        if (ko5VarB == l66.a) {
            return ko5VarB;
        }
        oo5.d(j66Var, ko5VarB);
        return j66Var2;
    }
}
