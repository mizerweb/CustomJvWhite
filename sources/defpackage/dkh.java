package defpackage;

import androidx.work.a;
import java.util.concurrent.TimeUnit;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* JADX INFO: loaded from: classes.dex */
public final class dkh {
    public static final /* synthetic */ int c = 0;
    public final ha9 a;
    public final ny8 b;

    public dkh(ny8 ny8Var, ha9 ha9Var) {
        this.a = ha9Var;
        this.b = ny8Var;
    }

    public final void a() {
        ((xyj) this.b.getValue()).c("TASK_MONITOR_PERIODIC_TASK");
        if (ekh.a.get()) {
            gm0.Y("dkh", "executePersistedTasks fail, TaskMonitor already running");
            return;
        }
        String strA = this.a.a("TASK_MONITOR_ONE_TIME_TASK", null);
        cdc cdcVar = (cdc) ((a) ((a) ((a) new a(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(rn0.a, 10000L, TimeUnit.MILLISECONDS)).setInputData(f55.t(this.a, new ylc[0]))).addTag(strA)).build();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "dkh", "work " + cdcVar.getId() + " try to add " + strA + " request", null);
            }
        }
        ((xyj) this.b.getValue()).b(strA, ve6.b, cdcVar).N();
    }
}
