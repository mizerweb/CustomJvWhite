package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0k implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkersQueueDao_Impl b;
    public final /* synthetic */ vzj c;

    public /* synthetic */ k0k(WorkersQueueDao_Impl workersQueueDao_Impl, vzj vzjVar, int i) {
        this.a = i;
        this.b = workersQueueDao_Impl;
        this.c = vzjVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        vzj vzjVar = this.c;
        WorkersQueueDao_Impl workersQueueDao_Impl = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                return WorkersQueueDao_Impl.insert$lambda$0(workersQueueDao_Impl, vzjVar, qxeVar);
            case 1:
                return WorkersQueueDao_Impl.insertOrIgnore$lambda$0(workersQueueDao_Impl, vzjVar, qxeVar);
            default:
                return WorkersQueueDao_Impl.insertOrReplace$lambda$0(workersQueueDao_Impl, vzjVar, qxeVar);
        }
    }
}
