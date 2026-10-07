package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jx7 implements u0a, ay7 {
    public final ab5 a;
    public final db5 b;
    public final uik c;
    public final v1i d;
    public final ev5 e;
    public final av5 f;
    public final l6m g;
    public final ed7 h;
    public final qf i;
    public final IdentityHashMap j;
    public final eth k;
    public final ou7 l;
    public final boolean m;
    public final int n;
    public final z3d o;
    public final i1m p = new i1m(this);
    public t0a q;
    public int r;
    public iyh s;
    public fy7[] t;
    public fy7[] u;
    public int[][] v;
    public int w;
    public g84 x;

    public jx7(ab5 ab5Var, db5 db5Var, uik uikVar, v1i v1iVar, ev5 ev5Var, av5 av5Var, l6m l6mVar, ed7 ed7Var, qf qfVar, ou7 ou7Var, boolean z, int i, z3d z3dVar) {
        this.a = ab5Var;
        this.b = db5Var;
        this.c = uikVar;
        this.d = v1iVar;
        this.e = ev5Var;
        this.f = av5Var;
        this.g = l6mVar;
        this.h = ed7Var;
        this.i = qfVar;
        this.l = ou7Var;
        this.m = z;
        this.n = i;
        this.o = z3dVar;
        ou7Var.getClass();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        this.x = new g84(gheVar, gheVar);
        this.j = new IdentityHashMap();
        eth ethVar = new eth();
        ethVar.a = new SparseArray();
        this.k = ethVar;
        this.t = new fy7[0];
        this.u = new fy7[0];
        this.v = new int[0][];
    }

    public static b87 h(b87 b87Var, b87 b87Var2, boolean z) {
        lwa lwaVar;
        int i;
        String str;
        String str2;
        c98 c98Var;
        int i2;
        int i3;
        String str3;
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        if (b87Var2 != null) {
            str2 = b87Var2.k;
            lwaVar = b87Var2.l;
            i2 = b87Var2.F;
            i = b87Var2.e;
            i3 = b87Var2.f;
            str = b87Var2.d;
            str3 = b87Var2.b;
            c98Var = b87Var2.c;
        } else {
            String strX = vqi.x(1, b87Var.k);
            lwaVar = b87Var.l;
            if (z) {
                i2 = b87Var.F;
                i = b87Var.e;
                i3 = b87Var.f;
                str = b87Var.d;
                str3 = b87Var.b;
                str2 = strX;
                c98Var = b87Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strX;
                c98Var = gheVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = uya.d(str2);
        int i4 = z ? b87Var.h : -1;
        int i5 = z ? b87Var.i : -1;
        a87 a87Var = new a87();
        a87Var.a = b87Var.a;
        a87Var.b = str3;
        a87Var.c = c98.n(c98Var);
        a87Var.l = uya.n(b87Var.m);
        a87Var.m = uya.n(strD);
        a87Var.j = str2;
        a87Var.k = lwaVar;
        a87Var.h = i4;
        a87Var.i = i5;
        a87Var.E = i2;
        a87Var.e = i;
        a87Var.f = i3;
        a87Var.d = str;
        return new b87(a87Var);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:195:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) throws Throwable {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        ex7 ex7Var;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        fy7[] fy7VarArr;
        fy7 fy7Var;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        ?? r30;
        int[] iArr3 = new int[rg6VarArr.length];
        int[] iArr4 = new int[rg6VarArr.length];
        int i7 = 0;
        while (true) {
            int length = rg6VarArr.length;
            identityHashMap = this.j;
            if (i7 >= length) {
                break;
            }
            xye xyeVar = xyeVarArr[i7];
            iArr3[i7] = xyeVar == null ? -1 : ((Integer) identityHashMap.get(xyeVar)).intValue();
            iArr4[i7] = -1;
            rg6 rg6Var = rg6VarArr[i7];
            if (rg6Var != null) {
                hyh hyhVarM = rg6Var.m();
                int i8 = 0;
                while (true) {
                    fy7[] fy7VarArr2 = this.t;
                    if (i8 >= fy7VarArr2.length) {
                        break;
                    }
                    fy7 fy7Var2 = fy7VarArr2[i8];
                    fy7Var2.f();
                    if (fy7Var2.I.b(hyhVarM) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = rg6VarArr.length;
        int length3 = rg6VarArr.length;
        xye[] xyeVarArr2 = new xye[length3];
        int length4 = rg6VarArr.length;
        rg6[] rg6VarArr2 = new rg6[length4];
        boolean z4 = false;
        fy7[] fy7VarArr3 = new fy7[this.t.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new xye[length2];
        Object[] objArr7 = xyeVarArr2;
        while (i10 < this.t.length) {
            int i12 = length2;
            ?? r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= rg6VarArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? xyeVarArr[r7] : null;
                rg6VarArr2[r7] = iArr4[r7] == i10 ? rg6VarArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            fy7 fy7Var3 = this.t[i10];
            dc9 dc9Var = fy7Var3.j;
            int i13 = i10;
            ex7 ex7Var2 = fy7Var3.d;
            Uri[] uriArr = ex7Var2.e;
            db5 db5Var = ex7Var2.g;
            ArrayList arrayList = fy7Var3.n;
            fy7Var3.f();
            int i14 = fy7Var3.E;
            Object[] objArr9 = objArr7;
            ?? r8 = z4;
            while (r8 < length4) {
                by7 by7Var = (by7) objArr9[r8];
                if (by7Var == null || (rg6VarArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    fy7Var3.E--;
                    if (by7Var.c != -1) {
                        fy7 fy7Var4 = by7Var.b;
                        int i15 = by7Var.a;
                        fy7Var4.f();
                        fy7Var4.K.getClass();
                        int i16 = fy7Var4.K[i15];
                        lvb.b0(fy7Var4.Z[i16]);
                        fy7Var4.Z[i16] = z4;
                        by7Var.c = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                rg6VarArr2 = rg6VarArr2;
                r8 = r30 + 1;
            }
            rg6[] rg6VarArr3 = rg6VarArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (fy7Var3.r1) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != fy7Var3.o1) {
                        z = true;
                    }
                }
                z = z4;
            }
            rg6 rg6Var2 = ex7Var2.r;
            boolean z7 = z;
            rg6 rg6Var3 = rg6Var2;
            ?? r9 = z4;
            while (r9 < length4) {
                ?? r31 = r9;
                rg6 rg6Var4 = rg6VarArr3[r31 == true ? 1 : 0];
                if (rg6Var4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iB = fy7Var3.I.b(rg6Var4.m());
                    if (iB == fy7Var3.X) {
                        cb5 cb5Var = (cb5) db5Var.d.get(uriArr[ex7Var2.r.r()]);
                        if (cb5Var != null) {
                            cb5Var.k = z4;
                        }
                        ex7Var2.r = rg6Var4;
                        rg6Var3 = rg6Var4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        fy7Var3.E++;
                        by7 by7Var2 = new by7(fy7Var3, iB);
                        objArr9[r31 == true ? 1 : 0] = by7Var2;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (fy7Var3.K != null) {
                            by7Var2.a();
                            if (z8) {
                                z7 = z8;
                            } else {
                                ey7 ey7Var = fy7Var3.v[fy7Var3.K[iB]];
                                z7 = (ey7Var.t() == 0 || ey7Var.F(j, z6)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i17 = length4;
            boolean z9 = z7;
            if (fy7Var3.E == 0) {
                cb5 cb5Var2 = (cb5) db5Var.d.get(uriArr[ex7Var2.r.r()]);
                if (cb5Var2 != null) {
                    cb5Var2.k = false;
                }
                ex7Var2.n = null;
                fy7Var3.G = null;
                fy7Var3.q1 = true;
                arrayList.clear();
                if (dc9Var.J()) {
                    if (fy7Var3.C) {
                        for (ey7 ey7Var2 : fy7Var3.v) {
                            ey7Var2.k();
                        }
                    }
                    dc9Var.A();
                } else {
                    fy7Var3.J();
                }
                ex7Var = ex7Var2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                fy7VarArr = fy7VarArr3;
                fy7Var = fy7Var3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(rg6Var3, rg6Var2)) {
                    ex7Var = ex7Var2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    fy7VarArr = fy7VarArr3;
                    fy7Var = fy7Var3;
                } else {
                    if (fy7Var3.r1) {
                        ex7Var = ex7Var2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        fy7VarArr = fy7VarArr3;
                        fy7Var = fy7Var3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        ix7 ix7VarB = fy7Var3.B();
                        long j3 = j2;
                        gt9[] gt9VarArrA = ex7Var2.a(ix7VarB, j);
                        ex7Var = ex7Var2;
                        List list = fy7Var3.o;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        fy7VarArr = fy7VarArr3;
                        fy7Var = fy7Var3;
                        rg6 rg6Var5 = rg6Var3;
                        rg6Var5.l(j, j3, -9223372036854775807L, list, gt9VarArrA);
                        if (rg6Var5.r() != ex7Var.h.b(ix7VarB.d)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    fy7Var.q1 = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        fy7Var.K(j, z2);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    fy7Var.K(j, z2);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = fy7Var.s;
            arrayList2.clear();
            for (int i18 = 0; i18 < i4; i18++) {
                Object obj = objArr9[i18];
                if (obj != null) {
                    arrayList2.add((by7) obj);
                }
            }
            fy7Var.r1 = true;
            int i19 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i19 < rg6VarArr.length) {
                Object obj2 = objArr9[i19];
                int i20 = i3;
                if (iArr2[i19] == i20) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i19] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i20));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i19] == i20) {
                        lvb.b0(obj2 == null);
                    }
                }
                i19++;
                objArr11 = objArr5;
                i3 = i20;
            }
            Object[] objArr12 = objArr11;
            int i21 = i3;
            int i22 = i11;
            if (z11) {
                fy7VarArr[i22] = fy7Var;
                i11 = i22 + 1;
                if (i22 == 0) {
                    ex7Var.l = true;
                    if (z3) {
                        ((SparseArray) this.k.a).clear();
                        z5 = true;
                    } else {
                        fy7[] fy7VarArr4 = this.u;
                        if (fy7VarArr4.length == 0 || fy7Var != fy7VarArr4[0]) {
                            ((SparseArray) this.k.a).clear();
                            z5 = true;
                        }
                    }
                } else {
                    ex7Var.l = i21 < this.w;
                }
            }
            i10 = i21 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            fy7VarArr3 = fy7VarArr;
            objArr7 = objArr9;
            rg6VarArr2 = rg6VarArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i17;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, xyeVarArr, z12 ? 1 : 0, length2);
        fy7[] fy7VarArr5 = (fy7[]) vqi.Z(fy7VarArr3, i11);
        this.u = fy7VarArr5;
        ghe gheVarO = c98.o(fy7VarArr5);
        AbstractList abstractListF = j8f.f(new eu6(20), gheVarO);
        this.l.getClass();
        this.x = new g84(gheVarO, abstractListF);
        return j;
    }

    @Override // defpackage.ay7
    public final void b() {
        for (fy7 fy7Var : this.t) {
            dc9 dc9Var = fy7Var.j;
            ex7 ex7Var = fy7Var.d;
            ArrayList arrayList = fy7Var.n;
            if (!arrayList.isEmpty()) {
                ix7 ix7Var = (ix7) np4.n(arrayList);
                int iB = ex7Var.b(ix7Var);
                int i = ix7Var.o;
                if (iB == 1) {
                    if (!ix7Var.f()) {
                        lvb.b0(i != -1);
                        sx7 sx7VarA = ex7Var.g.a(ex7Var.e[ex7Var.h.b(ix7Var.d)], false);
                        sx7VarA.getClass();
                        c98 c98Var = sx7VarA.r;
                        int i2 = (int) (ix7Var.j - sx7VarA.k);
                        ix7Var.K = i2 < 0 ? 0L : ((nx7) (i2 < c98Var.size() ? ((px7) c98Var.get(i2)).m : sx7VarA.s).get(i)).c;
                    }
                } else if (iB == 0) {
                    fy7Var.r.post(new su6(fy7Var, 3, ix7Var));
                } else if (iB == 2 && !fy7Var.s1 && dc9Var.J()) {
                    dc9Var.A();
                }
            }
        }
        this.q.q(this);
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        for (fy7 fy7Var : this.u) {
            if (fy7Var.A == 2) {
                ex7 ex7Var = fy7Var.d;
                db5 db5Var = ex7Var.g;
                int iB = ex7Var.r.b();
                Uri[] uriArr = ex7Var.e;
                sx7 sx7VarA = (iB >= uriArr.length || iB == -1) ? null : db5Var.a(uriArr[ex7Var.r.r()], true);
                if (sx7VarA == null) {
                    break;
                }
                c98 c98Var = sx7VarA.r;
                if (c98Var.isEmpty()) {
                    break;
                }
                long j2 = sx7VarA.h - db5Var.n;
                long j3 = j - j2;
                int iD = vqi.d(c98Var, Long.valueOf(j3), true, true);
                long j4 = ((px7) c98Var.get(iD)).e;
                return ybfVar.a(j3, j4, (!sx7VarA.c || iD == c98Var.size() - 1) ? j4 : ((px7) c98Var.get(iD + 1)).e) + j2;
            }
        }
        return j;
    }

    @Override // defpackage.ay7
    public final boolean d(Uri uri, mf mfVar, boolean z) {
        int iK;
        boolean z2;
        dc1 dc1VarN;
        boolean z3 = true;
        for (fy7 fy7Var : this.t) {
            ex7 ex7Var = fy7Var.d;
            Uri[] uriArr = ex7Var.e;
            if (vqi.m(uriArr, uri)) {
                long j = (z || (dc1VarN = fy7Var.i.n(oyl.c(ex7Var.r), mfVar)) == null || dc1VarN.a != 2) ? -9223372036854775807L : dc1VarN.b;
                int i = 0;
                while (true) {
                    if (i >= uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && (iK = ex7Var.r.k(i)) != -1) {
                    ex7Var.o = uri;
                    if (j != -9223372036854775807L && ex7Var.r.g(iK, j)) {
                        cb5 cb5Var = (cb5) ex7Var.g.d.get(uri);
                        if (cb5Var != null ? cb5.a(cb5Var, j) : false) {
                        }
                    }
                    z2 = false;
                }
                z3 &= z2;
            }
            z2 = true;
            z3 &= z2;
        }
        this.q.q(this);
        return z3;
    }

    @Override // defpackage.vhf
    public final long e() {
        return this.x.e();
    }

    public final fy7 f(String str, int i, Uri[] uriArr, b87[] b87VarArr, b87 b87Var, List list, Map map, long j) {
        return new fy7(str, i, this.p, new ex7(this.a, this.b, uriArr, b87VarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, b87Var, this.e, this.f, this.g, this.h, this.n, null);
    }

    @Override // defpackage.u0a
    public final long g(long j) throws Throwable {
        fy7[] fy7VarArr = this.u;
        if (fy7VarArr.length > 0) {
            boolean zK = fy7VarArr[0].K(j, false);
            int i = 1;
            while (true) {
                fy7[] fy7VarArr2 = this.u;
                if (i >= fy7VarArr2.length) {
                    break;
                }
                fy7VarArr2[i].K(j, zK);
                i++;
            }
            if (zK) {
                ((SparseArray) this.k.a).clear();
            }
        }
        return j;
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.x.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // defpackage.u0a
    public final List j(ArrayList arrayList) {
        int[] iArr;
        iyh iyhVar;
        int i;
        jx7 jx7Var = this;
        wx7 wx7Var = jx7Var.b.j;
        wx7Var.getClass();
        List list = wx7Var.e;
        boolean zIsEmpty = list.isEmpty();
        boolean z = !zIsEmpty;
        int i2 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            iyhVar = iyh.d;
            i = 0;
        } else {
            fy7 fy7Var = jx7Var.t[0];
            iArr = jx7Var.v[0];
            fy7Var.f();
            iyhVar = fy7Var.I;
            i = fy7Var.X;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            rg6 rg6Var = (rg6) it.next();
            hyh hyhVarM = rg6Var.m();
            int iB = iyhVar.b(hyhVarM);
            if (iB == -1) {
                ?? r14 = z;
                while (true) {
                    fy7[] fy7VarArr = jx7Var.t;
                    if (r14 >= fy7VarArr.length) {
                        break;
                    }
                    fy7 fy7Var2 = fy7VarArr[r14];
                    fy7Var2.f();
                    iyh iyhVar2 = fy7Var2.I;
                    int iB2 = iyhVar2.b(hyhVarM);
                    if (iB2 != -1) {
                        int i3 = iyhVar2.a(iB2).c != 1 ? 2 : 1;
                        int[] iArr2 = jx7Var.v[r14];
                        for (int i4 = 0; i4 < rg6Var.length(); i4++) {
                            arrayList2.add(new k4h(0, i3, iArr2[rg6Var.e(i4)]));
                        }
                        break;
                    }
                    jx7Var = this;
                    r14++;
                }
            } else if (iB == i) {
                for (int i5 = i2; i5 < rg6Var.length(); i5++) {
                    arrayList2.add(new k4h(i2, i2, iArr[rg6Var.e(i5)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            jx7Var = this;
            i2 = 0;
        }
        if (z2 && !z3) {
            int i6 = iArr[0];
            int i7 = ((vx7) list.get(i6)).b.j;
            for (int i8 = 1; i8 < iArr.length; i8++) {
                int i9 = ((vx7) list.get(iArr[i8])).b.j;
                if (i9 < i7) {
                    i6 = iArr[i8];
                    i7 = i9;
                }
            }
            arrayList2.add(new k4h(0, 0, i6));
        }
        return arrayList2;
    }

    @Override // defpackage.u0a
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.u0a
    public final void n() throws IOException {
        for (fy7 fy7Var : this.t) {
            fy7Var.H();
            if (fy7Var.s1 && !fy7Var.D) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        ab5 ab5Var;
        boolean z;
        List list;
        List list2;
        fy7[] fy7VarArr;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.q = t0aVar;
        db5 db5Var = this.b;
        db5Var.getClass();
        db5Var.e.add(this);
        wx7 wx7Var = db5Var.j;
        wx7Var.getClass();
        List list3 = wx7Var.f;
        List list4 = wx7Var.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = wx7Var.g;
        int i4 = 0;
        this.r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ab5 ab5Var2 = this.a;
        boolean z4 = this.m;
        if (zIsEmpty) {
            ab5Var = ab5Var2;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            b87 b87Var = wx7Var.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                b87 b87Var2 = ((vx7) list4.get(i5)).b;
                int i7 = b87Var2.v;
                String str = b87Var2.k;
                if (i7 > 0 || vqi.x(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (vqi.x(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            b87[] b87VarArr = new b87[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    vx7 vx7Var = (vx7) list4.get(i8);
                    uriArr[i9] = vx7Var.a;
                    b87VarArr[i9] = vx7Var.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = b87VarArr[0].k;
            int iW = vqi.w(2, str2);
            int iW2 = vqi.w(1, str2);
            boolean z5 = (iW2 == 1 || (iW2 == 0 && list3.isEmpty())) && iW <= 1 && iW2 + iW > 0;
            ab5Var = ab5Var2;
            list = list3;
            z = z4;
            fy7 fy7VarF = f("main", (z2 || iW2 <= 0) ? 0 : 1, uriArr3, b87VarArr, wx7Var.h, wx7Var.i, map, j);
            arrayList.add(fy7VarF);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iW > 0) {
                    b87[] b87VarArr2 = new b87[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        b87 b87Var3 = b87VarArr[i10];
                        String strX = vqi.x(2, b87Var3.k);
                        String strD = uya.d(strX);
                        a87 a87Var = new a87();
                        a87Var.a = b87Var3.a;
                        a87Var.b = b87Var3.b;
                        a87Var.c = c98.n(b87Var3.c);
                        a87Var.l = uya.n(b87Var3.m);
                        a87Var.m = uya.n(strD);
                        a87Var.j = strX;
                        a87Var.k = b87Var3.l;
                        a87Var.h = b87Var3.h;
                        a87Var.i = b87Var3.i;
                        a87Var.t = b87Var3.u;
                        a87Var.u = b87Var3.v;
                        a87Var.x = b87Var3.y;
                        a87Var.e = b87Var3.e;
                        a87Var.f = b87Var3.f;
                        b87VarArr2[i10] = new b87(a87Var);
                        i10++;
                        b87VarArr = b87VarArr;
                    }
                    b87[] b87VarArr3 = b87VarArr;
                    arrayList3.add(new hyh("main", b87VarArr2));
                    if (iW2 > 0 && (b87Var != null || list.isEmpty())) {
                        arrayList3.add(new hyh("main:audio", h(b87VarArr3[0], b87Var, false)));
                    }
                    List list6 = wx7Var.i;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new hyh(zo5.h(i11, "main:cc:"), ab5Var.c((b87) list6.get(i11))));
                        }
                    }
                } else {
                    b87[] b87VarArr4 = new b87[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        b87VarArr4[i12] = h(b87VarArr[i12], b87Var, true);
                    }
                    arrayList3.add(new hyh("main", b87VarArr4));
                }
                a87 a87Var2 = new a87();
                a87Var2.a = "ID3";
                a87Var2.m = uya.n("application/id3");
                hyh hyhVar = new hyh("main:id3", new b87(a87Var2));
                arrayList3.add(hyhVar);
                fy7VarF.I((hyh[]) arrayList3.toArray(new hyh[0]), arrayList3.indexOf(hyhVar));
            } else {
                ab5Var = ab5Var;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list7 = list;
            String str3 = ((ux7) list7.get(i13)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(((ux7) list7.get(i14)).c)) {
                        ux7 ux7Var = (ux7) list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = ux7Var.a;
                        b87 b87Var4 = ux7Var.b;
                        arrayList4.add(uri);
                        arrayList5.add(b87Var4);
                        z6 &= vqi.w(1, b87Var4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = vqi.a;
                list = list7;
                hashSet2 = hashSet3;
                i2 = i13;
                fy7 fy7VarF2 = f(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (b87[]) arrayList5.toArray(new b87[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(k4m.h(arrayList6));
                arrayList.add(fy7VarF2);
                if (z && z6) {
                    fy7VarF2.I(new hyh[]{new hyh(strConcat, (b87[]) arrayList5.toArray(new b87[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
            hashSet3 = hashSet2;
        }
        this.w = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            list2 = list2;
            String str5 = ((ux7) list2.get(i15)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list2.size(); i16++) {
                    if (str5.equals(((ux7) list2.get(i16)).c)) {
                        ux7 ux7Var2 = (ux7) list2.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(ux7Var2.a);
                        arrayList8.add(ux7Var2.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                b87[] b87VarArr5 = (b87[]) arrayList8.toArray(new b87[0]);
                String str6 = vqi.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                a98 a98Var = c98.b;
                hashSet = hashSet4;
                i = i15;
                fy7 fy7VarF3 = f(strConcat2, 3, uriArr4, b87VarArr5, null, ghe.e, map, j);
                arrayList2.add(k4m.h(arrayList9));
                arrayList.add(fy7VarF3);
                int length = b87VarArr5.length;
                b87[] b87VarArr6 = new b87[length];
                for (int i17 = 0; i17 < length; i17++) {
                    b87VarArr6[i17] = ab5Var.c(b87VarArr5[i17]);
                }
                fy7VarF3.I(new hyh[]{new hyh(strConcat2, b87VarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i15;
            }
            i15 = i + 1;
            hashSet4 = hashSet;
        }
        this.t = (fy7[]) arrayList.toArray(new fy7[0]);
        this.v = (int[][]) arrayList2.toArray(new int[0][]);
        this.r = this.t.length;
        int i18 = 0;
        while (true) {
            int i19 = this.w;
            fy7VarArr = this.t;
            if (i18 >= i19) {
                break;
            }
            fy7VarArr[i18].d.l = true;
            i18++;
        }
        for (fy7 fy7Var : fy7VarArr) {
            if (!fy7Var.D) {
                ea9 ea9Var = new ea9();
                ea9Var.a = fy7Var.o1;
                fy7Var.u(new fa9(ea9Var));
            }
        }
        this.u = this.t;
    }

    @Override // defpackage.u0a
    public final iyh t() {
        iyh iyhVar = this.s;
        iyhVar.getClass();
        return iyhVar;
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        if (this.s != null) {
            return this.x.u(fa9Var);
        }
        for (fy7 fy7Var : this.t) {
            if (!fy7Var.D) {
                ea9 ea9Var = new ea9();
                ea9Var.a = fy7Var.o1;
                fy7Var.u(new fa9(ea9Var));
            }
        }
        return false;
    }

    @Override // defpackage.vhf
    public final long v() {
        return this.x.v();
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        for (fy7 fy7Var : this.u) {
            if (fy7Var.C && !fy7Var.E()) {
                int length = fy7Var.v.length;
                for (int i = 0; i < length; i++) {
                    fy7Var.v[i].j(j, z, fy7Var.Z[i]);
                }
            }
        }
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        this.x.y(j);
    }
}
