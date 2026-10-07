package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uvl {
    public static final double a(double d, double d2, double d3, double d4) {
        double d5 = (0.017453292519943295d * d4) - (d2 * 0.017453292519943295d);
        double dAtan = Math.atan(Math.tan(d * 0.017453292519943295d) * 0.996647189328169d);
        double dAtan2 = Math.atan(Math.tan(d3 * 0.017453292519943295d) * 0.996647189328169d);
        double dCos = Math.cos(dAtan);
        double dCos2 = Math.cos(dAtan2);
        double dSin = Math.sin(dAtan);
        double dSin2 = Math.sin(dAtan2);
        double d6 = dCos * dCos2;
        double d7 = dSin * dSin2;
        int i = 0;
        double d8 = 0.0d;
        double dAtan3 = 0.0d;
        double d9 = 0.0d;
        double d10 = d5;
        while (i < 20) {
            double dCos3 = Math.cos(d10);
            double dSin3 = Math.sin(d10);
            double d11 = dCos2 * dSin3;
            double d12 = (dCos * dSin2) - ((dSin * dCos2) * dCos3);
            double dSqrt = Math.sqrt((d12 * d12) + (d11 * d11));
            double d13 = dSin;
            double d14 = (d6 * dCos3) + d7;
            dAtan3 = Math.atan2(dSqrt, d14);
            double d15 = dSqrt == 0.0d ? 0.0d : (dSin3 * d6) / dSqrt;
            double d16 = 1.0d - (d15 * d15);
            double d17 = d16 == 0.0d ? 0.0d : d14 - ((d7 * 2.0d) / d16);
            double d18 = 0.006739496756586903d * d16;
            double d19 = ((((((320.0d - (175.0d * d18)) * d18) - 768.0d) * d18) + 4096.0d) * (d18 / 16384.0d)) + 1.0d;
            double d20 = (((((74.0d - (47.0d * d18)) * d18) - 128.0d) * d18) + 256.0d) * (d18 / 1024.0d);
            double d21 = (((4.0d - (d16 * 3.0d)) * 0.0033528106718309896d) + 4.0d) * 2.0955066698943685E-4d * d16;
            double d22 = d17 * d17;
            double d23 = ((((((d22 * 2.0d) - 1.0d) * d14) - (((d22 * 4.0d) - 3.0d) * ((((dSqrt * 4.0d) * dSqrt) - 3.0d) * ((d20 / 6.0d) * d17)))) * (d20 / 4.0d)) + d17) * d20 * dSqrt;
            double d24 = ((((((((2.0d * d17) * d17) - 1.0d) * d21 * d14) + d17) * dSqrt * d21) + dAtan3) * (1.0d - d21) * 0.0033528106718309896d * d15) + d5;
            if (Math.abs((d24 - d10) / d24) < 1.0E-12d) {
                d9 = d23;
                d8 = d19;
                break;
            }
            i++;
            dSin = d13;
            d10 = d24;
            d9 = d23;
            d8 = d19;
        }
        return (dAtan3 - d9) * 6356752.3142d * d8;
    }

    public static Set b() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }
}
