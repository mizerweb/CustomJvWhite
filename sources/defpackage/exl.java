package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class exl {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static boolean b() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Google") && !Build.BRAND.equalsIgnoreCase("Google")) {
            return false;
        }
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.ROOT));
    }

    public static boolean c() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
            while (it.hasNext()) {
                if (z5h.K0(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
