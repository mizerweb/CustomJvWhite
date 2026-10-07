package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import androidx.camera.core.InitializationException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iil {
    public static o5d a(long j, String str, u8b u8bVar, int i, n5d n5dVar, int i2) {
        return new o5d(j, str, u8bVar, i, n5dVar, i2);
    }

    public static final boolean b(String str, me2 me2Var) throws InitializationException {
        if (cqk.d(Build.FINGERPRINT, "robolectric")) {
            if (!tvj.f(3, "CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            ef2.a(str);
            int[] iArr = (int[]) ((qb2) me2Var.c().c.d(str)).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                return a.L0(0, iArr);
            }
            return false;
        } catch (CameraAccessException e) {
            if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e);
            }
            throw new InitializationException(e);
        }
    }

    public static boolean c(int i) {
        boolean z = false;
        if (1 <= i && i < 2) {
            z = true;
        }
        return !z;
    }
}
