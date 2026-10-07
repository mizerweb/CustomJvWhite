package com.vk.push.core.remote.config.omicron.fingerprint;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceFingerprint implements OmicronFingerprint {
    public final Context a;
    public final DeviceIdProvider b;

    public DeviceFingerprint(Context context, DeviceIdProvider deviceIdProvider) {
        this.a = context.getApplicationContext();
        this.b = deviceIdProvider;
    }

    @Override // com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        String str;
        Context context = this.a;
        Resources resources = context.getResources();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            str = "none";
        } else {
            str = activeNetworkInfo.getType() == 1 ? "wifi" : "mobile";
        }
        map.put("connection_type", str);
        map.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, this.b.getDeviceId());
        map.put("device_width", Integer.valueOf(resources.getDisplayMetrics().widthPixels));
        map.put("device_height", Integer.valueOf(resources.getDisplayMetrics().heightPixels));
        Locale locale = context.getResources().getConfiguration().locale;
        map.put("lang", locale.getLanguage() + "_" + locale.getCountry());
        map.put(AnalyticsBaseParamsConstantsKt.OS_VERSION, Build.VERSION.RELEASE);
        map.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, new SimpleDateFormat("ZZZZ").format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime()));
        map.put(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, Build.MANUFACTURER + " " + Build.MODEL);
        map.put("sim_mcc", Integer.valueOf(resources.getConfiguration().mcc));
        map.put("sim_mnc", Integer.valueOf(resources.getConfiguration().mnc));
    }
}
