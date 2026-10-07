package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class wje extends HandlerThread {
    public final ReentrantLock a;
    public final Condition b;
    public m2a c;
    public t3a d;
    public gvb e;
    public final LinkedHashMap f;
    public final LinkedHashSet g;

    public wje() {
        super("OneVideoRenderThread", -8);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashSet();
    }

    public final void a(ldc ldcVar, fbc fbcVar, Handler handler) {
        if (!d()) {
            m2a m2aVarC = c();
            m2aVarC.getClass();
            m2aVarC.sendMessage(m2aVarC.obtainMessage(0, new nje(ldcVar, fbcVar, handler)));
        } else {
            if (this.f.containsKey(ldcVar)) {
                return;
            }
            wfe wfeVar = new wfe();
            gvb gvbVar = this.e;
            if (gvbVar == null) {
                gvbVar = null;
            }
            gvbVar.Q(new qy8(this, wfeVar, handler, fbcVar, ldcVar, 1));
        }
    }

    public final void b(Object obj) {
        if (!d()) {
            m2a m2aVarC = c();
            m2aVarC.sendMessage(m2aVarC.obtainMessage(1, obj));
            return;
        }
        LinkedHashMap linkedHashMap = this.f;
        uje ujeVar = (uje) linkedHashMap.get(obj);
        if (ujeVar != null) {
            gvb gvbVar = this.e;
            if (gvbVar == null) {
                gvbVar = null;
            }
            gvbVar.Q(new sje(ujeVar, 1));
            linkedHashMap.remove(obj);
            e(ujeVar.h);
        }
    }

    public final m2a c() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        while (true) {
            try {
                m2a m2aVar = this.c;
                if (m2aVar != null) {
                    reentrantLock.unlock();
                    return m2aVar;
                }
                this.b.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean d() {
        m2a m2aVar = this.c;
        if ((m2aVar != null ? m2aVar.getLooper() : null) == null) {
            return false;
        }
        Looper looperMyLooper = Looper.myLooper();
        m2a m2aVar2 = this.c;
        return cqk.d(looperMyLooper, m2aVar2 != null ? m2aVar2.getLooper() : null);
    }

    public final void e(f2d f2dVar) {
        Object next;
        Iterator it = this.f.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((uje) next).h != f2dVar);
        if (next == null) {
            gvb gvbVar = this.e;
            (gvbVar != null ? gvbVar : null).Q(new vje(f2dVar, 1));
            f2dVar.getClass();
            this.g.remove(f2dVar);
        }
    }

    public final void f(Object obj) {
        if (!d()) {
            m2a m2aVarC = c();
            m2aVarC.sendMessage(m2aVarC.obtainMessage(4, obj));
            return;
        }
        uje ujeVar = (uje) this.f.get(obj);
        if (ujeVar != null) {
            ujeVar.l = false;
            ujeVar.e = false;
        }
    }

    public final void g(Object obj, Surface surface) {
        uje ujeVar;
        if (!d()) {
            m2a m2aVarC = c();
            m2aVarC.getClass();
            pje pjeVar = new pje(obj, surface);
            m2aVarC.removeMessages(2, pjeVar);
            m2aVarC.sendMessage(m2aVarC.obtainMessage(2, pjeVar));
            return;
        }
        LinkedHashMap linkedHashMap = this.f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!cqk.d(entry.getKey(), obj) && surface != null) {
                g85 g85Var = ((uje) entry.getValue()).k;
                if (cqk.d(g85Var != null ? g85Var.I() : null, surface)) {
                    ((uje) entry.getValue()).c(null);
                }
            }
        }
        if ((surface == null || surface.isValid()) && (ujeVar = (uje) linkedHashMap.get(obj)) != null) {
            ujeVar.c(surface);
        }
    }

    public final void h(Object obj, Size size) {
        g85 g85Var;
        Surface surfaceI;
        g85 g85Var2;
        Surface surfaceI2;
        if (!d()) {
            m2a m2aVarC = c();
            m2aVarC.getClass();
            m2aVarC.sendMessage(m2aVarC.obtainMessage(5, new qje(obj, size)));
            return;
        }
        uje ujeVar = (uje) this.f.get(obj);
        if (ujeVar == null || cqk.d(ujeVar.j, size)) {
            return;
        }
        ujeVar.j = size;
        if (size != null) {
            if (!ujeVar.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                g85 g85Var3 = ujeVar.k;
                if ((g85Var3 == null || (surfaceI2 = g85Var3.I()) == null || surfaceI2.isValid()) && (g85Var2 = ujeVar.k) != null) {
                    g85Var2.J(new os1(ujeVar, size, g85Var2, 17));
                    return;
                }
                return;
            }
        }
        g85 g85Var4 = ujeVar.k;
        if ((g85Var4 == null || (surfaceI = g85Var4.I()) == null || surfaceI.isValid()) && (g85Var = ujeVar.k) != null) {
            g85Var.J(new p7d(18, g85Var));
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        t3a t3aVar = new t3a();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (cqk.d(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            ore.q("Unable to get EGL14 display");
            return;
        }
        int i = 2;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            ore.q("Unable to initialize EGL14");
            return;
        }
        t3aVar.a = eGLDisplayEglGetDisplay;
        this.d = t3aVar;
        gvb gvbVar = new gvb();
        EGLDisplay eGLDisplay = (EGLDisplay) t3aVar.a;
        gvbVar.b = eGLDisplay;
        EGLConfig eGLConfigH = wk8.h(eGLDisplay, 4);
        gvbVar.c = eGLConfigH;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfigH, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (cqk.d(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            wk8.g("eglCreateContext", new int[0]);
        }
        gvbVar.d = eGLContextEglCreateContext;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, wk8.h(eGLDisplay, 1), new int[]{12375, 1, 12374, 1, 12417, 12380, 12416, 12380, 12344}, 0);
        if (cqk.d(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            wk8.g("eglCreatePbufferSurface", new int[0]);
        }
        gvbVar.a = eGLSurfaceEglCreatePbufferSurface;
        this.e = gvbVar;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c = new m2a(i, getLooper(), new WeakReference(this));
            Looper looper = getLooper();
            if (looper == null && (looper = Looper.myLooper()) == null) {
                looper = Looper.getMainLooper();
            }
            new Handler(looper);
            this.b.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        gvb gvbVar = this.e;
        if (gvbVar == null) {
            gvbVar = null;
        }
        gvbVar.Q(new a8d(26, this));
        this.f.clear();
        this.g.clear();
        gvb gvbVar2 = this.e;
        if (gvbVar2 == null) {
            gvbVar2 = null;
        }
        EGLDisplay eGLDisplay = (EGLDisplay) gvbVar2.b;
        if (!cqk.d((EGLContext) gvbVar2.d, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) gvbVar2.a);
            wk8.g("eglDestroySurface", new int[0]);
            gvbVar2.a = EGL14.EGL_NO_SURFACE;
            EGL14.eglDestroyContext(eGLDisplay, (EGLContext) gvbVar2.d);
            wk8.g("eglDestroyContext", new int[0]);
            gvbVar2.d = EGL14.EGL_NO_CONTEXT;
        }
        t3a t3aVar = this.d;
        t3a t3aVar2 = t3aVar != null ? t3aVar : null;
        if (cqk.d((EGLDisplay) t3aVar2.a, EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglTerminate((EGLDisplay) t3aVar2.a);
        wk8.g("eglTerminate", new int[0]);
        t3aVar2.a = EGL14.EGL_NO_DISPLAY;
        EGL14.eglReleaseThread();
        wk8.g("eglReleaseThread", new int[0]);
    }
}
