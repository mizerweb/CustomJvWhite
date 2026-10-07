package defpackage;

import bolts.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class yih implements mq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk2 b;
    public final /* synthetic */ mq4 c;

    public /* synthetic */ yih(kk2 kk2Var, mq4 mq4Var, int i) {
        this.a = i;
        this.b = kk2Var;
        this.c = mq4Var;
    }

    @Override // defpackage.mq4
    public final Object a(Task task) {
        int i = this.a;
        mq4 mq4Var = this.c;
        kk2 kk2Var = this.b;
        switch (i) {
            case 0:
                if (kk2Var != null && kk2Var.a.y()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                return task.isCancelled() ? Task.cancelled() : task.continueWith(mq4Var);
            default:
                if (kk2Var != null && kk2Var.a.y()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                return task.isCancelled() ? Task.cancelled() : task.continueWithTask(mq4Var);
        }
    }
}
