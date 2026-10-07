package defpackage;

import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b1\u00100JÄ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b4\u0010$J\u001a\u00106\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b:\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b=\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b@\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\bA\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\bB\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00108\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\bF\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\bG\u0010\u001eR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b&\u0010H\u001a\u0004\bI\u00100R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b'\u0010H\u001a\u0004\bJ\u00100R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u001eR\u0011\u0010N\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bM\u00100R\u0011\u0010P\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bO\u00100¨\u0006Q"}, d2 = {"Lpv0;", "", "", "sliceTime", "utime", "stime", "cutime", "cstime", "", "batteryPercent", "temperature", "healthStatsMobileRxBytes", "healthStatsMobileTxBytes", "healthStatsMobileIdleMs", "healthStatsWifiRxBytes", "healthStatsWifiTxBytes", "healthStatsWifiIdleMs", "trafficStatsMobileRxBytes", "trafficStatsMobileTxBytes", "Lsid;", "processes", "", "isBatteryOptimizationsEnabled", "isBackgroundActivityDisabled", "<init>", "(JJJJJIIJJJJJJJJJZZLj95;)V", "", "toString", "()Ljava/lang/String;", "a", "()J", "k", "l", "m", "n", "o", "()I", "p", "q", "r", "b", DatabaseHelper.COMPRESSED_COLUMN_NAME, "d", "e", "f", "g", "h", "i", "()Z", "j", "s", "(JJJJJIIJJJJJJJJJZZ)Lpv0;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "F", "K", "G", "x", "w", "I", "u", "H", "z", "A", "y", "C", "D", "B", "E", "Z", "M", "L", "v", "cpuTicks", "O", "isUnknownNetSource", "N", "isHealthStatsSource", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class pv0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long sliceTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long utime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long stime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long cutime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long cstime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int batteryPercent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int temperature;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long healthStatsMobileRxBytes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long healthStatsMobileTxBytes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long healthStatsMobileIdleMs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long healthStatsWifiRxBytes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final long healthStatsWifiTxBytes;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final long healthStatsWifiIdleMs;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final long trafficStatsMobileRxBytes;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final long trafficStatsMobileTxBytes;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final long processes;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final boolean isBatteryOptimizationsEnabled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final boolean isBackgroundActivityDisabled;

    public /* synthetic */ pv0(long j, long j2, long j3, long j4, long j5, int i, int i2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, boolean z2, int i3, j95 j95Var) {
        this(j, j2, j3, j4, j5, i, i2, (i3 & np0.m) != 0 ? -1L : j6, (i3 & np0.n) != 0 ? -1L : j7, (i3 & np0.o) != 0 ? -1L : j8, (i3 & 1024) != 0 ? -1L : j9, (i3 & np0.q) != 0 ? -1L : j10, (i3 & np0.r) != 0 ? -1L : j11, (i3 & 8192) != 0 ? -1L : j12, (i3 & 16384) != 0 ? -1L : j13, j14, z, z2, null);
    }

    public static /* synthetic */ pv0 t(pv0 pv0Var, long j, long j2, long j3, long j4, long j5, int i, int i2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, boolean z2, int i3, Object obj) {
        boolean z3;
        long j15;
        long j16 = (i3 & 1) != 0 ? pv0Var.sliceTime : j;
        long j17 = (i3 & 2) != 0 ? pv0Var.utime : j2;
        long j18 = (i3 & 4) != 0 ? pv0Var.stime : j3;
        long j19 = (i3 & 8) != 0 ? pv0Var.cutime : j4;
        long j20 = (i3 & 16) != 0 ? pv0Var.cstime : j5;
        int i4 = (i3 & 32) != 0 ? pv0Var.batteryPercent : i;
        int i5 = (i3 & 64) != 0 ? pv0Var.temperature : i2;
        long j21 = (i3 & np0.m) != 0 ? pv0Var.healthStatsMobileRxBytes : j6;
        long j22 = j16;
        long j23 = (i3 & np0.n) != 0 ? pv0Var.healthStatsMobileTxBytes : j7;
        long j24 = (i3 & np0.o) != 0 ? pv0Var.healthStatsMobileIdleMs : j8;
        long j25 = (i3 & 1024) != 0 ? pv0Var.healthStatsWifiRxBytes : j9;
        long j26 = (i3 & np0.q) != 0 ? pv0Var.healthStatsWifiTxBytes : j10;
        long j27 = (i3 & np0.r) != 0 ? pv0Var.healthStatsWifiIdleMs : j11;
        long j28 = (i3 & 8192) != 0 ? pv0Var.trafficStatsMobileRxBytes : j12;
        long j29 = (i3 & 16384) != 0 ? pv0Var.trafficStatsMobileTxBytes : j13;
        long j30 = (i3 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? pv0Var.processes : j14;
        boolean z4 = (i3 & 65536) != 0 ? pv0Var.isBatteryOptimizationsEnabled : z;
        if ((i3 & 131072) != 0) {
            j15 = j30;
            z3 = pv0Var.isBackgroundActivityDisabled;
        } else {
            z3 = z2;
            j15 = j30;
        }
        return pv0Var.s(j22, j17, j18, j19, j20, i4, i5, j21, j23, j24, j25, j26, j27, j28, j29, j15, z4, z3);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getHealthStatsMobileTxBytes() {
        return this.healthStatsMobileTxBytes;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getHealthStatsWifiIdleMs() {
        return this.healthStatsWifiIdleMs;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getHealthStatsWifiRxBytes() {
        return this.healthStatsWifiRxBytes;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getHealthStatsWifiTxBytes() {
        return this.healthStatsWifiTxBytes;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getProcesses() {
        return this.processes;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getSliceTime() {
        return this.sliceTime;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getStime() {
        return this.stime;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getTrafficStatsMobileRxBytes() {
        return this.trafficStatsMobileRxBytes;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getTrafficStatsMobileTxBytes() {
        return this.trafficStatsMobileTxBytes;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getUtime() {
        return this.utime;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsBackgroundActivityDisabled() {
        return this.isBackgroundActivityDisabled;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getIsBatteryOptimizationsEnabled() {
        return this.isBatteryOptimizationsEnabled;
    }

    public final boolean N() {
        return this.healthStatsMobileRxBytes >= 0;
    }

    public final boolean O() {
        return this.healthStatsMobileRxBytes < 0 && this.trafficStatsMobileRxBytes < 0;
    }

    public final long a() {
        return this.sliceTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getHealthStatsMobileIdleMs() {
        return this.healthStatsMobileIdleMs;
    }

    public final long c() {
        return this.healthStatsWifiRxBytes;
    }

    public final long d() {
        return this.healthStatsWifiTxBytes;
    }

    public final long e() {
        return this.healthStatsWifiIdleMs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof pv0)) {
            return false;
        }
        pv0 pv0Var = (pv0) other;
        return this.sliceTime == pv0Var.sliceTime && this.utime == pv0Var.utime && this.stime == pv0Var.stime && this.cutime == pv0Var.cutime && this.cstime == pv0Var.cstime && this.batteryPercent == pv0Var.batteryPercent && this.temperature == pv0Var.temperature && this.healthStatsMobileRxBytes == pv0Var.healthStatsMobileRxBytes && this.healthStatsMobileTxBytes == pv0Var.healthStatsMobileTxBytes && this.healthStatsMobileIdleMs == pv0Var.healthStatsMobileIdleMs && this.healthStatsWifiRxBytes == pv0Var.healthStatsWifiRxBytes && this.healthStatsWifiTxBytes == pv0Var.healthStatsWifiTxBytes && this.healthStatsWifiIdleMs == pv0Var.healthStatsWifiIdleMs && this.trafficStatsMobileRxBytes == pv0Var.trafficStatsMobileRxBytes && this.trafficStatsMobileTxBytes == pv0Var.trafficStatsMobileTxBytes && sid.d(this.processes, pv0Var.processes) && this.isBatteryOptimizationsEnabled == pv0Var.isBatteryOptimizationsEnabled && this.isBackgroundActivityDisabled == pv0Var.isBackgroundActivityDisabled;
    }

    public final long f() {
        return this.trafficStatsMobileRxBytes;
    }

    public final long g() {
        return this.trafficStatsMobileTxBytes;
    }

    public final long h() {
        return this.processes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBackgroundActivityDisabled) + nbh.n((sid.h(this.processes) + ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(ml9.a(zo5.c(this.temperature, zo5.c(this.batteryPercent, ml9.a(ml9.a(ml9.a(ml9.a(Long.hashCode(this.sliceTime) * 31, this.utime), this.stime), this.cutime), this.cstime), 31), 31), this.healthStatsMobileRxBytes), this.healthStatsMobileTxBytes), this.healthStatsMobileIdleMs), this.healthStatsWifiRxBytes), this.healthStatsWifiTxBytes), this.healthStatsWifiIdleMs), this.trafficStatsMobileRxBytes), this.trafficStatsMobileTxBytes)) * 31, 31, this.isBatteryOptimizationsEnabled);
    }

    public final boolean i() {
        return this.isBatteryOptimizationsEnabled;
    }

    public final boolean j() {
        return this.isBackgroundActivityDisabled;
    }

    public final long k() {
        return this.utime;
    }

    public final long l() {
        return this.stime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getCutime() {
        return this.cutime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getCstime() {
        return this.cstime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getBatteryPercent() {
        return this.batteryPercent;
    }

    public final int p() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getHealthStatsMobileRxBytes() {
        return this.healthStatsMobileRxBytes;
    }

    public final long r() {
        return this.healthStatsMobileTxBytes;
    }

    public final pv0 s(long sliceTime, long utime, long stime, long cutime, long cstime, int batteryPercent, int temperature, long healthStatsMobileRxBytes, long healthStatsMobileTxBytes, long healthStatsMobileIdleMs, long healthStatsWifiRxBytes, long healthStatsWifiTxBytes, long healthStatsWifiIdleMs, long trafficStatsMobileRxBytes, long trafficStatsMobileTxBytes, long processes, boolean isBatteryOptimizationsEnabled, boolean isBackgroundActivityDisabled) {
        return new pv0(sliceTime, utime, stime, cutime, cstime, batteryPercent, temperature, healthStatsMobileRxBytes, healthStatsMobileTxBytes, healthStatsMobileIdleMs, healthStatsWifiRxBytes, healthStatsWifiTxBytes, healthStatsWifiIdleMs, trafficStatsMobileRxBytes, trafficStatsMobileTxBytes, processes, isBatteryOptimizationsEnabled, isBackgroundActivityDisabled, null);
    }

    public String toString() {
        return s5h.y0("BatterySnapshot:\n            |slice=" + this.sliceTime + "\n            |cpuTicks=(u->" + this.utime + ",s->" + this.stime + ",cu->" + this.cutime + ",cs->" + this.cstime + ")\n            |batteryPercent=" + this.batteryPercent + "\n            |temperature=" + this.temperature + "\n            |healthStatsNet=(mRx->" + this.healthStatsMobileRxBytes + ",mTx->" + this.healthStatsMobileTxBytes + ",mIdle->" + this.healthStatsMobileIdleMs + ",wRx->" + this.healthStatsWifiRxBytes + ",wTx->" + this.healthStatsWifiTxBytes + ",wIdle->" + this.healthStatsWifiIdleMs + ")\n            |trafficStatsNet=(mRx->" + this.trafficStatsMobileRxBytes + ",mTx->" + this.trafficStatsMobileTxBytes + ")\n            |env=(bo=" + this.isBatteryOptimizationsEnabled + ",ba=" + this.isBackgroundActivityDisabled + ")\n            |processes=" + ((Object) sid.i(this.processes)) + "\n        ");
    }

    public final int u() {
        return this.batteryPercent;
    }

    public final long v() {
        return this.utime + this.stime + this.cutime + this.cstime;
    }

    public final long w() {
        return this.cstime;
    }

    public final long x() {
        return this.cutime;
    }

    public final long y() {
        return this.healthStatsMobileIdleMs;
    }

    public final long z() {
        return this.healthStatsMobileRxBytes;
    }

    public pv0(long j, long j2, long j3, long j4, long j5, int i, int i2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, boolean z2, j95 j95Var) {
        this.sliceTime = j;
        this.utime = j2;
        this.stime = j3;
        this.cutime = j4;
        this.cstime = j5;
        this.batteryPercent = i;
        this.temperature = i2;
        this.healthStatsMobileRxBytes = j6;
        this.healthStatsMobileTxBytes = j7;
        this.healthStatsMobileIdleMs = j8;
        this.healthStatsWifiRxBytes = j9;
        this.healthStatsWifiTxBytes = j10;
        this.healthStatsWifiIdleMs = j11;
        this.trafficStatsMobileRxBytes = j12;
        this.trafficStatsMobileTxBytes = j13;
        this.processes = j14;
        this.isBatteryOptimizationsEnabled = z;
        this.isBackgroundActivityDisabled = z2;
    }
}
