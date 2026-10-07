package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zv5 implements dch, SurfaceTexture.OnFrameAvailableListener {
    public final xv5 a;
    public final HandlerThread b;
    public final us7 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public zv5(fx5 fx5Var, uvc uvcVar, uvc uvcVar2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new us7(handler);
        this.a = new xv5(uvcVar, uvcVar2);
        try {
            f(fx5Var);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void a() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((cch) it.next()).close();
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new i0(this, runnable2, runnable, 24));
        } catch (RejectedExecutionException e) {
            tvj.i("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // defpackage.dch
    public final void d(cch cchVar) {
        if (this.g.get()) {
            cchVar.close();
            return;
        }
        gf5 gf5Var = new gf5(this, 11, cchVar);
        Objects.requireNonNull(cchVar);
        b(gf5Var, new jj2(20, cchVar));
    }

    @Override // defpackage.dch
    public final void e(ich ichVar) {
        if (this.g.get()) {
            ichVar.d();
        } else {
            b(new gf5(this, 10, ichVar), new de5(ichVar, 0));
        }
    }

    public final void f(fx5 fx5Var) {
        Map map = Collections.EMPTY_MAP;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            b(new i0(this, fx5Var, r72Var), new ce5());
            r72Var.a = "Init GlRenderer";
        } catch (Exception e) {
            u72Var.c(e);
        }
        try {
            u72Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            ore.l("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            cch cchVar = (cch) entry.getKey();
            if (cchVar.c == 34) {
                try {
                    this.a.v(surfaceTexture.getTimestamp(), surface, cchVar, this.i, this.j);
                } catch (RuntimeException e) {
                    tvj.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // defpackage.dch
    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        b(new jj2(27, this), new ce5());
    }
}
