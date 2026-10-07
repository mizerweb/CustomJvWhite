package defpackage;

import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cxl {
    public static boolean a() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (!linkedHashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) linkedHashMap.get(str.toUpperCase(locale));
        if (range != null) {
            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static String b(Object obj) {
        return obj.toString();
    }
}
