package defpackage;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0092\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010 J\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b0\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b1\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b2\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b3\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b4\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b5\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b6\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b7\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b:\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b=\u0010#¨\u0006>"}, d2 = {"Lxu0;", "", "", "batteryPercent", "cpuTicks", "mobileRxBytes", "mobileTxBytes", "mobileIdleMs", "wifiRxBytes", "wifiTxBytes", "wifiIdleMs", "Lsid;", "processes", "", "networkSourceMask", "maxTemperature", "", "wasBatteryOptimizationsEnabled", "wasBackgroundActivityDisabled", "<init>", "(JJJJJJJJJIJZZLj95;)V", "a", "()J", "f", "g", "h", "i", "j", "k", "l", "m", "b", "()I", DatabaseHelper.COMPRESSED_COLUMN_NAME, "d", "()Z", "e", "n", "(JJJJJJJJJIJZZ)Lxu0;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "p", "q", "t", "u", "s", "A", "B", "z", "w", "I", "v", "r", "Z", "y", "x", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class xu0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long batteryPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long cpuTicks;

    /* JADX INFO: renamed from: c */
    public final long mobileRxBytes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long mobileTxBytes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long mobileIdleMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long wifiRxBytes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long wifiTxBytes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long wifiIdleMs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long processes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int networkSourceMask;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long maxTemperature;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean wasBatteryOptimizationsEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean wasBackgroundActivityDisabled;

    public /* synthetic */ xu0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, long j10, boolean z, boolean z2, int i2, j95 j95Var) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? 0L : j4, (i2 & 16) != 0 ? 0L : j5, (i2 & 32) != 0 ? 0L : j6, (i2 & 64) != 0 ? 0L : j7, (i2 & np0.m) != 0 ? 0L : j8, (i2 & np0.n) != 0 ? sid.INSTANCE.a(0L) : j9, (i2 & np0.o) != 0 ? 0 : i, (i2 & 1024) != 0 ? 0L : j10, (i2 & np0.q) != 0 ? false : z, (i2 & np0.r) == 0 ? z2 : false, null);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getWifiRxBytes() {
        return this.wifiRxBytes;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getWifiTxBytes() {
        return this.wifiTxBytes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBatteryPercent() {
        return this.batteryPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNetworkSourceMask() {
        return this.networkSourceMask;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMaxTemperature() {
        return this.maxTemperature;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWasBatteryOptimizationsEnabled() {
        return this.wasBatteryOptimizationsEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWasBackgroundActivityDisabled() {
        return this.wasBackgroundActivityDisabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) other;
        return this.batteryPercent == xu0Var.batteryPercent && this.cpuTicks == xu0Var.cpuTicks && this.mobileRxBytes == xu0Var.mobileRxBytes && this.mobileTxBytes == xu0Var.mobileTxBytes && this.mobileIdleMs == xu0Var.mobileIdleMs && this.wifiRxBytes == xu0Var.wifiRxBytes && this.wifiTxBytes == xu0Var.wifiTxBytes && this.wifiIdleMs == xu0Var.wifiIdleMs && sid.d(this.processes, xu0Var.processes) && this.networkSourceMask == xu0Var.networkSourceMask && this.maxTemperature == xu0Var.maxTemperature && this.wasBatteryOptimizationsEnabled == xu0Var.wasBatteryOptimizationsEnabled && this.wasBackgroundActivityDisabled == xu0Var.wasBackgroundActivityDisabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCpuTicks() {
        return this.cpuTicks;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getMobileRxBytes() {
        return this.mobileRxBytes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMobileTxBytes() {
        return this.mobileTxBytes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasBackgroundActivityDisabled) + nbh.n(ml9.a(zo5.c(this.networkSourceMask, (sid.h(this.processes) + ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(Long.hashCode(this.batteryPercent) * 31, this.cpuTicks), this.mobileRxBytes), this.mobileTxBytes), this.mobileIdleMs), this.wifiRxBytes), this.wifiTxBytes), this.wifiIdleMs)) * 31, 31), this.maxTemperature), 31, this.wasBatteryOptimizationsEnabled);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getMobileIdleMs() {
        return this.mobileIdleMs;
    }

    public final long j() {
        return this.wifiRxBytes;
    }

    public final long k() {
        return this.wifiTxBytes;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getWifiIdleMs() {
        return this.wifiIdleMs;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getProcesses() {
        return this.processes;
    }

    public final xu0 n(long batteryPercent, long cpuTicks, long mobileRxBytes, long mobileTxBytes, long mobileIdleMs, long wifiRxBytes, long wifiTxBytes, long wifiIdleMs, long processes, int networkSourceMask, long maxTemperature, boolean wasBatteryOptimizationsEnabled, boolean wasBackgroundActivityDisabled) {
        return new xu0(batteryPercent, cpuTicks, mobileRxBytes, mobileTxBytes, mobileIdleMs, wifiRxBytes, wifiTxBytes, wifiIdleMs, processes, networkSourceMask, maxTemperature, wasBatteryOptimizationsEnabled, wasBackgroundActivityDisabled, null);
    }

    public final long p() {
        return this.batteryPercent;
    }

    public final long q() {
        return this.cpuTicks;
    }

    public final long r() {
        return this.maxTemperature;
    }

    public final long s() {
        return this.mobileIdleMs;
    }

    public final long t() {
        return this.mobileRxBytes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BatteryMetricsDiff(batteryPercent=");
        sb.append(this.batteryPercent);
        sb.append(", cpuTicks=");
        sb.append(this.cpuTicks);
        sb.append(", mobileRxBytes=");
        sb.append(this.mobileRxBytes);
        sb.append(", mobileTxBytes=");
        sb.append(this.mobileTxBytes);
        sb.append(", mobileIdleMs=");
        sb.append(this.mobileIdleMs);
        sb.append(", wifiRxBytes=");
        sb.append(this.wifiRxBytes);
        sb.append(", wifiTxBytes=");
        sb.append(this.wifiTxBytes);
        sb.append(", wifiIdleMs=");
        sb.append(this.wifiIdleMs);
        sb.append(", processes=");
        sb.append((Object) sid.i(this.processes));
        sb.append(", networkSourceMask=");
        sb.append(this.networkSourceMask);
        sb.append(", maxTemperature=");
        sb.append(this.maxTemperature);
        sb.append(", wasBatteryOptimizationsEnabled=");
        sb.append(this.wasBatteryOptimizationsEnabled);
        sb.append(", wasBackgroundActivityDisabled=");
        return c0a.p(sb, this.wasBackgroundActivityDisabled, ')');
    }

    public final long u() {
        return this.mobileTxBytes;
    }

    public final int v() {
        return this.networkSourceMask;
    }

    public final long w() {
        return this.processes;
    }

    public final boolean x() {
        return this.wasBackgroundActivityDisabled;
    }

    public final boolean y() {
        return this.wasBatteryOptimizationsEnabled;
    }

    public final long z() {
        return this.wifiIdleMs;
    }

    public xu0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, long j10, boolean z, boolean z2, j95 j95Var) {
        this.batteryPercent = j;
        this.cpuTicks = j2;
        this.mobileRxBytes = j3;
        this.mobileTxBytes = j4;
        this.mobileIdleMs = j5;
        this.wifiRxBytes = j6;
        this.wifiTxBytes = j7;
        this.wifiIdleMs = j8;
        this.processes = j9;
        this.networkSourceMask = i;
        this.maxTemperature = j10;
        this.wasBatteryOptimizationsEnabled = z;
        this.wasBackgroundActivityDisabled = z2;
    }
}
