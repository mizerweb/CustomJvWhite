package com.my.tracker.core.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class ContextUtils {
    public static PackageInfo getCurrentAppPackageInfo(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (Throwable th) {
            Tracer.e("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    public static String getInstaller(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            Tracer.d("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
