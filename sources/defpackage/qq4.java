package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class qq4 {
    public final Handler a;
    public final HandlerThread b;
    public final CountDownLatch c = new CountDownLatch(1);
    public volatile boolean d;

    public qq4(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.b = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
        this.d = true;
    }

    public final void a(Runnable runnable) {
        if (this.d) {
            this.a.removeCallbacksAndMessages(null);
            this.a.post(new f92(this, 18, runnable));
            this.b.quitSafely();
            this.d = false;
        }
    }

    public final void b(Runnable runnable) {
        this.a.post(runnable);
    }
}
