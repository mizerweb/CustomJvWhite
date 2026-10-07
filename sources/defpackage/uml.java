package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uml implements bg7 {
    public static p2e a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrB2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        tvj.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        tvj.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        tvj.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrB));
        tvj.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrB2));
        return new p2e(z, new HashSet(d(strArrB)), new HashSet(d(strArrB2)));
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            tvj.g("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            tvj.i("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    public static Uri c(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static HashSet d(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!o2e.class.isAssignableFrom(cls)) {
                    tvj.g("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                    cls = null;
                }
            } catch (ClassNotFoundException e) {
                tvj.i("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }
}
