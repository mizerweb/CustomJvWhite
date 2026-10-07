package com.my.tracker.core;

import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.core.o.t0;
import com.my.tracker.core.utils.Consumer;
import defpackage.qt4;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class TrackerConfig {
    public static final boolean KID_MODE_DEFAULT = false;
    private final MyTrackerParams a = new MyTrackerParams();
    final List b = new ArrayList();
    private String c = "";
    private AntiFraudConfig d = AntiFraudConfig.newBuilder().build();
    private volatile boolean e = true;
    private volatile int f = 0;
    private volatile boolean g = true;
    private volatile boolean h = true;
    private volatile boolean i = true;
    private volatile boolean j = true;
    private volatile boolean k = false;
    private volatile int l = 30;
    private volatile int m = 0;
    private volatile int n = 900;
    private volatile String o = null;
    private volatile String p = null;
    private volatile MyTrackerConfig.InstalledPackagesProvider q = null;
    private volatile MyTrackerConfig.OkHttpClientProvider r = null;
    private volatile Executor s = null;
    private volatile String t = "";
    private volatile String u = "";
    private volatile String v = "";
    private volatile String w = "";
    private volatile String x = "";
    private volatile MyTracker.AttributionListener y = null;
    private volatile Handler z = null;

    public static class ReadOnlyCopy {
        public final AntiFraudConfig antiFraudConfig;
        public final int bufferingPeriod;
        public final int forcingPeriod;
        public final String id;
        public final MyTrackerConfig.InstalledPackagesProvider installedProvider;
        public final boolean isAutotrackingPurchaseEnabled;
        public final boolean isTrackingEnvironmentEnabled;
        public final boolean isTrackingLaunchEnabled;
        public final boolean isTrackingPreinstallEnabled;
        public final boolean isTrackingPreinstallThirdPartyEnabled;
        public final int launchTimeout;
        public final int locationTrackingMode;
        public final MyTrackerParams.ReadOnlyCopy trackerParams;

        public ReadOnlyCopy(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, MyTrackerParams.ReadOnlyCopy readOnlyCopy, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.id = str;
            this.launchTimeout = i;
            this.bufferingPeriod = i2;
            this.forcingPeriod = i3;
            this.locationTrackingMode = i4;
            this.isTrackingLaunchEnabled = z;
            this.isTrackingEnvironmentEnabled = z2;
            this.isAutotrackingPurchaseEnabled = z3;
            this.isTrackingPreinstallEnabled = z4;
            this.isTrackingPreinstallThirdPartyEnabled = z5;
            this.trackerParams = readOnlyCopy;
            this.antiFraudConfig = antiFraudConfig;
            this.installedProvider = installedPackagesProvider;
        }
    }

    public TrackerConfig() {
        b();
    }

    private void b(String str) {
        Tracer.d("setUrls to host=" + str);
        this.t = t0.a(str, "v3/");
        this.u = t0.a("ip4", str, null);
        this.x = t0.a("ts", str, "mobile/v1");
        this.v = t0.a("mlapi", str, null);
        this.w = t0.a("beta-ml", str, null);
    }

    public static TrackerConfig newConfig() {
        return new TrackerConfig();
    }

    public ReadOnlyCopy a() {
        return new ReadOnlyCopy(this.c, this.l, this.n, this.m, this.f, this.e, this.g, this.h, this.i, this.j, this.a.a(), this.d, this.q);
    }

    public void addKidModeChangeListener(Consumer<Boolean> consumer, Consumer<Boolean> consumer2) {
        synchronized (this.b) {
            consumer.accept(Boolean.valueOf(this.k));
            this.b.add(consumer2);
        }
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.d;
    }

    public String getApkPreinstallParams() {
        return this.o;
    }

    public Handler getAttributionHandler() {
        return this.z;
    }

    public MyTracker.AttributionListener getAttributionListener() {
        return this.y;
    }

    public Executor getBackgroundExecutors() {
        return this.s;
    }

    public int getBufferingPeriod() {
        return this.n;
    }

    public int getForcingPeriod() {
        return this.m;
    }

    public String getId() {
        return this.c;
    }

    public MyTrackerConfig.InstalledPackagesProvider getInstalledPackagesProvider() {
        return this.q;
    }

    public String getIpv4TrackerUrl() {
        return this.u;
    }

    public int getLaunchTimeout() {
        return this.l;
    }

    public int getLocationTrackingMode() {
        return this.f;
    }

    public String getMlBetaTrackerUrl() {
        return this.w;
    }

    public String getMlProdTrackerUrl() {
        return this.v;
    }

    public MyTrackerParams getMyTrackerParams() {
        return this.a;
    }

    public MyTrackerConfig.OkHttpClientProvider getOkHttpClientProvider() {
        return this.r;
    }

    public String getTimeSpentUrl() {
        return this.x;
    }

    public String getTrackerUrl() {
        return this.t;
    }

    public String getVendorAppPackage() {
        return this.p;
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.h;
    }

    public boolean isKidMode() {
        return this.k;
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.g;
    }

    public boolean isTrackingLaunchEnabled() {
        return this.e;
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.i;
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.j;
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.d = antiFraudConfig;
    }

    public void setApkPreinstallParams(String str) {
        this.o = str;
    }

    public void setAttributionListener(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.y = attributionListener;
        this.z = handler;
    }

    public void setAutotrackingPurchaseEnabled(boolean z) {
        this.h = z;
    }

    public void setBackgroundExecutors(Executor executor) {
        this.s = executor;
    }

    public void setBufferingPeriod(int i) {
        int i2 = 86400;
        if (i <= 86400) {
            i2 = 1;
            if (i < 1) {
                Tracer.d("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to min 1");
            }
            this.n = i;
        }
        Tracer.d("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to max 86400");
        i = i2;
        this.n = i;
    }

    public void setDefaultVendorAppPackage() {
        this.p = "com.my.games.vendorapp";
    }

    public void setForcingPeriod(int i) {
        if (i > 432000) {
            Tracer.d("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.m = 432000;
            return;
        }
        if (i >= 0) {
            this.m = i;
            return;
        }
        Tracer.d("Invalid forcingPeriod value " + i + ", forcingPeriod set to min 0");
        this.m = 0;
    }

    public void setInstalledPackagesProvider(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.q = installedPackagesProvider;
    }

    public void setKidMode(boolean z) {
        a(z);
        this.k = z;
    }

    public void setLaunchTimeout(int i) {
        int i2 = 7200;
        if (i <= 7200) {
            i2 = 30;
            if (i < 30) {
                Tracer.d("Invalid launchTimeout value " + i + ", timeout set to min 30");
            }
            this.l = i;
        }
        Tracer.d("Invalid launchTimeout value " + i + ", timeout set to max 7200");
        i = i2;
        this.l = i;
    }

    public void setLocationTrackingMode(int i) {
        this.f = i;
    }

    public void setOkHttpClientProvider(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.r = okHttpClientProvider;
    }

    public void setProxyHost(String str) {
        String strSubstring;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                Tracer.i("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                b();
                return;
            }
            Tracer.i("setProxyHost: try to set proxy host = " + str);
            int iIndexOf = str.indexOf("://");
            if (iIndexOf > 0) {
                Tracer.i("setProxyHost: detected custom schema, will be suppressed");
                strSubstring = str.substring(iIndexOf + 3);
            } else {
                strSubstring = str;
            }
            URI uri = new URI(t0.a(strSubstring, null));
            if (uri.getUserInfo() != null) {
                Tracer.i("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                Tracer.i("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + ":" + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                Tracer.i("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            b(host);
            Tracer.i("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th) {
            StringBuilder sbV = qt4.v("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");
            sbV.append(th.getMessage());
            Tracer.i(sbV.toString());
            b();
        }
    }

    public void setTrackingEnvironmentEnabled(boolean z) {
        this.g = z;
    }

    public void setTrackingLaunchEnabled(boolean z) {
        this.e = z;
    }

    public void setTrackingPreinstallEnabled(boolean z) {
        this.i = z;
    }

    public void setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.j = z;
    }

    public void setVendorAppPackage(String str) {
        this.p = str;
    }

    public void a(String str) {
        this.c = str;
    }

    private void a(boolean z) {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(Boolean.valueOf(z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        b("tracker-api.vk-analytics.ru");
    }
}
