package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends h17 implements Runnable {
    public e89 h;
    public mf7 i;

    public static c4 r(e89 e89Var, mf7 mf7Var) {
        c4 c4Var = new c4();
        e89Var.getClass();
        c4Var.h = e89Var;
        c4Var.i = mf7Var;
        e89Var.b(c4Var, im5.a);
        return c4Var;
    }

    @Override // defpackage.o1
    public final void d() {
        e89 e89Var = this.h;
        if ((e89Var != null) & (this.a instanceof a1)) {
            e89Var.cancel(q());
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.o1
    public final String k() {
        String str;
        e89 e89Var = this.h;
        mf7 mf7Var = this.i;
        String strK = super.k();
        if (e89Var != null) {
            str = "inputFuture=[" + e89Var + "], ";
        } else {
            str = "";
        }
        if (mf7Var == null) {
            if (strK != null) {
                return str.concat(strK);
            }
            return null;
        }
        return str + "function=[" + mf7Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        e89 e89Var = this.h;
        mf7 mf7Var = this.i;
        if (((this.a instanceof a1) | (e89Var == null)) || (mf7Var == null)) {
            return;
        }
        this.h = null;
        if (e89Var.isCancelled()) {
            o(e89Var);
            return;
        }
        try {
            try {
                Object objMo41apply = mf7Var.mo41apply(rx8.F(e89Var));
                this.i = null;
                m(objMo41apply);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            n(e2.getCause());
        } catch (Exception e3) {
            n(e3);
        }
    }
}
