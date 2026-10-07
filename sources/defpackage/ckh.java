package defpackage;

import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* JADX INFO: loaded from: classes.dex */
public final class ckh extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ TaskMonitor$TaskMonitorWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckh(TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker, nq4 nq4Var) {
        super(nq4Var);
        this.e = taskMonitor$TaskMonitorWorker;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(this);
    }
}
