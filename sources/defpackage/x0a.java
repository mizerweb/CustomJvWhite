package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class x0a {
    public final r75 c;
    public final sfh d;
    public final gve e;
    public long f;
    public int g;
    public boolean h;
    public v0a i;
    public v0a j;
    public v0a k;
    public v0a l;
    public v0a m;
    public int n;
    public Object o;
    public long p;
    public final rsh a = new rsh();
    public final tsh b = new tsh();
    public ArrayList q = new ArrayList();

    public x0a(r75 r75Var, sfh sfhVar, gve gveVar) {
        this.c = r75Var;
        this.d = sfhVar;
        this.e = gveVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static x4a o(ush ushVar, Object obj, long j, long j2, tsh tshVar, rsh rshVar) {
        ushVar.g(obj, rshVar);
        ushVar.n(rshVar.c, tshVar);
        int iB = ushVar.b(obj);
        Object obj2 = obj;
        while (true) {
            int i = rshVar.g.a;
            if (i == 0) {
                break;
            }
            if ((i == 1 && rshVar.g(0)) || !rshVar.h(rshVar.g.d)) {
                break;
            }
            long j3 = 0;
            if (rshVar.c(0L) != -1) {
                break;
            }
            if (rshVar.d == 0) {
                if (iB <= tshVar.n) {
                    break;
                    break;
                }
                ushVar.f(iB, rshVar, true);
                obj2 = rshVar.b;
                obj2.getClass();
                iB++;
            } else {
                int i2 = i - (rshVar.g(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += rshVar.g.a(i3).j;
                }
                if (rshVar.d > j3) {
                    break;
                }
                if (iB <= tshVar.n) {
                    break;
                }
                ushVar.f(iB, rshVar, true);
                obj2 = rshVar.b;
                obj2.getClass();
                iB++;
            }
        }
        ushVar.g(obj2, rshVar);
        int iC = rshVar.c(j);
        return iC == -1 ? new x4a(obj2, j2, rshVar.b(j)) : new x4a(obj2, iC, rshVar.f(iC), j2, -1);
    }

    public final v0a a() {
        v0a v0aVar = this.i;
        if (v0aVar == null) {
            return null;
        }
        if (v0aVar == this.j) {
            this.j = v0aVar.h();
        }
        v0a v0aVar2 = this.i;
        if (v0aVar2 == this.k) {
            this.k = v0aVar2.h();
        }
        this.i.t();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            v0a v0aVar3 = this.i;
            this.o = v0aVar3.b;
            this.p = v0aVar3.g.a.d;
        }
        this.i = this.i.h();
        m();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        v0a v0aVarH = this.i;
        v0aVarH.getClass();
        this.o = v0aVarH.b;
        this.p = v0aVarH.g.a.d;
        while (v0aVarH != null) {
            v0aVarH.t();
            v0aVarH = v0aVarH.h();
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    public final w0a c(ush ushVar, v0a v0aVar, long j) {
        Object obj;
        long j2;
        long j3;
        long j4;
        w0a w0aVar = v0aVar.g;
        x4a x4aVar = w0aVar.a;
        long j5 = w0aVar.c;
        int iD = ushVar.d(ushVar.b(x4aVar.a), this.a, this.b, this.g, this.h);
        if (iD == -1) {
            return null;
        }
        rsh rshVar = this.a;
        int i = ushVar.f(iD, rshVar, true).c;
        Object obj2 = rshVar.b;
        obj2.getClass();
        long j6 = x4aVar.d;
        long j7 = 0;
        if (ushVar.m(i, this.b, 0L).m == iD) {
            Pair pairJ = ushVar.j(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairJ == null) {
                return null;
            }
            Object obj3 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            v0a v0aVarH = v0aVar.h();
            if (v0aVarH == null || !v0aVarH.b.equals(obj3)) {
                long jQ = q(obj3);
                if (jQ == -1) {
                    jQ = this.f;
                    this.f = 1 + jQ;
                }
                j6 = jQ;
            } else {
                j6 = v0aVarH.g.a.d;
            }
            obj = obj3;
            j2 = jLongValue;
            j7 = -9223372036854775807L;
        } else {
            obj = obj2;
            j2 = 0;
        }
        x4a x4aVarO = o(ushVar, obj, j2, j6, this.b, this.a);
        if (j7 == -9223372036854775807L || j5 == -9223372036854775807L) {
            j3 = j2;
            j4 = j7;
        } else {
            int i2 = ushVar.g(x4aVar.a, rshVar).g.a;
            int i3 = rshVar.g.d;
            boolean z = i2 > 0 && rshVar.h(i3) && (i2 > 1 || rshVar.d(i3) != Long.MIN_VALUE);
            if (x4aVarO.b() && z) {
                j3 = j2;
                j4 = j5;
            } else {
                if (z) {
                    j3 = j5;
                } else {
                    j3 = j2;
                }
                j4 = j7;
            }
        }
        return e(ushVar, x4aVarO, j4, j3);
    }

    public final w0a d(ush ushVar, v0a v0aVar, long j) {
        ush ushVar2;
        w0a w0aVar = v0aVar.g;
        long j2 = (v0aVar.j() + w0aVar.e) - j;
        if (w0aVar.h) {
            return c(ushVar, v0aVar, j2);
        }
        w0a w0aVar2 = v0aVar.g;
        x4a x4aVar = w0aVar2.a;
        Object obj = x4aVar.a;
        int i = x4aVar.e;
        rsh rshVar = this.a;
        ushVar.g(obj, rshVar);
        boolean z = w0aVar2.g;
        if (!x4aVar.b()) {
            if (i != -1 && rshVar.g(i)) {
                return c(ushVar, v0aVar, j2);
            }
            int iF = rshVar.f(i);
            boolean z2 = rshVar.h(i) && rshVar.e(i, iF) == 3;
            if (iF != rshVar.g.a(i).b && !z2) {
                return f(ushVar, x4aVar.a, x4aVar.e, iF, w0aVar2.e, x4aVar.d, z);
            }
            ushVar.g(obj, rshVar);
            long jD = rshVar.d(i);
            return g(ushVar, x4aVar.a, jD == Long.MIN_VALUE ? rshVar.d : rshVar.g.a(i).j + jD, w0aVar2.e, x4aVar.d, false);
        }
        int i2 = x4aVar.b;
        int i3 = rshVar.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = rshVar.g.a(i2).a(x4aVar.c);
        if (iA < i3) {
            return f(ushVar, x4aVar.a, i2, iA, w0aVar2.c, x4aVar.d, z);
        }
        long jLongValue = w0aVar2.c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = ushVar.j(this.b, rshVar, rshVar.c, -9223372036854775807L, Math.max(0L, j2));
            ushVar2 = ushVar;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            ushVar2 = ushVar;
        }
        int i4 = x4aVar.b;
        ushVar2.g(obj, rshVar);
        long jD2 = rshVar.d(i4);
        return g(ushVar, x4aVar.a, Math.max(jD2 == Long.MIN_VALUE ? rshVar.d : rshVar.g.a(i4).j + jD2, jLongValue), w0aVar2.c, x4aVar.d, z);
    }

    public final w0a e(ush ushVar, x4a x4aVar, long j, long j2) {
        ushVar.g(x4aVar.a, this.a);
        boolean zB = x4aVar.b();
        Object obj = x4aVar.a;
        return zB ? f(ushVar, obj, x4aVar.b, x4aVar.c, j, x4aVar.d, false) : g(ushVar, obj, j2, j, x4aVar.d, false);
    }

    public final w0a f(ush ushVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        x4a x4aVar = new x4a(obj, i, i2, j2, -1);
        rsh rshVar = this.a;
        long jA = ushVar.g(obj, rshVar).a(i, i2);
        long jMax = i2 == rshVar.f(i) ? rshVar.g.b : 0L;
        boolean zH = rshVar.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new w0a(x4aVar, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    public final w0a g(ush ushVar, Object obj, long j, long j2, long j3, boolean z) {
        da daVarA;
        int i;
        boolean z2;
        long j4;
        long jD;
        long j5;
        long jMax;
        rsh rshVar = this.a;
        ushVar.g(obj, rshVar);
        int iB = rshVar.b(j);
        int i2 = 1;
        if (iB == -1) {
            fa faVar = rshVar.g;
            if (faVar.a <= 0 || !rshVar.h(faVar.d)) {
                z2 = false;
                break;
            }
            z2 = true;
        } else {
            if (!rshVar.h(iB) || rshVar.d(iB) != rshVar.d || (i = (daVarA = rshVar.g.a(iB)).b) == -1) {
                z2 = false;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    z2 = true;
                    iB = -1;
                    break;
                }
                int i4 = daVarA.f[i3];
                if (i4 == 0 || i4 == 1) {
                    z2 = false;
                    break;
                }
                i3++;
            }
        }
        x4a x4aVar = new x4a(obj, j3, iB);
        boolean z3 = !x4aVar.b() && iB == -1;
        boolean zK = k(ushVar, x4aVar);
        boolean zJ = j(ushVar, x4aVar, z3);
        boolean z4 = (iB == -1 || !rshVar.h(iB) || rshVar.g(iB)) ? false : true;
        boolean z5 = iB != -1 && rshVar.g(iB) && rshVar.h(iB);
        if (iB == -1 || z5) {
            if (z2) {
                jD = rshVar.d;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = rshVar.d;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L || j < j5) {
                jMax = j;
            } else {
                if (!zJ && z2) {
                    i2 = 0;
                }
                jMax = Math.max(0L, j5 - ((long) i2));
            }
            return new w0a(x4aVar, jMax, j2, j4, j5, z, z4, z3, zK, zJ);
        }
        jD = rshVar.d(iB);
        j4 = jD;
        if (j4 != -9223372036854775807L) {
            j5 = rshVar.d;
        } else {
            j5 = rshVar.d;
        }
        if (j5 != -9223372036854775807L) {
            jMax = j;
        } else {
            jMax = j;
        }
        return new w0a(x4aVar, jMax, j2, j4, j5, z, z4, z3, zK, zJ);
    }

    public final v0a h() {
        return this.k;
    }

    public final w0a i(ush ushVar, w0a w0aVar) {
        long jA;
        boolean z;
        x4a x4aVar = w0aVar.a;
        boolean zB = x4aVar.b();
        int i = x4aVar.e;
        boolean zH = false;
        boolean z2 = !zB && i == -1;
        int i2 = x4aVar.b;
        boolean zK = k(ushVar, x4aVar);
        boolean zJ = j(ushVar, x4aVar, z2);
        Object obj = x4aVar.a;
        rsh rshVar = this.a;
        ushVar.g(obj, rshVar);
        long jD = (x4aVar.b() || i == -1) ? -9223372036854775807L : rshVar.d(i);
        if (x4aVar.b()) {
            jA = rshVar.a(i2, x4aVar.c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? rshVar.d : jD;
        }
        if (!x4aVar.b()) {
            if (i != -1 && rshVar.h(i)) {
                z = true;
            }
            return new w0a(x4aVar, w0aVar.b, w0aVar.c, jD, jA, w0aVar.f, z, z2, zK, zJ);
        }
        zH = rshVar.h(i2);
        z = zH;
        return new w0a(x4aVar, w0aVar.b, w0aVar.c, jD, jA, w0aVar.f, z, z2, zK, zJ);
    }

    public final boolean j(ush ushVar, x4a x4aVar, boolean z) {
        int iB = ushVar.b(x4aVar.a);
        if (!ushVar.m(ushVar.f(iB, this.a, false).c, this.b, 0L).h) {
            if (ushVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(ush ushVar, x4a x4aVar) {
        boolean z = !x4aVar.b() && x4aVar.e == -1;
        Object obj = x4aVar.a;
        if (z) {
            if (ushVar.m(ushVar.g(obj, this.a).c, this.b, 0L).n == ushVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        v0a v0aVar = this.m;
        if (v0aVar == null || v0aVar.q()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                v0a v0aVar2 = (v0a) this.q.get(i);
                if (!v0aVar2.q()) {
                    this.m = v0aVar2;
                    return;
                }
            }
        }
    }

    public final void m() {
        z88 z88VarL = c98.l();
        for (v0a v0aVarH = this.i; v0aVarH != null; v0aVarH = v0aVarH.h()) {
            z88VarL.c(v0aVarH.g.a);
        }
        v0a v0aVar = this.j;
        this.d.f(new d86(this, z88VarL, v0aVar == null ? null : v0aVar.g.a, 12));
    }

    public final int n(v0a v0aVar) {
        v0aVar.getClass();
        int i = 0;
        if (v0aVar != this.l) {
            this.l = v0aVar;
            while (v0aVar.h() != null) {
                v0aVar = v0aVar.h();
                v0aVar.getClass();
                if (v0aVar == this.j) {
                    v0a v0aVar2 = this.i;
                    this.j = v0aVar2;
                    this.k = v0aVar2;
                    i = 3;
                }
                if (v0aVar == this.k) {
                    this.k = this.j;
                    i |= 2;
                }
                v0aVar.t();
                this.n--;
            }
            v0a v0aVar3 = this.l;
            v0aVar3.getClass();
            v0aVar3.v(null);
            m();
        }
        return i;
    }

    public final x4a p(ush ushVar, Object obj, long j) {
        long jQ;
        int iB;
        Object obj2 = obj;
        rsh rshVar = this.a;
        int i = ushVar.g(obj2, rshVar).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = ushVar.b(obj3)) == -1 || ushVar.f(iB, rshVar, false).c != i) {
            v0a v0aVarH = this.i;
            while (true) {
                if (v0aVarH == null) {
                    v0a v0aVarH2 = this.i;
                    while (true) {
                        if (v0aVarH2 == null) {
                            jQ = q(obj2);
                            if (jQ != -1) {
                                break;
                            }
                            jQ = this.f;
                            this.f = 1 + jQ;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj2;
                            this.p = jQ;
                            break;
                        }
                        int iB2 = ushVar.b(v0aVarH2.b);
                        if (iB2 != -1 && ushVar.f(iB2, rshVar, false).c == i) {
                            jQ = v0aVarH2.g.a.d;
                            break;
                        }
                        v0aVarH2 = v0aVarH2.h();
                    }
                } else {
                    if (v0aVarH.b.equals(obj2)) {
                        jQ = v0aVarH.g.a.d;
                        break;
                    }
                    v0aVarH = v0aVarH.h();
                }
            }
        } else {
            jQ = this.p;
        }
        ushVar.g(obj2, rshVar);
        int i2 = rshVar.c;
        tsh tshVar = this.b;
        ushVar.n(i2, tshVar);
        boolean z = false;
        for (int iB3 = ushVar.b(obj); iB3 >= tshVar.m; iB3--) {
            ushVar.f(iB3, rshVar, true);
            boolean z2 = rshVar.g.a > 0;
            z |= z2;
            if (rshVar.c(rshVar.d) != -1) {
                obj2 = rshVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || rshVar.d != 0)) {
                break;
            }
        }
        return o(ushVar, obj2, j, jQ, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            v0a v0aVar = (v0a) this.q.get(i);
            if (v0aVar.b.equals(obj)) {
                return v0aVar.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(ush ushVar) {
        ush ushVar2;
        v0a v0aVarH = this.i;
        if (v0aVarH == null) {
            return 0;
        }
        int iB = ushVar.b(v0aVarH.b);
        while (true) {
            ushVar2 = ushVar;
            iB = ushVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                v0aVarH.getClass();
                if (v0aVarH.h() == null || v0aVarH.g.h) {
                    break;
                }
                v0aVarH = v0aVarH.h();
            }
            v0a v0aVarH2 = v0aVarH.h();
            if (iB == -1 || v0aVarH2 == null || ushVar2.b(v0aVarH2.b) != iB) {
                break;
            }
            v0aVarH = v0aVarH2;
            ushVar = ushVar2;
        }
        int iN = n(v0aVarH);
        v0aVarH.g = i(ushVar2, v0aVarH.g);
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    public final int s(ush ushVar, long j, long j2, long j3) {
        w0a w0aVarI;
        boolean z;
        v0a v0aVarH = this.i;
        v0a v0aVar = null;
        while (true) {
            int i = 0;
            if (v0aVarH == null) {
                return 0;
            }
            w0a w0aVar = v0aVarH.g;
            if (v0aVar == null) {
                w0aVarI = i(ushVar, w0aVar);
            } else {
                w0a w0aVarD = d(ushVar, v0aVar, j);
                if (w0aVarD == null || w0aVar.b != w0aVarD.b || !w0aVar.a.equals(w0aVarD.a)) {
                    return n(v0aVar);
                }
                w0aVarI = w0aVarD;
            }
            long j4 = w0aVarI.e;
            long j5 = w0aVar.c;
            long j6 = w0aVar.e;
            v0aVarH.g = w0aVarI.a(j5);
            if (j6 != j4) {
                v0aVarH.z();
                long jY = j4 == -9223372036854775807L ? BuildConfig.MAX_TIME_TO_UPLOAD : v0aVarH.y(j4);
                boolean z2 = v0aVarH == this.j && !v0aVarH.g.g && (j2 == Long.MIN_VALUE || j2 >= jY);
                boolean z3 = v0aVarH == this.k && (j3 == Long.MIN_VALUE || j3 >= jY);
                int iN = n(v0aVarH);
                if (iN != 0) {
                    return iN;
                }
                if (j6 == -9223372036854775807L && w0aVar.d == Long.MIN_VALUE) {
                    long j7 = w0aVarI.d;
                    if (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j6 != -9223372036854775807L || z)) {
                    i = 1;
                }
                return z3 ? i | 2 : i;
            }
            v0aVar = v0aVarH;
            v0aVarH = v0aVarH.h();
        }
    }
}
