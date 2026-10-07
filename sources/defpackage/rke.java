package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class rke {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m09 m09Var) {
        i19 i19VarF;
        if (!(activity instanceof g19) || (i19VarF = ((g19) activity).f()) == null) {
            return;
        }
        i19VarF.d(m09Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            tke.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new tke.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new tke(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
