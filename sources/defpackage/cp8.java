package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class cp8 extends JobServiceEngine implements yo8 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public JobParameters c;
    public final fp8 d;

    public cp8(jye jyeVar) {
        super(jyeVar);
        this.b = new Object();
        this.d = jyeVar;
    }

    @Override // defpackage.yo8
    public final IBinder a() {
        switch (this.a) {
            case 0:
                break;
        }
        return getBinder();
    }

    @Override // defpackage.yo8
    public final ap8 b() {
        JobWorkItem jobWorkItemDequeueWork;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        JobParameters jobParameters = this.c;
                        if (jobParameters == null) {
                            return null;
                        }
                        JobWorkItem jobWorkItemDequeueWork2 = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork2 == null) {
                            return null;
                        }
                        jobWorkItemDequeueWork2.getIntent().setExtrasClassLoader(this.d.getClassLoader());
                        return new bp8(this, jobWorkItemDequeueWork2, 0);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                synchronized (this.b) {
                    JobParameters jobParameters2 = this.c;
                    if (jobParameters2 == null) {
                        return null;
                    }
                    try {
                        jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                        break;
                    } catch (SecurityException e) {
                        e.printStackTrace();
                        jobWorkItemDequeueWork = null;
                    }
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(((jye) this.d).getClassLoader());
                    return new bp8(this, jobWorkItemDequeueWork, 1);
                }
        }
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                this.c = jobParameters;
                this.d.ensureProcessorRunningLocked(false);
                break;
            default:
                this.c = jobParameters;
                ((jye) this.d).ensureProcessorRunningLocked(false);
                break;
        }
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                boolean zDoStopCurrentWork = this.d.doStopCurrentWork();
                synchronized (this.b) {
                    this.c = null;
                    break;
                }
                return zDoStopCurrentWork;
            default:
                boolean zDoStopCurrentWork2 = ((jye) this.d).doStopCurrentWork();
                synchronized (this.b) {
                    this.c = null;
                    break;
                }
                return zDoStopCurrentWork2;
        }
    }

    public cp8(fp8 fp8Var) {
        super(fp8Var);
        this.b = new Object();
        this.d = fp8Var;
    }
}
