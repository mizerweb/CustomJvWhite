package defpackage;

import bolts.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class bjh implements mq4 {
    @Override // defpackage.mq4
    public final Object a(Task task) {
        if (task.isCancelled()) {
            return Task.cancelled();
        }
        return task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
