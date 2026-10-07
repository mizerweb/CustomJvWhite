package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fsl {
    public static gvg a(String str) {
        Object next;
        y1 y1Var = new y1(0, gvg.e);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (!((gvg) next).a.equals(str));
        gvg gvgVar = (gvg) next;
        return gvgVar == null ? gvg.ALL : gvgVar;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        Locale locale = Locale.ROOT;
        if (z5h.K0(str.toLowerCase(locale), "ums", false)) {
            return true;
        }
        return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && z5h.K0(str.toLowerCase(locale), "sp", false);
    }
}
