package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 {
    public final CidLogger a;
    public final EglBase.Context b;
    public final pi c;
    public final String d;
    public final ms1 e;
    public final Matrix f;
    public final VideoFrameDrawer g;
    public final GlRectDrawer h;
    public final ArrayList i;

    public qs1(CidLogger cidLogger, EglBase.Context context, int[] iArr, String str) {
        this.a = cidLogger;
        this.b = context;
        this.d = qv1.k("CallOpenGL_renderer_", str);
        EGLContext rawContext = ((EglBase14.Context) context).getRawContext();
        rawContext.getClass();
        this.e = new ms1(cidLogger, rawContext, iArr, new ysj(1, this, qs1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0, 6), str);
        this.f = new Matrix();
        this.g = new VideoFrameDrawer();
        this.h = new GlRectDrawer();
        this.i = new ArrayList();
        pi piVar = new pi(7, this);
        a(piVar);
        this.c = piVar;
    }

    public final void a(pi piVar) {
        ms1 ms1Var = this.e;
        ms1Var.getClass();
        try {
            ms1Var.k.postDelayed(piVar, 5000L);
        } catch (IllegalStateException e) {
            ms1Var.a.reportException(ms1Var.j, "OpenGL tread died, is it fine?", e);
        }
    }

    public final void b() {
        ms1 ms1Var = this.e;
        ms1Var.a.log(ms1Var.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (ms1Var.h) {
            if (ms1Var.i) {
                ms1Var.i = false;
                ms1Var.k.postAtFrontOfQueue(new qe(ms1Var, 22, countDownLatch));
                ms1Var.a.log(ms1Var.j, "Release action submitted");
            } else {
                ms1Var.a.log(ms1Var.j, "Already released, ignore");
                countDownLatch.countDown();
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void c(ms1 ms1Var, u52 u52Var, VideoFrame videoFrame, qw1 qw1Var) {
        ms1Var.getClass();
        EGLSurface eGLSurface = u52Var.a;
        if (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        ms1Var.b(eGLSurface);
        ms1.a("makeCurrent()");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        Matrix matrix = this.f;
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(qw1Var.c ? -1.0f : 1.0f, 1.0f);
        matrix.preScale(qw1Var.a, qw1Var.b);
        matrix.preTranslate(-0.5f, -0.5f);
        RendererCommon.GlDrawer glDrawer = u52Var.k;
        if (glDrawer == null) {
            glDrawer = this.h;
        }
        RendererCommon.GlDrawer glDrawer2 = glDrawer;
        EGLDisplay eGLDisplay = ms1Var.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        int i = iArr[0];
        EGLDisplay eGLDisplay2 = ms1Var.e;
        if (eGLDisplay2 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr2 = new int[1];
        EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
        this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i, iArr2[0]);
        ms1.a("drawFrame()");
        long jNanoTime2 = System.nanoTime();
        EGLDisplay eGLDisplay3 = ms1Var.e;
        if (eGLDisplay3 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
        ms1.a("swapBuffers()");
        long jNanoTime3 = System.nanoTime();
        v52 v52Var = u52Var.l;
        v52Var.h += jNanoTime3 - jNanoTime;
        v52Var.i += jNanoTime3 - jNanoTime2;
        ms1.a("swapBuffers()");
    }
}
