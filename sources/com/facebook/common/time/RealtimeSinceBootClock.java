package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.f1b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class RealtimeSinceBootClock implements f1b {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // defpackage.f1b
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.f1b
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
