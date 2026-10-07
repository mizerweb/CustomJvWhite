package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fy7 implements w99, z99, vhf, lj6, vye {
    public static final Set x1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public b87 F;
    public b87 G;
    public boolean H;
    public iyh I;
    public Set J;
    public int[] K;
    public int X;
    public boolean Y;
    public boolean[] Z;
    public final String a;
    public final int b;
    public final i1m c;
    public final ex7 d;
    public final qf e;
    public final b87 f;
    public final ev5 g;
    public final av5 h;
    public final l6m i;
    public final dc9 j;
    public final ed7 k;
    public final int l;
    public final ch m;
    public final ArrayList n;
    public boolean[] n1;
    public final List o;
    public long o1;
    public final cy7 p;
    public long p1;
    public final cy7 q;
    public boolean q1;
    public final Handler r;
    public boolean r1;
    public final ArrayList s;
    public boolean s1;
    public final Map t;
    public boolean t1;
    public uq3 u;
    public long u1;
    public ey7[] v;
    public wu5 v1;
    public int[] w;
    public ix7 w1;
    public final HashSet x;
    public final SparseIntArray y;
    public dy7 z;

    /* JADX WARN: Type inference failed for: r3v13, types: [cy7] */
    /* JADX WARN: Type inference failed for: r3v14, types: [cy7] */
    public fy7(String str, int i, i1m i1mVar, ex7 ex7Var, Map map, qf qfVar, long j, b87 b87Var, ev5 ev5Var, av5 av5Var, l6m l6mVar, ed7 ed7Var, int i2, she sheVar) {
        this.a = str;
        this.b = i;
        this.c = i1mVar;
        this.d = ex7Var;
        this.t = map;
        this.e = qfVar;
        this.f = b87Var;
        this.g = ev5Var;
        this.h = av5Var;
        this.i = l6mVar;
        this.k = ed7Var;
        this.l = i2;
        final int i3 = 1;
        this.j = sheVar != null ? new dc9(sheVar) : new dc9("Loader:HlsSampleStreamWrapper", 1);
        ch chVar = new ch();
        chVar.c = null;
        final int i4 = 0;
        chVar.b = false;
        chVar.d = null;
        this.m = chVar;
        this.w = new int[0];
        Set set = x1;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new ey7[0];
        this.n1 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new Runnable(this) { // from class: cy7
            public final /* synthetic */ fy7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                fy7 fy7Var = this.b;
                switch (i5) {
                    case 0:
                        fy7Var.F();
                        break;
                    default:
                        fy7Var.C = true;
                        fy7Var.F();
                        break;
                }
            }
        };
        this.q = new Runnable(this) { // from class: cy7
            public final /* synthetic */ fy7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                fy7 fy7Var = this.b;
                switch (i5) {
                    case 0:
                        fy7Var.F();
                        break;
                    default:
                        fy7Var.C = true;
                        fy7Var.F();
                        break;
                }
            }
        };
        this.r = vqi.p(null);
        this.o1 = j;
        this.p1 = j;
    }

    public static int C(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static nm5 o(int i, int i2) {
        lvb.G0("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new nm5();
    }

    public static b87 z(b87 b87Var, b87 b87Var2, boolean z) {
        String strB;
        if (b87Var == null) {
            return b87Var2;
        }
        String str = b87Var.k;
        String strD = b87Var2.n;
        int iH = uya.h(strD);
        if (vqi.w(iH, str) == 1) {
            strB = vqi.x(iH, str);
            strD = uya.d(strB);
        } else {
            strB = uya.b(str, strD);
        }
        a87 a87VarA = b87Var2.a();
        a87VarA.a = b87Var.a;
        a87VarA.b = b87Var.b;
        a87VarA.c = c98.n(b87Var.c);
        a87VarA.d = b87Var.d;
        a87VarA.e = b87Var.e;
        a87VarA.f = b87Var.f;
        a87VarA.h = z ? b87Var.h : -1;
        a87VarA.i = z ? b87Var.i : -1;
        a87VarA.j = strB;
        if (iH == 2) {
            a87VarA.t = b87Var.u;
            a87VarA.u = b87Var.v;
            a87VarA.x = b87Var.y;
        }
        if (strD != null) {
            a87VarA.r(strD);
        }
        int i = b87Var.F;
        if (i != -1 && iH == 1) {
            a87VarA.E = i;
        }
        lwa lwaVarB = b87Var.l;
        if (lwaVarB != null) {
            lwa lwaVar = b87Var2.l;
            if (lwaVar != null) {
                lwaVarB = lwaVar.b(lwaVarB);
            }
            a87VarA.k = lwaVarB;
        }
        return new b87(a87VarA);
    }

    public final void A(int i) {
        ArrayList arrayList;
        lvb.b0(!this.j.J());
        while (true) {
            arrayList = this.n;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (m(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = B().h;
        ix7 ix7Var = (ix7) arrayList.get(i);
        vqi.f0(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.v.length; i2++) {
            this.v[i2].n(ix7Var.e(i2));
        }
        if (arrayList.isEmpty()) {
            this.p1 = this.o1;
        } else {
            ((ix7) np4.n(arrayList)).J = true;
        }
        this.s1 = false;
        this.k.W(this.A, ix7Var.g, j);
    }

    public final ix7 B() {
        return (ix7) qv1.f(1, this.n);
    }

    @Override // defpackage.lj6
    public final void D() {
        this.t1 = true;
        this.r.post(this.q);
    }

    public final boolean E() {
        return this.p1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.H && this.K == null && this.C) {
            int i2 = 0;
            for (ey7 ey7Var : this.v) {
                if (ey7Var.w() == null) {
                    return;
                }
            }
            iyh iyhVar = this.I;
            if (iyhVar != null) {
                int i3 = iyhVar.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        ey7[] ey7VarArr = this.v;
                        if (i5 >= ey7VarArr.length) {
                            break;
                        }
                        b87 b87VarW = ey7VarArr[i5].w();
                        b87VarW.getClass();
                        b87 b87Var = this.I.a(i4).d[0];
                        String str = b87VarW.n;
                        String str2 = b87Var.n;
                        int iH = uya.h(str);
                        if (iH != 3) {
                            if (iH == uya.h(str2)) {
                                this.K[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || b87VarW.K == b87Var.K)) {
                                this.K[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((by7) it.next()).a();
                }
                return;
            }
            int length = this.v.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                b87 b87VarW2 = this.v[i6].w();
                b87VarW2.getClass();
                String str3 = b87VarW2.n;
                if (uya.m(str3)) {
                    i9 = 2;
                } else if (!uya.i(str3)) {
                    i9 = uya.l(str3) ? 3 : -2;
                }
                if (C(i9) > C(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            hyh hyhVar = this.d.h;
            int i10 = hyhVar.a;
            this.X = -1;
            this.K = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.K[i11] = i11;
            }
            hyh[] hyhVarArr = new hyh[length];
            int i12 = 0;
            while (i12 < length) {
                b87 b87VarW3 = this.v[i12].w();
                b87VarW3.getClass();
                String str4 = this.a;
                b87 b87Var2 = this.f;
                if (i12 == i7) {
                    b87[] b87VarArr = new b87[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        b87 b87VarF = hyhVar.d[i13];
                        if (i8 == 1 && b87Var2 != null) {
                            b87VarF = b87VarF.f(b87Var2);
                        }
                        b87VarArr[i13] = i10 == 1 ? b87VarW3.f(b87VarF) : z(b87VarF, b87VarW3, true);
                    }
                    hyhVarArr[i12] = new hyh(str4, b87VarArr);
                    this.X = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !uya.i(b87VarW3.n)) {
                        b87Var2 = null;
                    }
                    StringBuilder sbZ = zo5.z(str4, ":muxed:");
                    sbZ.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    hyhVarArr[i12] = new hyh(sbZ.toString(), z(b87Var2, b87VarW3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.I = q(hyhVarArr);
            lvb.b0(this.J == null ? 1 : i14);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.c.a0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [ey7[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ey7[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [kyh] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ey7, wye] */
    /* JADX WARN: Type inference failed for: r5v6, types: [nm5] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.lj6
    public final kyh G(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = x1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? ey7Var = 0;
        ey7Var = 0;
        if (zContains) {
            lvb.R(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                ey7Var = this.w[i3] == i ? this.v[i3] : o(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    ey7Var = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (ey7Var == 0) {
            if (this.t1) {
                return o(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            ey7Var = new ey7(this.e, this.g, this.h, this.t);
            ey7Var.t = this.o1;
            if (z) {
                ey7Var.I = this.v1;
                ey7Var.z = true;
            }
            long j = this.u1;
            if (ey7Var.F != j) {
                ey7Var.F = j;
                ey7Var.z = true;
            }
            ix7 ix7Var = this.w1;
            if (ix7Var != null) {
                ey7Var.C = ix7Var.k;
            }
            ey7Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            ey7[] ey7VarArr = this.v;
            String str = vqi.a;
            ?? CopyOf = Arrays.copyOf(ey7VarArr, ey7VarArr.length + 1);
            CopyOf[ey7VarArr.length] = ey7Var;
            this.v = (ey7[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.n1, i5);
            this.n1 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.Y |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (C(i2) > C(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.Z = Arrays.copyOf(this.Z, i5);
        }
        if (i2 != 5) {
            return ey7Var;
        }
        if (this.z == null) {
            this.z = new dy7(ey7Var, this.l);
        }
        return this.z;
    }

    public final void H() throws IOException {
        this.j.b();
        ex7 ex7Var = this.d;
        BehindLiveWindowException behindLiveWindowException = ex7Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = ex7Var.o;
        if (uri == null || !uri.equals(ex7Var.p)) {
            return;
        }
        db5 db5Var = ex7Var.g;
        cb5 cb5Var = (cb5) db5Var.d.get(ex7Var.o);
        cb5Var.b.b();
        IOException iOException = cb5Var.j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void I(hyh[] hyhVarArr, int... iArr) {
        this.I = q(hyhVarArr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.X = 0;
        this.r.post(new k36(14, this.c));
        this.D = true;
    }

    public final void J() {
        for (ey7 ey7Var : this.v) {
            ey7Var.D(this.q1);
        }
        this.q1 = false;
    }

    public final boolean K(long j, boolean z) throws Throwable {
        ix7 ix7Var;
        boolean zF;
        this.o1 = j;
        if (E()) {
            this.p1 = j;
            return true;
        }
        boolean z2 = this.d.q;
        ArrayList arrayList = this.n;
        if (!z2) {
            ix7Var = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                ix7Var = null;
                break;
            }
            ix7Var = (ix7) arrayList.get(i);
            if (ix7Var.g == j) {
                break;
            }
            i++;
        }
        if (this.C && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                ey7 ey7Var = this.v[i2];
                if (ix7Var != null) {
                    zF = ey7Var.E(ix7Var.e(i2));
                } else {
                    long jE = e();
                    zF = ey7Var.F(j, jE == Long.MIN_VALUE || j < jE);
                }
                if (zF || (!this.n1[i2] && this.Y)) {
                }
            }
            return false;
        }
        this.p1 = j;
        this.s1 = false;
        arrayList.clear();
        dc9 dc9Var = this.j;
        if (!dc9Var.J()) {
            dc9Var.d = null;
            J();
            return true;
        }
        if (this.C) {
            for (ey7 ey7Var2 : this.v) {
                ey7Var2.k();
            }
        }
        dc9Var.A();
        return true;
    }

    @Override // defpackage.vye
    public final void b() {
        this.r.post(this.p);
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        uq3 uq3Var = (uq3) y99Var;
        this.u = null;
        long j3 = uq3Var.a;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.i.getClass();
        this.k.N(t99Var, uq3Var.c, this.b, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h);
        if (z) {
            return;
        }
        if (E() || this.E == 0) {
            J();
        }
        if (this.E > 0) {
            this.c.q(this);
        }
    }

    @Override // defpackage.vhf
    public final long e() {
        if (E()) {
            return this.p1;
        }
        if (this.s1) {
            return Long.MIN_VALUE;
        }
        return B().h;
    }

    public final void f() {
        lvb.b0(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        uq3 uq3Var = (uq3) y99Var;
        this.u = null;
        if (uq3Var instanceof ax7) {
            ax7 ax7Var = (ax7) uq3Var;
            byte[] bArr = ax7Var.j;
            ex7 ex7Var = this.d;
            ex7Var.m = bArr;
            b1k b1kVar = ex7Var.j;
            Uri uri = ax7Var.b.a;
            byte[] bArr2 = ax7Var.l;
            bArr2.getClass();
            xe7 xe7Var = (xe7) b1kVar.b;
            uri.getClass();
        }
        long j3 = uq3Var.a;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.i.getClass();
        this.k.O(t99Var, uq3Var.c, this.b, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h);
        if (this.D) {
            this.c.q(this);
            return;
        }
        ea9 ea9Var = new ea9();
        ea9Var.a = this.o1;
        u(new fa9(ea9Var));
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.j.J();
    }

    @Override // defpackage.z99
    public final void l() {
        for (ey7 ey7Var : this.v) {
            ey7Var.D(true);
            xu5 xu5Var = ey7Var.h;
            if (xu5Var != null) {
                xu5Var.f(ey7Var.e);
                ey7Var.h = null;
                ey7Var.g = null;
            }
        }
    }

    public final boolean m(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                ix7 ix7Var = (ix7) arrayList.get(i);
                for (int i3 = 0; i3 < this.v.length; i3++) {
                    if (this.v[i3].t() > ix7Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((ix7) arrayList.get(i2)).X) {
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        t99 t99Var;
        uq3 uq3Var = (uq3) y99Var;
        if (i == 0) {
            long j3 = uq3Var.a;
            t99Var = new t99(j, uq3Var.b);
        } else {
            long j4 = uq3Var.a;
            a35 a35Var = uq3Var.b;
            lkg lkgVar = uq3Var.i;
            t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        }
        this.k.R(t99Var, uq3Var.c, this.b, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h, i);
    }

    public final iyh q(hyh[] hyhVarArr) {
        for (int i = 0; i < hyhVarArr.length; i++) {
            hyh hyhVar = hyhVarArr[i];
            b87[] b87VarArr = new b87[hyhVar.a];
            for (int i2 = 0; i2 < hyhVar.a; i2++) {
                b87 b87Var = hyhVar.d[i2];
                int iC = this.g.c(b87Var);
                a87 a87VarA = b87Var.a();
                a87VarA.N = iC;
                b87VarArr[i2] = new b87(a87VarA);
            }
            hyhVarArr[i] = new hyh(hyhVar.b, b87VarArr);
        }
        return new iyh(hyhVarArr);
    }

    @Override // defpackage.lj6
    public final void r(xbf xbfVar) {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236 A[PHI: r2
  0x0236: PHI (r2v14 dx7) = (r2v13 dx7), (r2v18 dx7) binds: [B:98:0x0207, B:106:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:129:0x0279  */
    /* JADX WARN: Code duplicated, block: B:131:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:137:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0291  */
    /* JADX WARN: Code duplicated, block: B:141:0x0296  */
    /* JADX WARN: Code duplicated, block: B:143:0x029e  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x030f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0316  */
    /* JADX WARN: Code duplicated, block: B:168:0x0333  */
    /* JADX WARN: Code duplicated, block: B:169:0x0336  */
    /* JADX WARN: Code duplicated, block: B:171:0x033a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0344  */
    /* JADX WARN: Code duplicated, block: B:174:0x0347  */
    /* JADX WARN: Code duplicated, block: B:175:0x0352  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x035a  */
    /* JADX WARN: Code duplicated, block: B:180:0x035c  */
    /* JADX WARN: Code duplicated, block: B:182:0x035f  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x039f  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:221:0x0404  */
    /* JADX WARN: Code duplicated, block: B:224:0x042c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        long jMax;
        long j;
        List list;
        ch chVar;
        long j2;
        ch chVar2;
        long j3;
        ix7 ix7Var;
        sx7 sx7Var;
        Uri uri;
        ex7 ex7Var;
        dx7 dx7VarD;
        String str;
        boolean z;
        long j4;
        dx7 dx7VarD2;
        boolean z2;
        qx7 qx7Var;
        px7 px7Var;
        long j5;
        Uri uriE;
        ax7 ax7VarE;
        String str2;
        Uri uriE2;
        ax7 ax7VarE2;
        boolean z3;
        boolean z4;
        u25 u25Var;
        b1k b1kVar;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i;
        boolean z5;
        byte[] bArrD;
        u25 zv6Var;
        px7 px7Var2;
        a35 a35Var;
        u25 u25Var2;
        boolean z6;
        int i2;
        d48 d48Var;
        nmc nmcVar;
        ri riVar;
        SparseArray sparseArray;
        dth dthVar;
        a35 a35Var2;
        boolean z7;
        boolean z8;
        ri riVar2;
        boolean z9;
        byte[] bArrD2;
        u25 zv6Var2;
        String str3;
        cb5 cb5Var;
        if (!this.s1) {
            dc9 dc9Var = this.j;
            if (!dc9Var.J() && !dc9Var.I()) {
                if (E()) {
                    List list2 = Collections.EMPTY_LIST;
                    jMax = this.p1;
                    for (ey7 ey7Var : this.v) {
                        ey7Var.t = this.p1;
                    }
                    list = list2;
                    j = jMax;
                } else {
                    ix7 ix7VarB = B();
                    boolean z10 = ix7VarB.H;
                    long j6 = ix7VarB.g;
                    if (z10 && ix7VarB.f()) {
                        long j7 = ix7VarB.K;
                        jMax = j7 != -9223372036854775807L ? j6 + j7 : -9223372036854775807L;
                    } else {
                        jMax = Math.max(this.o1, j6);
                    }
                    long jMax2 = this.o1;
                    boolean z11 = this.C;
                    List list3 = this.o;
                    if (z11) {
                        for (ey7 ey7Var2 : this.v) {
                            jMax2 = Math.max(jMax2, ey7Var2.r());
                        }
                    }
                    j = jMax2;
                    list = list3;
                }
                ch chVar3 = this.m;
                chVar3.c = null;
                chVar3.b = false;
                chVar3.d = null;
                boolean z12 = this.D || !list.isEmpty();
                ex7 ex7Var2 = this.d;
                b1k b1kVar2 = ex7Var2.j;
                Uri[] uriArr = ex7Var2.e;
                db5 db5Var = ex7Var2.g;
                ix7 ix7Var2 = list.isEmpty() ? null : (ix7) np4.n(list);
                int iB = ix7Var2 == null ? -1 : ex7Var2.h.b(ix7Var2.d);
                long j8 = fa9Var.a;
                long jMax3 = jMax - j8;
                long j9 = ex7Var2.s;
                long jMax4 = j9 != -9223372036854775807L ? j9 - j8 : -9223372036854775807L;
                if (ix7Var2 == null || ex7Var2.q) {
                    chVar = chVar3;
                    j2 = j8;
                } else {
                    chVar = chVar3;
                    long j10 = ix7Var2.h - ix7Var2.g;
                    j2 = j8;
                    jMax3 = Math.max(0L, jMax3 - j10);
                    if (jMax4 != -9223372036854775807L) {
                        jMax4 = Math.max(0L, jMax4 - j10);
                    }
                }
                long j11 = jMax;
                ix7 ix7Var3 = ix7Var2;
                ex7Var2.r.l(j2, jMax3, jMax4, list, ex7Var2.a(ix7Var2, jMax));
                int iR = ex7Var2.r.r();
                int i3 = iB;
                boolean z13 = iB != iR;
                Uri uri2 = uriArr[iR];
                if (db5Var.c(uri2)) {
                    ch chVar4 = chVar;
                    sx7 sx7VarA = db5Var.a(uri2, true);
                    sx7VarA.getClass();
                    long j12 = sx7VarA.h;
                    ex7Var2.q = sx7VarA.c;
                    ex7Var2.s = sx7VarA.o ? -9223372036854775807L : (sx7VarA.u + j12) - db5Var.n;
                    long j13 = j12 - db5Var.n;
                    chVar2 = chVar4;
                    Pair pairC = ex7Var2.c(ix7Var3, z13, sx7VarA, j13, j11);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue = ((Integer) pairC.second).intValue();
                    if (z13 && ix7Var3 != null) {
                        j3 = j13;
                        if (jLongValue < sx7VarA.k || ((dx7VarD = ex7.d(sx7VarA, jLongValue, iIntValue)) != null && j3 + dx7VarD.a.e < j)) {
                            Uri uri3 = uriArr[i3];
                            sx7 sx7VarA2 = db5Var.a(uri3, true);
                            sx7VarA2.getClass();
                            long j14 = sx7VarA2.h - db5Var.n;
                            Pair pairC2 = ex7Var2.c(ix7Var3, false, sx7VarA2, j14, j11);
                            ix7Var = ix7Var3;
                            long jLongValue2 = ((Long) pairC2.first).longValue();
                            j3 = j14;
                            iR = i3;
                            sx7Var = sx7VarA2;
                            uri = uri3;
                            iIntValue = ((Integer) pairC2.second).intValue();
                            ex7Var = ex7Var2;
                            jLongValue = jLongValue2;
                        }
                        str = sx7Var.a;
                        z = sx7Var.c;
                        j4 = sx7Var.k;
                        c98 c98Var = sx7Var.r;
                        if (iR != i3 && i3 != -1) {
                            cb5Var = (cb5) db5Var.d.get(uriArr[i3]);
                            if (cb5Var != null) {
                                cb5Var.k = false;
                            }
                        }
                        if (jLongValue < j4) {
                            ex7Var.n = new BehindLiveWindowException();
                        } else {
                            dx7VarD2 = ex7.d(sx7Var, jLongValue, iIntValue);
                            if (dx7VarD2 != null) {
                                z2 = dx7VarD2.d;
                                qx7Var = dx7VarD2.a;
                                ex7Var.p = null;
                                SystemClock.elapsedRealtime();
                                px7Var = qx7Var.b;
                                j5 = qx7Var.e;
                                if (px7Var != null || (str3 = px7Var.g) == null) {
                                    uriE = null;
                                } else {
                                    uriE = w1m.e(str, str3);
                                }
                                ax7VarE = ex7Var.e(uriE, iR, true);
                                chVar2.c = ax7VarE;
                                if (ax7VarE == null) {
                                    str2 = qx7Var.g;
                                    if (str2 == null) {
                                        uriE2 = null;
                                    } else {
                                        uriE2 = w1m.e(str, str2);
                                    }
                                    ax7VarE2 = ex7Var.e(uriE2, iR, false);
                                    chVar2.c = ax7VarE2;
                                    if (ax7VarE2 == null) {
                                        if (!(qx7Var instanceof nx7)) {
                                            z3 = z;
                                        } else if (!((nx7) qx7Var).l || (dx7VarD2.c == 0 && z)) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (ix7Var == null) {
                                            AtomicInteger atomicInteger = ix7.Y;
                                        } else {
                                            if (uri.equals(ix7Var.m) || !ix7Var.H) {
                                                z4 = z3 || j3 + j5 < j11;
                                            }
                                            if (z4 || !z2) {
                                                ab5 ab5Var = ex7Var.a;
                                                u25Var = ex7Var.b;
                                                b87 b87Var = ex7Var.f[iR];
                                                List list4 = ex7Var.i;
                                                int iT = ex7Var.r.t();
                                                Object objI = ex7Var.r.i();
                                                boolean z14 = ex7Var.l;
                                                eth ethVar = ex7Var.d;
                                                if (uriE2 == null) {
                                                    b1kVar2.getClass();
                                                    b1kVar = b1kVar2;
                                                    bArr = null;
                                                } else {
                                                    b1kVar = b1kVar2;
                                                    bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                                }
                                                if (uriE == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                                }
                                                z3d z3dVar = ex7Var.k;
                                                AtomicInteger atomicInteger2 = ix7.Y;
                                                map = Collections.EMPTY_MAP;
                                                Uri uriE3 = w1m.e(str, qx7Var.a);
                                                long j15 = qx7Var.i;
                                                long j16 = qx7Var.j;
                                                if (z2) {
                                                    i = 8;
                                                } else {
                                                    i = 0;
                                                }
                                                lvb.W(uriE3, "The uri must be set.");
                                                a35 a35Var3 = new a35(uriE3, 0L, 1, null, map, j15, j16, null, i, null);
                                                if (bArr != null) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    String str4 = qx7Var.h;
                                                    str4.getClass();
                                                    bArrD = ix7.d(str4);
                                                } else {
                                                    bArrD = null;
                                                }
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    zv6Var = new zv6(u25Var, bArr, bArrD);
                                                } else {
                                                    zv6Var = u25Var;
                                                }
                                                px7Var2 = qx7Var.b;
                                                if (px7Var2 != null) {
                                                    if (bArr2 != null) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        String str5 = px7Var2.h;
                                                        str5.getClass();
                                                        bArrD2 = ix7.d(str5);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z15 = z9;
                                                    Uri uriE4 = w1m.e(str, px7Var2.a);
                                                    long j17 = px7Var2.i;
                                                    long j18 = px7Var2.j;
                                                    lvb.W(uriE4, "The uri must be set.");
                                                    a35 a35Var4 = new a35(uriE4, 0L, 1, null, map, j17, j18, null, 0, null);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                                    } else {
                                                        zv6Var2 = u25Var;
                                                    }
                                                    z6 = z15;
                                                    u25Var2 = zv6Var2;
                                                    a35Var = a35Var4;
                                                } else {
                                                    a35Var = null;
                                                    u25Var2 = null;
                                                    z6 = false;
                                                }
                                                long j19 = j3 + j5;
                                                long j20 = j19 + qx7Var.c;
                                                i2 = sx7Var.j + qx7Var.d;
                                                if (ix7Var != null) {
                                                    a35Var2 = ix7Var.q;
                                                    if (a35Var != a35Var2 || (a35Var != null && a35Var2 != null && a35Var.a.equals(a35Var2.a) && a35Var.f == a35Var2.f)) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (uri.equals(ix7Var.m) || !ix7Var.H) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    d48Var = ix7Var.y;
                                                    nmcVar = ix7Var.z;
                                                    if (z7 || !z8 || ix7Var.J || ix7Var.l != i2) {
                                                        riVar2 = null;
                                                    } else {
                                                        riVar2 = ix7Var.C;
                                                    }
                                                    riVar = riVar2;
                                                } else {
                                                    d48Var = new d48(null);
                                                    nmcVar = new nmc(10);
                                                    riVar = null;
                                                }
                                                d48 d48Var2 = d48Var;
                                                nmc nmcVar2 = nmcVar;
                                                long j21 = dx7VarD2.b;
                                                int i4 = dx7VarD2.c;
                                                boolean z16 = !z2;
                                                boolean z17 = qx7Var.k;
                                                sparseArray = (SparseArray) ethVar.a;
                                                dthVar = (dth) sparseArray.get(i2);
                                                if (dthVar == null) {
                                                    dthVar = new dth(9223372036854775806L);
                                                    sparseArray.put(i2, dthVar);
                                                }
                                                chVar2 = chVar2;
                                                chVar2.c = new ix7(ab5Var, zv6Var, a35Var3, b87Var, z5, u25Var2, a35Var, z6, uri, list4, iT, objI, j19, j20, j21, i4, z16, i2, z17, z14, dthVar, qx7Var.f, riVar, d48Var2, nmcVar2, z4, z3, z3dVar);
                                            }
                                        }
                                        if (z4) {
                                        }
                                        ab5 ab5Var2 = ex7Var.a;
                                        u25Var = ex7Var.b;
                                        b87 b87Var2 = ex7Var.f[iR];
                                        List list5 = ex7Var.i;
                                        int iT2 = ex7Var.r.t();
                                        Object objI2 = ex7Var.r.i();
                                        boolean z18 = ex7Var.l;
                                        eth ethVar2 = ex7Var.d;
                                        if (uriE2 == null) {
                                            b1kVar2.getClass();
                                            b1kVar = b1kVar2;
                                            bArr = null;
                                        } else {
                                            b1kVar = b1kVar2;
                                            bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                        }
                                        if (uriE == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                        }
                                        z3d z3dVar2 = ex7Var.k;
                                        AtomicInteger atomicInteger3 = ix7.Y;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriE5 = w1m.e(str, qx7Var.a);
                                        long j110 = qx7Var.i;
                                        long j111 = qx7Var.j;
                                        if (z2) {
                                            i = 8;
                                        } else {
                                            i = 0;
                                        }
                                        lvb.W(uriE5, "The uri must be set.");
                                        a35 a35Var5 = new a35(uriE5, 0L, 1, null, map, j110, j111, null, i, null);
                                        if (bArr != null) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            String str6 = qx7Var.h;
                                            str6.getClass();
                                            bArrD = ix7.d(str6);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            zv6Var = new zv6(u25Var, bArr, bArrD);
                                        } else {
                                            zv6Var = u25Var;
                                        }
                                        px7Var2 = qx7Var.b;
                                        if (px7Var2 != null) {
                                            if (bArr2 != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z9) {
                                                String str7 = px7Var2.h;
                                                str7.getClass();
                                                bArrD2 = ix7.d(str7);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z19 = z9;
                                            Uri uriE6 = w1m.e(str, px7Var2.a);
                                            long j112 = px7Var2.i;
                                            long j113 = px7Var2.j;
                                            lvb.W(uriE6, "The uri must be set.");
                                            a35 a35Var6 = new a35(uriE6, 0L, 1, null, map, j112, j113, null, 0, null);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                            } else {
                                                zv6Var2 = u25Var;
                                            }
                                            z6 = z19;
                                            u25Var2 = zv6Var2;
                                            a35Var = a35Var6;
                                        } else {
                                            a35Var = null;
                                            u25Var2 = null;
                                            z6 = false;
                                        }
                                        long j114 = j3 + j5;
                                        long j22 = j114 + qx7Var.c;
                                        i2 = sx7Var.j + qx7Var.d;
                                        if (ix7Var != null) {
                                            a35Var2 = ix7Var.q;
                                            if (a35Var != a35Var2) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            if (uri.equals(ix7Var.m)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            d48Var = ix7Var.y;
                                            nmcVar = ix7Var.z;
                                            if (z7) {
                                                riVar2 = null;
                                            } else {
                                                riVar2 = null;
                                            }
                                            riVar = riVar2;
                                        } else {
                                            d48Var = new d48(null);
                                            nmcVar = new nmc(10);
                                            riVar = null;
                                        }
                                        d48 d48Var3 = d48Var;
                                        nmc nmcVar3 = nmcVar;
                                        long j23 = dx7VarD2.b;
                                        int i5 = dx7VarD2.c;
                                        boolean z110 = !z2;
                                        boolean z111 = qx7Var.k;
                                        sparseArray = (SparseArray) ethVar2.a;
                                        dthVar = (dth) sparseArray.get(i2);
                                        if (dthVar == null) {
                                            dthVar = new dth(9223372036854775806L);
                                            sparseArray.put(i2, dthVar);
                                        }
                                        chVar2 = chVar2;
                                        chVar2.c = new ix7(ab5Var2, zv6Var, a35Var5, b87Var2, z5, u25Var2, a35Var, z6, uri, list5, iT2, objI2, j114, j22, j23, i5, z110, i2, z111, z18, dthVar, qx7Var.f, riVar, d48Var3, nmcVar3, z4, z3, z3dVar2);
                                    }
                                }
                            } else if (!sx7Var.o) {
                                chVar2.d = uri;
                                ex7Var.p = uri;
                            } else if (!z12 || c98Var.isEmpty()) {
                                chVar2.b = true;
                            } else {
                                dx7VarD2 = new dx7((qx7) np4.n(c98Var), (j4 + ((long) c98Var.size())) - 1, -1);
                                z2 = dx7VarD2.d;
                                qx7Var = dx7VarD2.a;
                                ex7Var.p = null;
                                SystemClock.elapsedRealtime();
                                px7Var = qx7Var.b;
                                j5 = qx7Var.e;
                                if (px7Var != null) {
                                    uriE = null;
                                } else {
                                    uriE = null;
                                }
                                ax7VarE = ex7Var.e(uriE, iR, true);
                                chVar2.c = ax7VarE;
                                if (ax7VarE == null) {
                                    str2 = qx7Var.g;
                                    if (str2 == null) {
                                        uriE2 = null;
                                    } else {
                                        uriE2 = w1m.e(str, str2);
                                    }
                                    ax7VarE2 = ex7Var.e(uriE2, iR, false);
                                    chVar2.c = ax7VarE2;
                                    if (ax7VarE2 == null) {
                                        if (!(qx7Var instanceof nx7)) {
                                            z3 = z;
                                        } else if (((nx7) qx7Var).l) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (ix7Var == null) {
                                            AtomicInteger atomicInteger4 = ix7.Y;
                                        } else {
                                            if (uri.equals(ix7Var.m)) {
                                                if (z3) {
                                                }
                                            } else if (z3) {
                                            }
                                            if (z4) {
                                            }
                                            ab5 ab5Var3 = ex7Var.a;
                                            u25Var = ex7Var.b;
                                            b87 b87Var3 = ex7Var.f[iR];
                                            List list6 = ex7Var.i;
                                            int iT3 = ex7Var.r.t();
                                            Object objI3 = ex7Var.r.i();
                                            boolean z112 = ex7Var.l;
                                            eth ethVar3 = ex7Var.d;
                                            if (uriE2 == null) {
                                                b1kVar2.getClass();
                                                b1kVar = b1kVar2;
                                                bArr = null;
                                            } else {
                                                b1kVar = b1kVar2;
                                                bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                            }
                                            if (uriE == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                            }
                                            z3d z3dVar3 = ex7Var.k;
                                            AtomicInteger atomicInteger5 = ix7.Y;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriE7 = w1m.e(str, qx7Var.a);
                                            long j115 = qx7Var.i;
                                            long j116 = qx7Var.j;
                                            if (z2) {
                                                i = 8;
                                            } else {
                                                i = 0;
                                            }
                                            lvb.W(uriE7, "The uri must be set.");
                                            a35 a35Var7 = new a35(uriE7, 0L, 1, null, map, j115, j116, null, i, null);
                                            if (bArr != null) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                String str8 = qx7Var.h;
                                                str8.getClass();
                                                bArrD = ix7.d(str8);
                                            } else {
                                                bArrD = null;
                                            }
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                zv6Var = new zv6(u25Var, bArr, bArrD);
                                            } else {
                                                zv6Var = u25Var;
                                            }
                                            px7Var2 = qx7Var.b;
                                            if (px7Var2 != null) {
                                                if (bArr2 != null) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    String str9 = px7Var2.h;
                                                    str9.getClass();
                                                    bArrD2 = ix7.d(str9);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z113 = z9;
                                                Uri uriE8 = w1m.e(str, px7Var2.a);
                                                long j117 = px7Var2.i;
                                                long j118 = px7Var2.j;
                                                lvb.W(uriE8, "The uri must be set.");
                                                a35 a35Var8 = new a35(uriE8, 0L, 1, null, map, j117, j118, null, 0, null);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                                } else {
                                                    zv6Var2 = u25Var;
                                                }
                                                z6 = z113;
                                                u25Var2 = zv6Var2;
                                                a35Var = a35Var8;
                                            } else {
                                                a35Var = null;
                                                u25Var2 = null;
                                                z6 = false;
                                            }
                                            long j119 = j3 + j5;
                                            long j24 = j119 + qx7Var.c;
                                            i2 = sx7Var.j + qx7Var.d;
                                            if (ix7Var != null) {
                                                a35Var2 = ix7Var.q;
                                                if (a35Var != a35Var2) {
                                                    z7 = true;
                                                } else {
                                                    z7 = true;
                                                }
                                                if (uri.equals(ix7Var.m)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                                d48Var = ix7Var.y;
                                                nmcVar = ix7Var.z;
                                                if (z7) {
                                                    riVar2 = null;
                                                } else {
                                                    riVar2 = null;
                                                }
                                                riVar = riVar2;
                                            } else {
                                                d48Var = new d48(null);
                                                nmcVar = new nmc(10);
                                                riVar = null;
                                            }
                                            d48 d48Var4 = d48Var;
                                            nmc nmcVar4 = nmcVar;
                                            long j25 = dx7VarD2.b;
                                            int i6 = dx7VarD2.c;
                                            boolean z114 = !z2;
                                            boolean z115 = qx7Var.k;
                                            sparseArray = (SparseArray) ethVar3.a;
                                            dthVar = (dth) sparseArray.get(i2);
                                            if (dthVar == null) {
                                                dthVar = new dth(9223372036854775806L);
                                                sparseArray.put(i2, dthVar);
                                            }
                                            chVar2 = chVar2;
                                            chVar2.c = new ix7(ab5Var3, zv6Var, a35Var7, b87Var3, z5, u25Var2, a35Var, z6, uri, list6, iT3, objI3, j119, j24, j25, i6, z114, i2, z115, z112, dthVar, qx7Var.f, riVar, d48Var4, nmcVar4, z4, z3, z3dVar3);
                                        }
                                        if (z4) {
                                        }
                                        ab5 ab5Var4 = ex7Var.a;
                                        u25Var = ex7Var.b;
                                        b87 b87Var4 = ex7Var.f[iR];
                                        List list7 = ex7Var.i;
                                        int iT4 = ex7Var.r.t();
                                        Object objI4 = ex7Var.r.i();
                                        boolean z116 = ex7Var.l;
                                        eth ethVar4 = ex7Var.d;
                                        if (uriE2 == null) {
                                            b1kVar2.getClass();
                                            b1kVar = b1kVar2;
                                            bArr = null;
                                        } else {
                                            b1kVar = b1kVar2;
                                            bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                        }
                                        if (uriE == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                        }
                                        z3d z3dVar4 = ex7Var.k;
                                        AtomicInteger atomicInteger6 = ix7.Y;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriE9 = w1m.e(str, qx7Var.a);
                                        long j1110 = qx7Var.i;
                                        long j1111 = qx7Var.j;
                                        if (z2) {
                                            i = 8;
                                        } else {
                                            i = 0;
                                        }
                                        lvb.W(uriE9, "The uri must be set.");
                                        a35 a35Var9 = new a35(uriE9, 0L, 1, null, map, j1110, j1111, null, i, null);
                                        if (bArr != null) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            String str10 = qx7Var.h;
                                            str10.getClass();
                                            bArrD = ix7.d(str10);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            zv6Var = new zv6(u25Var, bArr, bArrD);
                                        } else {
                                            zv6Var = u25Var;
                                        }
                                        px7Var2 = qx7Var.b;
                                        if (px7Var2 != null) {
                                            if (bArr2 != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z9) {
                                                String str11 = px7Var2.h;
                                                str11.getClass();
                                                bArrD2 = ix7.d(str11);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z117 = z9;
                                            Uri uriE10 = w1m.e(str, px7Var2.a);
                                            long j1112 = px7Var2.i;
                                            long j1113 = px7Var2.j;
                                            lvb.W(uriE10, "The uri must be set.");
                                            a35 a35Var10 = new a35(uriE10, 0L, 1, null, map, j1112, j1113, null, 0, null);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                            } else {
                                                zv6Var2 = u25Var;
                                            }
                                            z6 = z117;
                                            u25Var2 = zv6Var2;
                                            a35Var = a35Var10;
                                        } else {
                                            a35Var = null;
                                            u25Var2 = null;
                                            z6 = false;
                                        }
                                        long j1114 = j3 + j5;
                                        long j26 = j1114 + qx7Var.c;
                                        i2 = sx7Var.j + qx7Var.d;
                                        if (ix7Var != null) {
                                            a35Var2 = ix7Var.q;
                                            if (a35Var != a35Var2) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            if (uri.equals(ix7Var.m)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            d48Var = ix7Var.y;
                                            nmcVar = ix7Var.z;
                                            if (z7) {
                                                riVar2 = null;
                                            } else {
                                                riVar2 = null;
                                            }
                                            riVar = riVar2;
                                        } else {
                                            d48Var = new d48(null);
                                            nmcVar = new nmc(10);
                                            riVar = null;
                                        }
                                        d48 d48Var5 = d48Var;
                                        nmc nmcVar5 = nmcVar;
                                        long j27 = dx7VarD2.b;
                                        int i7 = dx7VarD2.c;
                                        boolean z118 = !z2;
                                        boolean z119 = qx7Var.k;
                                        sparseArray = (SparseArray) ethVar4.a;
                                        dthVar = (dth) sparseArray.get(i2);
                                        if (dthVar == null) {
                                            dthVar = new dth(9223372036854775806L);
                                            sparseArray.put(i2, dthVar);
                                        }
                                        chVar2 = chVar2;
                                        chVar2.c = new ix7(ab5Var4, zv6Var, a35Var9, b87Var4, z5, u25Var2, a35Var, z6, uri, list7, iT4, objI4, j1114, j26, j27, i7, z118, i2, z119, z116, dthVar, qx7Var.f, riVar, d48Var5, nmcVar5, z4, z3, z3dVar4);
                                    }
                                }
                            }
                        }
                    } else {
                        j3 = j13;
                    }
                    ix7Var = ix7Var3;
                    ex7Var = ex7Var2;
                    sx7Var = sx7VarA;
                    uri = uri2;
                    str = sx7Var.a;
                    z = sx7Var.c;
                    j4 = sx7Var.k;
                    c98 c98Var2 = sx7Var.r;
                    if (iR != i3) {
                        cb5Var = (cb5) db5Var.d.get(uriArr[i3]);
                        if (cb5Var != null) {
                            cb5Var.k = false;
                        }
                    }
                    if (jLongValue < j4) {
                        ex7Var.n = new BehindLiveWindowException();
                    } else {
                        dx7VarD2 = ex7.d(sx7Var, jLongValue, iIntValue);
                        if (dx7VarD2 != null) {
                            z2 = dx7VarD2.d;
                            qx7Var = dx7VarD2.a;
                            ex7Var.p = null;
                            SystemClock.elapsedRealtime();
                            px7Var = qx7Var.b;
                            j5 = qx7Var.e;
                            if (px7Var != null) {
                                uriE = null;
                            } else {
                                uriE = null;
                            }
                            ax7VarE = ex7Var.e(uriE, iR, true);
                            chVar2.c = ax7VarE;
                            if (ax7VarE == null) {
                                str2 = qx7Var.g;
                                if (str2 == null) {
                                    uriE2 = null;
                                } else {
                                    uriE2 = w1m.e(str, str2);
                                }
                                ax7VarE2 = ex7Var.e(uriE2, iR, false);
                                chVar2.c = ax7VarE2;
                                if (ax7VarE2 == null) {
                                    if (!(qx7Var instanceof nx7)) {
                                        z3 = z;
                                    } else if (((nx7) qx7Var).l) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (ix7Var == null) {
                                        AtomicInteger atomicInteger7 = ix7.Y;
                                    } else {
                                        if (uri.equals(ix7Var.m)) {
                                            if (z3) {
                                            }
                                        } else if (z3) {
                                        }
                                        if (z4) {
                                        }
                                        ab5 ab5Var5 = ex7Var.a;
                                        u25Var = ex7Var.b;
                                        b87 b87Var5 = ex7Var.f[iR];
                                        List list8 = ex7Var.i;
                                        int iT5 = ex7Var.r.t();
                                        Object objI5 = ex7Var.r.i();
                                        boolean z1110 = ex7Var.l;
                                        eth ethVar5 = ex7Var.d;
                                        if (uriE2 == null) {
                                            b1kVar2.getClass();
                                            b1kVar = b1kVar2;
                                            bArr = null;
                                        } else {
                                            b1kVar = b1kVar2;
                                            bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                        }
                                        if (uriE == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                        }
                                        z3d z3dVar5 = ex7Var.k;
                                        AtomicInteger atomicInteger8 = ix7.Y;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriE11 = w1m.e(str, qx7Var.a);
                                        long j1115 = qx7Var.i;
                                        long j1116 = qx7Var.j;
                                        if (z2) {
                                            i = 8;
                                        } else {
                                            i = 0;
                                        }
                                        lvb.W(uriE11, "The uri must be set.");
                                        a35 a35Var11 = new a35(uriE11, 0L, 1, null, map, j1115, j1116, null, i, null);
                                        if (bArr != null) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            String str12 = qx7Var.h;
                                            str12.getClass();
                                            bArrD = ix7.d(str12);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            zv6Var = new zv6(u25Var, bArr, bArrD);
                                        } else {
                                            zv6Var = u25Var;
                                        }
                                        px7Var2 = qx7Var.b;
                                        if (px7Var2 != null) {
                                            if (bArr2 != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z9) {
                                                String str13 = px7Var2.h;
                                                str13.getClass();
                                                bArrD2 = ix7.d(str13);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z1111 = z9;
                                            Uri uriE12 = w1m.e(str, px7Var2.a);
                                            long j1117 = px7Var2.i;
                                            long j1118 = px7Var2.j;
                                            lvb.W(uriE12, "The uri must be set.");
                                            a35 a35Var12 = new a35(uriE12, 0L, 1, null, map, j1117, j1118, null, 0, null);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                            } else {
                                                zv6Var2 = u25Var;
                                            }
                                            z6 = z1111;
                                            u25Var2 = zv6Var2;
                                            a35Var = a35Var12;
                                        } else {
                                            a35Var = null;
                                            u25Var2 = null;
                                            z6 = false;
                                        }
                                        long j1119 = j3 + j5;
                                        long j28 = j1119 + qx7Var.c;
                                        i2 = sx7Var.j + qx7Var.d;
                                        if (ix7Var != null) {
                                            a35Var2 = ix7Var.q;
                                            if (a35Var != a35Var2) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            if (uri.equals(ix7Var.m)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            d48Var = ix7Var.y;
                                            nmcVar = ix7Var.z;
                                            if (z7) {
                                                riVar2 = null;
                                            } else {
                                                riVar2 = null;
                                            }
                                            riVar = riVar2;
                                        } else {
                                            d48Var = new d48(null);
                                            nmcVar = new nmc(10);
                                            riVar = null;
                                        }
                                        d48 d48Var6 = d48Var;
                                        nmc nmcVar6 = nmcVar;
                                        long j29 = dx7VarD2.b;
                                        int i8 = dx7VarD2.c;
                                        boolean z1112 = !z2;
                                        boolean z1113 = qx7Var.k;
                                        sparseArray = (SparseArray) ethVar5.a;
                                        dthVar = (dth) sparseArray.get(i2);
                                        if (dthVar == null) {
                                            dthVar = new dth(9223372036854775806L);
                                            sparseArray.put(i2, dthVar);
                                        }
                                        chVar2 = chVar2;
                                        chVar2.c = new ix7(ab5Var5, zv6Var, a35Var11, b87Var5, z5, u25Var2, a35Var, z6, uri, list8, iT5, objI5, j1119, j28, j29, i8, z1112, i2, z1113, z1110, dthVar, qx7Var.f, riVar, d48Var6, nmcVar6, z4, z3, z3dVar5);
                                    }
                                    if (z4) {
                                    }
                                    ab5 ab5Var6 = ex7Var.a;
                                    u25Var = ex7Var.b;
                                    b87 b87Var6 = ex7Var.f[iR];
                                    List list9 = ex7Var.i;
                                    int iT6 = ex7Var.r.t();
                                    Object objI6 = ex7Var.r.i();
                                    boolean z1114 = ex7Var.l;
                                    eth ethVar6 = ex7Var.d;
                                    if (uriE2 == null) {
                                        b1kVar2.getClass();
                                        b1kVar = b1kVar2;
                                        bArr = null;
                                    } else {
                                        b1kVar = b1kVar2;
                                        bArr = (byte[]) ((xe7) b1kVar.b).get(uriE2);
                                    }
                                    if (uriE == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((xe7) b1kVar.b).get(uriE);
                                    }
                                    z3d z3dVar6 = ex7Var.k;
                                    AtomicInteger atomicInteger9 = ix7.Y;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriE13 = w1m.e(str, qx7Var.a);
                                    long j11110 = qx7Var.i;
                                    long j11111 = qx7Var.j;
                                    if (z2) {
                                        i = 8;
                                    } else {
                                        i = 0;
                                    }
                                    lvb.W(uriE13, "The uri must be set.");
                                    a35 a35Var13 = new a35(uriE13, 0L, 1, null, map, j11110, j11111, null, i, null);
                                    if (bArr != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        String str14 = qx7Var.h;
                                        str14.getClass();
                                        bArrD = ix7.d(str14);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        zv6Var = new zv6(u25Var, bArr, bArrD);
                                    } else {
                                        zv6Var = u25Var;
                                    }
                                    px7Var2 = qx7Var.b;
                                    if (px7Var2 != null) {
                                        if (bArr2 != null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            String str15 = px7Var2.h;
                                            str15.getClass();
                                            bArrD2 = ix7.d(str15);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        boolean z1115 = z9;
                                        Uri uriE14 = w1m.e(str, px7Var2.a);
                                        long j11112 = px7Var2.i;
                                        long j11113 = px7Var2.j;
                                        lvb.W(uriE14, "The uri must be set.");
                                        a35 a35Var14 = new a35(uriE14, 0L, 1, null, map, j11112, j11113, null, 0, null);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            zv6Var2 = new zv6(u25Var, bArr2, bArrD2);
                                        } else {
                                            zv6Var2 = u25Var;
                                        }
                                        z6 = z1115;
                                        u25Var2 = zv6Var2;
                                        a35Var = a35Var14;
                                    } else {
                                        a35Var = null;
                                        u25Var2 = null;
                                        z6 = false;
                                    }
                                    long j11114 = j3 + j5;
                                    long j210 = j11114 + qx7Var.c;
                                    i2 = sx7Var.j + qx7Var.d;
                                    if (ix7Var != null) {
                                        a35Var2 = ix7Var.q;
                                        if (a35Var != a35Var2) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        if (uri.equals(ix7Var.m)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        d48Var = ix7Var.y;
                                        nmcVar = ix7Var.z;
                                        if (z7) {
                                            riVar2 = null;
                                        } else {
                                            riVar2 = null;
                                        }
                                        riVar = riVar2;
                                    } else {
                                        d48Var = new d48(null);
                                        nmcVar = new nmc(10);
                                        riVar = null;
                                    }
                                    d48 d48Var7 = d48Var;
                                    nmc nmcVar7 = nmcVar;
                                    long j211 = dx7VarD2.b;
                                    int i9 = dx7VarD2.c;
                                    boolean z1116 = !z2;
                                    boolean z1117 = qx7Var.k;
                                    sparseArray = (SparseArray) ethVar6.a;
                                    dthVar = (dth) sparseArray.get(i2);
                                    if (dthVar == null) {
                                        dthVar = new dth(9223372036854775806L);
                                        sparseArray.put(i2, dthVar);
                                    }
                                    chVar2 = chVar2;
                                    chVar2.c = new ix7(ab5Var6, zv6Var, a35Var13, b87Var6, z5, u25Var2, a35Var, z6, uri, list9, iT6, objI6, j11114, j210, j211, i9, z1116, i2, z1117, z1114, dthVar, qx7Var.f, riVar, d48Var7, nmcVar7, z4, z3, z3dVar6);
                                }
                            }
                        } else if (!sx7Var.o) {
                            chVar2.d = uri;
                            ex7Var.p = uri;
                        } else {
                            if (z12) {
                            }
                            chVar2.b = true;
                        }
                    }
                } else {
                    ch chVar5 = chVar;
                    chVar5.d = uri2;
                    ex7Var2.p = uri2;
                    chVar2 = chVar5;
                }
                boolean z20 = chVar2.b;
                uq3 uq3Var = (uq3) chVar2.c;
                Uri uri4 = (Uri) chVar2.d;
                if (z20) {
                    this.p1 = -9223372036854775807L;
                    this.s1 = true;
                    return true;
                }
                if (uq3Var == null) {
                    if (uri4 == null) {
                        return false;
                    }
                    ((cb5) ((jx7) this.c.a).b.d.get(uri4)).c(true);
                    return false;
                }
                if (uq3Var instanceof ix7) {
                    ix7 ix7Var4 = (ix7) uq3Var;
                    ArrayList arrayList = this.n;
                    if (!arrayList.isEmpty()) {
                        if (!B().f()) {
                            A(arrayList.size() - 1);
                        }
                        if (ix7Var4.n && ix7Var4.X) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                long j30 = ((ix7) arrayList.get(size)).g;
                                long j31 = ix7Var4.g;
                                if (j30 < j31) {
                                    break;
                                }
                                if (j30 == j31 && m(size)) {
                                    A(size);
                                    ix7Var4.X = false;
                                    break;
                                }
                            }
                        }
                    }
                    this.w1 = ix7Var4;
                    this.F = ix7Var4.d;
                    this.p1 = -9223372036854775807L;
                    arrayList.add(ix7Var4);
                    z88 z88VarL = c98.l();
                    for (ey7 ey7Var3 : this.v) {
                        z88VarL.c(Integer.valueOf(ey7Var3.q + ey7Var3.p));
                    }
                    ghe gheVarH = z88VarL.h();
                    ix7Var4.D = this;
                    ix7Var4.I = gheVarH;
                    for (ey7 ey7Var4 : this.v) {
                        ey7Var4.getClass();
                        ey7Var4.C = ix7Var4.k;
                        if (ix7Var4.X) {
                            ey7Var4.G = true;
                        }
                    }
                }
                this.u = uq3Var;
                dc9Var.N(uq3Var, this, this.i.o(uq3Var.c));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vhf
    public final long v() {
        if (this.s1) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.p1;
        }
        long jMax = this.o1;
        ix7 ix7VarB = B();
        if (!ix7VarB.H) {
            ArrayList arrayList = this.n;
            ix7VarB = arrayList.size() > 1 ? (ix7) qv1.f(2, arrayList) : null;
        }
        if (ix7VarB != null) {
            jMax = Math.max(jMax, ix7VarB.h);
        }
        if (this.C) {
            for (ey7 ey7Var : this.v) {
                jMax = Math.max(jMax, ey7Var.q());
            }
        }
        return jMax;
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        boolean zG;
        dc1 dc1Var;
        int i2;
        uq3 uq3Var = (uq3) y99Var;
        boolean z = uq3Var instanceof ix7;
        if (z && !((ix7) uq3Var).f() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).c) == 410 || i2 == 404)) {
            return dc9.e;
        }
        long j3 = uq3Var.i.b;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, j3);
        vqi.p0(uq3Var.g);
        vqi.p0(uq3Var.h);
        mf mfVar = new mf(iOException, i, 7);
        ex7 ex7Var = this.d;
        xu6 xu6VarC = oyl.c(ex7Var.r);
        l6m l6mVar = this.i;
        dc1 dc1VarN = l6mVar.n(xu6VarC, mfVar);
        if (dc1VarN == null || dc1VarN.a != 2) {
            zG = false;
        } else {
            long j4 = dc1VarN.b;
            rg6 rg6Var = ex7Var.r;
            zG = rg6Var.g(rg6Var.k(ex7Var.h.b(uq3Var.d)), j4);
        }
        if (zG) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.n;
                lvb.b0(((ix7) arrayList.remove(arrayList.size() - 1)) == uq3Var);
                if (arrayList.isEmpty()) {
                    this.p1 = this.o1;
                } else {
                    ((ix7) np4.n(arrayList)).J = true;
                }
            }
            dc1Var = dc9.f;
        } else {
            long jQ = l6mVar.q(mfVar);
            dc1Var = jQ != -9223372036854775807L ? new dc1(0, jQ, false) : dc9.g;
        }
        dc1 dc1Var2 = dc1Var;
        boolean zF = dc1Var2.f();
        this.k.P(t99Var, uq3Var.c, this.b, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h, iOException, !zF);
        if (!zF) {
            this.u = null;
        }
        if (zG) {
            if (!this.D) {
                ea9 ea9Var = new ea9();
                ea9Var.a = this.o1;
                u(new fa9(ea9Var));
                return dc1Var2;
            }
            this.c.q(this);
        }
        return dc1Var2;
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        dc9 dc9Var = this.j;
        if (dc9Var.I() || E()) {
            return;
        }
        boolean zJ = dc9Var.J();
        ex7 ex7Var = this.d;
        List list = this.o;
        if (zJ) {
            this.u.getClass();
            if (ex7Var.n != null ? false : ex7Var.r.c(j, this.u, list)) {
                dc9Var.A();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && ex7Var.b((ix7) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            A(size);
        }
        int size2 = (ex7Var.n != null || ex7Var.r.length() < 2) ? list.size() : ex7Var.r.q(j, list);
        if (size2 < this.n.size()) {
            A(size2);
        }
    }
}
