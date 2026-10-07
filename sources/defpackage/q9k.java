package defpackage;

import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.feature.FeatureManager;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class q9k {
    public final qd2 a;
    public final DeviceInfoDataSource b;
    public final DeviceIdRepository c;
    public final FeatureManager d;
    public final ny8 e = rx8.P(3, new qv(11, this));

    public q9k(qd2 qd2Var, yki ykiVar, DeviceInfoDataSource deviceInfoDataSource, DeviceIdRepository deviceIdRepository, FeatureManager featureManager) {
        this.a = qd2Var;
        this.b = deviceInfoDataSource;
        this.c = deviceIdRepository;
        this.d = featureManager;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(lq4 lq4Var) {
        f9k f9kVar;
        ClientId clientId;
        String deviceManufacturer;
        String deviceModel;
        String oSVersion;
        String timeZone;
        String defaultLocale;
        String str;
        String str2;
        q9k q9kVar;
        String str3;
        String str4;
        LinkedHashMap linkedHashMapS0;
        q9k q9kVar2 = this;
        if (lq4Var instanceof f9k) {
            f9kVar = (f9k) lq4Var;
            int i = f9kVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9kVar.q = i - Integer.MIN_VALUE;
            } else {
                f9kVar = new f9k(q9kVar2, lq4Var);
            }
        } else {
            f9kVar = new f9k(q9kVar2, lq4Var);
        }
        Object obj = f9kVar.o;
        int i2 = f9kVar.q;
        if (i2 != 0) {
            if (i2 == 1) {
                q9kVar2 = f9kVar.d;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = f9kVar.n;
                str4 = f9kVar.m;
                str2 = f9kVar.l;
                str = f9kVar.k;
                defaultLocale = f9kVar.j;
                timeZone = f9kVar.i;
                oSVersion = f9kVar.h;
                deviceModel = f9kVar.g;
                deviceManufacturer = f9kVar.f;
                clientId = f9kVar.e;
                q9kVar = f9kVar.d;
                ch3.d0(obj);
            }
            linkedHashMapS0 = wm9.S0(new ylc("sdk_version", str2), new ylc(AnalyticsBaseParamsConstantsKt.SDK_NAME, str4), new ylc(CallAnalyticsApiRequest.KEY_SDK_TYPE, str3), new ylc(AnalyticsBaseParamsConstantsKt.OS_VERSION, oSVersion), new ylc(AnalyticsBaseParamsConstantsKt.OS_LANG, defaultLocale), new ylc(AnalyticsBaseParamsConstantsKt.TIMEZONE, timeZone), new ylc(AnalyticsBaseParamsConstantsKt.MANUFACTURER, deviceManufacturer), new ylc(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new ylc(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) q9kVar.e.getValue()), new ylc(AnalyticsBaseParamsConstantsKt.REGION_ID, str), new ylc(AnalyticsBaseParamsConstantsKt.DEVICE_ID, (String) obj), new ylc(AnalyticsBaseParamsConstantsKt.SEGMENTS, q9kVar.d.getSegments()));
            if (clientId != null) {
                linkedHashMapS0.put(clientId.getClientIdType().name().toLowerCase(Locale.ROOT), clientId.getClientIdValue());
            }
            return linkedHashMapS0;
        }
        ch3.d0(obj);
        f9kVar.d = q9kVar2;
        f9kVar.q = 1;
        obj = null;
        clientId = (ClientId) obj;
        DeviceInfoDataSource deviceInfoDataSource = q9kVar2.b;
        qd2 qd2Var = q9kVar2.a;
        deviceManufacturer = deviceInfoDataSource.getDeviceManufacturer();
        deviceModel = deviceInfoDataSource.getDeviceModel();
        oSVersion = deviceInfoDataSource.getOSVersion();
        timeZone = deviceInfoDataSource.getTimeZone();
        defaultLocale = deviceInfoDataSource.getDefaultLocale();
        String regionId = deviceInfoDataSource.getRegionId();
        String str5 = qd2Var.a;
        DeviceIdRepository deviceIdRepository = q9kVar2.c;
        f9kVar.d = q9kVar2;
        f9kVar.e = clientId;
        f9kVar.f = deviceManufacturer;
        f9kVar.g = deviceModel;
        f9kVar.h = oSVersion;
        f9kVar.i = timeZone;
        f9kVar.j = defaultLocale;
        f9kVar.k = regionId;
        f9kVar.l = "7.2.0";
        f9kVar.m = "ru.rustore.sdk:pushclient";
        f9kVar.n = str5;
        f9kVar.q = 2;
        Object deviceId = deviceIdRepository.getDeviceId(f9kVar);
        hu4 hu4Var = hu4.a;
        if (deviceId == hu4Var) {
            return hu4Var;
        }
        str = regionId;
        obj = deviceId;
        str2 = "7.2.0";
        q9kVar = q9kVar2;
        str3 = str5;
        str4 = "ru.rustore.sdk:pushclient";
        linkedHashMapS0 = wm9.S0(new ylc("sdk_version", str2), new ylc(AnalyticsBaseParamsConstantsKt.SDK_NAME, str4), new ylc(CallAnalyticsApiRequest.KEY_SDK_TYPE, str3), new ylc(AnalyticsBaseParamsConstantsKt.OS_VERSION, oSVersion), new ylc(AnalyticsBaseParamsConstantsKt.OS_LANG, defaultLocale), new ylc(AnalyticsBaseParamsConstantsKt.TIMEZONE, timeZone), new ylc(AnalyticsBaseParamsConstantsKt.MANUFACTURER, deviceManufacturer), new ylc(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new ylc(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) q9kVar.e.getValue()), new ylc(AnalyticsBaseParamsConstantsKt.REGION_ID, str), new ylc(AnalyticsBaseParamsConstantsKt.DEVICE_ID, (String) obj), new ylc(AnalyticsBaseParamsConstantsKt.SEGMENTS, q9kVar.d.getSegments()));
        if (clientId != null) {
            linkedHashMapS0.put(clientId.getClientIdType().name().toLowerCase(Locale.ROOT), clientId.getClientIdValue());
        }
        return linkedHashMapS0;
    }
}
