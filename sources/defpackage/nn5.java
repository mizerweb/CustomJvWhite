package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import one.me.rlottie.RLottie;

/* JADX INFO: loaded from: classes3.dex */
public final class nn5 extends Thread {
    public static int f;
    public volatile Handler a = null;
    public final CountDownLatch b = new CountDownLatch(1);
    public long c;
    public final int d;
    public final int e;

    public nn5(String str) {
        int i = f;
        f = i + 1;
        this.d = i;
        this.e = -1000;
        setName(str);
        start();
    }

    public final void a(Runnable runnable) {
        try {
            this.b.await();
            this.a.removeCallbacks(runnable);
        } catch (Exception e) {
            RLottie.getLogger().h(e);
        }
    }

    public final void b(Runnable runnable) {
        this.c = SystemClock.elapsedRealtime();
        c(runnable, 0L);
    }

    public final boolean c(Runnable runnable, long j) {
        try {
            this.b.await();
        } catch (Exception e) {
            RLottie.getLogger().h(e);
        }
        Handler handler = this.a;
        return j <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.a = new Handler(Looper.myLooper(), new mn5(this));
        this.b.countDown();
        int i = this.e;
        if (i != -1000) {
            Process.setThreadPriority(i);
        }
        Looper.loop();
    }
}
