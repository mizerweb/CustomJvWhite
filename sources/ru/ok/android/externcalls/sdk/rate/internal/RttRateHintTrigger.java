package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.j95;
import defpackage.y3e;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/HintTrigger;", "Ly3e;", "log", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "config", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "collection", "<init>", "(Ly3e;Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;)V", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "stat", "Lsbi;", "onNetworkStat", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;)V", "Ly3e;", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "", "highRttCount", "I", "", "wasReported", "Z", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RttRateHintTrigger implements HintTrigger {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private static final String RTT_HINT_REASON = "rtt_";
    private final RateHintCollection collection;
    private final RttRateHintConfig config;
    private int highRttCount;
    private final y3e log;
    private boolean wasReported;

    public RttRateHintTrigger(y3e y3eVar, RttRateHintConfig rttRateHintConfig, RateHintCollection rateHintCollection) {
        this.log = y3eVar;
        this.config = rttRateHintConfig;
        this.collection = rateHintCollection;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.HintTrigger
    public void onNetworkStat(NetworkStat stat) {
        Integer rttMs = stat.getRttMs();
        int iIntValue = rttMs != null ? rttMs.intValue() : 0;
        if (this.wasReported || this.config.getRttMs() == null) {
            return;
        }
        this.log.log("RateManager", "measured rtt: " + iIntValue);
        if (iIntValue >= this.config.getRttMs().longValue()) {
            this.highRttCount++;
        } else {
            this.highRttCount = 0;
        }
        if (this.highRttCount >= this.config.getHighRttCount()) {
            this.collection.addRateHint(new RateHint(RTT_HINT_REASON + this.config.getRttMs()));
            this.wasReported = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger$Companion;", "", "<init>", "()V", "RTT_HINT_REASON", "", "LOG_TAG", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
