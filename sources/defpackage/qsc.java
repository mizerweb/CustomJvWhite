package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class qsc implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ rsc a;

    public qsc(rsc rscVar) {
        this.a = rscVar;
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
        int i = Build.VERSION.SDK_INT;
        rsc rscVar = this.a;
        if (i >= 33) {
            rscVar.c.e();
        }
        rscVar.d.e();
        re7 re7Var = rscVar.j;
        if (re7Var != null) {
            re7Var.e();
        }
        rscVar.e.e();
        if (i >= 34) {
            rscVar.f.e();
        }
        rscVar.g.e();
        rscVar.h.e();
        rscVar.i.e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
