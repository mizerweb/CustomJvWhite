package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jr {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
