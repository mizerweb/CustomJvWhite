package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class gs6 {
    public final f40 a;
    public final ds6 b;
    public final cs6 c;
    public xt4 g;
    public final AtomicReference d = new AtomicReference(null);
    public final Object e = new Object();
    public final boolean f = false;
    public final ny8 h = rx8.P(2, new d2(20, this));

    public gs6(f40 f40Var, ds6 ds6Var, cs6 cs6Var) {
        this.a = f40Var;
        this.b = ds6Var;
        this.c = cs6Var;
    }

    public final void a(b9b b9bVar) {
        xt4 xt4VarR0;
        synchronized (this.e) {
            try {
                ds6 ds6Var = this.b;
                if (ds6Var != null) {
                    ds6Var.log("schedule update");
                }
                this.d.set(b9bVar);
                if (this.g == null) {
                    try {
                        xt4VarR0 = this.c.a().R0(1, "file-prefs");
                    } catch (Throwable unused) {
                        xt4VarR0 = null;
                    }
                    this.g = xt4VarR0;
                }
                xt4 xt4Var = this.g;
                if (xt4Var != null) {
                    xt4Var.D0(k66.a, (fs6) this.h.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
