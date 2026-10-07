package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class dfd {
    public static final ifh k = new ifh(new vbd(2));
    public static final HandlerThread l;
    public final ThreadPoolExecutor a;
    public final v56 b;
    public final jf c;
    public volatile boolean d;
    public final r6a e;
    public final AtomicBoolean f;
    public final CopyOnWriteArrayList g;
    public volatile tw5 h;
    public final due i;
    public final ft0 j;

    static {
        HandlerThread handlerThread = new HandlerThread("PreloadDiskCacheManager-handler-thread");
        handlerThread.start();
        l = handlerThread;
    }

    public dfd() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) k.getValue();
        Looper looper = l.getLooper();
        this.a = threadPoolExecutor;
        this.b = new v56((Looper) null);
        this.c = new jf(5, looper, this);
        this.e = new r6a(19);
        this.f = new AtomicBoolean(false);
        this.g = new CopyOnWriteArrayList();
        this.i = new due(this);
        this.j = new ft0(this);
    }

    public final void a() {
        r6a r6aVar = this.e;
        r6aVar.getClass();
        Iterator it = ww3.T1(new HashMap((ConcurrentHashMap) r6aVar.a).keySet()).iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }

    public final void b(String str) {
        wm5 wm5VarH = this.e.H(str);
        if (wm5VarH == null) {
            return;
        }
        wm5VarH.cancel(true);
        Log.d("PreloadDiskCacheManager", "Task " + str + " canceled");
    }

    public final void c(wm5 wm5Var) {
        if (this.a.isShutdown()) {
            Log.d("PreloadDiskCacheManager", "Executor is shut down, cannot execute task. task type: ".concat(wm5Var.getClass().getName()));
            return;
        }
        r6a r6aVar = this.e;
        ReentrantLock reentrantLock = (ReentrantLock) r6aVar.c;
        reentrantLock.lock();
        try {
            if (((ConcurrentHashMap) r6aVar.a).putIfAbsent(wm5Var.f(), wm5Var) == null) {
                ((ConcurrentLinkedDeque) r6aVar.b).add(wm5Var.f());
            }
            Log.d("PreloadDiskCacheManager", "task " + wm5Var.f() + " scheduled. task type: " + wm5Var.getClass().getName());
            this.c.obtainMessage(8).sendToTarget();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d() {
        return this.d;
    }
}
