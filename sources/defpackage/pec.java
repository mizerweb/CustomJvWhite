package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pec extends qs0 {
    public final ifh A;
    public final ifh B;
    public final ko0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final c98 o;
    public final nfh p;
    public float q;
    public int r;
    public int s;
    public long t;
    public ft9 u;
    public final myh v;
    public final af7 w;
    public final af7 x;
    public final ny8 y;
    public final ny8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pec(hyh hyhVar, int[] iArr, ko0 ko0Var, c98 c98Var, myh myhVar, af7 af7Var, af7 af7Var2, int[] iArr2) {
        super(0, hyhVar, iArr);
        final int i = 0;
        this.g = ko0Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = c98.n(c98Var);
        this.p = qt3.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
        this.v = myhVar;
        this.w = af7Var;
        this.x = af7Var2;
        boolean z = nec.a;
        this.y = rx8.P(3, new af7(this) { // from class: oec
            public final /* synthetic */ pec b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                pec pecVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = pecVar.b;
                        ArrayList arrayList = new ArrayList(i3);
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayList.add(pecVar.d[i4]);
                        }
                        return arrayList;
                    default:
                        List list = (List) pecVar.y.getValue();
                        ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            kwi kwiVarE = srk.e((b87) it.next());
                            arrayList2.add(new t4j(q3m.e(kwiVarE), kwiVarE, true));
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.z = rx8.P(3, new af7(this) { // from class: oec
            public final /* synthetic */ pec b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                pec pecVar = this.b;
                switch (i3) {
                    case 0:
                        int i4 = pecVar.b;
                        ArrayList arrayList = new ArrayList(i4);
                        for (int i5 = 0; i5 < i4; i5++) {
                            arrayList.add(pecVar.d[i5]);
                        }
                        return arrayList;
                    default:
                        List list = (List) pecVar.y.getValue();
                        ArrayList arrayList2 = new ArrayList(yw3.W0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            kwi kwiVarE = srk.e((b87) it.next());
                            arrayList2.add(new t4j(q3m.e(kwiVarE), kwiVarE, true));
                        }
                        return arrayList2;
                }
            }
        });
        rx8.P(3, new vx9(iArr2, 22, this));
        this.A = new ifh(new cka(hyhVar, this));
        this.B = new ifh(new i94(12));
    }

    public static ghe v(pg6[] pg6VarArr) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = 1;
            if (i5 >= pg6VarArr.length) {
                break;
            }
            pg6 pg6Var = pg6VarArr[i5];
            if (pg6Var == null || pg6Var.b.length <= 1) {
                arrayList.add(null);
            } else {
                z88 z88VarL = c98.l();
                z88VarL.c(new qa(0L, 0L));
                arrayList.add(z88VarL);
            }
            i5++;
        }
        int length = pg6VarArr.length;
        long[][] jArr = new long[length][];
        for (int i6 = 0; i6 < pg6VarArr.length; i6++) {
            pg6 pg6Var2 = pg6VarArr[i6];
            if (pg6Var2 == null) {
                jArr[i6] = new long[0];
            } else {
                int[] iArr2 = pg6Var2.b;
                jArr[i6] = new long[iArr2.length];
                for (int i7 = 0; i7 < iArr2.length; i7++) {
                    long j = pg6Var2.a.d[iArr2[i7]].j;
                    long[] jArr2 = jArr[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i7] = j;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr3 = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        w(arrayList, jArr3);
        oc9.p(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(lbb.a);
        d7b d7bVar = new d7b();
        e7b e7bVar = new e7b(treeMap);
        e7bVar.g = d7bVar;
        int i9 = 0;
        while (i9 < length) {
            long[] jArr5 = jArr[i9];
            if (jArr5.length <= i) {
                i2 = i4;
                i3 = i;
                iArr = iArr3;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i10 = i4;
                while (true) {
                    long[] jArr6 = jArr[i9];
                    i2 = i4;
                    double dLog = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = i;
                    int[] iArr4 = iArr3;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i10] = dLog;
                    i10++;
                    i = i11;
                    i4 = i2;
                    iArr3 = iArr4;
                }
                int i12 = i;
                iArr = iArr3;
                int i13 = length2 - 1;
                double d = dArr[i13] - dArr[i2];
                int i14 = i2;
                while (i14 < i13) {
                    double d2 = dArr[i14];
                    i14++;
                    e7bVar.j(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i14]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i9));
                    i12 = i12;
                }
                i3 = i12;
            }
            i9++;
            i4 = i2;
            iArr3 = iArr;
            i = i3;
        }
        int i15 = i4;
        int[] iArr5 = iArr3;
        c98 c98VarN = c98.n(e7bVar.k());
        for (int i16 = i15; i16 < c98VarN.size(); i16++) {
            int iIntValue = ((Integer) c98VarN.get(i16)).intValue();
            int i17 = iArr5[iIntValue] + 1;
            iArr5[iIntValue] = i17;
            jArr3[iIntValue] = jArr[iIntValue][i17];
            w(arrayList, jArr3);
        }
        for (int i18 = i15; i18 < pg6VarArr.length; i18++) {
            if (arrayList.get(i18) != null) {
                jArr3[i18] = jArr3[i18] * 2;
            }
        }
        w(arrayList, jArr3);
        z88 z88VarL2 = c98.l();
        for (int i19 = i15; i19 < arrayList.size(); i19++) {
            z88 z88Var = (z88) arrayList.get(i19);
            z88VarL2.c(z88Var == null ? ghe.e : z88Var.h());
        }
        return z88VarL2.h();
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            z88 z88Var = (z88) arrayList.get(i);
            if (z88Var != null) {
                z88Var.c(new qa(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            ft9 ft9Var = (ft9) np4.n(list);
            long j = ft9Var.g;
            if (j != -9223372036854775807L) {
                long j2 = ft9Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final long A(gt9[] gt9VarArr, List list) {
        int i = this.r;
        if (i < gt9VarArr.length && gt9VarArr[i].next()) {
            gt9 gt9Var = gt9VarArr[this.r];
            return gt9Var.b() - gt9Var.a();
        }
        for (gt9 gt9Var2 : gt9VarArr) {
            if (gt9Var2.next()) {
                return gt9Var2.b() - gt9Var2.a();
            }
        }
        return y(list);
    }

    public final int B(int i) {
        if (this.a.c != 2) {
            return i;
        }
        pa paVar = (pa) this.w.invoke();
        if (paVar == null) {
            paVar = pa.d;
        }
        boolean z = nec.a;
        myh myhVar = this.v;
        xc7 xc7Var = myhVar.a;
        xc7 xc7Var2 = paVar.a;
        if (xc7Var.compareTo(xc7Var2) < 0) {
            xc7Var = xc7Var2;
        }
        xc7 xc7Var3 = myhVar.b;
        xc7 xc7Var4 = paVar.b;
        if (xc7Var3.compareTo(xc7Var4) > 0) {
            xc7Var3 = xc7Var4;
        }
        List list = (List) this.z.getValue();
        af7 af7Var = this.x;
        if (af7Var != null) {
        }
        int i2 = 0;
        if (((kwi) ((t4j) list.get(i)).b).c().compareTo(xc7Var) < 0) {
            i = 0;
            for (int iO0 = xw3.O0(list); -1 < iO0; iO0--) {
                if (((kwi) ((t4j) list.get(iO0)).b).c().compareTo(xc7Var) >= 0) {
                    i = iO0;
                    break;
                }
                i = iO0;
            }
        }
        if (((kwi) ((t4j) list.get(i)).b).c().compareTo(xc7Var3) <= 0) {
            return i;
        }
        int iO1 = xw3.O0(list);
        int iO2 = xw3.O0(list);
        if (iO2 < 0) {
            return iO1;
        }
        while (((kwi) ((t4j) list.get(i2)).b).c().compareTo(xc7Var3) > 0 && i2 != iO2) {
            i2++;
        }
        return i2;
    }

    @Override // defpackage.rg6
    public final int b() {
        return this.r;
    }

    @Override // defpackage.rg6
    public final boolean c(long j, uq3 uq3Var, List list) {
        boolean z = nec.a;
        if (this.A.getValue() == null) {
            return false;
        }
        ore.m();
        return false;
    }

    @Override // defpackage.qs0, defpackage.rg6
    public final void f() {
        this.u = null;
    }

    @Override // defpackage.qs0, defpackage.rg6
    public final void h(float f) {
        this.q = f;
    }

    @Override // defpackage.rg6
    public final Object i() {
        return null;
    }

    @Override // defpackage.rg6
    public final void l(long j, long j2, long j3, List list, gt9[] gt9VarArr) {
        z();
        A(gt9VarArr, list);
        if (this.A.getValue() != null) {
            ore.m();
            return;
        }
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jA = A(gt9VarArr, list);
        int i = this.s;
        if (i == 0) {
            this.s = 1;
            this.r = x(jElapsedRealtime, jA);
        } else {
            int i2 = this.r;
            int iN = list.isEmpty() ? -1 : n(((ft9) np4.n(list)).d);
            if (iN != -1) {
                i = ((ft9) np4.n(list)).e;
                i2 = iN;
            }
            int iX = x(jElapsedRealtime, jA);
            if (iX != i2 && !a(i2, jElapsedRealtime)) {
                b87[] b87VarArr = this.d;
                b87 b87Var = b87VarArr[i2];
                b87 b87Var2 = b87VarArr[iX];
                long jMin = this.h;
                ifh ifhVar = this.B;
                if (j3 == -9223372036854775807L) {
                } else {
                    long j4 = (long) ((jA != -9223372036854775807L ? j3 - jA : j3) * this.n);
                    jMin = Math.min(j4, jMin);
                }
                int i3 = b87Var2.j;
                int i4 = b87Var.j;
                if ((i3 > i4 && j2 < jMin) || (i3 < i4 && j2 >= this.i)) {
                    iX = i2;
                }
            }
            if (iX != i2) {
                i = 3;
            }
            this.s = i;
            this.r = iX;
        }
        this.r = B(this.r);
    }

    @Override // defpackage.qs0, defpackage.rg6
    public final void p() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // defpackage.qs0, defpackage.rg6
    public final int q(long j, List list) {
        int size;
        int i;
        int i2;
        boolean z = nec.a;
        if (list.isEmpty()) {
            size = 0;
        } else {
            ((ft9) list.get(list.size() - 1)).getClass();
            this.p.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.t;
            if (j2 == -9223372036854775807L || jElapsedRealtime - j2 >= 1000 || !(list.isEmpty() || ((ft9) np4.n(list)).equals(this.u))) {
                this.t = jElapsedRealtime;
                this.u = list.isEmpty() ? null : (ft9) np4.n(list);
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    long jI = vqi.I(this.q, ((ft9) list.get(size2 - 1)).g - j);
                    long j3 = this.j;
                    if (jI >= j3) {
                        b87 b87Var = this.d[x(jElapsedRealtime, y(list))];
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                size = size2;
                                break;
                            }
                            ft9 ft9Var = (ft9) list.get(i3);
                            b87 b87Var2 = ft9Var.d;
                            if (vqi.I(this.q, ft9Var.g - j) >= j3 && b87Var2.j < b87Var.j && (i = b87Var2.v) != -1 && i <= this.l && (i2 = b87Var2.u) != -1 && i2 <= this.k && i < b87Var.v) {
                                size = i3;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        size = size2;
                        break;
                    }
                } else {
                    size = 0;
                }
            } else {
                size = list.size();
            }
        }
        if (this.A.getValue() == null) {
            return size;
        }
        ore.m();
        return 0;
    }

    @Override // defpackage.rg6
    public final int t() {
        return this.s;
    }

    public final int x(long j, long j2) {
        long jMax;
        z();
        ko0 ko0Var = this.g;
        long jF = (long) (ko0Var.f() * this.m);
        long jB = ko0Var.b();
        if (jB == -9223372036854775807L || j2 == -9223372036854775807L) {
            jMax = (long) (jF / this.q);
        } else {
            float f = j2;
            jMax = (long) ((jF * Math.max((f / this.q) - jB, 0.0f)) / f);
        }
        c98 c98Var = this.o;
        if (!c98Var.isEmpty()) {
            int i = 1;
            while (i < c98Var.size() - 1 && ((qa) c98Var.get(i)).a < jMax) {
                i++;
            }
            qa qaVar = (qa) c98Var.get(i - 1);
            qa qaVar2 = (qa) c98Var.get(i);
            long j3 = qaVar.a;
            float f2 = (jMax - j3) / (qaVar2.a - j3);
            long j4 = qaVar.b;
            jMax = ((long) (f2 * (qaVar2.b - j4))) + j4;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.b) {
            if (j == Long.MIN_VALUE || !a(i2, j)) {
                if (this.d[i2].j <= jMax) {
                    return B(i2);
                }
                i3 = i2;
            }
            i2++;
        }
        i2 = i3;
        return B(i2);
    }

    public final Integer z() {
        int i = this.a.c;
        return null;
    }
}
