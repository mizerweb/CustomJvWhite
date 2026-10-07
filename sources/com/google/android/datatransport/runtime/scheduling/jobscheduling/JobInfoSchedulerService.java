package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.c86;
import defpackage.g4i;
import defpackage.ij0;
import defpackage.su6;
import defpackage.xtj;
import defpackage.yhd;
import defpackage.z18;
import java.util.concurrent.Executor;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        g4i.b(getApplicationContext());
        xtj xtjVarA = ij0.a();
        xtjVarA.D(string);
        xtjVarA.d = yhd.b(i);
        if (string2 != null) {
            xtjVarA.c = Base64.decode(string2, 0);
        }
        z18 z18Var = g4i.a().d;
        ((Executor) z18Var.e).execute(new c86(z18Var, xtjVarA.n(), i2, new su6(this, 6, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
