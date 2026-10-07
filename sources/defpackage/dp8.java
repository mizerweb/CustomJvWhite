package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class dp8 extends ep8 {
    public final JobInfo c;
    public final JobScheduler d;

    public dp8(Context context, ComponentName componentName, int i) {
        a(i);
        this.c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
