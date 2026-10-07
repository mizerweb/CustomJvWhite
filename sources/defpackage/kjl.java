package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kjl {
    public static final qw a(bg2 bg2Var) {
        Object objC = ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new qw((int[]) obj);
    }

    public static final int b(bg2 bg2Var, int i) {
        Object obj;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        qb2 qb2Var = (qb2) bg2Var;
        Object objC = qb2Var.c(key);
        Object obj2 = {0};
        if (objC != null) {
            obj2 = objC;
        }
        if (a.L0(i, (int[]) obj2)) {
            return i;
        }
        int[] iArr = {0};
        Object objC2 = qb2Var.c(key);
        if (objC2 != null) {
            obj = iArr;
            obj = objC2;
        }
        obj = iArr;
        return a.L0(1, (int[]) obj) ? 1 : 0;
    }

    public static final boolean c(bg2 bg2Var) {
        return Build.VERSION.SDK_INT >= 28 && b(bg2Var, 5) == 5;
    }
}
