package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.function.IntSupplier;

/* JADX INFO: loaded from: classes3.dex */
public final class y8k {
    public final Clock a;
    public final ScheduledExecutorService b;
    public final int c;
    public volatile long d;
    public final z7k e;
    public volatile IntSupplier f;
    public volatile Instant g;
    public volatile boolean h;
    public volatile int i;
    public ScheduledFuture j;

    public y8k(z7k z7kVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.a = clockSystemUTC;
        this.e = z7kVar;
        this.f = new x8k();
        this.c = 1000;
        this.b = Executors.newScheduledThreadPool(1, new aid("idle-timer", 1));
        this.g = clockSystemUTC.instant();
        this.i = 1;
    }
}
