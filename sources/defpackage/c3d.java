package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class c3d implements j4j {
    public final int a;
    public c98 b;
    public b87 c;
    public int d;
    public long e;
    public long f;
    public int g;
    public h4j h;
    public Executor i;
    public boolean j;
    public final /* synthetic */ g3d k;

    public c3d(g3d g3dVar, Context context) {
        this.k = g3dVar;
        this.a = vqi.P(context) ? 1 : 5;
        a98 a98Var = c98.b;
        this.b = ghe.e;
        this.f = -9223372036854775807L;
        this.h = h4j.a;
        this.i = g3d.B;
    }

    @Override // defpackage.j4j
    public final void a() {
        long j = this.f;
        g3d g3dVar = this.k;
        g3dVar.x = j;
        if (g3dVar.w >= j) {
            g3dVar.e.a();
            g3dVar.y = true;
        }
    }

    @Override // defpackage.j4j
    public final void b() {
        if (this.j) {
            g3d g3dVar = this.k;
            long j = g3dVar.w;
            g3d.c(g3dVar, false);
            hxi hxiVar = g3dVar.p;
            hxiVar.getClass();
            hxiVar.b();
            g3dVar.w = j;
        }
    }

    @Override // defpackage.j4j
    public final boolean c() {
        if (!this.j) {
            return false;
        }
        g3d g3dVar = this.k;
        return g3dVar.u == 0 && g3dVar.y && g3dVar.e.c();
    }

    @Override // defpackage.j4j
    public final boolean d() {
        return this.j;
    }

    @Override // defpackage.j4j
    public final void e(Surface surface, lag lagVar) {
        g3d g3dVar = this.k;
        Pair pair = g3dVar.t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((lag) g3dVar.t.second).equals(lagVar)) {
            return;
        }
        g3dVar.t = Pair.create(surface, lagVar);
        g3dVar.f(surface, lagVar.a, lagVar.b);
    }

    @Override // defpackage.j4j
    public final void f(long j) {
        this.e = j;
    }

    @Override // defpackage.j4j
    public final void g(vt9 vt9Var) {
        this.h = vt9Var;
        this.i = im5.a;
    }

    @Override // defpackage.j4j
    public final Surface getInputSurface() {
        lvb.b0(this.j);
        hxi hxiVar = this.k.p;
        hxiVar.getClass();
        return hxiVar.e(0);
    }

    @Override // defpackage.j4j
    public final void h(List list) {
        c98 c98Var = this.b;
        c98Var.getClass();
        if (j8f.a(c98Var, list)) {
            return;
        }
        this.b = c98.n(list);
        b87 b87Var = this.c;
        if (b87Var != null) {
            v(b87Var);
        }
    }

    @Override // defpackage.j4j
    public final boolean i(boolean z) {
        boolean z2 = false;
        boolean z3 = z && this.j;
        g3d g3dVar = this.k;
        rf5 rf5Var = g3dVar.e;
        if (z3 && g3dVar.u == 0) {
            z2 = true;
        }
        return rf5Var.a.b(z2);
    }

    @Override // defpackage.j4j
    public final void j(int i, long j, b87 b87Var, List list) {
        lvb.b0(this.j);
        this.b = c98.n(list);
        this.d = 1;
        this.c = b87Var;
        g3d g3dVar = this.k;
        g3dVar.x = -9223372036854775807L;
        g3dVar.y = false;
        v(b87Var);
        long j2 = this.f;
        boolean z = j2 == -9223372036854775807L;
        if (g3dVar.d || z) {
            long j3 = z ? -4611686018427387904L : 1 + j2;
            g3dVar.k.a(j3, new f3d(i, j + this.e, j3));
        }
    }

    @Override // defpackage.j4j
    public final void k() {
        g3d g3dVar = this.k;
        rf5 rf5Var = g3dVar.e;
        if (g3dVar.k.f() == 0) {
            rf5Var.k();
            return;
        }
        i0g i0gVar = new i0g();
        boolean z = true;
        while (g3dVar.k.f() > 0) {
            f3d f3dVar = (f3d) g3dVar.k.c();
            f3dVar.getClass();
            if (z) {
                int i = f3dVar.b;
                if (i == 0 || i == 1) {
                    f3dVar = new f3d(0, f3dVar.a, f3dVar.c);
                } else {
                    rf5Var.k();
                }
                z = false;
            }
            i0gVar.a(f3dVar.c, f3dVar);
        }
        g3dVar.k = i0gVar;
    }

    @Override // defpackage.j4j
    public final boolean l(long j, i4j i4jVar) {
        int i;
        lvb.b0(this.j);
        long j2 = j + this.e;
        g3d g3dVar = this.k;
        long jB = g3dVar.j.b(j2);
        if (jB != -9223372036854775807L) {
            long j3 = g3dVar.i;
            if (j3 != -9223372036854775807L && jB < j3 && (i = this.g) < 2) {
                this.g = i + 1;
                ((wt9) i4jVar).b();
                return true;
            }
        }
        int i2 = g3dVar.z;
        if (i2 != -1 && i2 == g3dVar.A) {
            hxi hxiVar = g3dVar.p;
            hxiVar.getClass();
            if (hxiVar.l(0) < this.a) {
                hxi hxiVar2 = g3dVar.p;
                hxiVar2.getClass();
                if (hxiVar2.c(0)) {
                    this.f = j2;
                    ((wt9) i4jVar).a(j2 * 1000);
                    this.g = 0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.j4j
    public final void m() {
        g3d g3dVar = this.k;
        if (g3dVar.d) {
            g3dVar.e.m();
        }
    }

    @Override // defpackage.j4j
    public final void n() {
        g3d g3dVar = this.k;
        if (g3dVar.d) {
            g3dVar.e.n();
        }
    }

    @Override // defpackage.j4j
    public final void o(int i) {
        this.k.e.o(i);
    }

    @Override // defpackage.j4j
    public final void p() {
        lag lagVar = lag.c;
        int i = lagVar.a;
        int i2 = lagVar.b;
        g3d g3dVar = this.k;
        g3dVar.f(null, i, i2);
        g3dVar.t = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[Catch: GlUtil$GlException -> 0x0043, TryCatch #0 {GlUtil$GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0082, B:25:0x0050), top: B:54:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: GlUtil$GlException -> 0x0043, TryCatch #0 {GlUtil$GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0082, B:25:0x0050), top: B:54:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[Catch: GlUtil$GlException -> 0x0043, TRY_LEAVE, TryCatch #0 {GlUtil$GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0082, B:25:0x0050), top: B:54:0x002b }] */
    @Override // defpackage.j4j
    public final boolean q(b87 b87Var) throws VideoSink$VideoSinkException {
        boolean zX;
        lvb.b0(!this.j);
        g3d g3dVar = this.k;
        rf5 rf5Var = g3dVar.e;
        lvb.b0(g3dVar.v == 0);
        ex3 ex3VarA = b87Var.D;
        if (ex3VarA == null || !ex3VarA.f()) {
            ex3VarA = ex3.h;
        }
        int i = ex3VarA.c;
        if (i == 7) {
            try {
                if (Build.VERSION.SDK_INT >= 34 || !tab.w()) {
                    if (i == 6) {
                        zX = tab.w();
                    } else if (i == 7) {
                        zX = tab.x("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else {
                        zX = true;
                    }
                    if (zX && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        lvb.G0("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        ex3VarA = ex3.h;
                    } else if (i != 2 || i == 10) {
                        ex3VarA = ex3.h;
                    }
                } else {
                    dx3 dx3VarA = ex3VarA.a();
                    dx3VarA.c = 6;
                    ex3VarA = dx3VarA.a();
                }
            } catch (GlUtil$GlException e) {
                throw new VideoSink$VideoSinkException(e, b87Var);
            }
        } else {
            if (i == 6) {
                zX = tab.w();
            } else if (i == 7) {
                zX = tab.x("EGL_EXT_gl_colorspace_bt2020_hlg");
            } else {
                zX = true;
            }
            if (zX) {
                if (i != 2) {
                    ex3VarA = ex3.h;
                } else {
                    ex3VarA = ex3.h;
                }
            } else if (i != 2) {
                ex3VarA = ex3.h;
            } else {
                ex3VarA = ex3.h;
            }
        }
        ex3 ex3Var = ex3VarA;
        qt3 qt3Var = g3dVar.g;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sfh sfhVarA = ((nfh) qt3Var).a(looperMyLooper, null);
        g3dVar.o = sfhVarA;
        try {
            hxi hxiVarA = g3dVar.b.a(g3dVar.a, ex3Var, p51.c, g3dVar, new ag6(sfhVarA, 0), 0L, false);
            g3dVar.p = hxiVarA;
            hxiVarA.d(g3dVar.n);
            g3dVar.p.j(g3dVar.m);
            g3dVar.p.k();
            Pair pair = g3dVar.t;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                lag lagVar = (lag) pair.second;
                g3dVar.f(surface, lagVar.a, lagVar.b);
            }
            rf5Var.getClass();
            a3d a3dVar = new a3d(g3dVar);
            sfh sfhVar = g3dVar.o;
            Objects.requireNonNull(sfhVar);
            ag6 ag6Var = new ag6(sfhVar, 1);
            rf5Var.h = a3dVar;
            rf5Var.i = ag6Var;
            g3dVar.v = 1;
            try {
                hxi hxiVar = g3dVar.p;
                hxiVar.getClass();
                hxiVar.m(0);
                g3dVar.A++;
                this.j = true;
                return true;
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink$VideoSinkException(e2, b87Var);
            }
        } catch (VideoFrameProcessingException e3) {
            throw new VideoSink$VideoSinkException(e3, b87Var);
        }
    }

    @Override // defpackage.j4j
    public final void r(boolean z) {
        boolean z2 = this.j;
        g3d g3dVar = this.k;
        if (z2) {
            hxi hxiVar = g3dVar.p;
            hxiVar.getClass();
            hxiVar.flush();
        }
        this.f = -9223372036854775807L;
        g3d.c(g3dVar, z);
    }

    @Override // defpackage.j4j
    public final void release() {
        g3d g3dVar = this.k;
        if (g3dVar.v == 2) {
            return;
        }
        sfh sfhVar = g3dVar.o;
        if (sfhVar != null) {
            sfhVar.g();
        }
        hxi hxiVar = g3dVar.p;
        if (hxiVar != null) {
            hxiVar.release();
        }
        g3dVar.t = null;
        g3dVar.v = 2;
    }

    @Override // defpackage.j4j
    public final void s(long j, long j2) {
        this.k.e.s(j + this.e, j2);
    }

    @Override // defpackage.j4j
    public final void setPlaybackSpeed(float f) {
        g3d g3dVar = this.k;
        g3dVar.j.d(f);
        g3dVar.e.setPlaybackSpeed(f);
    }

    @Override // defpackage.j4j
    public final void t(boolean z) {
        g3d g3dVar = this.k;
        if (g3dVar.d) {
            g3dVar.e.t(z);
        }
    }

    @Override // defpackage.j4j
    public final void u(mwi mwiVar) {
        g3d g3dVar = this.k;
        g3dVar.q = mwiVar;
        g3dVar.e.j = mwiVar;
    }

    public final void v(b87 b87Var) {
        a87 a87VarA = b87Var.a();
        ex3 ex3Var = b87Var.D;
        if (ex3Var == null || !ex3Var.f()) {
            ex3Var = ex3.h;
        }
        a87VarA.C = ex3Var;
        b87 b87Var2 = new b87(a87VarA);
        int i = this.d != 1 ? 2 : 1;
        hxi hxiVar = this.k.p;
        hxiVar.getClass();
        hxiVar.n(0, i, b87Var2, this.b, 0L);
    }
}
