package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wf5 {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public r72 d;
    public final u72 e;
    public r72 f;
    public final u72 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = tvj.f(3, "DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public wf5(int i, Size size) {
        final int i2 = 0;
        this.h = size;
        this.i = i;
        u72 u72VarM = f55.m(new s72(this) { // from class: vf5
            public final /* synthetic */ wf5 b;

            {
                this.b = this;
            }

            @Override // defpackage.s72
            public final Object Q(r72 r72Var) {
                int i3 = i2;
                wf5 wf5Var = this.b;
                switch (i3) {
                    case 0:
                        synchronized (wf5Var.a) {
                            wf5Var.d = r72Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + wf5Var + ")";
                    default:
                        synchronized (wf5Var.a) {
                            wf5Var.f = r72Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + wf5Var + ")";
                }
            }
        });
        this.e = u72VarM;
        final int i3 = 1;
        this.g = f55.m(new s72(this) { // from class: vf5
            public final /* synthetic */ wf5 b;

            {
                this.b = this;
            }

            @Override // defpackage.s72
            public final Object Q(r72 r72Var) {
                int i4 = i3;
                wf5 wf5Var = this.b;
                switch (i4) {
                    case 0:
                        synchronized (wf5Var.a) {
                            wf5Var.d = r72Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + wf5Var + ")";
                    default:
                        synchronized (wf5Var.a) {
                            wf5Var.f = r72Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + wf5Var + ")";
                }
            }
        });
        if (tvj.f(3, "DeferrableSurface")) {
            e(m.incrementAndGet(), l.get(), "Surface created");
            u72VarM.b.b(new gf5(this, 2, Log.getStackTraceString(new Exception())), zjl.a());
        }
    }

    public void a() {
        r72 r72Var;
        synchronized (this.a) {
            try {
                if (this.c) {
                    r72Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        r72Var = this.d;
                        this.d = null;
                    } else {
                        r72Var = null;
                    }
                    if (tvj.f(3, "DeferrableSurface")) {
                        tvj.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r72Var != null) {
            r72Var.b(null);
        }
    }

    public final void b() {
        r72 r72Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    r72Var = this.d;
                    this.d = null;
                } else {
                    r72Var = null;
                }
                if (tvj.f(3, "DeferrableSurface")) {
                    tvj.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        e(m.get(), l.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r72Var != null) {
            r72Var.b(null);
        }
    }

    public final e89 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new g88(1, new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (tvj.f(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        e(m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    tvj.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!k && tvj.f(3, "DeferrableSurface")) {
            tvj.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        tvj.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract e89 f();
}
