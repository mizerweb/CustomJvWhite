package ru.ok.android.externcalls.sdk.net.internal.monitor;

import defpackage.a4e;
import defpackage.fqb;
import defpackage.tw1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Ltw1;", "Lfqb;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "observeStat", "()Lfqb;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StatMonitor extends tw1 {
    fqb observeStat();

    @Override // defpackage.tw1
    /* synthetic */ void onRtcStats(a4e a4eVar);
}
