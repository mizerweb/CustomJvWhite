package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class o30 implements Runnable {
    public static final ThreadPoolExecutor h;
    public static z0b i;
    public static volatile ThreadPoolExecutor j;
    public final g35 a;
    public final x0b b;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final CountDownLatch f;
    public final /* synthetic */ rxk g;

    static {
        f80 f80Var = new f80(3);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, np0.m, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), f80Var);
        h = threadPoolExecutor;
        j = threadPoolExecutor;
    }

    public o30(rxk rxkVar) {
        this.g = rxkVar;
        g35 g35Var = new g35(3, this);
        this.a = g35Var;
        this.b = new x0b(this, g35Var);
        this.f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        z0b z0bVar;
        synchronized (o30.class) {
            try {
                if (i == null) {
                    i = new z0b(Looper.getMainLooper(), 0);
                }
                z0bVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        z0bVar.obtainMessage(1, new y0b(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.b();
    }
}
