package defpackage;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rf5 implements j4j {
    public final uwi a;
    public final vwi b;
    public final bxi c;
    public final ArrayDeque d;
    public Surface e;
    public b87 f;
    public long g;
    public h4j h;
    public Executor i;
    public mwi j;

    public rf5(uwi uwiVar, vwi vwiVar, qt3 qt3Var) {
        this.a = uwiVar;
        this.b = vwiVar;
        uwiVar.l = qt3Var;
        this.c = new bxi(new xp9(this), uwiVar, vwiVar);
        this.d = new ArrayDeque();
        this.f = new b87(new a87());
        this.g = -9223372036854775807L;
        this.h = h4j.a;
        this.i = new of5(0);
        this.j = new pf5();
    }

    @Override // defpackage.j4j
    public final void a() {
        bxi bxiVar = this.c;
        if (bxiVar.h == -9223372036854775807L) {
            bxiVar.h = Long.MIN_VALUE;
            bxiVar.i = Long.MIN_VALUE;
        }
        bxiVar.j = bxiVar.h;
    }

    @Override // defpackage.j4j
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.j4j
    public final boolean c() {
        bxi bxiVar = this.c;
        long j = bxiVar.j;
        return j != -9223372036854775807L && bxiVar.i == j;
    }

    @Override // defpackage.j4j
    public final boolean d() {
        return true;
    }

    @Override // defpackage.j4j
    public final void e(Surface surface, lag lagVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.j4j
    public final void f(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.j4j
    public final void g(vt9 vt9Var) {
        this.h = vt9Var;
        this.i = im5.a;
    }

    @Override // defpackage.j4j
    public final Surface getInputSurface() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.j4j
    public final void h(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.j4j
    public final boolean i(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.j4j
    public final void j(int i, long j, b87 b87Var, List list) {
        lvb.b0(list.isEmpty());
        int i2 = b87Var.u;
        int i3 = b87Var.v;
        b87 b87Var2 = this.f;
        int i4 = b87Var2.u;
        bxi bxiVar = this.c;
        if (i2 != i4 || i3 != b87Var2.v) {
            i0g i0gVar = bxiVar.d;
            long j2 = bxiVar.h;
            i0gVar.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new k4j(i2, i3));
        }
        float f = b87Var.y;
        if (f != this.f.y) {
            this.a.f(f);
        }
        this.f = b87Var;
        if (j != this.g) {
            if (bxiVar.f.c == 0) {
                bxiVar.b.e(i);
                bxiVar.l = j;
            } else {
                i0g i0gVar2 = bxiVar.e;
                long j3 = bxiVar.h;
                i0gVar2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.j4j
    public final void k() {
        uwi uwiVar = this.a;
        if (uwiVar.e == 0) {
            uwiVar.e = 1;
        }
    }

    @Override // defpackage.j4j
    public final boolean l(long j, i4j i4jVar) {
        this.d.add(i4jVar);
        bxi bxiVar = this.c;
        bxiVar.f.b(j);
        bxiVar.h = j;
        bxiVar.j = -9223372036854775807L;
        this.i.execute(new jj2(24, this));
        return true;
    }

    @Override // defpackage.j4j
    public final void m() {
        this.b.c();
        uwi uwiVar = this.a;
        uwiVar.d = false;
        uwiVar.i = -9223372036854775807L;
        axi axiVar = uwiVar.b;
        axiVar.d = false;
        wwi wwiVar = axiVar.c;
        if (wwiVar != null) {
            wwiVar.c();
        }
        axiVar.a();
    }

    @Override // defpackage.j4j
    public final void n() {
        this.b.c();
        this.a.d();
    }

    @Override // defpackage.j4j
    public final void o(int i) {
        axi axiVar = this.a.b;
        if (axiVar.j == i) {
            return;
        }
        axiVar.j = i;
        axiVar.d(true);
    }

    @Override // defpackage.j4j
    public final void p() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.j4j
    public final boolean q(b87 b87Var) {
        return true;
    }

    @Override // defpackage.j4j
    public final void r(boolean z) {
        if (z) {
            uwi uwiVar = this.a;
            uwiVar.b.b();
            uwiVar.h = -9223372036854775807L;
            uwiVar.f = -9223372036854775807L;
            uwiVar.e = Math.min(uwiVar.e, 1);
            uwiVar.i = -9223372036854775807L;
        }
        this.b.c();
        bxi bxiVar = this.c;
        i0g i0gVar = bxiVar.d;
        c70 c70Var = bxiVar.f;
        c70Var.a = 0;
        c70Var.b = -1;
        c70Var.c = 0;
        bxiVar.h = -9223372036854775807L;
        bxiVar.i = -9223372036854775807L;
        bxiVar.j = -9223372036854775807L;
        i0g i0gVar2 = bxiVar.e;
        if (i0gVar2.f() > 0) {
            lvb.R(i0gVar2.f() > 0);
            while (i0gVar2.f() > 1) {
                i0gVar2.c();
            }
            Object objC = i0gVar2.c();
            objC.getClass();
            bxiVar.l = ((Long) objC).longValue();
        }
        if (i0gVar.f() > 0) {
            lvb.R(i0gVar.f() > 0);
            while (i0gVar.f() > 1) {
                i0gVar.c();
            }
            Object objC2 = i0gVar.c();
            objC2.getClass();
            i0gVar.a(0L, (k4j) objC2);
        }
        this.d.clear();
    }

    @Override // defpackage.j4j
    public final void release() {
    }

    @Override // defpackage.j4j
    public final void s(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.f);
        }
    }

    @Override // defpackage.j4j
    public final void setPlaybackSpeed(float f) {
        this.a.h(f);
    }

    @Override // defpackage.j4j
    public final void t(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.j4j
    public final void u(mwi mwiVar) {
        this.j = mwiVar;
    }
}
