package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class cjh implements mq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ rjh c;

    public /* synthetic */ cjh(AtomicBoolean atomicBoolean, rjh rjhVar, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = rjhVar;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        int i = this.a;
        rjh rjhVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.compareAndSet(false, true)) {
                    task.getError();
                } else {
                    rjhVar.c(task);
                }
                break;
            default:
                if (!atomicBoolean.compareAndSet(false, true)) {
                    task.getError();
                } else {
                    rjhVar.c(task);
                }
                break;
        }
        return null;
    }
}
