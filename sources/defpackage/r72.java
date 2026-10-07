package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r72 {
    public Object a;
    public u72 b;
    public gne c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        gne gneVar = this.c;
        if (gneVar != null) {
            gneVar.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        u72 u72Var = this.b;
        boolean z = u72Var != null && u72Var.b.q(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        u72 u72Var = this.b;
        if (u72Var == null || !u72Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        u72 u72Var = this.b;
        boolean z = u72Var != null && u72Var.b.r(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        gne gneVar;
        u72 u72Var = this.b;
        if (u72Var != null && !u72Var.b.isDone()) {
            u72Var.c(new za9("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (gneVar = this.c) == null) {
            return;
        }
        gneVar.q(null);
    }
}
