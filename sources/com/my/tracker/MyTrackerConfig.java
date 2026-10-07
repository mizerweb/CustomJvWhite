package com.my.tracker;

import android.content.pm.PackageInfo;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import defpackage.qsb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class MyTrackerConfig {
    private final TrackerConfig a;

    /* JADX INFO: loaded from: classes2.dex */
    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    @FunctionalInterface
    public interface Logger {
        void log(int i, String str, Throwable th);
    }

    public interface OkHttpClientProvider {
        qsb getOkHttpClient();
    }

    private MyTrackerConfig(TrackerConfig trackerConfig) {
        this.a = trackerConfig;
    }

    public static MyTrackerConfig a(TrackerConfig trackerConfig) {
        return new MyTrackerConfig(trackerConfig);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.a.getAntiFraudConfig();
    }

    public String getApkPreinstallParams() {
        return this.a.getApkPreinstallParams();
    }

    public int getBufferingPeriod() {
        return this.a.getBufferingPeriod();
    }

    public int getForcingPeriod() {
        return this.a.getForcingPeriod();
    }

    public String getId() {
        return this.a.getId();
    }

    public int getLaunchTimeout() {
        return this.a.getLaunchTimeout();
    }

    public int getLocationTrackingMode() {
        return this.a.getLocationTrackingMode();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.a.getVendorAppPackage();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.a.isAutotrackingPurchaseEnabled();
    }

    public boolean isKidMode() {
        return this.a.isKidMode();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.a.isTrackingEnvironmentEnabled();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.a.isTrackingLaunchEnabled();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.a.isTrackingPreinstallEnabled();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.a.isTrackingPreinstallThirdPartyEnabled();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.a.setAntiFraudConfig(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.a.setApkPreinstallParams(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.a.setAutotrackingPurchaseEnabled(z);
        return this;
    }

    public MyTrackerConfig setBackgroundExecutor(Executor executor) {
        this.a.setBackgroundExecutors(executor);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.a.setBufferingPeriod(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.a.setDefaultVendorAppPackage();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.a.setForcingPeriod(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.a.setInstalledPackagesProvider(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setKidMode(boolean z) {
        this.a.setKidMode(z);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.a.setLaunchTimeout(i);
        return this;
    }

    public MyTrackerConfig setLocationTrackingMode(int i) {
        this.a.setLocationTrackingMode(i);
        return this;
    }

    public MyTrackerConfig setLogger(Logger logger) {
        Tracer.setLogger(logger);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.a.setOkHttpClientProvider(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.a.setProxyHost(str);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.a.setTrackingEnvironmentEnabled(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.a.setTrackingLaunchEnabled(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.a.setTrackingPreinstallEnabled(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.a.setTrackingPreinstallThirdPartyEnabled(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.a.setVendorAppPackage(str);
        return this;
    }
}
