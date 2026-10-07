package com.vk.push.core.data.source;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import defpackage.qt4;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/data/source/DeviceInfoDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getDeviceManufacturer", "()Ljava/lang/String;", "getDeviceModel", "getOSVersion", "getTimeZone", "getDefaultLocale", "getCountryId", "getRegionId", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceInfoDataSource {
    public final Context a;

    public DeviceInfoDataSource(Context context) {
        this.a = context;
    }

    public final String getCountryId() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(TelephonyManager.class);
        if (telephonyManager != null) {
            try {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    return networkCountryIso.toUpperCase(Locale.ROOT);
                }
            } catch (UnsupportedOperationException unused) {
                String id = TimeZone.getDefault().getID();
                try {
                    return android.icu.util.TimeZone.getRegion(id);
                } catch (Throwable unused2) {
                    return id;
                }
            }
        }
        String id2 = TimeZone.getDefault().getID();
        try {
            return android.icu.util.TimeZone.getRegion(id2);
        } catch (Throwable unused3) {
            return id2;
        }
    }

    public final String getDefaultLocale() {
        return Locale.getDefault().getDisplayName();
    }

    public final String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public final String getDeviceModel() {
        return Build.MODEL;
    }

    public final String getOSVersion() {
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (SDK ");
        return qt4.p(sb, Build.VERSION.SDK_INT, ')');
    }

    public final String getRegionId() {
        String id = TimeZone.getDefault().getID();
        try {
            return android.icu.util.TimeZone.getRegion(id);
        } catch (Throwable unused) {
            return id;
        }
    }

    public final String getTimeZone() {
        return TimeZone.getDefault().getID();
    }
}
