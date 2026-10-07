package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import one.me.android.externalcallback.ExternalCallbackHelper$ExternalCallbackException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ui6 {
    public static final nd6 a = new nd6(0);

    public static dw8 a(f9i f9iVar) {
        return new dw8(1, f9iVar);
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (z5h.K0(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static String c(Bundle bundle, String str) {
        String string;
        String strEncodeToString;
        if (bundle != null && (string = bundle.getString("DIGITAL_ID")) != null) {
            long j = bundle.getLong("USER_ID");
            try {
                byte[] byteArray = bundle.getByteArray("PHOTO_DATA");
                if (byteArray != null && (strEncodeToString = Base64.encodeToString(byteArray, 2)) != null) {
                    StringBuilder sbB = nbh.B(j, "&digitalId=", string, "&oid=");
                    sbB.append("&photo=");
                    sbB.append(strEncodeToString);
                    return str.concat(sbB.toString());
                }
            } catch (Throwable th) {
                String name = ui6.class.getName();
                ExternalCallbackHelper$ExternalCallbackException externalCallbackHelper$ExternalCallbackException = new ExternalCallbackHelper$ExternalCallbackException(th);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Couldn't extract photo for uri ".concat(str), externalCallbackHelper$ExternalCallbackException);
                    }
                }
            }
        }
        return str;
    }
}
