package defpackage;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* JADX INFO: loaded from: classes3.dex */
public final class t0j implements dch {
    public final String a;
    public final AtomicBoolean b;
    public final q0j c;
    public final Handler d;
    public final us7 e;
    public final CopyOnWriteArraySet f;
    public final LinkedHashMap g;
    public final float[] h;
    public final float[] i;
    public h1j j;
    public boolean k;
    public int l;
    public boolean m;

    public t0j(Size size) {
        fx5 fx5Var = fx5.d;
        String name = t0j.class.getName();
        this.a = name;
        this.b = new AtomicBoolean();
        this.f = new CopyOnWriteArraySet();
        this.g = new LinkedHashMap();
        this.h = new float[16];
        this.i = new float[16];
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "init, preview=" + size + ", dr=" + fx5Var + ", stencil=" + ((String) null) + ", isStencilRecyclable=true", null);
            }
        }
        s3m.a(fx5Var);
        q0j q0jVar = new q0j(this, size, fx5Var);
        this.c = q0jVar;
        q0jVar.start();
        Handler handler = new Handler(q0jVar.getLooper());
        this.d = handler;
        Throwable th = (Throwable) q0jVar.d.get();
        if (th == null) {
            this.e = new us7(handler);
            return;
        }
        release();
        if (!(th instanceof VideoMessageProcessorException)) {
            throw new VideoMessageProcessorException("Failed to create video message processor", th);
        }
    }

    public static final void a(t0j t0jVar, Size size, fx5 fx5Var) {
        String str = t0jVar.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "initRendererOnGl, previewSize=" + size + ", dynamicRange=" + fx5Var, null);
            }
        }
        t0jVar.b();
        if (t0jVar.k) {
            ore.k("GL is already RELEASED!");
            return;
        }
        h1j h1jVar = t0jVar.j;
        if (h1jVar == null) {
            t0jVar.j = new h1j(size, fx5Var);
        } else {
            qr7.r(h1jVar, "Renderer already created, ");
        }
    }

    public static void g(t0j t0jVar, af7 af7Var, af7 af7Var2, int i) {
        String str;
        if ((i & 4) != 0) {
            af7Var2 = null;
        }
        if (t0jVar.d.post(new ewg(t0jVar, 20, af7Var))) {
            return;
        }
        String str2 = t0jVar.a;
        if (af7Var2 == null || (str = (String) af7Var2.invoke()) == null) {
            str = "";
        }
        String strO = c0a.o("postToGl, failed to post '", str, "' to the GL thread!");
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str2, strO, null, null, 8);
        }
    }

    public final void b() {
        Thread threadCurrentThread = Thread.currentThread();
        q0j q0jVar = this.c;
        if (cqk.d(threadCurrentThread, q0jVar)) {
            return;
        }
        throw new IllegalStateException(("Illegal thread=" + threadCurrentThread + ", expected=" + q0jVar).toString());
    }

    @Override // defpackage.dch
    public final void d(cch cchVar) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onOutputSurface, surfaceOutput=" + cchVar + ", size=" + cchVar.d, null);
            }
        }
        if (this.b.get()) {
            cchVar.close();
            return;
        }
        j0i j0iVar = new j0i(cchVar, 10, this);
        occ occVar = new occ(0, cchVar, cch.class, "close", "close()V", 0, 14);
        if (this.d.post(new ewg(this, 20, j0iVar))) {
            return;
        }
        String str2 = this.a;
        String strO = c0a.o("postToGl, failed to post '", "onOutputSurface", "' to the GL thread!");
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            a4c.f(a4cVar2, je9.g, str2, strO, null, null, 8);
        }
        occVar.invoke();
    }

    @Override // defpackage.dch
    public final void e(ich ichVar) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onInputSurface, request=" + ichVar, null);
            }
        }
        if (this.b.get()) {
            ichVar.d();
            return;
        }
        fx5 fx5Var = ichVar.c;
        s3m.a(fx5Var);
        i8f i8fVar = new i8f(ichVar, this, fx5Var, 11);
        g6b g6bVar = new g6b(0, ichVar, ich.class, "willNotProvideSurface", "willNotProvideSurface()Z", 8, 2);
        if (this.d.post(new ewg(this, 20, i8fVar))) {
            return;
        }
        String str2 = this.a;
        String strO = c0a.o("postToGl, failed to post '", "onInputSurface", "' to the GL thread!");
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            a4c.f(a4cVar2, je9.g, str2, strO, null, null, 8);
        }
        g6bVar.invoke();
    }

    public final void f() {
        String str = this.a;
        gm0.Y(str, "maybeReleaseGl");
        b();
        if (this.k && this.l == 0) {
            LinkedHashMap linkedHashMap = this.g;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                cch cchVar = (cch) entry.getKey();
                gm0.Y(str, "close surface output=" + cchVar + ", surface=" + ((Surface) entry.getValue()));
                cchVar.close();
            }
            linkedHashMap.clear();
            h1j h1jVar = this.j;
            if (h1jVar != null) {
                h1jVar.q();
            }
            this.j = null;
            this.c.quitSafely();
        }
    }

    @Override // defpackage.dch
    public final void release() {
        gm0.Y(this.a, "release");
        this.f.clear();
        if (this.b.getAndSet(true)) {
            return;
        }
        g(this, new vbi(9, this), null, 6);
    }
}
