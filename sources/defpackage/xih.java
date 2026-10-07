package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class xih implements mq4 {
    public final /* synthetic */ rjh a;
    public final /* synthetic */ mq4 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ kk2 d;

    public xih(rjh rjhVar, mq4 mq4Var, Executor executor, kk2 kk2Var) {
        this.a = rjhVar;
        this.b = mq4Var;
        this.c = executor;
        this.d = kk2Var;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        Task.completeAfterTask(this.a, this.b, task, this.c, this.d);
        return null;
    }
}
