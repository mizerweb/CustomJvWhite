package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final ll6 b = new ll6();
    public static final kl6 c = new kl6();
    public static final kl6 d = new kl6(kl6.d);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return c0a.c(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
