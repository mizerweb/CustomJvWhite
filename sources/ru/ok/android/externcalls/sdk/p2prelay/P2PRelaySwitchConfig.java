package ru.ok.android.externcalls.sdk.p2prelay;

import defpackage.cqk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfig;", "", "rttMs", "", "rttViolationCount", "", "<init>", "(Ljava/lang/Long;I)V", "getRttMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRttViolationCount", "()I", "component1", "component2", "copy", "(Ljava/lang/Long;I)Lru/ok/android/externcalls/sdk/p2prelay/P2PRelaySwitchConfig;", "equals", "", "other", "hashCode", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class P2PRelaySwitchConfig {
    private final Long rttMs;
    private final int rttViolationCount;

    public P2PRelaySwitchConfig(Long l, int i) {
        this.rttMs = l;
        this.rttViolationCount = i;
    }

    public static /* synthetic */ P2PRelaySwitchConfig copy$default(P2PRelaySwitchConfig p2PRelaySwitchConfig, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = p2PRelaySwitchConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = p2PRelaySwitchConfig.rttViolationCount;
        }
        return p2PRelaySwitchConfig.copy(l, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRttMs() {
        return this.rttMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRttViolationCount() {
        return this.rttViolationCount;
    }

    public final P2PRelaySwitchConfig copy(Long rttMs, int rttViolationCount) {
        return new P2PRelaySwitchConfig(rttMs, rttViolationCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof P2PRelaySwitchConfig)) {
            return false;
        }
        P2PRelaySwitchConfig p2PRelaySwitchConfig = (P2PRelaySwitchConfig) other;
        return cqk.d(this.rttMs, p2PRelaySwitchConfig.rttMs) && this.rttViolationCount == p2PRelaySwitchConfig.rttViolationCount;
    }

    public final Long getRttMs() {
        return this.rttMs;
    }

    public final int getRttViolationCount() {
        return this.rttViolationCount;
    }

    public int hashCode() {
        Long l = this.rttMs;
        return Integer.hashCode(this.rttViolationCount) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public String toString() {
        return "P2PRelaySwitchConfig(rttMs=" + this.rttMs + ", rttViolationCount=" + this.rttViolationCount + ")";
    }
}
