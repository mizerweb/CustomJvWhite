package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class prk {
    public static final boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activityManager.isBackgroundRestricted();
        }
        return false;
    }

    public abstract boolean b();

    public abstract void c(nv4 nv4Var);
}
