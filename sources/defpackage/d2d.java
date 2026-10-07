package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class d2d extends HandlerThread implements Handler.Callback {
    public tx5 a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public e2d e;

    public final void a(int i) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.a.getClass();
        tx5 tx5Var = this.a;
        int[] iArr = tx5Var.b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        tab.f("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        tab.f("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        tx5Var.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, tx5.g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = vqi.a;
        tab.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(tx5Var.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        tab.f("eglCreateContext failed", eGLContextEglCreateContext != null);
        tx5Var.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = tx5Var.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            tab.f("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        tab.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        tx5Var.e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        tab.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        tx5Var.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(tx5Var);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new e2d(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.a.getClass();
        tx5 tx5Var = this.a;
        tx5Var.a.removeCallbacks(tx5Var);
        try {
            SurfaceTexture surfaceTexture = tx5Var.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, tx5Var.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = tx5Var.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = tx5Var.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = tx5Var.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(tx5Var.c, tx5Var.e);
            }
            EGLContext eGLContext = tx5Var.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(tx5Var.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = tx5Var.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(tx5Var.c);
            }
            tx5Var.c = null;
            tx5Var.d = null;
            tx5Var.e = null;
            tx5Var.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (GlUtil$GlException e) {
                    lvb.l0("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    lvb.l0("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    lvb.l0("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        lvb.l0("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
