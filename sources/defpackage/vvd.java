package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class vvd implements u0a, lj6, w99, z99, vye {
    public static final Map q1;
    public static final b87 r1;
    public boolean A;
    public ljf B;
    public xbf C;
    public long D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public long X;
    public long Y;
    public boolean Z;
    public final Uri a;
    public final u25 b;
    public final ev5 c;
    public final l6m d;
    public final ed7 e;
    public final av5 f;
    public final yvd g;
    public final qf h;
    public final String i;
    public final long j;
    public final b87 k;
    public final long l;
    public final dc9 m;
    public final xtj n;
    public int n1;
    public final r94 o;
    public boolean o1;
    public final ovd p;
    public boolean p1;
    public final ovd q;
    public final Handler r;
    public t0a s;
    public z38 t;
    public rvd[] u;
    public wye[] v;
    public uvd[] w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        q1 = Collections.unmodifiableMap(map);
        a87 a87Var = new a87();
        a87Var.a = "icy";
        a87Var.m = uya.n("application/x-icy");
        r1 = new b87(a87Var);
    }

    public vvd(Uri uri, u25 u25Var, xtj xtjVar, ev5 ev5Var, av5 av5Var, l6m l6mVar, ed7 ed7Var, yvd yvdVar, qf qfVar, String str, int i, b87 b87Var, long j, she sheVar) {
        this.a = uri;
        this.b = u25Var;
        this.c = ev5Var;
        this.f = av5Var;
        this.d = l6mVar;
        this.e = ed7Var;
        this.g = yvdVar;
        this.h = qfVar;
        this.i = str;
        this.j = i;
        this.k = b87Var;
        this.m = sheVar != null ? new dc9(sheVar) : new dc9("ProgressiveMediaPeriod", 1);
        this.n = xtjVar;
        this.l = j;
        this.o = new r94();
        this.p = new ovd(this, 1);
        this.q = new ovd(this, 2);
        this.r = vqi.p(null);
        this.w = new uvd[0];
        this.v = new wye[0];
        this.u = new rvd[0];
        this.Y = -9223372036854775807L;
        this.F = 1;
    }

    public final void A(int i) {
        f();
        ljf ljfVar = this.B;
        boolean[] zArr = (boolean[]) ljfVar.e;
        if (zArr[i]) {
            return;
        }
        b87 b87Var = ((iyh) ljfVar.b).a(i).d[0];
        this.e.E(uya.h(b87Var.n), b87Var, 0, null, this.X);
        zArr[i] = true;
    }

    public final void B(int i) {
        f();
        if (this.Z) {
            if ((!this.z || ((boolean[]) this.B.c)[i]) && !this.v[i].x(false)) {
                this.Y = 0L;
                this.Z = false;
                this.H = true;
                this.X = 0L;
                this.n1 = 0;
                for (wye wyeVar : this.v) {
                    wyeVar.D(false);
                }
                t0a t0aVar = this.s;
                t0aVar.getClass();
                t0aVar.q(this);
            }
        }
    }

    public final kyh C(uvd uvdVar) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            if (uvdVar.equals(this.w[i])) {
                return this.v[i];
            }
        }
        if (this.x) {
            lvb.G0("ProgressiveMediaPeriod", "Extractor added new track (id=" + uvdVar.a + ") after finishing tracks.");
            return new nm5();
        }
        ev5 ev5Var = this.c;
        ev5Var.getClass();
        wye wyeVar = new wye(this.h, ev5Var, this.f);
        rvd rvdVar = new rvd(wyeVar);
        wyeVar.f = this;
        int i2 = length + 1;
        uvd[] uvdVarArr = (uvd[]) Arrays.copyOf(this.w, i2);
        uvdVarArr[length] = uvdVar;
        this.w = uvdVarArr;
        wye[] wyeVarArr = (wye[]) Arrays.copyOf(this.v, i2);
        wyeVarArr[length] = wyeVar;
        this.v = wyeVarArr;
        rvd[] rvdVarArr = (rvd[]) Arrays.copyOf(this.u, i2);
        rvdVarArr[length] = rvdVar;
        this.u = rvdVarArr;
        return rvdVar;
    }

    @Override // defpackage.lj6
    public final void D() {
        this.x = true;
        this.r.post(this.p);
    }

    public final void E(xbf xbfVar) {
        this.C = this.t == null ? xbfVar : new vk0(-9223372036854775807L);
        this.D = xbfVar.h();
        boolean z = !this.K && xbfVar.h() == -9223372036854775807L;
        this.E = z;
        this.F = z ? 7 : 1;
        if (this.y) {
            this.g.x(this.D, xbfVar, z);
        } else {
            z();
        }
    }

    public final void F() {
        svd svdVar = new svd(this, this.a, this.b, this.n, this, this.o);
        if (this.y) {
            lvb.b0(q());
            long j = this.D;
            if (j != -9223372036854775807L && this.Y > j) {
                this.o1 = true;
                this.Y = -9223372036854775807L;
                return;
            }
            xbf xbfVar = this.C;
            xbfVar.getClass();
            long j2 = xbfVar.d(this.Y).a.b;
            long j3 = this.Y;
            svdVar.f.a = j2;
            svdVar.i = j3;
            svdVar.h = true;
            svdVar.l = false;
            for (wye wyeVar : this.v) {
                wyeVar.t = this.Y;
            }
            this.Y = -9223372036854775807L;
        }
        this.n1 = m();
        this.m.N(svdVar, this, this.d.o(this.F));
    }

    @Override // defpackage.lj6
    public final kyh G(int i, int i2) {
        return C(new uvd(i, false));
    }

    public final boolean H() {
        return this.H || q();
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        rg6 rg6Var;
        f();
        ljf ljfVar = this.B;
        iyh iyhVar = (iyh) ljfVar.b;
        boolean[] zArr3 = (boolean[]) ljfVar.d;
        int i = this.J;
        int i2 = 0;
        for (int i3 = 0; i3 < rg6VarArr.length; i3++) {
            xye xyeVar = xyeVarArr[i3];
            if (xyeVar != null && (rg6VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((tvd) xyeVar).a;
                lvb.b0(zArr3[i4]);
                this.J--;
                zArr3[i4] = false;
                xyeVarArr[i3] = null;
            }
        }
        boolean z = !this.G ? j == 0 || this.A : i != 0;
        for (int i5 = 0; i5 < rg6VarArr.length; i5++) {
            if (xyeVarArr[i5] == null && (rg6Var = rg6VarArr[i5]) != null) {
                lvb.b0(rg6Var.length() == 1);
                lvb.b0(rg6Var.e(0) == 0);
                int iB = iyhVar.b(rg6Var.m());
                lvb.b0(!zArr3[iB]);
                this.J++;
                zArr3[iB] = true;
                this.I = rg6Var.s().t | this.I;
                xyeVarArr[i5] = new tvd(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    wye wyeVar = this.v[iB];
                    z = (wyeVar.t() == 0 || wyeVar.F(j, true)) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.Z = false;
            this.H = false;
            this.I = false;
            dc9 dc9Var = this.m;
            if (dc9Var.J()) {
                wye[] wyeVarArr = this.v;
                int length = wyeVarArr.length;
                while (i2 < length) {
                    wyeVarArr[i2].k();
                    i2++;
                }
                dc9Var.A();
            } else {
                this.o1 = false;
                for (wye wyeVar2 : this.v) {
                    wyeVar2.D(false);
                }
            }
        } else if (z) {
            j = g(j);
            while (i2 < xyeVarArr.length) {
                if (xyeVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.G = true;
        return j;
    }

    @Override // defpackage.vye
    public final void b() {
        this.r.post(this.p);
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        f();
        if (!this.C.f()) {
            return 0L;
        }
        wbf wbfVarD = this.C.d(j);
        return ybfVar.a(j, wbfVarD.a.a, wbfVarD.b.a);
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        svd svdVar = (svd) y99Var;
        lkg lkgVar = svdVar.b;
        t99 t99Var = new t99(svdVar.j, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.d.getClass();
        this.e.N(t99Var, 1, -1, null, 0, null, svdVar.i, this.D);
        if (z) {
            return;
        }
        for (wye wyeVar : this.v) {
            wyeVar.D(false);
        }
        if (this.J > 0) {
            t0a t0aVar = this.s;
            t0aVar.getClass();
            t0aVar.q(this);
        }
    }

    @Override // defpackage.vhf
    public final long e() {
        return v();
    }

    public final void f() {
        lvb.b0(this.y);
        this.B.getClass();
        this.C.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[LOOP:1: B:42:0x008d->B:43:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[LOOP:2: B:47:0x00a2->B:48:0x00a4, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x008a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x009b, please report this as an issue */
    @Override // defpackage.u0a
    public final long g(long j) {
        int i;
        f();
        boolean[] zArr = (boolean[]) this.B.c;
        if (!this.C.f()) {
            j = 0;
        }
        this.H = false;
        boolean z = this.X == j;
        this.X = j;
        if (q()) {
            this.Y = j;
            return j;
        }
        int i2 = this.F;
        dc9 dc9Var = this.m;
        if (i2 == 7 || !(this.o1 || dc9Var.J())) {
            this.Z = false;
            this.Y = j;
            this.o1 = false;
            this.I = false;
            if (dc9Var.J()) {
                dc9Var.d = null;
                for (wye wyeVar : this.v) {
                    wyeVar.D(false);
                }
                break;
            }
            for (wye wyeVar2 : this.v) {
                wyeVar2.k();
            }
            dc9Var.A();
            return j;
        }
        int length = this.v.length;
        for (int i3 = 0; i3 < length; i3++) {
            wye wyeVar3 = this.v[i3];
            if (this.u[i3].d.get() == qvd.a && (wyeVar3.t() != 0 || !z)) {
                if (!(this.A ? wyeVar3.E(wyeVar3.q) : wyeVar3.F(j, this.o1)) && (zArr[i3] || !this.z)) {
                    this.Z = false;
                    this.Y = j;
                    this.o1 = false;
                    this.I = false;
                    if (dc9Var.J()) {
                        dc9Var.d = null;
                        while (i < r0) {
                            wyeVar.D(false);
                        }
                        break;
                        break;
                    }
                    while (i < r0) {
                        wyeVar2.k();
                    }
                    dc9Var.A();
                    return j;
                }
            }
        }
        return j;
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        svd svdVar = (svd) y99Var;
        if (this.D == -9223372036854775807L && this.C != null) {
            long jO = o(true);
            long j3 = jO == Long.MIN_VALUE ? 0L : jO + 10000;
            this.D = j3;
            this.g.x(j3, this.C, this.E);
        }
        lkg lkgVar = svdVar.b;
        t99 t99Var = new t99(svdVar.j, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.d.getClass();
        this.e.O(t99Var, 1, -1, null, 0, null, svdVar.i, this.D);
        this.o1 = true;
        t0a t0aVar = this.s;
        t0aVar.getClass();
        t0aVar.q(this);
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.m.J() && this.o.e();
    }

    @Override // defpackage.u0a
    public final long k() {
        if (this.I) {
            this.I = false;
            return this.X;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.o1 && m() <= this.n1) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.X;
    }

    @Override // defpackage.z99
    public final void l() {
        for (wye wyeVar : this.v) {
            wyeVar.D(true);
            xu5 xu5Var = wyeVar.h;
            if (xu5Var != null) {
                xu5Var.f(wyeVar.e);
                wyeVar.h = null;
                wyeVar.g = null;
            }
        }
        xtj xtjVar = this.n;
        jj6 jj6Var = (jj6) xtjVar.c;
        if (jj6Var != null) {
            jj6Var.release();
            xtjVar.c = null;
        }
        xtjVar.d = null;
    }

    public final int m() {
        int i = 0;
        for (wye wyeVar : this.v) {
            i += wyeVar.q + wyeVar.p;
        }
        return i;
    }

    @Override // defpackage.u0a
    public final void n() throws IOException {
        int iO = this.d.o(this.F);
        dc9 dc9Var = this.m;
        IOException iOException = (IOException) dc9Var.d;
        if (iOException != null) {
            throw iOException;
        }
        x99 x99Var = (x99) dc9Var.c;
        if (x99Var != null) {
            if (iO == Integer.MIN_VALUE) {
                iO = x99Var.a;
            }
            IOException iOException2 = x99Var.e;
            if (iOException2 != null && x99Var.f > iO) {
                throw iOException2;
            }
        }
        if (this.o1 && !this.y) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long o(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.v.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.v[i].q());
            } else {
                ljf ljfVar = this.B;
                ljfVar.getClass();
                if (((boolean[]) ljfVar.d)[i]) {
                    jMax = Math.max(jMax, this.v[i].q());
                }
            }
        }
        return jMax;
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        svd svdVar = (svd) y99Var;
        lkg lkgVar = svdVar.b;
        this.e.R(i == 0 ? new t99(j, svdVar.j) : new t99(svdVar.j, lkgVar.c, lkgVar.d, j, j2, lkgVar.b), 1, -1, null, 0, null, svdVar.i, this.D, i);
    }

    public final boolean q() {
        return this.Y != -9223372036854775807L;
    }

    @Override // defpackage.lj6
    public final void r(xbf xbfVar) {
        this.r.post(new i7b(this, 25, xbfVar));
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.s = t0aVar;
        b87 b87Var = this.k;
        if (b87Var == null) {
            this.o.f();
            F();
        } else {
            G(0, 3).g(b87Var);
            E(new ad8(-9223372036854775807L, new long[]{0}, new long[]{0}));
            D();
            this.Y = j;
        }
    }

    @Override // defpackage.u0a
    public final iyh t() {
        f();
        return (iyh) this.B.b;
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        if (this.o1) {
            return false;
        }
        dc9 dc9Var = this.m;
        if (dc9Var.I() || this.Z) {
            return false;
        }
        if ((this.y || this.k != null) && this.J == 0) {
            return false;
        }
        boolean zF = this.o.f();
        if (dc9Var.J()) {
            return zF;
        }
        F();
        return true;
    }

    @Override // defpackage.vhf
    public final long v() {
        long jO;
        boolean z;
        f();
        if (this.o1 || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.Y;
        }
        if (this.z) {
            int length = this.v.length;
            jO = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ljf ljfVar = this.B;
                if (((boolean[]) ljfVar.c)[i] && ((boolean[]) ljfVar.d)[i]) {
                    wye wyeVar = this.v[i];
                    synchronized (wyeVar) {
                        z = wyeVar.w;
                    }
                    if (!z) {
                        jO = Math.min(jO, this.v[i].q());
                    }
                }
            }
        } else {
            jO = Long.MAX_VALUE;
        }
        if (jO == BuildConfig.MAX_TIME_TO_UPLOAD) {
            jO = o(false);
        }
        return jO == Long.MIN_VALUE ? this.X : jO;
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        if (this.A) {
            return;
        }
        f();
        if (q()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.B.d;
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            this.v[i].j(j, z, zArr[i]);
        }
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        dc1 dc1Var;
        xbf xbfVar;
        svd svdVar = (svd) y99Var;
        lkg lkgVar = svdVar.b;
        t99 t99Var = new t99(svdVar.j, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        vqi.p0(svdVar.i);
        vqi.p0(this.D);
        long jQ = this.d.q(new mf(iOException, i, 7));
        if (jQ == -9223372036854775807L) {
            dc1Var = dc9.g;
        } else {
            int iM = m();
            int i2 = iM > this.n1 ? 1 : 0;
            if (this.K || !((xbfVar = this.C) == null || xbfVar.h() == -9223372036854775807L)) {
                this.n1 = iM;
            } else if (!this.y || H()) {
                this.H = this.y;
                this.X = 0L;
                this.n1 = 0;
                for (wye wyeVar : this.v) {
                    wyeVar.D(false);
                }
                svdVar.f.a = 0L;
                svdVar.i = 0L;
                svdVar.h = true;
                svdVar.l = false;
            } else {
                this.Z = true;
                dc1Var = dc9.f;
            }
            dc1Var = new dc1(i2, jQ, false);
        }
        this.e.P(t99Var, 1, -1, null, 0, null, svdVar.i, this.D, iOException, !dc1Var.f());
        return dc1Var;
    }

    @Override // defpackage.vhf
    public final void y(long j) {
    }

    public final void z() {
        long j;
        if (this.p1 || this.y || !this.x || this.C == null) {
            return;
        }
        for (wye wyeVar : this.v) {
            if (wyeVar.w() == null) {
                return;
            }
        }
        this.o.d();
        int length = this.v.length;
        hyh[] hyhVarArr = new hyh[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.l;
            if (i >= length) {
                break;
            }
            b87 b87VarW = this.v[i].w();
            b87VarW.getClass();
            String str = b87VarW.n;
            boolean zI = uya.i(str);
            boolean z = zI || uya.m(str);
            zArr[i] = z;
            this.z = z | this.z;
            this.A = j != -9223372036854775807L && length == 1 && uya.k(str);
            z38 z38Var = this.t;
            if (z38Var != null) {
                int i2 = z38Var.a;
                if (zI || this.w[i].b) {
                    lwa lwaVar = b87VarW.l;
                    lwa lwaVar2 = lwaVar == null ? new lwa(z38Var) : lwaVar.a(z38Var);
                    a87 a87VarA = b87VarW.a();
                    a87VarA.k = lwaVar2;
                    b87VarW = new b87(a87VarA);
                }
                if (zI && b87VarW.h == -1 && b87VarW.i == -1 && i2 != -1) {
                    a87 a87VarA2 = b87VarW.a();
                    a87VarA2.h = i2;
                    b87VarW = new b87(a87VarA2);
                }
            }
            int iC = this.c.c(b87VarW);
            a87 a87VarA3 = b87VarW.a();
            a87VarA3.N = iC;
            b87 b87Var = new b87(a87VarA3);
            hyhVarArr[i] = new hyh(Integer.toString(i), b87Var);
            this.I = b87Var.t | this.I;
            i++;
        }
        this.B = new ljf(new iyh(hyhVarArr), zArr);
        if (this.A && this.D == -9223372036854775807L) {
            this.D = j;
            this.C = new pvd(this, this.C);
        }
        this.g.x(this.D, this.C, this.E);
        this.y = true;
        t0a t0aVar = this.s;
        t0aVar.getClass();
        t0aVar.C(this);
    }
}
