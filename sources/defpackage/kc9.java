package defpackage;

import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import one.me.sdk.android.tools.locale.ResourceLangException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc9 {
    public static final pw a = lvb.J("ru", "be", "bg", "az", "hy", "kk", "ky", "tg", "uz", "tk", "ro");

    public static final String a(Context context) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            LocaleList locales2 = Resources.getSystem().getConfiguration().getLocales();
            if (!locales2.isEmpty()) {
                Locale localeD = d(locales2);
                if (localeD != null) {
                    return localeD.toLanguageTag();
                }
            } else {
                if (Build.VERSION.SDK_INT < 33) {
                    gm0.V("LocaleHelper", "Can't get resource lang", new ResourceLangException("resource lang not get on sdk < 33"));
                    return null;
                }
                LocaleManager localeManagerA = q4.a(context.getSystemService(q4.i()));
                LocaleList applicationLocales = localeManagerA.getApplicationLocales();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "LocaleHelper", qv1.l("getCurrentResourcesLang, appLocales: ", applicationLocales.toLanguageTags(), ", systemLocales: ", localeManagerA.getSystemLocales().toLanguageTags()), null);
                    }
                }
                if (applicationLocales.isEmpty()) {
                    gm0.V("LocaleHelper", "Can't get resource lang", new ResourceLangException("resource lang not get on sdk >= 33"));
                    return null;
                }
                Locale localeD2 = d(applicationLocales);
                if (localeD2 != null) {
                    return localeD2.toLanguageTag();
                }
            }
        } else {
            Locale localeD3 = d(locales);
            if (localeD3 != null) {
                return localeD3.toLanguageTag();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public static final String b(Context context) {
        mc9 mc9Var;
        je9 je9Var = je9.d;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            LocaleManager localeManagerA = q4.a(context.getSystemService(q4.i()));
            LocaleList applicationLocales = localeManagerA.getApplicationLocales();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", qv1.l("getInAppLang: appLocales: ", applicationLocales.toLanguageTags(), ", systemLocales: ", localeManagerA.getSystemLocales().toLanguageTags()), null);
            }
            Locale localeD = d(applicationLocales);
            if (localeD != null) {
                return localeD.toLanguageTag();
            }
            return null;
        }
        if (i >= 33) {
            Object objB = kr.b();
            if (objB != null) {
                mc9Var = new mc9(new nc9(jr.a(objB)));
            } else {
                mc9Var = mc9.b;
            }
        } else {
            mc9Var = kr.c;
            if (mc9Var == null) {
                mc9Var = mc9.b;
            }
        }
        Locale localeB = mc9Var.c() ? null : mc9Var.b(0);
        String languageTag = localeB != null ? localeB.toLanguageTag() : null;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "LocaleHelper", qv1.k("getInAppLang: ", languageTag), null);
        }
        return languageTag;
    }

    public static final Context c(Context context, String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale.setDefault(localeForLanguageTag);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", "getLocalized context with lang: ".concat(str), null);
            }
        }
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(localeForLanguageTag);
        configuration.setLayoutDirection(localeForLanguageTag);
        return context.createConfigurationContext(configuration);
    }

    public static final Locale d(LocaleList localeList) {
        if (localeList.isEmpty()) {
            return null;
        }
        return localeList.get(0);
    }

    public static final Locale e(Context context) {
        Locale localeD;
        if (Build.VERSION.SDK_INT >= 33 && (localeD = d(q4.a(context.getSystemService(q4.i())).getSystemLocales())) != null) {
            return localeD;
        }
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            gm0.V("LocaleHelper", "getSystemLocale, config.locales is Empty", new ResourceLangException("getSystemLocale didn't get locale from configuration"));
        }
        Locale localeD2 = d(locales);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", qv1.k("system locale: ", localeD2 != null ? localeD2.toLanguageTag() : null), null);
            }
        }
        return localeD2 == null ? Locale.forLanguageTag("ru") : localeD2;
    }

    public static final String f(String str) {
        Object next;
        je9 je9Var = je9.d;
        List list = gc9.a;
        if (list.contains(str)) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", c0a.o("normalizeLangTag, tag=", str, " in supported"), null);
            }
            return str;
        }
        String language = Locale.forLanguageTag(str).getLanguage();
        if (language.length() == 0) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "LocaleHelper", c0a.o("normalizeLangTag, tag=", str, " not parsed, returning default"), null);
            }
            return "ru";
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(Locale.forLanguageTag((String) next).getLanguage(), language));
        String str2 = (String) next;
        if (str2 != null) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "LocaleHelper", "normalizeLangTag, restoredTag=".concat(str2), null);
            }
            return str2;
        }
        String str3 = a.contains(language) ? "ru" : "en";
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, "LocaleHelper", qv1.l("normalizeLangTag, tag=", str, " unsupported, fallback=", str3), null);
        }
        return str3;
    }

    public static final void g(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", "setLocale, language:".concat(str), null);
            }
        }
        kr.i(mc9.a(str));
    }

    public static final void h(Context context, String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", "updateResourcesLegacy, language:".concat(str), null);
            }
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale.setDefault(localeForLanguageTag);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = localeForLanguageTag;
        configuration.setLayoutDirection(localeForLanguageTag);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        if (context instanceof Application) {
            Application application = (Application) context;
            application.onConfigurationChanged(application.getResources().getConfiguration());
        } else if (!(context instanceof ar)) {
            gm0.Y("LocaleHelper", "Can't cast context to application");
        } else {
            ar arVar = (ar) context;
            arVar.getApplication().onConfigurationChanged(arVar.getResources().getConfiguration());
        }
    }

    public static final Object i(Context context, af7 af7Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            return af7Var.invoke();
        }
        String strB = b(context);
        if (strB == null) {
            strB = "ru";
        }
        Object objInvoke = af7Var.invoke();
        Locale localeD = d(context.getResources().getConfiguration().getLocales());
        if (!strB.equals(localeD != null ? localeD.toLanguageTag() : null)) {
            gm0.n("LocaleHelper", "withGuardedLocale, resource broke locale, restoring");
            g(strB);
            h(context, strB);
            h(context.getApplicationContext(), strB);
        }
        return objInvoke;
    }
}
