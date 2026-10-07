package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lz8 {
    public static String a(Date date) {
        String str;
        synchronized (oc9.u) {
            if (oc9.t == null) {
                oc9.t = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.ENGLISH);
            }
            str = oc9.t.format(date);
        }
        return str;
    }
}
