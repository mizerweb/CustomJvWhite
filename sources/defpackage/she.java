package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class she implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ eu6 b;

    public she(ExecutorService executorService, eu6 eu6Var) {
        this.a = executorService;
        this.b = eu6Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
