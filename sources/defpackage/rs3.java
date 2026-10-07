package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public final class rs3 {
    public static final /* synthetic */ zv8[] a;

    static {
        dwd dwdVar = new dwd(rs3.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        zfe.a.getClass();
        a = new zv8[]{dwdVar};
    }

    public static String a(Uri uri) {
        Object poeVar;
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        try {
            Map mapD = qe7.D(uri);
            String str = (String) mapD.get("bid");
            String str2 = (String) mapD.get("t");
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (String str3 : queryParameterNames) {
                    if (!cqk.d(str3, ClientCookie.EXPIRES_ATTR)) {
                        builderClearQuery.appendQueryParameter(str3, (String) mapD.get(str3));
                    }
                }
                poeVar = builderClearQuery.build().toString();
            } else {
                fbc fbcVar = ss3.g;
                zv8 zv8Var = a[0];
                StringBuilder sb = (StringBuilder) ((oqh) fbcVar.c).get();
                sb.setLength(0);
                sb.append("ok-image-cache");
                sb.append(':');
                sb.append("bid");
                sb.append('=');
                sb.append(str);
                sb.append('&');
                sb.append('t');
                sb.append('=');
                sb.append(str2);
                poeVar = sb.toString();
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object string = uri.toString();
        if (poeVar instanceof poe) {
            poeVar = string;
        }
        return (String) poeVar;
    }
}
