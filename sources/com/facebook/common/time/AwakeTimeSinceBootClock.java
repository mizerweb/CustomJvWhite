package com.facebook.common.time;

import defpackage.f1b;

/* JADX INFO: loaded from: classes2.dex */
public class AwakeTimeSinceBootClock implements f1b {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // defpackage.f1b
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // defpackage.f1b
    public long nowNanos() {
        return System.nanoTime();
    }
}
