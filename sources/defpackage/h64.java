package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h64 implements n64 {
    public final void a(m64 m64Var) {
        try {
            b(m64Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(m64 m64Var);

    public final o64 c(z2f z2fVar) {
        Objects.requireNonNull(z2fVar, "scheduler is null");
        return new o64(this, 0, z2fVar);
    }
}
