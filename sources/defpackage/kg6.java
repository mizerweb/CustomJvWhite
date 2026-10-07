package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class kg6 implements Handler.Callback, t0a, tyh, mwi {
    public static final long G1 = vqi.p0(10000);
    public final p80 A;
    public ExoPlaybackException A1;
    public final boolean B;
    public long B1;
    public ybf C;
    public jf6 C1;
    public s6f D;
    public long D1;
    public boolean E;
    public boolean E1;
    public boolean F;
    public float F1;
    public jg6 G;
    public int H;
    public r2d I;
    public hg6 J;
    public boolean K;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final rje[] a;
    public final ks0[] b;
    public final boolean[] c;
    public final uyh d;
    public final vyh e;
    public final s99 f;
    public final ko0 g;
    public final sfh h;
    public final ga4 i;
    public final Looper j;
    public final tsh k;
    public final rsh l;
    public final long m;
    public final boolean n;
    public long n1;
    public final bc5 o;
    public boolean o1;
    public final ArrayList p;
    public int p1;
    public final qt3 q;
    public boolean q1;
    public final pf6 r;
    public boolean r1;
    public final x0a s;
    public boolean s1;
    public final n5a t;
    public boolean t1;
    public final vb5 u;
    public int u1;
    public final long v;
    public jg6 v1;
    public final z3d w;
    public long w1;
    public final r75 x;
    public long x1;
    public final sfh y;
    public int y1;
    public final boolean z;
    public boolean z1;

    public kg6(Context context, ks0[] ks0VarArr, ks0[] ks0VarArr2, uyh uyhVar, vyh vyhVar, s99 s99Var, ko0 ko0Var, int i, boolean z, r75 r75Var, ybf ybfVar, vb5 vb5Var, long j, boolean z2, Looper looper, qt3 qt3Var, pf6 pf6Var, z3d z3dVar, ga4 ga4Var, final mwi mwiVar, boolean z3) {
        Looper looper2;
        jf6 jf6Var = jf6.a;
        this.D1 = -9223372036854775807L;
        this.r = pf6Var;
        this.d = uyhVar;
        this.e = vyhVar;
        this.f = s99Var;
        this.g = ko0Var;
        this.p1 = i;
        this.q1 = z;
        this.C = ybfVar;
        this.u = vb5Var;
        this.v = j;
        this.X = z2;
        this.q = qt3Var;
        this.w = z3dVar;
        this.C1 = jf6Var;
        this.x = r75Var;
        this.F1 = 1.0f;
        this.D = s6f.b;
        this.B = z3;
        this.B1 = -9223372036854775807L;
        this.n1 = -9223372036854775807L;
        this.m = s99Var.d();
        this.n = s99Var.a();
        qsh qshVar = ush.a;
        r2d r2dVarK = r2d.k(vyhVar);
        this.I = r2dVarK;
        this.J = new hg6(r2dVarK);
        this.b = new ks0[ks0VarArr.length];
        this.c = new boolean[ks0VarArr.length];
        ve5 ve5Var = (ve5) uyhVar;
        ve5Var.getClass();
        this.a = new rje[ks0VarArr.length];
        boolean z4 = false;
        boolean z5 = false;
        for (int i2 = 0; i2 < ks0VarArr.length; i2++) {
            ks0 ks0Var = ks0VarArr[i2];
            ks0Var.e = i2;
            ks0Var.f = z3dVar;
            ks0Var.g = qt3Var;
            this.b[i2] = ks0Var;
            ks0 ks0Var2 = this.b[i2];
            synchronized (ks0Var2.a) {
                ks0Var2.r = ve5Var;
            }
            ks0 ks0Var3 = ks0VarArr2[i2];
            if (ks0Var3 != null) {
                ks0Var3.e = i2;
                ks0Var3.f = z3dVar;
                ks0Var3.g = qt3Var;
                z5 = true;
            }
            this.a[i2] = new rje(ks0VarArr[i2], ks0Var3, i2);
        }
        this.z = z5;
        this.o = new bc5(this, qt3Var);
        this.p = new ArrayList();
        this.k = new tsh();
        this.l = new rsh();
        lvb.b0(uyhVar.a == null);
        uyhVar.a = this;
        uyhVar.b = ko0Var;
        this.z1 = true;
        nfh nfhVar = (nfh) qt3Var;
        sfh sfhVarA = nfhVar.a(looper, null);
        this.y = sfhVarA;
        this.s = new x0a(r75Var, sfhVarA, new gve(this));
        this.t = new n5a(this, r75Var, sfhVarA, z3dVar);
        ga4 ga4Var2 = ga4Var == null ? new ga4(null) : ga4Var;
        this.i = ga4Var2;
        synchronized (ga4Var2.b) {
            try {
                if (((Looper) ga4Var2.c) == null) {
                    if (ga4Var2.a == 0 && ((HandlerThread) ga4Var2.d) == null) {
                        z4 = true;
                    }
                    lvb.b0(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    ga4Var2.d = handlerThread;
                    handlerThread.start();
                    ga4Var2.c = ((HandlerThread) ga4Var2.d).getLooper();
                }
                ga4Var2.a++;
                looper2 = (Looper) ga4Var2.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = looper2;
        sfh sfhVarA2 = nfhVar.a(looper2, this);
        this.h = sfhVarA2;
        this.A = new p80(context, looper2, this);
        sfhVarA2.c(35, new mwi() { // from class: dg6
            @Override // defpackage.mwi
            public final void b(long j2, long j3, b87 b87Var, MediaFormat mediaFormat) {
                mwiVar.b(j2, j3, b87Var, mediaFormat);
                this.a.b(j2, j3, b87Var, mediaFormat);
            }
        }).b();
    }

    public static Pair T(ush ushVar, jg6 jg6Var, boolean z, int i, boolean z2, tsh tshVar, rsh rshVar) {
        int iU;
        ush ushVar2 = jg6Var.a;
        if (ushVar.p()) {
            return null;
        }
        ush ushVar3 = ushVar2.p() ? ushVar : ushVar2;
        try {
            Pair pairI = ushVar3.i(tshVar, rshVar, jg6Var.b, jg6Var.c);
            if (!ushVar.equals(ushVar3)) {
                if (ushVar.b(pairI.first) == -1) {
                    if (!z || (iU = U(tshVar, rshVar, i, z2, pairI.first, ushVar3, ushVar)) == -1) {
                        return null;
                    }
                    return ushVar.i(tshVar, rshVar, iU, -9223372036854775807L);
                }
                if (ushVar3.g(pairI.first, rshVar).f && ushVar3.m(rshVar.c, tshVar, 0L).m == ushVar3.b(pairI.first)) {
                    return ushVar.i(tshVar, rshVar, ushVar.g(pairI.first, rshVar).c, jg6Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(tsh tshVar, rsh rshVar, int i, boolean z, Object obj, ush ushVar, ush ushVar2) {
        ush ushVar3 = ushVar;
        Object obj2 = ushVar3.m(ushVar3.g(obj, rshVar).c, tshVar, 0L).a;
        for (int i2 = 0; i2 < ushVar2.o(); i2++) {
            if (ushVar2.m(i2, tshVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = ushVar3.b(obj);
        int iH = ushVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            ush ushVar4 = ushVar3;
            int iD = ushVar4.d(iB, rshVar, tshVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = ushVar2.b(ushVar4.l(iD));
            i3++;
            ushVar3 = ushVar4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return ushVar2.f(iB2, rshVar, false).c;
    }

    public static boolean z(v0a v0aVar) {
        return (v0aVar == null || v0aVar.o() || v0aVar.i() == Long.MIN_VALUE) ? false : true;
    }

    public final boolean A(int i, x4a x4aVar) {
        x0a x0aVar = this.s;
        v0a v0aVar = x0aVar.k;
        if (v0aVar != null && v0aVar.g.a.equals(x4aVar)) {
            rje rjeVar = this.a[i];
            v0a v0aVar2 = x0aVar.k;
            int i2 = rjeVar.d;
            boolean z = (i2 == 2 || i2 == 4) && rjeVar.d(v0aVar2) == rjeVar.a;
            boolean z2 = rjeVar.d == 3 && rjeVar.d(v0aVar2) == rjeVar.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.E;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        r2d r2dVar = this.I;
        if (r2dVar.l == z2 && r2dVar.n == i2 && r2dVar.m == i3) {
            return;
        }
        this.I = r2dVar.e(i3, i2, z2);
        D0(false, false);
        x0a x0aVar = this.s;
        for (v0a v0aVarH = x0aVar.i; v0aVarH != null; v0aVarH = v0aVarH.h()) {
            for (rg6 rg6Var : (rg6[]) v0aVarH.m().d) {
                if (rg6Var != null) {
                    rg6Var.o(z2);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            r2d r2dVar2 = this.I;
            if (r2dVar2.p) {
                this.I = r2dVar2.i(false);
            }
            long j = this.w1;
            v0a v0aVar = x0aVar.l;
            if (v0aVar != null) {
                v0aVar.s(j);
                return;
            }
            return;
        }
        int i4 = this.I.e;
        sfh sfhVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                sfhVar.i(2);
            }
        } else {
            bc5 bc5Var = this.o;
            bc5Var.f = true;
            bc5Var.a.b();
            t0();
            sfhVar.i(2);
        }
    }

    public final boolean B() {
        v0a v0aVar = this.s.i;
        long j = v0aVar.g.e;
        if (v0aVar.e) {
            return j == -9223372036854775807L || this.I.s < j || !r0();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    public final void B0() {
        s2d s2dVarC;
        long j;
        float f;
        v0a v0aVar = this.s.i;
        if (v0aVar == null) {
            return;
        }
        long jK = v0aVar.e ? v0aVar.a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!v0aVar.p()) {
                this.s.n(v0aVar);
                u(false);
                D();
            }
            R(jK, true);
            if (jK != this.I.s) {
                r2d r2dVar = this.I;
                this.I = y(r2dVar.b, jK, r2dVar.c, jK, true, 5);
            }
        } else {
            bc5 bc5Var = this.o;
            boolean z = v0aVar != this.s.j;
            tgg tggVar = bc5Var.a;
            ks0 ks0Var = bc5Var.c;
            if (ks0Var == null || ks0Var.j() || ((z && bc5Var.c.h != 2) || (!bc5Var.c.l() && (z || bc5Var.c.i())))) {
                bc5Var.e = true;
                if (bc5Var.f) {
                    tggVar.b();
                }
            } else {
                it9 it9Var = bc5Var.d;
                it9Var.getClass();
                long jA = it9Var.A();
                if (!bc5Var.e) {
                    tggVar.a(jA);
                    s2dVarC = it9Var.c();
                    if (!s2dVarC.equals(tggVar.e)) {
                        tggVar.x(s2dVarC);
                        bc5Var.b.h.c(16, s2dVarC).b();
                    }
                } else if (jA >= tggVar.A()) {
                    bc5Var.e = false;
                    if (bc5Var.f) {
                        tggVar.b();
                    }
                    tggVar.a(jA);
                    s2dVarC = it9Var.c();
                    if (!s2dVarC.equals(tggVar.e)) {
                        tggVar.x(s2dVarC);
                        bc5Var.b.h.c(16, s2dVarC).b();
                    }
                } else if (tggVar.b) {
                    tggVar.a(tggVar.A());
                    tggVar.b = false;
                }
            }
            long jA2 = bc5Var.A();
            this.w1 = jA2;
            long jX = v0aVar.x(jA2);
            long j2 = this.I.s;
            if (!this.p.isEmpty() && !this.I.b.b()) {
                if (this.z1) {
                    this.z1 = false;
                }
                r2d r2dVar2 = this.I;
                r2dVar2.a.b(r2dVar2.b.a);
                int iMin = Math.min(this.y1, this.p.size());
                if (iMin > 0) {
                    qt4.A(this.p.get(iMin - 1));
                }
                if (iMin < this.p.size()) {
                    qt4.A(this.p.get(iMin));
                }
                this.y1 = iMin;
            }
            if (this.o.o()) {
                boolean z2 = !this.J.e;
                r2d r2dVar3 = this.I;
                this.I = y(r2dVar3.b, jX, r2dVar3.c, jX, z2, 6);
            } else {
                r2d r2dVar4 = this.I;
                r2dVar4.s = jX;
                r2dVar4.t = SystemClock.elapsedRealtime();
            }
        }
        this.I.q = this.s.l.g();
        r2d r2dVar5 = this.I;
        r2dVar5.r = o(r2dVar5.q);
        r2d r2dVar6 = this.I;
        if (r2dVar6.l && r2dVar6.e == 3 && s0(r2dVar6.a, r2dVar6.b)) {
            r2d r2dVar7 = this.I;
            float f2 = 1.0f;
            if (r2dVar7.o.a == 1.0f) {
                vb5 vb5Var = this.u;
                long jL = l(r2dVar7.a, r2dVar7.b.a, r2dVar7.s);
                long j3 = this.I.r;
                if (vb5Var.c != -9223372036854775807L) {
                    long j4 = jL - j3;
                    long j5 = vb5Var.m;
                    if (j5 == -9223372036854775807L) {
                        vb5Var.m = j4;
                        vb5Var.n = 0L;
                    } else {
                        long jMax = Math.max(j4, (long) ((j4 * 9.999871E-4f) + (j5 * 0.999f)));
                        vb5Var.m = jMax;
                        vb5Var.n = (long) ((9.999871E-4f * Math.abs(j4 - jMax)) + (vb5Var.n * 0.999f));
                    }
                    if (vb5Var.l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - vb5Var.l < 1000) {
                            f2 = vb5Var.k;
                        }
                    } else {
                        j = 1000;
                    }
                    vb5Var.l = SystemClock.elapsedRealtime();
                    long j6 = (vb5Var.n * 3) + vb5Var.m;
                    if (vb5Var.h > j6) {
                        float fX = vqi.X(j);
                        f = 1.0E-7f;
                        vb5Var.h = gpk.d(j6, vb5Var.e, vb5Var.h - (((long) ((vb5Var.k - 1.0f) * fX)) + ((long) ((vb5Var.i - 1.0f) * fX))));
                    } else {
                        f = 1.0E-7f;
                        long jK2 = vqi.k(jL - ((long) (Math.max(0.0f, vb5Var.k - 1.0f) / 1.0E-7f)), vb5Var.h, j6);
                        vb5Var.h = jK2;
                        long j7 = vb5Var.g;
                        if (j7 != -9223372036854775807L && jK2 > j7) {
                            vb5Var.h = j7;
                        }
                    }
                    long j8 = jL - vb5Var.h;
                    if (Math.abs(j8) < vb5Var.a) {
                        vb5Var.k = 1.0f;
                    } else {
                        vb5Var.k = vqi.i((f * j8) + 1.0f, vb5Var.j, vb5Var.i);
                    }
                    f2 = vb5Var.k;
                }
                if (this.o.c().a != f2) {
                    s2d s2dVar = new s2d(f2, this.I.o.b);
                    this.h.h(16);
                    this.o.x(s2dVar);
                    x(this.I.o, this.o.c().a, false, false);
                }
            }
        }
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        this.h.c(8, u0aVar).b();
    }

    public final void C0(ush ushVar, x4a x4aVar, ush ushVar2, x4a x4aVar2, long j, boolean z) {
        boolean zS0 = s0(ushVar, x4aVar);
        Object obj = x4aVar.a;
        if (!zS0) {
            s2d s2dVar = x4aVar.b() ? s2d.d : this.I.o;
            bc5 bc5Var = this.o;
            if (bc5Var.c().equals(s2dVar)) {
                return;
            }
            this.h.h(16);
            bc5Var.x(s2dVar);
            x(this.I.o, s2dVar.a, false, false);
            return;
        }
        rsh rshVar = this.l;
        int i = ushVar.g(obj, rshVar).c;
        tsh tshVar = this.k;
        ushVar.n(i, tshVar);
        iy9 iy9Var = tshVar.i;
        vb5 vb5Var = this.u;
        vb5Var.getClass();
        vb5Var.c = vqi.X(iy9Var.a);
        vb5Var.f = vqi.X(iy9Var.b);
        vb5Var.g = vqi.X(iy9Var.c);
        float f = iy9Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        vb5Var.j = f;
        float f2 = iy9Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        vb5Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            vb5Var.c = -9223372036854775807L;
        }
        vb5Var.a();
        if (j != -9223372036854775807L) {
            vb5Var.d = l(ushVar, obj, j);
            vb5Var.a();
            return;
        }
        if (!Objects.equals(!ushVar2.p() ? ushVar2.m(ushVar2.g(x4aVar2.a, rshVar).c, tshVar, 0L).a : null, tshVar.a) || z) {
            vb5Var.d = -9223372036854775807L;
            vb5Var.a();
        }
    }

    public final void D() {
        boolean zK = false;
        if (z(this.s.l)) {
            v0a v0aVar = this.s.l;
            long jO = o(v0aVar.i());
            v0a v0aVar2 = this.s.i;
            long j = this.w1;
            long jX = v0aVar == v0aVar2 ? v0aVar.x(j) : v0aVar.x(j) - v0aVar.g.b;
            long j2 = s0(this.I.a, v0aVar.g.a) ? this.u.h : -9223372036854775807L;
            z3d z3dVar = this.w;
            ush ushVar = this.I.a;
            x4a x4aVar = v0aVar.g.a;
            float f = this.o.c().a;
            boolean z = this.I.l;
            r99 r99Var = new r99(z3dVar, ushVar, x4aVar, jX, jO, f, this.Z, j2);
            boolean zK2 = this.f.k(r99Var);
            v0a v0aVar3 = this.s.i;
            if (zK2 || !v0aVar3.e || jO >= 500000 || (this.m <= 0 && !this.n)) {
                zK = zK2;
            } else {
                v0aVar3.a.w(this.I.s, false);
                zK = this.f.k(r99Var);
            }
        }
        this.o1 = zK;
        if (zK) {
            v0a v0aVar4 = this.s.l;
            v0aVar4.getClass();
            ea9 ea9Var = new ea9();
            ea9Var.c(v0aVar4.x(this.w1));
            ea9Var.d(this.o.c().a);
            ea9Var.b(this.n1);
            v0aVar4.d(ea9Var.a());
        }
        w0();
    }

    public final void D0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.Z = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            ((nfh) this.q).getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.n1 = jElapsedRealtime;
    }

    public final void E() {
        x0a x0aVar = this.s;
        x0aVar.l();
        v0a v0aVar = x0aVar.m;
        if (v0aVar != null) {
            u0a u0aVar = v0aVar.a;
            if ((!v0aVar.d || v0aVar.e) && !u0aVar.i()) {
                ush ushVar = this.I.a;
                if (v0aVar.e) {
                    u0aVar.v();
                }
                if (this.f.g()) {
                    if (!v0aVar.d) {
                        v0aVar.r(this, v0aVar.g.b);
                        return;
                    }
                    ea9 ea9Var = new ea9();
                    ea9Var.c(v0aVar.x(this.w1));
                    ea9Var.d(this.o.c().a);
                    ea9Var.b(this.n1);
                    v0aVar.d(ea9Var.a());
                }
            }
        }
    }

    public final void F() {
        hg6 hg6Var = this.J;
        r2d r2dVar = this.I;
        boolean z = hg6Var.d | (((r2d) hg6Var.f) != r2dVar);
        hg6Var.d = z;
        hg6Var.f = r2dVar;
        if (z) {
            bg6 bg6Var = this.r.a;
            bg6Var.k.f(new gf5(bg6Var, 24, hg6Var));
            this.J = new hg6(this.I);
        }
    }

    public final void G(int i) {
        rje rjeVar = this.a[i];
        try {
            v0a v0aVar = this.s.i;
            v0aVar.getClass();
            ks0 ks0VarD = rjeVar.d(v0aVar);
            ks0VarD.getClass();
            xye xyeVar = ks0VarD.i;
            xyeVar.getClass();
            xyeVar.b();
        } catch (IOException | RuntimeException e) {
            int i2 = rjeVar.a.b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            vyh vyhVarM = this.s.i.m();
            lvb.l0("ExoPlayerImplInternal", "Disabling track due to error: ".concat(b87.e(((rg6[]) vyhVarM.d)[i].s())), e);
            vyh vyhVar = new vyh((mje[]) ((mje[]) vyhVarM.c).clone(), (rg6[]) ((rg6[]) vyhVarM.d).clone(), (fzh) vyhVarM.e, vyhVarM.f);
            ((mje[]) vyhVar.c)[i] = null;
            ((rg6[]) vyhVar.d)[i] = null;
            h(i);
            this.s.i.a(vyhVar, this.I.s);
        }
    }

    public final void H(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.y.f(new Runnable() { // from class: cg6
                @Override // java.lang.Runnable
                public final void run() {
                    kg6 kg6Var = this.a;
                    r75 r75Var = kg6Var.x;
                    rje[] rjeVarArr = kg6Var.a;
                    final int i2 = i;
                    final int i3 = rjeVarArr[i2].a.b;
                    final wf wfVarX = r75Var.x();
                    final boolean z2 = z;
                    r75Var.y(wfVarX, 1033, new r89() { // from class: d75
                        @Override // defpackage.r89
                        public final void invoke(Object obj) {
                            ((xf) obj).B0(wfVarX, i2, i3, z2);
                        }
                    });
                }
            });
        }
    }

    public final void I() throws Throwable {
        v(this.t.c(), true);
    }

    public final void J(gg6 gg6Var) throws Throwable {
        ush ushVarC;
        this.J.c(1);
        int i = gg6Var.a;
        int i2 = gg6Var.b;
        int i3 = gg6Var.c;
        e4g e4gVar = gg6Var.d;
        n5a n5aVar = this.t;
        ArrayList arrayList = (ArrayList) n5aVar.c;
        lvb.R(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        n5aVar.k = e4gVar;
        if (i == i2 || i == i3) {
            ushVarC = n5aVar.c();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((m5a) arrayList.get(iMin)).d;
            vqi.W(arrayList, i, i2, i3);
            while (iMin <= iMax) {
                m5a m5aVar = (m5a) arrayList.get(iMin);
                m5aVar.d = iO;
                iO += m5aVar.a.G().o();
                iMin++;
            }
            ushVarC = n5aVar.c();
        }
        v(ushVarC, false);
    }

    public final void K() {
        this.J.c(1);
        P(false, false, false, true);
        this.f.j(this.w);
        n0(this.I.a.p() ? 4 : 2);
        r2d r2dVar = this.I;
        boolean z = r2dVar.l;
        A0(this.A.c(r2dVar.e, z), r2dVar.n, r2dVar.m, z);
        v1i v1iVarE = this.g.e();
        n5a n5aVar = this.t;
        ArrayList arrayList = (ArrayList) n5aVar.c;
        lvb.b0(!n5aVar.a);
        n5aVar.l = v1iVarE;
        for (int i = 0; i < arrayList.size(); i++) {
            m5a m5aVar = (m5a) arrayList.get(i);
            n5aVar.g(m5aVar);
            ((HashSet) n5aVar.h).add(m5aVar);
        }
        n5aVar.a = true;
        this.h.i(2);
    }

    public final void L(r94 r94Var) {
        ga4 ga4Var = this.i;
        sfh sfhVar = this.h;
        try {
            P(true, false, true, false);
            M();
            this.f.h(this.w);
            p80 p80Var = this.A;
            p80Var.c = null;
            p80Var.a();
            p80Var.b(0);
            this.d.a();
            n0(1);
        } finally {
            sfhVar.g();
            ga4Var.a();
            r94Var.f();
        }
    }

    public final void M() {
        for (int i = 0; i < this.a.length; i++) {
            ks0 ks0Var = this.b[i];
            synchronized (ks0Var.a) {
                ks0Var.r = null;
            }
            rje rjeVar = this.a[i];
            ks0 ks0Var2 = rjeVar.a;
            lvb.b0(ks0Var2.h == 0);
            ks0Var2.q();
            rjeVar.e = false;
            ks0 ks0Var3 = rjeVar.c;
            if (ks0Var3 != null) {
                lvb.b0(ks0Var3.h == 0);
                ks0Var3.q();
                rjeVar.f = false;
            }
        }
    }

    public final void N(int i, int i2, e4g e4gVar) throws Throwable {
        this.J.c(1);
        n5a n5aVar = this.t;
        n5aVar.getClass();
        lvb.R(i >= 0 && i <= i2 && i2 <= ((ArrayList) n5aVar.c).size());
        n5aVar.k = e4gVar;
        n5aVar.i(i, i2);
        v(n5aVar.c(), false);
    }

    public final void O() {
        int i;
        float f = this.o.c().a;
        x0a x0aVar = this.s;
        v0a v0aVarH = x0aVar.i;
        v0a v0aVar = x0aVar.j;
        vyh vyhVar = null;
        boolean z = true;
        while (v0aVarH != null && v0aVarH.e) {
            r2d r2dVar = this.I;
            vyh vyhVarU = v0aVarH.u(f, r2dVar.a, r2dVar.l);
            vyh vyhVar2 = v0aVarH == this.s.i ? vyhVarU : vyhVar;
            vyh vyhVarM = v0aVarH.m();
            rg6[] rg6VarArr = (rg6[]) vyhVarU.d;
            boolean z2 = false;
            if (vyhVarM != null && ((rg6[]) vyhVarM.d).length == rg6VarArr.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= rg6VarArr.length) {
                        if (v0aVarH == v0aVar) {
                            z = false;
                        }
                        v0aVarH = v0aVarH.h();
                        vyhVar = vyhVar2;
                    } else if (vyhVarU.B(vyhVarM, i2)) {
                        i2++;
                    }
                }
            }
            x0a x0aVar2 = this.s;
            if (z) {
                v0a v0aVar2 = x0aVar2.i;
                boolean z3 = (x0aVar2.n(v0aVar2) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                vyhVar2.getClass();
                long jB = v0aVar2.b(vyhVar2, this.I.s, z3, zArr);
                r2d r2dVar2 = this.I;
                if (r2dVar2.e != 4 && jB != r2dVar2.s) {
                    z2 = true;
                }
                r2d r2dVar3 = this.I;
                i = 4;
                this.I = y(r2dVar3.b, jB, r2dVar3.c, r2dVar3.d, z2, 5);
                if (z2) {
                    R(jB, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i3 = 0;
                while (true) {
                    rje[] rjeVarArr = this.a;
                    if (i3 >= rjeVarArr.length) {
                        break;
                    }
                    int iC = rjeVarArr[i3].c();
                    zArr2[i3] = this.a[i3].g();
                    rje rjeVar = this.a[i3];
                    xye xyeVar = v0aVar2.c[i3];
                    bc5 bc5Var = this.o;
                    long j = this.w1;
                    boolean z4 = zArr[i3];
                    ks0 ks0Var = rjeVar.a;
                    if (rje.h(ks0Var)) {
                        if (xyeVar != ks0Var.i) {
                            rjeVar.a(ks0Var, bc5Var);
                        } else if (z4) {
                            ks0Var.B(j, false, true);
                        }
                    }
                    ks0 ks0Var2 = rjeVar.c;
                    if (ks0Var2 != null && rje.h(ks0Var2)) {
                        if (xyeVar != ks0Var2.i) {
                            rjeVar.a(ks0Var2, bc5Var);
                        } else if (z4) {
                            ks0Var2.B(j, false, true);
                        }
                    }
                    if (iC - this.a[i3].c() > 0) {
                        H(i3, false);
                    }
                    this.u1 -= iC - this.a[i3].c();
                    i3++;
                }
                k(zArr2, this.w1);
                v0aVar2.h = true;
            } else {
                i = 4;
                x0aVar2.n(v0aVarH);
                if (v0aVarH.e) {
                    long jMax = Math.max(v0aVarH.g.b, v0aVarH.x(this.w1));
                    if (this.z && e() && this.s.k == v0aVarH) {
                        g();
                    }
                    v0aVarH.a(vyhVarU, jMax);
                }
            }
            u(true);
            if (this.I.e != i) {
                D();
                B0();
                this.h.i(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114 A[PHI: r0
  0x0114: PHI (r0v17 ush) = (r0v16 ush), (r0v16 ush), (r0v32 ush), (r0v32 ush) binds: [B:45:0x00d9, B:47:0x00dd, B:49:0x00ee, B:51:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    public final void P(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        ush ushVar;
        x4a x4aVar;
        List list;
        this.h.h(2);
        this.F = false;
        if (this.G != null) {
            this.J.c(1);
            this.G = null;
        }
        this.A1 = null;
        D0(false, true);
        bc5 bc5Var = this.o;
        bc5Var.f = false;
        tgg tggVar = bc5Var.a;
        if (tggVar.b) {
            tggVar.a(tggVar.A());
            tggVar.b = false;
        }
        this.w1 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (ExoPlaybackException e) {
                e = e;
                lvb.l0("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                lvb.l0("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.D1 = -9223372036854775807L;
        if (z) {
            for (rje rjeVar : this.a) {
                try {
                    rjeVar.k();
                } catch (RuntimeException e3) {
                    lvb.l0("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.u1 = 0;
        r2d r2dVar = this.I;
        x4a x4aVar2 = r2dVar.b;
        long j4 = r2dVar.s;
        if (this.I.b.b()) {
            j = this.I.c;
        } else {
            r2d r2dVar2 = this.I;
            rsh rshVar = this.l;
            x4a x4aVar3 = r2dVar2.b;
            ush ushVar2 = r2dVar2.a;
            if (ushVar2.p() || ushVar2.g(x4aVar3.a, rshVar).f) {
                j = this.I.c;
            } else {
                j = this.I.s;
            }
        }
        if (z2) {
            this.v1 = null;
            Pair pairN = n(this.I.a);
            x4aVar2 = (x4a) pairN.first;
            long jLongValue = ((Long) pairN.second).longValue();
            z5 = x4aVar2.equals(this.I.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.s.b();
        this.o1 = false;
        ush ushVarZ = this.I.a;
        if (z3 && (ushVarZ instanceof r4d)) {
            ushVarZ = ((r4d) ushVarZ).z((e4g) this.t.k);
            if (x4aVar2.b != -1) {
                ushVarZ.g(x4aVar2.a, this.l);
                int i2 = this.l.c;
                tsh tshVar = this.k;
                ushVarZ.m(i2, tshVar, 0L);
                if (tshVar.a()) {
                    ushVar = ushVarZ;
                    x4aVar = new x4a(x4aVar2.d, x4aVar2.a);
                } else {
                    ushVar = ushVarZ;
                    x4aVar = x4aVar2;
                }
            } else {
                ushVar = ushVarZ;
                x4aVar = x4aVar2;
            }
        } else {
            ushVar = ushVarZ;
            x4aVar = x4aVar2;
        }
        r2d r2dVar3 = this.I;
        int i3 = r2dVar3.e;
        ExoPlaybackException exoPlaybackException = z4 ? null : r2dVar3.f;
        iyh iyhVar = z5 ? iyh.d : r2dVar3.h;
        vyh vyhVar = z5 ? this.e : r2dVar3.i;
        if (z5) {
            a98 a98Var = c98.b;
            list = ghe.e;
        } else {
            list = r2dVar3.j;
        }
        this.I = new r2d(ushVar, x4aVar, j3, j2, i3, exoPlaybackException, false, iyhVar, vyhVar, list, x4aVar, r2dVar3.l, r2dVar3.m, r2dVar3.n, r2dVar3.o, j2, 0L, j2, 0L, false);
        if (z3) {
            x0a x0aVar = this.s;
            if (!x0aVar.q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < x0aVar.q.size(); i4++) {
                    ((v0a) x0aVar.q.get(i4)).t();
                }
                x0aVar.q = arrayList;
                x0aVar.m = null;
                x0aVar.l();
            }
            n5a n5aVar = this.t;
            HashMap map = (HashMap) n5aVar.f;
            for (l5a l5aVar : map.values()) {
                try {
                    l5aVar.a.r(l5aVar.b);
                } catch (RuntimeException e4) {
                    lvb.l0("MediaSourceList", "Failed to release child source.", e4);
                }
                ur0 ur0Var = l5aVar.a;
                k5a k5aVar = l5aVar.c;
                ur0Var.u(k5aVar);
                l5aVar.a.t(k5aVar);
            }
            map.clear();
            ((HashSet) n5aVar.h).clear();
            n5aVar.a = false;
        }
    }

    public final void Q() {
        v0a v0aVar = this.s.i;
        this.Y = v0aVar != null && v0aVar.g.i && this.X;
    }

    public final void R(long j, boolean z) {
        v0a v0aVar = this.s.i;
        long jY = v0aVar == null ? j + 1000000000000L : v0aVar.y(j);
        this.w1 = jY;
        this.o.a.a(jY);
        for (rje rjeVar : this.a) {
            long j2 = this.w1;
            ks0 ks0VarD = rjeVar.d(v0aVar);
            if (ks0VarD != null) {
                ks0VarD.B(j2, false, z);
            }
        }
        for (v0a v0aVarH = r0.i; v0aVarH != null; v0aVarH = v0aVarH.h()) {
            for (rg6 rg6Var : (rg6[]) v0aVarH.m().d) {
                if (rg6Var != null) {
                    rg6Var.j();
                }
            }
        }
    }

    public final void S(ush ushVar, ush ushVar2) {
        if (ushVar.p() && ushVar2.p()) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            qt4.A(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j) {
        boolean z;
        if (this.E) {
            this.D.getClass();
            z = true;
        } else {
            z = false;
        }
        r2d r2dVar = this.I;
        long jMin = 1000;
        long j2 = G1;
        if (z) {
            jMin = r2dVar.e != 3 ? j2 : 1000L;
            for (rje rjeVar : this.a) {
                long j3 = this.w1;
                long j4 = this.x1;
                ks0 ks0Var = rjeVar.c;
                ks0 ks0Var2 = rjeVar.a;
                long jF = rje.h(ks0Var2) ? ks0Var2.f(j3, j4) : BuildConfig.MAX_TIME_TO_UPLOAD;
                if (ks0Var != null && ks0Var.h != 0) {
                    jF = Math.min(jF, ks0Var.f(j3, j4));
                }
                jMin = Math.min(jMin, vqi.p0(jF));
            }
            if (this.I.m()) {
                v0a v0aVar = this.s.i;
                v0a v0aVarH = v0aVar != null ? v0aVar.h() : null;
                if (v0aVarH != null) {
                    if ((vqi.X(jMin) * this.I.o.a) + this.w1 >= v0aVarH.k()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (r2dVar.e != 3 || r0()) {
            jMin = j2;
        }
        this.h.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void W(boolean z) {
        x4a x4aVar = this.s.i.g.a;
        long jY = Y(x4aVar, this.I.s, true, false);
        if (jY != this.I.s) {
            r2d r2dVar = this.I;
            this.I = y(x4aVar, jY, r2dVar.c, r2dVar.d, z, 5);
        }
    }

    public final void X(jg6 jg6Var) throws Throwable {
        long jLongValue;
        x4a x4aVarP;
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long jC;
        long j5;
        r2d r2dVar;
        int i;
        long j6;
        x4a x4aVar;
        int i2;
        long j7;
        kg6 kg6Var = this;
        if (kg6Var.F) {
            if (kg6Var.G != null) {
                kg6Var.H++;
                kg6Var.J.c(1);
            }
            kg6Var.G = jg6Var;
            return;
        }
        kg6Var.J.c(1);
        Pair pairT = T(kg6Var.I.a, jg6Var, true, kg6Var.p1, kg6Var.q1, kg6Var.k, kg6Var.l);
        if (pairT == null) {
            Pair pairN = kg6Var.n(kg6Var.I.a);
            x4aVarP = (x4a) pairN.first;
            jLongValue = ((Long) pairN.second).longValue();
            z = !kg6Var.I.a.p();
            j = -9223372036854775807L;
            j2 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = pairT.first;
            jLongValue = ((Long) pairT.second).longValue();
            long jMax = jg6Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            x4aVarP = kg6Var.s.p(kg6Var.I.a, obj, jLongValue);
            if (x4aVarP.b()) {
                kg6Var.I.a.g(x4aVarP.a, kg6Var.l);
                jLongValue = kg6Var.l.f(x4aVarP.b) == x4aVarP.c ? kg6Var.l.g.b : 0L;
                da daVarA = kg6Var.l.g.a(x4aVarP.b);
                j2 = 0;
                j = -9223372036854775807L;
                jMax = Math.max(jMax, daVarA.a + daVarA.j);
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                if (jg6Var.c != -9223372036854775807L) {
                    z = false;
                }
                j3 = jMax;
            }
            z = true;
            j3 = jMax;
        }
        try {
            try {
                if (!kg6Var.I.a.p()) {
                    r2d r2dVar2 = kg6Var.I;
                    if (pairT == null) {
                        if (r2dVar2.e != 1) {
                            kg6Var.n0(4);
                        }
                        kg6Var.P(false, true, false, true);
                    } else {
                        if (x4aVarP.equals(r2dVar2.b)) {
                            try {
                                v0a v0aVar = kg6Var.s.i;
                                if (v0aVar == null || !v0aVar.e || jLongValue == j2) {
                                    jC = jLongValue;
                                } else {
                                    u0a u0aVar = v0aVar.a;
                                    long j8 = kg6Var.k.l;
                                    if (kg6Var.E && j8 != j) {
                                        kg6Var.D.getClass();
                                    }
                                    jC = u0aVar.c(jLongValue, kg6Var.C);
                                }
                                j5 = j3;
                                try {
                                    if (vqi.p0(jC) == vqi.p0(kg6Var.I.s) && ((i = (r2dVar = kg6Var.I).e) == 2 || i == 3)) {
                                        j6 = r2dVar.s;
                                        z = z;
                                        x4aVar = x4aVarP;
                                        i2 = 2;
                                        j7 = j6;
                                        j3 = j5;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = z;
                                    x4aVarP = x4aVarP;
                                    z = z;
                                    j4 = jLongValue;
                                    j3 = j5;
                                    kg6Var.I = kg6Var.y(x4aVarP, j4, j3, j4, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                x4aVarP = x4aVarP;
                                j4 = jLongValue;
                                kg6Var.I = kg6Var.y(x4aVarP, j4, j3, j4, z, 2);
                                throw th;
                            }
                        } else {
                            j5 = j3;
                            jC = jLongValue;
                        }
                        try {
                            if (kg6Var.E) {
                                try {
                                    for (rje rjeVar : kg6Var.a) {
                                        if (rjeVar.g() && rjeVar.a.b == 2) {
                                            kg6Var.F = true;
                                            break;
                                        }
                                        kg6Var.I = kg6Var.y(x4aVarP, j4, j3, j4, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = z;
                                    j4 = jLongValue;
                                    j3 = j5;
                                }
                            }
                            boolean z2 = kg6Var.I.e == 4;
                            x0a x0aVar = kg6Var.s;
                            long jY = kg6Var.Y(x4aVarP, jC, x0aVar.i != x0aVar.j, z2);
                            z = (jLongValue != jY) | z;
                            try {
                                r2d r2dVar3 = kg6Var.I;
                                x4a x4aVar2 = x4aVarP;
                                try {
                                    ush ushVar = r2dVar3.a;
                                    long j9 = j5;
                                    try {
                                        kg6Var.C0(ushVar, x4aVar2, ushVar, r2dVar3.b, j9, true);
                                        x4aVar = x4aVar2;
                                        j3 = j9;
                                        j6 = jY;
                                        i2 = 2;
                                        j7 = j6;
                                        kg6Var = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        x4aVarP = x4aVar2;
                                        j3 = j9;
                                        j4 = jY;
                                        kg6Var.I = kg6Var.y(x4aVarP, j4, j3, j4, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    x4aVarP = x4aVar2;
                                    j3 = j5;
                                    j4 = jY;
                                    kg6Var.I = kg6Var.y(x4aVarP, j4, j3, j4, z, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j3 = j5;
                            j4 = jLongValue;
                        }
                    }
                    kg6Var.I = kg6Var.y(x4aVar, j6, j3, j7, z, i2);
                }
                kg6Var.v1 = jg6Var;
                z = z;
                x4aVar = x4aVarP;
                j6 = jLongValue;
                i2 = 2;
                j7 = j6;
                kg6Var = this;
                kg6Var.I = kg6Var.y(x4aVar, j6, j3, j7, z, i2);
            } catch (Throwable th8) {
                th = th8;
                x4aVarP = x4aVarP;
                j4 = jLongValue;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    public final long Y(x4a x4aVar, long j, boolean z, boolean z2) {
        x0a x0aVar;
        v0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.I.e == 3) {
            n0(2);
        }
        v0a v0aVar = this.s.i;
        v0a v0aVarH = v0aVar;
        while (v0aVarH != null && !x4aVar.equals(v0aVarH.g.a)) {
            v0aVarH = v0aVarH.h();
        }
        if (z || v0aVar != v0aVarH || (v0aVarH != null && v0aVarH.y(j) < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.D1 = -9223372036854775807L;
            if (v0aVarH != null) {
                while (true) {
                    x0aVar = this.s;
                    if (x0aVar.i == v0aVarH) {
                        break;
                    }
                    x0aVar.a();
                }
                x0aVar.n(v0aVarH);
                v0aVarH.w(1000000000000L);
                k(new boolean[this.a.length], this.s.j.k());
                v0aVarH.h = true;
            }
        }
        g();
        x0a x0aVar2 = this.s;
        if (v0aVarH != null) {
            x0aVar2.n(v0aVarH);
            if (!v0aVarH.e) {
                v0aVarH.g = v0aVarH.g.b(j);
            } else if (v0aVarH.f) {
                if (this.E) {
                    this.D.getClass();
                    if (this.I.a.p() || !v0aVarH.g.a.equals(this.I.b)) {
                        j = v0aVarH.a.g(j);
                        v0aVarH.a.w(j - this.m, this.n);
                    } else {
                        long jY = v0aVarH.y(j);
                        boolean z4 = true;
                        for (rje rjeVar : this.a) {
                            if (rjeVar.g()) {
                                ks0 ks0VarD = rjeVar.d(v0aVarH);
                                z4 &= ks0VarD != null && ks0VarD.F(jY);
                            }
                        }
                        if (z4) {
                            u0a u0aVar = v0aVarH.a;
                            long j2 = this.I.s;
                            ybf ybfVar = ybf.c;
                            if (u0aVar.c(j2, ybfVar) == v0aVarH.a.c(j, ybfVar)) {
                                z3 = false;
                            } else {
                                j = v0aVarH.a.g(j);
                                v0aVarH.a.w(j - this.m, this.n);
                            }
                        } else {
                            j = v0aVarH.a.g(j);
                            v0aVarH.a.w(j - this.m, this.n);
                        }
                    }
                } else {
                    j = v0aVarH.a.g(j);
                    v0aVarH.a.w(j - this.m, this.n);
                }
            }
            R(j, z3);
            D();
        } else {
            x0aVar2.b();
            R(j, true);
        }
        u(false);
        this.h.i(2);
        return j;
    }

    public final void Z(f4d f4dVar) {
        f4dVar.getClass();
        sfh sfhVar = this.h;
        if (f4dVar.e != this.j) {
            sfhVar.c(15, f4dVar).b();
            return;
        }
        synchronized (f4dVar) {
        }
        try {
            f4dVar.a.a(f4dVar.c, f4dVar.d);
            f4dVar.a(true);
            int i = this.I.e;
            if (i == 3 || i == 2) {
                sfhVar.i(2);
            }
        } catch (Throwable th) {
            f4dVar.a(true);
            throw th;
        }
    }

    @Override // defpackage.tyh
    public final void a() {
        this.h.i(10);
    }

    public final void a0(f4d f4dVar) {
        Looper looper = f4dVar.e;
        if (looper.getThread().isAlive()) {
            ((nfh) this.q).a(looper, null).f(new k36(this, f4dVar));
        } else {
            lvb.G0("TAG", "Trying to send message on a dead thread.");
            f4dVar.a(false);
        }
    }

    @Override // defpackage.mwi
    public final void b(long j, long j2, b87 b87Var, MediaFormat mediaFormat) {
        if (this.F) {
            this.h.a(37).b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void b0(p70 p70Var, boolean z) {
        int i;
        ve5 ve5Var = (ve5) this.d;
        if (!ve5Var.i.equals(p70Var)) {
            ve5Var.i = p70Var;
            ve5Var.h();
        }
        if (!z) {
            p70Var = null;
        }
        p80 p80Var = this.A;
        if (!Objects.equals(p80Var.d, p70Var)) {
            p80Var.d = p70Var;
            if (p70Var != null) {
                int i2 = p70Var.c;
                i = 3;
                switch (i2) {
                    case 0:
                        lvb.G0("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (p70Var.a == 1) {
                            i = 2;
                        }
                        break;
                    case 15:
                    default:
                        qt4.y(i2, "Unidentified audio usage: ", "AudioFocusManager");
                        i = 0;
                        break;
                    case 16:
                        i = 4;
                        break;
                }
            } else {
                i = 0;
            }
            p80Var.f = i;
            lvb.O("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        r2d r2dVar = this.I;
        boolean z2 = r2dVar.l;
        A0(p80Var.c(r2dVar.e, z2), r2dVar.n, r2dVar.m, z2);
    }

    public final void c(fg6 fg6Var, int i) throws Throwable {
        this.J.c(1);
        n5a n5aVar = this.t;
        if (i == -1) {
            i = ((ArrayList) n5aVar.c).size();
        }
        v(n5aVar.a(i, fg6Var.a, fg6Var.b), false);
    }

    public final void c0(boolean z, r94 r94Var) {
        if (this.r1 != z) {
            this.r1 = z;
            if (!z) {
                for (rje rjeVar : this.a) {
                    rjeVar.k();
                }
            }
        }
        if (r94Var != null) {
            r94Var.f();
        }
    }

    public final void d() {
        for (rje rjeVar : this.a) {
            s6f s6fVar = this.E ? this.D : null;
            rjeVar.a.a(18, s6fVar);
            ks0 ks0Var = rjeVar.c;
            if (ks0Var != null) {
                ks0Var.a(18, s6fVar);
            }
        }
    }

    public final void d0(fg6 fg6Var) throws Throwable {
        this.J.c(1);
        if (fg6Var.c != -1) {
            this.v1 = new jg6(new r4d(fg6Var.a, fg6Var.b), fg6Var.c, fg6Var.d);
        }
        List list = fg6Var.a;
        e4g e4gVar = fg6Var.b;
        n5a n5aVar = this.t;
        ArrayList arrayList = (ArrayList) n5aVar.c;
        n5aVar.i(0, arrayList.size());
        v(n5aVar.a(arrayList.size(), list, e4gVar), false);
    }

    public final boolean e() {
        if (!this.z) {
            return false;
        }
        for (rje rjeVar : this.a) {
            if (rjeVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z) {
        this.X = z;
        Q();
        if (this.Y) {
            x0a x0aVar = this.s;
            if (x0aVar.j != x0aVar.i) {
                W(true);
                u(false);
            }
        }
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(s2d s2dVar) {
        this.h.h(16);
        bc5 bc5Var = this.o;
        bc5Var.x(s2dVar);
        s2d s2dVarC = bc5Var.c();
        x(s2dVarC, s2dVarC.a, true, true);
    }

    public final void g() {
        ks0 ks0Var;
        if (this.z && e()) {
            for (rje rjeVar : this.a) {
                int iC = rjeVar.c();
                if (rjeVar.f()) {
                    int i = rjeVar.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        ks0Var = rjeVar.a;
                    } else {
                        ks0Var = rjeVar.c;
                        ks0Var.getClass();
                    }
                    rjeVar.a(ks0Var, this.o);
                    rjeVar.i(z);
                    rjeVar.d = i2;
                }
                this.u1 -= iC - rjeVar.c();
            }
            this.D1 = -9223372036854775807L;
        }
    }

    public final void g0(jf6 jf6Var) {
        this.C1 = jf6Var;
        ush ushVar = this.I.a;
        x0a x0aVar = this.s;
        x0aVar.getClass();
        jf6Var.getClass();
        if (x0aVar.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < x0aVar.q.size(); i++) {
            ((v0a) x0aVar.q.get(i)).t();
        }
        x0aVar.q = arrayList;
        x0aVar.m = null;
        x0aVar.l();
    }

    public final void h(int i) {
        rje[] rjeVarArr = this.a;
        int iC = rjeVarArr[i].c();
        rje rjeVar = rjeVarArr[i];
        ks0 ks0Var = rjeVar.a;
        bc5 bc5Var = this.o;
        rjeVar.a(ks0Var, bc5Var);
        ks0 ks0Var2 = rjeVar.c;
        if (ks0Var2 != null) {
            boolean z = (ks0Var2.h == 0 || rjeVar.d == 3) ? false : true;
            rjeVar.a(ks0Var2, bc5Var);
            rjeVar.i(false);
            if (z) {
                ks0 ks0Var3 = rjeVar.a;
                ks0Var2.getClass();
                ks0Var2.a(17, ks0Var3);
            }
        }
        rjeVar.d = 0;
        H(i, false);
        this.u1 -= iC;
    }

    public final void h0(int i) {
        this.p1 = i;
        ush ushVar = this.I.a;
        x0a x0aVar = this.s;
        x0aVar.g = i;
        int iR = x0aVar.r(ushVar);
        if ((iR & 1) != 0) {
            W(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        v0a v0aVar;
        x4a x4aVar;
        v0a v0aVar2;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.J.c(1);
                    A0(this.A.c(this.I.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    X((jg6) message.obj);
                    break;
                case 4:
                    f0((s2d) message.obj);
                    break;
                case 5:
                    k0((ybf) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    L((r94) message.obj);
                    return true;
                case 8:
                    w((u0a) message.obj);
                    break;
                case 9:
                    s((u0a) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    c0(message.arg1 != 0, (r94) message.obj);
                    break;
                case 14:
                    Z((f4d) message.obj);
                    break;
                case 15:
                    a0((f4d) message.obj);
                    break;
                case 16:
                    s2d s2dVar = (s2d) message.obj;
                    x(s2dVar, s2dVar.a, true, false);
                    break;
                case 17:
                    d0((fg6) message.obj);
                    break;
                case 18:
                    c((fg6) message.obj, message.arg1);
                    break;
                case 19:
                    J((gg6) message.obj);
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    N(message.arg1, message.arg2, (e4g) message.obj);
                    break;
                case 21:
                    m0((e4g) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    f();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((jf6) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (r94) pair.second);
                    break;
                case 31:
                    b0((p70) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case vg8.l /* 35 */:
                    o0((mwi) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    this.F = false;
                    jg6 jg6Var = this.G;
                    if (jg6Var != null) {
                        X(jg6Var);
                        this.G = null;
                    }
                    break;
                case 38:
                    j0((s6f) message.obj);
                    break;
            }
        } catch (ParserException e) {
            boolean z2 = e.a;
            int i5 = e.b;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(i3, e);
            }
            i3 = i2;
            t(i3, e);
        } catch (DataSourceException e2) {
            t(e2.a, e2);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i6 = e.j;
            x0a x0aVar = this.s;
            if (i6 == 1 && (v0aVar2 = x0aVar.j) != null && e.o == null) {
                e = e.c(v0aVar2.g.a);
            }
            int i7 = e.j;
            sfh sfhVar = this.h;
            if (i7 == 1 && (x4aVar = e.o) != null && A(e.l, x4aVar)) {
                this.E1 = true;
                g();
                v0a v0aVarH = x0aVar.h();
                v0a v0aVarH2 = x0aVar.i;
                if (v0aVarH2 != v0aVarH) {
                    while (v0aVarH2 != null && v0aVarH2.h() != v0aVarH) {
                        v0aVarH2 = v0aVarH2.h();
                    }
                }
                x0aVar.n(v0aVarH2);
                if (this.I.e != 4) {
                    D();
                    sfhVar.i(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.A1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.A1;
                }
                if (e.j == 1 && x0aVar.i != x0aVar.j) {
                    while (true) {
                        v0aVar = x0aVar.i;
                        if (v0aVar == x0aVar.j) {
                            break;
                        }
                        x0aVar.a();
                    }
                    lvb.V(v0aVar);
                    F();
                    w0a w0aVar = v0aVar.g;
                    x4a x4aVar2 = w0aVar.a;
                    long j = w0aVar.b;
                    this.I = y(x4aVar2, j, w0aVar.c, j, true, 0);
                }
                if (e.p && (this.A1 == null || (i = e.a) == 5004 || i == 5003)) {
                    lvb.H0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.A1 == null) {
                        this.A1 = e;
                    }
                    rfh rfhVarC = sfhVar.c(25, e);
                    Handler handler = sfhVar.a;
                    Message message2 = rfhVarC.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    rfhVarC.a();
                } else {
                    lvb.l0("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.I = this.I.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            t(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            t(1002, e5);
        } catch (IOException e6) {
            t(2000, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            lvb.l0("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            u0(true, false);
            this.I = this.I.f(exoPlaybackException2);
        }
        F();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x0216  */
    /* JADX WARN: Code duplicated, block: B:130:0x021c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0240  */
    /* JADX WARN: Code duplicated, block: B:149:0x025d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0263  */
    /* JADX WARN: Code duplicated, block: B:154:0x026b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:185:0x02db  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0271 A[EDGE_INSN: B:207:0x0271->B:156:0x0271 BREAK  A[LOOP:1: B:150:0x025e->B:155:0x026e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x021c, please report this as an issue */
    public final void i() {
        boolean z;
        boolean z2;
        boolean z3;
        v0a v0aVarH;
        vb5 vb5Var;
        long j;
        long j2;
        int i;
        boolean zL;
        boolean z4;
        r2d r2dVar;
        int i2;
        int i3;
        rje[] rjeVarArr;
        r2d r2dVar2;
        ((nfh) this.q).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.h.h(2);
        if (!this.B) {
            z0();
        }
        int i4 = this.I.e;
        if (i4 == 1 || i4 == 4) {
            return;
        }
        if (this.B) {
            z0();
        }
        v0a v0aVar = this.s.i;
        if (v0aVar == null) {
            V(jUptimeMillis);
            return;
        }
        iyl.b("doSomeWork");
        B0();
        if (v0aVar.e) {
            ((nfh) this.q).getClass();
            this.x1 = vqi.X(SystemClock.elapsedRealtime());
            v0aVar.a.w(this.I.s - this.m, this.n);
            z = true;
            z2 = true;
            int i5 = 0;
            while (true) {
                rje[] rjeVarArr2 = this.a;
                if (i5 >= rjeVarArr2.length) {
                    break;
                }
                rje rjeVar = rjeVarArr2[i5];
                if (rjeVar.c() == 0) {
                    H(i5, false);
                } else {
                    long j3 = this.w1;
                    long j4 = this.x1;
                    ks0 ks0Var = rjeVar.c;
                    ks0 ks0Var2 = rjeVar.a;
                    if (rje.h(ks0Var2)) {
                        ks0Var2.y(j3, j4);
                    }
                    if (ks0Var != null && ks0Var.h != 0) {
                        ks0Var.y(j3, j4);
                    }
                    if (z) {
                        ks0 ks0Var3 = rjeVar.c;
                        ks0 ks0Var4 = rjeVar.a;
                        boolean zJ = rje.h(ks0Var4) ? ks0Var4.j() : true;
                        if (ks0Var3 != null && ks0Var3.h != 0) {
                            zJ &= ks0Var3.j();
                        }
                        if (zJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    ks0 ks0VarD = rjeVar.d(v0aVar);
                    boolean z5 = ks0VarD == null || ks0VarD.i() || ks0VarD.l() || ks0VarD.j();
                    H(i5, z5);
                    z2 = z2 && z5;
                    if (!z5) {
                        G(i5);
                    }
                }
                i5++;
            }
        } else {
            v0aVar.a.n();
            z = true;
            z2 = true;
        }
        long j5 = v0aVar.g.e;
        boolean z6 = z && v0aVar.e && (j5 == -9223372036854775807L || j5 <= this.I.s);
        if (z6 && this.Y) {
            this.Y = false;
            int i6 = this.I.n;
            this.J.c(0);
            A0(this.A.c(this.I.e, false), i6, 5, false);
        }
        if (!z6 || !v0aVar.g.j) {
            r2d r2dVar3 = this.I;
            if (r2dVar3.e == 2) {
                x0a x0aVar = this.s;
                if (this.u1 == 0) {
                    zL = B();
                } else if (!z2) {
                    zL = false;
                } else if (r2dVar3.g) {
                    v0a v0aVar2 = x0aVar.i;
                    long j6 = s0(r2dVar3.a, v0aVar2.g.a) ? this.u.h : -9223372036854775807L;
                    v0a v0aVar3 = x0aVar.l;
                    boolean z7 = v0aVar3.p() && v0aVar3.g.j;
                    boolean z8 = v0aVar3.g.a.b() && !v0aVar3.e;
                    if (z7 || z8) {
                        zL = true;
                    } else {
                        long jO = o(v0aVar3.g());
                        s99 s99Var = this.f;
                        z3d z3dVar = this.w;
                        ush ushVar = this.I.a;
                        x4a x4aVar = v0aVar2.g.a;
                        long jX = v0aVar2.x(this.w1);
                        float f = this.o.c().a;
                        boolean z9 = this.I.l;
                        zL = s99Var.l(new r99(z3dVar, ushVar, x4aVar, jX, jO, f, this.Z, j6));
                    }
                } else {
                    zL = true;
                }
                if (zL) {
                    n0(3);
                    this.A1 = null;
                    if (r0()) {
                        D0(false, false);
                        bc5 bc5Var = this.o;
                        z3 = true;
                        bc5Var.f = true;
                        bc5Var.a.b();
                        t0();
                    }
                } else {
                    z3 = true;
                    if (this.I.e == 3 && (this.u1 != 0 ? !z2 : !B())) {
                        D0(r0(), false);
                        n0(2);
                        if (this.Z) {
                            for (v0aVarH = this.s.i; v0aVarH != null; v0aVarH = v0aVarH.h()) {
                                for (rg6 rg6Var : (rg6[]) v0aVarH.m().d) {
                                    if (rg6Var != null) {
                                        rg6Var.u();
                                    }
                                }
                            }
                            vb5Var = this.u;
                            j = vb5Var.h;
                            if (j != -9223372036854775807L) {
                                long j7 = j + vb5Var.b;
                                vb5Var.h = j7;
                                j2 = vb5Var.g;
                                if (j2 != -9223372036854775807L && j7 > j2) {
                                    vb5Var.h = j2;
                                }
                                vb5Var.l = -9223372036854775807L;
                            }
                        }
                        v0();
                    }
                }
            } else {
                z3 = true;
                if (this.I.e == 3) {
                    D0(r0(), false);
                    n0(2);
                    if (this.Z) {
                        while (v0aVarH != null) {
                            while (i < r9) {
                                if (rg6Var != null) {
                                    rg6Var.u();
                                }
                            }
                        }
                        vb5Var = this.u;
                        j = vb5Var.h;
                        if (j != -9223372036854775807L) {
                            long j8 = j + vb5Var.b;
                            vb5Var.h = j8;
                            j2 = vb5Var.g;
                            if (j2 != -9223372036854775807L) {
                                vb5Var.h = j2;
                            }
                            vb5Var.l = -9223372036854775807L;
                        }
                    }
                    v0();
                }
            }
            if (this.I.e == 2) {
                i3 = 0;
                while (true) {
                    rjeVarArr = this.a;
                    if (i3 < rjeVarArr.length) {
                        break;
                    }
                    if (rjeVarArr[i3].d(v0aVar) != null) {
                        G(i3);
                    }
                    i3++;
                }
                r2dVar2 = this.I;
                if (r2dVar2.g && r2dVar2.r < 500000 && z(this.s.l) && r0()) {
                    long j9 = this.B1;
                    qt3 qt3Var = this.q;
                    if (j9 == -9223372036854775807L) {
                        ((nfh) qt3Var).getClass();
                        this.B1 = SystemClock.elapsedRealtime();
                    } else {
                        ((nfh) qt3Var).getClass();
                        if (SystemClock.elapsedRealtime() - this.B1 >= 4000) {
                            throw new StuckPlayerException(0, y5g.CLOSE_SOCKET_CODE_TIMEOUT);
                        }
                    }
                } else {
                    this.B1 = -9223372036854775807L;
                }
            } else {
                this.B1 = -9223372036854775807L;
            }
            if (r0() || this.I.e != 3) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (this.t1 || !this.s1 || !z4) {
                z3 = false;
            }
            r2dVar = this.I;
            if (r2dVar.p != z3) {
                this.I = r2dVar.i(z3);
            }
            this.s1 = false;
            if (!z3 && (i2 = this.I.e) != 4 && (z4 || i2 == 2 || (i2 == 3 && this.u1 != 0))) {
                V(jUptimeMillis);
            }
            iyl.c();
        }
        n0(4);
        v0();
        z3 = true;
        if (this.I.e == 2) {
            i3 = 0;
            while (true) {
                rjeVarArr = this.a;
                if (i3 < rjeVarArr.length) {
                    break;
                    break;
                } else {
                    if (rjeVarArr[i3].d(v0aVar) != null) {
                        G(i3);
                    }
                    i3++;
                }
            }
            r2dVar2 = this.I;
            if (r2dVar2.g) {
                this.B1 = -9223372036854775807L;
            } else {
                this.B1 = -9223372036854775807L;
            }
        } else {
            this.B1 = -9223372036854775807L;
        }
        if (r0()) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (this.t1) {
            z3 = false;
        } else {
            z3 = false;
        }
        r2dVar = this.I;
        if (r2dVar.p != z3) {
            this.I = r2dVar.i(z3);
        }
        this.s1 = false;
        if (!z3) {
            V(jUptimeMillis);
        }
        iyl.c();
    }

    public final void i0(boolean z) throws Throwable {
        if (!z) {
            jg6 jg6Var = this.G;
            sfh sfhVar = this.h;
            if (jg6Var != null && this.F && !sfhVar.a.hasMessages(37)) {
                this.H++;
            }
            int i = this.H;
            if (i > 0) {
                this.y.f(new ai(this, i, 12));
            }
            this.H = 0;
            this.F = false;
            sfhVar.h(37);
            jg6 jg6Var2 = this.G;
            if (jg6Var2 != null) {
                X(jg6Var2);
                this.G = null;
                this.F = false;
            }
        }
        this.E = z;
        d();
    }

    public final void j(v0a v0aVar, int i, boolean z, long j) {
        rje rjeVar = this.a[i];
        boolean zG = rjeVar.g();
        ks0 ks0Var = rjeVar.a;
        if (zG) {
            return;
        }
        boolean z2 = v0aVar == this.s.i;
        vyh vyhVarM = v0aVar.m();
        mje mjeVar = ((mje[]) vyhVarM.c)[i];
        rg6 rg6Var = ((rg6[]) vyhVarM.d)[i];
        boolean z3 = r0() && this.I.e == 3;
        boolean z4 = !z && z3;
        this.u1++;
        xye xyeVar = v0aVar.c[i];
        long j2 = v0aVar.j();
        x4a x4aVar = v0aVar.g.a;
        ks0 ks0Var2 = rjeVar.c;
        int length = rg6Var != null ? rg6Var.length() : 0;
        b87[] b87VarArr = new b87[length];
        for (int i2 = 0; i2 < length; i2++) {
            rg6Var.getClass();
            b87VarArr[i2] = rg6Var.d(i2);
        }
        int i3 = rjeVar.d;
        bc5 bc5Var = this.o;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            rjeVar.e = true;
            lvb.b0(ks0Var.h == 0);
            ks0Var.d = mjeVar;
            ks0Var.q = x4aVar;
            ks0Var.h = 1;
            ks0Var.n(z4, z2);
            ks0Var.z(b87VarArr, xyeVar, j, j2, x4aVar);
            ks0Var.B(j, z4, true);
            bc5Var.a(ks0Var);
        } else {
            rjeVar.f = true;
            ks0Var2.getClass();
            lvb.b0(ks0Var2.h == 0);
            ks0Var2.d = mjeVar;
            ks0Var2.q = x4aVar;
            ks0Var2.h = 1;
            ks0Var2.n(z4, z2);
            ks0Var2.z(b87VarArr, xyeVar, j, j2, x4aVar);
            ks0Var2.B(j, z4, true);
            bc5Var.a(ks0Var2);
        }
        eg6 eg6Var = new eg6(this);
        ks0 ks0VarD = rjeVar.d(v0aVar);
        ks0VarD.getClass();
        ks0VarD.a(11, eg6Var);
        if (z3 && z2) {
            rjeVar.m();
        }
    }

    public final void j0(s6f s6fVar) {
        this.D = s6fVar;
        d();
    }

    public final void k(boolean[] zArr, long j) {
        rje[] rjeVarArr;
        kg6 kg6Var;
        long j2;
        v0a v0aVar = this.s.j;
        vyh vyhVarM = v0aVar.m();
        int i = 0;
        while (true) {
            rjeVarArr = this.a;
            if (i >= rjeVarArr.length) {
                break;
            }
            if (!vyhVarM.C(i)) {
                rjeVarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < rjeVarArr.length) {
            if (vyhVarM.C(i2) && rjeVarArr[i2].d(v0aVar) == null) {
                kg6Var = this;
                j2 = j;
                kg6Var.j(v0aVar, i2, zArr[i2], j2);
            } else {
                kg6Var = this;
                j2 = j;
            }
            i2++;
            this = kg6Var;
            j = j2;
        }
    }

    public final void k0(ybf ybfVar) {
        this.C = ybfVar;
    }

    public final long l(ush ushVar, Object obj, long j) {
        rsh rshVar = this.l;
        int i = ushVar.g(obj, rshVar).c;
        tsh tshVar = this.k;
        ushVar.n(i, tshVar);
        if (tshVar.e != -9223372036854775807L && tshVar.a() && tshVar.h) {
            return vqi.X(vqi.G(tshVar.f) - tshVar.e) - (j + rshVar.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(boolean z) {
        this.q1 = z;
        ush ushVar = this.I.a;
        x0a x0aVar = this.s;
        x0aVar.h = z;
        int iR = x0aVar.r(ushVar);
        if ((iR & 1) != 0) {
            W(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long m(v0a v0aVar) {
        if (v0aVar == null) {
            return 0L;
        }
        long j = v0aVar.j();
        if (!v0aVar.e) {
            return j;
        }
        int i = 0;
        while (true) {
            rje[] rjeVarArr = this.a;
            if (i >= rjeVarArr.length) {
                return j;
            }
            if (rjeVarArr[i].d(v0aVar) != null) {
                ks0 ks0VarD = rjeVarArr[i].d(v0aVar);
                Objects.requireNonNull(ks0VarD);
                long j2 = ks0VarD.m;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final void m0(e4g e4gVar) throws Throwable {
        this.J.c(1);
        n5a n5aVar = this.t;
        int size = ((ArrayList) n5aVar.c).size();
        if (e4gVar.b.length != size) {
            e4gVar = e4gVar.a().b(0, size);
        }
        n5aVar.k = e4gVar;
        v(n5aVar.c(), false);
    }

    public final Pair n(ush ushVar) {
        if (ushVar.p()) {
            return Pair.create(r2d.u, 0L);
        }
        Pair pairI = ushVar.i(this.k, this.l, ushVar.a(this.q1), -9223372036854775807L);
        x4a x4aVarP = this.s.p(ushVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (x4aVarP.b()) {
            Object obj = x4aVarP.a;
            rsh rshVar = this.l;
            ushVar.g(obj, rshVar);
            jLongValue = x4aVarP.c == rshVar.f(x4aVarP.b) ? rshVar.g.b : 0L;
        }
        return Pair.create(x4aVarP, Long.valueOf(jLongValue));
    }

    public final void n0(int i) {
        r2d r2dVar = this.I;
        if (r2dVar.e != i) {
            if (i != 2) {
                this.B1 = -9223372036854775807L;
            }
            if (i != 3 && r2dVar.p) {
                this.I = r2dVar.i(false);
            }
            this.I = this.I.h(i);
        }
    }

    public final long o(long j) {
        v0a v0aVar = this.s.l;
        if (v0aVar == null) {
            return 0L;
        }
        return Math.max(0L, j - v0aVar.x(this.w1));
    }

    public final void o0(mwi mwiVar) {
        for (rje rjeVar : this.a) {
            ks0 ks0Var = rjeVar.a;
            int i = ks0Var.b;
            if (i == 2 || i == 4) {
                ks0Var.a(7, mwiVar);
                ks0 ks0Var2 = rjeVar.c;
                if (ks0Var2 != null) {
                    ks0Var2.a(7, mwiVar);
                }
            }
        }
    }

    public final void p(int i) {
        r2d r2dVar = this.I;
        A0(i, r2dVar.n, r2dVar.m, r2dVar.l);
    }

    public final void p0(Object obj, r94 r94Var) {
        for (rje rjeVar : this.a) {
            ks0 ks0Var = rjeVar.a;
            if (ks0Var.b == 2) {
                int i = rjeVar.d;
                if (i == 4 || i == 1) {
                    ks0 ks0Var2 = rjeVar.c;
                    ks0Var2.getClass();
                    ks0Var2.a(1, obj);
                } else {
                    ks0Var.a(1, obj);
                }
            }
        }
        int i2 = this.I.e;
        if (i2 == 3 || i2 == 2) {
            this.h.i(2);
        }
        if (r94Var != null) {
            r94Var.f();
        }
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        this.h.c(9, (u0a) vhfVar).b();
    }

    public final void q0(float f) {
        this.F1 = f;
        float f2 = f * this.A.g;
        for (rje rjeVar : this.a) {
            ks0 ks0Var = rjeVar.a;
            if (ks0Var.b == 1) {
                ks0Var.a(2, Float.valueOf(f2));
                ks0 ks0Var2 = rjeVar.c;
                if (ks0Var2 != null) {
                    ks0Var2.a(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void r() {
        q0(this.F1);
    }

    public final boolean r0() {
        r2d r2dVar = this.I;
        return r2dVar.l && r2dVar.n == 0;
    }

    public final void s(u0a u0aVar) {
        x0a x0aVar = this.s;
        v0a v0aVar = x0aVar.l;
        if (v0aVar != null && v0aVar.a == u0aVar) {
            long j = this.w1;
            if (v0aVar != null) {
                v0aVar.s(j);
            }
            D();
            return;
        }
        v0a v0aVar2 = x0aVar.m;
        if (v0aVar2 == null || v0aVar2.a != u0aVar) {
            return;
        }
        E();
    }

    public final boolean s0(ush ushVar, x4a x4aVar) {
        if (x4aVar.b() || ushVar.p()) {
            return false;
        }
        int i = ushVar.g(x4aVar.a, this.l).c;
        tsh tshVar = this.k;
        ushVar.n(i, tshVar);
        return tshVar.a() && tshVar.h && tshVar.e != -9223372036854775807L;
    }

    public final void t(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        v0a v0aVar = this.s.i;
        if (v0aVar != null) {
            exoPlaybackException = exoPlaybackException.c(v0aVar.g.a);
        }
        lvb.l0("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        u0(false, false);
        this.I = this.I.f(exoPlaybackException);
    }

    public final void t0() {
        v0a v0aVar = this.s.i;
        if (v0aVar == null) {
            return;
        }
        vyh vyhVarM = v0aVar.m();
        int i = 0;
        while (true) {
            rje[] rjeVarArr = this.a;
            if (i >= rjeVarArr.length) {
                return;
            }
            if (vyhVarM.C(i)) {
                rjeVarArr[i].m();
            }
            i++;
        }
    }

    public final void u(boolean z) {
        v0a v0aVar = this.s.l;
        x4a x4aVar = v0aVar == null ? this.I.b : v0aVar.g.a;
        boolean zEquals = this.I.k.equals(x4aVar);
        if (!zEquals) {
            this.I = this.I.c(x4aVar);
        }
        r2d r2dVar = this.I;
        r2dVar.q = v0aVar == null ? r2dVar.s : v0aVar.g();
        r2d r2dVar2 = this.I;
        r2dVar2.r = o(r2dVar2.q);
        if ((!zEquals || z) && v0aVar != null && v0aVar.e) {
            x0(v0aVar.g.a, v0aVar.l(), v0aVar.m());
        }
    }

    public final void u0(boolean z, boolean z2) {
        P(z || !this.r1, false, true, false);
        this.J.c(z2 ? 1 : 0);
        this.f.i(this.w);
        this.A.c(1, this.I.l);
        n0(1);
    }

    /* JADX WARN: Code duplicated, block: B:234:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:240:0x0406  */
    /* JADX WARN: Code duplicated, block: B:242:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0425  */
    /* JADX WARN: Code duplicated, block: B:250:0x0428  */
    /* JADX WARN: Code duplicated, block: B:251:0x042a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0436  */
    /* JADX WARN: Code duplicated, block: B:256:0x043c  */
    /* JADX WARN: Code duplicated, block: B:260:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0481  */
    /* JADX WARN: Code duplicated, block: B:268:0x0483  */
    /* JADX WARN: Code duplicated, block: B:271:0x048e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0496  */
    /* JADX WARN: Code duplicated, block: B:275:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:283:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:284:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:287:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:289:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [ush] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v13, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [jg6] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v23 */
    /* JADX WARN: Type inference failed for: r24v3, types: [long] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9, types: [long] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v17 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ush] */
    /* JADX WARN: Type inference failed for: r2v15, types: [r2d] */
    /* JADX WARN: Type inference failed for: r2v32, types: [x0a] */
    /* JADX WARN: Type inference failed for: r43v0, types: [kg6] */
    /* JADX WARN: Type inference failed for: r5v44, types: [long] */
    /* JADX WARN: Type inference failed for: r5v55, types: [long] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v28, types: [ush] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v(ush ushVar, boolean z) throws Throwable {
        x4a x4aVar;
        long j;
        ush ushVar2;
        tsh tshVar;
        int i;
        int iA;
        long jK;
        ?? r26;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j3;
        rsh rshVar;
        long j4;
        long jLongValue;
        boolean z6;
        x4a x4aVar2;
        long jMin;
        long j5;
        long j6;
        ig6 ig6Var;
        int i2;
        boolean z7;
        long jLongValue2;
        boolean z8;
        boolean z9;
        boolean z10;
        long j7;
        ?? r24;
        ?? r20;
        ?? r11;
        x4a x4aVar3;
        ?? r25;
        ?? r12;
        ?? r21;
        ?? r27;
        long j8;
        x4a x4aVar4;
        Object obj;
        ?? r9;
        long j9;
        ?? r10;
        boolean z11;
        char c;
        ?? r28;
        ?? r29;
        ?? r22;
        ?? r13;
        ?? r8;
        ush ushVar3;
        v0a v0aVar;
        ?? r210;
        ?? r211;
        boolean z12;
        jg6 jg6Var;
        long j10;
        x4a x4aVar5;
        Object obj2;
        boolean z13;
        long j11;
        ?? r14;
        ?? r212;
        ?? r213;
        r2d r2dVar = this.I;
        jg6 jg6Var2 = this.v1;
        x0a x0aVar = this.s;
        int i3 = this.p1;
        boolean z14 = this.q1;
        tsh tshVar2 = this.k;
        rsh rshVar2 = this.l;
        if (ushVar.p()) {
            r26 = 0;
            r20 = 0;
            r24 = 0;
            ushVar2 = ushVar;
            ig6Var = new ig6(r2d.u, 0L, -9223372036854775807L, false, true, false);
        } else {
            x4a x4aVar6 = r2dVar.b;
            Object obj3 = x4aVar6.a;
            ush ushVar4 = r2dVar.a;
            boolean zP = ushVar4.p();
            boolean z15 = zP || ushVar4.g(x4aVar6.a, rshVar2).f;
            long j12 = (r2dVar.b.b() || z15) ? r2dVar.c : r2dVar.s;
            if (jg6Var2 != null) {
                x4aVar = x4aVar6;
                j = 1;
                ushVar2 = ushVar;
                Pair pairT = T(ushVar2, jg6Var2, true, i3, z14, tshVar2, rshVar2);
                if (pairT == null) {
                    iA = ushVar2.a(z14);
                    j7 = j12;
                    z10 = true;
                    z8 = false;
                    z9 = false;
                } else {
                    long j13 = jg6Var2.c;
                    Object obj4 = pairT.first;
                    if (j13 == -9223372036854775807L) {
                        iA = ushVar2.g(obj4, rshVar2).c;
                        jLongValue2 = j12;
                        z7 = false;
                    } else {
                        obj3 = obj4;
                        iA = -1;
                        z7 = true;
                        jLongValue2 = ((Long) pairT.second).longValue();
                    }
                    z8 = r2dVar.e == 4;
                    z9 = z7;
                    z10 = false;
                    j7 = jLongValue2;
                }
                z3 = z10;
                z2 = z8;
                z4 = z9;
                long j14 = j7;
                tshVar = tshVar2;
                j2 = j14;
                i = -1;
            } else {
                x4aVar = x4aVar6;
                j = 1;
                ushVar2 = ushVar;
                if (r2dVar.a.p()) {
                    iA = ushVar2.a(z14);
                    tshVar = tshVar2;
                } else if (ushVar2.b(obj3) == -1) {
                    int iU = U(tshVar2, rshVar2, i3, z14, obj3, r2dVar.a, ushVar2);
                    tshVar = tshVar2;
                    if (iU == -1) {
                        ushVar2 = ushVar2;
                        rshVar2 = rshVar2;
                        iA2 = ushVar2.a(z14);
                        z5 = true;
                    } else {
                        ushVar2 = ushVar2;
                        rshVar2 = rshVar2;
                        iA2 = iU;
                        z5 = false;
                    }
                    z3 = z5;
                    obj3 = obj3;
                    iA = iA2;
                    i = -1;
                    j3 = j12;
                    z2 = false;
                    z4 = false;
                    j2 = j3;
                } else {
                    tshVar = tshVar2;
                    if (j12 == -9223372036854775807L) {
                        int i4 = ushVar2.g(obj3, rshVar2).c;
                        obj3 = obj3;
                        iA = i4;
                    } else if (z15) {
                        r2dVar.a.g(x4aVar.a, rshVar2);
                        if (r2dVar.a.m(rshVar2.c, tshVar, 0L).m == r2dVar.a.b(x4aVar.a)) {
                            Pair pairI = ushVar2.i(tshVar, rshVar2, ushVar2.g(obj3, rshVar2).c, j12 + rshVar2.e);
                            obj3 = pairI.first;
                            jK = ((Long) pairI.second).longValue();
                        } else if (ushVar2.g(obj3, rshVar2).d != -9223372036854775807L) {
                            r26 = 0;
                            obj3 = obj3;
                            jK = vqi.k(j12, 0L, rshVar2.d - 1);
                        } else {
                            obj3 = obj3;
                            jK = j12;
                        }
                        j2 = jK;
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj3 = obj3;
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        j3 = j12;
                        z4 = false;
                        j2 = j3;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                j3 = j12;
                z4 = false;
                j2 = j3;
            }
            if (iA != i) {
                rshVar = rshVar2;
                Pair pairI2 = ushVar2.i(tshVar, rshVar, iA, -9223372036854775807L);
                obj3 = pairI2.first;
                j4 = -9223372036854775807L;
                jLongValue = ((Long) pairI2.second).longValue();
            } else {
                rshVar = rshVar2;
                j4 = j2;
                jLongValue = j2;
            }
            x4a x4aVarP = x0aVar.p(ushVar2, obj3, jLongValue);
            int i5 = x4aVarP.e;
            boolean z16 = i5 == i || ((i2 = x4aVar.e) != i && i5 >= i2);
            boolean zEquals = x4aVar.a.equals(obj3);
            boolean z17 = zEquals && !x4aVar.b() && !x4aVarP.b() && z16;
            rsh rshVarG = ushVar2.g(obj3, rshVar);
            if (z15 || j12 != j4) {
                z6 = false;
            } else {
                Object obj5 = x4aVar.a;
                int i6 = x4aVar.c;
                int i7 = x4aVar.b;
                if (obj5.equals(x4aVarP.a) && (!(x4aVar.b() && rshVarG.h(i7)) ? x4aVarP.b() && rshVarG.h(x4aVarP.b) : !(rshVarG.e(i7, i6) == 4 || rshVarG.e(i7, i6) == 2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z17 || z6) {
                x4aVarP = x4aVar;
            }
            long j15 = jLongValue;
            if (!x4aVarP.b()) {
                if (zEquals && x4aVar.b()) {
                    da daVarA = ushVar2.g(obj3, rshVar).g.a(x4aVar.b);
                    long j16 = daVarA.j;
                    long j17 = r2dVar.c;
                    if (j17 != -9223372036854775807L) {
                        x4aVar2 = x4aVar;
                        long j18 = daVarA.a;
                        if (j18 == Long.MIN_VALUE || j18 + j16 > j17) {
                        }
                    } else {
                        j15 = jLongValue;
                        x4aVar2 = x4aVar;
                    }
                    j15 = jLongValue;
                    j15 = jLongValue;
                    j15 = jLongValue;
                    int i8 = daVarA.b;
                    int i9 = x4aVar2.c;
                    j15 = jLongValue;
                    if (i8 > i9 && daVarA.f[i9] == 2) {
                        long j19 = ushVar2.g(obj3, rshVar).d;
                        if (j19 != -9223372036854775807L) {
                            j15 = jLongValue;
                            jMin = Math.min(j19 - j, jLongValue + j16);
                        } else {
                            j15 = jLongValue;
                            jMin = jLongValue + j16;
                        }
                        long j20 = jMin;
                        j5 = j20;
                        j6 = j20;
                    }
                }
                ig6Var = new ig6(x4aVarP, j6, j5, z2, z3, z4);
                r20 = zP;
                r24 = j12;
            } else if (x4aVarP.equals(x4aVar)) {
                j15 = r2dVar.s;
            } else {
                ushVar2.g(x4aVarP.a, rshVar);
                j15 = x4aVarP.c == rshVar.f(x4aVarP.b) ? rshVar.g.b : 0L;
            }
            j15 = jLongValue;
            j15 = jLongValue;
            j15 = jLongValue;
            j15 = jLongValue;
            j6 = j15;
            j5 = j4;
            ig6Var = new ig6(x4aVarP, j6, j5, z2, z3, z4);
            r20 = zP;
            r24 = j12;
        }
        x4a x4aVar7 = ig6Var.a;
        ?? r15 = ig6Var.c;
        boolean z18 = ig6Var.d;
        long jY = ig6Var.b;
        boolean z19 = (this.I.b.equals(x4aVar7) && jY == this.I.s) ? false : true;
        try {
            if (ig6Var.e) {
                try {
                    z11 = true;
                    if (this.I.e != 1) {
                        c = 4;
                        try {
                            n0(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = ushVar2;
                            x4aVar3 = x4aVar7;
                            r21 = z11;
                            r27 = c;
                            r25 = r15;
                            r12 = 0;
                        }
                    } else {
                        c = 4;
                    }
                    P(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                    c = 4;
                    r11 = ushVar2;
                    x4aVar3 = x4aVar7;
                    r21 = z11;
                    r27 = c;
                    r25 = r15;
                    r12 = 0;
                }
            } else {
                z11 = true;
                c = 4;
            }
            rje[] rjeVarArr = this.a;
            int length = rjeVarArr.length;
            ?? r16 = 0;
            while (r16 < length) {
                try {
                    rje rjeVar = rjeVarArr[r16];
                    ks0 ks0Var = rjeVar.a;
                    if (!Objects.equals(ks0Var.p, ushVar2)) {
                        ks0Var.p = ushVar2;
                        ks0Var.v();
                    }
                    ks0 ks0Var2 = rjeVar.c;
                    if (ks0Var2 != null && !Objects.equals(ks0Var2.p, ushVar2)) {
                        ks0Var2.p = ushVar2;
                        ks0Var2.v();
                    }
                    r16++;
                } catch (Throwable th3) {
                    th = th3;
                    r11 = ushVar2;
                    x4aVar3 = x4aVar7;
                    r27 = c;
                    r25 = r15;
                    r12 = 0;
                    r21 = 1;
                }
            }
            try {
                if (z19) {
                    r16 = ushVar2;
                    r26 = c;
                    r24 = r15;
                    jg6Var = null;
                    jg6Var = null;
                    r13 = 0;
                    r15 = 0;
                    z12 = true;
                    z12 = true;
                    r22 = 1;
                    r20 = 1;
                    if (r16.p()) {
                        r213 = r24;
                        r212 = r26;
                        r213 = r24;
                        r212 = r26;
                        x4aVar3 = x4aVar7;
                        r211 = r213;
                        r210 = r212;
                    } else {
                        for (v0a v0aVarH = this.s.i; v0aVarH != null; v0aVarH = v0aVarH.h()) {
                            if (v0aVarH.g.a.equals(x4aVar7)) {
                                r213 = r24;
                                r212 = r26;
                                v0aVarH.g = this.s.i(r16, v0aVarH.g);
                                v0aVarH.z();
                            } else {
                                r213 = r24;
                                r212 = r26;
                            }
                        }
                        try {
                            r213 = r24;
                            r212 = r26;
                            x0a x0aVar2 = this.s;
                            x4aVar3 = x4aVar7;
                            try {
                                jY = Y(x4aVar3, jY, x0aVar2.i != x0aVar2.j, z18);
                                r211 = r24;
                                r210 = r26;
                            } catch (Throwable th4) {
                                th = th4;
                                jY = jY;
                                r8 = r16;
                                r29 = r24;
                                r28 = r26;
                                r11 = r8;
                                r12 = r13;
                                r21 = r22;
                                r25 = r29;
                                r27 = r28;
                                r2d r2dVar2 = this.I;
                                ush ushVar5 = r2dVar2.a;
                                x4a x4aVar8 = r2dVar2.b;
                                if (ig6Var.f) {
                                    j8 = jY;
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                x4aVar4 = x4aVar3;
                                C0(r11, x4aVar4, ushVar5, x4aVar8, j8, false);
                                if (z19) {
                                    r2d r2dVar3 = this.I;
                                    obj = r2dVar3.b.a;
                                    ush ushVar6 = r2dVar3.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.I.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                                } else {
                                    r2d r2dVar4 = this.I;
                                    obj = r2dVar4.b.a;
                                    ush ushVar7 = r2dVar4.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.I.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                                }
                                Q();
                                S(r11, this.I.a);
                                this.I = this.I.j(r11);
                                if (!r11.p()) {
                                    this.v1 = r12;
                                }
                                u(false);
                                this.h.i(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            x4aVar3 = x4aVar7;
                            r8 = r16;
                            r13 = r15;
                            r22 = r20;
                            r29 = r24;
                            r28 = r26;
                            r11 = r8;
                            r12 = r13;
                            r21 = r22;
                            r25 = r29;
                            r27 = r28;
                            r2d r2dVar5 = this.I;
                            ush ushVar8 = r2dVar5.a;
                            x4a x4aVar9 = r2dVar5.b;
                            if (ig6Var.f) {
                                j8 = jY;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            x4aVar4 = x4aVar3;
                            C0(r11, x4aVar4, ushVar8, x4aVar9, j8, false);
                            if (z19) {
                                r2d r2dVar6 = this.I;
                                obj = r2dVar6.b.a;
                                ush ushVar9 = r2dVar6.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.I.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                            } else {
                                r2d r2dVar7 = this.I;
                                obj = r2dVar7.b.a;
                                ush ushVar10 = r2dVar7.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.I.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                            }
                            Q();
                            S(r11, this.I.a);
                            this.I = this.I.j(r11);
                            if (!r11.p()) {
                                this.v1 = r12;
                            }
                            u(false);
                            this.h.i(2);
                            throw th;
                        }
                    }
                    r2d r2dVar8 = this.I;
                    ush ushVar11 = r2dVar8.a;
                    x4a x4aVar10 = r2dVar8.b;
                    if (ig6Var.f) {
                        j10 = jY;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    x4aVar5 = x4aVar3;
                    C0(ushVar, x4aVar5, ushVar11, x4aVar10, j10, false);
                    if (z19) {
                        r2d r2dVar9 = this.I;
                        obj2 = r2dVar9.b.a;
                        ush ushVar12 = r2dVar9.a;
                        if (z19) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j11 = jY;
                        } else {
                            j11 = this.I.d;
                        }
                        if (ushVar.b(obj2) == -1) {
                            r14 = r210;
                        } else {
                            r14 = 3;
                        }
                        this.I = y(x4aVar5, jY, r211, j11, z13, r14);
                    } else {
                        r2d r2dVar10 = this.I;
                        obj2 = r2dVar10.b.a;
                        ush ushVar13 = r2dVar10.a;
                        if (z19) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            j11 = jY;
                        } else {
                            j11 = this.I.d;
                        }
                        if (ushVar.b(obj2) == -1) {
                            r14 = r210;
                        } else {
                            r14 = 3;
                        }
                        this.I = y(x4aVar5, jY, r211, j11, z13, r14);
                    }
                    Q();
                    S(ushVar, this.I.a);
                    this.I = this.I.j(ushVar);
                    if (!ushVar.p()) {
                        this.v1 = jg6Var;
                    }
                    u(false);
                    this.h.i(2);
                    return;
                }
                try {
                    v0a v0aVar2 = this.s.j;
                    try {
                        char c2 = c;
                        try {
                            r26 = c2;
                            r24 = r15;
                            r15 = 0;
                            jg6Var = null;
                            jg6Var = null;
                            jg6Var = null;
                            r20 = 1;
                            z12 = true;
                            z12 = true;
                            z12 = true;
                            try {
                                int iS = this.s.s(ushVar, this.w1, v0aVar2 == null ? 0L : m(v0aVar2), (!e() || (v0aVar = this.s.k) == null) ? 0L : m(v0aVar));
                                if ((iS & 1) != 0) {
                                    W(false);
                                    r213 = r24;
                                    r212 = r26;
                                } else if ((iS & 2) != 0) {
                                    r213 = r24;
                                    r212 = r26;
                                    g();
                                    r213 = r24;
                                    r212 = r26;
                                }
                                r213 = r24;
                                r212 = r26;
                                r213 = r24;
                                r212 = r26;
                                x4aVar3 = x4aVar7;
                                r211 = r213;
                                r210 = r212;
                                r2d r2dVar11 = this.I;
                                ush ushVar14 = r2dVar11.a;
                                x4a x4aVar11 = r2dVar11.b;
                                if (ig6Var.f) {
                                    j10 = jY;
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                x4aVar5 = x4aVar3;
                                C0(ushVar, x4aVar5, ushVar14, x4aVar11, j10, false);
                                if (z19 || r211 != this.I.c) {
                                    r2d r2dVar12 = this.I;
                                    obj2 = r2dVar12.b.a;
                                    ush ushVar15 = r2dVar12.a;
                                    if (z19 || !z || ushVar15.p() || ushVar15.g(obj2, this.l).f) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    if (z13) {
                                        j11 = jY;
                                    } else {
                                        j11 = this.I.d;
                                    }
                                    if (ushVar.b(obj2) == -1) {
                                        r14 = r210;
                                    } else {
                                        r14 = 3;
                                    }
                                    this.I = y(x4aVar5, jY, r211, j11, z13, r14);
                                }
                                Q();
                                S(ushVar, this.I.a);
                                this.I = this.I.j(ushVar);
                                if (!ushVar.p()) {
                                    this.v1 = jg6Var;
                                }
                                u(false);
                                this.h.i(2);
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                r16 = ushVar;
                                x4aVar3 = x4aVar7;
                                r8 = r16;
                                r13 = r15;
                                r22 = r20;
                                r29 = r24;
                                r28 = r26;
                                r11 = r8;
                                r12 = r13;
                                r21 = r22;
                                r25 = r29;
                                r27 = r28;
                                r2d r2dVar13 = this.I;
                                ush ushVar16 = r2dVar13.a;
                                x4a x4aVar12 = r2dVar13.b;
                                if (ig6Var.f) {
                                    j8 = jY;
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                x4aVar4 = x4aVar3;
                                C0(r11, x4aVar4, ushVar16, x4aVar12, j8, false);
                                if (z19) {
                                    r2d r2dVar14 = this.I;
                                    obj = r2dVar14.b.a;
                                    ush ushVar17 = r2dVar14.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.I.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                                } else {
                                    r2d r2dVar15 = this.I;
                                    obj = r2dVar15.b.a;
                                    ush ushVar18 = r2dVar15.a;
                                    if (z19) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    if (r9 != 0) {
                                        j9 = jY;
                                    } else {
                                        j9 = this.I.d;
                                    }
                                    if (r11.b(obj) == -1) {
                                        r10 = r27;
                                    } else {
                                        r10 = 3;
                                    }
                                    this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                                }
                                Q();
                                S(r11, this.I.a);
                                this.I = this.I.j(r11);
                                if (!r11.p()) {
                                    this.v1 = r12;
                                }
                                u(false);
                                this.h.i(2);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r16 = ushVar;
                            r26 = c2;
                            r24 = r15;
                            r15 = 0;
                            r20 = 1;
                            x4aVar3 = x4aVar7;
                            r8 = r16;
                            r13 = r15;
                            r22 = r20;
                            r29 = r24;
                            r28 = r26;
                            r11 = r8;
                            r12 = r13;
                            r21 = r22;
                            r25 = r29;
                            r27 = r28;
                            r2d r2dVar16 = this.I;
                            ush ushVar19 = r2dVar16.a;
                            x4a x4aVar13 = r2dVar16.b;
                            if (ig6Var.f) {
                                j8 = jY;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            x4aVar4 = x4aVar3;
                            C0(r11, x4aVar4, ushVar19, x4aVar13, j8, false);
                            if (z19) {
                                r2d r2dVar17 = this.I;
                                obj = r2dVar17.b.a;
                                ush ushVar110 = r2dVar17.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.I.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                            } else {
                                r2d r2dVar18 = this.I;
                                obj = r2dVar18.b.a;
                                ush ushVar111 = r2dVar18.a;
                                if (z19) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                if (r9 != 0) {
                                    j9 = jY;
                                } else {
                                    j9 = this.I.d;
                                }
                                if (r11.b(obj) == -1) {
                                    r10 = r27;
                                } else {
                                    r10 = 3;
                                }
                                this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                            }
                            Q();
                            S(r11, this.I.a);
                            this.I = this.I.j(r11);
                            if (!r11.p()) {
                                this.v1 = r12;
                            }
                            u(false);
                            this.h.i(2);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        ushVar3 = ushVar;
                        r26 = c;
                        r16 = ushVar3;
                        r24 = r15;
                        r15 = 0;
                        r20 = 1;
                        x4aVar3 = x4aVar7;
                        r8 = r16;
                        r13 = r15;
                        r22 = r20;
                        r29 = r24;
                        r28 = r26;
                        r11 = r8;
                        r12 = r13;
                        r21 = r22;
                        r25 = r29;
                        r27 = r28;
                        r2d r2dVar19 = this.I;
                        ush ushVar112 = r2dVar19.a;
                        x4a x4aVar14 = r2dVar19.b;
                        if (ig6Var.f) {
                            j8 = jY;
                        } else {
                            j8 = -9223372036854775807L;
                        }
                        x4aVar4 = x4aVar3;
                        C0(r11, x4aVar4, ushVar112, x4aVar14, j8, false);
                        if (z19) {
                            r2d r2dVar110 = this.I;
                            obj = r2dVar110.b.a;
                            ush ushVar113 = r2dVar110.a;
                            if (z19) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            if (r9 != 0) {
                                j9 = jY;
                            } else {
                                j9 = this.I.d;
                            }
                            if (r11.b(obj) == -1) {
                                r10 = r27;
                            } else {
                                r10 = 3;
                            }
                            this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                        } else {
                            r2d r2dVar111 = this.I;
                            obj = r2dVar111.b.a;
                            ush ushVar114 = r2dVar111.a;
                            if (z19) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            if (r9 != 0) {
                                j9 = jY;
                            } else {
                                j9 = this.I.d;
                            }
                            if (r11.b(obj) == -1) {
                                r10 = r27;
                            } else {
                                r10 = 3;
                            }
                            this.I = y(x4aVar4, jY, r25, j9, r9, r10);
                        }
                        Q();
                        S(r11, this.I.a);
                        this.I = this.I.j(r11);
                        if (!r11.p()) {
                            this.v1 = r12;
                        }
                        u(false);
                        this.h.i(2);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    ushVar3 = ushVar2;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            r11 = ushVar2;
            x4aVar3 = x4aVar7;
            r25 = r15;
            r12 = 0;
            r21 = 1;
            r27 = 4;
        }
        r2d r2dVar112 = this.I;
        ush ushVar115 = r2dVar112.a;
        x4a x4aVar15 = r2dVar112.b;
        if (ig6Var.f) {
            j8 = jY;
        } else {
            j8 = -9223372036854775807L;
        }
        x4aVar4 = x4aVar3;
        C0(r11, x4aVar4, ushVar115, x4aVar15, j8, false);
        if (z19 || r25 != this.I.c) {
            r2d r2dVar113 = this.I;
            obj = r2dVar113.b.a;
            ush ushVar116 = r2dVar113.a;
            if (z19 || !z || ushVar116.p() || ushVar116.g(obj, this.l).f) {
                r9 = 0;
            } else {
                r9 = r21;
            }
            if (r9 != 0) {
                j9 = jY;
            } else {
                j9 = this.I.d;
            }
            if (r11.b(obj) == -1) {
                r10 = r27;
            } else {
                r10 = 3;
            }
            this.I = y(x4aVar4, jY, r25, j9, r9, r10);
        }
        Q();
        S(r11, this.I.a);
        this.I = this.I.j(r11);
        if (!r11.p()) {
            this.v1 = r12;
        }
        u(false);
        this.h.i(2);
        throw th;
    }

    public final void v0() {
        bc5 bc5Var = this.o;
        bc5Var.f = false;
        tgg tggVar = bc5Var.a;
        if (tggVar.b) {
            tggVar.a(tggVar.A());
            tggVar.b = false;
        }
        for (rje rjeVar : this.a) {
            ks0 ks0Var = rjeVar.c;
            ks0 ks0Var2 = rjeVar.a;
            if (rje.h(ks0Var2)) {
                rje.b(ks0Var2);
            }
            if (ks0Var != null && ks0Var.h != 0) {
                rje.b(ks0Var);
            }
        }
    }

    public final void w(u0a u0aVar) {
        v0a v0aVar;
        kg6 kg6Var;
        x0a x0aVar = this.s;
        v0a v0aVar2 = x0aVar.l;
        bc5 bc5Var = this.o;
        if (v0aVar2 != null && v0aVar2.a == u0aVar) {
            v0aVar2.getClass();
            if (!v0aVar2.e) {
                float f = bc5Var.c().a;
                r2d r2dVar = this.I;
                v0aVar2.n(f, r2dVar.a, r2dVar.l);
            }
            x0(v0aVar2.g.a, v0aVar2.l(), v0aVar2.m());
            if (v0aVar2 == x0aVar.i) {
                R(v0aVar2.g.b, true);
                k(new boolean[this.a.length], x0aVar.j.k());
                v0aVar2.h = true;
                r2d r2dVar2 = this.I;
                x4a x4aVar = r2dVar2.b;
                long j = v0aVar2.g.b;
                kg6Var = this;
                kg6Var.I = y(x4aVar, j, r2dVar2.c, j, false, 5);
            } else {
                kg6Var = this;
            }
            kg6Var.D();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= x0aVar.q.size()) {
                v0aVar = null;
                break;
            }
            v0aVar = (v0a) x0aVar.q.get(i);
            if (v0aVar.a == u0aVar) {
                break;
            } else {
                i++;
            }
        }
        if (v0aVar != null) {
            lvb.b0(!v0aVar.e);
            float f2 = bc5Var.c().a;
            r2d r2dVar3 = this.I;
            v0aVar.n(f2, r2dVar3.a, r2dVar3.l);
            v0a v0aVar3 = x0aVar.m;
            if (v0aVar3 == null || v0aVar3.a != u0aVar) {
                return;
            }
            E();
        }
    }

    public final void w0() {
        v0a v0aVar = this.s.l;
        boolean z = this.o1 || (v0aVar != null && v0aVar.a.i());
        r2d r2dVar = this.I;
        if (z != r2dVar.g) {
            this.I = r2dVar.b(z);
        }
    }

    public final void x(s2d s2dVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.J.c(1);
            }
            this.I = this.I.g(s2dVar);
        }
        float f2 = s2dVar.a;
        v0a v0aVarH = this.s.i;
        while (true) {
            i = 0;
            if (v0aVarH == null) {
                break;
            }
            rg6[] rg6VarArr = (rg6[]) v0aVarH.m().d;
            int length = rg6VarArr.length;
            while (i < length) {
                rg6 rg6Var = rg6VarArr[i];
                if (rg6Var != null) {
                    rg6Var.h(f2);
                }
                i++;
            }
            v0aVarH = v0aVarH.h();
        }
        rje[] rjeVarArr = this.a;
        int length2 = rjeVarArr.length;
        while (i < length2) {
            rje rjeVar = rjeVarArr[i];
            float f3 = s2dVar.a;
            rjeVar.a.C(f, f3);
            ks0 ks0Var = rjeVar.c;
            if (ks0Var != null) {
                ks0Var.C(f, f3);
            }
            i++;
        }
    }

    public final void x0(x4a x4aVar, iyh iyhVar, vyh vyhVar) {
        x0a x0aVar = this.s;
        v0a v0aVar = x0aVar.l;
        v0aVar.getClass();
        v0a v0aVar2 = x0aVar.i;
        long j = this.w1;
        long jX = v0aVar == v0aVar2 ? v0aVar.x(j) : v0aVar.x(j) - v0aVar.g.b;
        long jO = o(v0aVar.g());
        long j2 = s0(this.I.a, v0aVar.g.a) ? this.u.h : -9223372036854775807L;
        ush ushVar = this.I.a;
        float f = this.o.c().a;
        boolean z = this.I.l;
        this.f.f(new r99(this.w, ushVar, x4aVar, jX, jO, f, this.Z, j2), (rg6[]) vyhVar.d);
    }

    public final r2d y(x4a x4aVar, long j, long j2, long j3, boolean z, int i) {
        ghe gheVarH;
        boolean z2;
        this.z1 = (!this.z1 && j == this.I.s && x4aVar.equals(this.I.b)) ? false : true;
        Q();
        r2d r2dVar = this.I;
        iyh iyhVarL = r2dVar.h;
        vyh vyhVarM = r2dVar.i;
        List list = r2dVar.j;
        if (this.t.a) {
            v0a v0aVar = this.s.i;
            iyhVarL = v0aVar == null ? iyh.d : v0aVar.l();
            vyhVarM = v0aVar == null ? this.e : v0aVar.m();
            rg6[] rg6VarArr = (rg6[]) vyhVarM.d;
            z88 z88Var = new z88(4);
            boolean z3 = false;
            for (rg6 rg6Var : rg6VarArr) {
                if (rg6Var != null) {
                    lwa lwaVar = rg6Var.d(0).l;
                    if (lwaVar == null) {
                        z88Var.c(new lwa(new jwa[0]));
                    } else {
                        z88Var.c(lwaVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                gheVarH = z88Var.h();
            } else {
                a98 a98Var = c98.b;
                gheVarH = ghe.e;
            }
            list = gheVarH;
            if (v0aVar != null) {
                w0a w0aVar = v0aVar.g;
                if (w0aVar.c != j2) {
                    v0aVar.g = w0aVar.a(j2);
                }
            }
            rje[] rjeVarArr = this.a;
            x0a x0aVar = this.s;
            v0a v0aVar2 = x0aVar.i;
            if (v0aVar2 == x0aVar.j && v0aVar2 != null) {
                vyh vyhVarM2 = v0aVar2.m();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= rjeVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (vyhVarM2.C(i2)) {
                        if (rjeVarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((mje[]) vyhVarM2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.t1) {
                    this.t1 = z5;
                    if (!z5 && this.I.p) {
                        this.h.i(2);
                    }
                }
            }
        } else if (!x4aVar.equals(r2dVar.b)) {
            iyhVarL = iyh.d;
            vyhVarM = this.e;
            list = ghe.e;
        }
        vyh vyhVar = vyhVarM;
        List list2 = list;
        iyh iyhVar = iyhVarL;
        if (z) {
            hg6 hg6Var = this.J;
            if (!hg6Var.e || hg6Var.c == 5) {
                hg6Var.d = true;
                hg6Var.e = true;
                hg6Var.c = i;
            } else {
                lvb.R(i == 5);
            }
        }
        r2d r2dVar2 = this.I;
        return r2dVar2.d(x4aVar, j, j2, j3, o(r2dVar2.q), iyhVar, vyhVar, list2);
    }

    public final void y0(int i, int i2, List list) throws Throwable {
        this.J.c(1);
        n5a n5aVar = this.t;
        n5aVar.getClass();
        ArrayList arrayList = (ArrayList) n5aVar.c;
        lvb.R(i >= 0 && i <= i2 && i2 <= arrayList.size());
        lvb.R(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((m5a) arrayList.get(i3)).a.v((ry9) list.get(i3 - i));
        }
        v(n5aVar.c(), false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:111:0x021f A[EDGE_INSN: B:111:0x021f->B:241:0x043f BREAK  A[LOOP:6: B:121:0x0238->B:127:0x024f]] */
    /* JADX WARN: Code duplicated, block: B:196:0x0398  */
    /* JADX WARN: Code duplicated, block: B:198:0x039d  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:221:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:308:0x0532  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void z0() {
        v0a v0aVar;
        int i;
        int i2;
        int length;
        int i3;
        ks0 ks0Var;
        boolean zC;
        ks0 ks0Var2;
        byte b;
        int i4;
        int i5;
        v0a v0aVar2;
        v0a v0aVarH;
        boolean z;
        boolean z2;
        v0a v0aVar3;
        vyh vyhVar;
        v0a v0aVar4;
        int i6;
        if (this.I.a.p() || !this.t.a) {
            return;
        }
        x0a x0aVar = this.s;
        long j = this.w1;
        v0a v0aVar5 = x0aVar.l;
        if (v0aVar5 != null) {
            v0aVar5.s(j);
        }
        x0a x0aVar2 = this.s;
        v0a v0aVar6 = x0aVar2.l;
        if (v0aVar6 == null || (!v0aVar6.g.j && v0aVar6.p() && x0aVar2.l.g.e != -9223372036854775807L && x0aVar2.n < 100)) {
            x0a x0aVar3 = this.s;
            long j2 = this.w1;
            r2d r2dVar = this.I;
            v0a v0aVar7 = x0aVar3.l;
            w0a w0aVarE = v0aVar7 == null ? x0aVar3.e(r2dVar.a, r2dVar.b, r2dVar.c, r2dVar.s) : x0aVar3.d(r2dVar.a, v0aVar7, j2);
            if (w0aVarE != null) {
                x0a x0aVar4 = this.s;
                v0a v0aVar8 = x0aVar4.l;
                long j3 = v0aVar8 == null ? 1000000000000L : (v0aVar8.j() + x0aVar4.l.g.e) - w0aVarE.b;
                int i7 = 0;
                while (true) {
                    if (i7 >= x0aVar4.q.size()) {
                        v0aVar = null;
                        break;
                    } else {
                        if (((v0a) x0aVar4.q.get(i7)).c(w0aVarE)) {
                            v0aVar = (v0a) x0aVar4.q.remove(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (v0aVar == null) {
                    kg6 kg6Var = (kg6) x0aVar4.e.a;
                    ks0[] ks0VarArr = kg6Var.b;
                    uyh uyhVar = kg6Var.d;
                    qf qfVarE = kg6Var.f.e(kg6Var.w);
                    n5a n5aVar = kg6Var.t;
                    vyh vyhVar2 = kg6Var.e;
                    kg6Var.C1.getClass();
                    v0aVar = new v0a(ks0VarArr, j3, uyhVar, qfVarE, n5aVar, w0aVarE, vyhVar2);
                } else {
                    v0aVar.g = w0aVarE;
                    v0aVar.w(j3);
                }
                v0a v0aVar9 = x0aVar4.l;
                if (v0aVar9 != null) {
                    v0aVar9.v(v0aVar);
                } else {
                    x0aVar4.i = v0aVar;
                    x0aVar4.j = v0aVar;
                    x0aVar4.k = v0aVar;
                }
                x0aVar4.o = null;
                x0aVar4.l = v0aVar;
                x0aVar4.n++;
                x0aVar4.m();
                if (!v0aVar.d) {
                    v0aVar.r(this, w0aVarE.b);
                } else if (v0aVar.e) {
                    this.h.c(8, v0aVar.a).b();
                }
                if (this.s.i == v0aVar) {
                    R(w0aVarE.b, true);
                }
                u(false);
            }
        }
        if (this.o1) {
            this.o1 = z(this.s.l);
            w0();
        } else {
            D();
        }
        x0a x0aVar5 = this.s;
        long j4 = 10000000;
        if (!this.Y && this.z && !this.E1 && !e() && (v0aVar3 = x0aVar5.k) != null && v0aVar3 == x0aVar5.j && v0aVar3.h() != null && v0aVar3.h().e) {
            v0a v0aVarH2 = v0aVar3.h();
            lvb.b0(v0aVarH2.e);
            if (((long) ((v0aVarH2.k() - this.w1) / this.o.c().a)) <= 10000000) {
                v0a v0aVar10 = x0aVar5.k;
                v0aVar10.getClass();
                x0aVar5.k = v0aVar10.h();
                x0aVar5.m();
                x0aVar5.k.getClass();
                rje[] rjeVarArr = this.a;
                v0a v0aVar11 = x0aVar5.k;
                if (v0aVar11 != null) {
                    vyh vyhVarM = v0aVar11.m();
                    v0a v0aVar12 = v0aVar11;
                    int i8 = 0;
                    while (i8 < rjeVarArr.length) {
                        if (vyhVarM.C(i8)) {
                            rje rjeVar = rjeVarArr[i8];
                            if (rjeVar.c == null || rjeVar.f()) {
                                vyhVar = vyhVarM;
                                v0aVar4 = v0aVar12;
                            } else {
                                rje rjeVar2 = rjeVarArr[i8];
                                lvb.b0(!rjeVar2.f());
                                if (rje.h(rjeVar2.a)) {
                                    i6 = 3;
                                } else {
                                    ks0 ks0Var3 = rjeVar2.c;
                                    i6 = (ks0Var3 == null || ks0Var3.h == 0) ? 2 : 4;
                                }
                                rjeVar2.d = i6;
                                v0aVar4 = v0aVar12;
                                vyhVar = vyhVarM;
                                j(v0aVar4, i8, false, v0aVar4.k());
                            }
                        } else {
                            vyhVar = vyhVarM;
                            v0aVar4 = v0aVar12;
                        }
                        i8++;
                        v0aVar12 = v0aVar4;
                        rjeVarArr = rjeVarArr;
                        vyhVarM = vyhVar;
                    }
                    v0a v0aVar13 = v0aVar12;
                    if (e()) {
                        this.D1 = v0aVar13.a.k();
                        if (!v0aVar13.p()) {
                            x0aVar5.n(v0aVar13);
                            u(false);
                            D();
                        }
                    }
                }
            }
        }
        boolean z3 = this.z;
        rje[] rjeVarArr2 = this.a;
        x0a x0aVar6 = this.s;
        v0a v0aVar14 = x0aVar6.j;
        if (v0aVar14 == null) {
            i = 2;
            break;
        }
        if (v0aVar14.h() != null && !this.Y) {
            v0a v0aVar15 = x0aVar6.j;
            if (!v0aVar15.e) {
                i = 2;
                break;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= rjeVarArr2.length) {
                    long j5 = j4;
                    if ((!e() || x0aVar6.k != x0aVar6.j) && (v0aVar14.h().e || this.w1 >= v0aVar14.h().k())) {
                        if (v0aVar14.h().e) {
                            v0a v0aVarH3 = v0aVar14.h();
                            lvb.b0(v0aVarH3.e);
                            if (((long) ((v0aVarH3.k() - this.w1) / this.o.c().a)) > j5) {
                                break;
                            }
                        }
                        vyh vyhVarM2 = v0aVar14.m();
                        v0a v0aVar16 = x0aVar6.k;
                        v0a v0aVar17 = x0aVar6.j;
                        if (v0aVar16 == v0aVar17) {
                            v0aVar17.getClass();
                            x0aVar6.k = v0aVar17.h();
                        }
                        v0a v0aVar18 = x0aVar6.j;
                        v0aVar18.getClass();
                        x0aVar6.j = v0aVar18.h();
                        x0aVar6.m();
                        v0a v0aVar19 = x0aVar6.j;
                        v0aVar19.getClass();
                        vyh vyhVarM3 = v0aVar19.m();
                        ush ushVar = this.I.a;
                        C0(ushVar, v0aVar19.g.a, ushVar, v0aVar14.g.a, -9223372036854775807L, false);
                        if (!v0aVar19.e || ((!z3 || this.D1 == -9223372036854775807L) && v0aVar19.a.k() == -9223372036854775807L)) {
                            i2 = 2;
                            length = rjeVarArr2.length;
                            i3 = 0;
                            while (i3 < length) {
                                rje rjeVar3 = rjeVarArr2[i3];
                                long jK = v0aVar19.k();
                                ks0Var = rjeVar3.a;
                                int i10 = rjeVar3.b;
                                zC = vyhVarM2.C(i10);
                                boolean zC2 = vyhVarM3.C(i10);
                                ks0Var2 = rjeVar3.c;
                                if (ks0Var2 != null || (i4 = rjeVar3.d) == 3 || (i4 == 0 && rje.h(ks0Var))) {
                                    ks0Var2 = ks0Var;
                                }
                                if (zC || ks0Var2.n) {
                                    b = -2;
                                } else {
                                    int i11 = ks0Var.b;
                                    b = -2;
                                    boolean z4 = i11 == -2;
                                    mje mjeVar = ((mje[]) vyhVarM2.c)[i10];
                                    mje mjeVar2 = ((mje[]) vyhVarM3.c)[i10];
                                    if (!zC2 || !Objects.equals(mjeVar2, mjeVar) || z4 || rjeVar3.f()) {
                                        rje.l(ks0Var2, jK);
                                    }
                                }
                                i3++;
                                i2 = 2;
                            }
                        } else {
                            this.D1 = -9223372036854775807L;
                            boolean z5 = z3 && !this.E1;
                            if (z5) {
                                for (int i12 = 0; i12 < rjeVarArr2.length; i12++) {
                                    boolean zC3 = vyhVarM3.C(i12);
                                    rg6[] rg6VarArr = (rg6[]) vyhVarM3.d;
                                    if (zC3 && rjeVarArr2[i12].a.b != -2 && !uya.a(rg6VarArr[i12].s().n, rg6VarArr[i12].s().k) && !rjeVarArr2[i12].f()) {
                                        z5 = false;
                                        break;
                                    }
                                }
                            }
                            if (z5) {
                                i2 = 2;
                                length = rjeVarArr2.length;
                                i3 = 0;
                                while (i3 < length) {
                                    rje rjeVar4 = rjeVarArr2[i3];
                                    long jK2 = v0aVar19.k();
                                    ks0Var = rjeVar4.a;
                                    int i13 = rjeVar4.b;
                                    zC = vyhVarM2.C(i13);
                                    boolean zC4 = vyhVarM3.C(i13);
                                    ks0Var2 = rjeVar4.c;
                                    if (ks0Var2 != null) {
                                        ks0Var2 = ks0Var;
                                    } else {
                                        ks0Var2 = ks0Var;
                                    }
                                    if (zC) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                    i3++;
                                    i2 = 2;
                                }
                            } else {
                                long jK3 = v0aVar19.k();
                                for (rje rjeVar5 : rjeVarArr2) {
                                    ks0 ks0Var4 = rjeVar5.c;
                                    ks0 ks0Var5 = rjeVar5.a;
                                    if (rje.h(ks0Var5) && (i5 = rjeVar5.d) != 4) {
                                        if (i5 != 2) {
                                            rje.l(ks0Var5, jK3);
                                        }
                                    }
                                    if (ks0Var4 != null && ks0Var4.h != 0 && rjeVar5.d != 3) {
                                        rje.l(ks0Var4, jK3);
                                    }
                                }
                                i2 = 2;
                                if (!v0aVar19.p()) {
                                    x0aVar6.n(v0aVar19);
                                    u(false);
                                    D();
                                }
                            }
                        }
                        i = i2;
                        break;
                    }
                } else {
                    rje rjeVar6 = rjeVarArr2[i9];
                    long j6 = j4;
                    if (rjeVar6.e(v0aVar15, rjeVar6.a) && rjeVar6.e(v0aVar15, rjeVar6.c)) {
                        i9++;
                        j4 = j6;
                    }
                }
                i = 2;
                break;
            }
        }
        i = 2;
        if (v0aVar14.g.j || this.Y) {
            for (rje rjeVar7 : rjeVarArr2) {
                if (rjeVar7.d(v0aVar14) != null) {
                    ks0 ks0VarD = rjeVar7.d(v0aVar14);
                    ks0VarD.getClass();
                    if (ks0VarD.i()) {
                        long j7 = v0aVar14.g.e;
                        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : v0aVar14.j() + v0aVar14.g.e;
                        ks0 ks0VarD2 = rjeVar7.d(v0aVar14);
                        ks0VarD2.getClass();
                        rje.l(ks0VarD2, j8);
                    }
                }
            }
        }
        x0a x0aVar7 = this.s;
        v0a v0aVar20 = x0aVar7.j;
        if (v0aVar20 != null && x0aVar7.i != v0aVar20 && !v0aVar20.h) {
            rje[] rjeVarArr3 = this.a;
            vyh vyhVarM4 = v0aVar20.m();
            boolean z6 = true;
            for (int i14 = 0; i14 < rjeVarArr3.length; i14++) {
                int iC = rjeVarArr3[i14].c();
                rje rjeVar8 = rjeVarArr3[i14];
                bc5 bc5Var = this.o;
                int iJ = rjeVar8.j(rjeVar8.a, v0aVar20, vyhVarM4, bc5Var);
                int iJ2 = rjeVar8.j(rjeVar8.c, v0aVar20, vyhVarM4, bc5Var);
                if (iJ == 1) {
                    iJ = iJ2;
                }
                if ((iJ & 2) != 0 && (z2 = this.t1) && z2) {
                    this.t1 = false;
                    if (this.I.p) {
                        this.h.i(i);
                    }
                }
                this.u1 -= iC - rjeVarArr3[i14].c();
                z6 &= (iJ & 1) != 0;
            }
            if (z6) {
                for (int i15 = 0; i15 < rjeVarArr3.length; i15++) {
                    if (vyhVarM4.C(i15) && rjeVarArr3[i15].d(v0aVar20) == null) {
                        j(v0aVar20, i15, false, v0aVar20.k());
                    }
                }
            }
            if (z6) {
                x0aVar7.j.h = true;
            }
        }
        rje[] rjeVarArr4 = this.a;
        x0a x0aVar8 = this.s;
        boolean z7 = false;
        while (r0() && !this.Y && (v0aVar2 = x0aVar8.i) != null && (v0aVarH = v0aVar2.h()) != null && this.w1 >= v0aVarH.k() && v0aVarH.h) {
            if (z7) {
                F();
            }
            this.E1 = false;
            v0a v0aVarA = x0aVar8.a();
            v0aVarA.getClass();
            if (this.I.b.a.equals(v0aVarA.g.a.a)) {
                x4a x4aVar = this.I.b;
                if (x4aVar.b == -1) {
                    x4a x4aVar2 = v0aVarA.g.a;
                    if (x4aVar2.b != -1 || x4aVar.e == x4aVar2.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            w0a w0aVar = v0aVarA.g;
            boolean z8 = z;
            x4a x4aVar3 = w0aVar.a;
            long j9 = w0aVar.b;
            this.I = y(x4aVar3, j9, w0aVar.c, j9, !z8, 0);
            Q();
            B0();
            if (e() && v0aVarA == x0aVar8.k) {
                for (rje rjeVar9 : rjeVarArr4) {
                    int i16 = rjeVar9.d;
                    if (i16 == 3 || i16 == 4) {
                        boolean z9 = i16 == 4;
                        ks0 ks0Var6 = rjeVar9.a;
                        ks0 ks0Var7 = rjeVar9.c;
                        if (z9) {
                            ks0Var7.getClass();
                            ks0Var7.a(17, ks0Var6);
                        } else {
                            ks0Var7.getClass();
                            ks0Var6.a(17, ks0Var7);
                        }
                        rjeVar9.d = rjeVar9.d == 4 ? 0 : 1;
                    } else if (i16 == i) {
                        rjeVar9.d = 0;
                    }
                }
            }
            if (this.I.e == 3) {
                t0();
            }
            vyh vyhVarM5 = x0aVar8.i.m();
            for (int i17 = 0; i17 < rjeVarArr4.length; i17++) {
                if (vyhVarM5.C(i17)) {
                    rje rjeVar10 = rjeVarArr4[i17];
                    ks0 ks0Var8 = rjeVar10.c;
                    ks0 ks0Var9 = rjeVar10.a;
                    if (rje.h(ks0Var9)) {
                        ks0Var9.e();
                    } else if (ks0Var8 != null && ks0Var8.h != 0) {
                        ks0Var8.e();
                    }
                }
            }
            z7 = true;
        }
        this.C1.getClass();
    }
}
