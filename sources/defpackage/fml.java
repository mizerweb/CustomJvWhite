package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fml {
    public static final Set a(Set set) {
        if (set.equals(w50.v)) {
            return z6a.e;
        }
        if (set.equals(w50.w)) {
            return z6a.f;
        }
        if (set.equals(w50.x)) {
            return z6a.b;
        }
        if (set.equals(w50.y)) {
            return z6a.c;
        }
        if (set.equals(w50.z)) {
            return z6a.d;
        }
        if (set.equals(w50.A)) {
            return z6a.g;
        }
        return set.equals(w50.B) ? z6a.h : z6a.a;
    }

    public static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void c(Context context, yfj yfjVar, boolean z) {
        kam kamVarD;
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesB = b(context);
            if (sharedPreferencesB.contains("proxy_retention") && sharedPreferencesB.getBoolean("proxy_retention", false) == z) {
                return;
            }
            ove oveVar = (ove) yfjVar.c;
            if (oveVar.c.E() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z);
                a9m a9mVarL = a9m.l(oveVar.b);
                synchronized (a9mVarL) {
                    i = a9mVarL.b;
                    a9mVarL.b = i + 1;
                }
                kamVarD = a9mVarL.m(new g3m(i, 4, bundle, 0));
            } else {
                kamVarD = gwl.d(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            kamVarD.e(new sv(1), new dxd(0, context, z));
        }
    }
}
