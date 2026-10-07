package com.my.tracker.core.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class TimeUtils {
    public static long convertFromSec(long j) {
        return j * 1000;
    }

    public static long convertToSec(long j) {
        return j / 1000;
    }

    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static long currentTimeSec() {
        return currentTimeMillis() / 1000;
    }

    public static long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
