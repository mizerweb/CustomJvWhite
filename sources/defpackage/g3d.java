package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g3d implements gxi {
    public static final of5 B = new of5(0);
    public int A;
    public final Context a;
    public final m7b b;
    public final SparseArray c;
    public final boolean d;
    public final rf5 e;
    public final y2d f;
    public final qt3 g;
    public final CopyOnWriteArraySet h;
    public final long i;
    public final vwi j;
    public i0g k = new i0g();
    public b87 l;
    public final er3 m;
    public final ghe n;
    public sfh o;
    public hxi p;
    public mwi q;
    public long r;
    public int s;
    public Pair t;
    public int u;
    public int v;
    public long w;
    public long x;
    public boolean y;
    public int z;

    public g3d(z2d z2dVar) {
        this.a = z2dVar.a;
        m7b m7bVar = z2dVar.c;
        m7bVar.getClass();
        this.b = m7bVar;
        this.c = new SparseArray();
        a98 a98Var = c98.b;
        this.n = ghe.e;
        this.m = er3.m;
        this.d = z2dVar.d;
        qt3 qt3Var = z2dVar.e;
        this.g = qt3Var;
        long j = z2dVar.g;
        this.i = j != -9223372036854775807L ? -j : -9223372036854775807L;
        vwi vwiVar = z2dVar.h;
        this.j = vwiVar;
        this.e = new rf5(z2dVar.b, vwiVar, qt3Var);
        this.f = new y2d(this);
        this.h = new CopyOnWriteArraySet();
        this.l = new b87(new a87());
        this.r = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -1;
        this.v = 0;
    }

    public static void c(g3d g3dVar, boolean z) {
        i0g i0gVar;
        if (g3dVar.v == 1) {
            g3dVar.u++;
            g3dVar.e.r(z);
            while (true) {
                int iF = g3dVar.k.f();
                i0gVar = g3dVar.k;
                if (iF <= 1) {
                    break;
                } else {
                    i0gVar.c();
                }
            }
            if (i0gVar.f() == 1) {
                f3d f3dVar = (f3d) g3dVar.k.c();
                f3dVar.getClass();
                g3dVar.r = f3dVar.a;
                g3dVar.s = f3dVar.b;
                g3dVar.g();
            }
            g3dVar.w = -9223372036854775807L;
            if (z) {
                g3dVar.x = -9223372036854775807L;
                g3dVar.y = false;
            }
            sfh sfhVar = g3dVar.o;
            sfhVar.getClass();
            sfhVar.f(new h7b(8, g3dVar));
        }
    }

    @Override // defpackage.gxi
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        for (c3d c3dVar : this.h) {
            c3dVar.i.execute(new d86(c3dVar, c3dVar.h, videoFrameProcessingException, 22));
        }
    }

    @Override // defpackage.gxi
    public final void b(long j) {
    }

    public final j4j d() {
        SparseArray sparseArray = this.c;
        if (vqi.l(sparseArray, 0)) {
            return (j4j) sparseArray.get(0);
        }
        c3d c3dVar = new c3d(this, this.a);
        this.h.add(c3dVar);
        sparseArray.put(0, c3dVar);
        return c3dVar;
    }

    @Override // defpackage.gxi
    public final void e(long j, boolean z) {
        if (this.u > 0) {
            return;
        }
        for (c3d c3dVar : this.h) {
            h4j h4jVar = c3dVar.h;
            Executor executor = c3dVar.i;
            Objects.requireNonNull(h4jVar);
            executor.execute(new b3d(h4jVar, 0));
        }
        if (z) {
            mwi mwiVar = this.q;
            if (mwiVar != null) {
                mwiVar.b(j, -9223372036854775807L, this.l, null);
                return;
            }
            return;
        }
        this.w = j;
        f3d f3dVar = (f3d) this.k.d(j);
        if (f3dVar != null) {
            this.r = f3dVar.a;
            this.s = f3dVar.b;
            g();
        }
        y2d y2dVar = this.f;
        rf5 rf5Var = this.e;
        rf5Var.l(j, y2dVar);
        long j2 = this.x;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        rf5Var.a();
        this.y = true;
    }

    public final void f(Surface surface, int i, int i2) {
        hxi hxiVar = this.p;
        if (hxiVar == null) {
            return;
        }
        rf5 rf5Var = this.e;
        if (surface != null) {
            hxiVar.i(new bch(surface, i, i2, 0, false));
            rf5Var.e(surface, new lag(i, i2));
        } else {
            hxiVar.i(null);
            rf5Var.p();
        }
    }

    public final void g() {
        b87 b87Var = this.l;
        long j = this.r;
        int i = this.s;
        a98 a98Var = c98.b;
        this.e.j(i, j, b87Var, ghe.e);
    }

    @Override // defpackage.gxi
    public final void h(int i, int i2) {
        a87 a87VarA = this.l.a();
        a87VarA.t = i;
        a87VarA.u = i2;
        this.l = new b87(a87VarA);
        g();
    }

    public final void i() {
        if (1 < this.z) {
            return;
        }
        this.z = 1;
    }

    @Override // defpackage.gxi
    public final void l(float f) {
        a87 a87VarA = this.l.a();
        a87VarA.x = f;
        this.l = new b87(a87VarA);
        g();
    }
}
