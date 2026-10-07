package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/HintTrigger;", "", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "stat", "Lsbi;", "onNetworkStat", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface HintTrigger {
    void onNetworkStat(NetworkStat stat);
}
