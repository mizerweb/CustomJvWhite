package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0m {
    public static boolean a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static wvj e(hg4 hg4Var, int i, ArrayList arrayList, wvj wvjVar) {
        int i2;
        int i3 = i == 0 ? hg4Var.m0 : hg4Var.n0;
        if (i3 != -1 && (wvjVar == null || i3 != wvjVar.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                wvj wvjVar2 = (wvj) arrayList.get(i4);
                if (wvjVar2.b == i3) {
                    if (wvjVar != null) {
                        wvjVar.d(i, wvjVar2);
                        arrayList.remove(wvjVar);
                    }
                    wvjVar = wvjVar2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return wvjVar;
        }
        if (wvjVar == null) {
            if (hg4Var instanceof tp0) {
                tp0 tp0Var = (tp0) hg4Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= tp0Var.q0) {
                        i2 = -1;
                        break;
                    }
                    hg4 hg4Var2 = tp0Var.p0[i5];
                    if ((i == 0 && (i2 = hg4Var2.m0) != -1) || (i == 1 && (i2 = hg4Var2.n0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        wvj wvjVar3 = (wvj) arrayList.get(i6);
                        if (wvjVar3.b == i2) {
                            wvjVar = wvjVar3;
                            break;
                        }
                    }
                }
            }
            if (wvjVar == null) {
                wvjVar = new wvj();
                wvjVar.a = new ArrayList();
                wvjVar.d = null;
                wvjVar.e = -1;
                int i7 = wvj.f;
                wvj.f = i7 + 1;
                wvjVar.b = i7;
                wvjVar.c = i;
            }
            arrayList.add(wvjVar);
        }
        if (wvjVar.a(hg4Var)) {
            if (hg4Var instanceof or7) {
                or7 or7Var = (or7) hg4Var;
                or7Var.s0.b(or7Var.t0 == 0 ? 1 : 0, wvjVar, arrayList);
            }
            int i8 = wvjVar.b;
            if (i == 0) {
                hg4Var.m0 = i8;
                hg4Var.H.b(i, wvjVar, arrayList);
                hg4Var.J.b(i, wvjVar, arrayList);
            } else {
                hg4Var.n0 = i8;
                hg4Var.I.b(i, wvjVar, arrayList);
                hg4Var.L.b(i, wvjVar, arrayList);
                hg4Var.K.b(i, wvjVar, arrayList);
            }
            hg4Var.O.b(i, wvjVar, arrayList);
        }
        return wvjVar;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x033b  */
    /* JADX WARN: Code duplicated, block: B:204:0x036a  */
    public static boolean f(ig4 ig4Var, vf4 vf4Var) {
        wvj wvjVar;
        wvj wvjVar2;
        int iC;
        wvj wvjVar3;
        wvj wvjVar4;
        boolean z;
        ArrayList arrayList = ig4Var.p0;
        b29 b29Var = ig4Var.v0;
        int[] iArr = ig4Var.o0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= size) {
                int i4 = 0;
                ArrayList arrayList2 = null;
                ArrayList<tp0> arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList<tp0> arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (i4 < size) {
                    hg4 hg4Var = (hg4) arrayList.get(i4);
                    int i5 = i;
                    int i6 = iArr[i5];
                    int i7 = iArr[i3];
                    int i8 = i3;
                    int[] iArr2 = hg4Var.o0;
                    int[] iArr3 = iArr;
                    if (!g(i6, i7, iArr2[i5], iArr2[i8])) {
                        ig4.R(hg4Var, vf4Var, ig4Var.K0);
                    }
                    boolean z2 = hg4Var instanceof or7;
                    if (z2) {
                        or7 or7Var = (or7) hg4Var;
                        if (or7Var.t0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(or7Var);
                        }
                        z = z2;
                        if (or7Var.t0 == i8) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(or7Var);
                        }
                    } else {
                        z = z2;
                    }
                    if (hg4Var instanceof tp0) {
                        if (hg4Var instanceof tp0) {
                            tp0 tp0Var = (tp0) hg4Var;
                            if (tp0Var.P() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(tp0Var);
                            }
                            if (tp0Var.P() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(tp0Var);
                            }
                        } else {
                            tp0 tp0Var2 = (tp0) hg4Var;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(tp0Var2);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(tp0Var2);
                        }
                    }
                    if (hg4Var.H.f == null && hg4Var.J.f == null && !z && !(hg4Var instanceof tp0)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(hg4Var);
                    }
                    if (hg4Var.I.f == null && hg4Var.K.f == null && hg4Var.L.f == null && !z && !(hg4Var instanceof tp0)) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(hg4Var);
                    }
                    i4++;
                    i = i5;
                    iArr = iArr3;
                    i3 = 1;
                }
                int[] iArr4 = iArr;
                int i9 = i;
                ArrayList<wvj> arrayList8 = new ArrayList();
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        e((or7) it.next(), i9, arrayList8, null);
                    }
                }
                int i10 = i9;
                wvj wvjVar5 = null;
                if (arrayList3 != null) {
                    for (tp0 tp0Var3 : arrayList3) {
                        wvj wvjVarE = e(tp0Var3, i10, arrayList8, wvjVar5);
                        tp0Var3.N(i10, wvjVarE, arrayList8);
                        wvjVarE.b(arrayList8);
                        wvjVar5 = null;
                        i10 = 0;
                    }
                }
                HashSet hashSet = ig4Var.g(2).a;
                if (hashSet != null) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        e(((of4) it2.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet2 = ig4Var.g(4).a;
                if (hashSet2 != null) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        e(((of4) it3.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet3 = ig4Var.g(7).a;
                if (hashSet3 != null) {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        e(((of4) it4.next()).d, 0, arrayList8, null);
                    }
                }
                wvj wvjVar6 = null;
                if (arrayList6 != null) {
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        e((hg4) it5.next(), 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        e((or7) it6.next(), 1, arrayList8, null);
                    }
                }
                int i11 = 1;
                if (arrayList5 != null) {
                    for (tp0 tp0Var4 : arrayList5) {
                        wvj wvjVarE2 = e(tp0Var4, i11, arrayList8, wvjVar6);
                        tp0Var4.N(i11, wvjVarE2, arrayList8);
                        wvjVarE2.b(arrayList8);
                        wvjVar6 = null;
                        i11 = 1;
                    }
                }
                HashSet hashSet4 = ig4Var.g(3).a;
                if (hashSet4 != null) {
                    Iterator it7 = hashSet4.iterator();
                    while (it7.hasNext()) {
                        e(((of4) it7.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet5 = ig4Var.g(6).a;
                if (hashSet5 != null) {
                    Iterator it8 = hashSet5.iterator();
                    while (it8.hasNext()) {
                        e(((of4) it8.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet6 = ig4Var.g(5).a;
                if (hashSet6 != null) {
                    Iterator it9 = hashSet6.iterator();
                    while (it9.hasNext()) {
                        e(((of4) it9.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet7 = ig4Var.g(7).a;
                if (hashSet7 != null) {
                    Iterator it10 = hashSet7.iterator();
                    while (it10.hasNext()) {
                        e(((of4) it10.next()).d, 1, arrayList8, null);
                    }
                }
                char c = 1;
                if (arrayList7 != null) {
                    Iterator it11 = arrayList7.iterator();
                    while (it11.hasNext()) {
                        e((hg4) it11.next(), 1, arrayList8, null);
                    }
                }
                int i12 = 0;
                while (i12 < size) {
                    hg4 hg4Var2 = (hg4) arrayList.get(i12);
                    int[] iArr5 = hg4Var2.o0;
                    if (iArr5[0] == 3 && iArr5[c] == 3) {
                        int i13 = hg4Var2.m0;
                        int size2 = arrayList8.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                wvjVar3 = null;
                                break;
                            }
                            wvjVar3 = (wvj) arrayList8.get(i14);
                            if (i13 == wvjVar3.b) {
                                break;
                            }
                            i14++;
                        }
                        int i15 = hg4Var2.n0;
                        int size3 = arrayList8.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size3) {
                                wvjVar4 = null;
                                break;
                            }
                            wvjVar4 = (wvj) arrayList8.get(i16);
                            if (i15 == wvjVar4.b) {
                                break;
                            }
                            i16++;
                        }
                        if (wvjVar3 != null && wvjVar4 != null) {
                            wvjVar3.d(0, wvjVar4);
                            wvjVar4.c = 2;
                            arrayList8.remove(wvjVar3);
                        }
                    }
                    i12++;
                    c = 1;
                }
                if (arrayList8.size() > 1) {
                    int i17 = 0;
                    if (iArr4[0] == 2) {
                        int i18 = 0;
                        wvjVar = null;
                        for (wvj wvjVar7 : arrayList8) {
                            if (wvjVar7.c != 1) {
                                int iC2 = wvjVar7.c(b29Var, i17);
                                if (iC2 > i18) {
                                    wvjVar = wvjVar7;
                                    i18 = iC2;
                                }
                                i17 = 0;
                            }
                        }
                        if (wvjVar != null) {
                            ig4Var.I(1);
                            ig4Var.K(i18);
                        } else {
                            wvjVar = null;
                        }
                    } else {
                        wvjVar = null;
                    }
                    if (iArr4[1] == 2) {
                        wvj wvjVar8 = null;
                        int i19 = 0;
                        for (wvj wvjVar9 : arrayList8) {
                            if (wvjVar9.c != 0 && (iC = wvjVar9.c(b29Var, 1)) > i19) {
                                wvjVar8 = wvjVar9;
                                i19 = iC;
                            }
                        }
                        if (wvjVar8 != null) {
                            ig4Var.J(1);
                            ig4Var.H(i19);
                            wvjVar2 = wvjVar8;
                        } else {
                            wvjVar2 = null;
                        }
                    } else {
                        wvjVar2 = null;
                    }
                    if (wvjVar != null || wvjVar2 != null) {
                        return true;
                    }
                }
                return false;
            }
            hg4 hg4Var3 = (hg4) arrayList.get(i2);
            int i20 = iArr[0];
            int i21 = iArr[1];
            int[] iArr6 = hg4Var3.o0;
            if (!g(i20, i21, iArr6[0], iArr6[1])) {
                return false;
            }
            i2++;
        }
    }

    public static boolean g(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
