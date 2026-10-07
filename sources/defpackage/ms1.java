package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class ms1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final CidLogger a;
    public final ysj b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final k3k k;

    public ms1(CidLogger cidLogger, EGLContext eGLContext, int[] iArr, ysj ysjVar, String str) {
        this.a = cidLogger;
        this.b = ysjVar;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        String str2 = str == null ? "CallOpenGL" : str;
        this.j = str2;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        k3k k3kVar = new k3k(looper, cidLogger, str2.concat("_timings"), new ysj(1, this, ms1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 11));
        this.k = k3kVar;
        cidLogger.log(str2, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                cidLogger.log(str2, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            k3kVar.postAtFrontOfQueue(new i0(this, iArr, eGLContext, 9));
            cidLogger.log(str2, "OpenGL context initialization task submitted");
        }
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(iEglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContext$CallOpenGLContextException("Wrong surface in makeCurrent()");
        }
        EGLContext eGLContext = this.d;
        if (eGLContext == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        if (cqk.d(EGL14.eglGetCurrentContext(), this.d) && cqk.d(this.g, eGLSurface)) {
            return;
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
        }
        this.g = eGLSurface;
    }

    public final boolean c(String str, cf7 cf7Var) {
        try {
            return this.k.postAtFrontOfQueue(new ls1(cf7Var, this, 1));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final void d(EGLSurface eGLSurface) {
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        this.a.log(this.j, "Surface destroyed, total count is " + l.decrementAndGet());
    }
}
