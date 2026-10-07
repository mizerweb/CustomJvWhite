package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends h66 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final /* synthetic */ OneMeApplication b;

    public v6(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    @Override // defpackage.h66, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().endsWith("CSPDialogActivity")) {
            return;
        }
        this.a.add(new WeakReference(activity));
    }

    @Override // defpackage.h66, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.removeIf(new u6(0, new m(4, activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object value;
        if (activity.getClass().getName().endsWith("CSPDialogActivity")) {
            return;
        }
        mjg mjgVar = (mjg) pq3.j.e(this.b).g;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }
}
