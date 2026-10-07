package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class igk implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final d2 b;
    public int d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public boolean e = true;

    public igk(Application application, d2 d2Var) {
        this.a = application;
        this.b = d2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.d + 1;
        this.d = i;
        if (i == 1 && this.e) {
            this.e = false;
            this.c.post(new hed(14, this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.d - 1;
        this.d = i;
        if (i != 0 || this.e) {
            return;
        }
        this.e = true;
    }
}
