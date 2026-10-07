package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class v0a {
    public final u0a a;
    public final Object b;
    public final xye[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public w0a g;
    public boolean h;
    public final boolean[] i;
    public final ks0[] j;
    public final uyh k;
    public final n5a l;
    public v0a m;
    public iyh n;
    public vyh o;
    public long p;

    public v0a(ks0[] ks0VarArr, long j, uyh uyhVar, qf qfVar, n5a n5aVar, w0a w0aVar, vyh vyhVar) {
        this.j = ks0VarArr;
        this.p = j;
        this.k = uyhVar;
        this.l = n5aVar;
        x4a x4aVar = w0aVar.a;
        this.b = x4aVar.a;
        this.g = w0aVar;
        this.n = iyh.d;
        this.o = vyhVar;
        this.c = new xye[ks0VarArr.length];
        this.i = new boolean[ks0VarArr.length];
        long j2 = w0aVar.b;
        long j3 = w0aVar.d;
        boolean z = w0aVar.f;
        n5aVar.getClass();
        Object obj = x4aVar.a;
        int i = l0.g;
        Object obj2 = ((Pair) obj).first;
        x4a x4aVarA = x4aVar.a(((Pair) obj).second);
        m5a m5aVar = (m5a) ((HashMap) n5aVar.e).get(obj2);
        m5aVar.getClass();
        ((HashSet) n5aVar.h).add(m5aVar);
        l5a l5aVar = (l5a) ((HashMap) n5aVar.f).get(m5aVar);
        if (l5aVar != null) {
            l5aVar.a.h(l5aVar.b);
        }
        m5aVar.c.add(x4aVarA);
        u0a u0aVarE = m5aVar.a.e(x4aVarA, qfVar, j2);
        ((IdentityHashMap) n5aVar.d).put(u0aVarE, m5aVar);
        n5aVar.d();
        this.a = j3 != -9223372036854775807L ? new kt3(u0aVarE, !z, 0L, j3) : u0aVarE;
    }

    public final long a(vyh vyhVar, long j) {
        return b(vyhVar, j, false, new boolean[this.j.length]);
    }

    public final long b(vyh vyhVar, long j, boolean z, boolean[] zArr) {
        ks0[] ks0VarArr;
        xye[] xyeVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= vyhVar.b) {
                break;
            }
            if (z || !vyhVar.B(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            ks0VarArr = this.j;
            int length = ks0VarArr.length;
            xyeVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (ks0VarArr[i2].b == -2) {
                xyeVarArr[i2] = null;
            }
            i2++;
        }
        e();
        this.o = vyhVar;
        f();
        long jA = this.a.a((rg6[]) vyhVar.d, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < ks0VarArr.length; i3++) {
            if (ks0VarArr[i3].b == -2 && this.o.C(i3)) {
                xyeVarArr[i3] = new x66();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < xyeVarArr.length; i4++) {
            if (xyeVarArr[i4] != null) {
                lvb.b0(vyhVar.C(i4));
                if (ks0VarArr[i4].b != -2) {
                    this.f = true;
                }
            } else {
                lvb.b0(((rg6[]) vyhVar.d)[i4] == null);
            }
        }
        return jA;
    }

    public final boolean c(w0a w0aVar) {
        w0a w0aVar2 = this.g;
        long j = w0aVar2.e;
        return (j == -9223372036854775807L || j == w0aVar.e) && w0aVar2.b == w0aVar.b && w0aVar2.a.equals(w0aVar.a);
    }

    public final void d(fa9 fa9Var) {
        lvb.b0(this.m == null);
        this.a.u(fa9Var);
    }

    public final void e() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            vyh vyhVar = this.o;
            if (i >= vyhVar.b) {
                return;
            }
            boolean zC = vyhVar.C(i);
            rg6 rg6Var = ((rg6[]) this.o.d)[i];
            if (zC && rg6Var != null) {
                rg6Var.f();
            }
            i++;
        }
    }

    public final void f() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            vyh vyhVar = this.o;
            if (i >= vyhVar.b) {
                return;
            }
            boolean zC = vyhVar.C(i);
            rg6 rg6Var = ((rg6[]) this.o.d)[i];
            if (zC && rg6Var != null) {
                rg6Var.p();
            }
            i++;
        }
    }

    public final long g() {
        if (!this.e) {
            return this.g.b;
        }
        long jV = this.f ? this.a.v() : Long.MIN_VALUE;
        return jV == Long.MIN_VALUE ? this.g.e : jV;
    }

    public final v0a h() {
        return this.m;
    }

    public final long i() {
        if (this.e) {
            return this.a.e();
        }
        return 0L;
    }

    public final long j() {
        return this.p;
    }

    public final long k() {
        return this.g.b + this.p;
    }

    public final iyh l() {
        return this.n;
    }

    public final vyh m() {
        return this.o;
    }

    public final void n(float f, ush ushVar, boolean z) {
        this.e = true;
        this.n = this.a.t();
        vyh vyhVarU = u(f, ushVar, z);
        w0a w0aVar = this.g;
        long jMax = w0aVar.b;
        long j = w0aVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(vyhVarU, jMax);
        long j2 = this.p;
        w0a w0aVar2 = this.g;
        this.p = (w0aVar2.b - jA) + j2;
        this.g = w0aVar2.b(jA);
    }

    public final boolean o() {
        try {
            if (!this.e) {
                this.a.n();
                return false;
            }
            for (xye xyeVar : this.c) {
                if (xyeVar != null) {
                    xyeVar.b();
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public final boolean p() {
        if (this.e) {
            return !this.f || this.a.v() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean q() {
        if (this.e) {
            return p() || g() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void r(kg6 kg6Var, long j) {
        this.d = true;
        this.a.s(kg6Var, j);
    }

    public final void s(long j) {
        lvb.b0(this.m == null);
        if (this.e) {
            this.a.y(j - this.p);
        }
    }

    public final void t() {
        e();
        u0a u0aVar = this.a;
        try {
            boolean z = u0aVar instanceof kt3;
            n5a n5aVar = this.l;
            if (z) {
                n5aVar.h(((kt3) u0aVar).a);
            } else {
                n5aVar.h(u0aVar);
            }
        } catch (RuntimeException e) {
            lvb.l0("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final vyh u(float f, ush ushVar, boolean z) {
        iyh iyhVar = this.n;
        x4a x4aVar = this.g.a;
        uyh uyhVar = this.k;
        ks0[] ks0VarArr = this.j;
        vyh vyhVarB = uyhVar.b(ks0VarArr, iyhVar, x4aVar, ushVar);
        rg6[] rg6VarArr = (rg6[]) vyhVarB.d;
        for (int i = 0; i < vyhVarB.b; i++) {
            boolean z2 = true;
            if (vyhVarB.C(i)) {
                if (rg6VarArr[i] == null && ks0VarArr[i].b != -2) {
                    z2 = false;
                }
                lvb.b0(z2);
            } else {
                lvb.b0(rg6VarArr[i] == null);
            }
        }
        for (rg6 rg6Var : rg6VarArr) {
            if (rg6Var != null) {
                rg6Var.h(f);
                rg6Var.o(z);
            }
        }
        return vyhVarB;
    }

    public final void v(v0a v0aVar) {
        if (v0aVar == this.m) {
            return;
        }
        e();
        this.m = v0aVar;
        f();
    }

    public final void w(long j) {
        this.p = j;
    }

    public final long x(long j) {
        return j - this.p;
    }

    public final long y(long j) {
        return j + this.p;
    }

    public final void z() {
        u0a u0aVar = this.a;
        if (u0aVar instanceof kt3) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            kt3 kt3Var = (kt3) u0aVar;
            kt3Var.f = 0L;
            kt3Var.g = j;
        }
    }
}
