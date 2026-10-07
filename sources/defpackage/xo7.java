package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo7 {
    public static boolean b;
    public static boolean c;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:101:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4 A[RETURN] */
    public static int a(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (oc9.x) {
                try {
                    if (!oc9.y) {
                        oc9.y = true;
                        try {
                            Bundle bundle = q0k.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), np0.m).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                oc9.z = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = oc9.z;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        if (tre.k0(context)) {
            z = false;
        } else {
            if (tre.j == null) {
                tre.j = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (tre.j.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (i < 0) {
            ore.a();
            return 0;
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            zo7.i(context);
            if (!zo7.w(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z) {
                    if (z) {
                    }
                    if (iyg.f(packageInfo2.versionCode) < iyg.f(i)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    int i3 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i3);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                yab.s(packageInfo);
                if (!zo7.w(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (iyg.f(packageInfo2.versionCode) < iyg.f(i)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        int i4 = packageInfo2.versionCode;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i4).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i);
                        sb2.append(" but found ");
                        sb2.append(i4);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }
}
