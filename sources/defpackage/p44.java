package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class p44 {
    private static final bo7 a = new bo7("CommonUtils", "");

    private p44() {
    }

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            a.b("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
