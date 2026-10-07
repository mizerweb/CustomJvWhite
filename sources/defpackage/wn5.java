package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class wn5 implements Executor {
    public final xt4 a;

    public wn5(xt4 xt4Var) {
        this.a = xt4Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws DispatchException {
        xt4 xt4Var = this.a;
        k66 k66Var = k66.a;
        if (e9i.A0(xt4Var, k66Var)) {
            e9i.z0(xt4Var, k66Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
