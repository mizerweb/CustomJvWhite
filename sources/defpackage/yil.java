package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yil {
    public static int a(Exception exc) {
        boolean zD = false;
        if (!(exc instanceof CameraAccessException)) {
            if (exc instanceof IllegalArgumentException) {
                return 7;
            }
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    zD = cqk.d(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
                }
                if (zD) {
                    return 10;
                }
            }
            Log.w("CXCP", "Unexpected throwable: " + exc);
            return 11;
        }
        CameraAccessException cameraAccessException = (CameraAccessException) exc;
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return 3;
        }
        if (reason == 2) {
            return 6;
        }
        if (reason == 3) {
            return 0;
        }
        if (reason == 4) {
            return 1;
        }
        if (reason == 5) {
            return 2;
        }
        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
        return 11;
    }

    public static final boolean b(int i) {
        return (i & 8) != 0;
    }
}
