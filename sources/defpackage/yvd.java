package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class yvd extends ur0 {
    public final s25 h;
    public final qyb i;
    public final ev5 j;
    public final l6m k;
    public final int l;
    public final b87 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public v1i s;
    public ry9 t;
    public fs5 u;

    public yvd(ry9 ry9Var, s25 s25Var, qyb qybVar, ev5 ev5Var, l6m l6mVar, int i, b87 b87Var) {
        this.t = ry9Var;
        this.h = s25Var;
        this.i = qybVar;
        this.j = ev5Var;
        this.k = l6mVar;
        this.l = i;
        this.m = b87Var;
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        jy9 jy9Var = k().b;
        jy9Var.getClass();
        jy9 jy9Var2 = ry9Var.b;
        return jy9Var2 != null && jy9Var2.a.equals(jy9Var.a) && jy9Var2.h == jy9Var.h && Objects.equals(jy9Var2.f, jy9Var.f);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        u25 u25VarA = this.h.a();
        v1i v1iVar = this.s;
        if (v1iVar != null) {
            u25VarA.w(v1iVar);
        }
        jy9 jy9Var = k().b;
        jy9Var.getClass();
        Uri uri = jy9Var.a;
        this.g.getClass();
        return new vvd(uri, u25VarA, new xtj((nj6) this.i.b), this.j, new av5(this.d.c, 0, x4aVar), this.k, d(x4aVar), this, qfVar, jy9Var.f, this.l, this.m, vqi.X(jy9Var.h), null);
    }

    @Override // defpackage.ur0
    public final synchronized ry9 k() {
        return this.t;
    }

    @Override // defpackage.ur0
    public final void m() {
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.s = v1iVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        z3d z3dVar = this.g;
        z3dVar.getClass();
        ev5 ev5Var = this.j;
        ev5Var.b(looperMyLooper, z3dVar);
        ev5Var.prepare();
        w();
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        vvd vvdVar = (vvd) u0aVar;
        if (vvdVar.y) {
            for (wye wyeVar : vvdVar.v) {
                wyeVar.k();
                xu5 xu5Var = wyeVar.h;
                if (xu5Var != null) {
                    xu5Var.f(wyeVar.e);
                    wyeVar.h = null;
                    wyeVar.g = null;
                }
            }
        }
        vvdVar.m.L(vvdVar);
        vvdVar.r.removeCallbacksAndMessages(null);
        vvdVar.s = null;
        vvdVar.p1 = true;
    }

    @Override // defpackage.ur0
    public final void s() {
        this.j.release();
    }

    @Override // defpackage.ur0
    public final synchronized void v(ry9 ry9Var) {
        this.t = ry9Var;
    }

    public final void w() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        ry9 ry9VarK = k();
        ush v8gVar = new v8g(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, ry9VarK, z2 ? ry9VarK.c : null);
        if (this.n) {
            v8gVar = new wvd(v8gVar);
        }
        p(v8gVar);
    }

    public final void x(long j, xbf xbfVar, boolean z) {
        if (this.r && xbfVar.c()) {
            return;
        }
        this.r = !xbfVar.c();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zF = xbfVar.f();
        if (!this.n && this.o == j && this.p == zF && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zF;
        this.q = z;
        this.n = false;
        w();
        fs5 fs5Var = this.u;
        if (fs5Var != null) {
            fs5Var.i = xbfVar;
        }
    }
}
