package ru.ok.android.externcalls.sdk.connection;

import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "", "noMediaReportTimeoutMs", "", "noIceConnectionReportTimeoutMs", "<init>", "(JJ)V", "getNoMediaReportTimeoutMs", "()J", "getNoIceConnectionReportTimeoutMs", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaConnectionSettings {
    private final long noIceConnectionReportTimeoutMs;
    private final long noMediaReportTimeoutMs;

    public /* synthetic */ MediaConnectionSettings(long j, long j2, int i, j95 j95Var) {
        this((i & 1) != 0 ? 3000L : j, (i & 2) != 0 ? 3000L : j2);
    }

    public final long getNoIceConnectionReportTimeoutMs() {
        return this.noIceConnectionReportTimeoutMs;
    }

    public final long getNoMediaReportTimeoutMs() {
        return this.noMediaReportTimeoutMs;
    }

    public MediaConnectionSettings(long j, long j2) {
        this.noMediaReportTimeoutMs = j;
        this.noIceConnectionReportTimeoutMs = j2;
    }

    public MediaConnectionSettings() {
        this(0L, 0L, 3, null);
    }
}
