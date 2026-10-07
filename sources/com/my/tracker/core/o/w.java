package com.my.tracker.core.o;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.my.tracker.core.Tracer;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    private final Application a;
    private v b;
    protected boolean c = false;

    public w(Application application) {
        this.a = application;
    }

    private static v a(Application application) {
        Tracer.d("GoogleAdInfoDataProvider: get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            String id = advertisingIdInfo.getId();
            Tracer.d("GoogleAdInfoDataProvider: AId: " + id);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            Tracer.d("GoogleAdInfoDataProvider: AId ad tracking enabled: " + zIsLimitAdTrackingEnabled);
            return new v(id, zIsLimitAdTrackingEnabled);
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                Tracer.d("GoogleAdInfoDataProvider: google AId is not found");
                return null;
            }
            Tracer.d("GoogleAdInfoDataProvider: failed to get google AId", th);
            return null;
        }
    }

    public v a() {
        if (!this.c) {
            this.b = a(this.a);
            this.c = true;
        }
        return this.b;
    }
}
