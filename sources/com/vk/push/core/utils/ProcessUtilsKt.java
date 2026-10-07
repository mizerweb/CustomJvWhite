package com.vk.push.core.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import defpackage.cqk;
import defpackage.poe;
import defpackage.r5h;
import defpackage.ww3;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, d2 = {"getPackageNameForPid", "", "Landroid/content/Context;", "pid", "", "getProcessName", "isMainProcess", "", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ProcessUtilsKt {
    public static final String getPackageNameForPid(Context context, int i) {
        Object poeVar;
        Object next;
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityManager.class);
            poeVar = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        List list = (List) poeVar;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ActivityManager.RunningAppProcessInfo) next).pid != i);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) {
            return null;
        }
        return (String) ww3.t1(r5h.m1(str, new String[]{":"}, 6));
    }

    public static final String getProcessName(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Class.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            Log.d("ProcessUtil", "Unable to check ActivityThread for processName", th);
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityManager.class);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
            if (runningAppProcesses == null) {
                return null;
            }
            int iMyPid = Process.myPid();
            String packageName = context.getPackageName();
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                if (runningAppProcessInfo.pid == iMyPid && cqk.d(runningAppProcessInfo.processName, packageName)) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo2 != null) {
                return runningAppProcessInfo2.processName;
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final boolean isMainProcess(Context context) {
        return cqk.d(getProcessName(context), context.getPackageName());
    }
}
