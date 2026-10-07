package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tx7 extends ur0 {
    public final ab5 h;
    public final uik i;
    public final ou7 j;
    public final ev5 k;
    public final l6m l;
    public final boolean m;
    public final int n;
    public final db5 o;
    public final long p;
    public iy9 q;
    public v1i r;
    public ry9 s;

    static {
        sz9.a("media3.exoplayer.hls");
    }

    public tx7(ry9 ry9Var, uik uikVar, ab5 ab5Var, ou7 ou7Var, ev5 ev5Var, l6m l6mVar, db5 db5Var, long j, boolean z, int i) {
        this.s = ry9Var;
        this.q = ry9Var.c;
        this.i = uikVar;
        this.h = ab5Var;
        this.j = ou7Var;
        this.k = ev5Var;
        this.l = l6mVar;
        this.o = db5Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static nx7 w(long j, List list) {
        nx7 nx7Var = null;
        for (int i = 0; i < list.size(); i++) {
            nx7 nx7Var2 = (nx7) list.get(i);
            long j2 = nx7Var2.e;
            if (j2 > j || !nx7Var2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                nx7Var = nx7Var2;
            }
        }
        return nx7Var;
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        ry9 ry9VarK = k();
        jy9 jy9Var = ry9VarK.b;
        jy9Var.getClass();
        jy9 jy9Var2 = ry9Var.b;
        return jy9Var2 != null && jy9Var2.a.equals(jy9Var.a) && jy9Var2.e.equals(jy9Var.e) && Objects.equals(jy9Var2.c, jy9Var.c) && ry9VarK.c.equals(ry9Var.c);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        ed7 ed7VarD = d(x4aVar);
        av5 av5Var = new av5(this.d.c, 0, x4aVar);
        v1i v1iVar = this.r;
        z3d z3dVar = this.g;
        z3dVar.getClass();
        return new jx7(this.h, this.o, this.i, v1iVar, this.k, av5Var, this.l, ed7VarD, qfVar, this.j, this.m, this.n, z3dVar);
    }

    @Override // defpackage.ur0
    public final synchronized ry9 k() {
        return this.s;
    }

    @Override // defpackage.ur0
    public final void m() throws IOException {
        db5 db5Var = this.o;
        dc9 dc9Var = db5Var.g;
        if (dc9Var != null) {
            dc9Var.b();
        }
        Uri uri = db5Var.k;
        if (uri != null) {
            cb5 cb5Var = (cb5) db5Var.d.get(uri);
            cb5Var.b.b();
            IOException iOException = cb5Var.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.r = v1iVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        z3d z3dVar = this.g;
        z3dVar.getClass();
        ev5 ev5Var = this.k;
        ev5Var.b(looperMyLooper, z3dVar);
        ev5Var.prepare();
        ed7 ed7VarD = d(null);
        jy9 jy9Var = k().b;
        jy9Var.getClass();
        Uri uri = jy9Var.a;
        db5 db5Var = this.o;
        db5Var.getClass();
        db5Var.h = vqi.p(null);
        db5Var.f = ed7VarD;
        db5Var.i = this;
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        rmc rmcVar = new rmc(((s25) db5Var.a.b).a(), new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 4, db5Var.b.o());
        lvb.b0(db5Var.g == null);
        dc9 dc9Var = new dc9("DefaultHlsPlaylistTracker:MultivariantPlaylist", 1);
        db5Var.g = dc9Var;
        dc9Var.N(rmcVar, db5Var, db5Var.c.o(rmcVar.c));
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        jx7 jx7Var = (jx7) u0aVar;
        jx7Var.b.e.remove(jx7Var);
        for (fy7 fy7Var : jx7Var.t) {
            if (fy7Var.D) {
                for (ey7 ey7Var : fy7Var.v) {
                    ey7Var.k();
                    xu5 xu5Var = ey7Var.h;
                    if (xu5Var != null) {
                        xu5Var.f(ey7Var.e);
                        ey7Var.h = null;
                        ey7Var.g = null;
                    }
                }
            }
            ex7 ex7Var = fy7Var.d;
            cb5 cb5Var = (cb5) ex7Var.g.d.get(ex7Var.e[ex7Var.r.r()]);
            if (cb5Var != null) {
                cb5Var.k = false;
            }
            ex7Var.n = null;
            fy7Var.j.L(fy7Var);
            fy7Var.r.removeCallbacksAndMessages(null);
            fy7Var.H = true;
            fy7Var.s.clear();
        }
        jx7Var.q = null;
    }

    @Override // defpackage.ur0
    public final void s() {
        db5 db5Var = this.o;
        db5Var.k = null;
        db5Var.l = null;
        db5Var.j = null;
        db5Var.n = -9223372036854775807L;
        db5Var.g.L(null);
        db5Var.g = null;
        HashMap map = db5Var.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((cb5) it.next()).b.L(null);
        }
        db5Var.h.removeCallbacksAndMessages(null);
        db5Var.h = null;
        map.clear();
        this.k.release();
    }

    @Override // defpackage.ur0
    public final synchronized void v(ry9 ry9Var) {
        this.s = ry9Var;
    }

    public final void x(sx7 sx7Var) {
        long j;
        v8g v8gVar;
        long j2;
        long jX;
        long j3;
        boolean z = sx7Var.p;
        boolean z2 = sx7Var.g;
        c98 c98Var = sx7Var.r;
        long j4 = sx7Var.u;
        long jX2 = sx7Var.e;
        int i = sx7Var.d;
        long j5 = sx7Var.h;
        long jP0 = z ? vqi.p0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jP0 : -9223372036854775807L;
        db5 db5Var = this.o;
        db5Var.j.getClass();
        er3 er3Var = new er3();
        long j7 = 0;
        if (db5Var.m) {
            rx7 rx7Var = sx7Var.v;
            long j8 = j5 - db5Var.n;
            boolean z3 = sx7Var.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jX3 = sx7Var.p ? vqi.X(vqi.G(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jX = vqi.X(j10);
            } else {
                if (jX2 != -9223372036854775807L) {
                    j2 = j4 - jX2;
                } else {
                    j2 = rx7Var.d;
                    if (j2 == -9223372036854775807L || sx7Var.n == -9223372036854775807L) {
                        j2 = rx7Var.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * sx7Var.m;
                        }
                    }
                }
                jX = j2 + jX3;
            }
            long j11 = j4 + jX3;
            long jK = vqi.k(jX, jX3, j11);
            iy9 iy9Var = k().c;
            boolean z4 = iy9Var.d == -3.4028235E38f && iy9Var.e == -3.4028235E38f && rx7Var.c == -9223372036854775807L && rx7Var.d == -9223372036854775807L;
            hy9 hy9VarA = this.q.a();
            hy9VarA.a = vqi.p0(jK);
            hy9VarA.d = z4 ? 1.0f : this.q.d;
            hy9VarA.e = z4 ? 1.0f : this.q.e;
            iy9 iy9Var2 = new iy9(hy9VarA);
            this.q = iy9Var2;
            if (jX2 == -9223372036854775807L) {
                jX2 = j11 - vqi.X(iy9Var2.a);
            }
            if (z2) {
                j7 = jX2;
            } else {
                nx7 nx7VarW = w(jX2, sx7Var.s);
                if (nx7VarW != null) {
                    j3 = nx7VarW.e;
                } else if (!c98Var.isEmpty()) {
                    px7 px7Var = (px7) c98Var.get(vqi.d(c98Var, Long.valueOf(jX2), true, true));
                    nx7 nx7VarW2 = w(jX2, px7Var.m);
                    j3 = nx7VarW2 != null ? nx7VarW2.e : px7Var.e;
                }
                j7 = j3;
            }
            v8gVar = new v8g(j6, jP0, j9, sx7Var.u, j8, j7, true, !z3, i == 2 && sx7Var.f, er3Var, k(), this.q);
        } else {
            if (jX2 == -9223372036854775807L || c98Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jX2 != j4) {
                    jX2 = ((px7) c98Var.get(vqi.d(c98Var, Long.valueOf(jX2), true, true))).e;
                }
                j = jX2;
            }
            long j12 = sx7Var.u;
            v8gVar = new v8g(j6, jP0, j12, j12, 0L, j, true, false, true, er3Var, k(), null);
        }
        p(v8gVar);
    }
}
