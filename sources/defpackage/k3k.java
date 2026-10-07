package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class k3k extends Handler {
    public final CidLogger a;
    public final String b;
    public final ysj c;
    public double d;
    public double e;
    public double f;
    public long g;
    public long h;
    public double i;

    public k3k(Looper looper, CidLogger cidLogger, String str, ysj ysjVar) {
        super(looper);
        this.a = cidLogger;
        this.b = str;
        this.c = ysjVar;
    }

    public final void a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        double d = this.e + 1.0d;
        this.e = d;
        double d2 = this.d + (jElapsedRealtime - j);
        this.d = d2;
        double d3 = d2 / d;
        double d4 = this.i;
        Object objValueOf = d4 > 0.0d ? Double.valueOf(this.f / d4) : 0;
        if (jElapsedRealtime - this.g > 10000) {
            this.a.log(this.b, "Total calls: " + this.d + ", average call time: " + d3 + ", average idle time " + objValueOf);
            this.g = jElapsedRealtime;
            this.e = 0.0d;
            this.d = 0.0d;
            this.i = 0.0d;
            this.f = 0.0d;
            this.h = 0L;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        message.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            long j = this.h;
            if (j > 0) {
                this.f = jElapsedRealtime - j;
                this.i += 1.0d;
            }
            super.dispatchMessage(message);
            this.h = SystemClock.elapsedRealtime();
            message.getCallback().getClass();
            a(jElapsedRealtime);
        } catch (Throwable th) {
            message.getCallback().getClass();
            a(jElapsedRealtime);
            this.c.invoke(th);
        }
    }
}
