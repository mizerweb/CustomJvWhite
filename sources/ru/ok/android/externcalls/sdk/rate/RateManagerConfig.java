package ru.ok.android.externcalls.sdk.rate;

import defpackage.cqk;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/RateManagerConfig;", "", "rttRateHintConfig", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "lossHintConfig", "Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "directCandidateTypeHintConfig", "Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;", "serverCandidateTypeHintConfig", "<init>", "(Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;)V", "getRttRateHintConfig", "()Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "getLossHintConfig", "()Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "getDirectCandidateTypeHintConfig", "()Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;", "getServerCandidateTypeHintConfig", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RateManagerConfig {
    private final CandidateTypeHintConfig directCandidateTypeHintConfig;
    private final LossHintConfig lossHintConfig;
    private final RttRateHintConfig rttRateHintConfig;
    private final CandidateTypeHintConfig serverCandidateTypeHintConfig;

    public RateManagerConfig(RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig candidateTypeHintConfig, CandidateTypeHintConfig candidateTypeHintConfig2) {
        this.rttRateHintConfig = rttRateHintConfig;
        this.lossHintConfig = lossHintConfig;
        this.directCandidateTypeHintConfig = candidateTypeHintConfig;
        this.serverCandidateTypeHintConfig = candidateTypeHintConfig2;
    }

    public static /* synthetic */ RateManagerConfig copy$default(RateManagerConfig rateManagerConfig, RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig candidateTypeHintConfig, CandidateTypeHintConfig candidateTypeHintConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            rttRateHintConfig = rateManagerConfig.rttRateHintConfig;
        }
        if ((i & 2) != 0) {
            lossHintConfig = rateManagerConfig.lossHintConfig;
        }
        if ((i & 4) != 0) {
            candidateTypeHintConfig = rateManagerConfig.directCandidateTypeHintConfig;
        }
        if ((i & 8) != 0) {
            candidateTypeHintConfig2 = rateManagerConfig.serverCandidateTypeHintConfig;
        }
        return rateManagerConfig.copy(rttRateHintConfig, lossHintConfig, candidateTypeHintConfig, candidateTypeHintConfig2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RttRateHintConfig getRttRateHintConfig() {
        return this.rttRateHintConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LossHintConfig getLossHintConfig() {
        return this.lossHintConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CandidateTypeHintConfig getDirectCandidateTypeHintConfig() {
        return this.directCandidateTypeHintConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CandidateTypeHintConfig getServerCandidateTypeHintConfig() {
        return this.serverCandidateTypeHintConfig;
    }

    public final RateManagerConfig copy(RttRateHintConfig rttRateHintConfig, LossHintConfig lossHintConfig, CandidateTypeHintConfig directCandidateTypeHintConfig, CandidateTypeHintConfig serverCandidateTypeHintConfig) {
        return new RateManagerConfig(rttRateHintConfig, lossHintConfig, directCandidateTypeHintConfig, serverCandidateTypeHintConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateManagerConfig)) {
            return false;
        }
        RateManagerConfig rateManagerConfig = (RateManagerConfig) other;
        return cqk.d(this.rttRateHintConfig, rateManagerConfig.rttRateHintConfig) && cqk.d(this.lossHintConfig, rateManagerConfig.lossHintConfig) && cqk.d(this.directCandidateTypeHintConfig, rateManagerConfig.directCandidateTypeHintConfig) && cqk.d(this.serverCandidateTypeHintConfig, rateManagerConfig.serverCandidateTypeHintConfig);
    }

    public final CandidateTypeHintConfig getDirectCandidateTypeHintConfig() {
        return this.directCandidateTypeHintConfig;
    }

    public final LossHintConfig getLossHintConfig() {
        return this.lossHintConfig;
    }

    public final RttRateHintConfig getRttRateHintConfig() {
        return this.rttRateHintConfig;
    }

    public final CandidateTypeHintConfig getServerCandidateTypeHintConfig() {
        return this.serverCandidateTypeHintConfig;
    }

    public int hashCode() {
        return this.serverCandidateTypeHintConfig.hashCode() + ((this.directCandidateTypeHintConfig.hashCode() + ((this.lossHintConfig.hashCode() + (this.rttRateHintConfig.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RateManagerConfig(rttRateHintConfig=" + this.rttRateHintConfig + ", lossHintConfig=" + this.lossHintConfig + ", directCandidateTypeHintConfig=" + this.directCandidateTypeHintConfig + ", serverCandidateTypeHintConfig=" + this.serverCandidateTypeHintConfig + ")";
    }
}
