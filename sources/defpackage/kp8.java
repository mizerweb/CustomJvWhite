package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class kp8 {
    public static final String a = n1g.Z("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? e51.a(jobScheduler) : jobScheduler;
    }
}
