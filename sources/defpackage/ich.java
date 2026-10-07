package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ich {
    public static final Range q = yi0.h;
    public final Object a = new Object();
    public final Size b;
    public final fx5 c;
    public final Range d;
    public final pf2 e;
    public final boolean f;
    public final int g;
    public final u72 h;
    public final r72 i;
    public final u72 j;
    public final r72 k;
    public final r72 l;
    public final i88 m;
    public dj0 n;
    public hch o;
    public Executor p;

    public ich(Size size, pf2 pf2Var, boolean z, fx5 fx5Var, int i, Range range, ubh ubhVar) {
        this.b = size;
        this.e = pf2Var;
        this.f = z;
        qyj.h("SurfaceRequest's DynamicRange must always be fully specified.", fx5Var.b());
        this.c = fx5Var;
        this.g = i;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            atomicReference.set(r72Var);
            r72Var.a = str.concat("-cancellation");
        } catch (Exception e) {
            u72Var.c(e);
        }
        r72 r72Var2 = (r72) atomicReference.get();
        r72Var2.getClass();
        this.l = r72Var2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        r72 r72Var3 = new r72();
        r72Var3.c = new gne();
        u72 u72Var2 = new u72(r72Var3);
        r72Var3.b = u72Var2;
        r72Var3.a = qt4.class;
        try {
            atomicReference2.set(r72Var3);
            r72Var3.a = str.concat("-status");
        } catch (Exception e2) {
            u72Var2.c(e2);
        }
        this.j = u72Var2;
        o9b.a(u72Var2, new wze(r72Var2, 5, u72Var), zjl.a());
        r72 r72Var4 = (r72) atomicReference2.get();
        r72Var4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        r72 r72Var5 = new r72();
        r72Var5.c = new gne();
        u72 u72Var3 = new u72(r72Var5);
        r72Var5.b = u72Var3;
        r72Var5.a = qt4.class;
        try {
            atomicReference3.set(r72Var5);
            r72Var5.a = str.concat("-Surface");
        } catch (Exception e3) {
            u72Var3.c(e3);
        }
        this.h = u72Var3;
        r72 r72Var6 = (r72) atomicReference3.get();
        r72Var6.getClass();
        this.i = r72Var6;
        i88 i88Var = new i88(this, size);
        this.m = i88Var;
        e89 e89VarG = o9b.g(i88Var.e);
        o9b.a(u72Var3, new xtj(e89VarG, r72Var4, str, 17), zjl.a());
        e89VarG.b(new de5(this, 1), zjl.a());
        jm5 jm5VarA = zjl.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        o9b.a(f55.m(new c5f(this, 5, atomicReference4)), new uik(26, ubhVar), jm5VarA);
        r72 r72Var7 = (r72) atomicReference4.get();
        r72Var7.getClass();
        this.k = r72Var7;
    }

    public final void a() {
        synchronized (this.a) {
            this.o = null;
            this.p = null;
        }
    }

    public final void b(final Surface surface, Executor executor, final ug4 ug4Var) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: fch
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    ug4 ug4Var2 = ug4Var;
                    switch (i2) {
                        case 0:
                            ug4Var2.accept(new cj0(2, surface2));
                            break;
                        case 1:
                            ug4Var2.accept(new cj0(3, surface2));
                            break;
                        default:
                            ug4Var2.accept(new cj0(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.i.b(surface)) {
            u72 u72Var = this.h;
            if (!u72Var.isCancelled()) {
                qyj.l(null, u72Var.b.isDone());
                try {
                    u72Var.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: fch
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            Surface surface2 = surface;
                            ug4 ug4Var2 = ug4Var;
                            switch (i3) {
                                case 0:
                                    ug4Var2.accept(new cj0(2, surface2));
                                    break;
                                case 1:
                                    ug4Var2.accept(new cj0(3, surface2));
                                    break;
                                default:
                                    ug4Var2.accept(new cj0(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: fch
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Surface surface2 = surface;
                            ug4 ug4Var2 = ug4Var;
                            switch (i4) {
                                case 0:
                                    ug4Var2.accept(new cj0(2, surface2));
                                    break;
                                case 1:
                                    ug4Var2.accept(new cj0(3, surface2));
                                    break;
                                default:
                                    ug4Var2.accept(new cj0(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        o9b.a(this.j, new h6f(ug4Var, 5, surface), executor);
    }

    public final void c(Executor executor, hch hchVar) {
        dj0 dj0Var;
        synchronized (this.a) {
            this.o = hchVar;
            this.p = executor;
            dj0Var = this.n;
        }
        if (dj0Var != null) {
            executor.execute(new ech(hchVar, dj0Var, 1));
        }
    }

    public final boolean d() {
        return this.i.d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
