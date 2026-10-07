package ru.ok.android.externcalls.sdk.rate.rtt;

import defpackage.cqk;
import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J$\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "", "rttMs", "", "highRttCount", "", "<init>", "(Ljava/lang/Long;I)V", "getRttMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHighRttCount", "()I", "isNotEmpty", "", "()Z", "component1", "component2", "copy", "(Ljava/lang/Long;I)Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "equals", "other", "hashCode", "toString", "", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RttRateHintConfig {
    public static final String RTT = "rtt";
    private final int highRttCount;
    private final Long rttMs;

    public /* synthetic */ RttRateHintConfig(Long l, int i, int i2, j95 j95Var) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? 1 : i);
    }

    public static /* synthetic */ RttRateHintConfig copy$default(RttRateHintConfig rttRateHintConfig, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = rttRateHintConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = rttRateHintConfig.highRttCount;
        }
        return rttRateHintConfig.copy(l, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRttMs() {
        return this.rttMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final RttRateHintConfig copy(Long rttMs, int highRttCount) {
        return new RttRateHintConfig(rttMs, highRttCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RttRateHintConfig)) {
            return false;
        }
        RttRateHintConfig rttRateHintConfig = (RttRateHintConfig) other;
        return cqk.d(this.rttMs, rttRateHintConfig.rttMs) && this.highRttCount == rttRateHintConfig.highRttCount;
    }

    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final Long getRttMs() {
        return this.rttMs;
    }

    public int hashCode() {
        Long l = this.rttMs;
        return Integer.hashCode(this.highRttCount) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final boolean isNotEmpty() {
        return this.rttMs != null;
    }

    public String toString() {
        return "RttRateHintConfig(rttMs=" + this.rttMs + ", highRttCount=" + this.highRttCount + ")";
    }

    public RttRateHintConfig(Long l, int i) {
        this.rttMs = l;
        this.highRttCount = i;
    }

    public RttRateHintConfig() {
        this(null, 0, 3, null);
    }
}
