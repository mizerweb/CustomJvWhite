package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jc9 {
    public final ny8 a;

    public jc9(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final et3 a() {
        return (et3) this.a.getValue();
    }

    public final String b(Context context) {
        je9 je9Var = je9.d;
        s7f s7fVar = (s7f) a();
        if (((Boolean) s7fVar.b0.m(s7fVar, s7f.j0[50])).booleanValue()) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", qv1.k("getCurrentAppLang, client.prefs: ", ((s7f) a()).m()), null);
            }
            return ((s7f) a()).m();
        }
        String strB = kc9.b(context);
        Locale localeE = strB == null ? kc9.e(context) : Locale.forLanguageTag(strB);
        String strF = kc9.f(localeE.toLanguageTag());
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "LocaleHelper", "getCurrentAppLang: inAppLang: " + strB + ", locale: " + localeE + ", selectedLang: " + strF, null);
        }
        return strF;
    }

    public final Context c(Context context) {
        String strB = b(context);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "LocaleHelper", qv1.k("getLocalized context with lang: ", strB), null);
            }
        }
        return kc9.c(context, strB);
    }

    public final void d(Context context, String str) {
        String strF = kc9.f(str);
        kc9.g(strF);
        ((s7f) a()).F(strF);
        if (Build.VERSION.SDK_INT < 33) {
            try {
                File[] fileArrListFiles = context.getFilesDir().listFiles(new hc9(0));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                new File(context.getFilesDir(), "locale_" + strF).createNewFile();
            } catch (IOException e) {
                gm0.V("LocaleHelper", "updateLocale: io exception while updating lang file", e);
            } catch (SecurityException e2) {
                gm0.V("LocaleHelper", "updateLocale: security exception while updating lang file", e2);
            }
            kc9.h(context.getApplicationContext(), ((s7f) a()).m());
        }
        context.sendBroadcast(new Intent("action.LOCALE_CHANGED"));
    }
}
