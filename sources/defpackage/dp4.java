package defpackage;

import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dp4 {
    public static final kn a = new kn(1);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static boolean a(Uri uri, String str) {
        if (b(uri, str)) {
            if (uri == null) {
                return true;
            }
            long jLongValue = ((Long) a.get()).longValue();
            ConcurrentHashMap concurrentHashMap = b;
            concurrentHashMap.entrySet().removeIf(new cp4(jLongValue, 0));
            Long l = (Long) concurrentHashMap.get(uri.toString());
            if (l == null || l.longValue() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Uri uri, String str) {
        if (uri == null || !"content".equals(uri.getScheme())) {
            return false;
        }
        String authority = uri.getAuthority();
        if (ch3.r(authority)) {
            return false;
        }
        return authority.startsWith(str + ".");
    }

    public static void c(Uri uri) {
        long jLongValue = ((Long) a.get()).longValue() + 300000;
        b.put(uri.toString(), Long.valueOf(jLongValue));
    }
}
