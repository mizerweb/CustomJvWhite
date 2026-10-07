package com.my.tracker.core.o;

import android.app.Application;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    static volatile String a;

    public static String a(Application application) {
        String strC;
        String str = a;
        if (str != null) {
            return str;
        }
        synchronized (u0.class) {
            try {
                strC = a;
                if (strC == null) {
                    strC = e0.a(application).c("instanceId");
                    if (TextUtils.isEmpty(strC)) {
                        strC = UUID.randomUUID().toString();
                        e0.a(application).a("instanceId", strC);
                        a = strC;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strC;
    }
}
