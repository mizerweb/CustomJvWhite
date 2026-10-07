package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j4d implements l3d {
    public final bg6 b;
    public final IdentityHashMap c = new IdentityHashMap();

    public j4d(bg6 bg6Var) {
        this.b = bg6Var;
    }

    @Override // defpackage.l3d
    public final void A(boolean z) {
        q0();
        this.b.A(z);
    }

    @Override // defpackage.l3d
    public final int B() {
        q0();
        return this.b.B();
    }

    @Override // defpackage.l3d
    public final int C() {
        q0();
        return this.b.C();
    }

    @Override // defpackage.l3d
    public final void D(int i) {
        q0();
        this.b.D(i);
    }

    @Override // defpackage.l3d
    public final long E() {
        q0();
        return this.b.E();
    }

    @Override // defpackage.l3d
    public final int F() {
        q0();
        return this.b.F();
    }

    @Override // defpackage.l3d
    public final void G(ry9 ry9Var) {
        q0();
        this.b.G(ry9Var);
    }

    @Override // defpackage.l3d
    public final boolean H() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.J;
    }

    @Override // defpackage.l3d
    public final void I() {
        q0();
        this.b.I();
    }

    @Override // defpackage.l3d
    public final void J() {
        q0();
        this.b.J();
    }

    @Override // defpackage.l3d
    public final void K(List list) {
        q0();
        this.b.K(list);
    }

    public final void L(List list) {
        q0();
        this.b.L(Integer.MAX_VALUE, list);
    }

    public final k3d M() {
        boolean zC = c(16);
        boolean zC2 = c(17);
        int iF = zC2 ? F() : 0;
        lvb.b0(iF >= 0);
        int iB = zC2 ? B() : 0;
        lvb.b0(iB >= 0);
        if (zC2) {
            ush ushVarV = v();
            if (!ushVarV.p()) {
                lvb.b0(iF < ushVarV.o());
                tsh tshVarM = ushVarV.m(iF, new tsh(), 0L);
                lvb.b0(iB == vqi.j(iB, tshVarM.m, tshVarM.n));
            }
        }
        long jE = 0;
        ry9 ry9VarU = zC ? U() : null;
        long jE2 = zC ? e() : 0L;
        if (zC) {
            jE = E();
        }
        return new k3d(null, iF, ry9VarU, null, iB, jE2, jE, zC ? s() : -1, zC ? C() : -1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    public final umf N() {
        boolean z;
        int i;
        long jS;
        int iJ;
        long jV;
        boolean zC = c(16);
        k3d k3dVarM = M();
        boolean z2 = zC && f();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long duration = zC ? getDuration() : -9223372036854775807L;
        long jS2 = zC ? S() : 0L;
        bg6 bg6Var = this.b;
        if (zC) {
            q0();
            if (bg6Var.c(16)) {
                jS = 0;
                long jR = bg6Var.R();
                z = z2;
                long duration2 = bg6Var.getDuration();
                if (jR == -9223372036854775807L || duration2 == -9223372036854775807L) {
                    i = 0;
                } else {
                    iJ = duration2 != 0 ? vqi.j(vqi.c0(jR, duration2), 0, 100) : 100;
                }
            } else {
                z = z2;
                i = 0;
                jS = 0;
            }
            iJ = i;
        } else {
            z = z2;
            i = 0;
            jS = 0;
            iJ = i;
        }
        long jG = zC ? g() : jS;
        if (zC) {
            q0();
            jV = bg6Var.V();
        } else {
            jV = -9223372036854775807L;
        }
        long jT = zC ? T() : -9223372036854775807L;
        if (zC) {
            q0();
            jS = bg6Var.S();
        }
        return new umf(k3dVarM, z, jElapsedRealtime, duration, jS2, iJ, jG, jV, jT, jS);
    }

    public final void O() {
        q0();
        this.b.I0();
    }

    public final void P(int i) {
        q0();
        this.b.I0();
    }

    public final p70 Q() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.c0;
    }

    public final h3d R() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.T;
    }

    public final long S() {
        q0();
        return this.b.R();
    }

    public final long T() {
        q0();
        return this.b.T();
    }

    public final ry9 U() {
        q0();
        bg6 bg6Var = this.b;
        ush ushVarV = bg6Var.v();
        if (ushVarV.p()) {
            return null;
        }
        return ushVarV.m(bg6Var.F(), bg6Var.b, 0L).b;
    }

    public final ry9 V() {
        if (c(16)) {
            return U();
        }
        return null;
    }

    public final ush W() {
        if (c(17)) {
            return v();
        }
        return V() != null ? new i4d(this) : ush.a;
    }

    public final ok5 X() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.n0;
    }

    public final int Y() {
        q0();
        this.b.I0();
        return 0;
    }

    public final b0a Z() {
        if (!c(18)) {
            return b0a.K;
        }
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.U;
    }

    @Override // defpackage.l3d
    public final float a() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.d0;
    }

    public final s2d a0() {
        q0();
        return this.b.Z();
    }

    @Override // defpackage.l3d
    public final void b(float f) {
        q0();
        this.b.b(f);
    }

    public final b0a b0() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.V;
    }

    @Override // defpackage.l3d
    public final boolean c(int i) {
        q0();
        return this.b.c(i);
    }

    public final void c0() {
        q0();
        this.b.I0();
    }

    public final void d(int i, List list) {
        q0();
        this.b.L(i, list);
    }

    public final void d0(int i) {
        q0();
        this.b.I0();
    }

    @Override // defpackage.l3d
    public final long e() {
        q0();
        return this.b.e();
    }

    public final boolean e0() {
        q0();
        return this.b.f0();
    }

    @Override // defpackage.l3d
    public final boolean f() {
        q0();
        return this.b.f();
    }

    public final boolean f0() {
        if (!c(23)) {
            return false;
        }
        q0();
        this.b.I0();
        return false;
    }

    @Override // defpackage.l3d
    public final long g() {
        q0();
        return this.b.g();
    }

    public final boolean g0() {
        q0();
        return this.b.h0();
    }

    @Override // defpackage.l3d
    public final long getDuration() {
        q0();
        return this.b.getDuration();
    }

    @Override // defpackage.l3d
    public final int getPlaybackState() {
        q0();
        return this.b.getPlaybackState();
    }

    @Override // defpackage.l3d
    public final int getRepeatMode() {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        return bg6Var.I;
    }

    @Override // defpackage.l3d
    public final void h(ry9 ry9Var, long j) {
        q0();
        this.b.h(ry9Var, j);
    }

    public final boolean h0() {
        q0();
        return this.b.i0();
    }

    @Override // defpackage.l3d
    public final void i() {
        q0();
        this.b.w0();
    }

    public final void i0() {
        q0();
        this.b.n(false);
    }

    @Override // defpackage.l3d
    public final void j() {
        q0();
        this.b.j();
    }

    public final void j0(int i) {
        q0();
        this.b.q0(i, i + 1);
    }

    @Override // defpackage.l3d
    public final void k(ryh ryhVar) {
        q0();
        this.b.k(ryhVar);
    }

    public final void k0(int i, int i2, List list) {
        q0();
        this.b.t0(i, i2, list);
    }

    @Override // defpackage.l3d
    public final void l() {
        q0();
        this.b.l();
    }

    public final void l0(int i, boolean z) {
        q0();
        this.b.I0();
    }

    @Override // defpackage.l3d
    public final PlaybackException m() {
        q0();
        return this.b.m();
    }

    public final void m0(boolean z) {
        q0();
        this.b.I0();
    }

    @Override // defpackage.l3d
    public final void n(boolean z) {
        q0();
        this.b.n(z);
    }

    public final void n0(int i) {
        q0();
        this.b.I0();
    }

    @Override // defpackage.l3d
    public final void o() {
        q0();
        this.b.o();
    }

    public final void o0(int i, int i2) {
        q0();
        this.b.I0();
    }

    @Override // defpackage.l3d
    public final void p() {
        q0();
        this.b.p();
    }

    public final void p0(SurfaceHolder surfaceHolder) {
        q0();
        bg6 bg6Var = this.b;
        bg6Var.I0();
        if (surfaceHolder == null) {
            bg6Var.P();
            return;
        }
        bg6Var.s0();
        bg6Var.Z = true;
        bg6Var.Y = surfaceHolder;
        surfaceHolder.addCallback(bg6Var.x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            bg6Var.B0(null);
            bg6Var.m0(0, 0);
        } else {
            bg6Var.B0(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            bg6Var.m0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.l3d
    public final void play() {
        q0();
        this.b.n(true);
    }

    @Override // defpackage.l3d
    public final void prepare() {
        q0();
        this.b.prepare();
    }

    @Override // defpackage.l3d
    public final fzh q() {
        q0();
        return this.b.q();
    }

    public final void q0() {
        lvb.b0(Looper.myLooper() == this.b.u);
    }

    @Override // defpackage.l3d
    public final void r(b0a b0aVar) {
        q0();
        this.b.r(b0aVar);
    }

    @Override // defpackage.l3d
    public final int s() {
        q0();
        return this.b.s();
    }

    @Override // defpackage.l3d
    public final void seekTo(long j) {
        q0();
        this.b.v0(j);
    }

    @Override // defpackage.l3d
    public final void setPlaybackSpeed(float f) {
        q0();
        this.b.setPlaybackSpeed(f);
    }

    @Override // defpackage.l3d
    public final void setRepeatMode(int i) {
        q0();
        this.b.setRepeatMode(i);
    }

    @Override // defpackage.l3d
    public final void stop() {
        q0();
        this.b.stop();
    }

    @Override // defpackage.l3d
    public final void t(ry9 ry9Var) {
        q0();
        this.b.t(ry9Var);
    }

    @Override // defpackage.l3d
    public final int u() {
        q0();
        return this.b.u();
    }

    @Override // defpackage.l3d
    public final ush v() {
        q0();
        return this.b.v();
    }

    @Override // defpackage.l3d
    public final void w() {
        q0();
        this.b.w();
    }

    @Override // defpackage.l3d
    public final void x(int i, long j, List list) {
        q0();
        this.b.x(i, j, list);
    }

    @Override // defpackage.l3d
    public final void y() {
        q0();
        this.b.y();
    }

    @Override // defpackage.l3d
    public final boolean z() {
        q0();
        return this.b.z();
    }
}
