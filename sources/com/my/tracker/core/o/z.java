package com.my.tracker.core.o;

import android.app.Application;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private final Application a;
    private y b = null;
    protected boolean c = false;

    public z(Application application) {
        this.a = application;
    }

    private static y a(Application application) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            String id = advertisingIdInfo.getId();
            Tracer.d("HuaweiAdInfoDataProvider: oaid: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            Tracer.d("HuaweiAdInfoDataProvider: oaid tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new y(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                Tracer.d("HuaweiAdInfoDataProvider: huawei AId is not found");
                return null;
            }
            Tracer.d("HuaweiAdInfoDataProvider: failed to get huawei AId (it's OK), message=" + th.getMessage());
            return null;
        }
    }

    public y a() {
        if (!this.c) {
            this.b = a(this.a);
            this.c = true;
        }
        return this.b;
    }
}
