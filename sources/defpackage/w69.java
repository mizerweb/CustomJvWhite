package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class w69 {
    public static Uri b(long j, String str) {
        return Uri.parse(str).buildUpon().appendPath(wdl.c(11, ByteBuffer.allocate(8).putLong(j).array())).build();
    }

    public static long e(String str) {
        Uri uri = Uri.parse(str);
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() == 2) {
            String str2 = pathSegments.get(0);
            if (!TextUtils.isEmpty(str2) && TextUtils.equals(str2, "stickerset")) {
                String str3 = pathSegments.get(1);
                if (!TextUtils.isEmpty(str3)) {
                    int iIndexOf = str3.indexOf("-");
                    try {
                        return iIndexOf > 0 ? Long.parseLong(str3.substring(0, iIndexOf)) : Long.parseLong(str3);
                    } catch (NumberFormatException e) {
                        gm0.V("w69", String.format(Locale.ENGLISH, "Can't parse to long %s from uri %s", str3, uri), e);
                    }
                }
            }
        }
        return 0L;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme("https").authority("max.ru").appendPath(str.replace("@", "")).build().toString();
    }

    public final v69 c(Uri uri, fdd fddVar) {
        boolean zTest;
        int i;
        List<String> pathSegments = f(uri).getPathSegments();
        int i2 = 0;
        String str = !pathSegments.isEmpty() ? pathSegments.get(0) : null;
        if (TextUtils.isEmpty(str)) {
            zTest = false;
        } else {
            try {
                zTest = fddVar.test(str);
            } catch (Throwable th) {
                gm0.V("w69", "getLinkEntity: privacyPredicate fail", th);
                zTest = false;
            }
        }
        if (zTest) {
            while (true) {
                if (i2 >= pathSegments.size()) {
                    i = -1;
                    break;
                }
                if (pathSegments.get(i2).equals("join")) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
            if (i != -1 && i < pathSegments.size()) {
                str = pathSegments.get(i);
            }
        }
        return new v69(str, zTest);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098 A[RETURN] */
    public final boolean d(String str) {
        Uri uri;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
            List<String> pathSegments = uri.getPathSegments();
            if (!TextUtils.isEmpty(uri.getScheme())) {
                String host = uri.getHost();
                if (!uri.getScheme().equalsIgnoreCase("max") ? !(TextUtils.isEmpty(host) || pathSegments.size() <= 0 || (!host.equalsIgnoreCase("max.ru") && !host.equalsIgnoreCase("api-test.oneme.ru") && !host.equalsIgnoreCase("api-tg.oneme.ru"))) : !(TextUtils.isEmpty(host) || pathSegments.size() <= 0 || (!host.equalsIgnoreCase("chat") && !host.equalsIgnoreCase("api")))) {
                    return true;
                }
            } else if (!pathSegments.isEmpty()) {
                String str2 = pathSegments.get(0);
                if (!TextUtils.isEmpty(str2) && pathSegments.size() > 1 && (str2.equalsIgnoreCase("max.ru") || str2.equalsIgnoreCase("api-test.oneme.ru") || str2.equalsIgnoreCase("api-tg.oneme.ru"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    public final Uri f(Uri uri) {
        String string = uri.toString();
        if (!string.startsWith(":") && !"max".equalsIgnoreCase(uri.getScheme())) {
            String host = uri.getHost();
            if (host == null && TextUtils.isEmpty(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                host = pathSegments.isEmpty() ? null : pathSegments.get(0);
            }
            if (host != null && (host.equalsIgnoreCase("max.ru") || host.equalsIgnoreCase("api-test.oneme.ru") || host.equalsIgnoreCase("api-tg.oneme.ru"))) {
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
            }
        } else if (string.endsWith("/") && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        if (string.startsWith(":") || string.startsWith("max://:")) {
            return wk8.e(string.replace("max://:", ":"));
        }
        if (string.startsWith("@")) {
            return uri;
        }
        if (!string.contains("://") && TextUtils.isEmpty(uri.getScheme())) {
            return Uri.parse("https://".concat(string));
        }
        return Uri.parse(string);
    }
}
