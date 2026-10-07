package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class um5 implements mq4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public um5(vm5 vm5Var, pjd pjdVar, es0 es0Var, lq0 lq0Var) {
        this.e = vm5Var;
        this.b = pjdVar;
        this.c = es0Var;
        this.d = lq0Var;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                vm5 vm5Var = (vm5) ((vm5) obj).d;
                pjd pjdVar = (pjd) obj4;
                lq0 lq0Var = (lq0) obj2;
                es0 es0Var = (es0) obj3;
                if (task.isCancelled() || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    pjdVar.j(es0Var, "DiskCacheProducer");
                    lq0Var.c();
                } else if (!task.isFaulted()) {
                    p76 p76Var = (p76) task.getResult();
                    if (p76Var == null) {
                        pjdVar.d(es0Var, "DiskCacheProducer", vm5.c(pjdVar, es0Var, false, 0));
                        vm5Var.b(lq0Var, es0Var);
                    } else {
                        pjdVar.d(es0Var, "DiskCacheProducer", vm5.c(pjdVar, es0Var, true, p76Var.E()));
                        pjdVar.e(es0Var, "DiskCacheProducer", true);
                        es0Var.h("disk", "default");
                        lq0Var.i(1.0f);
                        lq0Var.g(1, p76Var);
                        p76Var.close();
                    }
                } else {
                    pjdVar.b(es0Var, "DiskCacheProducer", task.getError(), null);
                    vm5Var.b(lq0Var, es0Var);
                }
                break;
            default:
                Task.completeImmediately((rjh) obj4, (mq4) obj3, task, (Executor) obj2, (kk2) obj);
                break;
        }
        return null;
    }

    public um5(rjh rjhVar, mq4 mq4Var, Executor executor, kk2 kk2Var) {
        this.b = rjhVar;
        this.c = mq4Var;
        this.d = executor;
        this.e = kk2Var;
    }
}
