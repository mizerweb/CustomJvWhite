package ru.ok.tamtam.android.services;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import defpackage.ch3;
import defpackage.ed6;
import defpackage.ew5;
import defpackage.ghb;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.i4e;
import defpackage.k89;
import defpackage.kkg;
import defpackage.lq4;
import defpackage.lw5;
import defpackage.mkg;
import defpackage.n45;
import defpackage.nq4;
import defpackage.ore;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.t1c;
import defpackage.uy6;
import defpackage.vse;
import defpackage.xt4;
import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ru/ok/tamtam/android/services/DbCleanUpScheduler$DbCleanUpWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxt4;", "workCoroutineDispatcher", "Lmkg;", "statsDatabase", "Led6;", "exceptionHandler", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxt4;Lmkg;Led6;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DbCleanUpScheduler$DbCleanUpWorker extends SdkCoroutineWorker {
    public final Context g;
    public final mkg h;
    public final ed6 i;

    public DbCleanUpScheduler$DbCleanUpWorker(Context context, WorkerParameters workerParameters, xt4 xt4Var, mkg mkgVar, ed6 ed6Var) {
        super(context, workerParameters, xt4Var);
        this.g = context;
        this.h = mkgVar;
        this.i = ed6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    public final Object d(lq4 lq4Var) {
        n45 n45Var;
        if (lq4Var instanceof n45) {
            n45Var = (n45) lq4Var;
            int i = n45Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n45Var.f = i - Integer.MIN_VALUE;
            } else {
                n45Var = new n45(this, (nq4) lq4Var);
            }
        } else {
            n45Var = new n45(this, (nq4) lq4Var);
        }
        Object objI = n45Var.d;
        int i2 = n45Var.f;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objI);
            gm0.n("DbCleanUpScheduler", "Work started");
            n45Var.f = 1;
            vse vseVar = (vse) this.h;
            vseVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ghb ghbVar = ew5.b;
            objI = ch3.I(n45Var, ((kkg) vseVar.a.getValue()).a, false, true, new uy6(jCurrentTimeMillis - ew5.g(qe7.O(48, lw5.HOURS)), i3));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        int iIntValue = ((Number) objI).intValue();
        gm0.n("DbCleanUpScheduler", "Deleted " + iIntValue + " events");
        boolean z = i4e.b.d(1000) == 0;
        if (iIntValue > 0 && z) {
            Integer numValueOf = Build.VERSION.SDK_INT >= 28 ? Integer.valueOf(((UsageStatsManager) this.g.getSystemService("usagestats")).getAppStandbyBucket()) : null;
            ((t1c) this.i).a(new LogController$AnalyticsDebugException(zo5.i(iIntValue, "Deleted ", " events older than 48 hours.", numValueOf != null ? qv1.j(" Standby bucket is ", numValueOf) : ""), null));
        }
        gm0.n("DbCleanUpScheduler", "Work finished");
        return new k89();
    }
}
