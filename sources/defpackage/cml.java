package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cml {
    public static void a(Context context) throws Throwable {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (fml.b(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), np0.m)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            new jm(context, z, new qjh(), 4).run();
        } else {
            gwl.e(null);
        }
    }

    public static final kx2 b(he3 he3Var) {
        switch (he3Var) {
            case ACTIVE:
                return kx2.a;
            case LEFT:
                return kx2.b;
            case REMOVED:
                return kx2.d;
            case BLOCKED:
                return kx2.g;
            case REMOVING:
                return kx2.e;
            case CLOSED:
                return kx2.f;
            case HIDDEN:
                return kx2.h;
            default:
                ore.o();
                return null;
        }
    }
}
