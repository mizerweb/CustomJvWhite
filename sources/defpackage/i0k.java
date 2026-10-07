package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0k {
    public static final String a = n1g.Z("WorkerWrapper");

    public static final Object a(e89 e89Var, m89 m89Var, mdh mdhVar) {
        Object obj;
        try {
            if (!e89Var.isDone()) {
                ek2 ek2Var = new ek2(1, p90.B(mdhVar));
                ek2Var.u();
                e89Var.b(new p0((Object) e89Var, 7, (Runnable) ek2Var), hm5.a);
                ek2Var.w(new jl3(m89Var, 3, e89Var));
                return ek2Var.s();
            }
            boolean z = false;
            while (true) {
                try {
                    obj = e89Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
