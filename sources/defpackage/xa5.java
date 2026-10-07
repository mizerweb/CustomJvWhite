package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xa5 implements xwd {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa5(ov6 ov6Var, Context context) {
        this.c = ov6Var;
        this.b = context;
    }

    @Override // defpackage.xwd
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.a;
        Context context = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new uik(context, (String) obj);
            default:
                ov6 ov6Var = (ov6) obj;
                String strC = ov6Var.c();
                i25 i25Var = new i25();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strC), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), np0.m)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                i25Var.a = z;
                return i25Var;
        }
    }

    public /* synthetic */ xa5(Context context, String str) {
        this.b = context;
        this.c = str;
    }
}
