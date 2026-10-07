package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k5i implements jj6 {
    public final int a;
    public final int b;
    public final List c;
    public final nmc d;
    public final SparseIntArray e;
    public final we5 f;
    public final b8h g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final uxd k;
    public yw6 l;
    public lj6 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public n5i r;
    public int s;
    public int t;

    public k5i(int i, int i2, b8h b8hVar, dth dthVar, we5 we5Var) {
        this.f = we5Var;
        this.a = i;
        this.b = i2;
        this.g = b8hVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(dthVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(dthVar);
        }
        this.d = new nmc(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new uxd(1);
        this.m = lj6.o0;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (n5i) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new gbf(new cmf(this)));
        this.r = null;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        if ((this.b & 1) == 0) {
            lj6Var = new ae7(lj6Var, this.g);
        }
        this.m = lj6Var;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        byte[] bArr = this.d.a;
        kj6Var.u(0, bArr, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    kj6Var.E(i);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        yw6 yw6Var;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        lvb.b0(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dth dthVar = (dth) list.get(i);
            synchronized (dthVar) {
                j3 = dthVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = dthVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                dthVar.f(j2);
            }
        }
        if (j2 != 0 && (yw6Var = this.l) != null) {
            yw6Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((n5i) sparseArray.valueAt(i2)).f();
        }
        this.s = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [n5i] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        kj6 kj6Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        n5i n5iVar;
        boolean z;
        long jD;
        long length = kj6Var.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            uxd uxdVar = this.k;
            if (length != -1 && !z2 && !uxdVar.d) {
                int i6 = this.t;
                dth dthVar = uxdVar.b;
                nmc nmcVar = uxdVar.c;
                if (i6 <= 0) {
                    uxdVar.a(kj6Var);
                    return 0;
                }
                if (uxdVar.f) {
                    if (uxdVar.h == -9223372036854775807L) {
                        uxdVar.a(kj6Var);
                        return 0;
                    }
                    if (uxdVar.e) {
                        long j2 = uxdVar.g;
                        if (j2 == -9223372036854775807L) {
                            uxdVar.a(kj6Var);
                            return 0;
                        }
                        uxdVar.i = dthVar.c(uxdVar.h) - dthVar.b(j2);
                        uxdVar.a(kj6Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, kj6Var.getLength());
                    if (kj6Var.getPosition() != 0) {
                        s8Var.a = 0L;
                        return 1;
                    }
                    nmcVar.K(iMin);
                    kj6Var.q();
                    kj6Var.u(0, nmcVar.a, iMin);
                    int i7 = nmcVar.c;
                    for (int i8 = nmcVar.b; i8 < i7; i8++) {
                        if (nmcVar.a[i8] == 71) {
                            jD = rzl.d(nmcVar, i8, i6);
                            if (jD != -9223372036854775807L) {
                                uxdVar.g = jD;
                                uxdVar.e = true;
                                return 0;
                            }
                        }
                    }
                    jD = -9223372036854775807L;
                    uxdVar.g = jD;
                    uxdVar.e = true;
                    return 0;
                }
                long length2 = kj6Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (kj6Var.getPosition() != j3) {
                    s8Var.a = j3;
                    return 1;
                }
                nmcVar.K(iMin2);
                kj6Var.q();
                kj6Var.u(0, nmcVar.a, iMin2);
                int i9 = nmcVar.b;
                int i10 = nmcVar.c;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = nmcVar.a;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jD2 = rzl.d(nmcVar, i11, i6);
                                if (jD2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jD2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                uxdVar.h = j;
                uxdVar.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j4 = uxdVar.i;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    yw6 yw6Var = new yw6(new zpe(18), new ed7(this.t, uxdVar.b), j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = yw6Var;
                    this.m.r(yw6Var.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.r(new vk0(j4));
                }
            }
            if (this.q) {
                this.q = z;
                g(0L, 0L);
                if (kj6Var.getPosition() != 0) {
                    s8Var.a = 0L;
                    return i;
                }
            }
            yw6 yw6Var2 = this.l;
            if (yw6Var2 != null && yw6Var2.c != null) {
                return yw6Var2.b(kj6Var, s8Var);
            }
            kj6Var2 = kj6Var;
            r1 = z;
        } else {
            kj6Var2 = kj6Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        nmc nmcVar2 = this.d;
        byte[] bArr2 = nmcVar2.a;
        if (9400 - nmcVar2.b < 188) {
            int iA = nmcVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, nmcVar2.b, bArr2, r1, iA);
            }
            nmcVar2.L(iA, bArr2);
        }
        while (true) {
            int iA2 = nmcVar2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i15 = nmcVar2.b;
                int i16 = nmcVar2.c;
                byte[] bArr3 = nmcVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                nmcVar2.N(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = nmcVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iM = nmcVar2.m();
                if ((8388608 & iM) != 0) {
                    nmcVar2.N(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iM) != 0 ? 1 : r1;
                int i21 = (2096896 & iM) >> 8;
                ?? r14 = (iM & 32) != 0 ? 1 : r1;
                if ((iM & 16) != 0) {
                    n5iVar = (n5i) r7.get(i21);
                }
                if (r8 == 0) {
                    r8 = n5iVar;
                    nmcVar2.N(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        nmcVar2.N(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.f();
                    }
                }
                if (r14 != 0) {
                    int iA3 = nmcVar2.A();
                    r10 = (r10 == true ? 1 : 0) | ((nmcVar2.A() & 64) != 0 ? i4 : r1);
                    nmcVar2.O(iA3 - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    nmcVar2.M(i18);
                    r8.a(r10, nmcVar2);
                    nmcVar2.M(i20);
                }
                if (i3 != i4 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                nmcVar2.N(i18);
                return r1;
            }
            int i24 = nmcVar2.c;
            int i25 = kj6Var2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    n5i n5iVar2 = (n5i) r7.valueAt(r4);
                    if (n5iVar2 instanceof itc) {
                        itc itcVar = (itc) n5iVar2;
                        ?? r3 = (!z2 || itcVar.c()) ? i : r1;
                        if (itcVar.c == 3 && itcVar.j == -1 && ((!z2 || !(itcVar.a instanceof tr7)) && r3 != 0)) {
                            itcVar.a(i, new nmc());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            nmcVar2.M(i24 + i25);
            i = 1;
        }
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
