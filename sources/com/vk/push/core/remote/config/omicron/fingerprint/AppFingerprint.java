package com.vk.push.core.remote.config.omicron.fingerprint;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import defpackage.qr7;
import java.util.Map;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes2.dex */
public class AppFingerprint implements OmicronFingerprint {
    public final Context a;

    public AppFingerprint(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        Context context = this.a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("app_id", context.getPackageName());
            map.put("app_build", Integer.valueOf(packageInfo.versionCode));
            map.put(CallAnalyticsApiRequest.KEY_APP_VERSION, "7.2.0");
        } catch (PackageManager.NameNotFoundException e) {
            qr7.w(e);
        }
    }
}
