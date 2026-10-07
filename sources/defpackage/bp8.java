package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class bp8 implements ap8 {
    public final /* synthetic */ int a;
    public final JobWorkItem b;
    public final /* synthetic */ JobServiceEngine c;

    public /* synthetic */ bp8(JobServiceEngine jobServiceEngine, JobWorkItem jobWorkItem, int i) {
        this.a = i;
        this.c = jobServiceEngine;
        this.b = jobWorkItem;
    }

    @Override // defpackage.ap8
    public final void f() {
        switch (this.a) {
            case 0:
                synchronized (((cp8) this.c).b) {
                    try {
                        JobParameters jobParameters = ((cp8) this.c).c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (((cp8) this.c).b) {
                    JobParameters jobParameters2 = ((cp8) this.c).c;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.b);
                        } catch (IllegalArgumentException | SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.ap8
    public final Intent getIntent() {
        int i = this.a;
        JobWorkItem jobWorkItem = this.b;
        switch (i) {
            case 0:
                break;
        }
        return jobWorkItem.getIntent();
    }
}
