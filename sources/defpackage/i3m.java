package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i3m {
    public static final ste e = new ste("AppUpdateService", 3);
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final sbm a;
    public final String b;
    public final Context c;
    public final r6m d;

    public i3m(Context context, r6m r6mVar) {
        this.b = context.getPackageName();
        this.c = context;
        this.d = r6mVar;
        ste steVar = ymk.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    ste steVar2 = ymk.a;
                    Object[] objArr = new Object[0];
                    steVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", ste.d(steVar2.b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    String strE = xjg.e(signature.toByteArray());
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strE)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strE)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.a = new sbm(applicationContext != null ? applicationContext : context, e, f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Bundle a(i3m i3mVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        Map mapA = ffl.a();
        bundle3.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(i3mVar.c.getPackageManager().getPackageInfo(i3mVar.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            ste steVar = e;
            steVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ste.d(steVar.b, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
