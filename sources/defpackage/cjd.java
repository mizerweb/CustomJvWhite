package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cjd {
    public static final String a = n1g.Z("ProcessUtils");

    public static final boolean a(Context context) {
        String strF;
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            strF = go.f();
        } else {
            strF = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, oyj.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    strF = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strF = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                n1g.x().q(a, "Unable to check ActivityThread for processName", th);
            }
        }
        return cqk.d(strF, context.getApplicationInfo().processName);
    }
}
