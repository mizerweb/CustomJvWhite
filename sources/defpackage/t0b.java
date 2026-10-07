package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t0b {
    protected final gkh a;
    private final AtomicInteger b;
    private final AtomicBoolean c;

    public t0b() {
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.a = new gkh();
    }

    public <T> Task a(final Executor executor, final Callable<T> callable, final jk2 jk2Var) {
        yab.v(this.b.get() > 0);
        if (((bqk) jk2Var).a.i()) {
            kam kamVar = new kam();
            kamVar.p();
            return kamVar;
        }
        final mk2 mk2Var = new mk2();
        final qjh qjhVar = new qjh(mk2Var.a);
        this.a.b(new Executor() { // from class: xrl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((bqk) jk2Var).a.i()) {
                        mk2Var.a();
                    } else {
                        qjhVar.a(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: kul
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(jk2Var, mk2Var, callable, qjhVar);
            }
        });
        return qjhVar.a;
    }

    public boolean b() {
        return this.c.get();
    }

    public abstract void c() throws MlKitException;

    public void d() {
        this.b.incrementAndGet();
    }

    public abstract void e();

    public void f(Executor executor) {
        g(executor);
    }

    public Task g(Executor executor) {
        yab.v(this.b.get() > 0);
        final qjh qjhVar = new qjh();
        this.a.b(executor, new Runnable() { // from class: dpl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(qjhVar);
            }
        });
        return qjhVar.a;
    }

    public final void h(jk2 jk2Var, mk2 mk2Var, Callable callable, qjh qjhVar) {
        try {
            if (((bqk) jk2Var).a.i()) {
                mk2Var.a();
                return;
            }
            try {
                if (!this.c.get()) {
                    c();
                    this.c.set(true);
                }
                if (((bqk) jk2Var).a.i()) {
                    mk2Var.a();
                    return;
                }
                Object objCall = callable.call();
                if (((bqk) jk2Var).a.i()) {
                    mk2Var.a();
                } else {
                    qjhVar.b(objCall);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (((bqk) jk2Var).a.i()) {
                mk2Var.a();
            } else {
                qjhVar.a(e2);
            }
        }
    }

    public final void i(qjh qjhVar) {
        int iDecrementAndGet = this.b.decrementAndGet();
        yab.v(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            e();
            this.c.set(false);
        }
        s4m.a.clear();
        j6m.a.clear();
        qjhVar.b(null);
    }

    public t0b(gkh gkhVar) {
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.a = gkhVar;
    }
}
