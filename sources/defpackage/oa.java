package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class oa extends qs0 {
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

    public oa(hyh hyhVar, int[] iArr, ko0 ko0Var, long j, long j2, long j3, c98 c98Var) {
        super(0, hyhVar, iArr);
        if (j3 < j) {
            lvb.G0("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = ko0Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = c98.n(c98Var);
        this.p = qt3.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
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
                z88VarL.c(new na(0L, 0L));
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
                z88Var.c(new na(j, jArr[i]));
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

    @Override // defpackage.rg6
    public final int b() {
        return this.r;
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
        long jY;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= gt9VarArr.length || !gt9VarArr[i].next()) {
            int length = gt9VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jY = y(list);
                    break;
                }
                gt9 gt9Var = gt9VarArr[i2];
                if (gt9Var.next()) {
                    jY = gt9Var.b() - gt9Var.a();
                    break;
                }
                i2++;
            }
        } else {
            gt9 gt9Var2 = gt9VarArr[this.r];
            jY = gt9Var2.b() - gt9Var2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = x(jElapsedRealtime, jY);
            return;
        }
        int i4 = this.r;
        int iN = list.isEmpty() ? -1 : n(((ft9) np4.n(list)).d);
        if (iN != -1) {
            i3 = ((ft9) np4.n(list)).e;
            i4 = iN;
        }
        int iX = x(jElapsedRealtime, jY);
        if (iX != i4 && !a(i4, jElapsedRealtime)) {
            b87[] b87VarArr = this.d;
            b87 b87Var = b87VarArr[i4];
            b87 b87Var2 = b87VarArr[iX];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jY != -9223372036854775807L ? j3 - jY : j3) * this.n), jMin);
            }
            int i5 = b87Var2.j;
            int i6 = b87Var.j;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.i)) {
                iX = i4;
            }
        }
        if (iX != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = iX;
    }

    @Override // defpackage.qs0, defpackage.rg6
    public final void p() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.qs0, defpackage.rg6
    public final int q(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((ft9) np4.n(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (ft9) np4.n(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jI = vqi.I(this.q, ((ft9) list.get(size - 1)).g - j);
        long j3 = this.j;
        if (jI >= j3) {
            b87 b87Var = this.d[x(jElapsedRealtime, y(list))];
            for (int i3 = 0; i3 < size; i3++) {
                ft9 ft9Var = (ft9) list.get(i3);
                b87 b87Var2 = ft9Var.d;
                if (vqi.I(this.q, ft9Var.g - j) >= j3 && b87Var2.j < b87Var.j && (i = b87Var2.v) != -1 && i <= this.l && (i2 = b87Var2.u) != -1 && i2 <= this.k && i < b87Var.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.rg6
    public final int t() {
        return this.s;
    }

    public final int x(long j, long j2) {
        long jMax;
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
            while (i < c98Var.size() - 1 && ((na) c98Var.get(i)).a < jMax) {
                i++;
            }
            na naVar = (na) c98Var.get(i - 1);
            na naVar2 = (na) c98Var.get(i);
            long j3 = naVar.a;
            float f2 = (jMax - j3) / (naVar2.a - j3);
            long j4 = naVar.b;
            jMax = ((long) (f2 * (naVar2.b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= jMax) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
