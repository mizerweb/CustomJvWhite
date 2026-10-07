package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.azj;
import defpackage.c0a;
import defpackage.fbc;
import defpackage.go;
import defpackage.ijd;
import defpackage.iyj;
import defpackage.j85;
import defpackage.jo;
import defpackage.kig;
import defpackage.md6;
import defpackage.n1g;
import defpackage.oj9;
import defpackage.ore;
import defpackage.oyj;
import defpackage.s41;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements md6 {
    public static final String e = n1g.Z("SystemJobService");
    public oyj a;
    public final HashMap b = new HashMap();
    public final oj9 c = new oj9(1);
    public fbc d;

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ore.k(c0a.o("Cannot invoke ", str, " on a background thread"));
    }

    public static iyj c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new iyj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.md6
    public final void a(iyj iyjVar, boolean z) {
        b("onExecuted");
        n1g.x().p(e, iyjVar.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(iyjVar);
        this.c.a(iyjVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            oyj oyjVarD = oyj.d(getApplicationContext());
            this.a = oyjVarD;
            ijd ijdVar = oyjVarD.f;
            this.d = new fbc(ijdVar, 26, oyjVarD.d);
            ijdVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                n1g.x().j0(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                ore.l("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        oyj oyjVar = this.a;
        if (oyjVar != null) {
            ijd ijdVar = oyjVar.f;
            synchronized (ijdVar.k) {
                ijdVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        oyj oyjVar = this.a;
        String str = e;
        if (oyjVar == null) {
            n1g.x().p(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        iyj iyjVarC = c(jobParameters);
        if (iyjVarC == null) {
            n1g.x().s(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(iyjVarC)) {
            n1g.x().p(str, "Job is already being executed by SystemJobService: " + iyjVarC);
            return false;
        }
        n1g.x().p(str, "onStartJob for " + iyjVarC);
        map.put(iyjVarC, jobParameters);
        j85 j85Var = new j85(26);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            go.e(jobParameters);
        }
        fbc fbcVar = this.d;
        ((azj) fbcVar.c).a(new s41(fbcVar, this.c.c(iyjVarC), j85Var, 3));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        b("onStopJob");
        if (this.a == null) {
            n1g.x().p(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        iyj iyjVarC = c(jobParameters);
        if (iyjVarC == null) {
            n1g.x().s(e, "WorkSpec id not found!");
            return false;
        }
        n1g.x().p(e, "onStopJob for " + iyjVarC);
        this.b.remove(iyjVarC);
        kig kigVarA = this.c.a(iyjVarC);
        if (kigVarA != null) {
            this.d.A(kigVarA, Build.VERSION.SDK_INT >= 31 ? jo.c(jobParameters) : -512);
        }
        ijd ijdVar = this.a.f;
        String str = iyjVarC.a;
        synchronized (ijdVar.k) {
            zContains = ijdVar.i.contains(str);
        }
        return !zContains;
    }
}
