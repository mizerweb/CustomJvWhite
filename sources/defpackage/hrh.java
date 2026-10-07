package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hrh implements mjd {
    public final ane a;
    public int b;
    public final ConcurrentLinkedQueue c;
    public final Executor d;

    public hrh(Executor executor, ane aneVar) {
        executor.getClass();
        this.d = executor;
        this.a = aneVar;
        this.c = new ConcurrentLinkedQueue();
        this.b = 0;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        boolean z;
        es0Var.c.a(es0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(lq0Var, es0Var));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        es0Var.c.d(es0Var, "ThrottlingProducer", null);
        this.a.b(new grh(this, lq0Var), es0Var);
    }
}
