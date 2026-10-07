package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class nsh {
    public volatile long a;
    public volatile boolean c = false;
    public final x36 b = new x36();

    public final synchronized void a() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (this.a == 0) {
            this.a = jElapsedRealtimeNanos;
            return;
        }
        long j = jElapsedRealtimeNanos - this.a;
        boolean z = this.c;
        x36 x36Var = this.b;
        if (z) {
            x36Var.a(j);
        } else {
            x36Var.b = j;
            this.c = true;
        }
        this.a = jElapsedRealtimeNanos;
    }
}
