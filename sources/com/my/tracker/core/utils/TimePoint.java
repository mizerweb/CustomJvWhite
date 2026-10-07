package com.my.tracker.core.utils;

/* JADX INFO: loaded from: classes.dex */
public final class TimePoint {
    public final long currentTimeMillis;
    public final long currentTimeSec;
    public final long elapsedRealtime;
    public final long uptimeMillis;

    private TimePoint(long j, long j2, long j3, long j4) {
        this.uptimeMillis = j;
        this.elapsedRealtime = j2;
        this.currentTimeMillis = j3;
        this.currentTimeSec = j4;
    }

    public static TimePoint now() {
        long jUptimeMillis = TimeUtils.uptimeMillis();
        long jElapsedRealtime = TimeUtils.elapsedRealtime();
        long jCurrentTimeMillis = TimeUtils.currentTimeMillis();
        return new TimePoint(jUptimeMillis, jElapsedRealtime, jCurrentTimeMillis, TimeUtils.convertToSec(jCurrentTimeMillis));
    }
}
