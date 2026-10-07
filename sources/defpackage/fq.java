package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fq {
    public static final Uri a = Uri.parse("https://api2.ok.ru");

    public static Uri a() {
        return a;
    }

    public static final Uri b(String str) {
        return Uri.parse("ok://api/api/".concat(z5h.I0(str, '.', '/', false)));
    }

    public static final String c(Uri uri) {
        String string = uri.toString();
        if (z5h.K0(string, "ok://api/api/", false)) {
            return z5h.I0(string.substring(13), '/', '.', false);
        }
        ore.p(zo5.l(uri, "Unknown uri "));
        return null;
    }
}
