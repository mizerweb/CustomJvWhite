package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bg6 implements kf6, l3d {
    public final bbh A;
    public final v6g B;
    public final long C;
    public final ma D;
    public final gbc E;
    public final dc9 F;
    public final v2a G;
    public final v2a H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public u98 O;
    public final s6f P;
    public ybf Q;
    public e4g R;
    public boolean S;
    public h3d T;
    public b0a U;
    public b0a V;
    public Object W;
    public Surface X;
    public SurfaceHolder Y;
    public boolean Z;
    public final int a0;
    public lag b0;
    public final vyh c;
    public p70 c0;
    public final h3d d;
    public float d0;
    public float e0;
    public final Context f;
    public boolean f0;
    public final bg6 g;
    public zy4 g0;
    public final ks0[] h;
    public final boolean h0;
    public final ks0[] i;
    public boolean i0;
    public final uyh j;
    public final int j0;
    public final sfh k;
    public hle k0;
    public final pf6 l;
    public boolean l0;
    public final kg6 m;
    public boolean m0;
    public final u89 n;
    public final ok5 n0;
    public final CopyOnWriteArraySet o;
    public k4j o0;
    public final rsh p;
    public final long p0;
    public final ArrayList q;
    public final long q0;
    public final boolean r;
    public final long r0;
    public final w4a s;
    public b0a s0;
    public final r75 t;
    public r2d t0;
    public final Looper u;
    public int u0;
    public final ko0 v;
    public long v0;
    public final qt3 w;
    public final xf6 x;
    public final yf6 y;
    public final r70 z;
    public final tsh b = new tsh();
    public final r94 e = new r94();

    static {
        sz9.a("media3.exoplayer");
    }

    public bg6(if6 if6Var) {
        try {
            lvb.r0("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "]");
            Context context = if6Var.a;
            this.f = context.getApplicationContext();
            c cVar = if6Var.h;
            qt3 qt3Var = if6Var.b;
            cVar.getClass();
            this.t = new r75(qt3Var);
            this.j0 = if6Var.j;
            this.k0 = null;
            this.c0 = if6Var.k;
            this.a0 = if6Var.l;
            this.f0 = false;
            this.C = if6Var.u;
            xf6 xf6Var = new xf6(this);
            this.x = xf6Var;
            this.y = new yf6();
            Handler handler = new Handler(if6Var.i);
            xje xjeVar = (xje) if6Var.c.get();
            ks0[] ks0VarArrA = xjeVar.a(handler, xf6Var, xf6Var, xf6Var, xf6Var);
            this.h = ks0VarArrA;
            lvb.b0(ks0VarArrA.length > 0);
            this.i = new ks0[ks0VarArrA.length];
            int i = 0;
            while (true) {
                ks0[] ks0VarArr = this.i;
                if (i >= ks0VarArr.length) {
                    break;
                }
                xjeVar.b(this.h[i]);
                ks0VarArr[i] = null;
                i++;
            }
            uyh uyhVar = (uyh) if6Var.e.get();
            this.j = uyhVar;
            this.s = (w4a) if6Var.d.get();
            ko0 ko0Var = (ko0) if6Var.g.get();
            this.v = ko0Var;
            this.r = if6Var.m;
            this.Q = if6Var.n;
            this.p0 = if6Var.p;
            this.q0 = if6Var.q;
            this.r0 = if6Var.r;
            this.P = if6Var.o;
            this.S = false;
            Looper looper = if6Var.i;
            this.u = looper;
            qt3 qt3Var2 = if6Var.b;
            this.w = qt3Var2;
            this.g = this;
            this.n = new u89(looper, qt3Var2, new pf6(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.o = copyOnWriteArraySet;
            this.q = new ArrayList();
            this.R = new e4g();
            ks0[] ks0VarArr2 = this.h;
            vyh vyhVar = new vyh(new mje[ks0VarArr2.length], new rg6[ks0VarArr2.length], fzh.b, null);
            this.c = vyhVar;
            this.p = new rsh();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i2 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                lvb.b0(!false);
                sparseBooleanArray.append(i2, true);
            }
            uyhVar.getClass();
            lvb.b0(!false);
            sparseBooleanArray.append(29, true);
            lvb.b0(!false);
            cx6 cx6Var = new cx6(sparseBooleanArray);
            this.d = new h3d(cx6Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < cx6Var.a.size(); i3++) {
                int iB = cx6Var.b(i3);
                lvb.b0(!false);
                sparseBooleanArray2.append(iB, true);
            }
            lvb.b0(!false);
            sparseBooleanArray2.append(4, true);
            lvb.b0(!false);
            sparseBooleanArray2.append(10, true);
            lvb.b0(!false);
            this.T = new h3d(new cx6(sparseBooleanArray2));
            this.k = ((nfh) qt3Var2).a(looper, null);
            pf6 pf6Var = new pf6(this);
            this.l = pf6Var;
            this.t0 = r2d.k(vyhVar);
            this.t.A(this, looper);
            z3d z3dVar = new z3d(if6Var.C);
            kg6 kg6Var = new kg6(this.f, this.h, this.i, uyhVar, vyhVar, (s99) if6Var.f.get(), ko0Var, this.I, this.J, this.t, this.Q, if6Var.s, if6Var.t, this.S, looper, qt3Var2, pf6Var, z3dVar, if6Var.A, this.y, if6Var.D);
            sfh sfhVar = kg6Var.h;
            this.m = kg6Var;
            Looper looper2 = kg6Var.j;
            this.d0 = 1.0f;
            this.I = 0;
            b0a b0aVar = b0a.K;
            this.U = b0aVar;
            this.V = b0aVar;
            this.s0 = b0aVar;
            this.u0 = -1;
            this.g0 = zy4.d;
            this.h0 = true;
            r75 r75Var = this.t;
            u89 u89Var = this.n;
            r75Var.getClass();
            u89Var.a(r75Var);
            ko0Var.g(new Handler(looper), this.t);
            copyOnWriteArraySet.add(this.x);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                ((nfh) qt3Var2).a(kg6Var.j, null).f(new wf6(this.f, if6Var.z, this, z3dVar));
            }
            ma maVar = new ma(0, looper2, looper, qt3Var2, new pf6(this));
            this.D = maVar;
            maVar.B(new e6(16, this));
            Context context2 = if6Var.a;
            Looper looper3 = if6Var.i;
            xf6 xf6Var2 = this.x;
            r70 r70Var = new r70();
            r70Var.b = context2.getApplicationContext();
            nfh nfhVar = (nfh) qt3Var2;
            r70Var.d = nfhVar.a(looper2, null);
            r70Var.c = new q70(r70Var, nfhVar.a(looper3, null), xf6Var2);
            this.z = r70Var;
            r70Var.e();
            boolean z = (if6Var.v == Integer.MAX_VALUE || if6Var.w == Integer.MAX_VALUE || if6Var.x == Integer.MAX_VALUE || if6Var.y == Integer.MAX_VALUE) ? false : true;
            bbh bbhVar = new bbh(context, looper2, qt3Var2);
            this.A = bbhVar;
            if (bbhVar.a != z) {
                bbhVar.a = z;
                bbhVar.a(z, bbhVar.b);
            }
            v6g v6gVar = new v6g();
            new xvc(context.getApplicationContext());
            nfh nfhVar2 = (nfh) qt3Var2;
            nfhVar2.a(looper2, null);
            nfhVar2.a(Looper.getMainLooper(), null);
            this.B = v6gVar;
            this.n0 = ok5.e;
            this.o0 = k4j.d;
            this.b0 = lag.c;
            this.F = i4 >= 34 ? new dc9(this, context) : null;
            this.G = new v2a(27);
            this.H = new v2a(27);
            this.E = new gbc(this, this.x, this.w, if6Var.v, if6Var.w, if6Var.x, if6Var.y);
            sfhVar.c(38, this.P).b();
            sfhVar.d(this.c0, 31, 0, 0).b();
            x0(1, 3, this.c0);
            x0(2, 4, Integer.valueOf(this.a0));
            x0(2, 5, 0);
            x0(1, 9, Boolean.valueOf(this.f0));
            x0(6, 8, this.y);
            x0(-1, 16, Integer.valueOf(this.j0));
        } finally {
            this.e.f();
        }
    }

    public static long a0(r2d r2dVar) {
        tsh tshVar = new tsh();
        rsh rshVar = new rsh();
        r2dVar.a.g(r2dVar.b.a, rshVar);
        long j = r2dVar.c;
        return j == -9223372036854775807L ? r2dVar.a.m(rshVar.c, tshVar, 0L).k : rshVar.e + j;
    }

    public static r2d j0(r2d r2dVar, int i) {
        r2d r2dVarH = r2dVar.h(i);
        return (i == 1 || i == 4) ? r2dVarH.b(false) : r2dVarH;
    }

    @Override // defpackage.l3d
    public final void A(boolean z) {
        I0();
        if (this.J != z) {
            this.J = z;
            this.m.h.b(12, z ? 1 : 0, 0).b();
            hw2 hw2Var = new hw2(z, 1);
            u89 u89Var = this.n;
            u89Var.c(9, hw2Var);
            E0();
            u89Var.b();
        }
    }

    public final void A0(boolean z) {
        ryh ryhVarB;
        I0();
        if (z == this.N) {
            return;
        }
        this.N = z;
        s6f s6fVar = this.P;
        if (!s6fVar.a.isEmpty()) {
            uyh uyhVar = this.j;
            uyhVar.getClass();
            pe5 pe5VarG = ((ve5) uyhVar).g();
            if (z) {
                this.O = pe5VarG.I;
                u98 u98Var = s6fVar.a;
                qyh qyhVarA = pe5VarG.a();
                pci it = u98Var.iterator();
                while (it.hasNext()) {
                    qyhVarA.h(((Integer) it.next()).intValue(), true);
                }
                ryhVarB = qyhVarA.b();
            } else {
                pe5VarG.getClass();
                oe5 oe5Var = new oe5(pe5VarG);
                oe5Var.i(this.O);
                pe5 pe5Var = new pe5(oe5Var);
                this.O = null;
                ryhVarB = pe5Var;
            }
            if (!ryhVarB.equals(pe5VarG)) {
                uyhVar.c(ryhVarB);
            }
        }
        this.m.h.c(36, Boolean.valueOf(z)).b();
        r2d r2dVar = this.t0;
        F0(r2dVar.m, r2dVar.l);
    }

    @Override // defpackage.l3d
    public final int B() {
        I0();
        if (!this.t0.a.p()) {
            r2d r2dVar = this.t0;
            return r2dVar.a.b(r2dVar.b.a);
        }
        int i = this.u0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final void B0(Surface surface) {
        Object obj = this.W;
        boolean zC = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.C : -9223372036854775807L;
        kg6 kg6Var = this.m;
        if (!kg6Var.K && kg6Var.j.getThread().isAlive()) {
            r94 r94Var = new r94(kg6Var.q);
            kg6Var.h.c(30, new Pair(surface, r94Var)).b();
            if (j != -9223372036854775807L) {
                zC = r94Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.W;
            Surface surface2 = this.X;
            if (obj2 == surface2) {
                surface2.release();
                this.X = null;
            }
        }
        this.W = surface;
        if (zC) {
            return;
        }
        D0(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    @Override // defpackage.l3d
    public final int C() {
        I0();
        if (f()) {
            return this.t0.b.c;
        }
        return -1;
    }

    public final void C0(Surface surface) {
        I0();
        s0();
        B0(surface);
        int i = surface == null ? 0 : -1;
        m0(i, i);
    }

    @Override // defpackage.l3d
    public final void D(int i) {
        u0(i, -9223372036854775807L, false);
    }

    public final void D0(ExoPlaybackException exoPlaybackException) {
        r2d r2dVar = this.t0;
        r2d r2dVarC = r2dVar.c(r2dVar.b);
        r2dVarC.q = r2dVarC.s;
        r2dVarC.r = 0L;
        r2d r2dVarJ0 = j0(r2dVarC, 1);
        if (exoPlaybackException != null) {
            r2dVarJ0 = r2dVarJ0.f(exoPlaybackException);
        }
        this.K++;
        this.m.h.a(6).b();
        G0(r2dVarJ0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.l3d
    public final long E() {
        I0();
        return U(this.t0);
    }

    public final void E0() {
        h3d h3dVar = this.T;
        String str = vqi.a;
        bg6 bg6Var = this.g;
        boolean zF = bg6Var.f();
        boolean zG0 = bg6Var.g0();
        boolean zD0 = bg6Var.d0();
        boolean zC0 = bg6Var.c0();
        boolean zF0 = bg6Var.f0();
        boolean zE0 = bg6Var.e0();
        boolean zP = bg6Var.v().p();
        p3c p3cVar = new p3c(1);
        s74 s74Var = (s74) p3cVar.b;
        s74Var.b(this.d.a);
        boolean z = !zF;
        p3cVar.d(4, z);
        p3cVar.d(5, zG0 && !zF);
        p3cVar.d(6, zD0 && !zF);
        p3cVar.d(7, !zP && (zD0 || !zF0 || zG0) && !zF);
        p3cVar.d(8, zC0 && !zF);
        p3cVar.d(9, !zP && (zC0 || (zF0 && zE0)) && !zF);
        p3cVar.d(10, z);
        p3cVar.d(11, zG0 && !zF);
        p3cVar.d(12, zG0 && !zF);
        h3d h3dVar2 = new h3d(s74Var.d());
        this.T = h3dVar2;
        if (h3dVar2.equals(h3dVar)) {
            return;
        }
        this.n.c(13, new rf6(this, 0));
    }

    @Override // defpackage.l3d
    public final int F() {
        I0();
        int iX = X(this.t0);
        if (iX == -1) {
            return 0;
        }
        return iX;
    }

    public final void F0(int i, boolean z) {
        int i2;
        if (this.N) {
            i2 = 4;
        } else {
            i2 = (this.t0.n != 1 || z) ? 0 : 1;
        }
        r2d r2dVarA = this.t0;
        if (r2dVarA.l == z && r2dVarA.n == i2 && r2dVarA.m == i) {
            return;
        }
        this.K++;
        if (r2dVarA.p) {
            r2dVarA = r2dVarA.a();
        }
        r2d r2dVarE = r2dVarA.e(i, i2, z);
        this.m.h.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        G0(r2dVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.l3d
    public final void G(ry9 ry9Var) {
        K(c98.r(ry9Var));
    }

    public final void G0(final r2d r2dVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        ry9 ry9Var;
        final int i5;
        int i6;
        int i7;
        Object obj;
        ry9 ry9Var2;
        Object obj2;
        long j2;
        long j3;
        long jA0;
        long jA1;
        Object obj3;
        ry9 ry9Var3;
        Object obj4;
        r2d r2dVar2 = this.t0;
        this.t0 = r2dVar;
        boolean zEquals = r2dVar2.a.equals(r2dVar.a);
        tsh tshVar = this.b;
        rsh rshVar = this.p;
        ush ushVar = r2dVar2.a;
        x4a x4aVar = r2dVar2.b;
        ush ushVar2 = r2dVar.a;
        x4a x4aVar2 = r2dVar.b;
        if (ushVar2.p() && ushVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (ushVar2.p() != ushVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!ushVar.m(ushVar.g(x4aVar.a, rshVar).c, tshVar, 0L).a.equals(ushVar2.m(ushVar2.g(x4aVar2.a, rshVar).c, tshVar, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    c.t();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && x4aVar.d < x4aVar2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            ry9Var = r2dVar.a.p() ? null : r2dVar.a.m(r2dVar.a.g(r2dVar.b.a, this.p).c, this.b, 0L).b;
            this.s0 = b0a.K;
        } else {
            ry9Var = null;
        }
        if (zBooleanValue || !r2dVar2.j.equals(r2dVar.j)) {
            zz9 zz9VarA = this.s0.a();
            List list = r2dVar.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                lwa lwaVar = (lwa) list.get(i8);
                for (int i9 = 0; i9 < lwaVar.e(); i9++) {
                    lwaVar.d(i9).b(zz9VarA);
                }
            }
            this.s0 = new b0a(zz9VarA);
        }
        b0a b0aVarN = N();
        boolean zEquals2 = b0aVarN.equals(this.U);
        this.U = b0aVarN;
        boolean z3 = r2dVar2.l != r2dVar.l;
        boolean z4 = r2dVar2.e != r2dVar.e;
        if (z4 || z3) {
            H0();
        }
        boolean z5 = r2dVar2.g;
        boolean z6 = r2dVar.g;
        boolean z7 = z5 != z6;
        if (z7) {
            int i10 = this.j0;
            hle hleVar = this.k0;
            if (hleVar != null) {
                if (z6 && !this.l0) {
                    hleVar.a(i10);
                    this.l0 = true;
                } else if (!z6 && this.l0) {
                    hleVar.n(i10);
                    this.l0 = false;
                }
            }
        }
        if (!zEquals) {
            this.n.c(0, new iw2(r2dVar, i, 1));
        }
        if (z) {
            rsh rshVar2 = new rsh();
            if (r2dVar2.a.p()) {
                i6 = i3;
                i7 = i6;
                obj = null;
                ry9Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = r2dVar2.b.a;
                r2dVar2.a.g(obj5, rshVar2);
                int i11 = rshVar2.c;
                int iB = r2dVar2.a.b(obj5);
                obj = r2dVar2.a.m(i11, this.b, 0L).a;
                ry9Var2 = this.b.b;
                obj2 = obj5;
                i6 = i11;
                i7 = iB;
            }
            x4a x4aVar3 = r2dVar2.b;
            if (i2 == 0) {
                boolean zB = x4aVar3.b();
                x4a x4aVar4 = r2dVar2.b;
                if (zB) {
                    jA0 = rshVar2.a(x4aVar4.b, x4aVar4.c);
                    jA1 = a0(r2dVar2);
                } else {
                    if (x4aVar4.e != -1) {
                        jA0 = a0(this.t0);
                    } else {
                        j2 = rshVar2.e;
                        j3 = rshVar2.d;
                        jA0 = j2 + j3;
                    }
                    jA1 = jA0;
                }
            } else if (x4aVar3.b()) {
                jA0 = r2dVar2.s;
                jA1 = a0(r2dVar2);
            } else {
                j2 = rshVar2.e;
                j3 = r2dVar2.s;
                jA0 = j2 + j3;
                jA1 = jA0;
            }
            long jP0 = vqi.p0(jA0);
            long jP1 = vqi.p0(jA1);
            x4a x4aVar5 = r2dVar2.b;
            k3d k3dVar = new k3d(obj, i6, ry9Var2, obj2, i7, jP0, jP1, x4aVar5.b, x4aVar5.c);
            tsh tshVar2 = this.b;
            int iF = F();
            int iB2 = B();
            if (this.t0.a.p()) {
                obj3 = null;
                ry9Var3 = null;
                obj4 = null;
            } else {
                r2d r2dVar3 = this.t0;
                Object obj6 = r2dVar3.b.a;
                r2dVar3.a.g(obj6, this.p);
                iB2 = this.t0.a.b(obj6);
                Object obj7 = this.t0.a.m(iF, tshVar2, 0L).a;
                ry9Var3 = tshVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i12 = iB2;
            long jP2 = vqi.p0(j);
            long jP3 = this.t0.b.b() ? vqi.p0(a0(this.t0)) : jP2;
            x4a x4aVar6 = this.t0.b;
            this.n.c(11, new vf6(i2, k3dVar, new k3d(obj3, iF, ry9Var3, obj4, i12, jP2, jP3, x4aVar6.b, x4aVar6.c), 0));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
        }
        if (zBooleanValue) {
            this.n.c(1, new iw2(ry9Var, iIntValue, 2));
        }
        final int i13 = 7;
        if (r2dVar2.f != r2dVar.f) {
            this.n.c(10, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj8) {
                    int i14 = i13;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj8;
                    switch (i14) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
            if (r2dVar.f != null) {
                final int i14 = 8;
                this.n.c(10, new r89() { // from class: of6
                    @Override // defpackage.r89
                    public final void invoke(Object obj8) {
                        int i15 = i14;
                        r2d r2dVar4 = r2dVar;
                        j3d j3dVar = (j3d) obj8;
                        switch (i15) {
                            case 0:
                                j3dVar.m(r2dVar4.g);
                                j3dVar.g0(r2dVar4.g);
                                break;
                            case 1:
                                j3dVar.G0(r2dVar4.e, r2dVar4.l);
                                break;
                            case 2:
                                j3dVar.z(r2dVar4.e);
                                break;
                            case 3:
                                j3dVar.i0(r2dVar4.m, r2dVar4.l);
                                break;
                            case 4:
                                j3dVar.l(r2dVar4.n);
                                break;
                            case 5:
                                j3dVar.Y0(r2dVar4.m());
                                break;
                            case 6:
                                j3dVar.K0(r2dVar4.o);
                                break;
                            case 7:
                                j3dVar.M0(r2dVar4.f);
                                break;
                            case 8:
                                j3dVar.T(r2dVar4.f);
                                break;
                            default:
                                j3dVar.t0((fzh) r2dVar4.i.e);
                                break;
                        }
                    }
                });
            }
        }
        vyh vyhVar = r2dVar2.i;
        vyh vyhVar2 = r2dVar.i;
        if (vyhVar != vyhVar2) {
            uyh uyhVar = this.j;
            Object obj8 = vyhVar2.f;
            ((ve5) uyhVar).getClass();
            final int i15 = 9;
            this.n.c(2, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i16 = i15;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i16) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        if (zEquals2) {
            i5 = 0;
        } else {
            i5 = 0;
            this.n.c(14, new nf6(this.U, 0));
        }
        if (z7) {
            this.n.c(3, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i16 = i5;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i16) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i16 = 1;
            this.n.c(-1, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i17 = i16;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i17) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        final int i17 = 4;
        if (z4) {
            final int i18 = 2;
            this.n.c(4, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i19 = i18;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i19) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        final int i19 = 5;
        if (z3 || r2dVar2.m != r2dVar.m) {
            final int i20 = 3;
            this.n.c(5, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i110 = i20;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i110) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        final int i21 = 6;
        if (r2dVar2.n != r2dVar.n) {
            this.n.c(6, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i110 = i17;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i110) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        if (r2dVar2.m() != r2dVar.m()) {
            this.n.c(7, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i110 = i19;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i110) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        if (!r2dVar2.o.equals(r2dVar.o)) {
            this.n.c(12, new r89() { // from class: of6
                @Override // defpackage.r89
                public final void invoke(Object obj9) {
                    int i110 = i21;
                    r2d r2dVar4 = r2dVar;
                    j3d j3dVar = (j3d) obj9;
                    switch (i110) {
                        case 0:
                            j3dVar.m(r2dVar4.g);
                            j3dVar.g0(r2dVar4.g);
                            break;
                        case 1:
                            j3dVar.G0(r2dVar4.e, r2dVar4.l);
                            break;
                        case 2:
                            j3dVar.z(r2dVar4.e);
                            break;
                        case 3:
                            j3dVar.i0(r2dVar4.m, r2dVar4.l);
                            break;
                        case 4:
                            j3dVar.l(r2dVar4.n);
                            break;
                        case 5:
                            j3dVar.Y0(r2dVar4.m());
                            break;
                        case 6:
                            j3dVar.K0(r2dVar4.o);
                            break;
                        case 7:
                            j3dVar.M0(r2dVar4.f);
                            break;
                        case 8:
                            j3dVar.T(r2dVar4.f);
                            break;
                        default:
                            j3dVar.t0((fzh) r2dVar4.i.e);
                            break;
                    }
                }
            });
        }
        E0();
        this.n.b();
        if (r2dVar2.p != r2dVar.p) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((xf6) it.next()).a.H0();
            }
        }
    }

    @Override // defpackage.l3d
    public final boolean H() {
        I0();
        return this.J;
    }

    public final void H0() {
        int playbackState = getPlaybackState();
        v6g v6gVar = this.B;
        bbh bbhVar = this.A;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                I0();
                boolean z2 = this.t0.p;
                if (z() && !z2) {
                    z = true;
                }
                bbhVar.b(z);
                v6gVar.e(z());
                return;
            }
            if (playbackState != 4) {
                c.t();
                return;
            }
        }
        bbhVar.b(false);
        v6gVar.e(false);
    }

    @Override // defpackage.l3d
    public final void I() {
        I0();
        long jE = e() + this.q0;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jE = Math.min(jE, duration);
        }
        v0(Math.max(jE, 0L));
    }

    public final void I0() {
        this.e.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.u;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = vqi.a;
            Locale locale = Locale.US;
            String strW = nbh.w("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.h0) {
                ore.k(strW);
            } else {
                lvb.H0("ExoPlayerImpl", strW, this.i0 ? null : new IllegalStateException());
                this.i0 = true;
            }
        }
    }

    @Override // defpackage.l3d
    public final void J() {
        I0();
        long jE = e() + (-this.p0);
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jE = Math.min(jE, duration);
        }
        v0(Math.max(jE, 0L));
    }

    @Override // defpackage.l3d
    public final void K(List list) {
        I0();
        ArrayList arrayListQ = Q(list);
        I0();
        y0(arrayListQ, -1, -9223372036854775807L, true);
    }

    public final void L(int i, List list) {
        I0();
        ArrayList arrayListQ = Q(list);
        I0();
        lvb.R(i >= 0);
        int iMin = Math.min(i, this.q.size());
        if (!this.t0.a.p()) {
            G0(M(this.t0, iMin, arrayListQ), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.u0 == -1;
        I0();
        y0(arrayListQ, -1, -9223372036854775807L, z);
    }

    public final r2d M(r2d r2dVar, int i, ArrayList arrayList) {
        ush ushVar = r2dVar.a;
        this.K++;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.q;
            if (i2 >= size) {
                this.R = this.R.b(i, arrayList2.size());
                r4d r4dVar = new r4d(arrayList3, this.R);
                r2d r2dVarK0 = k0(r2dVar, r4dVar, Y(ushVar, r4dVar, X(r2dVar), U(r2dVar)));
                this.m.h.d(new fg6(arrayList2, this.R, -1, -9223372036854775807L), 18, i, 0).b();
                return r2dVarK0;
            }
            m5a m5aVar = new m5a((ur0) arrayList.get(i2), this.r);
            arrayList2.add(m5aVar);
            arrayList3.add(i2 + i, new zf6(m5aVar.b, m5aVar.a));
            i2++;
        }
    }

    public final b0a N() {
        ush ushVarV = v();
        if (ushVarV.p()) {
            return this.s0;
        }
        ry9 ry9Var = ushVarV.m(F(), this.b, 0L).b;
        zz9 zz9VarA = this.s0.a();
        b0a b0aVar = ry9Var.d;
        if (b0aVar != null) {
            c98 c98Var = b0aVar.J;
            byte[] bArr = b0aVar.k;
            CharSequence charSequence = b0aVar.a;
            if (charSequence != null) {
                zz9VarA.a = charSequence;
            }
            CharSequence charSequence2 = b0aVar.b;
            if (charSequence2 != null) {
                zz9VarA.b = charSequence2;
            }
            CharSequence charSequence3 = b0aVar.c;
            if (charSequence3 != null) {
                zz9VarA.c = charSequence3;
            }
            CharSequence charSequence4 = b0aVar.d;
            if (charSequence4 != null) {
                zz9VarA.d = charSequence4;
            }
            CharSequence charSequence5 = b0aVar.e;
            if (charSequence5 != null) {
                zz9VarA.e = charSequence5;
            }
            CharSequence charSequence6 = b0aVar.f;
            if (charSequence6 != null) {
                zz9VarA.f = charSequence6;
            }
            CharSequence charSequence7 = b0aVar.g;
            if (charSequence7 != null) {
                zz9VarA.g = charSequence7;
            }
            Long l = b0aVar.h;
            if (l != null) {
                zz9VarA.c(l);
            }
            z4e z4eVar = b0aVar.i;
            if (z4eVar != null) {
                zz9VarA.i = z4eVar;
            }
            z4e z4eVar2 = b0aVar.j;
            if (z4eVar2 != null) {
                zz9VarA.j = z4eVar2;
            }
            Uri uri = b0aVar.m;
            if (uri != null || bArr != null) {
                zz9VarA.m = uri;
                zz9VarA.b(bArr, b0aVar.l);
            }
            Integer num = b0aVar.n;
            if (num != null) {
                zz9VarA.n = num;
            }
            Integer num2 = b0aVar.o;
            if (num2 != null) {
                zz9VarA.o = num2;
            }
            Integer num3 = b0aVar.p;
            if (num3 != null) {
                zz9VarA.p = num3;
            }
            Boolean bool = b0aVar.q;
            if (bool != null) {
                zz9VarA.q = bool;
            }
            Boolean bool2 = b0aVar.r;
            if (bool2 != null) {
                zz9VarA.r = bool2;
            }
            Integer num4 = b0aVar.s;
            if (num4 != null) {
                zz9VarA.s = num4;
            }
            Integer num5 = b0aVar.t;
            if (num5 != null) {
                zz9VarA.s = num5;
            }
            Integer num6 = b0aVar.u;
            if (num6 != null) {
                zz9VarA.t = num6;
            }
            Integer num7 = b0aVar.v;
            if (num7 != null) {
                zz9VarA.u = num7;
            }
            Integer num8 = b0aVar.w;
            if (num8 != null) {
                zz9VarA.v = num8;
            }
            Integer num9 = b0aVar.x;
            if (num9 != null) {
                zz9VarA.w = num9;
            }
            Integer num10 = b0aVar.y;
            if (num10 != null) {
                zz9VarA.x = num10;
            }
            CharSequence charSequence8 = b0aVar.z;
            if (charSequence8 != null) {
                zz9VarA.y = charSequence8;
            }
            CharSequence charSequence9 = b0aVar.A;
            if (charSequence9 != null) {
                zz9VarA.z = charSequence9;
            }
            CharSequence charSequence10 = b0aVar.B;
            if (charSequence10 != null) {
                zz9VarA.A = charSequence10;
            }
            Integer num11 = b0aVar.C;
            if (num11 != null) {
                zz9VarA.B = num11;
            }
            Integer num12 = b0aVar.D;
            if (num12 != null) {
                zz9VarA.C = num12;
            }
            CharSequence charSequence11 = b0aVar.E;
            if (charSequence11 != null) {
                zz9VarA.D = charSequence11;
            }
            CharSequence charSequence12 = b0aVar.F;
            if (charSequence12 != null) {
                zz9VarA.E = charSequence12;
            }
            CharSequence charSequence13 = b0aVar.G;
            if (charSequence13 != null) {
                zz9VarA.F = charSequence13;
            }
            Integer num13 = b0aVar.H;
            if (num13 != null) {
                zz9VarA.G = num13;
            }
            Bundle bundle = b0aVar.I;
            if (bundle != null) {
                zz9VarA.H = bundle;
            }
            if (!c98Var.isEmpty()) {
                zz9VarA.I = c98.n(c98Var);
            }
        }
        return new b0a(zz9VarA);
    }

    public final void O() {
        q0(0, Integer.MAX_VALUE);
    }

    public final void P() {
        I0();
        s0();
        B0(null);
        m0(0, 0);
    }

    public final ArrayList Q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.s.a((ry9) list.get(i)));
        }
        return arrayList;
    }

    public final long R() {
        I0();
        if (!f()) {
            return S();
        }
        r2d r2dVar = this.t0;
        return r2dVar.k.equals(r2dVar.b) ? vqi.p0(this.t0.q) : getDuration();
    }

    public final long S() {
        I0();
        if (this.t0.a.p()) {
            return this.v0;
        }
        r2d r2dVar = this.t0;
        if (r2dVar.k.d != r2dVar.b.d) {
            return vqi.p0(r2dVar.a.m(F(), this.b, 0L).l);
        }
        long j = r2dVar.q;
        if (this.t0.k.b()) {
            r2d r2dVar2 = this.t0;
            rsh rshVarG = r2dVar2.a.g(r2dVar2.k.a, this.p);
            long jD = rshVarG.d(this.t0.k.b);
            j = jD == Long.MIN_VALUE ? rshVarG.d : jD;
        }
        r2d r2dVar3 = this.t0;
        ush ushVar = r2dVar3.a;
        Object obj = r2dVar3.k.a;
        rsh rshVar = this.p;
        ushVar.g(obj, rshVar);
        return vqi.p0(j + rshVar.e);
    }

    public final long T() {
        ush ushVarV = v();
        if (ushVarV.p()) {
            return -9223372036854775807L;
        }
        return vqi.p0(ushVarV.m(F(), this.b, 0L).l);
    }

    public final long U(r2d r2dVar) {
        x4a x4aVar = r2dVar.b;
        long j = r2dVar.c;
        ush ushVar = r2dVar.a;
        if (!x4aVar.b()) {
            return vqi.p0(W(r2dVar));
        }
        Object obj = r2dVar.b.a;
        rsh rshVar = this.p;
        ushVar.g(obj, rshVar);
        if (j == -9223372036854775807L) {
            return vqi.p0(ushVar.m(X(r2dVar), this.b, 0L).k);
        }
        return vqi.p0(j) + vqi.p0(rshVar.e);
    }

    public final long V() {
        ush ushVarV = v();
        if (ushVarV.p()) {
            return -9223372036854775807L;
        }
        int iF = F();
        tsh tshVar = this.b;
        if (ushVarV.m(iF, tshVar, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (vqi.G(tshVar.f) - tshVar.e) - E();
    }

    public final long W(r2d r2dVar) {
        if (r2dVar.a.p()) {
            return vqi.X(this.v0);
        }
        long jL = r2dVar.p ? r2dVar.l() : r2dVar.s;
        if (r2dVar.b.b()) {
            return jL;
        }
        ush ushVar = r2dVar.a;
        Object obj = r2dVar.b.a;
        rsh rshVar = this.p;
        ushVar.g(obj, rshVar);
        return jL + rshVar.e;
    }

    public final int X(r2d r2dVar) {
        return r2dVar.a.p() ? this.u0 : r2dVar.a.g(r2dVar.b.a, this.p).c;
    }

    public final Pair Y(ush ushVar, r4d r4dVar, int i, long j) {
        if (ushVar.p() || r4dVar.p()) {
            boolean z = !ushVar.p() && r4dVar.p();
            return l0(r4dVar, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair pairI = ushVar.i(this.b, this.p, i, vqi.X(j));
        Object obj = pairI.first;
        if (r4dVar.b(obj) != -1) {
            return pairI;
        }
        int iU = kg6.U(this.b, this.p, this.I, this.J, obj, ushVar, r4dVar);
        if (iU == -1) {
            return l0(r4dVar, -1, -9223372036854775807L);
        }
        tsh tshVar = this.b;
        r4dVar.m(iU, tshVar, 0L);
        return l0(r4dVar, iU, vqi.p0(tshVar.k));
    }

    public final s2d Z() {
        I0();
        return this.t0.o;
    }

    @Override // defpackage.l3d
    public final float a() {
        I0();
        return this.d0;
    }

    @Override // defpackage.l3d
    public final void b(float f) {
        I0();
        float fI = vqi.i(f, 0.0f, 1.0f);
        float f2 = this.d0;
        if (f2 == fI) {
            return;
        }
        if (fI != 0.0f) {
            f2 = fI;
        }
        this.e0 = f2;
        this.d0 = fI;
        this.m.h.c(32, Float.valueOf(fI)).b();
        this.n.f(22, new sf6(0, fI));
    }

    public final ryh b0() {
        I0();
        pe5 pe5VarG = ((ve5) this.j).g();
        if (!this.N) {
            return pe5VarG;
        }
        pe5VarG.getClass();
        oe5 oe5Var = new oe5(pe5VarG);
        oe5Var.i(this.O);
        return new pe5(oe5Var);
    }

    @Override // defpackage.l3d
    public final boolean c(int i) {
        I0();
        return this.T.a(i);
    }

    public final boolean c0() {
        int iE;
        ush ushVarV = v();
        if (ushVarV.p()) {
            iE = -1;
        } else {
            int iF = F();
            I0();
            int i = this.I;
            if (i == 1) {
                i = 0;
            }
            I0();
            iE = ushVarV.e(iF, i, this.J);
        }
        return iE != -1;
    }

    public final void d(xf xfVar) {
        r75 r75Var = this.t;
        r75Var.getClass();
        r75Var.f.a(xfVar);
    }

    public final boolean d0() {
        int iK;
        ush ushVarV = v();
        if (ushVarV.p()) {
            iK = -1;
        } else {
            int iF = F();
            I0();
            int i = this.I;
            if (i == 1) {
                i = 0;
            }
            I0();
            iK = ushVarV.k(iF, i, this.J);
        }
        return iK != -1;
    }

    @Override // defpackage.l3d
    public final long e() {
        I0();
        return vqi.p0(W(this.t0));
    }

    public final boolean e0() {
        ush ushVarV = v();
        return !ushVarV.p() && ushVarV.m(F(), this.b, 0L).h;
    }

    @Override // defpackage.l3d
    public final boolean f() {
        I0();
        return this.t0.b.b();
    }

    public final boolean f0() {
        ush ushVarV = v();
        return !ushVarV.p() && ushVarV.m(F(), this.b, 0L).a();
    }

    @Override // defpackage.l3d
    public final long g() {
        I0();
        return vqi.p0(this.t0.r);
    }

    public final boolean g0() {
        ush ushVarV = v();
        return !ushVarV.p() && ushVarV.m(F(), this.b, 0L).g;
    }

    @Override // defpackage.l3d
    public final long getDuration() {
        I0();
        if (!f()) {
            return T();
        }
        r2d r2dVar = this.t0;
        x4a x4aVar = r2dVar.b;
        ush ushVar = r2dVar.a;
        Object obj = x4aVar.a;
        rsh rshVar = this.p;
        ushVar.g(obj, rshVar);
        return vqi.p0(rshVar.a(x4aVar.b, x4aVar.c));
    }

    @Override // defpackage.l3d
    public final int getPlaybackState() {
        I0();
        return this.t0.e;
    }

    @Override // defpackage.l3d
    public final int getRepeatMode() {
        I0();
        return this.I;
    }

    @Override // defpackage.l3d
    public final void h(ry9 ry9Var, long j) {
        x(0, j, c98.r(ry9Var));
    }

    public final boolean h0() {
        I0();
        return this.t0.g;
    }

    @Override // defpackage.l3d
    public final void i() {
        w0();
    }

    public final boolean i0() {
        return getPlaybackState() == 3 && z() && u() == 0;
    }

    @Override // defpackage.l3d
    public final void j() {
        u0(F(), -9223372036854775807L, false);
    }

    @Override // defpackage.l3d
    public final void k(ryh ryhVar) {
        ryh ryhVarB;
        I0();
        uyh uyhVar = this.j;
        uyhVar.getClass();
        ryh ryhVarB0 = b0();
        if (this.N) {
            this.O = ryhVar.I;
            u98 u98Var = this.P.a;
            qyh qyhVarA = ryhVar.a();
            pci it = u98Var.iterator();
            while (it.hasNext()) {
                qyhVarA.h(((Integer) it.next()).intValue(), true);
            }
            ryhVarB = qyhVarA.b();
        } else {
            ryhVarB = ryhVar;
        }
        if (!ryhVarB.equals(((ve5) uyhVar).g())) {
            uyhVar.c(ryhVarB);
        }
        if (ryhVarB0.equals(ryhVar)) {
            return;
        }
        this.n.f(19, new uf6(ryhVar, 0));
    }

    public final r2d k0(r2d r2dVar, ush ushVar, Pair pair) {
        List list;
        lvb.R(ushVar.p() || pair != null);
        ush ushVar2 = r2dVar.a;
        long jU = U(r2dVar);
        r2d r2dVarJ = r2dVar.j(ushVar);
        if (ushVar.p()) {
            x4a x4aVar = r2d.u;
            long jX = vqi.X(this.v0);
            r2d r2dVarC = r2dVarJ.d(x4aVar, jX, jX, jX, 0L, iyh.d, this.c, ghe.e).c(x4aVar);
            r2dVarC.q = r2dVarC.s;
            return r2dVarC;
        }
        Object obj = r2dVarJ.b.a;
        String str = vqi.a;
        boolean zEquals = obj.equals(pair.first);
        x4a x4aVar2 = !zEquals ? new x4a(pair.first) : r2dVarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jX2 = vqi.X(jU);
        if (!ushVar2.p()) {
            jX2 -= ushVar2.g(obj, this.p).e;
            if (zEquals && jX2 - jLongValue == 1 && jX2 == ushVar2.g(obj, this.p).d) {
                jX2--;
            }
        }
        if (!zEquals || jLongValue < jX2) {
            x4a x4aVar3 = x4aVar2;
            lvb.b0(!x4aVar3.b());
            iyh iyhVar = !zEquals ? iyh.d : r2dVarJ.h;
            vyh vyhVar = !zEquals ? this.c : r2dVarJ.i;
            if (zEquals) {
                list = r2dVarJ.j;
            } else {
                a98 a98Var = c98.b;
                list = ghe.e;
            }
            r2d r2dVarC2 = r2dVarJ.d(x4aVar3, jLongValue, jLongValue, jLongValue, 0L, iyhVar, vyhVar, list).c(x4aVar3);
            r2dVarC2.q = jLongValue;
            return r2dVarC2;
        }
        if (jLongValue != jX2) {
            x4a x4aVar4 = x4aVar2;
            lvb.b0(!x4aVar4.b());
            long jMax = Math.max(0L, r2dVarJ.r - (jLongValue - jX2));
            long j = r2dVarJ.q;
            if (r2dVarJ.k.equals(r2dVarJ.b)) {
                j = jLongValue + jMax;
            }
            r2d r2dVarD = r2dVarJ.d(x4aVar4, jLongValue, jLongValue, jLongValue, jMax, r2dVarJ.h, r2dVarJ.i, r2dVarJ.j);
            r2dVarD.q = j;
            return r2dVarD;
        }
        int iB = ushVar.b(r2dVarJ.k.a);
        if (iB != -1 && ushVar.f(iB, this.p, false).c == ushVar.g(x4aVar2.a, this.p).c) {
            return r2dVarJ;
        }
        ushVar.g(x4aVar2.a, this.p);
        boolean zB = x4aVar2.b();
        rsh rshVar = this.p;
        long jA = zB ? rshVar.a(x4aVar2.b, x4aVar2.c) : rshVar.d;
        x4a x4aVar5 = x4aVar2;
        r2d r2dVarC3 = r2dVarJ.d(x4aVar5, r2dVarJ.s, r2dVarJ.s, r2dVarJ.d, jA - r2dVarJ.s, r2dVarJ.h, r2dVarJ.i, r2dVarJ.j).c(x4aVar5);
        r2dVarC3.q = jA;
        return r2dVarC3;
    }

    @Override // defpackage.l3d
    public final void l() {
        if (v().p() || f()) {
            I0();
            return;
        }
        boolean zD0 = d0();
        if (f0() && !g0()) {
            if (zD0) {
                w0();
                return;
            } else {
                I0();
                return;
            }
        }
        if (zD0) {
            long jE = e();
            I0();
            if (jE <= this.r0) {
                w0();
                return;
            }
        }
        v0(0L);
    }

    public final Pair l0(ush ushVar, int i, long j) {
        if (ushVar.p()) {
            this.u0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.v0 = j;
            return null;
        }
        if (i == -1 || i >= ushVar.o()) {
            i = ushVar.a(this.J);
            j = vqi.p0(ushVar.m(i, this.b, 0L).k);
        }
        return ushVar.i(this.b, this.p, i, vqi.X(j));
    }

    @Override // defpackage.l3d
    public final PlaybackException m() {
        I0();
        return this.t0.f;
    }

    public final void m0(final int i, final int i2) {
        lag lagVar = this.b0;
        if (i == lagVar.a && i2 == lagVar.b) {
            return;
        }
        this.b0 = new lag(i, i2);
        this.n.f(24, new r89() { // from class: qf6
            @Override // defpackage.r89
            public final void invoke(Object obj) {
                ((j3d) obj).U(i, i2);
            }
        });
        x0(2, 14, new lag(i, i2));
    }

    @Override // defpackage.l3d
    public final void n(boolean z) {
        I0();
        F0(1, z);
    }

    public final void n0(int i, int i2, int i3) {
        I0();
        lvb.R(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        ush ushVarV = v();
        this.K++;
        vqi.W(arrayList, i, iMin, iMin2);
        e4g e4gVar = this.R;
        e4gVar.getClass();
        this.R = e4gVar;
        r4d r4dVar = new r4d(arrayList, this.R);
        r2d r2dVar = this.t0;
        r2d r2dVarK0 = k0(r2dVar, r4dVar, Y(ushVarV, r4dVar, X(r2dVar), U(this.t0)));
        e4g e4gVar2 = this.R;
        kg6 kg6Var = this.m;
        kg6Var.getClass();
        kg6Var.h.c(19, new gg6(i, iMin, iMin2, e4gVar2)).b();
        G0(r2dVarK0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.l3d
    public final void o() {
        I0();
        if (this.d0 == 0.0f) {
            float f = this.e0;
            if (f != 0.0f) {
                b(f);
            }
        }
    }

    public final void o0() {
        boolean zC;
        lvb.r0("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "] [" + sz9.b() + "]");
        I0();
        this.z.e();
        this.A.b(false);
        this.B.e(false);
        dc9 dc9Var = this.F;
        if (dc9Var != null && Build.VERSION.SDK_INT >= 34) {
            dc9.t(dc9Var);
        }
        gbc gbcVar = this.E;
        ((sfh) gbcVar.f).g();
        ((bg6) gbcVar.a).p0((n6h) gbcVar.b);
        kg6 kg6Var = this.m;
        if (kg6Var.K || !kg6Var.j.getThread().isAlive()) {
            zC = true;
        } else {
            kg6Var.K = true;
            r94 r94Var = new r94(kg6Var.q);
            kg6Var.h.c(7, r94Var).b();
            zC = r94Var.c(kg6Var.v);
        }
        if (!zC) {
            this.n.f(10, new o75(25));
        }
        this.n.d();
        this.k.g();
        this.v.a(this.t);
        r2d r2dVar = this.t0;
        if (r2dVar.p) {
            this.t0 = r2dVar.a();
        }
        r2d r2dVarJ0 = j0(this.t0, 1);
        this.t0 = r2dVarJ0;
        r2d r2dVarC = r2dVarJ0.c(r2dVarJ0.b);
        this.t0 = r2dVarC;
        r2dVarC.q = r2dVarC.s;
        this.t0.r = 0L;
        r75 r75Var = this.t;
        sfh sfhVar = r75Var.h;
        sfhVar.getClass();
        sfhVar.f(new jj2(13, r75Var));
        s0();
        Surface surface = this.X;
        if (surface != null) {
            surface.release();
            this.X = null;
        }
        if (this.l0) {
            hle hleVar = this.k0;
            hleVar.getClass();
            hleVar.n(this.j0);
            this.l0 = false;
        }
        this.g0 = zy4.d;
        this.m0 = true;
    }

    @Override // defpackage.l3d
    public final void p() {
        int iE;
        ush ushVarV = v();
        if (ushVarV.p()) {
            iE = -1;
        } else {
            int iF = F();
            I0();
            int i = this.I;
            if (i == 1) {
                i = 0;
            }
            I0();
            iE = ushVarV.e(iF, i, this.J);
        }
        if (iE == -1) {
            I0();
        } else if (iE == F()) {
            u0(F(), -9223372036854775807L, true);
        } else {
            u0(iE, -9223372036854775807L, false);
        }
    }

    public final void p0(j3d j3dVar) {
        I0();
        j3dVar.getClass();
        this.n.e(j3dVar);
    }

    @Override // defpackage.l3d
    public final void play() {
        n(true);
    }

    @Override // defpackage.l3d
    public final void prepare() {
        I0();
        r2d r2dVar = this.t0;
        if (r2dVar.e != 1) {
            return;
        }
        r2d r2dVarF = r2dVar.f(null);
        r2d r2dVarJ0 = j0(r2dVarF, r2dVarF.a.p() ? 4 : 2);
        this.K++;
        this.m.h.a(29).b();
        G0(r2dVarJ0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.l3d
    public final fzh q() {
        I0();
        return (fzh) this.t0.i.e;
    }

    public final void q0(int i, int i2) {
        I0();
        lvb.R(i >= 0 && i2 >= i);
        int size = this.q.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        r2d r2dVarR0 = r0(this.t0, i, iMin);
        G0(r2dVarR0, 0, !r2dVarR0.b.a.equals(this.t0.b.a), 4, W(r2dVarR0), -1, false);
    }

    @Override // defpackage.l3d
    public final void r(b0a b0aVar) {
        I0();
        b0aVar.getClass();
        if (b0aVar.equals(this.V)) {
            return;
        }
        this.V = b0aVar;
        this.n.f(15, new rf6(this, 1));
    }

    public final r2d r0(r2d r2dVar, int i, int i2) {
        ArrayList arrayList;
        int iX = X(r2dVar);
        long jU = U(r2dVar);
        ush ushVar = r2dVar.a;
        this.K++;
        int i3 = i2 - 1;
        while (true) {
            arrayList = this.q;
            if (i3 < i) {
                break;
            }
            arrayList.remove(i3);
            i3--;
        }
        this.R = this.R.c(i, i2);
        r4d r4dVar = new r4d(arrayList, this.R);
        r2d r2dVarK0 = k0(r2dVar, r4dVar, Y(ushVar, r4dVar, iX, jU));
        int i4 = r2dVarK0.e;
        if (i4 != 1 && i4 != 4 && iX >= i && iX < i2) {
            if (kg6.U(this.b, this.p, this.I, this.J, r2dVar.b.a, ushVar, r4dVar) == -1) {
                r2dVarK0 = j0(r2dVarK0, 4);
            }
        }
        this.m.h.d(this.R, 20, i, i2).b();
        return r2dVarK0;
    }

    @Override // defpackage.l3d
    public final int s() {
        I0();
        if (f()) {
            return this.t0.b.b;
        }
        return -1;
    }

    public final void s0() {
        SurfaceHolder surfaceHolder = this.Y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.x);
            this.Y = null;
        }
    }

    @Override // defpackage.l3d
    public final void seekTo(long j) {
        v0(j);
    }

    @Override // defpackage.l3d
    public final void setPlaybackSpeed(float f) {
        z0(new s2d(f, Z().b));
    }

    @Override // defpackage.l3d
    public final void setRepeatMode(int i) {
        I0();
        if (this.I != i) {
            this.I = i;
            this.m.h.b(11, i, 0).b();
            jn4 jn4Var = new jn4(i, 1);
            u89 u89Var = this.n;
            u89Var.c(8, jn4Var);
            E0();
            u89Var.b();
        }
    }

    @Override // defpackage.l3d
    public final void stop() {
        I0();
        D0(null);
        this.g0 = new zy4(this.t0.s, ghe.e);
    }

    @Override // defpackage.l3d
    public final void t(ry9 ry9Var) {
        K(c98.r(ry9Var));
    }

    public final void t0(int i, int i2, List list) {
        I0();
        lvb.R(i >= 0 && i2 >= i);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            int i3 = i;
            while (true) {
                if (i3 >= iMin) {
                    this.K++;
                    this.m.h.d(list, 27, i, iMin).b();
                    for (int i4 = i; i4 < iMin; i4++) {
                        zf6 zf6Var = (zf6) arrayList.get(i4);
                        zf6Var.d(vsh.q(zf6Var.b(), (ry9) list.get(i4 - i)));
                    }
                    G0(this.t0.j(new r4d(arrayList, this.R)), 0, false, 4, -9223372036854775807L, -1, false);
                    return;
                }
                if (!((zf6) arrayList.get(i3)).b.c((ry9) list.get(i3 - i))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList arrayListQ = Q(list);
        if (!this.t0.a.p()) {
            r2d r2dVarR0 = r0(M(this.t0, iMin, arrayListQ), i, iMin);
            G0(r2dVarR0, 0, !r2dVarR0.b.a.equals(this.t0.b.a), 4, W(r2dVarR0), -1, false);
        } else {
            boolean z = this.u0 == -1;
            I0();
            y0(arrayListQ, -1, -9223372036854775807L, z);
        }
    }

    @Override // defpackage.l3d
    public final int u() {
        I0();
        return this.t0.n;
    }

    public final void u0(int i, long j, boolean z) {
        I0();
        if (i == -1) {
            return;
        }
        lvb.R(i >= 0);
        ush ushVar = this.t0.a;
        if (ushVar.p() || i < ushVar.o()) {
            r75 r75Var = this.t;
            if (!r75Var.i) {
                wf wfVarT = r75Var.t();
                r75Var.i = true;
                r75Var.y(wfVarT, -1, new hs4(wfVarT));
            }
            this.K++;
            if (f()) {
                lvb.G0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                hg6 hg6Var = new hg6(this.t0);
                hg6Var.c(1);
                bg6 bg6Var = this.l.a;
                bg6Var.k.f(new gf5(bg6Var, 24, hg6Var));
                return;
            }
            r2d r2dVarH = this.t0;
            int i2 = r2dVarH.e;
            if (i2 == 3 || (i2 == 4 && !ushVar.p())) {
                r2dVarH = this.t0.h(2);
            }
            int iF = F();
            r2d r2dVarK0 = k0(r2dVarH, ushVar, l0(ushVar, i, j));
            this.m.h.c(3, new jg6(ushVar, i, vqi.X(j))).b();
            G0(r2dVarK0, 0, true, 1, W(r2dVarK0), iF, z);
        }
    }

    @Override // defpackage.l3d
    public final ush v() {
        I0();
        return this.t0.a;
    }

    public final void v0(long j) {
        u0(F(), j, false);
    }

    @Override // defpackage.l3d
    public final void w() {
        I0();
        if (this.d0 != 0.0f) {
            b(0.0f);
        }
    }

    public final void w0() {
        int iK;
        ush ushVarV = v();
        if (ushVarV.p()) {
            iK = -1;
        } else {
            int iF = F();
            I0();
            int i = this.I;
            if (i == 1) {
                i = 0;
            }
            I0();
            iK = ushVarV.k(iF, i, this.J);
        }
        if (iK == -1) {
            I0();
        } else if (iK == F()) {
            u0(F(), -9223372036854775807L, true);
        } else {
            u0(iK, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.l3d
    public final void x(int i, long j, List list) {
        I0();
        ArrayList arrayListQ = Q(list);
        I0();
        y0(arrayListQ, i, j, false);
    }

    public final void x0(int i, int i2, Object obj) {
        kg6 kg6Var;
        ks0[] ks0VarArr = this.h;
        int length = ks0VarArr.length;
        int i3 = 0;
        while (true) {
            kg6Var = this.m;
            if (i3 >= length) {
                break;
            }
            ks0 ks0Var = ks0VarArr[i3];
            if (i == -1 || ks0Var.b == i) {
                int iX = X(this.t0);
                ush ushVar = this.t0.a;
                if (iX == -1) {
                    iX = 0;
                }
                f4d f4dVar = new f4d(kg6Var, ks0Var, ushVar, iX, kg6Var.j);
                lvb.b0(!f4dVar.f);
                f4dVar.c = i2;
                lvb.b0(!f4dVar.f);
                f4dVar.d = obj;
                f4dVar.b();
            }
            i3++;
        }
        for (ks0 ks0Var2 : this.i) {
            if (ks0Var2 != null && (i == -1 || ks0Var2.b == i)) {
                int iX2 = X(this.t0);
                ush ushVar2 = this.t0.a;
                if (iX2 == -1) {
                    iX2 = 0;
                }
                f4d f4dVar2 = new f4d(kg6Var, ks0Var2, ushVar2, iX2, kg6Var.j);
                lvb.b0(!f4dVar2.f);
                f4dVar2.c = i2;
                lvb.b0(!f4dVar2.f);
                f4dVar2.d = obj;
                f4dVar2.b();
            }
        }
    }

    @Override // defpackage.l3d
    public final void y() {
        int iE;
        if (v().p() || f()) {
            I0();
            return;
        }
        if (!c0()) {
            if (f0() && e0()) {
                u0(F(), -9223372036854775807L, false);
                return;
            } else {
                I0();
                return;
            }
        }
        ush ushVarV = v();
        if (ushVarV.p()) {
            iE = -1;
        } else {
            int iF = F();
            I0();
            int i = this.I;
            if (i == 1) {
                i = 0;
            }
            I0();
            iE = ushVarV.e(iF, i, this.J);
        }
        if (iE == -1) {
            I0();
        } else if (iE == F()) {
            u0(F(), -9223372036854775807L, true);
        } else {
            u0(iE, -9223372036854775807L, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    public final void y0(List list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        r2d r2dVarJ0;
        boolean z2;
        int iA = i;
        int iX = X(this.t0);
        long jE = e();
        this.K++;
        ArrayList arrayList = this.q;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            m5a m5aVar = new m5a((ur0) list.get(i4), this.r);
            arrayList2.add(m5aVar);
            arrayList.add(i4, new zf6(m5aVar.b, m5aVar.a));
        }
        this.R = this.R.a().b(0, arrayList2.size());
        r4d r4dVar = new r4d(arrayList, this.R);
        if (!r4dVar.p() && iA >= r4dVar.o()) {
            throw new IllegalSeekPositionException();
        }
        if (!z) {
            if (iA == -1) {
                i2 = iX;
                j2 = jE;
            } else {
                j2 = j;
            }
            r2d r2dVarK0 = k0(this.t0, r4dVar, l0(r4dVar, i2, j2));
            i3 = r2dVarK0.e;
            if (i3 == 1) {
                i3 = 1;
            } else if (!r4dVar.p()) {
                i3 = 4;
            } else if (i2 != -1) {
                if (i2 >= r4dVar.o()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            r2dVarJ0 = j0(r2dVarK0, i3);
            this.m.h.c(17, new fg6(arrayList2, this.R, i2, vqi.X(j2))).b();
            if (!this.t0.b.a.equals(r2dVarJ0.b.a) || this.t0.a.p()) {
                z2 = false;
            } else {
                z2 = true;
            }
            G0(r2dVarJ0, 0, z2, 4, W(r2dVarJ0), -1, false);
        }
        iA = r4dVar.a(this.J);
        j2 = -9223372036854775807L;
        i2 = iA;
        r2d r2dVarK1 = k0(this.t0, r4dVar, l0(r4dVar, i2, j2));
        i3 = r2dVarK1.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (!r4dVar.p()) {
            i3 = 4;
        } else if (i2 != -1) {
            if (i2 >= r4dVar.o()) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        r2dVarJ0 = j0(r2dVarK1, i3);
        this.m.h.c(17, new fg6(arrayList2, this.R, i2, vqi.X(j2))).b();
        if (this.t0.b.a.equals(r2dVarJ0.b.a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        G0(r2dVarJ0, 0, z2, 4, W(r2dVarJ0), -1, false);
    }

    @Override // defpackage.l3d
    public final boolean z() {
        I0();
        return this.t0.l;
    }

    public final void z0(s2d s2dVar) {
        I0();
        if (this.t0.o.equals(s2dVar)) {
            return;
        }
        r2d r2dVarG = this.t0.g(s2dVar);
        this.K++;
        this.m.h.c(4, s2dVar).b();
        G0(r2dVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }
}
