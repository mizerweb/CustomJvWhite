package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class grk {
    public static Boolean a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && (((bool = a) == null || !bool.booleanValue()) && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty())) {
            ht6.m();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointH = ht6.h(i, i2, (int) d);
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (ht6.i(supportedPerformancePoints.get(i5)).covers(performancePointH)) {
                    i3 = 2;
                    break;
                }
                i5++;
            }
            if (i3 == 1 && a == null) {
                int iA = i4 >= 35 ? 2 : erk.a(false);
                int iA2 = erk.a(true);
                if (iA != 0 && (iA2 != 0 ? !(iA != 2 || iA2 != 2) : iA == 2)) {
                    z = false;
                }
                a = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public abstract boolean b(o1 o1Var, c1 c1Var, c1 c1Var2);

    public abstract boolean c(o1 o1Var, Object obj, Object obj2);

    public abstract boolean d(o1 o1Var, n1 n1Var, n1 n1Var2);

    public abstract c1 e(o1 o1Var);

    public abstract n1 f(o1 o1Var);

    public abstract void g(n1 n1Var, n1 n1Var2);

    public abstract void h(n1 n1Var, Thread thread);
}
