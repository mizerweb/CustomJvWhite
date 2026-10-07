package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xnf {
    public static final String b;
    public static final String c;
    public final wnf a;

    static {
        sz9.a("media3.session");
        String str = vqi.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public xnf(Context context, ComponentName componentName) {
        int i;
        int i2;
        int i3;
        lvb.W(context, "context must not be null");
        PackageManager packageManager = context.getPackageManager();
        try {
            i = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        int i4 = i;
        if (!a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            if (a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
                i3 = 1;
            } else {
                if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                    qr7.i(componentName, ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.", "Failed to resolve SessionToken for ");
                    throw null;
                }
                i2 = 101;
            }
            if (i2 != 101) {
                this.a = new ynf(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
            } else {
                this.a = new znf(i4, componentName);
            }
        }
        i3 = 2;
        i2 = i3;
        if (i2 != 101) {
            this.a = new ynf(i4, i2, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
        } else {
            this.a = new znf(i4, componentName);
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, np0.m);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        wnf wnfVar = this.a;
        boolean z = wnfVar instanceof ynf;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, wnfVar.f());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xnf) {
            return this.a.equals(((xnf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public xnf(int i, int i2, int i3, String str, e38 e38Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = e38Var.asBinder();
        bundle.getClass();
        this.a = new ynf(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }
}
