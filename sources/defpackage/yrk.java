package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yrk {
    public static String a(Uri uri, File file, File file2) {
        String str;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            return null;
        }
        if (pathSegments.size() <= 1 || (str = pathSegments.get(0)) == null || str.length() == 0) {
            return null;
        }
        if (!str.equalsIgnoreCase("external_files")) {
            if (!str.equalsIgnoreCase("internal_files")) {
                return null;
            }
            file = file2;
        }
        Uri.Builder builderBuildUpon = Uri.fromFile(file).buildUpon();
        int size = pathSegments.size();
        for (int i = 1; i < size; i++) {
            builderBuildUpon.appendPath(pathSegments.get(i));
        }
        String path = builderBuildUpon.build().getPath();
        if (ku6.p(path)) {
            return path;
        }
        return null;
    }

    public static String b(String str) {
        int iY0;
        if (str == null || str.length() == 0 || (iY0 = r5h.Y0(str, '.', 0, 6)) < 0) {
            return null;
        }
        String strSubstring = str.substring(iY0 + 1);
        if (MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.toLowerCase(Locale.ROOT)) != null) {
            return strSubstring;
        }
        return null;
    }

    public static boolean c(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }
}
