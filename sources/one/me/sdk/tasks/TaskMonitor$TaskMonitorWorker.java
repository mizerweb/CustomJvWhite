package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a4c;
import defpackage.ch3;
import defpackage.ckh;
import defpackage.ekh;
import defpackage.et3;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.je9;
import defpackage.lq4;
import defpackage.nq4;
import defpackage.okh;
import defpackage.ore;
import defpackage.sbi;
import defpackage.wzj;
import defpackage.xt4;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lokh;", "taskRepository", "Lwzj;", "workerService", "Let3;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lokh;Lwzj;Let3;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TaskMonitor$TaskMonitorWorker extends SdkCoroutineWorker {
    public final okh g;
    public final wzj h;
    public final et3 i;

    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, okh okhVar, wzj wzjVar, et3 et3Var) {
        super(context, workerParameters, xt4Var);
        this.g = okhVar;
        this.h = wzjVar;
        this.i = et3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if (r14 == r3) goto L46;
     */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.lq4 r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker.d(lq4):java.lang.Object");
    }

    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object g(int i, lq4 lq4Var) {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "dkh", "work " + this.b.a + " requested to stop " + System.identityHashCode(this) + " with reason " + i, null);
        }
        ekh.a.set(false);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "dkh", "work " + this.b.a + " stopped " + System.identityHashCode(this), null);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(nq4 nq4Var) {
        ckh ckhVar;
        if (nq4Var instanceof ckh) {
            ckhVar = (ckh) nq4Var;
            int i = ckhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ckhVar.f = i - Integer.MIN_VALUE;
            } else {
                ckhVar = new ckh(this, nq4Var);
            }
        } else {
            ckhVar = new ckh(this, nq4Var);
        }
        Object objL = ckhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ckhVar.f;
        if (i2 == 0) {
            ch3.d0(objL);
            okh okhVar = this.g;
            ckhVar.f = 1;
            objL = okhVar.l(ckhVar);
            if (objL == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objL);
        }
        int iIntValue = ((Number) objL).intValue();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "dkh", "work " + this.b.a + " Task count to be executed = " + iIntValue, null);
            }
        }
        return Boolean.valueOf(iIntValue > 0);
    }
}
