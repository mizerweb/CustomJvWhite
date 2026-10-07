package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class n1c implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ cf7 a;
    public final /* synthetic */ o1c b;

    public n1c(cf7 cf7Var, o1c o1cVar) {
        this.a = cf7Var;
        this.b = o1cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (((Boolean) this.a.invoke(activity)).booleanValue()) {
            qte qteVar = qte.a;
            qte.b.add(new at4(1, this.b));
            View decorView = activity.getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.setOnHierarchyChangeListener(qteVar);
            }
            pu6 pu6Var = new pu6(new kx6(new sw(2, activity.getWindow().getDecorView().getRootView()), new ol(new ik4(21), 24, new ik4(22)), cif.a));
            while (pu6Var.hasNext()) {
                View view = (View) pu6Var.next();
                ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup2 != null) {
                    viewGroup2.setOnHierarchyChangeListener(qteVar);
                }
            }
        }
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
