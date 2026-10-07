package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v7g implements z9g {
    public static p64 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new p64(5, obj);
    }

    public final Object d() {
        lz0 lz0Var = new lz0(1);
        h(lz0Var);
        if (lz0Var.getCount() != 0) {
            try {
                lz0Var.await();
            } catch (InterruptedException e) {
                lz0Var.d = true;
                ko5 ko5Var = lz0Var.c;
                if (ko5Var != null) {
                    ko5Var.dispose();
                }
                throw gd6.b(e);
            }
        }
        Throwable th = lz0Var.b;
        if (th == null) {
            return lz0Var.a;
        }
        throw gd6.b(th);
    }

    public final p8g f(sf7 sf7Var) {
        Objects.requireNonNull(sf7Var, "mapper is null");
        return new p8g(this, sf7Var, 0);
    }

    public final o72 g(rg4 rg4Var, rg4 rg4Var2) {
        Objects.requireNonNull(rg4Var, "onSuccess is null");
        Objects.requireNonNull(rg4Var2, "onError is null");
        o72 o72Var = new o72(rg4Var, 1, rg4Var2);
        h(o72Var);
        return o72Var;
    }

    public final void h(s8g s8gVar) {
        Objects.requireNonNull(s8gVar, "observer is null");
        try {
            i(s8gVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void i(s8g s8gVar);

    public final q8g j(z2f z2fVar) {
        Objects.requireNonNull(z2fVar, "scheduler is null");
        return new q8g(this, z2fVar, 1);
    }
}
