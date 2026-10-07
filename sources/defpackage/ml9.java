package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ml9 {
    public static volatile Handler a;
    public static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    public static int a(int i, long j) {
        return qt4.g(i, 31, j);
    }

    public static final void b(br4 br4Var) {
        Activity activity = br4Var.getActivity();
        if (activity != null) {
            c(activity);
        }
    }

    public static final void c(Activity activity) {
        View currentFocus;
        if (activity == null || (currentFocus = activity.getWindow().getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static final void d(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        view.clearFocus();
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static void e(View view) {
        if (view != null) {
            view.requestFocus();
            view.post(new su6(view, 8, view));
        }
    }

    public static float f(int i, int i2, long j, boolean z, boolean z2) {
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (!z2) {
            if (-45 > i || i > 38) {
                return Float.NaN;
            }
            return g(i, j, z);
        }
        if (-45 <= i2 && i2 <= 38) {
            float fG = g(i2, j, z);
            float fG2 = g(i2, j + 1, z);
            if (!Float.isNaN(fG) && fG2 == fG) {
                return fG;
            }
        }
        return Float.NaN;
    }

    public static float g(int i, long j, boolean z) {
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f = j;
            float[] fArr = b;
            float f2 = i < 0 ? f / fArr[-i] : f * fArr[i];
            return z ? -f2 : f2;
        }
        long j2 = ti8.c[i + 325];
        long j3 = ((((long) i) * 217706) >> 16) + 191;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long jE = hl6.e(j << iNumberOfLeadingZeros, j2);
        long j4 = jE >>> 63;
        long j5 = jE >>> ((int) (38 + j4));
        int i2 = iNumberOfLeadingZeros + ((int) (j4 ^ 1));
        long j6 = jE & 274877906943L;
        if (j6 != 274877906943L) {
            if (j6 != 0 || (3 & j5) != 1) {
                long j7 = (j5 + 1) >>> 1;
                if (j7 >= 16777216) {
                    i2--;
                    j7 = 8388608;
                }
                long j8 = j7 & (-8388609);
                long j9 = j3 - ((long) i2);
                if (j9 >= 1 && j9 <= 254) {
                    return Float.intBitsToFloat((int) (j8 | (j9 << 23) | (z ? 2147483648L : 0L)));
                }
            }
        }
        return Float.NaN;
    }

    public static float h(int i, int i2, long j, boolean z, boolean z2) {
        if (z2) {
            i = i2;
        }
        if (-126 > i || i > 127) {
            return Float.NaN;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((i + 127) << 23) * (j + (j < 0 ? 1.8446744E19f : 0.0f));
        return z ? -fIntBitsToFloat : fIntBitsToFloat;
    }
}
