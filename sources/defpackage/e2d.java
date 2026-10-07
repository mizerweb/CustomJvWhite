package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes2.dex */
public final class e2d extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final d2d b;
    public boolean c;

    public e2d(d2d d2dVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = d2dVar;
        this.a = z;
    }

    public static synchronized boolean a() {
        int i;
        try {
            if (!e) {
                try {
                    if (tab.x("EGL_EXT_protected_content")) {
                        i = tab.x("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i = 0;
                    }
                } catch (GlUtil$GlException e2) {
                    lvb.k0("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
                }
                d = i;
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    public static e2d b(boolean z) {
        boolean z2 = false;
        lvb.b0(!z || a());
        d2d d2dVar = new d2d("ExoPlayer:PlaceholderSurface");
        int i = z ? d : 0;
        d2dVar.start();
        Handler handler = new Handler(d2dVar.getLooper(), d2dVar);
        d2dVar.b = handler;
        d2dVar.a = new tx5(handler);
        synchronized (d2dVar) {
            d2dVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (d2dVar.e == null && d2dVar.d == null && d2dVar.c == null) {
                try {
                    d2dVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = d2dVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = d2dVar.c;
        if (error != null) {
            throw error;
        }
        e2d e2dVar = d2dVar.e;
        e2dVar.getClass();
        return e2dVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    d2d d2dVar = this.b;
                    d2dVar.b.getClass();
                    d2dVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
