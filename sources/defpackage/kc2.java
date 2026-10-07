package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class kc2 {
    public final Context a;
    public final zqh b;
    public final xsc c;
    public final kzi d;
    public final jgh e;
    public final ArrayMap f = new ArrayMap();
    public final ArrayMap g = new ArrayMap();
    public final ArrayMap h = new ArrayMap();

    public kc2(Context context, zqh zqhVar, xsc xscVar, kzi kziVar, jgh jghVar) {
        this.a = context;
        this.b = zqhVar;
        this.c = xscVar;
        this.d = kziVar;
        this.e = jghVar;
    }

    public static final nb2 a(kc2 kc2Var, String str, boolean z, int i) {
        String str2;
        kc2Var.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) ef2.b(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) ef2.b(str)));
                nb2 nb2Var = new nb2(str, i, kc2Var.e(str));
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) ef2.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return nb2Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) ef2.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static final qb2 b(kc2 kc2Var, String str, boolean z) {
        Iterable iterableA0;
        String str2;
        kzi kziVar = kc2Var.d;
        kc2Var.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) ef2.b(str)) + "#readCameraMetadata");
            String methodName = null;
            try {
                Log.d("CXCP", "Loading metadata for " + ((Object) ef2.b(str)));
                CameraCharacteristics cameraCharacteristics = ((CameraManager) kc2Var.a.getSystemService("camera")).getCameraCharacteristics(str);
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableA0 = (Set) ((Map) kziVar.b).get(new ef2(str));
                } else {
                    Set set = (Set) ((Map) kziVar.b).get(new ef2(str));
                    if (set == null) {
                        set = c76.a;
                    }
                    iterableA0 = lof.a0(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                qb2 qb2Var = new qb2(str, cameraCharacteristics, kc2Var, iterableA0 == null ? (Set) kziVar.a : lof.Z((Set) kziVar.a, iterableA0));
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded metadata for " + ((Object) ef2.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return qb2Var;
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT == 28) {
                    boolean zD = false;
                    if (th instanceof RuntimeException) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        if (stackTrace.length != 0) {
                            methodName = stackTrace[0].getMethodName();
                        }
                        zD = cqk.d(methodName, "_enableShutterSound");
                    }
                    if (zD) {
                        throw new DoNotDisturbException("Failed to load metadata: Do Not Disturb mode is on!");
                    }
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) ef2.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static final boolean c(kc2 kc2Var) {
        boolean z;
        xsc xscVar = kc2Var.c;
        xscVar.getClass();
        if (cqk.d(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!xscVar.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (xscVar.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    xscVar.b = true;
                }
                Trace.endSection();
            }
            z = xscVar.b;
        }
        return !z;
    }

    public final bg2 d(String str) {
        bg2 bg2VarB;
        try {
            Trace.beginSection(((Object) ef2.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                bg2VarB = (bg2) this.f.get(str);
                if (bg2VarB == null) {
                    if (c(this)) {
                        bg2VarB = b(this, str, true);
                    } else {
                        bg2VarB = b(this, str, false);
                        this.f.put(str, bg2VarB);
                    }
                }
            }
            Trace.endSection();
            return bg2VarB;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final CameraExtensionCharacteristics e(String str) {
        synchronized (this.h) {
            CameraExtensionCharacteristics cameraExtensionCharacteristicsD = f82.d(this.h.get(str));
            if (cameraExtensionCharacteristicsD != null) {
                return cameraExtensionCharacteristicsD;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) ef2.b(str)));
            return ((CameraManager) this.a.getSystemService("camera")).getCameraExtensionCharacteristics(str);
        }
    }
}
