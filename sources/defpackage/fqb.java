package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fqb {
    public static brb a(long j, long j2, TimeUnit timeUnit, z2f z2fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(z2fVar, "scheduler is null");
        return new brb(Math.max(0L, j), Math.max(0L, j2), timeUnit, z2fVar);
    }

    public final vqb e(z2f z2fVar) {
        int i = w07.a;
        Objects.requireNonNull(z2fVar, "scheduler is null");
        idl.d(i, "bufferSize");
        return new vqb(this, z2fVar, i, 1);
    }

    public final void f(rrb rrbVar) {
        Objects.requireNonNull(rrbVar, "observer is null");
        try {
            g(rrbVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void g(rrb rrbVar);
}
