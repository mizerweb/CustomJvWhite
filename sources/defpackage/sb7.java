package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class sb7 implements jj6 {
    public static final byte[] n1 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b87 o1;
    public long A;
    public long B;
    public rb7 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public lj6 I;
    public kyh[] J;
    public kyh[] K;
    public boolean X;
    public boolean Y;
    public long Z;
    public final b8h a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final nmc e;
    public final nmc f;
    public final nmc g;
    public final byte[] h;
    public final nmc i;
    public final dth j;
    public final fik k;
    public final nmc l;
    public final ArrayDeque m;
    public final ArrayDeque n;
    public final ake o;
    public final kyh p;
    public final ex8 q;
    public ghe r;
    public int s;
    public int t;
    public long u;
    public int v;
    public nmc w;
    public long x;
    public int y;
    public long z;

    static {
        a87 a87Var = new a87();
        a87Var.m = uya.n("application/x-emsg");
        o1 = new b87(a87Var);
    }

    public sb7(b8h b8hVar, int i, dth dthVar, List list, kyh kyhVar) {
        this.a = b8hVar;
        this.b = i;
        this.j = dthVar;
        this.c = Collections.unmodifiableList(list);
        this.p = kyhVar;
        this.k = new fik(16);
        this.l = new nmc(16);
        this.e = new nmc(xsg.a);
        this.f = new nmc(6);
        this.g = new nmc();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new nmc(bArr);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.d = new SparseArray();
        a98 a98Var = c98.b;
        this.r = ghe.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = lj6.o0;
        this.J = new kyh[0];
        this.K = new kyh[0];
        this.o = new ake(new oo6(4, this));
        this.q = new ex8(10);
        this.Z = -1L;
    }

    public static wu5 c(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            n2b n2bVar = (n2b) list.get(i);
            if (n2bVar.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = n2bVar.c.a;
                a9m a9mVarC = iml.c(bArr);
                UUID uuid = a9mVarC == null ? null : (UUID) a9mVarC.c;
                if (uuid == null) {
                    lvb.G0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new vu5(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new wu5(null, false, (vu5[]) arrayList.toArray(new vu5[0]));
    }

    public static void d(nmc nmcVar, int i, gyh gyhVar) throws ParserException {
        nmcVar.N(i + 8);
        int iM = nmcVar.m();
        byte[] bArr = r21.a;
        if ((iM & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iE = nmcVar.E();
        if (iE == 0) {
            Arrays.fill(gyhVar.l, 0, gyhVar.e, false);
            return;
        }
        int i2 = gyhVar.e;
        nmc nmcVar2 = gyhVar.n;
        if (iE != i2) {
            StringBuilder sbY = zo5.y(iE, "Senc sample count ", " is different from fragment sample count");
            sbY.append(gyhVar.e);
            throw ParserException.a(null, sbY.toString());
        }
        Arrays.fill(gyhVar.l, 0, iE, z);
        nmcVar2.K(nmcVar.a());
        gyhVar.k = true;
        gyhVar.o = true;
        nmcVar.k(0, nmcVar2.a, nmcVar2.c);
        nmcVar2.N(0);
        gyhVar.o = false;
    }

    public static Pair e(long j, nmc nmcVar) throws ParserException {
        long jG;
        long jG2;
        nmc nmcVar2 = nmcVar;
        nmcVar2.N(8);
        int iE = r21.e(nmcVar2.m());
        nmcVar2.O(4);
        long jC = nmcVar2.C();
        if (iE == 0) {
            jG = nmcVar2.C();
            jG2 = nmcVar2.C();
        } else {
            jG = nmcVar2.G();
            jG2 = nmcVar2.G();
        }
        long j2 = jG2 + j;
        String str = vqi.a;
        long jI0 = vqi.i0(jG, 1000000L, jC, RoundingMode.DOWN);
        nmcVar2.O(2);
        int iH = nmcVar2.H();
        int[] iArr = new int[iH];
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        long[] jArr3 = new long[iH];
        long j3 = j2;
        long j4 = jI0;
        int i = 0;
        while (i < iH) {
            int iM = nmcVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jC2 = nmcVar2.C();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jG += jC2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jI1 = vqi.i0(jG, 1000000L, jC, RoundingMode.DOWN);
            jArr4[i] = jI1 - jArr5[i];
            nmcVar2.O(4);
            j3 += (long) iArr[i];
            i++;
            iH = iH;
            nmcVar2 = nmcVar;
            j4 = jI1;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jI0), new vq3(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            lj6Var = new ae7(lj6Var, this.a);
        }
        this.I = lj6Var;
        a();
        kyh[] kyhVarArr = new kyh[2];
        this.J = kyhVarArr;
        int i3 = 0;
        kyh kyhVar = this.p;
        if (kyhVar != null) {
            kyhVarArr[0] = kyhVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            kyhVarArr[i] = this.I.G(100, 5);
            i4 = 101;
            i++;
        }
        kyh[] kyhVarArr2 = (kyh[]) vqi.Z(this.J, i);
        this.J = kyhVarArr2;
        for (kyh kyhVar2 : kyhVarArr2) {
            kyhVar2.g(o1);
        }
        List list = this.c;
        this.K = new kyh[list.size()];
        while (i3 < this.K.length) {
            kyh kyhVarG = this.I.G(i4, 3);
            kyhVarG.g((b87) list.get(i3));
            this.K[i3] = kyhVarG;
            i3++;
            i4++;
        }
    }

    public final void a() {
        this.s = 0;
        this.v = 0;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        ghe gheVarR;
        mcg mcgVarC = cpk.c(kj6Var, true, false);
        if (mcgVarC != null) {
            gheVarR = c98.r(mcgVarC);
        } else {
            a98 a98Var = c98.b;
            gheVarR = ghe.e;
        }
        this.r = gheVarR;
        return mcgVarC == null;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x066f  */
    public final void f(long j) throws ParserException {
        lwa lwaVar;
        int i;
        long j2;
        gd5 gd5Var;
        int i2;
        gd5 gd5Var2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((m2b) arrayDeque.peek()).c != j) {
                break;
            }
            m2b m2bVar = (m2b) arrayDeque.pop();
            int i8 = m2bVar.b;
            ArrayList arrayList4 = m2bVar.e;
            ArrayList arrayList5 = m2bVar.d;
            int i9 = this.b;
            int i10 = 12;
            SparseArray sparseArray = this.d;
            if (i8 == 1836019574) {
                wu5 wu5VarC = c(arrayList5);
                m2b m2bVarG = m2bVar.g(1836475768);
                m2bVarG.getClass();
                ArrayList arrayList6 = m2bVarG.d;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList6.size();
                int i11 = 0;
                long jC = -9223372036854775807L;
                while (i11 < size) {
                    n2b n2bVar = (n2b) arrayList6.get(i11);
                    int i12 = n2bVar.b;
                    nmc nmcVar = n2bVar.c;
                    if (i12 == 1953654136) {
                        nmcVar.N(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(nmcVar.m()), new gd5(nmcVar.m() - 1, nmcVar.m(), nmcVar.m(), nmcVar.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (gd5) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            nmcVar.N(8);
                            jC = r21.e(nmcVar.m()) == 0 ? nmcVar.C() : nmcVar.G();
                        }
                    }
                    i11++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i13 = 0;
                m2b m2bVarG2 = m2bVar.g(1835365473);
                lwa lwaVarF = m2bVarG2 != null ? r21.f(m2bVarG2) : null;
                jj7 jj7Var = new jj7();
                n2b n2bVarH = m2bVar.h(1969517665);
                if (n2bVarH != null) {
                    lwa lwaVarK = r21.k(n2bVarH);
                    jj7Var.b(lwaVarK);
                    lwaVar = lwaVarK;
                } else {
                    lwaVar = null;
                }
                n2b n2bVarH2 = m2bVar.h(1836476516);
                n2bVarH2.getClass();
                lwa lwaVar2 = new lwa(r21.g(n2bVarH2.c));
                ArrayList arrayListJ = r21.j(m2bVar, jj7Var, jC, wu5VarC, (i9 & 16) != 0, false, new eu6(9, this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strA = avk.a(arrayListJ);
                    int i14 = 0;
                    while (i14 < size2) {
                        lyh lyhVar = (lyh) arrayListJ.get(i14);
                        cyh cyhVar = lyhVar.a;
                        lj6 lj6Var = this.I;
                        int i15 = cyhVar.b;
                        int i16 = cyhVar.a;
                        String str = strA;
                        b87 b87Var = cyhVar.g;
                        long j3 = cyhVar.e;
                        kyh kyhVarG = lj6Var.G(i14, i15);
                        kyhVarG.e(j3);
                        int i17 = i14;
                        a87 a87VarA = b87Var.a();
                        ArrayList arrayList7 = arrayListJ;
                        a87VarA.l = uya.n(str);
                        if (i15 == 1) {
                            int i18 = jj7Var.a;
                            i = size2;
                            j2 = j3;
                            if (i18 != -1 && (i2 = jj7Var.b) != -1) {
                                a87VarA.H = i18;
                                a87VarA.I = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        xuk.g(i15, lwaVarF, a87VarA, b87Var.l, lwaVar, lwaVar2);
                        if (sparseArray2.size() == 1) {
                            gd5Var = (gd5) sparseArray2.valueAt(i13);
                        } else {
                            gd5Var = (gd5) sparseArray2.get(i16);
                            gd5Var.getClass();
                        }
                        sparseArray.put(i16, new rb7(kyhVarG, lyhVar, gd5Var, new b87(a87VarA)));
                        this.A = Math.max(this.A, j2);
                        i14 = i17 + 1;
                        strA = str;
                        arrayListJ = arrayList7;
                        size2 = i;
                        i13 = 0;
                    }
                    this.I.D();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    lvb.b0(sparseArray.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        lyh lyhVar2 = (lyh) arrayList9.get(i19);
                        cyh cyhVar2 = lyhVar2.a;
                        rb7 rb7Var = (rb7) sparseArray.get(cyhVar2.a);
                        int i20 = cyhVar2.a;
                        if (sparseArray2.size() == 1) {
                            gd5Var2 = (gd5) sparseArray2.valueAt(0);
                        } else {
                            gd5Var2 = (gd5) sparseArray2.get(i20);
                            gd5Var2.getClass();
                        }
                        rb7Var.d = lyhVar2;
                        rb7Var.e = gd5Var2;
                        rb7Var.a.g(rb7Var.j);
                        rb7Var.e();
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    m2b m2bVar2 = (m2b) arrayList4.get(i21);
                    if (m2bVar2.b == 1953653094) {
                        n2b n2bVarH3 = m2bVar2.h(1952868452);
                        ArrayList arrayList10 = m2bVar2.d;
                        n2bVarH3.getClass();
                        nmc nmcVar2 = n2bVarH3.c;
                        nmcVar2.N(8);
                        int iM = nmcVar2.m();
                        byte[] bArr2 = r21.a;
                        rb7 rb7Var2 = (rb7) sparseArray.get(nmcVar2.m());
                        if (rb7Var2 == null) {
                            size3 = size3;
                            rb7Var2 = null;
                        } else {
                            gyh gyhVar = rb7Var2.b;
                            if ((iM & 1) != 0) {
                                long jG = nmcVar2.G();
                                gyhVar.b = jG;
                                gyhVar.c = jG;
                            }
                            gd5 gd5Var3 = rb7Var2.e;
                            gyhVar.a = new gd5((iM & 2) != 0 ? nmcVar2.m() - 1 : gd5Var3.a, (iM & 8) != 0 ? nmcVar2.m() : gd5Var3.b, (iM & 16) != 0 ? nmcVar2.m() : gd5Var3.c, (iM & 32) != 0 ? nmcVar2.m() : gd5Var3.d);
                        }
                        if (rb7Var2 != null) {
                            gyh gyhVar2 = rb7Var2.b;
                            long j4 = gyhVar2.p;
                            boolean z3 = gyhVar2.q;
                            rb7Var2.e();
                            rb7Var2.m = true;
                            n2b n2bVarH4 = m2bVar2.h(1952867444);
                            if (n2bVarH4 == null || (i9 & 2) != 0) {
                                gyhVar2.p = j4;
                                gyhVar2.q = z3;
                            } else {
                                nmc nmcVar3 = n2bVarH4.c;
                                nmcVar3.N(8);
                                gyhVar2.p = r21.e(nmcVar3.m()) == 1 ? nmcVar3.G() : nmcVar3.C();
                                gyhVar2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                n2b n2bVar2 = (n2b) arrayList10.get(i22);
                                int i25 = i21;
                                if (n2bVar2.b == 1953658222) {
                                    nmc nmcVar4 = n2bVar2.c;
                                    nmcVar4.N(12);
                                    int iE = nmcVar4.E();
                                    if (iE > 0) {
                                        i24 += iE;
                                        i23++;
                                    }
                                }
                                i22++;
                                i21 = i25;
                            }
                            i3 = i21;
                            rb7Var2.h = 0;
                            rb7Var2.g = 0;
                            rb7Var2.f = 0;
                            gyhVar2.d = i23;
                            gyhVar2.e = i24;
                            if (gyhVar2.g.length < i23) {
                                gyhVar2.f = new long[i23];
                                gyhVar2.g = new int[i23];
                            }
                            if (gyhVar2.h.length < i24) {
                                int i26 = (i24 * 125) / 100;
                                gyhVar2.h = new int[i26];
                                gyhVar2.i = new long[i26];
                                gyhVar2.j = new boolean[i26];
                                gyhVar2.l = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i27 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i9;
                                    cyh cyhVar3 = rb7Var2.d.a;
                                    gd5 gd5Var4 = gyhVar2.a;
                                    gd5Var4.getClass();
                                    fyh fyhVar = cyhVar3.l[gd5Var4.a];
                                    n2b n2bVarH5 = m2bVar2.h(1935763834);
                                    if (n2bVarH5 != null) {
                                        fyhVar.getClass();
                                        nmc nmcVar5 = n2bVarH5.c;
                                        int i30 = fyhVar.d;
                                        nmcVar5.N(8);
                                        int iM2 = nmcVar5.m();
                                        byte[] bArr3 = r21.a;
                                        if ((iM2 & 1) == 1) {
                                            nmcVar5.O(8);
                                        }
                                        int iA = nmcVar5.A();
                                        int iE2 = nmcVar5.E();
                                        if (iE2 > gyhVar2.e) {
                                            StringBuilder sbY = zo5.y(iE2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbY.append(gyhVar2.e);
                                            throw ParserException.a(null, sbY.toString());
                                        }
                                        if (iA == 0) {
                                            boolean[] zArr = gyhVar2.l;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iE2; i31++) {
                                                int iA2 = nmcVar5.A();
                                                i6 += iA2;
                                                zArr[i31] = iA2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z4 = iA > i30;
                                            i6 = iA * iE2;
                                            z = false;
                                            Arrays.fill(gyhVar2.l, 0, iE2, z4);
                                        }
                                        Arrays.fill(gyhVar2.l, iE2, gyhVar2.e, z);
                                        if (i6 > 0) {
                                            gyhVar2.n.K(i6);
                                            gyhVar2.k = true;
                                            gyhVar2.o = true;
                                        }
                                    }
                                    n2b n2bVarH6 = m2bVar2.h(1935763823);
                                    if (n2bVarH6 != null) {
                                        nmc nmcVar6 = n2bVarH6.c;
                                        nmcVar6.N(8);
                                        int iM3 = nmcVar6.m();
                                        byte[] bArr4 = r21.a;
                                        if ((iM3 & 1) == 1) {
                                            nmcVar6.O(8);
                                        }
                                        int iE3 = nmcVar6.E();
                                        if (iE3 != 1) {
                                            throw ParserException.a(null, "Unexpected saio entry count: " + iE3);
                                        }
                                        gyhVar2.c += r21.e(iM3) == 0 ? nmcVar6.C() : nmcVar6.G();
                                    }
                                    n2b n2bVarH7 = m2bVar2.h(1936027235);
                                    if (n2bVarH7 != null) {
                                        d(n2bVarH7.c, 0, gyhVar2);
                                    }
                                    String str2 = fyhVar != null ? fyhVar.b : null;
                                    nmc nmcVar7 = null;
                                    nmc nmcVar8 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        n2b n2bVar3 = (n2b) arrayList10.get(i32);
                                        nmc nmcVar9 = n2bVar3.c;
                                        int i33 = n2bVar3.b;
                                        if (i33 == 1935828848) {
                                            nmcVar9.N(12);
                                            if (nmcVar9.m() == 1936025959) {
                                                nmcVar7 = nmcVar9;
                                            }
                                        } else if (i33 == 1936158820) {
                                            nmcVar9.N(12);
                                            if (nmcVar9.m() == 1936025959) {
                                                nmcVar8 = nmcVar9;
                                            }
                                        }
                                    }
                                    if (nmcVar7 != null && nmcVar8 != null) {
                                        nmcVar7.N(8);
                                        int iE4 = r21.e(nmcVar7.m());
                                        nmcVar7.O(4);
                                        if (iE4 == 1) {
                                            nmcVar7.O(4);
                                        }
                                        if (nmcVar7.m() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        nmcVar8.N(8);
                                        int iE5 = r21.e(nmcVar8.m());
                                        nmcVar8.O(4);
                                        if (iE5 == 1) {
                                            if (nmcVar8.C() == 0) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE5 >= 2) {
                                            nmcVar8.O(4);
                                        }
                                        if (nmcVar8.C() != 1) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        nmcVar8.O(1);
                                        int iA3 = nmcVar8.A();
                                        int i34 = (iA3 & 240) >> 4;
                                        int i35 = iA3 & 15;
                                        boolean z5 = nmcVar8.A() == 1;
                                        if (z5) {
                                            int iA4 = nmcVar8.A();
                                            byte[] bArr5 = new byte[16];
                                            nmcVar8.k(0, bArr5, 16);
                                            if (iA4 == 0) {
                                                int iA5 = nmcVar8.A();
                                                byte[] bArr6 = new byte[iA5];
                                                nmcVar8.k(0, bArr6, iA5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            gyhVar2.k = true;
                                            gyhVar2.m = new fyh(z5, str2, iA4, bArr5, i34, i35, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i36 = 0; i36 < size5; i36++) {
                                        n2b n2bVar4 = (n2b) arrayList10.get(i36);
                                        if (n2bVar4.b == 1970628964) {
                                            nmc nmcVar10 = n2bVar4.c;
                                            nmcVar10.N(8);
                                            byte[] bArr7 = this.h;
                                            nmcVar10.k(0, bArr7, 16);
                                            if (Arrays.equals(bArr7, n1)) {
                                                d(nmcVar10, 16, gyhVar2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                n2b n2bVar5 = (n2b) arrayList10.get(i27);
                                if (n2bVar5.b == i5) {
                                    int i37 = i28 + 1;
                                    nmc nmcVar11 = n2bVar5.c;
                                    nmcVar11.N(8);
                                    int iM4 = nmcVar11.m();
                                    byte[] bArr8 = r21.a;
                                    cyh cyhVar4 = rb7Var2.d.a;
                                    gd5 gd5Var5 = gyhVar2.a;
                                    String str3 = vqi.a;
                                    gyhVar2.g[i28] = nmcVar11.E();
                                    long[] jArr = gyhVar2.f;
                                    i7 = i9;
                                    long j6 = gyhVar2.b;
                                    jArr[i28] = j6;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i28] = j6 + ((long) nmcVar11.m());
                                    }
                                    boolean z6 = (iM4 & 4) != 0;
                                    int iM5 = gd5Var5.d;
                                    if (z6) {
                                        iM5 = nmcVar11.m();
                                    }
                                    boolean z7 = (iM4 & np0.n) != 0;
                                    boolean z8 = z6;
                                    boolean z9 = (iM4 & np0.o) != 0;
                                    boolean z10 = (iM4 & 1024) != 0;
                                    boolean z11 = (iM4 & np0.q) != 0;
                                    boolean z12 = z10;
                                    long[] jArr2 = cyhVar4.i;
                                    int i38 = iM5;
                                    long[] jArr3 = cyhVar4.j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z2 = z7;
                                    } else {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            long j8 = cyhVar4.d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (vqi.i0(j7, 1000000L, j8, roundingMode) + vqi.i0(jArr3[0], 1000000L, cyhVar4.c, roundingMode) >= cyhVar4.e) {
                                            }
                                        }
                                        j5 = jArr3[0];
                                    }
                                    int[] iArr = gyhVar2.h;
                                    long[] jArr4 = gyhVar2.i;
                                    boolean z13 = z2;
                                    boolean[] zArr2 = gyhVar2.j;
                                    boolean z14 = cyhVar4.b == 2 && (i7 & 1) != 0;
                                    int i39 = gyhVar2.g[i28] + i29;
                                    int i40 = i29;
                                    long j9 = cyhVar4.c;
                                    boolean z15 = z11;
                                    long j10 = gyhVar2.p;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iM6 = z13 ? nmcVar11.m() : gd5Var5.b;
                                        boolean z16 = z15;
                                        if (iM6 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z9 ? nmcVar11.m() : gd5Var5.c;
                                        if (iM7 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z12 ? nmcVar11.m() : (i41 == 0 && z8) ? i38 : gd5Var5.d;
                                        int i42 = i39;
                                        long[] jArr5 = jArr4;
                                        long jI0 = vqi.i0((((long) (z16 ? nmcVar11.m() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr5[i41] = jI0;
                                        if (!gyhVar2.q) {
                                            jArr5[i41] = jI0 + rb7Var2.d.i;
                                        }
                                        iArr[i41] = iM7;
                                        zArr2[i41] = ((iM8 >> 16) & 1) == 0 && (!z14 || i41 == 0);
                                        j10 += (long) iM6;
                                        i41++;
                                        z15 = z16;
                                        z14 = z14;
                                        jArr4 = jArr5;
                                        i39 = i42;
                                    }
                                    gyhVar2.p = j10;
                                    i28 = i37;
                                    i29 = i39;
                                } else {
                                    i7 = i9;
                                }
                                i27++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i9 = i7;
                                size4 = size4;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i21;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i9;
                        }
                    } else {
                        size3 = size3;
                        i3 = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i9;
                    }
                    i21 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i9 = i4;
                }
                wu5 wu5VarC2 = c(arrayList5);
                if (wu5VarC2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        rb7 rb7Var3 = (rb7) sparseArray.valueAt(i43);
                        cyh cyhVar5 = rb7Var3.d.a;
                        gd5 gd5Var6 = rb7Var3.b.a;
                        String str4 = vqi.a;
                        fyh fyhVar2 = cyhVar5.l[gd5Var6.a];
                        wu5 wu5VarA = wu5VarC2.a(fyhVar2 != null ? fyhVar2.b : null);
                        a87 a87VarA2 = rb7Var3.j.a();
                        a87VarA2.q = wu5VarA;
                        rb7Var3.a.g(new b87(a87VarA2));
                    }
                }
                if (this.z != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        rb7 rb7Var4 = (rb7) sparseArray.valueAt(i44);
                        long j11 = this.z;
                        int i45 = rb7Var4.f;
                        while (true) {
                            gyh gyhVar3 = rb7Var4.b;
                            if (i45 >= gyhVar3.e || gyhVar3.i[i45] > j11) {
                                break;
                            }
                            if (gyhVar3.j[i45]) {
                                rb7Var4.i = i45;
                            }
                            i45++;
                        }
                    }
                    this.z = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((m2b) arrayDeque.peek()).e.add(m2bVar);
            }
        }
        a();
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((rb7) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        a();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:131:0x0278  */
    /* JADX WARN: Code duplicated, block: B:522:0x0285 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        ake akeVar;
        nmc nmcVar;
        ArrayDeque arrayDeque;
        int i;
        dth dthVar;
        rb7 rb7Var;
        boolean z;
        int i2;
        rb7 rb7Var2;
        String str;
        int i3;
        int iC;
        int i4;
        boolean z2;
        int i5;
        int i6;
        String strV;
        String strV2;
        long j;
        long jA;
        long jI0;
        long jC;
        while (true) {
            int i7 = this.s;
            ArrayDeque arrayDeque2 = this.m;
            akeVar = this.o;
            nmcVar = this.i;
            ex8 ex8Var = this.q;
            SparseArray sparseArray = this.d;
            boolean z3 = true;
            if (i7 != 0) {
                arrayDeque = this.n;
                i = this.b;
                dthVar = this.j;
                if (i7 != 1) {
                    long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                    if (i7 != 2) {
                        rb7Var = this.C;
                        if (rb7Var != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i8 = 0;
                        rb7 rb7Var3 = null;
                        while (i8 < size) {
                            rb7 rb7Var4 = (rb7) sparseArray.valueAt(i8);
                            boolean z4 = z3;
                            boolean z5 = rb7Var4.m;
                            gyh gyhVar = rb7Var4.b;
                            if (z5) {
                                i6 = size;
                            } else {
                                i6 = size;
                                if (rb7Var4.f != rb7Var4.d.b) {
                                }
                                i8++;
                                z3 = z4;
                                size = i6;
                            }
                            if (!z5 || rb7Var4.h != gyhVar.d) {
                                long j3 = !z5 ? rb7Var4.d.c[rb7Var4.f] : gyhVar.f[rb7Var4.h];
                                if (j3 < j2) {
                                    rb7Var3 = rb7Var4;
                                    j2 = j3;
                                }
                            }
                            i8++;
                            z3 = z4;
                            size = i6;
                        }
                        z = z3;
                        i2 = 8;
                        if (rb7Var3 != null) {
                            int position = (int) ((!rb7Var3.m ? rb7Var3.d.c[rb7Var3.f] : rb7Var3.b.f[rb7Var3.h]) - kj6Var.getPosition());
                            if (position < 0) {
                                lvb.G0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            kj6Var.E(position);
                            this.C = rb7Var3;
                            rb7Var = rb7Var3;
                            break;
                        }
                        int position2 = (int) (this.x - kj6Var.getPosition());
                        if (position2 < 0) {
                            throw ParserException.a(null, "Offset to end of mdat was negative.");
                        }
                        kj6Var.E(position2);
                        a();
                    } else {
                        int size2 = sparseArray.size();
                        rb7 rb7Var5 = null;
                        for (int i9 = 0; i9 < size2; i9++) {
                            gyh gyhVar2 = ((rb7) sparseArray.valueAt(i9)).b;
                            if (gyhVar2.o) {
                                long j4 = gyhVar2.c;
                                if (j4 < j2) {
                                    rb7Var5 = (rb7) sparseArray.valueAt(i9);
                                    j2 = j4;
                                }
                            }
                        }
                        if (rb7Var5 == null) {
                            this.s = 3;
                        } else {
                            int position3 = (int) (j2 - kj6Var.getPosition());
                            if (position3 < 0) {
                                throw ParserException.a(null, "Offset to encryption data was negative.");
                            }
                            kj6Var.E(position3);
                            gyh gyhVar3 = rb7Var5.b;
                            nmc nmcVar2 = gyhVar3.n;
                            kj6Var.readFully(nmcVar2.a, 0, nmcVar2.c);
                            nmcVar2.N(0);
                            gyhVar3.o = false;
                        }
                    }
                } else {
                    int i10 = (int) (this.u - ((long) this.v));
                    nmc nmcVar3 = this.w;
                    if (nmcVar3 != null) {
                        kj6Var.readFully(nmcVar3.a, 8, i10);
                        int i11 = this.t;
                        n2b n2bVar = new n2b(i11, nmcVar3);
                        if (!arrayDeque2.isEmpty()) {
                            ((m2b) arrayDeque2.peek()).d.add(n2bVar);
                        } else if (i11 == 1936286840) {
                            Pair pairE = e(kj6Var.getPosition(), nmcVar3);
                            ex8Var.q((vq3) pairE.second);
                            if (!this.X) {
                                this.B = ((Long) pairE.first).longValue();
                                this.I.r((xbf) pairE.second);
                                this.X = true;
                            } else if ((i & np0.n) != 0 && !this.Y && ((LinkedHashMap) ex8Var.b).size() > 1) {
                                this.Z = kj6Var.getPosition();
                            }
                        } else if (i11 == 1701671783 && this.J.length != 0) {
                            nmcVar3.N(8);
                            int iE = r21.e(nmcVar3.m());
                            long j5 = -9223372036854775807L;
                            if (iE == 0) {
                                strV = nmcVar3.v();
                                strV.getClass();
                                strV2 = nmcVar3.v();
                                strV2.getClass();
                                long jC2 = nmcVar3.C();
                                long jC3 = nmcVar3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jI1 = vqi.i0(jC3, 1000000L, jC2, roundingMode);
                                long j6 = this.B;
                                long j7 = j6 != -9223372036854775807L ? j6 + jI1 : -9223372036854775807L;
                                j = jI1;
                                jA = j7;
                                jI0 = vqi.i0(nmcVar3.C(), 1000L, jC2, roundingMode);
                                jC = nmcVar3.C();
                            } else if (iE != 1) {
                                qt4.y(iE, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jC4 = nmcVar3.C();
                                long jG = nmcVar3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = vqi.i0(jG, 1000000L, jC4, roundingMode2);
                                long jI2 = vqi.i0(nmcVar3.C(), 1000L, jC4, roundingMode2);
                                long jC5 = nmcVar3.C();
                                strV = nmcVar3.v();
                                strV.getClass();
                                strV2 = nmcVar3.v();
                                strV2.getClass();
                                jI0 = jI2;
                                jC = jC5;
                                j = -9223372036854775807L;
                            }
                            String str2 = strV;
                            String str3 = strV2;
                            byte[] bArr = new byte[nmcVar3.a()];
                            nmcVar3.k(0, bArr, nmcVar3.a());
                            nmc nmcVar4 = new nmc(this.k.h(new tc6(str2, str3, jI0, jC, bArr)));
                            int iA = nmcVar4.a();
                            kyh[] kyhVarArr = this.J;
                            int length = kyhVarArr.length;
                            int i12 = 0;
                            while (i12 < length) {
                                kyh kyhVar = kyhVarArr[i12];
                                nmcVar4.N(0);
                                kyhVar.f(iA, nmcVar4);
                                i12++;
                                j5 = j5;
                            }
                            if (jA == j5) {
                                arrayDeque.addLast(new qb7(iA, j, true));
                                this.y += iA;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new qb7(iA, jA, false));
                                this.y += iA;
                            } else if (dthVar == null || dthVar.e()) {
                                if (dthVar != null) {
                                    jA = dthVar.a(jA);
                                }
                                long j8 = jA;
                                for (kyh kyhVar2 : this.J) {
                                    kyhVar2.a(j8, 1, iA, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new qb7(iA, jA, false));
                                this.y += iA;
                            }
                        }
                    } else {
                        kj6Var.E(i10);
                    }
                    f(kj6Var.getPosition());
                }
            } else {
                int i13 = this.v;
                long length2 = 0;
                nmc nmcVar5 = this.l;
                if (i13 == 0) {
                    if (!kj6Var.t(nmcVar5.a, 0, 8, true)) {
                        long j9 = this.Z;
                        if (j9 == -1) {
                            akeVar.c(0);
                            return -1;
                        }
                        s8Var.a = j9;
                        this.Z = -1L;
                        lj6 lj6Var = this.I;
                        ex8Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (vq3 vq3Var : ((LinkedHashMap) ex8Var.b).values()) {
                            arrayList.add(vq3Var.b);
                            arrayList2.add(vq3Var.c);
                            arrayList3.add(vq3Var.d);
                            arrayList4.add(vq3Var.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length2 += (long) iArr2.length;
                        }
                        int i14 = (int) length2;
                        lvb.N(length2, "the total number of elements (%s) in the arrays must fit in an int", length2 == ((long) i14));
                        int[] iArr3 = new int[i14];
                        int length3 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length3, iArr4.length);
                            length3 += iArr4.length;
                        }
                        lj6Var.r(new vq3(iArr3, gpk.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), gpk.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), gpk.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.Y = true;
                        return 1;
                    }
                    this.v = 8;
                    nmcVar5.N(0);
                    this.u = nmcVar5.C();
                    this.t = nmcVar5.m();
                }
                long j10 = this.u;
                if (j10 == 1) {
                    kj6Var.readFully(nmcVar5.a, 8, 8);
                    this.v += 8;
                    this.u = nmcVar5.G();
                } else if (j10 == 0) {
                    long length4 = kj6Var.getLength();
                    if (length4 == -1 && !arrayDeque2.isEmpty()) {
                        length4 = ((m2b) arrayDeque2.peek()).c;
                    }
                    if (length4 != -1) {
                        this.u = (length4 - kj6Var.getPosition()) + ((long) this.v);
                    }
                }
                long j11 = this.u;
                int i15 = this.v;
                long j12 = i15;
                if (j11 < j12) {
                    if (this.t != 1718773093 || i15 != 8) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    this.u = j12;
                }
                if (this.Z != -1) {
                    int i16 = this.t;
                    long j13 = this.u;
                    if (i16 == 1936286840) {
                        nmcVar.K((int) j13);
                        System.arraycopy(nmcVar5.a, 0, nmcVar.a, 0, 8);
                        kj6Var.readFully(nmcVar.a, 8, (int) (this.u - ((long) this.v)));
                        ex8Var.q((vq3) e(kj6Var.y(), nmcVar).second);
                    } else {
                        kj6Var.k((int) (j13 - j12), true);
                    }
                    a();
                } else {
                    long position4 = kj6Var.getPosition() - ((long) this.v);
                    int i17 = this.t;
                    if ((i17 == 1836019558 || i17 == 1835295092) && !this.X) {
                        this.I.r(new vk0(this.A, position4));
                        this.X = true;
                    }
                    if (this.t == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            gyh gyhVar4 = ((rb7) sparseArray.valueAt(i18)).b;
                            gyhVar4.getClass();
                            gyhVar4.c = position4;
                            gyhVar4.b = position4;
                        }
                    }
                    int i19 = this.t;
                    if (i19 == 1835295092) {
                        this.C = null;
                        this.x = position4 + this.u;
                        this.s = 2;
                    } else if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1836019558 || i19 == 1953653094 || i19 == 1836475768 || i19 == 1701082227 || i19 == 1835365473) {
                        long position5 = kj6Var.getPosition();
                        long j14 = this.u;
                        long j15 = (position5 + j14) - 8;
                        if (j14 != this.v && this.t == 1835365473) {
                            nmcVar.K(8);
                            kj6Var.u(0, nmcVar.a, 8);
                            r21.a(nmcVar);
                            kj6Var.E(nmcVar.b);
                            kj6Var.q();
                        }
                        arrayDeque2.push(new m2b(this.t, j15));
                        if (this.u == this.v) {
                            f(j15);
                        } else {
                            a();
                        }
                    } else if (i19 == 1751411826 || i19 == 1835296868 || i19 == 1836476516 || i19 == 1936286840 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1668576371 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1937011571 || i19 == 1952867444 || i19 == 1952868452 || i19 == 1953196132 || i19 == 1953654136 || i19 == 1953658222 || i19 == 1886614376 || i19 == 1935763834 || i19 == 1935763823 || i19 == 1936027235 || i19 == 1970628964 || i19 == 1935828848 || i19 == 1936158820 || i19 == 1701606260 || i19 == 1835362404 || i19 == 1701671783 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        if (this.v != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.u > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        nmc nmcVar6 = new nmc((int) this.u);
                        System.arraycopy(nmcVar5.a, 0, nmcVar6.a, 0, 8);
                        this.w = nmcVar6;
                        this.s = 1;
                    } else {
                        if (this.u > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.w = null;
                        this.s = 1;
                    }
                }
            }
        }
        gyh gyhVar5 = rb7Var.b;
        String str4 = "video/avc";
        if (this.s == 3) {
            this.D = !rb7Var.m ? rb7Var.d.d[rb7Var.f] : gyhVar5.h[rb7Var.f];
            b87 b87Var = rb7Var.d.a.g;
            this.G = !((!Objects.equals(b87Var.n, "video/avc") ? !(!Objects.equals(b87Var.n, "video/hevc") || (i & np0.m) == 0) : (i & 64) != 0) ? false : z);
            if (rb7Var.f < rb7Var.i) {
                kj6Var.E(this.D);
                fyh fyhVarB = rb7Var.b();
                if (fyhVarB != null) {
                    nmc nmcVar7 = gyhVar5.n;
                    int i20 = fyhVarB.d;
                    if (i20 != 0) {
                        nmcVar7.O(i20);
                    }
                    int i21 = rb7Var.f;
                    if (gyhVar5.k && gyhVar5.l[i21]) {
                        nmcVar7.O(nmcVar7.H() * 6);
                    }
                }
                if (!rb7Var.c()) {
                    this.C = null;
                }
                this.s = 3;
                return 0;
            }
            if (rb7Var.d.a.h == z) {
                this.D -= 8;
                kj6Var.E(i2);
            }
            boolean zEquals = "audio/ac4".equals(rb7Var.d.a.g.n);
            int i22 = this.D;
            if (zEquals) {
                this.E = rb7Var.d(i22, 7);
                h21.b(this.D, nmcVar);
                rb7Var.a.f(7, nmcVar);
                this.E += 7;
                i5 = 0;
            } else {
                i5 = 0;
                this.E = rb7Var.d(i22, 0);
            }
            this.D += this.E;
            this.s = 4;
            this.F = i5;
        }
        lyh lyhVar = rb7Var.d;
        cyh cyhVar = lyhVar.a;
        kyh kyhVar3 = rb7Var.a;
        long jA2 = rb7Var.m ? gyhVar5.i[rb7Var.f] : lyhVar.f[rb7Var.f];
        if (dthVar != null) {
            jA2 = dthVar.a(jA2);
        }
        int i23 = cyhVar.k;
        b87 b87Var2 = cyhVar.g;
        if (i23 == 0) {
            rb7Var2 = rb7Var;
            while (true) {
                int i24 = this.E;
                int i25 = this.D;
                if (i24 >= i25) {
                    break;
                }
                this.E += kyhVar3.c(kj6Var, i25 - i24, false);
            }
        } else {
            nmc nmcVar8 = this.f;
            byte[] bArr2 = nmcVar8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i26 = 4 - i23;
            rb7Var2 = rb7Var;
            while (true) {
                int i27 = i23;
                if (this.E >= this.D) {
                    break;
                }
                int i28 = this.F;
                if (i28 == 0) {
                    if (this.K.length > 0 || !this.G) {
                        int iH = xsg.h(b87Var2);
                        if (i27 + iH <= this.D - this.E) {
                            i4 = iH;
                        } else {
                            i4 = 0;
                        }
                    } else {
                        i4 = 0;
                    }
                    kj6Var.readFully(bArr2, i26, i27 + i4);
                    nmcVar8.N(0);
                    int iM = nmcVar8.m();
                    if (iM < 0) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.F = iM - i4;
                    nmc nmcVar9 = this.e;
                    i3 = i26;
                    nmcVar9.N(0);
                    kyhVar3.f(4, nmcVar9);
                    this.E += 4;
                    this.D += i3;
                    if (this.K.length <= 0 || i4 <= 0) {
                        str = str4;
                    } else {
                        byte b = bArr2[4];
                        String strD = xsg.d(b87Var2);
                        if (Objects.equals(strD, str4)) {
                            str = str4;
                            if ((b & 31) != 6) {
                            }
                            z2 = true;
                            this.H = z2;
                            kyhVar3.f(i4, nmcVar8);
                            this.E += i4;
                            if (i4 <= 0 && !this.G && xsg.e(bArr2, i4, b87Var2)) {
                                this.G = true;
                            }
                        } else {
                            str = str4;
                        }
                        if (Objects.equals(strD, "video/hevc") && ((b & 126) >> 1) == 39) {
                            z2 = true;
                        }
                        this.H = z2;
                        kyhVar3.f(i4, nmcVar8);
                        this.E += i4;
                        if (i4 <= 0) {
                        }
                    }
                    z2 = false;
                    this.H = z2;
                    kyhVar3.f(i4, nmcVar8);
                    this.E += i4;
                    if (i4 <= 0) {
                    }
                } else {
                    str = str4;
                    i3 = i26;
                    if (this.H) {
                        nmc nmcVar10 = this.g;
                        nmcVar10.K(i28);
                        kj6Var.readFully(nmcVar10.a, 0, this.F);
                        kyhVar3.f(this.F, nmcVar10);
                        int i29 = this.F;
                        int iP = xsg.p(nmcVar10.c, nmcVar10.a);
                        nmcVar10.N(0);
                        nmcVar10.M(iP);
                        int i30 = b87Var2.p;
                        if (i30 == -1) {
                            if (akeVar.a != 0) {
                                akeVar.d(0);
                            }
                        } else if (akeVar.a != i30) {
                            akeVar.d(i30);
                        }
                        akeVar.a(jA2, nmcVar10);
                        if ((rb7Var2.a() & 4) != 0) {
                            akeVar.c(0);
                        }
                        iC = i29;
                    } else {
                        iC = kyhVar3.c(kj6Var, i28, false);
                    }
                    this.E += iC;
                    this.F -= iC;
                }
                i23 = i27;
                i26 = i3;
                str4 = str;
            }
        }
        int iA2 = rb7Var2.a();
        if (!this.G) {
            iA2 |= 67108864;
        }
        int i31 = iA2;
        fyh fyhVarB2 = rb7Var2.b();
        long j16 = jA2;
        kyhVar3.a(j16, i31, this.D, 0, fyhVarB2 != null ? fyhVarB2.c : null);
        while (!arrayDeque.isEmpty()) {
            qb7 qb7Var = (qb7) arrayDeque.removeFirst();
            this.y -= qb7Var.c;
            long jA3 = qb7Var.a;
            if (qb7Var.b) {
                jA3 += j16;
            }
            if (dthVar != null) {
                jA3 = dthVar.a(jA3);
            }
            long j17 = jA3;
            for (kyh kyhVar4 : this.J) {
                kyhVar4.a(j17, 1, qb7Var.c, this.y, null);
            }
        }
        if (!rb7Var2.c()) {
            this.C = null;
        }
        this.s = 3;
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }

    @Override // defpackage.jj6
    public final List y() {
        return this.r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sb7(b8h b8hVar, int i) {
        this(b8hVar, i, null, ghe.e, null);
        a98 a98Var = c98.b;
    }
}
