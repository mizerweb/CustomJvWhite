package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kam extends Task {
    public final Object a = new Object();
    public final s68 b = new s68();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final kam a(Executor executor, ntb ntbVar) {
        this.b.d(new ecl(executor, ntbVar));
        r();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final kam b(otb otbVar) {
        this.b.d(new ecl(vjh.a, otbVar));
        r();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final kam c(Executor executor, otb otbVar) {
        this.b.d(new ecl(executor, otbVar));
        r();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final kam d(Executor executor, ttb ttbVar) {
        this.b.d(new cpl(executor, ttbVar));
        r();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final kam e(Executor executor, cub cubVar) {
        this.b.d(new ecl(executor, cubVar));
        r();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final kam f(Executor executor, kq4 kq4Var) {
        kam kamVar = new kam();
        this.b.d(new ixk(executor, kq4Var, kamVar, 1));
        r();
        return kamVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                yab.u("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final kam k(ttb ttbVar) {
        d(vjh.a, ttbVar);
        return this;
    }

    public final kam l(Executor executor, kq4 kq4Var) {
        kam kamVar = new kam();
        this.b.d(new ixk(executor, kq4Var, kamVar, 0));
        r();
        return kamVar;
    }

    public final kam m(Executor executor, j8h j8hVar) {
        kam kamVar = new kam();
        this.b.d(new ecl(executor, j8hVar, kamVar));
        r();
        return kamVar;
    }

    public final void n(Exception exc) {
        yab.t(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.f = exc;
        }
        this.b.e(this);
    }

    public final void o(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.e = obj;
        }
        this.b.e(this);
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.e(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.e(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
