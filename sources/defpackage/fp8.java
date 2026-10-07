package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fp8 extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    ep8 mCompatWorkEnqueuer;
    xo8 mCurProcessor;
    yo8 mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, ep8> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<zo8> mCompatQueue = null;

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            ore.p("work must not be null");
            return;
        }
        synchronized (sLock) {
            ep8 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.a(i);
            dp8 dp8Var = (dp8) workEnqueuer;
            dp8Var.d.enqueue(dp8Var.c, new JobWorkItem(intent));
        }
    }

    public static ep8 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, ep8> map = sClassWorkEnqueuer;
        ep8 ep8Var = map.get(componentName);
        if (ep8Var != null) {
            return ep8Var;
        }
        if (!z) {
            ore.p("Can't be here without a job id");
            return null;
        }
        dp8 dp8Var = new dp8(context, componentName, i);
        map.put(componentName, dp8Var);
        return dp8Var;
    }

    public abstract ap8 dequeueWork();

    public boolean doStopCurrentWork() {
        xo8 xo8Var = this.mCurProcessor;
        if (xo8Var != null) {
            xo8Var.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            xo8 xo8Var = new xo8(this);
            this.mCurProcessor = xo8Var;
            xo8Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        yo8 yo8Var = this.mJobImpl;
        if (yo8Var != null) {
            return yo8Var.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new cp8(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<zo8> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<zo8> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new zo8(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<zo8> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<zo8> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
