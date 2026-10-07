package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r75 implements j3d, c5a, bv5 {
    public final qt3 a;
    public final rsh b;
    public final tsh c;
    public final s80 d;
    public final SparseArray e;
    public u89 f;
    public l3d g;
    public sfh h;
    public boolean i;

    public r75(qt3 qt3Var) {
        qt3Var.getClass();
        this.a = qt3Var;
        this.f = new u89(vqi.B());
        rsh rshVar = new rsh();
        this.b = rshVar;
        this.c = new tsh();
        this.d = new s80(rshVar);
        this.e = new SparseArray();
    }

    public final void A(bg6 bg6Var, Looper looper) {
        lvb.b0(this.g == null || ((c98) this.d.b).isEmpty());
        bg6Var.getClass();
        this.g = bg6Var;
        this.h = ((nfh) this.a).a(looper, null);
        u89 u89Var = this.f;
        t41 t41Var = new t41(this, bg6Var);
        u89Var.getClass();
        qt3 qt3Var = this.a;
        lvb.b0(qt3Var != null);
        this.f = new u89(u89Var.d, looper, looper.getThread(), qt3Var, t41Var, u89Var.i);
    }

    @Override // defpackage.j3d
    public final void E(boolean z) {
        wf wfVarT = t();
        y(wfVarT, 9, new z65(wfVarT, z, 3));
    }

    @Override // defpackage.j3d
    public final void G0(int i, boolean z) {
        wf wfVarT = t();
        y(wfVarT, -1, new hs4(wfVarT, z, i));
    }

    @Override // defpackage.j3d
    public final void I(int i, boolean z) {
        wf wfVarT = t();
        y(wfVarT, 30, new hs4(wfVarT, i, z));
    }

    @Override // defpackage.j3d
    public final void J(long j) {
        wf wfVarT = t();
        y(wfVarT, 16, new hs4(28, j, wfVarT));
    }

    @Override // defpackage.j3d
    public final void K(b0a b0aVar) {
        wf wfVarT = t();
        y(wfVarT, 15, new hs4(wfVarT, b0aVar, 27));
    }

    @Override // defpackage.j3d
    public final void K0(s2d s2dVar) {
        wf wfVarT = t();
        y(wfVarT, 12, new hu(wfVarT, 11, s2dVar));
    }

    @Override // defpackage.j3d
    public final void L0(h3d h3dVar) {
        wf wfVarT = t();
        y(wfVarT, 13, new o75(wfVarT, h3dVar, 2));
    }

    @Override // defpackage.j3d
    public final void M(List list) {
        wf wfVarT = t();
        y(wfVarT, 27, new hs4(wfVarT, list, 17));
    }

    @Override // defpackage.j3d
    public final void M0(PlaybackException playbackException) {
        x4a x4aVar;
        wf wfVarT = (!(playbackException instanceof ExoPlaybackException) || (x4aVar = ((ExoPlaybackException) playbackException).o) == null) ? t() : u(x4aVar);
        y(wfVarT, 10, new hs4(wfVarT, playbackException, 16));
    }

    @Override // defpackage.j3d
    public final void N0(long j) {
        wf wfVarT = t();
        y(wfVarT, 18, new hs4(29, j, wfVarT));
    }

    @Override // defpackage.j3d
    public final void Q(ok5 ok5Var) {
        wf wfVarT = t();
        y(wfVarT, 29, new hs4(wfVarT, ok5Var, 22));
    }

    @Override // defpackage.j3d
    public final void S(ry9 ry9Var, int i) {
        wf wfVarT = t();
        y(wfVarT, 1, new b75(wfVarT, ry9Var, i));
    }

    @Override // defpackage.j3d
    public final void T(PlaybackException playbackException) {
        x4a x4aVar;
        wf wfVarT = (!(playbackException instanceof ExoPlaybackException) || (x4aVar = ((ExoPlaybackException) playbackException).o) == null) ? t() : u(x4aVar);
        y(wfVarT, 10, new hu(wfVarT, 14, playbackException));
    }

    @Override // defpackage.j3d
    public final void U(int i, int i2) {
        wf wfVarX = x();
        y(wfVarX, 24, new f75(wfVarX, i, i2));
    }

    @Override // defpackage.j3d
    public final void Y(int i) {
    }

    @Override // defpackage.j3d
    public final void Y0(boolean z) {
        wf wfVarT = t();
        y(wfVarT, 7, new z65(wfVarT, z, 0));
    }

    @Override // defpackage.j3d
    public final void Z(k3d k3dVar, k3d k3dVar2, int i) {
        if (i == 1) {
            this.i = false;
        }
        l3d l3dVar = this.g;
        l3dVar.getClass();
        s80 s80Var = this.d;
        s80Var.d = s80.f(l3dVar, (c98) s80Var.b, (x4a) s80Var.e, (rsh) s80Var.a);
        wf wfVarT = t();
        y(wfVarT, 11, new e75(wfVarT, i, k3dVar, k3dVar2, 0));
    }

    @Override // defpackage.bv5
    public final void a(int i, x4a x4aVar, Exception exc) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1024, new hu(wfVarW, 18, exc));
    }

    @Override // defpackage.c5a
    public final void b(int i, x4a x4aVar, uz9 uz9Var) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1005, new q75(wfVarW, uz9Var, 0));
    }

    @Override // defpackage.j3d
    public final void b0(p70 p70Var) {
        wf wfVarX = x();
        y(wfVarX, 20, new hu(wfVarX, 17, p70Var));
    }

    @Override // defpackage.j3d
    public final void c(k4j k4jVar) {
        wf wfVarX = x();
        y(wfVarX, 25, new hu(wfVarX, 15, k4jVar));
    }

    @Override // defpackage.bv5
    public final void d(int i, x4a x4aVar, int i2) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1022, new b75(wfVarW, i2, 5));
    }

    @Override // defpackage.c5a
    public final void e(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1003, new zj1(wfVarW, t99Var, uz9Var, iOException, z, 1));
    }

    @Override // defpackage.j3d
    public final void e0(ryh ryhVar) {
        wf wfVarT = t();
        y(wfVarT, 19, new hs4(wfVarT, ryhVar, 26));
    }

    @Override // defpackage.j3d
    public final void f(final int i) {
        final wf wfVarX = x();
        y(wfVarX, 21, new r89() { // from class: k75
            @Override // defpackage.r89
            public final void invoke(Object obj) {
                ((xf) obj).F0(wfVarX, i);
            }
        });
    }

    @Override // defpackage.j3d
    public final void g() {
    }

    @Override // defpackage.j3d
    public final void g0(boolean z) {
        wf wfVarT = t();
        y(wfVarT, 3, new z65(wfVarT, z, 2));
    }

    @Override // defpackage.j3d
    public final void h(boolean z) {
        wf wfVarX = x();
        y(wfVarX, 23, new z65(wfVarX, z, 1));
    }

    @Override // defpackage.bv5
    public final void i(int i, x4a x4aVar) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1025, new h75(wfVarW, 4));
    }

    @Override // defpackage.j3d
    public final void i0(final int i, final boolean z) {
        final wf wfVarT = t();
        y(wfVarT, 5, new r89() { // from class: c75
            @Override // defpackage.r89
            public final void invoke(Object obj) {
                ((xf) obj).V0(wfVarT, i, z);
            }
        });
    }

    @Override // defpackage.j3d
    public final void j(lwa lwaVar) {
        wf wfVarT = t();
        y(wfVarT, 28, new hu(wfVarT, 12, lwaVar));
    }

    @Override // defpackage.j3d
    public final void j0(float f) {
        wf wfVarX = x();
        y(wfVarX, 22, new l75(wfVarX, f));
    }

    @Override // defpackage.j3d
    public final void k(zy4 zy4Var) {
        wf wfVarT = t();
        y(wfVarT, 27, new hs4(wfVarT, zy4Var, 19));
    }

    @Override // defpackage.j3d
    public final void l(int i) {
        wf wfVarT = t();
        y(wfVarT, 6, new b75(wfVarT, i, 0));
    }

    @Override // defpackage.j3d
    public final void m(boolean z) {
    }

    @Override // defpackage.c5a
    public final void n(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, int i2) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1000, new n75(wfVarW, t99Var, uz9Var, i2));
    }

    @Override // defpackage.c5a
    public final void o(int i, x4a x4aVar, uz9 uz9Var) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1004, new q75(wfVarW, uz9Var, 1));
    }

    @Override // defpackage.j3d
    public final void onRepeatModeChanged(int i) {
        wf wfVarT = t();
        y(wfVarT, 8, new b75(wfVarT, i, 4));
    }

    @Override // defpackage.c5a
    public final void p(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1002, new o75(wfVarW, t99Var, uz9Var));
    }

    @Override // defpackage.c5a
    public final void q(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1001, new n75(wfVarW, t99Var, uz9Var));
    }

    @Override // defpackage.bv5
    public final void r(int i, x4a x4aVar) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1027, new h75(wfVarW, 2));
    }

    @Override // defpackage.bv5
    public final void s(int i, x4a x4aVar, iw8 iw8Var) {
        wf wfVarW = w(i, x4aVar);
        y(wfVarW, 1023, new h75(wfVarW, iw8Var, 3));
    }

    public final wf t() {
        return u((x4a) this.d.d);
    }

    @Override // defpackage.j3d
    public final void t0(fzh fzhVar) {
        wf wfVarT = t();
        y(wfVarT, 2, new hu(wfVarT, 13, fzhVar));
    }

    public final wf u(x4a x4aVar) {
        this.g.getClass();
        ush ushVar = x4aVar == null ? null : (ush) ((lhe) this.d.c).get(x4aVar);
        if (x4aVar != null && ushVar != null) {
            return v(ushVar, ushVar.g(x4aVar.a, this.b).c, x4aVar);
        }
        int iF = this.g.F();
        ush ushVarV = this.g.v();
        if (iF >= ushVarV.o()) {
            ushVarV = ush.a;
        }
        return v(ushVarV, iF, null);
    }

    @Override // defpackage.j3d
    public final void u0(l3d l3dVar, i3d i3dVar) {
    }

    public final wf v(ush ushVar, int i, x4a x4aVar) {
        x4a x4aVar2 = ushVar.p() ? null : x4aVar;
        ((nfh) this.a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = ushVar.equals(this.g.v()) && i == this.g.F();
        long jP0 = 0;
        if (x4aVar2 == null || !x4aVar2.b()) {
            if (z) {
                jP0 = this.g.E();
            } else if (!ushVar.p()) {
                jP0 = vqi.p0(ushVar.m(i, this.c, 0L).k);
            }
        } else if (z && this.g.s() == x4aVar2.b && this.g.C() == x4aVar2.c) {
            jP0 = this.g.e();
        }
        return new wf(jElapsedRealtime, ushVar, i, x4aVar2, jP0, this.g.v(), this.g.F(), (x4a) this.d.d, this.g.e(), this.g.g());
    }

    public final wf w(int i, x4a x4aVar) {
        this.g.getClass();
        if (x4aVar != null) {
            return ((ush) ((lhe) this.d.c).get(x4aVar)) != null ? u(x4aVar) : v(ush.a, i, x4aVar);
        }
        ush ushVarV = this.g.v();
        if (i >= ushVarV.o()) {
            ushVarV = ush.a;
        }
        return v(ushVarV, i, null);
    }

    @Override // defpackage.j3d
    public final void w0(b0a b0aVar) {
        wf wfVarT = t();
        y(wfVarT, 14, new hs4(wfVarT, b0aVar, 23));
    }

    public final wf x() {
        return u((x4a) this.d.f);
    }

    @Override // defpackage.j3d
    public final void x0(long j) {
        wf wfVarT = t();
        y(wfVarT, 17, new o75(wfVarT, j));
    }

    public final void y(wf wfVar, int i, r89 r89Var) {
        this.e.put(i, wfVar);
        this.f.f(i, r89Var);
    }

    @Override // defpackage.j3d
    public final void y0(ush ushVar, int i) {
        l3d l3dVar = this.g;
        l3dVar.getClass();
        s80 s80Var = this.d;
        s80Var.d = s80.f(l3dVar, (c98) s80Var.b, (x4a) s80Var.e, (rsh) s80Var.a);
        s80Var.y(l3dVar.v());
        wf wfVarT = t();
        y(wfVarT, 0, new b75(wfVarT, i, 6));
    }

    @Override // defpackage.j3d
    public final void z(int i) {
        wf wfVarT = t();
        y(wfVarT, 4, new b75(wfVarT, i, 2));
    }
}
