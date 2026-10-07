package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.nf2;
import defpackage.pi0;

/* JADX INFO: loaded from: classes2.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    public static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(nf2 nf2Var, pi0 pi0Var) {
        String str = Build.BRAND;
        if ("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            return pi0Var == pi0.g || pi0Var == pi0.h;
        }
        return (("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || f() || e())))) && pi0Var == pi0.g;
    }
}
