package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class x99 extends Handler implements Runnable {
    public final int a;
    public final y99 b;
    public final long c;
    public w99 d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ dc9 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x99(dc9 dc9Var, Looper looper, y99 y99Var, w99 w99Var, int i, long j) {
        super(looper);
        this.j = dc9Var;
        this.b = y99Var;
        this.d = w99Var;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.z();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w99 w99Var = this.d;
            w99Var.getClass();
            w99Var.d(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        w99 w99Var = this.d;
        w99Var.getClass();
        w99Var.p(this.b, jElapsedRealtime, j, this.f);
        this.e = null;
        dc9 dc9Var = this.j;
        she sheVar = (she) dc9Var.b;
        x99 x99Var = (x99) dc9Var.c;
        x99Var.getClass();
        sheVar.execute(x99Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        w99 w99Var = this.d;
        w99Var.getClass();
        if (this.h) {
            w99Var.d(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                w99Var.h(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                lvb.l0("LoadTask", "Unexpected exception handling load completed", e);
                this.j.d = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        dc1 dc1VarX = w99Var.x(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = dc1VarX.a;
        if (i4 == 3) {
            this.j.d = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = dc1VarX.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            dc9 dc9Var = this.j;
            lvb.b0(((x99) dc9Var.c) == null);
            dc9Var.c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.load();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            lvb.l0("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            lvb.l0("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                lvb.l0("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
