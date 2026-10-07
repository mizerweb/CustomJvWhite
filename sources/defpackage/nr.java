package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nr {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static mc9 b(Configuration configuration) {
        return mc9.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(mc9 mc9Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(mc9Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, mc9 mc9Var) {
        configuration.setLocales(LocaleList.forLanguageTags(mc9Var.a.a.toLanguageTags()));
    }
}
