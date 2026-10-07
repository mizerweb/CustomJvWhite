package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q0j extends HandlerThread {
    public final Size a;
    public final fx5 b;
    public final long c;
    public final AtomicReference d;
    public final /* synthetic */ t0j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0j(t0j t0jVar, Size size, fx5 fx5Var) {
        super("videomsg-gl-thread");
        this.e = t0jVar;
        this.a = size;
        this.b = fx5Var;
        this.c = SystemClock.elapsedRealtime();
        this.d = new AtomicReference();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        String str = this.e.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, nbh.s(SystemClock.elapsedRealtime() - this.c, "onLooperPrepared, GL thread startup took=", " ms"), null);
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        gm0.x(this.e.a, "run, previewSize=" + this.a + ", dynamicRange=" + this.b, null);
        boolean z = this.e.b.get();
        t0j t0jVar = this.e;
        if (z) {
            gm0.Y(t0jVar.a, "run, video message processor was requested to exit during startup GL thread, skip GL initialization!");
        } else {
            try {
                t0j.a(t0jVar, this.a, this.b);
            } catch (Exception e) {
                gm0.V(this.e.a, "GL initialization failed", e);
                this.d.set(e);
            }
        }
        super.run();
        String str = this.e.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "run, GL thread finished", null);
        }
    }
}
